package com.education.tutor.db.domain;

public class TblAuthorities {
    private String username;

    private String authority;

    public TblAuthorities(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }

    public TblAuthorities() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }
}