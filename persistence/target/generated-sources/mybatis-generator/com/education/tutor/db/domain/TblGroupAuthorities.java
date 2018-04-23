package com.education.tutor.db.domain;

public class TblGroupAuthorities {
    private Long groupId;

    private String authority;

    public TblGroupAuthorities(Long groupId, String authority) {
        this.groupId = groupId;
        this.authority = authority;
    }

    public TblGroupAuthorities() {
        super();
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }
}