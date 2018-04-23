package com.education.tutor.api.login;

import com.education.tutor.api.BaseRes;

public class GetCaptchaRes extends BaseRes {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String image;//图片流

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
