package com.education.tutor.db.domain;

public class TblGroupMessageState {
    private Long groupMessageStateId;

    private Long userSocialGroupId;

    private Long messageId;

    private Integer status;

    public TblGroupMessageState(Long groupMessageStateId, Long userSocialGroupId, Long messageId, Integer status) {
        this.groupMessageStateId = groupMessageStateId;
        this.userSocialGroupId = userSocialGroupId;
        this.messageId = messageId;
        this.status = status;
    }

    public TblGroupMessageState() {
        super();
    }

    public Long getGroupMessageStateId() {
        return groupMessageStateId;
    }

    public void setGroupMessageStateId(Long groupMessageStateId) {
        this.groupMessageStateId = groupMessageStateId;
    }

    public Long getUserSocialGroupId() {
        return userSocialGroupId;
    }

    public void setUserSocialGroupId(Long userSocialGroupId) {
        this.userSocialGroupId = userSocialGroupId;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}