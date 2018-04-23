package com.education.tutor.db.domain;

import java.util.Date;

public class TblMessage {
    private Long messageId;

    private Long userMainId;

    private Long socialGroupId;

    private String messageContent;

    private Short messageType;

    private Long fromUserId;

    private Long fromGroupId;

    private Long toUserId;

    private Long toGroupId;

    private Integer status;

    private Date createdAt;

    private Date revokedAt;

    private Date updatedAt;

    private String updatedBy;

    public TblMessage(Long messageId, Long userMainId, Long socialGroupId, String messageContent, Short messageType, Long fromUserId, Long fromGroupId, Long toUserId, Long toGroupId, Integer status, Date createdAt, Date revokedAt, Date updatedAt, String updatedBy) {
        this.messageId = messageId;
        this.userMainId = userMainId;
        this.socialGroupId = socialGroupId;
        this.messageContent = messageContent;
        this.messageType = messageType;
        this.fromUserId = fromUserId;
        this.fromGroupId = fromGroupId;
        this.toUserId = toUserId;
        this.toGroupId = toGroupId;
        this.status = status;
        this.createdAt = createdAt;
        this.revokedAt = revokedAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblMessage() {
        super();
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getSocialGroupId() {
        return socialGroupId;
    }

    public void setSocialGroupId(Long socialGroupId) {
        this.socialGroupId = socialGroupId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public Short getMessageType() {
        return messageType;
    }

    public void setMessageType(Short messageType) {
        this.messageType = messageType;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getFromGroupId() {
        return fromGroupId;
    }

    public void setFromGroupId(Long fromGroupId) {
        this.fromGroupId = fromGroupId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public Long getToGroupId() {
        return toGroupId;
    }

    public void setToGroupId(Long toGroupId) {
        this.toGroupId = toGroupId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getRevokedAt() {
        return revokedAt;
    }

    public void setRevokedAt(Date revokedAt) {
        this.revokedAt = revokedAt;
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