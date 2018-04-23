package com.education.tutor.db.domain;

import java.util.Date;

public class TblPartnerInfo {
    private Long partnerInfoId;

    private Date effectiveStart;

    private Date effectiveEnd;

    private Short delFlag;

    private Long upperId;

    private String updatedBy;

    private Long selfId;

    private Date updatedAt;

    private Date createdAt;

    public TblPartnerInfo(Long partnerInfoId, Date effectiveStart, Date effectiveEnd, Short delFlag, Long upperId, String updatedBy, Long selfId, Date updatedAt, Date createdAt) {
        this.partnerInfoId = partnerInfoId;
        this.effectiveStart = effectiveStart;
        this.effectiveEnd = effectiveEnd;
        this.delFlag = delFlag;
        this.upperId = upperId;
        this.updatedBy = updatedBy;
        this.selfId = selfId;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public TblPartnerInfo() {
        super();
    }

    public Long getPartnerInfoId() {
        return partnerInfoId;
    }

    public void setPartnerInfoId(Long partnerInfoId) {
        this.partnerInfoId = partnerInfoId;
    }

    public Date getEffectiveStart() {
        return effectiveStart;
    }

    public void setEffectiveStart(Date effectiveStart) {
        this.effectiveStart = effectiveStart;
    }

    public Date getEffectiveEnd() {
        return effectiveEnd;
    }

    public void setEffectiveEnd(Date effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
    }

    public Long getUpperId() {
        return upperId;
    }

    public void setUpperId(Long upperId) {
        this.upperId = upperId;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Long getSelfId() {
        return selfId;
    }

    public void setSelfId(Long selfId) {
        this.selfId = selfId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}