package com.education.tutor.db.domain;

import java.util.Date;

public class TblGoodsBrand {
    private Long goodsBrandId;

    private Long userMainId;

    private String brandName;

    private Integer brandLevel;

    private String brandLogo;

    private String brandUrl;

    private String brandCode;

    private String brandLangCode;

    private Integer status;

    private Integer isHave;

    private String content;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    public TblGoodsBrand(Long goodsBrandId, Long userMainId, String brandName, Integer brandLevel, String brandLogo, String brandUrl, String brandCode, String brandLangCode, Integer status, Integer isHave, String content, Date createdAt, Date updatedAt, String updatedBy) {
        this.goodsBrandId = goodsBrandId;
        this.userMainId = userMainId;
        this.brandName = brandName;
        this.brandLevel = brandLevel;
        this.brandLogo = brandLogo;
        this.brandUrl = brandUrl;
        this.brandCode = brandCode;
        this.brandLangCode = brandLangCode;
        this.status = status;
        this.isHave = isHave;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblGoodsBrand() {
        super();
    }

    public Long getGoodsBrandId() {
        return goodsBrandId;
    }

    public void setGoodsBrandId(Long goodsBrandId) {
        this.goodsBrandId = goodsBrandId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getBrandLevel() {
        return brandLevel;
    }

    public void setBrandLevel(Integer brandLevel) {
        this.brandLevel = brandLevel;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo == null ? null : brandLogo.trim();
    }

    public String getBrandUrl() {
        return brandUrl;
    }

    public void setBrandUrl(String brandUrl) {
        this.brandUrl = brandUrl == null ? null : brandUrl.trim();
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public String getBrandLangCode() {
        return brandLangCode;
    }

    public void setBrandLangCode(String brandLangCode) {
        this.brandLangCode = brandLangCode == null ? null : brandLangCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsHave() {
        return isHave;
    }

    public void setIsHave(Integer isHave) {
        this.isHave = isHave;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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