package com.education.tutor.api.common;

import com.education.tutor.api.BaseReq;

public class SubmitCommentReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3736181313906931767L;
	
	
	private Long id;
	private Integer type;		// 目标类型（1：帖子 2：评论） 
	private String comment;//评论内容
	private Long targetUserId;//目标用户id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the targetUserId
	 */
	public Long getTargetUserId() {
		return targetUserId;
	}
	/**
	 * @param targetUserId the targetUserId to set
	 */
	public void setTargetUserId(Long targetUserId) {
		this.targetUserId = targetUserId;
	}
	
	
	

}
