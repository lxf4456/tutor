package com.education.tutor.db.domain;

import java.util.Date;

public class TblUserInteraction {
    private Long userInteractionId;

    private Long userMainId;

    private Integer targetType;

    private Long targetPk;

    private String targetUrl;

    private Integer interactionType;

    private String interactionValue;

    private Date interactionAt;

    private String shareOutTo;

    private String comments;

    private Integer revokeFlag;

    private Date updatedAt;

    private String updatedBy;

    private Long targetUserId;

    public TblUserInteraction(Long userInteractionId, Long userMainId, Integer targetType, Long targetPk, String targetUrl, Integer interactionType, String interactionValue, Date interactionAt, String shareOutTo, String comments, Integer revokeFlag, Date updatedAt, String updatedBy, Long targetUserId) {
        this.userInteractionId = userInteractionId;
        this.userMainId = userMainId;
        this.targetType = targetType;
        this.targetPk = targetPk;
        this.targetUrl = targetUrl;
        this.interactionType = interactionType;
        this.interactionValue = interactionValue;
        this.interactionAt = interactionAt;
        this.shareOutTo = shareOutTo;
        this.comments = comments;
        this.revokeFlag = revokeFlag;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.targetUserId = targetUserId;
    }

    public TblUserInteraction() {
        super();
    }

    public Long getUserInteractionId() {
        return userInteractionId;
    }

    public void setUserInteractionId(Long userInteractionId) {
        this.userInteractionId = userInteractionId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
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

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl == null ? null : targetUrl.trim();
    }

    public Integer getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(Integer interactionType) {
        this.interactionType = interactionType;
    }

    public String getInteractionValue() {
        return interactionValue;
    }

    public void setInteractionValue(String interactionValue) {
        this.interactionValue = interactionValue == null ? null : interactionValue.trim();
    }

    public Date getInteractionAt() {
        return interactionAt;
    }

    public void setInteractionAt(Date interactionAt) {
        this.interactionAt = interactionAt;
    }

    public String getShareOutTo() {
        return shareOutTo;
    }

    public void setShareOutTo(String shareOutTo) {
        this.shareOutTo = shareOutTo == null ? null : shareOutTo.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Integer getRevokeFlag() {
        return revokeFlag;
    }

    public void setRevokeFlag(Integer revokeFlag) {
        this.revokeFlag = revokeFlag;
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

    public Long getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
    }
}