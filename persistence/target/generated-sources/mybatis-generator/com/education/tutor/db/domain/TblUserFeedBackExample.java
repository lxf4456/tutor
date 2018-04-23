package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblUserFeedBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserFeedBackExample() {
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

        public Criteria andUserFeedBackIdIsNull() {
            addCriterion("user_feed_back_id is null");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdIsNotNull() {
            addCriterion("user_feed_back_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdEqualTo(Long value) {
            addCriterion("user_feed_back_id =", value, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdNotEqualTo(Long value) {
            addCriterion("user_feed_back_id <>", value, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdGreaterThan(Long value) {
            addCriterion("user_feed_back_id >", value, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_feed_back_id >=", value, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdLessThan(Long value) {
            addCriterion("user_feed_back_id <", value, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdLessThanOrEqualTo(Long value) {
            addCriterion("user_feed_back_id <=", value, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdIn(List<Long> values) {
            addCriterion("user_feed_back_id in", values, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdNotIn(List<Long> values) {
            addCriterion("user_feed_back_id not in", values, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdBetween(Long value1, Long value2) {
            addCriterion("user_feed_back_id between", value1, value2, "userFeedBackId");
            return (Criteria) this;
        }

        public Criteria andUserFeedBackIdNotBetween(Long value1, Long value2) {
            addCriterion("user_feed_back_id not between", value1, value2, "userFeedBackId");
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

        public Criteria andFeedBackContentIsNull() {
            addCriterion("feed_back_content is null");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentIsNotNull() {
            addCriterion("feed_back_content is not null");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentEqualTo(String value) {
            addCriterion("feed_back_content =", value, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentNotEqualTo(String value) {
            addCriterion("feed_back_content <>", value, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentGreaterThan(String value) {
            addCriterion("feed_back_content >", value, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentGreaterThanOrEqualTo(String value) {
            addCriterion("feed_back_content >=", value, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentLessThan(String value) {
            addCriterion("feed_back_content <", value, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentLessThanOrEqualTo(String value) {
            addCriterion("feed_back_content <=", value, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentLike(String value) {
            addCriterion("feed_back_content like", value, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentNotLike(String value) {
            addCriterion("feed_back_content not like", value, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentIn(List<String> values) {
            addCriterion("feed_back_content in", values, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentNotIn(List<String> values) {
            addCriterion("feed_back_content not in", values, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentBetween(String value1, String value2) {
            addCriterion("feed_back_content between", value1, value2, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackContentNotBetween(String value1, String value2) {
            addCriterion("feed_back_content not between", value1, value2, "feedBackContent");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateIsNull() {
            addCriterion("feed_back_state is null");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateIsNotNull() {
            addCriterion("feed_back_state is not null");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateEqualTo(Short value) {
            addCriterion("feed_back_state =", value, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateNotEqualTo(Short value) {
            addCriterion("feed_back_state <>", value, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateGreaterThan(Short value) {
            addCriterion("feed_back_state >", value, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateGreaterThanOrEqualTo(Short value) {
            addCriterion("feed_back_state >=", value, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateLessThan(Short value) {
            addCriterion("feed_back_state <", value, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateLessThanOrEqualTo(Short value) {
            addCriterion("feed_back_state <=", value, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateIn(List<Short> values) {
            addCriterion("feed_back_state in", values, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateNotIn(List<Short> values) {
            addCriterion("feed_back_state not in", values, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateBetween(Short value1, Short value2) {
            addCriterion("feed_back_state between", value1, value2, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andFeedBackStateNotBetween(Short value1, Short value2) {
            addCriterion("feed_back_state not between", value1, value2, "feedBackState");
            return (Criteria) this;
        }

        public Criteria andProcessByIsNull() {
            addCriterion("process_by is null");
            return (Criteria) this;
        }

        public Criteria andProcessByIsNotNull() {
            addCriterion("process_by is not null");
            return (Criteria) this;
        }

        public Criteria andProcessByEqualTo(String value) {
            addCriterion("process_by =", value, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByNotEqualTo(String value) {
            addCriterion("process_by <>", value, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByGreaterThan(String value) {
            addCriterion("process_by >", value, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByGreaterThanOrEqualTo(String value) {
            addCriterion("process_by >=", value, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByLessThan(String value) {
            addCriterion("process_by <", value, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByLessThanOrEqualTo(String value) {
            addCriterion("process_by <=", value, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByLike(String value) {
            addCriterion("process_by like", value, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByNotLike(String value) {
            addCriterion("process_by not like", value, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByIn(List<String> values) {
            addCriterion("process_by in", values, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByNotIn(List<String> values) {
            addCriterion("process_by not in", values, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByBetween(String value1, String value2) {
            addCriterion("process_by between", value1, value2, "processBy");
            return (Criteria) this;
        }

        public Criteria andProcessByNotBetween(String value1, String value2) {
            addCriterion("process_by not between", value1, value2, "processBy");
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