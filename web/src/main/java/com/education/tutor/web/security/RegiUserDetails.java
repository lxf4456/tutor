package com.education.tutor.web.security;

import com.education.tutor.vo.UserPrincipalVO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class RegiUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UserPrincipalVO vo;

	public UserPrincipalVO getVo() {
		return vo;
	}

	RegiUserDetails(UserPrincipalVO vo) {
		this.vo = vo;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> result = new ArrayList<SimpleGrantedAuthority>();
		for (String autho : vo.getAuthorities()) {
			SimpleGrantedAuthority s = new SimpleGrantedAuthority(autho);
			result.add(s);
		}
		for (String role : vo.getRoles()) {
			SimpleGrantedAuthority s = new SimpleGrantedAuthority("ROLE_" + role.toUpperCase());
			result.add(s);
		}
		return result;
	}

	@Override
	public String getPassword() {
		return vo.getBasic().getPassword();
	}

	@Override
	public String getUsername() {
		return vo.getBasic().getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return vo.getBasic().getEnabled() == 1;
	}

}
