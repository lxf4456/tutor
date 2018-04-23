package com.education.tutor.api.login;

import com.education.tutor.api.BaseRes;

public class LoginRes extends BaseRes {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String authorization; //jwt
	
	String nickName; //昵称
	
	String avatar; //头像
	
	Integer sex; //性别
	
	Long userId;//用户id

	String imToken;
	
	public String getImToken() {
		return imToken;
	}

	public void setImToken(String imToken) {
		this.imToken = imToken;
	}

	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
