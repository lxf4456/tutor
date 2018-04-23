package com.education.tutor.db.domain;

public class TblRsAttachment {
    private Long sourceId;

    private Long attachmentId;

    private Integer source;

    public TblRsAttachment(Long sourceId, Long attachmentId, Integer source) {
        this.sourceId = sourceId;
        this.attachmentId = attachmentId;
        this.source = source;
    }

    public TblRsAttachment() {
        super();
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}