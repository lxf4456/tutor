package com.education.tutor.api;

import java.io.Serializable;

public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Long id; // 评论id
	private Long userId;//回复者id
	private String commentContent; // 回复内容
	private Long targetUserId;//回复的目标用户id
	private String nickName;//回复者昵称
	private String targetNickName;//回复的目标用户昵称
	private Integer isRemoved;//回复是否已被管理员删除（0：否 1：是）
	private String avatar;//头像
	private String cdate;//创建时间
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return this.getId().equals(((Comment) obj).getId());
	}

	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the commentContent
	 */
	public String getCommentContent() {
		return commentContent;
	}
	/**
	 * @param commentContent the commentContent to set
	 */
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
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
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the targetNickName
	 */
	public String getTargetNickName() {
		return targetNickName;
	}
	/**
	 * @param targetNickName the targetNickName to set
	 */
	public void setTargetNickName(String targetNickName) {
		this.targetNickName = targetNickName;
	}
	/**
	 * @return the isRemoved
	 */
	public Integer getIsRemoved() {
		return isRemoved;
	}
	/**
	 * @param isRemoved the isRemoved to set
	 */
	public void setIsRemoved(Integer isRemoved) {
		this.isRemoved = isRemoved;
	}



	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}



	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}



	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}



	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}



	/**
	 * @return the cdate
	 */
	public String getCdate() {
		return cdate;
	}



	/**
	 * @param cdate the cdate to set
	 */
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}


}
