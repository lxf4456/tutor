package com.education.tutor.api;

public class ErrorRes extends BaseRes {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int httpStatus;

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

}
