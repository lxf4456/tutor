package com.education.tutor.db.domain;

import java.util.Date;

public class TblLabelMain {
    private Long labelMainId;

    private String labelName;

    private String labelNameZh;

    private String labelCategoryZh;

    private String labelCategory;

    private Integer labelState;

    private String labelDesc;

    private String labelLang;

    private Integer labelType;

    private String labelAvatar;

    private Integer recommandLevel;

    private String updatedBy;

    private Date updatedAt;

    public TblLabelMain(Long labelMainId, String labelName, String labelNameZh, String labelCategoryZh, String labelCategory, Integer labelState, String labelDesc, String labelLang, Integer labelType, String labelAvatar, Integer recommandLevel, String updatedBy, Date updatedAt) {
        this.labelMainId = labelMainId;
        this.labelName = labelName;
        this.labelNameZh = labelNameZh;
        this.labelCategoryZh = labelCategoryZh;
        this.labelCategory = labelCategory;
        this.labelState = labelState;
        this.labelDesc = labelDesc;
        this.labelLang = labelLang;
        this.labelType = labelType;
        this.labelAvatar = labelAvatar;
        this.recommandLevel = recommandLevel;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblLabelMain() {
        super();
    }

    public Long getLabelMainId() {
        return labelMainId;
    }

    public void setLabelMainId(Long labelMainId) {
        this.labelMainId = labelMainId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public String getLabelNameZh() {
        return labelNameZh;
    }

    public void setLabelNameZh(String labelNameZh) {
        this.labelNameZh = labelNameZh == null ? null : labelNameZh.trim();
    }

    public String getLabelCategoryZh() {
        return labelCategoryZh;
    }

    public void setLabelCategoryZh(String labelCategoryZh) {
        this.labelCategoryZh = labelCategoryZh == null ? null : labelCategoryZh.trim();
    }

    public String getLabelCategory() {
        return labelCategory;
    }

    public void setLabelCategory(String labelCategory) {
        this.labelCategory = labelCategory == null ? null : labelCategory.trim();
    }

    public Integer getLabelState() {
        return labelState;
    }

    public void setLabelState(Integer labelState) {
        this.labelState = labelState;
    }

    public String getLabelDesc() {
        return labelDesc;
    }

    public void setLabelDesc(String labelDesc) {
        this.labelDesc = labelDesc == null ? null : labelDesc.trim();
    }

    public String getLabelLang() {
        return labelLang;
    }

    public void setLabelLang(String labelLang) {
        this.labelLang = labelLang == null ? null : labelLang.trim();
    }

    public Integer getLabelType() {
        return labelType;
    }

    public void setLabelType(Integer labelType) {
        this.labelType = labelType;
    }

    public String getLabelAvatar() {
        return labelAvatar;
    }

    public void setLabelAvatar(String labelAvatar) {
        this.labelAvatar = labelAvatar == null ? null : labelAvatar.trim();
    }

    public Integer getRecommandLevel() {
        return recommandLevel;
    }

    public void setRecommandLevel(Integer recommandLevel) {
        this.recommandLevel = recommandLevel;
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