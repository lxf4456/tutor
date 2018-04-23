package com.education.tutor.db.domain;

import java.util.Date;

public class TblTaskDepend {
    private Long taskDependId;

    private Long taskId;

    private Long taskDependById;

    private Integer dependsType;

    private String updatedBy;

    private Date updatedAt;

    public TblTaskDepend(Long taskDependId, Long taskId, Long taskDependById, Integer dependsType, String updatedBy, Date updatedAt) {
        this.taskDependId = taskDependId;
        this.taskId = taskId;
        this.taskDependById = taskDependById;
        this.dependsType = dependsType;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblTaskDepend() {
        super();
    }

    public Long getTaskDependId() {
        return taskDependId;
    }

    public void setTaskDependId(Long taskDependId) {
        this.taskDependId = taskDependId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskDependById() {
        return taskDependById;
    }

    public void setTaskDependById(Long taskDependById) {
        this.taskDependById = taskDependById;
    }

    public Integer getDependsType() {
        return dependsType;
    }

    public void setDependsType(Integer dependsType) {
        this.dependsType = dependsType;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}