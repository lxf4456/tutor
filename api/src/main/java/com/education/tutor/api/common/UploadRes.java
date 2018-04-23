package com.education.tutor.api.common;

import com.education.tutor.api.Attachment;
import com.education.tutor.api.BaseRes;

import java.util.ArrayList;
import java.util.List;

public class UploadRes extends BaseRes {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	List<Attachment> attachments = new ArrayList<Attachment>();

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

}
