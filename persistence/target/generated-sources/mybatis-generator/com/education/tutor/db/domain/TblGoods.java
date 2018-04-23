package com.education.tutor.db.domain;

import java.util.Date;

public class TblGoods {
    private Long goodsId;

    private Long userMainId;

    private Long goodsBrandId;

    private Long goodsCategoriesId;

    private Long goodsTypesId;

    private String goodsTitle;

    private String goodsName;

    private String goodsAbstract;

    private String goodsKeywords;

    private String goodsLangCode;

    private String goodsCode;

    private String supplierIdCode;

    private String goodsUrl;

    private String goodsViewJson;

    private Integer goodsAmount;

    private Integer goodsType;

    private Integer goodsStatus;

    private Integer goodsSource;

    private Integer goodsPurpose;

    private Integer stockState;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    private Integer goodsClose;

    private Integer goodsSold;

    public TblGoods(Long goodsId, Long userMainId, Long goodsBrandId, Long goodsCategoriesId, Long goodsTypesId, String goodsTitle, String goodsName, String goodsAbstract, String goodsKeywords, String goodsLangCode, String goodsCode, String supplierIdCode, String goodsUrl, String goodsViewJson, Integer goodsAmount, Integer goodsType, Integer goodsStatus, Integer goodsSource, Integer goodsPurpose, Integer stockState, Date createdAt, Date updatedAt, String updatedBy, Integer goodsClose, Integer goodsSold) {
        this.goodsId = goodsId;
        this.userMainId = userMainId;
        this.goodsBrandId = goodsBrandId;
        this.goodsCategoriesId = goodsCategoriesId;
        this.goodsTypesId = goodsTypesId;
        this.goodsTitle = goodsTitle;
        this.goodsName = goodsName;
        this.goodsAbstract = goodsAbstract;
        this.goodsKeywords = goodsKeywords;
        this.goodsLangCode = goodsLangCode;
        this.goodsCode = goodsCode;
        this.supplierIdCode = supplierIdCode;
        this.goodsUrl = goodsUrl;
        this.goodsViewJson = goodsViewJson;
        this.goodsAmount = goodsAmount;
        this.goodsType = goodsType;
        this.goodsStatus = goodsStatus;
        this.goodsSource = goodsSource;
        this.goodsPurpose = goodsPurpose;
        this.stockState = stockState;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.goodsClose = goodsClose;
        this.goodsSold = goodsSold;
    }

    public TblGoods() {
        super();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getGoodsBrandId() {
        return goodsBrandId;
    }

    public void setGoodsBrandId(Long goodsBrandId) {
        this.goodsBrandId = goodsBrandId;
    }

    public Long getGoodsCategoriesId() {
        return goodsCategoriesId;
    }

    public void setGoodsCategoriesId(Long goodsCategoriesId) {
        this.goodsCategoriesId = goodsCategoriesId;
    }

    public Long getGoodsTypesId() {
        return goodsTypesId;
    }

    public void setGoodsTypesId(Long goodsTypesId) {
        this.goodsTypesId = goodsTypesId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsAbstract() {
        return goodsAbstract;
    }

    public void setGoodsAbstract(String goodsAbstract) {
        this.goodsAbstract = goodsAbstract == null ? null : goodsAbstract.trim();
    }

    public String getGoodsKeywords() {
        return goodsKeywords;
    }

    public void setGoodsKeywords(String goodsKeywords) {
        this.goodsKeywords = goodsKeywords == null ? null : goodsKeywords.trim();
    }

    public String getGoodsLangCode() {
        return goodsLangCode;
    }

    public void setGoodsLangCode(String goodsLangCode) {
        this.goodsLangCode = goodsLangCode == null ? null : goodsLangCode.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getSupplierIdCode() {
        return supplierIdCode;
    }

    public void setSupplierIdCode(String supplierIdCode) {
        this.supplierIdCode = supplierIdCode == null ? null : supplierIdCode.trim();
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl == null ? null : goodsUrl.trim();
    }

    public String getGoodsViewJson() {
        return goodsViewJson;
    }

    public void setGoodsViewJson(String goodsViewJson) {
        this.goodsViewJson = goodsViewJson == null ? null : goodsViewJson.trim();
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsSource() {
        return goodsSource;
    }

    public void setGoodsSource(Integer goodsSource) {
        this.goodsSource = goodsSource;
    }

    public Integer getGoodsPurpose() {
        return goodsPurpose;
    }

    public void setGoodsPurpose(Integer goodsPurpose) {
        this.goodsPurpose = goodsPurpose;
    }

    public Integer getStockState() {
        return stockState;
    }

    public void setStockState(Integer stockState) {
        this.stockState = stockState;
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

    public Integer getGoodsClose() {
        return goodsClose;
    }

    public void setGoodsClose(Integer goodsClose) {
        this.goodsClose = goodsClose;
    }

    public Integer getGoodsSold() {
        return goodsSold;
    }

    public void setGoodsSold(Integer goodsSold) {
        this.goodsSold = goodsSold;
    }
}