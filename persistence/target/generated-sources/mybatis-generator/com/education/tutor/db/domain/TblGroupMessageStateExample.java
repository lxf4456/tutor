package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.List;

public class TblGroupMessageStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGroupMessageStateExample() {
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

        public Criteria andGroupMessageStateIdIsNull() {
            addCriterion("group_message_state_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdIsNotNull() {
            addCriterion("group_message_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdEqualTo(Long value) {
            addCriterion("group_message_state_id =", value, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdNotEqualTo(Long value) {
            addCriterion("group_message_state_id <>", value, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdGreaterThan(Long value) {
            addCriterion("group_message_state_id >", value, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_message_state_id >=", value, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdLessThan(Long value) {
            addCriterion("group_message_state_id <", value, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdLessThanOrEqualTo(Long value) {
            addCriterion("group_message_state_id <=", value, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdIn(List<Long> values) {
            addCriterion("group_message_state_id in", values, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdNotIn(List<Long> values) {
            addCriterion("group_message_state_id not in", values, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdBetween(Long value1, Long value2) {
            addCriterion("group_message_state_id between", value1, value2, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andGroupMessageStateIdNotBetween(Long value1, Long value2) {
            addCriterion("group_message_state_id not between", value1, value2, "groupMessageStateId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdIsNull() {
            addCriterion("user_social_group_id is null");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdIsNotNull() {
            addCriterion("user_social_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdEqualTo(Long value) {
            addCriterion("user_social_group_id =", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdNotEqualTo(Long value) {
            addCriterion("user_social_group_id <>", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdGreaterThan(Long value) {
            addCriterion("user_social_group_id >", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_social_group_id >=", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdLessThan(Long value) {
            addCriterion("user_social_group_id <", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("user_social_group_id <=", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdIn(List<Long> values) {
            addCriterion("user_social_group_id in", values, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdNotIn(List<Long> values) {
            addCriterion("user_social_group_id not in", values, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdBetween(Long value1, Long value2) {
            addCriterion("user_social_group_id between", value1, value2, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("user_social_group_id not between", value1, value2, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Long value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Long value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Long value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Long value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Long> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Long> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Long value1, Long value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
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