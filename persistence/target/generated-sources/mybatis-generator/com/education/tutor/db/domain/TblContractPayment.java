package com.education.tutor.db.domain;

import java.util.Date;

public class TblContractPayment {
    private Long contractPaymentId;

    private Long contractId;

    private String seqNo;

    private Integer paymentType;

    private Long commissionSourcePk;

    private Integer commissionLevel;

    private Long targetPk;

    private Integer currency;

    private Integer itemCount;

    private Integer exchangeRatio;

    private String description;

    private Date billDate;

    private String remark;

    private Integer feeCharged;

    private Integer paymentMethod;

    private Integer status;

    private Date updatedAt;

    private String updatedBy;

    public TblContractPayment(Long contractPaymentId, Long contractId, String seqNo, Integer paymentType, Long commissionSourcePk, Integer commissionLevel, Long targetPk, Integer currency, Integer itemCount, Integer exchangeRatio, String description, Date billDate, String remark, Integer feeCharged, Integer paymentMethod, Integer status, Date updatedAt, String updatedBy) {
        this.contractPaymentId = contractPaymentId;
        this.contractId = contractId;
        this.seqNo = seqNo;
        this.paymentType = paymentType;
        this.commissionSourcePk = commissionSourcePk;
        this.commissionLevel = commissionLevel;
        this.targetPk = targetPk;
        this.currency = currency;
        this.itemCount = itemCount;
        this.exchangeRatio = exchangeRatio;
        this.description = description;
        this.billDate = billDate;
        this.remark = remark;
        this.feeCharged = feeCharged;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblContractPayment() {
        super();
    }

    public Long getContractPaymentId() {
        return contractPaymentId;
    }

    public void setContractPaymentId(Long contractPaymentId) {
        this.contractPaymentId = contractPaymentId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Long getCommissionSourcePk() {
        return commissionSourcePk;
    }

    public void setCommissionSourcePk(Long commissionSourcePk) {
        this.commissionSourcePk = commissionSourcePk;
    }

    public Integer getCommissionLevel() {
        return commissionLevel;
    }

    public void setCommissionLevel(Integer commissionLevel) {
        this.commissionLevel = commissionLevel;
    }

    public Long getTargetPk() {
        return targetPk;
    }

    public void setTargetPk(Long targetPk) {
        this.targetPk = targetPk;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getExchangeRatio() {
        return exchangeRatio;
    }

    public void setExchangeRatio(Integer exchangeRatio) {
        this.exchangeRatio = exchangeRatio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFeeCharged() {
        return feeCharged;
    }

    public void setFeeCharged(Integer feeCharged) {
        this.feeCharged = feeCharged;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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