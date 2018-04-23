package com.education.tutor.db.domain;

import java.util.Date;

public class TblAttachment {
    private Long attachmentId;

    private Integer attachmentType;

    private String originalFilename;

    private Integer attachmentState;

    private String mimeType;

    private String uriRelativel;

    private String uriSite;

    private Long size;

    private String metaInfo;

    private Integer ownerType;

    private Long ownerPk;

    private String updatedBy;

    private Date updatedAt;

    public TblAttachment(Long attachmentId, Integer attachmentType, String originalFilename, Integer attachmentState, String mimeType, String uriRelativel, String uriSite, Long size, String metaInfo, Integer ownerType, Long ownerPk, String updatedBy, Date updatedAt) {
        this.attachmentId = attachmentId;
        this.attachmentType = attachmentType;
        this.originalFilename = originalFilename;
        this.attachmentState = attachmentState;
        this.mimeType = mimeType;
        this.uriRelativel = uriRelativel;
        this.uriSite = uriSite;
        this.size = size;
        this.metaInfo = metaInfo;
        this.ownerType = ownerType;
        this.ownerPk = ownerPk;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblAttachment() {
        super();
    }

    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Integer getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(Integer attachmentType) {
        this.attachmentType = attachmentType;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename == null ? null : originalFilename.trim();
    }

    public Integer getAttachmentState() {
        return attachmentState;
    }

    public void setAttachmentState(Integer attachmentState) {
        this.attachmentState = attachmentState;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType == null ? null : mimeType.trim();
    }

    public String getUriRelativel() {
        return uriRelativel;
    }

    public void setUriRelativel(String uriRelativel) {
        this.uriRelativel = uriRelativel == null ? null : uriRelativel.trim();
    }

    public String getUriSite() {
        return uriSite;
    }

    public void setUriSite(String uriSite) {
        this.uriSite = uriSite == null ? null : uriSite.trim();
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo == null ? null : metaInfo.trim();
    }

    public Integer getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    public Long getOwnerPk() {
        return ownerPk;
    }

    public void setOwnerPk(Long ownerPk) {
        this.ownerPk = ownerPk;
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