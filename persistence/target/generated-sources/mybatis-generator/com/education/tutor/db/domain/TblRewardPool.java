package com.education.tutor.db.domain;

import java.util.Date;

public class TblRewardPool {
    private Long rewardPoolId;

    private Long accountId;

    private Integer rewardType;

    private Integer rewardState;

    private Integer rewardAmount;

    private String rewardPurpose;

    private Date effectiveAt;

    private Date updatedAt;

    public TblRewardPool(Long rewardPoolId, Long accountId, Integer rewardType, Integer rewardState, Integer rewardAmount, String rewardPurpose, Date effectiveAt, Date updatedAt) {
        this.rewardPoolId = rewardPoolId;
        this.accountId = accountId;
        this.rewardType = rewardType;
        this.rewardState = rewardState;
        this.rewardAmount = rewardAmount;
        this.rewardPurpose = rewardPurpose;
        this.effectiveAt = effectiveAt;
        this.updatedAt = updatedAt;
    }

    public TblRewardPool() {
        super();
    }

    public Long getRewardPoolId() {
        return rewardPoolId;
    }

    public void setRewardPoolId(Long rewardPoolId) {
        this.rewardPoolId = rewardPoolId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getRewardState() {
        return rewardState;
    }

    public void setRewardState(Integer rewardState) {
        this.rewardState = rewardState;
    }

    public Integer getRewardAmount() {
        return rewardAmount;
    }

    public void setRewardAmount(Integer rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public String getRewardPurpose() {
        return rewardPurpose;
    }

    public void setRewardPurpose(String rewardPurpose) {
        this.rewardPurpose = rewardPurpose == null ? null : rewardPurpose.trim();
    }

    public Date getEffectiveAt() {
        return effectiveAt;
    }

    public void setEffectiveAt(Date effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}