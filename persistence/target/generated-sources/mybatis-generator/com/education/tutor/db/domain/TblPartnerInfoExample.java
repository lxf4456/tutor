package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblPartnerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblPartnerInfoExample() {
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

        public Criteria andPartnerInfoIdIsNull() {
            addCriterion("partner_info_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdIsNotNull() {
            addCriterion("partner_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdEqualTo(Long value) {
            addCriterion("partner_info_id =", value, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdNotEqualTo(Long value) {
            addCriterion("partner_info_id <>", value, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdGreaterThan(Long value) {
            addCriterion("partner_info_id >", value, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("partner_info_id >=", value, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdLessThan(Long value) {
            addCriterion("partner_info_id <", value, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("partner_info_id <=", value, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdIn(List<Long> values) {
            addCriterion("partner_info_id in", values, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdNotIn(List<Long> values) {
            addCriterion("partner_info_id not in", values, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdBetween(Long value1, Long value2) {
            addCriterion("partner_info_id between", value1, value2, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("partner_info_id not between", value1, value2, "partnerInfoId");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartIsNull() {
            addCriterion("effective_start is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartIsNotNull() {
            addCriterion("effective_start is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartEqualTo(Date value) {
            addCriterion("effective_start =", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartNotEqualTo(Date value) {
            addCriterion("effective_start <>", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartGreaterThan(Date value) {
            addCriterion("effective_start >", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_start >=", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartLessThan(Date value) {
            addCriterion("effective_start <", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartLessThanOrEqualTo(Date value) {
            addCriterion("effective_start <=", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartIn(List<Date> values) {
            addCriterion("effective_start in", values, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartNotIn(List<Date> values) {
            addCriterion("effective_start not in", values, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartBetween(Date value1, Date value2) {
            addCriterion("effective_start between", value1, value2, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartNotBetween(Date value1, Date value2) {
            addCriterion("effective_start not between", value1, value2, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndIsNull() {
            addCriterion("effective_end is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndIsNotNull() {
            addCriterion("effective_end is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndEqualTo(Date value) {
            addCriterion("effective_end =", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndNotEqualTo(Date value) {
            addCriterion("effective_end <>", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndGreaterThan(Date value) {
            addCriterion("effective_end >", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_end >=", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndLessThan(Date value) {
            addCriterion("effective_end <", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndLessThanOrEqualTo(Date value) {
            addCriterion("effective_end <=", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndIn(List<Date> values) {
            addCriterion("effective_end in", values, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndNotIn(List<Date> values) {
            addCriterion("effective_end not in", values, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndBetween(Date value1, Date value2) {
            addCriterion("effective_end between", value1, value2, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndNotBetween(Date value1, Date value2) {
            addCriterion("effective_end not between", value1, value2, "effectiveEnd");
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

        public Criteria andDelFlagEqualTo(Short value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Short value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Short value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Short value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Short value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Short> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Short> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Short value1, Short value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Short value1, Short value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andUpperIdIsNull() {
            addCriterion("upper_id is null");
            return (Criteria) this;
        }

        public Criteria andUpperIdIsNotNull() {
            addCriterion("upper_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpperIdEqualTo(Long value) {
            addCriterion("upper_id =", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdNotEqualTo(Long value) {
            addCriterion("upper_id <>", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdGreaterThan(Long value) {
            addCriterion("upper_id >", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("upper_id >=", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdLessThan(Long value) {
            addCriterion("upper_id <", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdLessThanOrEqualTo(Long value) {
            addCriterion("upper_id <=", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdIn(List<Long> values) {
            addCriterion("upper_id in", values, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdNotIn(List<Long> values) {
            addCriterion("upper_id not in", values, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdBetween(Long value1, Long value2) {
            addCriterion("upper_id between", value1, value2, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdNotBetween(Long value1, Long value2) {
            addCriterion("upper_id not between", value1, value2, "upperId");
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

        public Criteria andSelfIdIsNull() {
            addCriterion("self_id is null");
            return (Criteria) this;
        }

        public Criteria andSelfIdIsNotNull() {
            addCriterion("self_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelfIdEqualTo(Long value) {
            addCriterion("self_id =", value, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdNotEqualTo(Long value) {
            addCriterion("self_id <>", value, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdGreaterThan(Long value) {
            addCriterion("self_id >", value, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("self_id >=", value, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdLessThan(Long value) {
            addCriterion("self_id <", value, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdLessThanOrEqualTo(Long value) {
            addCriterion("self_id <=", value, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdIn(List<Long> values) {
            addCriterion("self_id in", values, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdNotIn(List<Long> values) {
            addCriterion("self_id not in", values, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdBetween(Long value1, Long value2) {
            addCriterion("self_id between", value1, value2, "selfId");
            return (Criteria) this;
        }

        public Criteria andSelfIdNotBetween(Long value1, Long value2) {
            addCriterion("self_id not between", value1, value2, "selfId");
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