package com.education.tutor.service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.education.tutor.api.login.SendVerifyCodeReq;
import com.education.tutor.api.login.SendVerifyCodeRes;
import com.education.tutor.db.FieldConstants;
import com.education.tutor.db.domain.TblSmsLog;
import com.education.tutor.db.mapper.TblSmsLogMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 雪峰 on 2018/5/19.
 */
@Service
public class SMSService {


    private final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    TblSmsLogMapper tblSmsLogMapper;

    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = "LTAIdP8VggnufvRf";
    static final String accessKeySecret = "ShZOiM0uh6Q57z6L9xm8RIATcY6D63";

    static final String SIGN_ZH = "美师在线";

    static final String SIGN_EN = "USTUTOR";


    ObjectMapper om = new ObjectMapper();


    public SendVerifyCodeRes verifyCode(SendVerifyCodeReq req){
        SendVerifyCodeRes res = new SendVerifyCodeRes();
        String mobile = req.getUserName();
        boolean isInternational = false;
        String sign = SIGN_ZH;
        boolean isEn = false;
        //是否为国际短信
        if(!"86".equals(req.getCountryCode())){
            mobile = "00"+req.getCountryCode()+req.getUserName();
            isInternational = true;
        }
        //判定中英文
        if (FieldConstants.USER_MAIN_LANG.en.name().equals(req.getLang())) {
            sign = SIGN_EN;
            isEn = true;
        }

        String templateCode = "";
        String templateParam = "";

        //1:注册,2://修改密码
        if(req.getType() == 1) {
             templateParam = "{ \"code\":\"" + req.getCode() + "\"}";
            if (isInternational) {
                if(isEn){
                    //国际英文版
                    templateCode = "SMS_135032562";
                }else{
                    templateCode = "SMS_135043528";
                }
            }else{
                if(isEn){
                    templateCode = "SMS_135028615";
                }else{
                    //国内中文版
                    templateCode = "SMS_135042602";
                }
            }
        }else if(req.getType() == 2){
            templateParam = "{ \"code\":\"" + req.getCode() + "\"}";
            if (isInternational) {
                if(isEn){
                    //国际英文版
                    templateCode = "SMS_135043115";
                }else{
                    templateCode = "SMS_135038472";
                }
            }else{
                if(isEn){
                    templateCode = "SMS_135043544";
                }else{
                    //国内中文版
                    templateCode = "SMS_135028152";
                }
            }
        }

        String result = "";
        res.setCode(101);
        try {
            SendSmsResponse  sendSmsResponse = sendSms(mobile, sign, templateCode, templateParam);
            result = om.writeValueAsString(sendSmsResponse);
            if("OK".equals(sendSmsResponse.getCode())){
                res.setCode(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        TblSmsLog record = new TblSmsLog();
        record.setSmsChannel("");
        record.setCountryCode(req.getCountryCode());
        record.setMobile(mobile);
        record.setContent(templateCode);
        record.setReason(result);


        logger.debug("insert sms_log record conut = " + result);
        logger.debug("sms_log_Id = " + record.getId());



        return res;
    }








    private SendSmsResponse sendSms(String mobile,String sign,String templateCode,String templateParam) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();

        //必填:待发送手机号
        request.setPhoneNumbers(mobile);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName(sign);
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode(templateCode);
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
       // request.setTemplateParam("{\"name\":\"Tom\", \"code\":\"123\"}");
        request.setTemplateParam(templateParam);
        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        request.setOutId("yourOutId");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

        return sendSmsResponse;
    }





}
