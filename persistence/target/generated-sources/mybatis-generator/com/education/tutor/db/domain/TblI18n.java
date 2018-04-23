package com.education.tutor.db.domain;

import java.util.Date;

public class TblI18n {
    private Long i18nId;

    private String schemaName;

    private String tableName;

    private String fieldName;

    private Long pkValue;

    private String langName;

    private String value;

    private Date updatedAt;

    private String updatedBy;

    public TblI18n(Long i18nId, String schemaName, String tableName, String fieldName, Long pkValue, String langName, String value, Date updatedAt, String updatedBy) {
        this.i18nId = i18nId;
        this.schemaName = schemaName;
        this.tableName = tableName;
        this.fieldName = fieldName;
        this.pkValue = pkValue;
        this.langName = langName;
        this.value = value;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblI18n() {
        super();
    }

    public Long getI18nId() {
        return i18nId;
    }

    public void setI18nId(Long i18nId) {
        this.i18nId = i18nId;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName == null ? null : schemaName.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public Long getPkValue() {
        return pkValue;
    }

    public void setPkValue(Long pkValue) {
        this.pkValue = pkValue;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName == null ? null : langName.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}