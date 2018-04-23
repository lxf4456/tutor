package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblBusinessCountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblBusinessCountryExample() {
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

        public Criteria andBusinessCountryIdIsNull() {
            addCriterion("business_country_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdIsNotNull() {
            addCriterion("business_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdEqualTo(Long value) {
            addCriterion("business_country_id =", value, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdNotEqualTo(Long value) {
            addCriterion("business_country_id <>", value, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdGreaterThan(Long value) {
            addCriterion("business_country_id >", value, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_country_id >=", value, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdLessThan(Long value) {
            addCriterion("business_country_id <", value, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("business_country_id <=", value, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdIn(List<Long> values) {
            addCriterion("business_country_id in", values, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdNotIn(List<Long> values) {
            addCriterion("business_country_id not in", values, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdBetween(Long value1, Long value2) {
            addCriterion("business_country_id between", value1, value2, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("business_country_id not between", value1, value2, "businessCountryId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdIsNull() {
            addCriterion("data_region_id is null");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdIsNotNull() {
            addCriterion("data_region_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdEqualTo(Long value) {
            addCriterion("data_region_id =", value, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdNotEqualTo(Long value) {
            addCriterion("data_region_id <>", value, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdGreaterThan(Long value) {
            addCriterion("data_region_id >", value, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("data_region_id >=", value, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdLessThan(Long value) {
            addCriterion("data_region_id <", value, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdLessThanOrEqualTo(Long value) {
            addCriterion("data_region_id <=", value, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdIn(List<Long> values) {
            addCriterion("data_region_id in", values, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdNotIn(List<Long> values) {
            addCriterion("data_region_id not in", values, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdBetween(Long value1, Long value2) {
            addCriterion("data_region_id between", value1, value2, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andDataRegionIdNotBetween(Long value1, Long value2) {
            addCriterion("data_region_id not between", value1, value2, "dataRegionId");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeIsNull() {
            addCriterion("business_country_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeIsNotNull() {
            addCriterion("business_country_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeEqualTo(Integer value) {
            addCriterion("business_country_type =", value, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeNotEqualTo(Integer value) {
            addCriterion("business_country_type <>", value, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeGreaterThan(Integer value) {
            addCriterion("business_country_type >", value, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_country_type >=", value, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeLessThan(Integer value) {
            addCriterion("business_country_type <", value, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_country_type <=", value, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeIn(List<Integer> values) {
            addCriterion("business_country_type in", values, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeNotIn(List<Integer> values) {
            addCriterion("business_country_type not in", values, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_country_type between", value1, value2, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCountryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_country_type not between", value1, value2, "businessCountryType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Integer value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Integer value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Integer value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Integer value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Integer> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Integer> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
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