package com.education.tutor.db.domain;

import java.util.Date;

public class TblEnquiry {
    private Long enquiryId;

    private Long userMainId;

    private Long organizationId;

    private String seqno;

    private String name;

    private String enquiryExtraInfo;

    private Integer status;

    private String stateHistory;

    private Integer tranType;

    private String ownerRegion;

    private Integer delFlag;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    public TblEnquiry(Long enquiryId, Long userMainId, Long organizationId, String seqno, String name, String enquiryExtraInfo, Integer status, String stateHistory, Integer tranType, String ownerRegion, Integer delFlag, Date createdAt, String createdBy, Date updatedAt, String updatedBy) {
        this.enquiryId = enquiryId;
        this.userMainId = userMainId;
        this.organizationId = organizationId;
        this.seqno = seqno;
        this.name = name;
        this.enquiryExtraInfo = enquiryExtraInfo;
        this.status = status;
        this.stateHistory = stateHistory;
        this.tranType = tranType;
        this.ownerRegion = ownerRegion;
        this.delFlag = delFlag;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblEnquiry() {
        super();
    }

    public Long getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(Long enquiryId) {
        this.enquiryId = enquiryId;
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

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnquiryExtraInfo() {
        return enquiryExtraInfo;
    }

    public void setEnquiryExtraInfo(String enquiryExtraInfo) {
        this.enquiryExtraInfo = enquiryExtraInfo == null ? null : enquiryExtraInfo.trim();
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

    public Integer getTranType() {
        return tranType;
    }

    public void setTranType(Integer tranType) {
        this.tranType = tranType;
    }

    public String getOwnerRegion() {
        return ownerRegion;
    }

    public void setOwnerRegion(String ownerRegion) {
        this.ownerRegion = ownerRegion == null ? null : ownerRegion.trim();
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
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