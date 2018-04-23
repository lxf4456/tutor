package com.education.tutor.db.domain;

import java.util.Date;

public class TblOrganizationBranch {
    private Long organizationBranchId;

    private Long organizationId;

    private String organizationName;

    private String url;

    private String logurl;

    private String lang;

    private Date cdate;

    public TblOrganizationBranch(Long organizationBranchId, Long organizationId, String organizationName, String url, String logurl, String lang, Date cdate) {
        this.organizationBranchId = organizationBranchId;
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.url = url;
        this.logurl = logurl;
        this.lang = lang;
        this.cdate = cdate;
    }

    public TblOrganizationBranch() {
        super();
    }

    public Long getOrganizationBranchId() {
        return organizationBranchId;
    }

    public void setOrganizationBranchId(Long organizationBranchId) {
        this.organizationBranchId = organizationBranchId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getLogurl() {
        return logurl;
    }

    public void setLogurl(String logurl) {
        this.logurl = logurl == null ? null : logurl.trim();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }
}