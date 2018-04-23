package com.education.tutor.service;

import java.text.MessageFormat;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.education.tutor.vo.SmsSendResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Configuration
@Transactional
@Profile({ "xxx" })
public class DummySmsGatewayService implements ISmsGateway {

	Map<SMSTEMPLATE, String> templates = new HashMap<SMSTEMPLATE, String>();

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	StringRedisTemplate redisTemplate;

	@PostConstruct
	void init() {
		templates.put(SMSTEMPLATE.REGISTER, "register verification code is {0} ");
		templates.put(SMSTEMPLATE.RESETPASSWORD, "reset password verification code is {0} ");
	}

	@Override
	public SmsSendResult send(int type, String lang, String countryCode, String phoneNo, String message, String ext,
                              String echoBack) {
		SmsSendResult result = new SmsSendResult();
		logger.info("send dummy sms " + message + " to " + phoneNo + ", goto Redis to check result");
		redisTemplate.opsForValue().set(SMSPREFIX + phoneNo + "_" + type + "_" + Instant.now().toEpochMilli(), message,
				720, TimeUnit.MINUTES);
		result.setFee(0);
		result.setResult(0);
		return result;
	}

	@Override
	public SmsSendResult sendWithParam(String lang, String countryCode, String phoneNo, SMSTEMPLATE templateId, List<String> params,
			String sign, String ext, String echoBack) {
		SmsSendResult result = new SmsSendResult();
		logger.info("send dummy sms " + templateId.name() + " to " + phoneNo + " with params "
				+ params.stream().collect(Collectors.joining(",", "[", "]")) + ", goto Redis to check result");
		String text = MessageFormat.format(templates.get(templateId), params.toArray());
		redisTemplate.opsForValue().set(
				SMSPREFIX + phoneNo + "_" + templateId.name() + "_" + Instant.now().toEpochMilli(), text, 720,
				TimeUnit.MINUTES);
		result.setFee(0);
		result.setResult(0);
		return result;
	}

	@Override
	public String getChannelName() {
		return "Dummy";
	}

}
