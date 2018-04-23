package com.education.tutor.db.domain;

import java.util.Date;

public class TblAccount {
    private Long accountId;

    private Long userMainId;

    private String govtIdNo;

    private Short govtIdType;

    private String bankName;

    private Integer bankAccountType;

    private String bankAccountName;

    private String bankAccountNo;

    private String bankAccountCountry;

    private String bankAccountAddress;

    private String bankAccountNameInter;

    private String bankAccountSwift;

    private String bankAccountSwiftInter;

    private String mobile;

    private String address;

    private Integer depositSum;

    private Integer depositBalance;

    private Integer rewardSum;

    private Integer rewardBalance;

    private Integer withdrawSum;

    private Integer withdrawBalance;

    private Integer payoutSum;

    private Integer payoutBalance;

    private Integer balance;

    private Date updatedAt;

    private String updatedBy;

    public TblAccount(Long accountId, Long userMainId, String govtIdNo, Short govtIdType, String bankName, Integer bankAccountType, String bankAccountName, String bankAccountNo, String bankAccountCountry, String bankAccountAddress, String bankAccountNameInter, String bankAccountSwift, String bankAccountSwiftInter, String mobile, String address, Integer depositSum, Integer depositBalance, Integer rewardSum, Integer rewardBalance, Integer withdrawSum, Integer withdrawBalance, Integer payoutSum, Integer payoutBalance, Integer balance, Date updatedAt, String updatedBy) {
        this.accountId = accountId;
        this.userMainId = userMainId;
        this.govtIdNo = govtIdNo;
        this.govtIdType = govtIdType;
        this.bankName = bankName;
        this.bankAccountType = bankAccountType;
        this.bankAccountName = bankAccountName;
        this.bankAccountNo = bankAccountNo;
        this.bankAccountCountry = bankAccountCountry;
        this.bankAccountAddress = bankAccountAddress;
        this.bankAccountNameInter = bankAccountNameInter;
        this.bankAccountSwift = bankAccountSwift;
        this.bankAccountSwiftInter = bankAccountSwiftInter;
        this.mobile = mobile;
        this.address = address;
        this.depositSum = depositSum;
        this.depositBalance = depositBalance;
        this.rewardSum = rewardSum;
        this.rewardBalance = rewardBalance;
        this.withdrawSum = withdrawSum;
        this.withdrawBalance = withdrawBalance;
        this.payoutSum = payoutSum;
        this.payoutBalance = payoutBalance;
        this.balance = balance;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblAccount() {
        super();
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public String getGovtIdNo() {
        return govtIdNo;
    }

    public void setGovtIdNo(String govtIdNo) {
        this.govtIdNo = govtIdNo == null ? null : govtIdNo.trim();
    }

    public Short getGovtIdType() {
        return govtIdType;
    }

    public void setGovtIdType(Short govtIdType) {
        this.govtIdType = govtIdType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Integer getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(Integer bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    public String getBankAccountCountry() {
        return bankAccountCountry;
    }

    public void setBankAccountCountry(String bankAccountCountry) {
        this.bankAccountCountry = bankAccountCountry == null ? null : bankAccountCountry.trim();
    }

    public String getBankAccountAddress() {
        return bankAccountAddress;
    }

    public void setBankAccountAddress(String bankAccountAddress) {
        this.bankAccountAddress = bankAccountAddress == null ? null : bankAccountAddress.trim();
    }

    public String getBankAccountNameInter() {
        return bankAccountNameInter;
    }

    public void setBankAccountNameInter(String bankAccountNameInter) {
        this.bankAccountNameInter = bankAccountNameInter == null ? null : bankAccountNameInter.trim();
    }

    public String getBankAccountSwift() {
        return bankAccountSwift;
    }

    public void setBankAccountSwift(String bankAccountSwift) {
        this.bankAccountSwift = bankAccountSwift == null ? null : bankAccountSwift.trim();
    }

    public String getBankAccountSwiftInter() {
        return bankAccountSwiftInter;
    }

    public void setBankAccountSwiftInter(String bankAccountSwiftInter) {
        this.bankAccountSwiftInter = bankAccountSwiftInter == null ? null : bankAccountSwiftInter.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getDepositSum() {
        return depositSum;
    }

    public void setDepositSum(Integer depositSum) {
        this.depositSum = depositSum;
    }

    public Integer getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(Integer depositBalance) {
        this.depositBalance = depositBalance;
    }

    public Integer getRewardSum() {
        return rewardSum;
    }

    public void setRewardSum(Integer rewardSum) {
        this.rewardSum = rewardSum;
    }

    public Integer getRewardBalance() {
        return rewardBalance;
    }

    public void setRewardBalance(Integer rewardBalance) {
        this.rewardBalance = rewardBalance;
    }

    public Integer getWithdrawSum() {
        return withdrawSum;
    }

    public void setWithdrawSum(Integer withdrawSum) {
        this.withdrawSum = withdrawSum;
    }

    public Integer getWithdrawBalance() {
        return withdrawBalance;
    }

    public void setWithdrawBalance(Integer withdrawBalance) {
        this.withdrawBalance = withdrawBalance;
    }

    public Integer getPayoutSum() {
        return payoutSum;
    }

    public void setPayoutSum(Integer payoutSum) {
        this.payoutSum = payoutSum;
    }

    public Integer getPayoutBalance() {
        return payoutBalance;
    }

    public void setPayoutBalance(Integer payoutBalance) {
        this.payoutBalance = payoutBalance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
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