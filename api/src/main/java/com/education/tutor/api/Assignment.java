package com.education.tutor.api;

import java.io.Serializable;

public class Assignment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String assignedBy; //  string 任务分配人

	UserBasic assignedTo; //  string 任务承接人

	String assignedTime; //  string 分配时间

	String assignedType; //  string 分配方式 0：系统自动分配 1：主管分配 2：主动承接

	String assignedState; //  string 分配状态

	String refuseReason; //  string 拒绝原因
	
	Long taskId;
		
	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

	public UserBasic getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(UserBasic assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getAssignedTime() {
		return assignedTime;
	}

	public void setAssignedTime(String assignedTime) {
		this.assignedTime = assignedTime;
	}

	public String getAssignedType() {
		return assignedType;
	}

	public void setAssignedType(String assignedType) {
		this.assignedType = assignedType;
	}

	public String getAssignedState() {
		return assignedState;
	}

	public void setAssignedState(String assignedState) {
		this.assignedState = assignedState;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

}
