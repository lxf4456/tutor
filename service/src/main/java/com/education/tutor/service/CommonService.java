package com.education.tutor.service;

import com.education.tutor.api.BaseRes;
import com.education.tutor.api.common.RefreshReq;
import com.education.tutor.api.common.RefreshRes;
import com.education.tutor.api.login.SendVerifyCodeRes;
import com.education.tutor.db.FieldConstants;
import com.education.tutor.db.domain.*;
import com.education.tutor.db.mapper.*;
import com.education.tutor.vo.SmsSendResult;
import com.education.tutor.vo.UserPrincipalVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
@Transactional
public class CommonService {

    private final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    I18nService i18nService;

    @Autowired
    ISmsGateway smsGateway;

    @Autowired
    EmailService emailService;

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;


    @Autowired
    TblAttachmentMapper tblAttachmentMapper;


    @Autowired
    TblSmsLogMapper tblSmsLogMapper;

    @Autowired
    CommonMapper commonMapper;

    @Value("${attachment.download.prefix}")
    String attachmentDownloadPrefix;

    @Value("${sms.verifycode.duration.minutes}")
    String smsVerifyCodeDurationMinutes;

    @Value("${email.verifycode.duration.minutes}")
    String emailVerifyCodeDurationMinutes;

    @Value("${user-feedback.processor}")
    String userFeedBackProcessor;

    @Value("${test.user}")
    String testUserId;

    @Autowired
    StringRedisTemplate redisTemplate;

    public final static String SMSVERIFYCODE = "SMS:SMSVERIFYCODE_";

    public final static String EMAILVERIFYCODE = "EMAIL:EMAILVERIFYCODE_";

    public final static String USERINTERACTION = "UI:USERINTERACTION_";

    @PostConstruct
    public void init() {
        logger.info("test.user=" + testUserId);
    }




    /**
     * 保存附件
     *
     * @param name      附件名称
     * @param ext       附件扩展名
     * @param size      附件尺寸
     * @param mime      mime类型
     * @param storePath 存储地址URL
     * @param userName  用户
     * @return
     */
    public String saveAttachment(String name, String ext, int size, String mime, String storePath, String userName, int mate) {
        TblAttachment record = new TblAttachment();
        // default is enabled
        record.setState(FieldConstants.ATTACHMENT_STATE.ENABLED.ordinal());
        // default is public1
        record.setAttachmentType(FieldConstants.ATTACHMENT_TYPE.PUBLIC.ordinal());
        // record.setMetaInfo(""); // MetaInfo currently not supplied
        record.setMimeType(mime);
      //  record.setOriginalFilename(name);
        record.setSize(size);
        record.setUrlPath(storePath);
      //  record.setUriSite(attachmentDownloadPrefix);
        record.setUpdatedBy(userName);
        record.setMetaInfo(mate);
        int result = tblAttachmentMapper.insert(record);
        logger.debug("insert attachment record conut = " + result);
        logger.debug("attachment_id = " + record.getId());
        return record.getId() + ":" + record.getUrlPath();
    }

    /**
     * 调用第三方网关发送短信
     *
     * @param mobile
     * @param content
     * @return 成功返回0, 錯誤返回錯誤碼
     */
    public long sendSms(String lang, String countryCode, String mobile, ISmsGateway.SMSTEMPLATE templateId,
                        List<String> params) {
        SmsSendResult smsResult = smsGateway.sendWithParam(lang, countryCode, mobile, templateId, params, "", "", "");
        logger.info("send sms to " + mobile + " result is " + smsResult);
        // 保存短信发送记录到sms_log
        TblSmsLog record = new TblSmsLog();
        record.setSmsChannel(smsGateway.getChannelName());
        record.setCountryCode(countryCode);
        record.setMobile(mobile);
        record.setContent(templateId.name() + ":" + params.stream().collect(Collectors.joining(",", "[", "]")));
        record.setState(smsResult.getResult());
        record.setResultCode(smsResult.getResult());
        record.setFee(smsResult.getFee());
        int result = tblSmsLogMapper.insert(record);
        logger.debug("insert sms_log record conut = " + result);
        logger.debug("sms_log_Id = " + record.getId());
        long resultCode = smsResult.getResult();
        return resultCode;
    }

    /**
     * 发送短信验证码
     *
     * @param uuid
     * @param captchaInput
     * @param mobile
     * @param type
     * @return
     */
    public SendVerifyCodeRes sendSmsVerificationCode(String lang, String uuid, String captchaInput, String mobile,
                                                     String countryCode, Integer type) {
        SendVerifyCodeRes res = new SendVerifyCodeRes();
        if (doCheckForVerificationCode(type, countryCode + "-" + mobile, lang, res) > 0) {
            return res;
        }
        // 校验图片验证码
        String captchaGenerated = redisTemplate.opsForValue().get(LoginService.CAPTCHA_KEY_PREFIX + uuid);
        // username 在数据表中的存储规范为countryCode + "-" + mobile
        if (captchaGenerated != null && captchaInput.equalsIgnoreCase(captchaGenerated)) {
            sendSmsCommon(lang, mobile, countryCode, type, res);
        } else {
            // 图片验证码输入错误
            res.setCode(1108);
            res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
        }
        if (res.getCode() == -1) {
            res.setCode(0);
        }
        return res;
    }

    /**
     * 发送邮件验证码
     *
     * @param lang
     * @param email
     * @param type
     * @return
     */
    public SendVerifyCodeRes sendEmailVerificationCode(String lang, String email, Integer type) {
        SendVerifyCodeRes res = new SendVerifyCodeRes();
        String regex = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
        if (email == null || !Pattern.matches(regex, email)) {
            // 邮件格式输入错误
            res.setCode(1109);
            res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
            return res;
        }
        if (doCheckForVerificationCode(type, email, lang, res) > 0) {
            return res;
        }
        String redisKeyEmail = EMAILVERIFYCODE + email;
        // 生成验证码并存入
        String emailCode = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
        logger.debug("_________________________emailCode:" + emailCode);
        redisTemplate.opsForValue().set(redisKeyEmail, emailCode, Integer.parseInt(emailVerifyCodeDurationMinutes),
                TimeUnit.MINUTES);
        int code = type == 1 ? 101 : 102;


        String title = MessageFormat.format(i18nService.getTemplate("" + code, lang), emailCode);
        String result = emailService.sendEmail(new String[]{email}, null, null, title, lang, "register",
                new String[]{emailCode});
        if (!result.contains("failed")) {
            res.setCode(0);
        } else {
            res.setCode(4201);
            res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
        }
        if (res.getCode() == -1) {
            res.setCode(0);
        }
        return res;
    }

    /**
     * 发送短信验证码
     *
     * @param uuid
     * @param captchaInput
     * @param mobile
     * @param type
     * @return
     */
    public SendVerifyCodeRes sendSmsVerificationCode(String lang, String mobile, String countryCode, Integer type) {
        SendVerifyCodeRes res = new SendVerifyCodeRes();
        logger.info("this countryCode vla " + countryCode + " moblie: " + mobile + " type: " + type);
        if (doCheckForVerificationCode(type, countryCode + "-" + mobile, lang, res) > 0) {
            return res;
        }
        sendSmsCommon(lang, mobile, countryCode, type, res);
        return res;
    }

    public void sendSmsCommon(String lang, String mobile, String countryCode, Integer type, SendVerifyCodeRes res) {
        // username 在数据表中的存储规范为countryCode + "-" + mobile
        String redisKeySms = SMSVERIFYCODE + countryCode + "-" + mobile;
        // 生成短信验证码并存入
        String smsCode = redisTemplate.opsForValue().get(redisKeySms);
        if (smsCode == null || StringUtils.isEmpty(smsCode)) {
            smsCode = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
            redisTemplate.opsForValue().set(redisKeySms, smsCode, Integer.parseInt(smsVerifyCodeDurationMinutes),
                    TimeUnit.MINUTES);
        }


        ISmsGateway.SMSTEMPLATE templateId = ISmsGateway.SMSTEMPLATE.REGISTER;
        if (type == 2) {
            templateId = ISmsGateway.SMSTEMPLATE.RESETPASSWORD;
        }
        long smsResult = sendSms(lang, countryCode, mobile, templateId,
                Arrays.asList(smsCode, "" + smsVerifyCodeDurationMinutes));
        if (smsResult != 0) {
            // 短信发送错误
            if (smsResult == 1025) {
                // 发送太频繁
                res.setCode(1110);
                res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
            } else {
                res.setCode(1107);
                res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
            }
        } else {
            logger.debug("Successfully send sms verify code " + "(type=" + type + ") to " + mobile);
        }
    }

    public int doCheckForVerificationCode(Integer type, String username, String lang, BaseRes res) {
//        TblUserMainExample umExample = new TblUserMainExample();
//        umExample.createCriteria().andUsernameEqualTo(username);
//        List<TblUserMain> result = tblUserMainMapper.selectByExample(umExample);
        List result = new ArrayList();
        if (type == null) {
            res.setCode(101);
            res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
            return res.getCode();
        }
        if (type != 1 && type != 2) {
            res.setCode(101);
            res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
            return res.getCode();
        }
        if (type == 1 && !result.isEmpty()) {
            // 注册时调用，如果用户号已存在，报错
            res.setCode(4101);
            res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
            return res.getCode();
        }
        if (type == 2 && result.isEmpty()) {
            // 重置密码时调用，如果用户号不存在，报错
            res.setCode(4105);
            res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
            return res.getCode();
        }
        res.setCode(0);
        return res.getCode();
    }







    public RefreshRes refresh(UserPrincipalVO user, RefreshReq req) {
        RefreshRes res = new RefreshRes();
        if (req.getRoleId() != null) {
            List<String> userNameList = userMapper.getUsernameByGroupId(req.getRoleId());
            userNameList.forEach(un -> {
                userService.reloadRedis(un);
            });
        } else {
 //           TblUserMain um = tblUserMainMapper.selectByPrimaryKey(req.getUserId());
//            if (um != null) {
//                userService.reloadRedis(um.getUsername());
//            } else {
//                res.setCode(4108);
//                res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
//            }
        }
        res.setCode(0);
        return res;
    }





    //获得客户端真实IP地址
    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        return ip;
    }


}
