package com.education.tutor.db.domain;

import java.util.Date;

public class TblSocialGroup {
    private Long socialGroupId;

    private String socialGroupName;

    private String socialGroupAvatar;

    private String socialGroupDesc;

    private Short socialGroupType;

    private Long owner;

    private Long admin;

    private Integer status;

    private String createdBy;

    private Date createdAt;

    public TblSocialGroup(Long socialGroupId, String socialGroupName, String socialGroupAvatar, String socialGroupDesc, Short socialGroupType, Long owner, Long admin, Integer status, String createdBy, Date createdAt) {
        this.socialGroupId = socialGroupId;
        this.socialGroupName = socialGroupName;
        this.socialGroupAvatar = socialGroupAvatar;
        this.socialGroupDesc = socialGroupDesc;
        this.socialGroupType = socialGroupType;
        this.owner = owner;
        this.admin = admin;
        this.status = status;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }

    public TblSocialGroup() {
        super();
    }

    public Long getSocialGroupId() {
        return socialGroupId;
    }

    public void setSocialGroupId(Long socialGroupId) {
        this.socialGroupId = socialGroupId;
    }

    public String getSocialGroupName() {
        return socialGroupName;
    }

    public void setSocialGroupName(String socialGroupName) {
        this.socialGroupName = socialGroupName == null ? null : socialGroupName.trim();
    }

    public String getSocialGroupAvatar() {
        return socialGroupAvatar;
    }

    public void setSocialGroupAvatar(String socialGroupAvatar) {
        this.socialGroupAvatar = socialGroupAvatar == null ? null : socialGroupAvatar.trim();
    }

    public String getSocialGroupDesc() {
        return socialGroupDesc;
    }

    public void setSocialGroupDesc(String socialGroupDesc) {
        this.socialGroupDesc = socialGroupDesc == null ? null : socialGroupDesc.trim();
    }

    public Short getSocialGroupType() {
        return socialGroupType;
    }

    public void setSocialGroupType(Short socialGroupType) {
        this.socialGroupType = socialGroupType;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    public Long getAdmin() {
        return admin;
    }

    public void setAdmin(Long admin) {
        this.admin = admin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}