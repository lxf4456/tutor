package com.education.tutor.api.common;

import com.education.tutor.api.BaseReq;

public class CollectReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Integer type; // 类型（0：设备 1：帖子）

	Integer operate; // 类型（0：取消 1：收藏）

	String id;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getOperate() {
		return operate;
	}

	public void setOperate(Integer operate) {
		this.operate = operate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
