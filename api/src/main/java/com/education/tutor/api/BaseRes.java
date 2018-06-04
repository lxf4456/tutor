package com.education.tutor.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseRes extends Base {
		
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int code = -1;
	
	String message = "";
	
	String actionTime = sdf.format(new Date());
	
	Integer total = 0;
	
	public String getActionTime() {
		return actionTime;
	}

	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
	
}
