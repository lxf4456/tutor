package com.education.tutor.api.login;

import com.education.tutor.api.BaseReq;

public class GetCaptchaReq extends BaseReq {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Integer type;//类型（1:4位数字码 2:4位字母 3:4位数字字母混合）

	String uuid;//随机uudi

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}
