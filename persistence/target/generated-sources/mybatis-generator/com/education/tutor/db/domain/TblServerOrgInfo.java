package com.education.tutor.db.domain;

import java.util.Date;

public class TblServerOrgInfo {
    private Long serverOrgInfoId;

    private String logoUrl;

    private String business;

    private String serverInfo;

    private String expertInfo;

    private String contactInformation;

    private String local;

    private String lang;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    private Integer dataRegionId;

    public TblServerOrgInfo(Long serverOrgInfoId, String logoUrl, String business, String serverInfo, String expertInfo, String contactInformation, String local, String lang, Date createdAt, Date updatedAt, String updatedBy, Integer dataRegionId) {
        this.serverOrgInfoId = serverOrgInfoId;
        this.logoUrl = logoUrl;
        this.business = business;
        this.serverInfo = serverInfo;
        this.expertInfo = expertInfo;
        this.contactInformation = contactInformation;
        this.local = local;
        this.lang = lang;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.dataRegionId = dataRegionId;
    }

    public TblServerOrgInfo() {
        super();
    }

    public Long getServerOrgInfoId() {
        return serverOrgInfoId;
    }

    public void setServerOrgInfoId(Long serverOrgInfoId) {
        this.serverOrgInfoId = serverOrgInfoId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo == null ? null : serverInfo.trim();
    }

    public String getExpertInfo() {
        return expertInfo;
    }

    public void setExpertInfo(String expertInfo) {
        this.expertInfo = expertInfo == null ? null : expertInfo.trim();
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation == null ? null : contactInformation.trim();
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local == null ? null : local.trim();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
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

    public Integer getDataRegionId() {
        return dataRegionId;
    }

    public void setDataRegionId(Integer dataRegionId) {
        this.dataRegionId = dataRegionId;
    }
}