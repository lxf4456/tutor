package com.education.tutor.api;

import java.io.Serializable;

public class Area implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return this.getId().equals(((Area) obj).getId());
	}

	String name;

	Integer id;

	private  String sort = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
}
