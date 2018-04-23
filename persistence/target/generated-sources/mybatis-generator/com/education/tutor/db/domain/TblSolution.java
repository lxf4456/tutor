package com.education.tutor.db.domain;

import java.util.Date;

public class TblSolution {
    private Long solutionId;

    private Long userMainId;

    private Long projectId;

    private String solutionDesc;

    private Date solutionEndDate;

    private Integer solutionState;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    private String solutionContent;

    public TblSolution(Long solutionId, Long userMainId, Long projectId, String solutionDesc, Date solutionEndDate, Integer solutionState, Date createdAt, Date updatedAt, String updatedBy, String solutionContent) {
        this.solutionId = solutionId;
        this.userMainId = userMainId;
        this.projectId = projectId;
        this.solutionDesc = solutionDesc;
        this.solutionEndDate = solutionEndDate;
        this.solutionState = solutionState;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.solutionContent = solutionContent;
    }

    public TblSolution() {
        super();
    }

    public Long getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
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

    public String getSolutionDesc() {
        return solutionDesc;
    }

    public void setSolutionDesc(String solutionDesc) {
        this.solutionDesc = solutionDesc == null ? null : solutionDesc.trim();
    }

    public Date getSolutionEndDate() {
        return solutionEndDate;
    }

    public void setSolutionEndDate(Date solutionEndDate) {
        this.solutionEndDate = solutionEndDate;
    }

    public Integer getSolutionState() {
        return solutionState;
    }

    public void setSolutionState(Integer solutionState) {
        this.solutionState = solutionState;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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

    public String getSolutionContent() {
        return solutionContent;
    }

    public void setSolutionContent(String solutionContent) {
        this.solutionContent = solutionContent == null ? null : solutionContent.trim();
    }
}