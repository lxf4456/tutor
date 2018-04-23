package com.education.tutor.db.domain;

import java.util.Date;

public class TblProject {
    private Long projectId;

    private String projectDesc;

    private String projectNo;

    private String projectName;

    private String projectOrgArea;

    private Integer sourceType;

    private Long sourcePk;

    private String sourceNo;

    private String projectResult;

    private String projectStep;

    private String projectOwner;

    private String projectManager;

    private String projectTemp;

    private String projectBidUrl;

    private String projectSupplyUrl;

    private String projectQuotaUrl;

    private String projectContractUrl;

    private Integer projectType;

    private Date projectStart;

    private Date projectEnd;

    private Integer status;

    private String stateHistory;

    private Integer internationalTrade;

    private Integer projectTranType;

    private Date projectAlertDate;

    private String ownerRegion;

    private String createdBy;

    private Date createdAt;

    private Long socialGroupPk;

    private String updatedBy;

    private Date updatedAt;

    private Short delFlag;

    public TblProject(Long projectId, String projectDesc, String projectNo, String projectName, String projectOrgArea, Integer sourceType, Long sourcePk, String sourceNo, String projectResult, String projectStep, String projectOwner, String projectManager, String projectTemp, String projectBidUrl, String projectSupplyUrl, String projectQuotaUrl, String projectContractUrl, Integer projectType, Date projectStart, Date projectEnd, Integer status, String stateHistory, Integer internationalTrade, Integer projectTranType, Date projectAlertDate, String ownerRegion, String createdBy, Date createdAt, Long socialGroupPk, String updatedBy, Date updatedAt, Short delFlag) {
        this.projectId = projectId;
        this.projectDesc = projectDesc;
        this.projectNo = projectNo;
        this.projectName = projectName;
        this.projectOrgArea = projectOrgArea;
        this.sourceType = sourceType;
        this.sourcePk = sourcePk;
        this.sourceNo = sourceNo;
        this.projectResult = projectResult;
        this.projectStep = projectStep;
        this.projectOwner = projectOwner;
        this.projectManager = projectManager;
        this.projectTemp = projectTemp;
        this.projectBidUrl = projectBidUrl;
        this.projectSupplyUrl = projectSupplyUrl;
        this.projectQuotaUrl = projectQuotaUrl;
        this.projectContractUrl = projectContractUrl;
        this.projectType = projectType;
        this.projectStart = projectStart;
        this.projectEnd = projectEnd;
        this.status = status;
        this.stateHistory = stateHistory;
        this.internationalTrade = internationalTrade;
        this.projectTranType = projectTranType;
        this.projectAlertDate = projectAlertDate;
        this.ownerRegion = ownerRegion;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.socialGroupPk = socialGroupPk;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
        this.delFlag = delFlag;
    }

    public TblProject() {
        super();
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc == null ? null : projectDesc.trim();
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectOrgArea() {
        return projectOrgArea;
    }

    public void setProjectOrgArea(String projectOrgArea) {
        this.projectOrgArea = projectOrgArea == null ? null : projectOrgArea.trim();
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Long getSourcePk() {
        return sourcePk;
    }

    public void setSourcePk(Long sourcePk) {
        this.sourcePk = sourcePk;
    }

    public String getSourceNo() {
        return sourceNo;
    }

    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo == null ? null : sourceNo.trim();
    }

    public String getProjectResult() {
        return projectResult;
    }

    public void setProjectResult(String projectResult) {
        this.projectResult = projectResult == null ? null : projectResult.trim();
    }

    public String getProjectStep() {
        return projectStep;
    }

    public void setProjectStep(String projectStep) {
        this.projectStep = projectStep == null ? null : projectStep.trim();
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner == null ? null : projectOwner.trim();
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager == null ? null : projectManager.trim();
    }

    public String getProjectTemp() {
        return projectTemp;
    }

    public void setProjectTemp(String projectTemp) {
        this.projectTemp = projectTemp == null ? null : projectTemp.trim();
    }

    public String getProjectBidUrl() {
        return projectBidUrl;
    }

    public void setProjectBidUrl(String projectBidUrl) {
        this.projectBidUrl = projectBidUrl == null ? null : projectBidUrl.trim();
    }

    public String getProjectSupplyUrl() {
        return projectSupplyUrl;
    }

    public void setProjectSupplyUrl(String projectSupplyUrl) {
        this.projectSupplyUrl = projectSupplyUrl == null ? null : projectSupplyUrl.trim();
    }

    public String getProjectQuotaUrl() {
        return projectQuotaUrl;
    }

    public void setProjectQuotaUrl(String projectQuotaUrl) {
        this.projectQuotaUrl = projectQuotaUrl == null ? null : projectQuotaUrl.trim();
    }

    public String getProjectContractUrl() {
        return projectContractUrl;
    }

    public void setProjectContractUrl(String projectContractUrl) {
        this.projectContractUrl = projectContractUrl == null ? null : projectContractUrl.trim();
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public Date getProjectStart() {
        return projectStart;
    }

    public void setProjectStart(Date projectStart) {
        this.projectStart = projectStart;
    }

    public Date getProjectEnd() {
        return projectEnd;
    }

    public void setProjectEnd(Date projectEnd) {
        this.projectEnd = projectEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStateHistory() {
        return stateHistory;
    }

    public void setStateHistory(String stateHistory) {
        this.stateHistory = stateHistory == null ? null : stateHistory.trim();
    }

    public Integer getInternationalTrade() {
        return internationalTrade;
    }

    public void setInternationalTrade(Integer internationalTrade) {
        this.internationalTrade = internationalTrade;
    }

    public Integer getProjectTranType() {
        return projectTranType;
    }

    public void setProjectTranType(Integer projectTranType) {
        this.projectTranType = projectTranType;
    }

    public Date getProjectAlertDate() {
        return projectAlertDate;
    }

    public void setProjectAlertDate(Date projectAlertDate) {
        this.projectAlertDate = projectAlertDate;
    }

    public String getOwnerRegion() {
        return ownerRegion;
    }

    public void setOwnerRegion(String ownerRegion) {
        this.ownerRegion = ownerRegion == null ? null : ownerRegion.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getSocialGroupPk() {
        return socialGroupPk;
    }

    public void setSocialGroupPk(Long socialGroupPk) {
        this.socialGroupPk = socialGroupPk;
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

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
    }
}