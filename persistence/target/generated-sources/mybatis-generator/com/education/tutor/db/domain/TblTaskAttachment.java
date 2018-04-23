package com.education.tutor.db.domain;

import java.util.Date;

public class TblTaskAttachment {
    private Long taskAttachmentId;

    private Long taskId;

    private Long taskExecutionId;

    private Long inTaskAttachmentId;

    private String attachmentDesc;

    private Short taskPrivateOwn;

    private Date updatedAt;

    private String updatedBy;

    public TblTaskAttachment(Long taskAttachmentId, Long taskId, Long taskExecutionId, Long inTaskAttachmentId, String attachmentDesc, Short taskPrivateOwn, Date updatedAt, String updatedBy) {
        this.taskAttachmentId = taskAttachmentId;
        this.taskId = taskId;
        this.taskExecutionId = taskExecutionId;
        this.inTaskAttachmentId = inTaskAttachmentId;
        this.attachmentDesc = attachmentDesc;
        this.taskPrivateOwn = taskPrivateOwn;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblTaskAttachment() {
        super();
    }

    public Long getTaskAttachmentId() {
        return taskAttachmentId;
    }

    public void setTaskAttachmentId(Long taskAttachmentId) {
        this.taskAttachmentId = taskAttachmentId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskExecutionId() {
        return taskExecutionId;
    }

    public void setTaskExecutionId(Long taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    public Long getInTaskAttachmentId() {
        return inTaskAttachmentId;
    }

    public void setInTaskAttachmentId(Long inTaskAttachmentId) {
        this.inTaskAttachmentId = inTaskAttachmentId;
    }

    public String getAttachmentDesc() {
        return attachmentDesc;
    }

    public void setAttachmentDesc(String attachmentDesc) {
        this.attachmentDesc = attachmentDesc == null ? null : attachmentDesc.trim();
    }

    public Short getTaskPrivateOwn() {
        return taskPrivateOwn;
    }

    public void setTaskPrivateOwn(Short taskPrivateOwn) {
        this.taskPrivateOwn = taskPrivateOwn;
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