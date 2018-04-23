package com.education.tutor.web.sso;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

 @Component
public class SsoClientDeprecated {

	// @Value("${sso.url}")
	String ssoUrl;

	// for test temporarily use 
	public void setSsoUrl(String ssoUrl) {
		this.ssoUrl = ssoUrl;
	}

	RestTemplate restTemplate = restTemplate();

	private final Log logger = LogFactory.getLog(this.getClass());

	// @PostConstruct
	public void init() {
		logger.info("ssoUrl:" + ssoUrl);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public SsoRes login(String username, String password) {
		SsoLoginReq req = new SsoLoginReq();
		req.setUserName(username);
		req.setPassword(password);
		SsoRes res = restTemplate.postForObject(ssoUrl + "/login", req, SsoRes.class);
		return res;
	}

	public SsoRes register(String username, String password) {
		SsoRegisterReq req = new SsoRegisterReq();
 		req.setUserName(username);
		req.setPassword(password);
		SsoRes res = restTemplate.postForObject(ssoUrl + "/register", req, SsoRes.class);
		return res;
	}

	public SsoRes resetPassword(String username, String oldPassword, String password) {
		SsoResetPasswordReq req = new SsoResetPasswordReq();
		req.setUserName(username);
		req.setPassword(password);
		req.setOldPassword(oldPassword);
		SsoRes res = restTemplate.postForObject(ssoUrl + "/changePassword", req, SsoRes.class);
		return res;
	}

}
