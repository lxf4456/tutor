package com.education.tutor.db.domain;

import java.util.Date;

public class TblOrganization {
    private Long organizationId;

    private String orgCode;

    private String orgName;

    private String orgIndexUrl;

    private String orgLogoUrl;

    private String orgHomeCountry;

    private Short orgPriority;

    private Integer orgSizeLevel;

    private String orgHomeAddress;

    private String orgContactAddress;

    private String orgContactPerson;

    private String orgContactTelno;

    private String orgContactEmail;

    private String orgRoles;

    private Integer orgType;

    private String orgPath;

    private Long orgParentId;

    private Long orgLeaderId;

    private Integer orgLevel;

    private String reason;

    private Long owner;

    private Integer orgState;

    private String updatedBy;

    private Date updatedAt;

    public TblOrganization(Long organizationId, String orgCode, String orgName, String orgIndexUrl, String orgLogoUrl, String orgHomeCountry, Short orgPriority, Integer orgSizeLevel, String orgHomeAddress, String orgContactAddress, String orgContactPerson, String orgContactTelno, String orgContactEmail, String orgRoles, Integer orgType, String orgPath, Long orgParentId, Long orgLeaderId, Integer orgLevel, String reason, Long owner, Integer orgState, String updatedBy, Date updatedAt) {
        this.organizationId = organizationId;
        this.orgCode = orgCode;
        this.orgName = orgName;
        this.orgIndexUrl = orgIndexUrl;
        this.orgLogoUrl = orgLogoUrl;
        this.orgHomeCountry = orgHomeCountry;
        this.orgPriority = orgPriority;
        this.orgSizeLevel = orgSizeLevel;
        this.orgHomeAddress = orgHomeAddress;
        this.orgContactAddress = orgContactAddress;
        this.orgContactPerson = orgContactPerson;
        this.orgContactTelno = orgContactTelno;
        this.orgContactEmail = orgContactEmail;
        this.orgRoles = orgRoles;
        this.orgType = orgType;
        this.orgPath = orgPath;
        this.orgParentId = orgParentId;
        this.orgLeaderId = orgLeaderId;
        this.orgLevel = orgLevel;
        this.reason = reason;
        this.owner = owner;
        this.orgState = orgState;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblOrganization() {
        super();
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgIndexUrl() {
        return orgIndexUrl;
    }

    public void setOrgIndexUrl(String orgIndexUrl) {
        this.orgIndexUrl = orgIndexUrl == null ? null : orgIndexUrl.trim();
    }

    public String getOrgLogoUrl() {
        return orgLogoUrl;
    }

    public void setOrgLogoUrl(String orgLogoUrl) {
        this.orgLogoUrl = orgLogoUrl == null ? null : orgLogoUrl.trim();
    }

    public String getOrgHomeCountry() {
        return orgHomeCountry;
    }

    public void setOrgHomeCountry(String orgHomeCountry) {
        this.orgHomeCountry = orgHomeCountry == null ? null : orgHomeCountry.trim();
    }

    public Short getOrgPriority() {
        return orgPriority;
    }

    public void setOrgPriority(Short orgPriority) {
        this.orgPriority = orgPriority;
    }

    public Integer getOrgSizeLevel() {
        return orgSizeLevel;
    }

    public void setOrgSizeLevel(Integer orgSizeLevel) {
        this.orgSizeLevel = orgSizeLevel;
    }

    public String getOrgHomeAddress() {
        return orgHomeAddress;
    }

    public void setOrgHomeAddress(String orgHomeAddress) {
        this.orgHomeAddress = orgHomeAddress == null ? null : orgHomeAddress.trim();
    }

    public String getOrgContactAddress() {
        return orgContactAddress;
    }

    public void setOrgContactAddress(String orgContactAddress) {
        this.orgContactAddress = orgContactAddress == null ? null : orgContactAddress.trim();
    }

    public String getOrgContactPerson() {
        return orgContactPerson;
    }

    public void setOrgContactPerson(String orgContactPerson) {
        this.orgContactPerson = orgContactPerson == null ? null : orgContactPerson.trim();
    }

    public String getOrgContactTelno() {
        return orgContactTelno;
    }

    public void setOrgContactTelno(String orgContactTelno) {
        this.orgContactTelno = orgContactTelno == null ? null : orgContactTelno.trim();
    }

    public String getOrgContactEmail() {
        return orgContactEmail;
    }

    public void setOrgContactEmail(String orgContactEmail) {
        this.orgContactEmail = orgContactEmail == null ? null : orgContactEmail.trim();
    }

    public String getOrgRoles() {
        return orgRoles;
    }

    public void setOrgRoles(String orgRoles) {
        this.orgRoles = orgRoles == null ? null : orgRoles.trim();
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public String getOrgPath() {
        return orgPath;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath == null ? null : orgPath.trim();
    }

    public Long getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(Long orgParentId) {
        this.orgParentId = orgParentId;
    }

    public Long getOrgLeaderId() {
        return orgLeaderId;
    }

    public void setOrgLeaderId(Long orgLeaderId) {
        this.orgLeaderId = orgLeaderId;
    }

    public Integer getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    public Integer getOrgState() {
        return orgState;
    }

    public void setOrgState(Integer orgState) {
        this.orgState = orgState;
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