package com.education.tutor.db.domain;

import java.util.Date;

public class TblDomainAuth {
    private Long domainAuthId;

    private Integer targetType;

    private Long targetPk;

    private String username;

    private String groupName;

    private Integer state;

    private Date effectFrom;

    private Date effectEnd;

    private Date updatedAt;

    private String updatedBy;

    public TblDomainAuth(Long domainAuthId, Integer targetType, Long targetPk, String username, String groupName, Integer state, Date effectFrom, Date effectEnd, Date updatedAt, String updatedBy) {
        this.domainAuthId = domainAuthId;
        this.targetType = targetType;
        this.targetPk = targetPk;
        this.username = username;
        this.groupName = groupName;
        this.state = state;
        this.effectFrom = effectFrom;
        this.effectEnd = effectEnd;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblDomainAuth() {
        super();
    }

    public Long getDomainAuthId() {
        return domainAuthId;
    }

    public void setDomainAuthId(Long domainAuthId) {
        this.domainAuthId = domainAuthId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getEffectFrom() {
        return effectFrom;
    }

    public void setEffectFrom(Date effectFrom) {
        this.effectFrom = effectFrom;
    }

    public Date getEffectEnd() {
        return effectEnd;
    }

    public void setEffectEnd(Date effectEnd) {
        this.effectEnd = effectEnd;
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