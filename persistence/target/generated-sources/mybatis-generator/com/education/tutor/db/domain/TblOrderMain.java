package com.education.tutor.db.domain;

import java.util.Date;

public class TblOrderMain {
    private Long orderMainId;

    private Long userMainId;

    private Long rewardPoolId;

    private String orderNo;

    private Integer orderType;

    private Integer orderState;

    private Integer orderAmount;

    private String orderIssuedBy;

    private String orderTargetTo;

    private String orderContent;

    private Integer vocherState;

    private String vocherTitle;

    private Integer paymentState;

    private String paymentDesc;

    private Integer deliveryState;

    private String deliveryLocation;

    private String deliveryDesc;

    private String followup;

    private Date updatedAt;

    private String updatedBy;

    public TblOrderMain(Long orderMainId, Long userMainId, Long rewardPoolId, String orderNo, Integer orderType, Integer orderState, Integer orderAmount, String orderIssuedBy, String orderTargetTo, String orderContent, Integer vocherState, String vocherTitle, Integer paymentState, String paymentDesc, Integer deliveryState, String deliveryLocation, String deliveryDesc, String followup, Date updatedAt, String updatedBy) {
        this.orderMainId = orderMainId;
        this.userMainId = userMainId;
        this.rewardPoolId = rewardPoolId;
        this.orderNo = orderNo;
        this.orderType = orderType;
        this.orderState = orderState;
        this.orderAmount = orderAmount;
        this.orderIssuedBy = orderIssuedBy;
        this.orderTargetTo = orderTargetTo;
        this.orderContent = orderContent;
        this.vocherState = vocherState;
        this.vocherTitle = vocherTitle;
        this.paymentState = paymentState;
        this.paymentDesc = paymentDesc;
        this.deliveryState = deliveryState;
        this.deliveryLocation = deliveryLocation;
        this.deliveryDesc = deliveryDesc;
        this.followup = followup;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblOrderMain() {
        super();
    }

    public Long getOrderMainId() {
        return orderMainId;
    }

    public void setOrderMainId(Long orderMainId) {
        this.orderMainId = orderMainId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getRewardPoolId() {
        return rewardPoolId;
    }

    public void setRewardPoolId(Long rewardPoolId) {
        this.rewardPoolId = rewardPoolId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderIssuedBy() {
        return orderIssuedBy;
    }

    public void setOrderIssuedBy(String orderIssuedBy) {
        this.orderIssuedBy = orderIssuedBy == null ? null : orderIssuedBy.trim();
    }

    public String getOrderTargetTo() {
        return orderTargetTo;
    }

    public void setOrderTargetTo(String orderTargetTo) {
        this.orderTargetTo = orderTargetTo == null ? null : orderTargetTo.trim();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    public Integer getVocherState() {
        return vocherState;
    }

    public void setVocherState(Integer vocherState) {
        this.vocherState = vocherState;
    }

    public String getVocherTitle() {
        return vocherTitle;
    }

    public void setVocherTitle(String vocherTitle) {
        this.vocherTitle = vocherTitle == null ? null : vocherTitle.trim();
    }

    public Integer getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }

    public String getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc == null ? null : paymentDesc.trim();
    }

    public Integer getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(Integer deliveryState) {
        this.deliveryState = deliveryState;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation == null ? null : deliveryLocation.trim();
    }

    public String getDeliveryDesc() {
        return deliveryDesc;
    }

    public void setDeliveryDesc(String deliveryDesc) {
        this.deliveryDesc = deliveryDesc == null ? null : deliveryDesc.trim();
    }

    public String getFollowup() {
        return followup;
    }

    public void setFollowup(String followup) {
        this.followup = followup == null ? null : followup.trim();
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