package com.education.tutor.db.domain;

import java.util.Date;

public class TblBid {
    private Long bidId;

    private Long userMainId;

    private Long organizationId;

    private String bidTargetCategory;

    private String bidTargetName;

    private String bidClueDesc;

    private String bidLocation;

    private Short bidClueSource;

    private String bidClueOrg;

    private Short bidTranType;

    private String bidProcedure;

    private String bidNo;

    private Date planReplyTime;

    private Integer scope;

    private String ownerDept;

    private Short delFlag;

    private Integer status;

    private String stateHistory;

    private String bidSolutionRef;

    private String bidExtraInfo;

    private String estimatedPriceRange;

    private Integer currentRewordAmount;

    private String followedBy;

    private String contactMobile;

    private String contactEmail;

    private String ownerRegion;

    private String createdBy;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    public TblBid(Long bidId, Long userMainId, Long organizationId, String bidTargetCategory, String bidTargetName, String bidClueDesc, String bidLocation, Short bidClueSource, String bidClueOrg, Short bidTranType, String bidProcedure, String bidNo, Date planReplyTime, Integer scope, String ownerDept, Short delFlag, Integer status, String stateHistory, String bidSolutionRef, String bidExtraInfo, String estimatedPriceRange, Integer currentRewordAmount, String followedBy, String contactMobile, String contactEmail, String ownerRegion, String createdBy, Date createdAt, Date updatedAt, String updatedBy) {
        this.bidId = bidId;
        this.userMainId = userMainId;
        this.organizationId = organizationId;
        this.bidTargetCategory = bidTargetCategory;
        this.bidTargetName = bidTargetName;
        this.bidClueDesc = bidClueDesc;
        this.bidLocation = bidLocation;
        this.bidClueSource = bidClueSource;
        this.bidClueOrg = bidClueOrg;
        this.bidTranType = bidTranType;
        this.bidProcedure = bidProcedure;
        this.bidNo = bidNo;
        this.planReplyTime = planReplyTime;
        this.scope = scope;
        this.ownerDept = ownerDept;
        this.delFlag = delFlag;
        this.status = status;
        this.stateHistory = stateHistory;
        this.bidSolutionRef = bidSolutionRef;
        this.bidExtraInfo = bidExtraInfo;
        this.estimatedPriceRange = estimatedPriceRange;
        this.currentRewordAmount = currentRewordAmount;
        this.followedBy = followedBy;
        this.contactMobile = contactMobile;
        this.contactEmail = contactEmail;
        this.ownerRegion = ownerRegion;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblBid() {
        super();
    }

    public Long getBidId() {
        return bidId;
    }

    public void setBidId(Long bidId) {
        this.bidId = bidId;
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

    public String getBidTargetCategory() {
        return bidTargetCategory;
    }

    public void setBidTargetCategory(String bidTargetCategory) {
        this.bidTargetCategory = bidTargetCategory == null ? null : bidTargetCategory.trim();
    }

    public String getBidTargetName() {
        return bidTargetName;
    }

    public void setBidTargetName(String bidTargetName) {
        this.bidTargetName = bidTargetName == null ? null : bidTargetName.trim();
    }

    public String getBidClueDesc() {
        return bidClueDesc;
    }

    public void setBidClueDesc(String bidClueDesc) {
        this.bidClueDesc = bidClueDesc == null ? null : bidClueDesc.trim();
    }

    public String getBidLocation() {
        return bidLocation;
    }

    public void setBidLocation(String bidLocation) {
        this.bidLocation = bidLocation == null ? null : bidLocation.trim();
    }

    public Short getBidClueSource() {
        return bidClueSource;
    }

    public void setBidClueSource(Short bidClueSource) {
        this.bidClueSource = bidClueSource;
    }

    public String getBidClueOrg() {
        return bidClueOrg;
    }

    public void setBidClueOrg(String bidClueOrg) {
        this.bidClueOrg = bidClueOrg == null ? null : bidClueOrg.trim();
    }

    public Short getBidTranType() {
        return bidTranType;
    }

    public void setBidTranType(Short bidTranType) {
        this.bidTranType = bidTranType;
    }

    public String getBidProcedure() {
        return bidProcedure;
    }

    public void setBidProcedure(String bidProcedure) {
        this.bidProcedure = bidProcedure == null ? null : bidProcedure.trim();
    }

    public String getBidNo() {
        return bidNo;
    }

    public void setBidNo(String bidNo) {
        this.bidNo = bidNo == null ? null : bidNo.trim();
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

    public String getBidSolutionRef() {
        return bidSolutionRef;
    }

    public void setBidSolutionRef(String bidSolutionRef) {
        this.bidSolutionRef = bidSolutionRef == null ? null : bidSolutionRef.trim();
    }

    public String getBidExtraInfo() {
        return bidExtraInfo;
    }

    public void setBidExtraInfo(String bidExtraInfo) {
        this.bidExtraInfo = bidExtraInfo == null ? null : bidExtraInfo.trim();
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