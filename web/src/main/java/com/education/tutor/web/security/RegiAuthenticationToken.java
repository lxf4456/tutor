package com.education.tutor.web.security;

import com.education.tutor.vo.UserPrincipalVO;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;


public class RegiAuthenticationToken extends AbstractAuthenticationToken {

	UserPrincipalVO userPrincipal;
	
	public UserPrincipalVO getUserPrincipal() {
		return userPrincipal;
	}
	
	String jwt;

	public String getJwt() {
		return jwt;
	}

	public RegiAuthenticationToken(UserPrincipalVO userPrincipal, String jwt, Collection<? extends GrantedAuthority> arg0) {
		super(arg0);
		this.userPrincipal = userPrincipal;
		this.jwt = jwt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object getCredentials() {
		return "";
	}

	@Override
	public Object getPrincipal() {
//		return userPrincipal.getBasic().getUsername();
		return new Object();
	}

}
