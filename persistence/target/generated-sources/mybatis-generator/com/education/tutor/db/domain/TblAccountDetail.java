package com.education.tutor.db.domain;

import java.util.Date;

public class TblAccountDetail {
    private Long accountDetailId;

    private Long accountId;

    private Integer depositAmount;

    private Integer paymentAmount;

    private Integer rewardAmount;

    private Integer withdrawAmount;

    private Integer balance;

    private String channel;

    private String operationType;

    private String tranNo;

    private String orderNo;

    private Date updatedAt;

    private String updatedBy;

    public TblAccountDetail(Long accountDetailId, Long accountId, Integer depositAmount, Integer paymentAmount, Integer rewardAmount, Integer withdrawAmount, Integer balance, String channel, String operationType, String tranNo, String orderNo, Date updatedAt, String updatedBy) {
        this.accountDetailId = accountDetailId;
        this.accountId = accountId;
        this.depositAmount = depositAmount;
        this.paymentAmount = paymentAmount;
        this.rewardAmount = rewardAmount;
        this.withdrawAmount = withdrawAmount;
        this.balance = balance;
        this.channel = channel;
        this.operationType = operationType;
        this.tranNo = tranNo;
        this.orderNo = orderNo;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblAccountDetail() {
        super();
    }

    public Long getAccountDetailId() {
        return accountDetailId;
    }

    public void setAccountDetailId(Long accountDetailId) {
        this.accountDetailId = accountDetailId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Integer getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Integer depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getRewardAmount() {
        return rewardAmount;
    }

    public void setRewardAmount(Integer rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public Integer getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Integer withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    public String getTranNo() {
        return tranNo;
    }

    public void setTranNo(String tranNo) {
        this.tranNo = tranNo == null ? null : tranNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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