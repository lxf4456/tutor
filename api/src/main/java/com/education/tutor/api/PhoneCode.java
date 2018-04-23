package com.education.tutor.api;

import java.io.Serializable;

public class PhoneCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String countryCode;

	String countryName;

	String sort = "";

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
