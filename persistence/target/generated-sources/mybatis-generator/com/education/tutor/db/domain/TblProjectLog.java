package com.education.tutor.db.domain;

import java.util.Date;

public class TblProjectLog {
    private Long projectLogId;

    private Long projectId;

    private String projectStep;

    private Integer projectStepType;

    private Date projectStepStart;

    private Date projectStepEnd;

    private Integer score;

    private String scoreReason;

    private String userActivityResult;

    private String updatedBy;

    private Date updatedAt;

    public TblProjectLog(Long projectLogId, Long projectId, String projectStep, Integer projectStepType, Date projectStepStart, Date projectStepEnd, Integer score, String scoreReason, String userActivityResult, String updatedBy, Date updatedAt) {
        this.projectLogId = projectLogId;
        this.projectId = projectId;
        this.projectStep = projectStep;
        this.projectStepType = projectStepType;
        this.projectStepStart = projectStepStart;
        this.projectStepEnd = projectStepEnd;
        this.score = score;
        this.scoreReason = scoreReason;
        this.userActivityResult = userActivityResult;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblProjectLog() {
        super();
    }

    public Long getProjectLogId() {
        return projectLogId;
    }

    public void setProjectLogId(Long projectLogId) {
        this.projectLogId = projectLogId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectStep() {
        return projectStep;
    }

    public void setProjectStep(String projectStep) {
        this.projectStep = projectStep == null ? null : projectStep.trim();
    }

    public Integer getProjectStepType() {
        return projectStepType;
    }

    public void setProjectStepType(Integer projectStepType) {
        this.projectStepType = projectStepType;
    }

    public Date getProjectStepStart() {
        return projectStepStart;
    }

    public void setProjectStepStart(Date projectStepStart) {
        this.projectStepStart = projectStepStart;
    }

    public Date getProjectStepEnd() {
        return projectStepEnd;
    }

    public void setProjectStepEnd(Date projectStepEnd) {
        this.projectStepEnd = projectStepEnd;
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

    public String getUserActivityResult() {
        return userActivityResult;
    }

    public void setUserActivityResult(String userActivityResult) {
        this.userActivityResult = userActivityResult == null ? null : userActivityResult.trim();
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