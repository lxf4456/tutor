package com.education.tutor.db.domain;

import java.util.Date;

public class TblTopicSensitive {
    private Long seId;

    private String seValue;

    private Integer seState;

    private Date seCreateat;

    private String seCreateby;

    public TblTopicSensitive(Long seId, String seValue, Integer seState, Date seCreateat, String seCreateby) {
        this.seId = seId;
        this.seValue = seValue;
        this.seState = seState;
        this.seCreateat = seCreateat;
        this.seCreateby = seCreateby;
    }

    public TblTopicSensitive() {
        super();
    }

    public Long getSeId() {
        return seId;
    }

    public void setSeId(Long seId) {
        this.seId = seId;
    }

    public String getSeValue() {
        return seValue;
    }

    public void setSeValue(String seValue) {
        this.seValue = seValue == null ? null : seValue.trim();
    }

    public Integer getSeState() {
        return seState;
    }

    public void setSeState(Integer seState) {
        this.seState = seState;
    }

    public Date getSeCreateat() {
        return seCreateat;
    }

    public void setSeCreateat(Date seCreateat) {
        this.seCreateat = seCreateat;
    }

    public String getSeCreateby() {
        return seCreateby;
    }

    public void setSeCreateby(String seCreateby) {
        this.seCreateby = seCreateby == null ? null : seCreateby.trim();
    }
}