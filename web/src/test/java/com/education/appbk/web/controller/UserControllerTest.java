package com.education.appbk.web.controller;


import com.education.tutor.Application;
import com.education.tutor.api.user.MyInfoReq;
import com.education.tutor.api.user.MyInfoRes;
import com.education.tutor.api.user.SetMyLanguageReq;
import com.education.tutor.api.user.SetMyLanguageRes;
import com.education.tutor.util.Constants;
import com.education.tutor.web.security.JwtTokenUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
	
	
	private final Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
	TestRestTemplate testRestTemplate;
	
	@Autowired
	JwtTokenUtil jwtTokenUtil;
	/**
	 * 个人信息
	 * 测试通过
	 */
	@Test
	public void myInfoTest() {
		
//		String sampleJwtToken = jwtTokenUtil.generateToken("86-13668696376");
		
		MyInfoReq req = new MyInfoReq();
		HttpEntity<MyInfoReq> requestEntity = new HttpEntity<MyInfoReq>(req,Constants.getHttpHeaders());
		MyInfoRes rs = testRestTemplate.exchange("/user/myInfo", HttpMethod.POST, requestEntity, MyInfoRes.class).getBody();
//		logger.info(rs.getCode());
//		logger.info(rs.getMessage());
//		logger.info(rs.getUserId());
//		logger.info(rs.getUserName());
//		logger.info(rs.getNickName());
//		
//		
		
		
		System.out.println("_____________________________________________________________"+rs.getIsSign());
		
	}
	



	
	/**
	 * 测试通过
	 */
	@Test
	public void setMyLanguageTest() {
		SetMyLanguageReq req = new SetMyLanguageReq();
		HttpEntity<SetMyLanguageReq> requestEntity = new HttpEntity<SetMyLanguageReq>(req,Constants.getHttpHeaders());
		
		requestEntity.getBody().setLang("zh");
		SetMyLanguageRes rs = testRestTemplate.exchange("/user/setMyLanguage", HttpMethod.POST, requestEntity, SetMyLanguageRes.class).getBody();
		logger.info(rs.getCode());
		logger.info(rs.getMessage());
		
	}



	
}
