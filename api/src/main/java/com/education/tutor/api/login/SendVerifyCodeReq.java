package com.education.tutor.api.login;

import com.education.tutor.api.BaseReq;

public class SendVerifyCodeReq extends BaseReq {
			
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Integer type; //类型（1：注册时调用 2：重置密码时调用）
	
	String userName;//手机号
	
	String captcha;//图片验证码
	
	String uuid;// 随机uuid
	
	Integer registerType; //验证码类型， 1：手机号注册 2：邮箱注册

	String countryCode; // 国家电话代码

	private String code;
	
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Integer getRegisterType() {
		return registerType;
	}

	public void setRegisterType(Integer registerType) {
		this.registerType = registerType;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}


	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
