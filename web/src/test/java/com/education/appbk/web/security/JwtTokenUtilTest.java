package com.education.appbk.web.security;

import com.education.tutor.web.security.JwtTokenUtil;
import org.assertj.core.util.DateUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.HashMap;
import java.util.Map;

public class JwtTokenUtilTest {

	private JwtTokenUtil jwtTokenUtil;
	
	String userId = "86-13521273258";
	
	@Before
	public void init() {
		jwtTokenUtil = new JwtTokenUtil();
		ReflectionTestUtils.setField(jwtTokenUtil, "expiration", 3600000L);
		ReflectionTestUtils.setField(jwtTokenUtil, "secret", "3a990a2276917afac04467af11fff26a");
	}

	@Test
	public void testGenerateTokenGeneratesDifferentTokensForDifferentCreationDates() throws Exception {
		final Map<String, Object> claims = createClaims("2016-09-08T03:00:00");
		final String token = jwtTokenUtil.generateToken(claims);
		System.out.println(token);
		final Map<String, Object> claimsForLaterToken = createClaims("2016-09-08T08:00:00");
		final String laterToken = jwtTokenUtil.generateToken(claimsForLaterToken);
//		assertThat(token).isNotEqualTo(laterToken);
	}

	@Test
	public void testToken() throws Exception {
		String token = jwtTokenUtil.generateToken(userId);
		System.out.println(userId);
		System.out.println(token);
	}
	
	private Map<String, Object> createClaims(String creationDate) {
        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put(JwtTokenUtil.CLAIM_KEY_USERNAME, "testUser");
        claims.put(JwtTokenUtil.CLAIM_KEY_AUDIENCE, "testAudience");
        claims.put(JwtTokenUtil.CLAIM_KEY_ISSUEDAT, DateUtil.parseDatetime(creationDate));
        return claims;
    }

	String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ6bGswNDIyQEdtYWlsLmNvbSIsImF1ZGllbmNlIjoidW5rbm93biIsImV4cCI6MTUwNzQ1NzU1MSwiaWF0IjoxNTA0ODY1NTUxNjA3fQ.2tns-ZS7tOl5IikAU7-E-U27t2nQfIaP04JGDaXv-y0";
	
	@Test
	public void checkToken() {
		String username = jwtTokenUtil.getUsernameFromToken(token);
		System.out.println(username);
	}
}