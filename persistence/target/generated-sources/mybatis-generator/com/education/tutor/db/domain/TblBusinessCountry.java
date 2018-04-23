package com.education.tutor.db.domain;

import java.util.Date;

public class TblBusinessCountry {
    private Long businessCountryId;

    private Long dataRegionId;

    private Integer businessCountryType;

    private Integer tradeType;

    private Integer delFlag;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    public TblBusinessCountry(Long businessCountryId, Long dataRegionId, Integer businessCountryType, Integer tradeType, Integer delFlag, Date createdAt, Date updatedAt, String updatedBy) {
        this.businessCountryId = businessCountryId;
        this.dataRegionId = dataRegionId;
        this.businessCountryType = businessCountryType;
        this.tradeType = tradeType;
        this.delFlag = delFlag;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblBusinessCountry() {
        super();
    }

    public Long getBusinessCountryId() {
        return businessCountryId;
    }

    public void setBusinessCountryId(Long businessCountryId) {
        this.businessCountryId = businessCountryId;
    }

    public Long getDataRegionId() {
        return dataRegionId;
    }

    public void setDataRegionId(Long dataRegionId) {
        this.dataRegionId = dataRegionId;
    }

    public Integer getBusinessCountryType() {
        return businessCountryType;
    }

    public void setBusinessCountryType(Integer businessCountryType) {
        this.businessCountryType = businessCountryType;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
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