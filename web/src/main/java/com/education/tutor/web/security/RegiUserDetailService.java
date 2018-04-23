package com.education.tutor.web.security;

import com.education.tutor.service.UserService;
import com.education.tutor.vo.UserPrincipalVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class RegiUserDetailService implements UserDetailsService {

	private final Log logger = LogFactory.getLog(this.getClass());

	ObjectMapper om = new ObjectMapper();

	@Autowired
	StringRedisTemplate redisTemplate;

	@Autowired
	UserService userService;

	@Value("${redis-user-logintoken.duration.seconds}")
	private long duration = 3600 * 72;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// call redis to get UserPrincipalVO, if not present, load it from db
		logger.debug("load user details " + userName);
		String username = userName.toLowerCase();
		UserPrincipalVO vo;
		String data = userService.loadUserPrincipalStringFromRedis(username);
		try {
			if (data != null) {
				// logger.info(data);
				try {
					vo = om.readValue(data, UserPrincipalVO.class);
				} catch (Exception e) {
					vo = userService.reloadRedis(username);
				}
			} else {
				vo = userService.reloadRedis(username);
			}
			RegiUserDetails result = new RegiUserDetails(vo);
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
