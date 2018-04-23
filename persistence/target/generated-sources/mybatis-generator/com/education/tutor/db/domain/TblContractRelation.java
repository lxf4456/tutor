package com.education.tutor.db.domain;

import java.util.Date;

public class TblContractRelation {
    private Long contractRelationId;

    private Long contractId;

    private Integer relationType;

    private Long relationPk;

    private String relationDescription;

    private Integer relationState;

    private String remark;

    private String updatedBy;

    private Date updatedAt;

    public TblContractRelation(Long contractRelationId, Long contractId, Integer relationType, Long relationPk, String relationDescription, Integer relationState, String remark, String updatedBy, Date updatedAt) {
        this.contractRelationId = contractRelationId;
        this.contractId = contractId;
        this.relationType = relationType;
        this.relationPk = relationPk;
        this.relationDescription = relationDescription;
        this.relationState = relationState;
        this.remark = remark;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblContractRelation() {
        super();
    }

    public Long getContractRelationId() {
        return contractRelationId;
    }

    public void setContractRelationId(Long contractRelationId) {
        this.contractRelationId = contractRelationId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Integer getRelationType() {
        return relationType;
    }

    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    public Long getRelationPk() {
        return relationPk;
    }

    public void setRelationPk(Long relationPk) {
        this.relationPk = relationPk;
    }

    public String getRelationDescription() {
        return relationDescription;
    }

    public void setRelationDescription(String relationDescription) {
        this.relationDescription = relationDescription == null ? null : relationDescription.trim();
    }

    public Integer getRelationState() {
        return relationState;
    }

    public void setRelationState(Integer relationState) {
        this.relationState = relationState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}