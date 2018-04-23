package com.education.tutor.web.security;


import com.education.tutor.db.mapper.TblUserMainMapper;
import com.education.tutor.web.sso.SsoClientDeprecated;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class RegiAuthenticationProvider implements AuthenticationProvider {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	RegiUserDetailService userDetailService;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@Autowired
	TblUserMainMapper tblUserMainMapper;
	
	@Autowired
	SsoClientDeprecated ssoClient;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && auth instanceof RegiAuthenticationToken) {
			logger.debug("already found authentication in security context, directly return");
			return SecurityContextHolder.getContext().getAuthentication();
		}
		RegiUserDetails user;
		try {
			user = (RegiUserDetails) userDetailService.loadUserByUsername(authentication.getName());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			logger.error("load user data with userDetailService failed " + authentication.getName());
			authentication.setAuthenticated(false);
			return authentication;
		}
		if (authentication.getCredentials() == null || authentication.getCredentials().toString().length() == 0) {
			logger.debug("credentials is null, jwt check already done, directly return");
			return buildSuccAuth(authentication.getName(), user);
		}
		try {
//			SsoRes res = ssoClient.login(authentication.getName(), authentication.getCredentials().toString());
//			logger.info("call sso " + res.getSuccess() + ", msg=" + res.getMsg() + ", JsonStr=" + res.getJsonStr());
//			if (res.getSuccess().equalsIgnoreCase("false")) {
				// sso auth failed, do local check again
				return localCheck(user, authentication);
//			} else {
//				// sso auth succ, return buildSuccAuth
//				return buildSuccAuth(authentication.getName(), user);
//			}
		} catch (Exception e) {
			logger.error("call sso failed, error:" + e.getMessage());
			return localCheck(user, authentication);
		}
	}

	private Authentication buildSuccAuth(String username, RegiUserDetails user) {
		String jwt = jwtTokenUtil.generateToken(username.toLowerCase());
		RegiAuthenticationToken result = new RegiAuthenticationToken(user.getVo(), jwt, user.getAuthorities());
		result.setDetails(user);
		result.setAuthenticated(true);
		return result;
	}
	
	private Authentication localCheck(RegiUserDetails user, Authentication authentication) {
		String storedPassword = user.getVo().getBasic().getPassword();
		if (!passwordEncoder.matches(authentication.getCredentials().toString(), storedPassword)) {
			logger.info("local auth failed " + authentication.getName() + ":" + authentication.getCredentials() + ", encoded:"
					+ user.getVo().getBasic().getPassword());
			authentication.setAuthenticated(false);
			return authentication; 
		} else {
			return buildSuccAuth(authentication.getName(), user);
		}
	}
	
	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}

}
