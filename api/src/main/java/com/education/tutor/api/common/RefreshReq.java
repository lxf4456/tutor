package com.education.tutor.api.common;

import com.education.tutor.api.BaseReq;

public class RefreshReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Long userId;
	
	Long roleId;

	@Override
	public Long getUserId() {
		return userId;
	}

	@Override
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
}
