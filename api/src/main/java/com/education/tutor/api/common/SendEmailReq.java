package com.education.tutor.api.common;

import com.education.tutor.api.BaseReq;

public class SendEmailReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 295891667906474401L;
	
	
	private String cc;//抄送
	private String to;   //接收方
	private String text; //内容
	private String subject; //主题
	private String templateName;//模板名称
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
}
