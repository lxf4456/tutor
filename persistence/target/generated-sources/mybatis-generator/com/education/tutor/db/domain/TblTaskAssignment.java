package com.education.tutor.db.domain;

import java.util.Date;

public class TblTaskAssignment {
    private Long taskAssignmentId;

    private Long taskId;

    private Long taskExecutionId;

    private String assignedBy;

    private String assignedTo;

    private Integer assignedType;

    private Integer assignedState;

    private String refuseReason;

    private Date updatedAt;

    private String updatedBy;

    public TblTaskAssignment(Long taskAssignmentId, Long taskId, Long taskExecutionId, String assignedBy, String assignedTo, Integer assignedType, Integer assignedState, String refuseReason, Date updatedAt, String updatedBy) {
        this.taskAssignmentId = taskAssignmentId;
        this.taskId = taskId;
        this.taskExecutionId = taskExecutionId;
        this.assignedBy = assignedBy;
        this.assignedTo = assignedTo;
        this.assignedType = assignedType;
        this.assignedState = assignedState;
        this.refuseReason = refuseReason;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblTaskAssignment() {
        super();
    }

    public Long getTaskAssignmentId() {
        return taskAssignmentId;
    }

    public void setTaskAssignmentId(Long taskAssignmentId) {
        this.taskAssignmentId = taskAssignmentId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskExecutionId() {
        return taskExecutionId;
    }

    public void setTaskExecutionId(Long taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    public String getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy == null ? null : assignedBy.trim();
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo == null ? null : assignedTo.trim();
    }

    public Integer getAssignedType() {
        return assignedType;
    }

    public void setAssignedType(Integer assignedType) {
        this.assignedType = assignedType;
    }

    public Integer getAssignedState() {
        return assignedState;
    }

    public void setAssignedState(Integer assignedState) {
        this.assignedState = assignedState;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason == null ? null : refuseReason.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}