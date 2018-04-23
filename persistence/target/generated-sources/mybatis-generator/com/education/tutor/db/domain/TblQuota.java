package com.education.tutor.db.domain;

import java.util.Date;

public class TblQuota {
    private Long quotaId;

    private Long userMainId;

    private Long organizationId;

    private Short quoteTargetCategory;

    private String quoteTargetName;

    private String quoteClueDesc;

    private String quoteLocation;

    private Short quoteClueSource;

    private String quoteClueOrg;

    private Short quoteTranType;

    private String quoteProcedure;

    private Double quoteGeoLng;

    private Double quoteGeoLat;

    private String quoteDocImg;

    private String quoteSolutionRef;

    private Date planReplyTime;

    private Integer scope;

    private String ownerRegion;

    private String ownerDept;

    private Short delFlag;

    private Integer status;

    private String stateHistory;

    private String estimatedPriceRange;

    private Integer currentRewordAmount;

    private String followedBy;

    private String contactMobile;

    private String contactEmail;

    private String quotaExtraInfo;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    public TblQuota(Long quotaId, Long userMainId, Long organizationId, Short quoteTargetCategory, String quoteTargetName, String quoteClueDesc, String quoteLocation, Short quoteClueSource, String quoteClueOrg, Short quoteTranType, String quoteProcedure, Double quoteGeoLng, Double quoteGeoLat, String quoteDocImg, String quoteSolutionRef, Date planReplyTime, Integer scope, String ownerRegion, String ownerDept, Short delFlag, Integer status, String stateHistory, String estimatedPriceRange, Integer currentRewordAmount, String followedBy, String contactMobile, String contactEmail, String quotaExtraInfo, Date createdAt, String createdBy, Date updatedAt, String updatedBy) {
        this.quotaId = quotaId;
        this.userMainId = userMainId;
        this.organizationId = organizationId;
        this.quoteTargetCategory = quoteTargetCategory;
        this.quoteTargetName = quoteTargetName;
        this.quoteClueDesc = quoteClueDesc;
        this.quoteLocation = quoteLocation;
        this.quoteClueSource = quoteClueSource;
        this.quoteClueOrg = quoteClueOrg;
        this.quoteTranType = quoteTranType;
        this.quoteProcedure = quoteProcedure;
        this.quoteGeoLng = quoteGeoLng;
        this.quoteGeoLat = quoteGeoLat;
        this.quoteDocImg = quoteDocImg;
        this.quoteSolutionRef = quoteSolutionRef;
        this.planReplyTime = planReplyTime;
        this.scope = scope;
        this.ownerRegion = ownerRegion;
        this.ownerDept = ownerDept;
        this.delFlag = delFlag;
        this.status = status;
        this.stateHistory = stateHistory;
        this.estimatedPriceRange = estimatedPriceRange;
        this.currentRewordAmount = currentRewordAmount;
        this.followedBy = followedBy;
        this.contactMobile = contactMobile;
        this.contactEmail = contactEmail;
        this.quotaExtraInfo = quotaExtraInfo;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblQuota() {
        super();
    }

    public Long getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(Long quotaId) {
        this.quotaId = quotaId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Short getQuoteTargetCategory() {
        return quoteTargetCategory;
    }

    public void setQuoteTargetCategory(Short quoteTargetCategory) {
        this.quoteTargetCategory = quoteTargetCategory;
    }

    public String getQuoteTargetName() {
        return quoteTargetName;
    }

    public void setQuoteTargetName(String quoteTargetName) {
        this.quoteTargetName = quoteTargetName == null ? null : quoteTargetName.trim();
    }

    public String getQuoteClueDesc() {
        return quoteClueDesc;
    }

    public void setQuoteClueDesc(String quoteClueDesc) {
        this.quoteClueDesc = quoteClueDesc == null ? null : quoteClueDesc.trim();
    }

    public String getQuoteLocation() {
        return quoteLocation;
    }

    public void setQuoteLocation(String quoteLocation) {
        this.quoteLocation = quoteLocation == null ? null : quoteLocation.trim();
    }

    public Short getQuoteClueSource() {
        return quoteClueSource;
    }

    public void setQuoteClueSource(Short quoteClueSource) {
        this.quoteClueSource = quoteClueSource;
    }

    public String getQuoteClueOrg() {
        return quoteClueOrg;
    }

    public void setQuoteClueOrg(String quoteClueOrg) {
        this.quoteClueOrg = quoteClueOrg == null ? null : quoteClueOrg.trim();
    }

    public Short getQuoteTranType() {
        return quoteTranType;
    }

    public void setQuoteTranType(Short quoteTranType) {
        this.quoteTranType = quoteTranType;
    }

    public String getQuoteProcedure() {
        return quoteProcedure;
    }

    public void setQuoteProcedure(String quoteProcedure) {
        this.quoteProcedure = quoteProcedure == null ? null : quoteProcedure.trim();
    }

    public Double getQuoteGeoLng() {
        return quoteGeoLng;
    }

    public void setQuoteGeoLng(Double quoteGeoLng) {
        this.quoteGeoLng = quoteGeoLng;
    }

    public Double getQuoteGeoLat() {
        return quoteGeoLat;
    }

    public void setQuoteGeoLat(Double quoteGeoLat) {
        this.quoteGeoLat = quoteGeoLat;
    }

    public String getQuoteDocImg() {
        return quoteDocImg;
    }

    public void setQuoteDocImg(String quoteDocImg) {
        this.quoteDocImg = quoteDocImg == null ? null : quoteDocImg.trim();
    }

    public String getQuoteSolutionRef() {
        return quoteSolutionRef;
    }

    public void setQuoteSolutionRef(String quoteSolutionRef) {
        this.quoteSolutionRef = quoteSolutionRef == null ? null : quoteSolutionRef.trim();
    }

    public Date getPlanReplyTime() {
        return planReplyTime;
    }

    public void setPlanReplyTime(Date planReplyTime) {
        this.planReplyTime = planReplyTime;
    }

    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public String getOwnerRegion() {
        return ownerRegion;
    }

    public void setOwnerRegion(String ownerRegion) {
        this.ownerRegion = ownerRegion == null ? null : ownerRegion.trim();
    }

    public String getOwnerDept() {
        return ownerDept;
    }

    public void setOwnerDept(String ownerDept) {
        this.ownerDept = ownerDept == null ? null : ownerDept.trim();
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
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

    public String getEstimatedPriceRange() {
        return estimatedPriceRange;
    }

    public void setEstimatedPriceRange(String estimatedPriceRange) {
        this.estimatedPriceRange = estimatedPriceRange == null ? null : estimatedPriceRange.trim();
    }

    public Integer getCurrentRewordAmount() {
        return currentRewordAmount;
    }

    public void setCurrentRewordAmount(Integer currentRewordAmount) {
        this.currentRewordAmount = currentRewordAmount;
    }

    public String getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(String followedBy) {
        this.followedBy = followedBy == null ? null : followedBy.trim();
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getQuotaExtraInfo() {
        return quotaExtraInfo;
    }

    public void setQuotaExtraInfo(String quotaExtraInfo) {
        this.quotaExtraInfo = quotaExtraInfo == null ? null : quotaExtraInfo.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
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