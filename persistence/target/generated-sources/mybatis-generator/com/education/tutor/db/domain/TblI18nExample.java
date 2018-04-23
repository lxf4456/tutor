package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblI18nExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblI18nExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andI18nIdIsNull() {
            addCriterion("i18n_id is null");
            return (Criteria) this;
        }

        public Criteria andI18nIdIsNotNull() {
            addCriterion("i18n_id is not null");
            return (Criteria) this;
        }

        public Criteria andI18nIdEqualTo(Long value) {
            addCriterion("i18n_id =", value, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdNotEqualTo(Long value) {
            addCriterion("i18n_id <>", value, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdGreaterThan(Long value) {
            addCriterion("i18n_id >", value, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdGreaterThanOrEqualTo(Long value) {
            addCriterion("i18n_id >=", value, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdLessThan(Long value) {
            addCriterion("i18n_id <", value, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdLessThanOrEqualTo(Long value) {
            addCriterion("i18n_id <=", value, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdIn(List<Long> values) {
            addCriterion("i18n_id in", values, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdNotIn(List<Long> values) {
            addCriterion("i18n_id not in", values, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdBetween(Long value1, Long value2) {
            addCriterion("i18n_id between", value1, value2, "i18nId");
            return (Criteria) this;
        }

        public Criteria andI18nIdNotBetween(Long value1, Long value2) {
            addCriterion("i18n_id not between", value1, value2, "i18nId");
            return (Criteria) this;
        }

        public Criteria andSchemaNameIsNull() {
            addCriterion("schema_name is null");
            return (Criteria) this;
        }

        public Criteria andSchemaNameIsNotNull() {
            addCriterion("schema_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaNameEqualTo(String value) {
            addCriterion("schema_name =", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotEqualTo(String value) {
            addCriterion("schema_name <>", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameGreaterThan(String value) {
            addCriterion("schema_name >", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameGreaterThanOrEqualTo(String value) {
            addCriterion("schema_name >=", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLessThan(String value) {
            addCriterion("schema_name <", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLessThanOrEqualTo(String value) {
            addCriterion("schema_name <=", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLike(String value) {
            addCriterion("schema_name like", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotLike(String value) {
            addCriterion("schema_name not like", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameIn(List<String> values) {
            addCriterion("schema_name in", values, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotIn(List<String> values) {
            addCriterion("schema_name not in", values, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameBetween(String value1, String value2) {
            addCriterion("schema_name between", value1, value2, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotBetween(String value1, String value2) {
            addCriterion("schema_name not between", value1, value2, "schemaName");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("field_name is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("field_name is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("field_name =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("field_name <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("field_name >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("field_name >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("field_name <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("field_name <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("field_name like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("field_name not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("field_name in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("field_name not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("field_name between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("field_name not between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andPkValueIsNull() {
            addCriterion("pk_value is null");
            return (Criteria) this;
        }

        public Criteria andPkValueIsNotNull() {
            addCriterion("pk_value is not null");
            return (Criteria) this;
        }

        public Criteria andPkValueEqualTo(Long value) {
            addCriterion("pk_value =", value, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueNotEqualTo(Long value) {
            addCriterion("pk_value <>", value, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueGreaterThan(Long value) {
            addCriterion("pk_value >", value, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_value >=", value, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueLessThan(Long value) {
            addCriterion("pk_value <", value, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueLessThanOrEqualTo(Long value) {
            addCriterion("pk_value <=", value, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueIn(List<Long> values) {
            addCriterion("pk_value in", values, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueNotIn(List<Long> values) {
            addCriterion("pk_value not in", values, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueBetween(Long value1, Long value2) {
            addCriterion("pk_value between", value1, value2, "pkValue");
            return (Criteria) this;
        }

        public Criteria andPkValueNotBetween(Long value1, Long value2) {
            addCriterion("pk_value not between", value1, value2, "pkValue");
            return (Criteria) this;
        }

        public Criteria andLangNameIsNull() {
            addCriterion("lang_name is null");
            return (Criteria) this;
        }

        public Criteria andLangNameIsNotNull() {
            addCriterion("lang_name is not null");
            return (Criteria) this;
        }

        public Criteria andLangNameEqualTo(String value) {
            addCriterion("lang_name =", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameNotEqualTo(String value) {
            addCriterion("lang_name <>", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameGreaterThan(String value) {
            addCriterion("lang_name >", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameGreaterThanOrEqualTo(String value) {
            addCriterion("lang_name >=", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameLessThan(String value) {
            addCriterion("lang_name <", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameLessThanOrEqualTo(String value) {
            addCriterion("lang_name <=", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameLike(String value) {
            addCriterion("lang_name like", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameNotLike(String value) {
            addCriterion("lang_name not like", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameIn(List<String> values) {
            addCriterion("lang_name in", values, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameNotIn(List<String> values) {
            addCriterion("lang_name not in", values, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameBetween(String value1, String value2) {
            addCriterion("lang_name between", value1, value2, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameNotBetween(String value1, String value2) {
            addCriterion("lang_name not between", value1, value2, "langName");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}