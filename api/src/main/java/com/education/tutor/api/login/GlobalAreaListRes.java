package com.education.tutor.api.login;

import com.education.tutor.api.Area;
import com.education.tutor.api.BaseRes;

import java.util.ArrayList;
import java.util.List;

public class GlobalAreaListRes extends BaseRes {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<Area> areaList = new ArrayList<Area>();

	public List<Area> getAreaList() {
		return areaList;
	}

	public void setAreaList(List<Area> areaList) {
		this.areaList = areaList;
	}
	
}
