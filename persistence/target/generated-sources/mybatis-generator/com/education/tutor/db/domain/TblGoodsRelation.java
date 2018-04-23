package com.education.tutor.db.domain;

import java.util.Date;

public class TblGoodsRelation {
    private Long goodsRelationId;

    private Long goodsId;

    private Integer targetType;

    private Long targetPk;

    private Short delFlag;

    private String searchCode;

    private String projectNo;

    private Integer state;

    private Integer demandAmount;

    private Integer tranType;

    private Date updatedAt;

    private String updatedBy;

    private String projectJson;

    public TblGoodsRelation(Long goodsRelationId, Long goodsId, Integer targetType, Long targetPk, Short delFlag, String searchCode, String projectNo, Integer state, Integer demandAmount, Integer tranType, Date updatedAt, String updatedBy, String projectJson) {
        this.goodsRelationId = goodsRelationId;
        this.goodsId = goodsId;
        this.targetType = targetType;
        this.targetPk = targetPk;
        this.delFlag = delFlag;
        this.searchCode = searchCode;
        this.projectNo = projectNo;
        this.state = state;
        this.demandAmount = demandAmount;
        this.tranType = tranType;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.projectJson = projectJson;
    }

    public TblGoodsRelation() {
        super();
    }

    public Long getGoodsRelationId() {
        return goodsRelationId;
    }

    public void setGoodsRelationId(Long goodsRelationId) {
        this.goodsRelationId = goodsRelationId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Long getTargetPk() {
        return targetPk;
    }

    public void setTargetPk(Long targetPk) {
        this.targetPk = targetPk;
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
    }

    public String getSearchCode() {
        return searchCode;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode == null ? null : searchCode.trim();
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDemandAmount() {
        return demandAmount;
    }

    public void setDemandAmount(Integer demandAmount) {
        this.demandAmount = demandAmount;
    }

    public Integer getTranType() {
        return tranType;
    }

    public void setTranType(Integer tranType) {
        this.tranType = tranType;
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

    public String getProjectJson() {
        return projectJson;
    }

    public void setProjectJson(String projectJson) {
        this.projectJson = projectJson == null ? null : projectJson.trim();
    }
}