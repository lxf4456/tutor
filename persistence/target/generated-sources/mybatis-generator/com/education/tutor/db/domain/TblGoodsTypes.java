package com.education.tutor.db.domain;

import java.util.Date;

public class TblGoodsTypes {
    private Long goodsTypesId;

    private Long userMainId;

    private Long goodsCategoriesId;

    private String typesName;

    private String typesCode;

    private String typesLangCode;

    private Integer typesStatus;

    private String typesContent;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    public TblGoodsTypes(Long goodsTypesId, Long userMainId, Long goodsCategoriesId, String typesName, String typesCode, String typesLangCode, Integer typesStatus, String typesContent, Date createdAt, Date updatedAt, String updatedBy) {
        this.goodsTypesId = goodsTypesId;
        this.userMainId = userMainId;
        this.goodsCategoriesId = goodsCategoriesId;
        this.typesName = typesName;
        this.typesCode = typesCode;
        this.typesLangCode = typesLangCode;
        this.typesStatus = typesStatus;
        this.typesContent = typesContent;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblGoodsTypes() {
        super();
    }

    public Long getGoodsTypesId() {
        return goodsTypesId;
    }

    public void setGoodsTypesId(Long goodsTypesId) {
        this.goodsTypesId = goodsTypesId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getGoodsCategoriesId() {
        return goodsCategoriesId;
    }

    public void setGoodsCategoriesId(Long goodsCategoriesId) {
        this.goodsCategoriesId = goodsCategoriesId;
    }

    public String getTypesName() {
        return typesName;
    }

    public void setTypesName(String typesName) {
        this.typesName = typesName == null ? null : typesName.trim();
    }

    public String getTypesCode() {
        return typesCode;
    }

    public void setTypesCode(String typesCode) {
        this.typesCode = typesCode == null ? null : typesCode.trim();
    }

    public String getTypesLangCode() {
        return typesLangCode;
    }

    public void setTypesLangCode(String typesLangCode) {
        this.typesLangCode = typesLangCode == null ? null : typesLangCode.trim();
    }

    public Integer getTypesStatus() {
        return typesStatus;
    }

    public void setTypesStatus(Integer typesStatus) {
        this.typesStatus = typesStatus;
    }

    public String getTypesContent() {
        return typesContent;
    }

    public void setTypesContent(String typesContent) {
        this.typesContent = typesContent == null ? null : typesContent.trim();
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