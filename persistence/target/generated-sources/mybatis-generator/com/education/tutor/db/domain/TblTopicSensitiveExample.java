package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTopicSensitiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTopicSensitiveExample() {
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

        public Criteria andSeIdIsNull() {
            addCriterion("se_id is null");
            return (Criteria) this;
        }

        public Criteria andSeIdIsNotNull() {
            addCriterion("se_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeIdEqualTo(Long value) {
            addCriterion("se_id =", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotEqualTo(Long value) {
            addCriterion("se_id <>", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThan(Long value) {
            addCriterion("se_id >", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("se_id >=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThan(Long value) {
            addCriterion("se_id <", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThanOrEqualTo(Long value) {
            addCriterion("se_id <=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdIn(List<Long> values) {
            addCriterion("se_id in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotIn(List<Long> values) {
            addCriterion("se_id not in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdBetween(Long value1, Long value2) {
            addCriterion("se_id between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotBetween(Long value1, Long value2) {
            addCriterion("se_id not between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeValueIsNull() {
            addCriterion("se_value is null");
            return (Criteria) this;
        }

        public Criteria andSeValueIsNotNull() {
            addCriterion("se_value is not null");
            return (Criteria) this;
        }

        public Criteria andSeValueEqualTo(String value) {
            addCriterion("se_value =", value, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueNotEqualTo(String value) {
            addCriterion("se_value <>", value, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueGreaterThan(String value) {
            addCriterion("se_value >", value, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueGreaterThanOrEqualTo(String value) {
            addCriterion("se_value >=", value, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueLessThan(String value) {
            addCriterion("se_value <", value, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueLessThanOrEqualTo(String value) {
            addCriterion("se_value <=", value, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueLike(String value) {
            addCriterion("se_value like", value, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueNotLike(String value) {
            addCriterion("se_value not like", value, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueIn(List<String> values) {
            addCriterion("se_value in", values, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueNotIn(List<String> values) {
            addCriterion("se_value not in", values, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueBetween(String value1, String value2) {
            addCriterion("se_value between", value1, value2, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeValueNotBetween(String value1, String value2) {
            addCriterion("se_value not between", value1, value2, "seValue");
            return (Criteria) this;
        }

        public Criteria andSeStateIsNull() {
            addCriterion("se_state is null");
            return (Criteria) this;
        }

        public Criteria andSeStateIsNotNull() {
            addCriterion("se_state is not null");
            return (Criteria) this;
        }

        public Criteria andSeStateEqualTo(Integer value) {
            addCriterion("se_state =", value, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateNotEqualTo(Integer value) {
            addCriterion("se_state <>", value, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateGreaterThan(Integer value) {
            addCriterion("se_state >", value, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("se_state >=", value, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateLessThan(Integer value) {
            addCriterion("se_state <", value, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateLessThanOrEqualTo(Integer value) {
            addCriterion("se_state <=", value, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateIn(List<Integer> values) {
            addCriterion("se_state in", values, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateNotIn(List<Integer> values) {
            addCriterion("se_state not in", values, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateBetween(Integer value1, Integer value2) {
            addCriterion("se_state between", value1, value2, "seState");
            return (Criteria) this;
        }

        public Criteria andSeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("se_state not between", value1, value2, "seState");
            return (Criteria) this;
        }

        public Criteria andSeCreateatIsNull() {
            addCriterion("se_createat is null");
            return (Criteria) this;
        }

        public Criteria andSeCreateatIsNotNull() {
            addCriterion("se_createat is not null");
            return (Criteria) this;
        }

        public Criteria andSeCreateatEqualTo(Date value) {
            addCriterion("se_createat =", value, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatNotEqualTo(Date value) {
            addCriterion("se_createat <>", value, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatGreaterThan(Date value) {
            addCriterion("se_createat >", value, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("se_createat >=", value, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatLessThan(Date value) {
            addCriterion("se_createat <", value, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatLessThanOrEqualTo(Date value) {
            addCriterion("se_createat <=", value, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatIn(List<Date> values) {
            addCriterion("se_createat in", values, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatNotIn(List<Date> values) {
            addCriterion("se_createat not in", values, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatBetween(Date value1, Date value2) {
            addCriterion("se_createat between", value1, value2, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreateatNotBetween(Date value1, Date value2) {
            addCriterion("se_createat not between", value1, value2, "seCreateat");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyIsNull() {
            addCriterion("se_createby is null");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyIsNotNull() {
            addCriterion("se_createby is not null");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyEqualTo(String value) {
            addCriterion("se_createby =", value, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyNotEqualTo(String value) {
            addCriterion("se_createby <>", value, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyGreaterThan(String value) {
            addCriterion("se_createby >", value, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("se_createby >=", value, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyLessThan(String value) {
            addCriterion("se_createby <", value, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyLessThanOrEqualTo(String value) {
            addCriterion("se_createby <=", value, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyLike(String value) {
            addCriterion("se_createby like", value, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyNotLike(String value) {
            addCriterion("se_createby not like", value, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyIn(List<String> values) {
            addCriterion("se_createby in", values, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyNotIn(List<String> values) {
            addCriterion("se_createby not in", values, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyBetween(String value1, String value2) {
            addCriterion("se_createby between", value1, value2, "seCreateby");
            return (Criteria) this;
        }

        public Criteria andSeCreatebyNotBetween(String value1, String value2) {
            addCriterion("se_createby not between", value1, value2, "seCreateby");
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