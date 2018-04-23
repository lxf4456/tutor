package com.education.tutor.vo;

public class SmsSendResult {

	Integer result;
	String errMsg = "";
	String ext = "";
	String sid = "";
	Integer fee;

	public String toString() {
		return String.format("{\n\t\"result\":%s,\n\t\"errMsg\":\"%s\",\n\t\"ext\":\"%s\",\n\t\"sid\":\"%s\",\n\t\"fee\":%s\n}",
				result, errMsg, ext, sid, fee);
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

}
