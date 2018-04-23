package com.education.tutor.db.domain;

import java.util.Date;

public class TblUserFeedBack {
    private Long userFeedBackId;

    private Long userMainId;

    private String feedBackContent;

    private Short feedBackState;

    private String processBy;

    private String updatedBy;

    private Date updatedAt;

    public TblUserFeedBack(Long userFeedBackId, Long userMainId, String feedBackContent, Short feedBackState, String processBy, String updatedBy, Date updatedAt) {
        this.userFeedBackId = userFeedBackId;
        this.userMainId = userMainId;
        this.feedBackContent = feedBackContent;
        this.feedBackState = feedBackState;
        this.processBy = processBy;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblUserFeedBack() {
        super();
    }

    public Long getUserFeedBackId() {
        return userFeedBackId;
    }

    public void setUserFeedBackId(Long userFeedBackId) {
        this.userFeedBackId = userFeedBackId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public String getFeedBackContent() {
        return feedBackContent;
    }

    public void setFeedBackContent(String feedBackContent) {
        this.feedBackContent = feedBackContent == null ? null : feedBackContent.trim();
    }

    public Short getFeedBackState() {
        return feedBackState;
    }

    public void setFeedBackState(Short feedBackState) {
        this.feedBackState = feedBackState;
    }

    public String getProcessBy() {
        return processBy;
    }

    public void setProcessBy(String processBy) {
        this.processBy = processBy == null ? null : processBy.trim();
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