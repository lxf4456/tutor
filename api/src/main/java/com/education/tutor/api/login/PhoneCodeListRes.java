package com.education.tutor.api.login;

import com.education.tutor.api.BaseRes;
import com.education.tutor.api.PhoneCode;

import java.util.ArrayList;
import java.util.List;

public class PhoneCodeListRes extends BaseRes {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<PhoneCode> phoneCodeList = new ArrayList<PhoneCode>();

	public List<PhoneCode> getPhoneCodeList() {
		return phoneCodeList;
	}

	public void setPhoneCodeList(List<PhoneCode> phoneCodeList) {
		this.phoneCodeList = phoneCodeList;
	}

}
