package com.education.tutor.api.user;

import com.education.tutor.api.UserBasic;

import java.io.Serializable;

public class Master implements Serializable {

	private static final long serialVersionUID = 1L;

	private String displayName;
	private String sort = "";


	private UserBasic user = new UserBasic();

	public String getDisplayName() {

		if(displayName == null||displayName.isEmpty()){
			return getNickName();
		}

		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getNickName() {


		if(user.getNickName() == null||user.getNickName().isEmpty()){
			return user.getUserName();
		}
		return user.getNickName();
	}

	public void setNickName(String nickName) {
		user.setNickName(nickName);
	}

	public Long getUserId() {
		return user.getUserId();
	}

	public void setUserId(Long userId) {
		user.setUserId(userId);
	}

	public String getAvatar() {
		return user.getAvatar();
	}

	public void setAvatar(String avatar) {
		user.setAvatar(avatar);
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Master(UserBasic user) {
		super();
		this.user = user;
	}

	public Master() {
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.getUserId() == null) {
			return false;
		}
		return this.getUserId().equals(((Master) obj).getUserId());
	}
	public String getUserName() {
		return user.getUserName();
	}

	public void setUserName(String userName) {
		this.user.setUserName(userName);
	}

}
