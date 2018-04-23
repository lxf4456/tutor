package com.education.tutor.api.login;

import com.education.tutor.api.BaseReq;

public class ResetPasswordReq extends BaseReq {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String userName; // 手机号

	String password; // 密码

	String verifyCode; // 验证码

	Integer registerType; // 验证码类型， 1：手机号注册 2：邮箱注册

	String countryCode; // 国家电话代码
	
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

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public Integer getRegisterType() {
		return registerType;
	}

	public void setRegisterType(Integer registerType) {
		this.registerType = registerType;
	}

}
