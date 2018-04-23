package com.education.tutor.db.domain;

import java.util.Date;

public class TblTopicSeo {
    private Long seoId;

    private String seoTitle;

    private Long labelMainId;

    private String seoKeywords;

    private String seoDescription;

    private Long seoLabelid;

    private Date seoCreateat;

    private String seoCreateby;

    private Integer seoState;

    public TblTopicSeo(Long seoId, String seoTitle, Long labelMainId, String seoKeywords, String seoDescription, Long seoLabelid, Date seoCreateat, String seoCreateby, Integer seoState) {
        this.seoId = seoId;
        this.seoTitle = seoTitle;
        this.labelMainId = labelMainId;
        this.seoKeywords = seoKeywords;
        this.seoDescription = seoDescription;
        this.seoLabelid = seoLabelid;
        this.seoCreateat = seoCreateat;
        this.seoCreateby = seoCreateby;
        this.seoState = seoState;
    }

    public TblTopicSeo() {
        super();
    }

    public Long getSeoId() {
        return seoId;
    }

    public void setSeoId(Long seoId) {
        this.seoId = seoId;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public Long getLabelMainId() {
        return labelMainId;
    }

    public void setLabelMainId(Long labelMainId) {
        this.labelMainId = labelMainId;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }

    public Long getSeoLabelid() {
        return seoLabelid;
    }

    public void setSeoLabelid(Long seoLabelid) {
        this.seoLabelid = seoLabelid;
    }

    public Date getSeoCreateat() {
        return seoCreateat;
    }

    public void setSeoCreateat(Date seoCreateat) {
        this.seoCreateat = seoCreateat;
    }

    public String getSeoCreateby() {
        return seoCreateby;
    }

    public void setSeoCreateby(String seoCreateby) {
        this.seoCreateby = seoCreateby == null ? null : seoCreateby.trim();
    }

    public Integer getSeoState() {
        return seoState;
    }

    public void setSeoState(Integer seoState) {
        this.seoState = seoState;
    }
}