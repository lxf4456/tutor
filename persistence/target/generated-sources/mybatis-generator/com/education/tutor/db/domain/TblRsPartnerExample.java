package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.List;

public class TblRsPartnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRsPartnerExample() {
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

        public Criteria andUserMainIdIsNull() {
            addCriterion("user_main_id is null");
            return (Criteria) this;
        }

        public Criteria andUserMainIdIsNotNull() {
            addCriterion("user_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserMainIdEqualTo(Long value) {
            addCriterion("user_main_id =", value, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdNotEqualTo(Long value) {
            addCriterion("user_main_id <>", value, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdGreaterThan(Long value) {
            addCriterion("user_main_id >", value, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_main_id >=", value, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdLessThan(Long value) {
            addCriterion("user_main_id <", value, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdLessThanOrEqualTo(Long value) {
            addCriterion("user_main_id <=", value, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdIn(List<Long> values) {
            addCriterion("user_main_id in", values, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdNotIn(List<Long> values) {
            addCriterion("user_main_id not in", values, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdBetween(Long value1, Long value2) {
            addCriterion("user_main_id between", value1, value2, "userMainId");
            return (Criteria) this;
        }

        public Criteria andUserMainIdNotBetween(Long value1, Long value2) {
            addCriterion("user_main_id not between", value1, value2, "userMainId");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIsNull() {
            addCriterion("partner_info is null");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIsNotNull() {
            addCriterion("partner_info is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoEqualTo(Long value) {
            addCriterion("partner_info =", value, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoNotEqualTo(Long value) {
            addCriterion("partner_info <>", value, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoGreaterThan(Long value) {
            addCriterion("partner_info >", value, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoGreaterThanOrEqualTo(Long value) {
            addCriterion("partner_info >=", value, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoLessThan(Long value) {
            addCriterion("partner_info <", value, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoLessThanOrEqualTo(Long value) {
            addCriterion("partner_info <=", value, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoIn(List<Long> values) {
            addCriterion("partner_info in", values, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoNotIn(List<Long> values) {
            addCriterion("partner_info not in", values, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoBetween(Long value1, Long value2) {
            addCriterion("partner_info between", value1, value2, "partnerInfo");
            return (Criteria) this;
        }

        public Criteria andPartnerInfoNotBetween(Long value1, Long value2) {
            addCriterion("partner_info not between", value1, value2, "partnerInfo");
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