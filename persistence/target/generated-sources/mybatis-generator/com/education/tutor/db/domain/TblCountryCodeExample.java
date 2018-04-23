package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.List;

public class TblCountryCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCountryCodeExample() {
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

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryEnIsNull() {
            addCriterion("country_en is null");
            return (Criteria) this;
        }

        public Criteria andCountryEnIsNotNull() {
            addCriterion("country_en is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEnEqualTo(String value) {
            addCriterion("country_en =", value, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnNotEqualTo(String value) {
            addCriterion("country_en <>", value, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnGreaterThan(String value) {
            addCriterion("country_en >", value, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnGreaterThanOrEqualTo(String value) {
            addCriterion("country_en >=", value, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnLessThan(String value) {
            addCriterion("country_en <", value, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnLessThanOrEqualTo(String value) {
            addCriterion("country_en <=", value, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnLike(String value) {
            addCriterion("country_en like", value, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnNotLike(String value) {
            addCriterion("country_en not like", value, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnIn(List<String> values) {
            addCriterion("country_en in", values, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnNotIn(List<String> values) {
            addCriterion("country_en not in", values, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnBetween(String value1, String value2) {
            addCriterion("country_en between", value1, value2, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryEnNotBetween(String value1, String value2) {
            addCriterion("country_en not between", value1, value2, "countryEn");
            return (Criteria) this;
        }

        public Criteria andCountryCnIsNull() {
            addCriterion("country_cn is null");
            return (Criteria) this;
        }

        public Criteria andCountryCnIsNotNull() {
            addCriterion("country_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCnEqualTo(String value) {
            addCriterion("country_cn =", value, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnNotEqualTo(String value) {
            addCriterion("country_cn <>", value, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnGreaterThan(String value) {
            addCriterion("country_cn >", value, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnGreaterThanOrEqualTo(String value) {
            addCriterion("country_cn >=", value, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnLessThan(String value) {
            addCriterion("country_cn <", value, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnLessThanOrEqualTo(String value) {
            addCriterion("country_cn <=", value, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnLike(String value) {
            addCriterion("country_cn like", value, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnNotLike(String value) {
            addCriterion("country_cn not like", value, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnIn(List<String> values) {
            addCriterion("country_cn in", values, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnNotIn(List<String> values) {
            addCriterion("country_cn not in", values, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnBetween(String value1, String value2) {
            addCriterion("country_cn between", value1, value2, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryCnNotBetween(String value1, String value2) {
            addCriterion("country_cn not between", value1, value2, "countryCn");
            return (Criteria) this;
        }

        public Criteria andCountryLgIsNull() {
            addCriterion("country_lg is null");
            return (Criteria) this;
        }

        public Criteria andCountryLgIsNotNull() {
            addCriterion("country_lg is not null");
            return (Criteria) this;
        }

        public Criteria andCountryLgEqualTo(String value) {
            addCriterion("country_lg =", value, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgNotEqualTo(String value) {
            addCriterion("country_lg <>", value, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgGreaterThan(String value) {
            addCriterion("country_lg >", value, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgGreaterThanOrEqualTo(String value) {
            addCriterion("country_lg >=", value, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgLessThan(String value) {
            addCriterion("country_lg <", value, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgLessThanOrEqualTo(String value) {
            addCriterion("country_lg <=", value, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgLike(String value) {
            addCriterion("country_lg like", value, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgNotLike(String value) {
            addCriterion("country_lg not like", value, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgIn(List<String> values) {
            addCriterion("country_lg in", values, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgNotIn(List<String> values) {
            addCriterion("country_lg not in", values, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgBetween(String value1, String value2) {
            addCriterion("country_lg between", value1, value2, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryLgNotBetween(String value1, String value2) {
            addCriterion("country_lg not between", value1, value2, "countryLg");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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