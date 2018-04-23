package com.education.tutor.api.login;

import com.education.tutor.api.BaseReq;

public class LoginReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String userName; //手机号
	
	String password; //密码

	String countryCode; // 国家电话代码

	Integer loginType; // 登录方式（1：手机号登录 2：邮箱登录）
	
	public Integer getLoginType() {
		return loginType;
	}

	public void setLoginType(Integer loginType) {
		this.loginType = loginType;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

}
