package com.education.tutor.db.domain;

import java.util.Date;

public class TblNoticeBoard {
    private Long noticeBoardId;

    private String noticeDesc;

    private String noticeUrl;

    private Integer noticeState;

    private Integer noticeType;

    private Long targetPk;

    private Date effectiveStart;

    private Date effectiveEnd;

    private String updatedBy;

    private Date updatedAt;

    public TblNoticeBoard(Long noticeBoardId, String noticeDesc, String noticeUrl, Integer noticeState, Integer noticeType, Long targetPk, Date effectiveStart, Date effectiveEnd, String updatedBy, Date updatedAt) {
        this.noticeBoardId = noticeBoardId;
        this.noticeDesc = noticeDesc;
        this.noticeUrl = noticeUrl;
        this.noticeState = noticeState;
        this.noticeType = noticeType;
        this.targetPk = targetPk;
        this.effectiveStart = effectiveStart;
        this.effectiveEnd = effectiveEnd;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblNoticeBoard() {
        super();
    }

    public Long getNoticeBoardId() {
        return noticeBoardId;
    }

    public void setNoticeBoardId(Long noticeBoardId) {
        this.noticeBoardId = noticeBoardId;
    }

    public String getNoticeDesc() {
        return noticeDesc;
    }

    public void setNoticeDesc(String noticeDesc) {
        this.noticeDesc = noticeDesc == null ? null : noticeDesc.trim();
    }

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl == null ? null : noticeUrl.trim();
    }

    public Integer getNoticeState() {
        return noticeState;
    }

    public void setNoticeState(Integer noticeState) {
        this.noticeState = noticeState;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    public Long getTargetPk() {
        return targetPk;
    }

    public void setTargetPk(Long targetPk) {
        this.targetPk = targetPk;
    }

    public Date getEffectiveStart() {
        return effectiveStart;
    }

    public void setEffectiveStart(Date effectiveStart) {
        this.effectiveStart = effectiveStart;
    }

    public Date getEffectiveEnd() {
        return effectiveEnd;
    }

    public void setEffectiveEnd(Date effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
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