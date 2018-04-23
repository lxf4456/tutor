package com.education.tutor.db.domain;

import java.util.Date;

public class TblTaskExecution {
    private Long taskExecutionId;

    private Long taskId;

    private Long userMainId;

    private Date executionStart;

    private Date executionEnd;

    private String executionResult;

    private Integer executionFlag;

    private String executionRemark;

    private String executionLocation;

    private Integer executionState;

    private String coporatedBy;

    private Integer score;

    private String scoreReason;

    private Date updatedAt;

    private String updatedBy;

    public TblTaskExecution(Long taskExecutionId, Long taskId, Long userMainId, Date executionStart, Date executionEnd, String executionResult, Integer executionFlag, String executionRemark, String executionLocation, Integer executionState, String coporatedBy, Integer score, String scoreReason, Date updatedAt, String updatedBy) {
        this.taskExecutionId = taskExecutionId;
        this.taskId = taskId;
        this.userMainId = userMainId;
        this.executionStart = executionStart;
        this.executionEnd = executionEnd;
        this.executionResult = executionResult;
        this.executionFlag = executionFlag;
        this.executionRemark = executionRemark;
        this.executionLocation = executionLocation;
        this.executionState = executionState;
        this.coporatedBy = coporatedBy;
        this.score = score;
        this.scoreReason = scoreReason;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblTaskExecution() {
        super();
    }

    public Long getTaskExecutionId() {
        return taskExecutionId;
    }

    public void setTaskExecutionId(Long taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Date getExecutionStart() {
        return executionStart;
    }

    public void setExecutionStart(Date executionStart) {
        this.executionStart = executionStart;
    }

    public Date getExecutionEnd() {
        return executionEnd;
    }

    public void setExecutionEnd(Date executionEnd) {
        this.executionEnd = executionEnd;
    }

    public String getExecutionResult() {
        return executionResult;
    }

    public void setExecutionResult(String executionResult) {
        this.executionResult = executionResult == null ? null : executionResult.trim();
    }

    public Integer getExecutionFlag() {
        return executionFlag;
    }

    public void setExecutionFlag(Integer executionFlag) {
        this.executionFlag = executionFlag;
    }

    public String getExecutionRemark() {
        return executionRemark;
    }

    public void setExecutionRemark(String executionRemark) {
        this.executionRemark = executionRemark == null ? null : executionRemark.trim();
    }

    public String getExecutionLocation() {
        return executionLocation;
    }

    public void setExecutionLocation(String executionLocation) {
        this.executionLocation = executionLocation == null ? null : executionLocation.trim();
    }

    public Integer getExecutionState() {
        return executionState;
    }

    public void setExecutionState(Integer executionState) {
        this.executionState = executionState;
    }

    public String getCoporatedBy() {
        return coporatedBy;
    }

    public void setCoporatedBy(String coporatedBy) {
        this.coporatedBy = coporatedBy == null ? null : coporatedBy.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getScoreReason() {
        return scoreReason;
    }

    public void setScoreReason(String scoreReason) {
        this.scoreReason = scoreReason == null ? null : scoreReason.trim();
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