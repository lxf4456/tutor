package com.education.tutor.api;

import java.io.Serializable;

public class TupleIdValue implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Long id;
	
	String value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}