package com.education.tutor.db.domain;

public class TblRsUserOrganizationKey {
    private Long organizationId;

    private Long userMainId;

    public TblRsUserOrganizationKey(Long organizationId, Long userMainId) {
        this.organizationId = organizationId;
        this.userMainId = userMainId;
    }

    public TblRsUserOrganizationKey() {
        super();
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }
}