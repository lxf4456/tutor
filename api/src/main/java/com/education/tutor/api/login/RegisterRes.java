package com.education.tutor.api.login;

import com.education.tutor.api.BaseRes;

public class RegisterRes extends BaseRes {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String authorization; // jwt

	String imToken;

	boolean userFromBoss = false;
	
	public boolean isUserFromBoss() {
		return userFromBoss;
	}

	public void setUserFromBoss(boolean userFromBoss) {
		this.userFromBoss = userFromBoss;
	}

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

}
