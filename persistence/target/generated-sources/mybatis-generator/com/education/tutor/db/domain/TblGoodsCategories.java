package com.education.tutor.db.domain;

import java.util.Date;

public class TblGoodsCategories {
    private Long goodsCategoriesId;

    private Long userMainId;

    private String categoriesName;

    private String categoriesNameZh;

    private Long categoriesParentid;

    private Integer categoriesDepth;

    private String categoriesCode;

    private String categoriesLangCode;

    private Integer categoriesStatus;

    private Integer categoriesPriority;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    public TblGoodsCategories(Long goodsCategoriesId, Long userMainId, String categoriesName, String categoriesNameZh, Long categoriesParentid, Integer categoriesDepth, String categoriesCode, String categoriesLangCode, Integer categoriesStatus, Integer categoriesPriority, Date createdAt, Date updatedAt, String updatedBy) {
        this.goodsCategoriesId = goodsCategoriesId;
        this.userMainId = userMainId;
        this.categoriesName = categoriesName;
        this.categoriesNameZh = categoriesNameZh;
        this.categoriesParentid = categoriesParentid;
        this.categoriesDepth = categoriesDepth;
        this.categoriesCode = categoriesCode;
        this.categoriesLangCode = categoriesLangCode;
        this.categoriesStatus = categoriesStatus;
        this.categoriesPriority = categoriesPriority;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblGoodsCategories() {
        super();
    }

    public Long getGoodsCategoriesId() {
        return goodsCategoriesId;
    }

    public void setGoodsCategoriesId(Long goodsCategoriesId) {
        this.goodsCategoriesId = goodsCategoriesId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName == null ? null : categoriesName.trim();
    }

    public String getCategoriesNameZh() {
        return categoriesNameZh;
    }

    public void setCategoriesNameZh(String categoriesNameZh) {
        this.categoriesNameZh = categoriesNameZh == null ? null : categoriesNameZh.trim();
    }

    public Long getCategoriesParentid() {
        return categoriesParentid;
    }

    public void setCategoriesParentid(Long categoriesParentid) {
        this.categoriesParentid = categoriesParentid;
    }

    public Integer getCategoriesDepth() {
        return categoriesDepth;
    }

    public void setCategoriesDepth(Integer categoriesDepth) {
        this.categoriesDepth = categoriesDepth;
    }

    public String getCategoriesCode() {
        return categoriesCode;
    }

    public void setCategoriesCode(String categoriesCode) {
        this.categoriesCode = categoriesCode == null ? null : categoriesCode.trim();
    }

    public String getCategoriesLangCode() {
        return categoriesLangCode;
    }

    public void setCategoriesLangCode(String categoriesLangCode) {
        this.categoriesLangCode = categoriesLangCode == null ? null : categoriesLangCode.trim();
    }

    public Integer getCategoriesStatus() {
        return categoriesStatus;
    }

    public void setCategoriesStatus(Integer categoriesStatus) {
        this.categoriesStatus = categoriesStatus;
    }

    public Integer getCategoriesPriority() {
        return categoriesPriority;
    }

    public void setCategoriesPriority(Integer categoriesPriority) {
        this.categoriesPriority = categoriesPriority;
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