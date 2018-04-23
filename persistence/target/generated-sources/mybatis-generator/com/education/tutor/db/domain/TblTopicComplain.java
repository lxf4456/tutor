package com.education.tutor.db.domain;

import java.util.Date;

public class TblTopicComplain {
    private Long coId;

    private Integer coType;

    private Long coSourceid;

    private Date createat;

    private String createby;

    private Integer isSolve;

    private String coContent;

    private String soContent;

    private String soUser;

    private String coUser;

    public TblTopicComplain(Long coId, Integer coType, Long coSourceid, Date createat, String createby, Integer isSolve, String coContent, String soContent, String soUser, String coUser) {
        this.coId = coId;
        this.coType = coType;
        this.coSourceid = coSourceid;
        this.createat = createat;
        this.createby = createby;
        this.isSolve = isSolve;
        this.coContent = coContent;
        this.soContent = soContent;
        this.soUser = soUser;
        this.coUser = coUser;
    }

    public TblTopicComplain() {
        super();
    }

    public Long getCoId() {
        return coId;
    }

    public void setCoId(Long coId) {
        this.coId = coId;
    }

    public Integer getCoType() {
        return coType;
    }

    public void setCoType(Integer coType) {
        this.coType = coType;
    }

    public Long getCoSourceid() {
        return coSourceid;
    }

    public void setCoSourceid(Long coSourceid) {
        this.coSourceid = coSourceid;
    }

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Integer getIsSolve() {
        return isSolve;
    }

    public void setIsSolve(Integer isSolve) {
        this.isSolve = isSolve;
    }

    public String getCoContent() {
        return coContent;
    }

    public void setCoContent(String coContent) {
        this.coContent = coContent == null ? null : coContent.trim();
    }

    public String getSoContent() {
        return soContent;
    }

    public void setSoContent(String soContent) {
        this.soContent = soContent == null ? null : soContent.trim();
    }

    public String getSoUser() {
        return soUser;
    }

    public void setSoUser(String soUser) {
        this.soUser = soUser == null ? null : soUser.trim();
    }

    public String getCoUser() {
        return coUser;
    }

    public void setCoUser(String coUser) {
        this.coUser = coUser == null ? null : coUser.trim();
    }
}