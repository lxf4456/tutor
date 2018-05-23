package com.education.appbk.web.controller;

import com.education.Application;
import com.education.tutor.api.login.LoginReq;
import com.education.tutor.api.login.LoginRes;
import com.education.tutor.api.login.SendVerifyCodeReq;
import com.education.tutor.api.login.SendVerifyCodeRes;
import com.education.tutor.web.security.JwtTokenUtil;
import com.education.tutor.web.sso.SsoClientDeprecated;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class LoginControllerTest {

	@Value("${test.user}")
	String username;

	@Autowired
	StringRedisTemplate redisTemplate;

	@Autowired
	SsoClientDeprecated ssoClient;

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@Autowired
	TestRestTemplate testRestTemplate;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {
		LoginReq req = new LoginReq();
		req.setUserName(username);
		req.setPassword("123456");
		LoginRes res = testRestTemplate.postForObject("/login/login", req, LoginRes.class);
		logger.info(res.getMessage());
	}


	@Test
	public void sendVerifyCode() {
		SendVerifyCodeReq req = new SendVerifyCodeReq();
		//req.setUserName("6264299298");
		req.setUserName("lxf4456@163.com");
		req.setRegisterType(1);
		req.setLang("en");
		req.setCountryCode("1");
		req.setCode("1234");
		req.setCaptcha("2133");
		req.setRegisterType(2);
		req.setType(1);
		SendVerifyCodeRes res = testRestTemplate.postForObject("/login/sendVerifyCode", req, SendVerifyCodeRes.class);
		logger.info(res.getMessage());
	}
}
