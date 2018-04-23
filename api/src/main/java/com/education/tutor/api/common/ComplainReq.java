package com.education.tutor.api.common;

import com.education.tutor.api.BaseReq;

public class ComplainReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1666099208790313929L;
	
	private Long id;			//帖子/评论id
	private String content;		//投诉内容
	private Integer type;		//类型（1：帖子 2：评论）
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	

}
