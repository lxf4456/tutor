package com.education.tutor.db.domain;

import java.util.Date;

public class TblUserSocialGroup {
    private Long userSocialGroupId;

    private Long userMainId;

    private Long socialGroupId;

    private Long socialGroupRef;

    private String roleName;

    private String userGroupRelation;

    private String userGroupNickName;

    private String groupUserNickName;

    private String userGroupRemark;

    private String inviteMessage;

    private String joinBy;

    private Integer status;

    private Date approvedAt;

    private String updatedBy;

    private Date updatedAt;

    public TblUserSocialGroup(Long userSocialGroupId, Long userMainId, Long socialGroupId, Long socialGroupRef, String roleName, String userGroupRelation, String userGroupNickName, String groupUserNickName, String userGroupRemark, String inviteMessage, String joinBy, Integer status, Date approvedAt, String updatedBy, Date updatedAt) {
        this.userSocialGroupId = userSocialGroupId;
        this.userMainId = userMainId;
        this.socialGroupId = socialGroupId;
        this.socialGroupRef = socialGroupRef;
        this.roleName = roleName;
        this.userGroupRelation = userGroupRelation;
        this.userGroupNickName = userGroupNickName;
        this.groupUserNickName = groupUserNickName;
        this.userGroupRemark = userGroupRemark;
        this.inviteMessage = inviteMessage;
        this.joinBy = joinBy;
        this.status = status;
        this.approvedAt = approvedAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblUserSocialGroup() {
        super();
    }

    public Long getUserSocialGroupId() {
        return userSocialGroupId;
    }

    public void setUserSocialGroupId(Long userSocialGroupId) {
        this.userSocialGroupId = userSocialGroupId;
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

    public Long getSocialGroupRef() {
        return socialGroupRef;
    }

    public void setSocialGroupRef(Long socialGroupRef) {
        this.socialGroupRef = socialGroupRef;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getUserGroupRelation() {
        return userGroupRelation;
    }

    public void setUserGroupRelation(String userGroupRelation) {
        this.userGroupRelation = userGroupRelation == null ? null : userGroupRelation.trim();
    }

    public String getUserGroupNickName() {
        return userGroupNickName;
    }

    public void setUserGroupNickName(String userGroupNickName) {
        this.userGroupNickName = userGroupNickName == null ? null : userGroupNickName.trim();
    }

    public String getGroupUserNickName() {
        return groupUserNickName;
    }

    public void setGroupUserNickName(String groupUserNickName) {
        this.groupUserNickName = groupUserNickName == null ? null : groupUserNickName.trim();
    }

    public String getUserGroupRemark() {
        return userGroupRemark;
    }

    public void setUserGroupRemark(String userGroupRemark) {
        this.userGroupRemark = userGroupRemark == null ? null : userGroupRemark.trim();
    }

    public String getInviteMessage() {
        return inviteMessage;
    }

    public void setInviteMessage(String inviteMessage) {
        this.inviteMessage = inviteMessage == null ? null : inviteMessage.trim();
    }

    public String getJoinBy() {
        return joinBy;
    }

    public void setJoinBy(String joinBy) {
        this.joinBy = joinBy == null ? null : joinBy.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt(Date approvedAt) {
        this.approvedAt = approvedAt;
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