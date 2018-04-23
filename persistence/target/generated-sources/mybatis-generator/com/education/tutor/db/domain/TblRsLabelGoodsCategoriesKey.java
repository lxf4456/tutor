package com.education.tutor.db.domain;

public class TblRsLabelGoodsCategoriesKey {
    private Long labelMainId;

    private Long goodsCategoriesId;

    public TblRsLabelGoodsCategoriesKey(Long labelMainId, Long goodsCategoriesId) {
        this.labelMainId = labelMainId;
        this.goodsCategoriesId = goodsCategoriesId;
    }

    public TblRsLabelGoodsCategoriesKey() {
        super();
    }

    public Long getLabelMainId() {
        return labelMainId;
    }

    public void setLabelMainId(Long labelMainId) {
        this.labelMainId = labelMainId;
    }

    public Long getGoodsCategoriesId() {
        return goodsCategoriesId;
    }

    public void setGoodsCategoriesId(Long goodsCategoriesId) {
        this.goodsCategoriesId = goodsCategoriesId;
    }
}