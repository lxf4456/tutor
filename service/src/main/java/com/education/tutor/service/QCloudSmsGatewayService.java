package com.education.tutor.service;

import com.education.tutor.db.FieldConstants;
import com.education.tutor.vo.SmsSendResult;
import com.qcloud.sms.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Configuration
@Transactional
@Profile({ "dev", "uat", "prd" ,"spd"})
public class QCloudSmsGatewayService extends DummySmsGatewayService {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Value("${sms.appid}")
	int appid = 1400030143;

	@Value("${sms.appkey}")
	String appkey = "408180c961e6882613c0f2f536b86923";

	String url = "https://yun.tim.qq.com/v5/tlssmssvr/sendsms";

	RestTemplate restTemplate = new RestTemplate();

	Map<String, Integer> templatesQCloud = new HashMap<String, Integer>();

	Map<String, String> templates = new HashMap<String, String>();

	@Autowired
	StringRedisTemplate redisTemplate;

	SmsSingleSender smsSingleSender;

	SmsStatusPuller pullstatus;

	@PostConstruct
	@Override
	void init() {
		super.init();
		pullstatus = new SmsStatusPuller(appid, appkey);
		try {
			smsSingleSender = new SmsSingleSender(appid, appkey);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		templatesQCloud.put(FieldConstants.USER_MAIN_LANG.zh.name() + SMSTEMPLATE.REGISTER.name(), 19117);
		templatesQCloud.put(FieldConstants.USER_MAIN_LANG.zh.name() + SMSTEMPLATE.RESETPASSWORD.name(), 19117);

		templatesQCloud.put(FieldConstants.USER_MAIN_LANG.en.name() + SMSTEMPLATE.REGISTER.name(), 19565);
		templatesQCloud.put(FieldConstants.USER_MAIN_LANG.en.name() + SMSTEMPLATE.RESETPASSWORD.name(), 19565);
	}

	@Override
	public SmsSendResult send(int type, String lang, String countryCode, String phoneNo, String message, String ext,
							  String echoBack) {
		SmsSendResult result = new SmsSendResult();
		super.send(type, lang, countryCode, phoneNo, message, ext, echoBack);
		try {
			logger.info("now calling qcloud to send actual sms");
			SmsSingleSenderResult qCloudResult = sendInner(type, countryCode, phoneNo, message, ext, ext);
			result.setErrMsg(qCloudResult.errMsg);
			result.setFee(qCloudResult.fee);
			result.setResult(qCloudResult.result);
			result.setExt(qCloudResult.ext);
			result.setSid(qCloudResult.sid);
			logger.info(result);
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public SmsSendResult sendWithParam(String lang, String countryCode, String phoneNo, SMSTEMPLATE templateId,
			List<String> params, String sign, String ext, String echoBack) {
		SmsSendResult result = new SmsSendResult();
		super.sendWithParam(lang, countryCode, phoneNo, templateId, params, sign, ext, echoBack);
		try {
			logger.info("now calling qcloud to send actual sms with param");
			SmsSingleSenderResult qCloudResult = sendWithParamInner(countryCode, phoneNo,
					templatesQCloud.get(lang + templateId.name()), params, sign, ext, ext);
			result.setErrMsg(qCloudResult.errMsg);
			result.setFee(qCloudResult.fee);
			result.setResult(qCloudResult.result);
			result.setExt(qCloudResult.ext);
			result.setSid(qCloudResult.sid);
			logger.info(result);
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getChannelName() {
		return "QCloud";
	}

	@Scheduled(cron = "0/20 * * * * ?")
	public void pingQCloud() {
		try {
			SmsStatusPullCallbackResult callback_result = pullstatus.pullCallback(10);
//			logger.info("callback_result: " + callback_result);
//			SmsStatusPullReplyResult reply_result = pullstatus.pullReply(10);
//			logger.info("reply_result: " + reply_result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 指定模板单发
	 * 
	 * @param nationCode
	 *            国家码，如 86 为中国
	 * @param phoneNumber
	 *            不带国家码的手机号
	 * @param templId
	 *            信息内容
	 * @param params
	 *            模板参数列表，如模板 {1}...{2}...{3}，那么需要带三个参数
	 * @param sign
	 *            签名，如果填空，系统会使用默认签名
	 * @param extend
	 *            扩展码，可填空
	 * @param ext
	 *            服务端原样返回的参数，可填空
	 * @return {@link}SmsSingleSenderResult
	 * @throws Exception
	 */
	public SmsSingleSenderResult sendWithParamInner(String nationCode, String phoneNumber, int templId,
			List<String> params, String sign, String extend, String ext) throws Exception {
		/*
		 * 请求包体 { "tel": { "nationcode": "86", "mobile": "13788888888" },
		 * "sign": "腾讯云", "tpl_id": 19, "params": [ "验证码", "1234", "4" ], "sig":
		 * "fdba654e05bc0d15796713a1a1a2318c", "time": 1479888540, "extend": "",
		 * "ext": "" } 应答包体 { "result": 0, "errmsg": "OK", "ext": "", "sid":
		 * "xxxxxxx", "fee": 1 }
		 */
		if (null == nationCode || 0 == nationCode.length()) {
			nationCode = "86";
		}
		if (null == params) {
			params = new ArrayList<>();
		}
		if (null == sign) {
			sign = "";
		}
		if (null == extend) {
			extend = "";
		}
		if (null == ext) {
			ext = "";
		}

		SmsSenderUtil util = new SmsSenderUtil();

		long random = util.getRandom();
		long curTime = System.currentTimeMillis() / 1000;

		JSONObject data = new JSONObject();
		JSONObject tel = new JSONObject();

		tel.put("nationcode", nationCode);
		tel.put("mobile", phoneNumber);

		data.put("tel", tel);
		data.put("sig", util.calculateSigForTempl(appkey, random, curTime, phoneNumber));
		data.put("tpl_id", templId);
		data.put("params", util.smsParamsToJSONArray(params));
		data.put("sign", sign);
		data.put("time", curTime);
		data.put("extend", extend);
		data.put("ext", ext);

		String wholeUrl = String.format("%s?sdkappid=%d&random=%d", url, appid, random);

		HttpHeaders requestHeaders = new HttpHeaders();
		HttpEntity<String> requestEntity = new HttpEntity<String>(data.toString(), requestHeaders);
		logger.info("before post to qcloud " + phoneNumber);
		ResponseEntity<String> resData = restTemplate.postForEntity(wholeUrl, requestEntity, String.class);
		logger.info("after post to qcloud " + phoneNumber);
		SmsSingleSenderResult result;
		if (resData.getStatusCode().value() == HttpURLConnection.HTTP_OK) {
			JSONObject json = new JSONObject(resData.getBody());
			result = util.jsonToSmsSingleSenderResult(json);
		} else {
			result = new SmsSingleSenderResult();
			result.result = resData.getStatusCodeValue();
			result.errMsg = "http error " + resData.getStatusCodeValue() + " " + resData.getBody();
		}
		return result;
	}

	/**
	 * 普通单发短信接口，明确指定内容，如果有多个签名，请在内容中以【】的方式添加到信息内容中，否则系统将使用默认签名
	 * 
	 * @param type
	 *            短信类型，0 为普通短信，1 营销短信
	 * @param nationCode
	 *            国家码，如 86 为中国
	 * @param phoneNumber
	 *            不带国家码的手机号
	 * @param msg
	 *            信息内容，必须与申请的模板格式一致，否则将返回错误
	 * @param extend
	 *            扩展码，可填空
	 * @param ext
	 *            服务端原样返回的参数，可填空
	 * @return {@link}SmsSingleSenderResult
	 * @throws Exception
	 */
	public SmsSingleSenderResult sendInner(int type, String nationCode, String phoneNumber, String msg, String extend,
			String ext) throws Exception {
		/*
		 * 请求包体 { "tel": { "nationcode": "86", "mobile": "13788888888" },
		 * "type": 0, "msg": "你的验证码是1234", "sig":
		 * "fdba654e05bc0d15796713a1a1a2318c", "time": 1479888540, "extend": "",
		 * "ext": "" } 应答包体 { "result": 0, "errmsg": "OK", "ext": "", "sid":
		 * "xxxxxxx", "fee": 1 }
		 */
		// 校验 type 类型
		if (0 != type && 1 != type) {
			throw new Exception("type " + type + " error");
		}
		if (null == extend) {
			extend = "";
		}
		if (null == ext) {
			ext = "";
		}
		SmsSenderUtil util = new SmsSenderUtil();
		// 按照协议组织 post 请求包体
		long random = util.getRandom();
		long curTime = System.currentTimeMillis() / 1000;

		JSONObject data = new JSONObject();
		JSONObject tel = new JSONObject();

		tel.put("nationcode", nationCode);
		tel.put("mobile", phoneNumber);

		data.put("type", type);
		data.put("msg", msg);
		data.put("sig", util.strToHash(
				String.format("appkey=%s&random=%d&time=%d&mobile=%s", appkey, random, curTime, phoneNumber)));
		data.put("tel", tel);
		data.put("time", curTime);
		data.put("extend", extend);
		data.put("ext", ext);

		// 与上面的 random 必须一致
		String wholeUrl = String.format("%s?sdkappid=%d&random=%d", url, appid, random);
		HttpHeaders requestHeaders = new HttpHeaders();
		HttpEntity<String> requestEntity = new HttpEntity<String>(data.toString(), requestHeaders);
		logger.info("before post to qcloud " + phoneNumber);
		ResponseEntity<String> resData = restTemplate.postForEntity(wholeUrl, requestEntity, String.class);
		logger.info("after post to qcloud " + phoneNumber);
		SmsSingleSenderResult result;
		if (resData.getStatusCode().value() == HttpURLConnection.HTTP_OK) {
			JSONObject json = new JSONObject(resData.getBody());
			result = util.jsonToSmsSingleSenderResult(json);
		} else {
			result = new SmsSingleSenderResult();
			result.result = resData.getStatusCodeValue();
			result.errMsg = "http error " + resData.getStatusCodeValue() + " " + resData.getBody();
		}
		return result;
	}

}
