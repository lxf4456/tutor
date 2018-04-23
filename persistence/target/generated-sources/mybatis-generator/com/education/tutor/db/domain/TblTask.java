package com.education.tutor.db.domain;

import java.util.Date;

public class TblTask {
    private Long taskId;

    private Long userMainId;

    private Long projectId;

    private String taskName;

    private String taskContent;

    private Long taskDataPk;

    private Integer taskType;

    private Integer taskState;

    private Long parentTaskId;

    private Date createdAt;

    private Date planStartAt;

    private Date planEndAt;

    private Date inforceAt;

    private String createdBy;

    private String assignedBy;

    private String assignedTo;

    private String assignedGroup;

    private Integer priority;

    private Integer progress;

    private String progressDesc;

    private String offsetDesc;

    private Integer taskResult;

    private String taskResultDesc;

    private String taskResultRemark;

    private Integer score;

    private String scoreReason;

    private String remark;

    private Date updatedAt;

    private String updatedBy;

    public TblTask(Long taskId, Long userMainId, Long projectId, String taskName, String taskContent, Long taskDataPk, Integer taskType, Integer taskState, Long parentTaskId, Date createdAt, Date planStartAt, Date planEndAt, Date inforceAt, String createdBy, String assignedBy, String assignedTo, String assignedGroup, Integer priority, Integer progress, String progressDesc, String offsetDesc, Integer taskResult, String taskResultDesc, String taskResultRemark, Integer score, String scoreReason, String remark, Date updatedAt, String updatedBy) {
        this.taskId = taskId;
        this.userMainId = userMainId;
        this.projectId = projectId;
        this.taskName = taskName;
        this.taskContent = taskContent;
        this.taskDataPk = taskDataPk;
        this.taskType = taskType;
        this.taskState = taskState;
        this.parentTaskId = parentTaskId;
        this.createdAt = createdAt;
        this.planStartAt = planStartAt;
        this.planEndAt = planEndAt;
        this.inforceAt = inforceAt;
        this.createdBy = createdBy;
        this.assignedBy = assignedBy;
        this.assignedTo = assignedTo;
        this.assignedGroup = assignedGroup;
        this.priority = priority;
        this.progress = progress;
        this.progressDesc = progressDesc;
        this.offsetDesc = offsetDesc;
        this.taskResult = taskResult;
        this.taskResultDesc = taskResultDesc;
        this.taskResultRemark = taskResultRemark;
        this.score = score;
        this.scoreReason = scoreReason;
        this.remark = remark;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblTask() {
        super();
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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
    }

    public Long getTaskDataPk() {
        return taskDataPk;
    }

    public void setTaskDataPk(Long taskDataPk) {
        this.taskDataPk = taskDataPk;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public Long getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(Long parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getPlanStartAt() {
        return planStartAt;
    }

    public void setPlanStartAt(Date planStartAt) {
        this.planStartAt = planStartAt;
    }

    public Date getPlanEndAt() {
        return planEndAt;
    }

    public void setPlanEndAt(Date planEndAt) {
        this.planEndAt = planEndAt;
    }

    public Date getInforceAt() {
        return inforceAt;
    }

    public void setInforceAt(Date inforceAt) {
        this.inforceAt = inforceAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
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

    public String getAssignedGroup() {
        return assignedGroup;
    }

    public void setAssignedGroup(String assignedGroup) {
        this.assignedGroup = assignedGroup == null ? null : assignedGroup.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getProgressDesc() {
        return progressDesc;
    }

    public void setProgressDesc(String progressDesc) {
        this.progressDesc = progressDesc == null ? null : progressDesc.trim();
    }

    public String getOffsetDesc() {
        return offsetDesc;
    }

    public void setOffsetDesc(String offsetDesc) {
        this.offsetDesc = offsetDesc == null ? null : offsetDesc.trim();
    }

    public Integer getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(Integer taskResult) {
        this.taskResult = taskResult;
    }

    public String getTaskResultDesc() {
        return taskResultDesc;
    }

    public void setTaskResultDesc(String taskResultDesc) {
        this.taskResultDesc = taskResultDesc == null ? null : taskResultDesc.trim();
    }

    public String getTaskResultRemark() {
        return taskResultRemark;
    }

    public void setTaskResultRemark(String taskResultRemark) {
        this.taskResultRemark = taskResultRemark == null ? null : taskResultRemark.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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