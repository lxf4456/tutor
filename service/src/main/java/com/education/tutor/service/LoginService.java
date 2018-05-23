package com.education.tutor.service;

import com.education.tutor.api.Area;
import com.education.tutor.api.PhoneCode;
import com.education.tutor.api.login.*;
import com.education.tutor.db.FieldConstants;
import com.education.tutor.db.domain.*;
import com.education.tutor.db.mapper.LoginMapper;
import com.education.tutor.db.mapper.TblRegionMapper;
import com.education.tutor.util.ImageUtil;
import com.education.tutor.vo.ImageVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

@Service
@Transactional
public class LoginService {

    private final Log logger = LogFactory.getLog(this.getClass());

    public static final String passport = "userfromboss";

    @Value("${captcha-duration.millisecond}")
    long captchDurationMillisecond = 1800000;

    @Autowired
    UserService userService;


    @Autowired
    CommonService commonService;

    @Autowired
    LoginMapper loginMapper;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    SMSService smsService;

    @Autowired
    I18nService i18nService;


    String captchaUrlPrefix = "http://localhost/";

    public final static String CAPTCHA_KEY_PREFIX = "CAPTCHA:CAPTCHA_";


    @Autowired
    TblRegionMapper tblDataRegionMapper;

    @PostConstruct
    public void init() {
    }


    public GlobalAreaListRes getGlobalAreaList(GlobalAreaListReq req) {
        GlobalAreaListRes res = new GlobalAreaListRes();
        TblRegionExample example = new TblRegionExample();
        TblRegionExample.Criteria c = example.createCriteria().andLevelEqualTo(req.getType());
        if (req.getId() != null) {
            c.andPidEqualTo(req.getId());
        }
        List<TblRegion> records = tblDataRegionMapper.selectByExample(example);
        //省份按字母排序
        records.sort((a1, a2) -> (a1.getNameEn().compareTo(a2.getNameEn())));
        for (TblRegion d : records) {
            Area e = new Area();
            e.setId(d.getId());
            if (req.getLang() == null || "en".equalsIgnoreCase(req.getLang())) {
                e.setName(d.getNameEn());
            } else {
                e.setName(d.getName());
            }
            res.getAreaList().add(e);
        }
        return res;
    }


    public boolean usernameExists(String username) {
        if (loginMapper.getUserName(username) != null) {
            return true;
        }
        return false;
    }

    public void insertAuthorities(String username, String authority) {
        loginMapper.insertAuthorities(username, authority);
    }

    /**
     * 验证码服务：生成并返回验证码图片, 生成文件模式
     *
     * @param instanceId
     * @param type
     * @return 验证码图片
     */
    public String getCaptcha(String uuid, int type) {
        ImageVO imageVo = ImageUtil.createCaptcha(uuid);
        String text = imageVo.getText();
        String filepath = imageVo.getImage().getAbsolutePath();
        redisTemplate.opsForValue().set(CAPTCHA_KEY_PREFIX + uuid, text, captchDurationMillisecond,
                TimeUnit.MILLISECONDS);
        redisTemplate.opsForValue().set(CAPTCHA_KEY_PREFIX + uuid + "_filepath", filepath, captchDurationMillisecond,
                TimeUnit.MILLISECONDS);
        return text;
    }

    /**
     * 验证码服务：生成并返回验证码图片
     *
     * @param instanceId
     * @param type
     * @return 验证码图片
     */
    public BufferedImage getCaptchaImage(String uuid, Integer type) {
        ImageVO imageVo = ImageUtil.createCaptcha(uuid);
        redisTemplate.opsForValue().set(CAPTCHA_KEY_PREFIX + uuid, imageVo.getText(), captchDurationMillisecond,
                TimeUnit.MILLISECONDS);
        return imageVo.getBufferedImage();
    }

    /**
     * 用户注册服务，返回生成的用户，如果verifyCode=passport，则此请求为BOSS系统将BOSS用户注册进APP
     *
     * @param req API req对象
     * @return 生成的用户TblUserMain对象
     */
    public RegisterRes register(RegisterReq req) {
        RegisterRes res = new RegisterRes();
        String username = req.getUserName();
        String mobile = null;
        String email = null;
        if (req.getRegisterType() == 1) {
            // 手机号注册
            username = req.getCountryCode() + "-" + req.getUserName();
            mobile = req.getUserName();
            String smsVerify = redisTemplate.opsForValue().get(CommonService.SMSVERIFYCODE + username);
            if (!smsVerify.equals(req.getVerifyCode()) && !req.getVerifyCode().equals(passport)) {
                // 短信验证码输入错误
                res.setCode(1108);
                res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
                return res;
            }
        } else {
            // 邮箱注册
            email = req.getUserName();
            String regex = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
            if (!Pattern.matches(regex, email)) {
                // 邮件格式输入错误
                res.setCode(1109);
                res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
                return res;
            }
            String emailVerify = redisTemplate.opsForValue().get(CommonService.EMAILVERIFYCODE + email);
            if (!req.getVerifyCode().equals(emailVerify) && !req.getVerifyCode().equals(passport)) {
                // 邮件验证码输入错误
                res.setCode(1108);
                res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
                return res;
            }
        }
        if (commonService.doCheckForVerificationCode(1, username, req.getLang(), res) > 0) {
            return res;
        }
        if (req.getVerifyCode().equals(passport)) {
            res.setUserFromBoss(true);
        }
//        TblUserMain record = new TblUserMain();
//        record.setEnabled((short) FieldConstants.USER_MAIN_STATUS.ENABLED.ordinal());
//        record.setCountryCode(req.getCountryCode());
//        record.setEmail(email);
//        record.setMobile(mobile);
//        if (username == null) {
//            username = email;
//        }
//        record.setUsername(username);
//        record.setUserLang((short) FieldConstants.USER_MAIN_LANG.valueOf(req.getLang()).ordinal());
//
//        record.setPassword(req.getPassword());
//        record.setUpdatedBy(req.getUserName());
//        record.setCreatedAt(new Date());
//        record.setReceivedReword(0);
//
//        int result = tblUserMainMapper.insert(record);
//
//
//
//        logger.debug("insert usermain return result: " + result);
//        logger.debug("insert usermain return user_main_id: " + record.getUserMainId());
//

        res.setCode(0);
        return res;
    }

    public ResetPasswordRes resetPassword(ResetPasswordReq req) {
        ResetPasswordRes res = new ResetPasswordRes();
        String username = req.getUserName();
        String redisKeySms;
        if (req.getRegisterType() == 1) {
            // 手机号
            username = req.getCountryCode() + "-" + req.getUserName();
            redisKeySms = CommonService.SMSVERIFYCODE + username;
        } else {
            // 邮箱
            redisKeySms = CommonService.EMAILVERIFYCODE + username;
        }
        String redisCachedVerifyCode = redisTemplate.opsForValue().get(redisKeySms);
        if (redisCachedVerifyCode == null || !redisCachedVerifyCode.equalsIgnoreCase(req.getVerifyCode())) {
            res.setCode(4102);
            res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
            return res;
        }
//        TblUserMainExample umExample = new TblUserMainExample();
//        umExample.createCriteria().andUsernameEqualTo(username);
//        List<TblUserMain> result = tblUserMainMapper.selectByExample(umExample);
//        if (result.isEmpty()) {
//            res.setCode(4105);
//            res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
//            return res;
//        }
//        TblUserMain um = result.get(0);
//        um.setPassword(req.getPassword());
//        um.setUpdatedBy(req.getUserName());
//        um.setUpdatedAt(new Date());
//        tblUserMainMapper.updateByPrimaryKey(um);
        return res;
    }
}
