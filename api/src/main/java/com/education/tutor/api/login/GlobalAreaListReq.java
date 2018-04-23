package com.education.tutor.api.login;

import com.education.tutor.api.BaseReq;

public class GlobalAreaListReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Integer id;
	
	Integer type;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	
}
