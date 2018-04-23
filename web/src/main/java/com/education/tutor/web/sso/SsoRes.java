package com.education.tutor.web.sso;

public class SsoRes {

	String success;
	String msg;
	String jsonStr;
	
	public String getJsonStr() {
		return jsonStr;
	}

	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMsg() {		
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
