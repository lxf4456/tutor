package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblPollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblPollExample() {
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

        public Criteria andPollIdIsNull() {
            addCriterion("poll_id is null");
            return (Criteria) this;
        }

        public Criteria andPollIdIsNotNull() {
            addCriterion("poll_id is not null");
            return (Criteria) this;
        }

        public Criteria andPollIdEqualTo(Long value) {
            addCriterion("poll_id =", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdNotEqualTo(Long value) {
            addCriterion("poll_id <>", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdGreaterThan(Long value) {
            addCriterion("poll_id >", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdGreaterThanOrEqualTo(Long value) {
            addCriterion("poll_id >=", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdLessThan(Long value) {
            addCriterion("poll_id <", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdLessThanOrEqualTo(Long value) {
            addCriterion("poll_id <=", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdIn(List<Long> values) {
            addCriterion("poll_id in", values, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdNotIn(List<Long> values) {
            addCriterion("poll_id not in", values, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdBetween(Long value1, Long value2) {
            addCriterion("poll_id between", value1, value2, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdNotBetween(Long value1, Long value2) {
            addCriterion("poll_id not between", value1, value2, "pollId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Long value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Long value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Long value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Long value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Long> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Long> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Long value1, Long value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
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

        public Criteria andVoteValueIsNull() {
            addCriterion("vote_value is null");
            return (Criteria) this;
        }

        public Criteria andVoteValueIsNotNull() {
            addCriterion("vote_value is not null");
            return (Criteria) this;
        }

        public Criteria andVoteValueEqualTo(Integer value) {
            addCriterion("vote_value =", value, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueNotEqualTo(Integer value) {
            addCriterion("vote_value <>", value, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueGreaterThan(Integer value) {
            addCriterion("vote_value >", value, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_value >=", value, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueLessThan(Integer value) {
            addCriterion("vote_value <", value, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueLessThanOrEqualTo(Integer value) {
            addCriterion("vote_value <=", value, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueIn(List<Integer> values) {
            addCriterion("vote_value in", values, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueNotIn(List<Integer> values) {
            addCriterion("vote_value not in", values, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueBetween(Integer value1, Integer value2) {
            addCriterion("vote_value between", value1, value2, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteValueNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_value not between", value1, value2, "voteValue");
            return (Criteria) this;
        }

        public Criteria andVoteStateIsNull() {
            addCriterion("vote_state is null");
            return (Criteria) this;
        }

        public Criteria andVoteStateIsNotNull() {
            addCriterion("vote_state is not null");
            return (Criteria) this;
        }

        public Criteria andVoteStateEqualTo(Integer value) {
            addCriterion("vote_state =", value, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateNotEqualTo(Integer value) {
            addCriterion("vote_state <>", value, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateGreaterThan(Integer value) {
            addCriterion("vote_state >", value, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_state >=", value, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateLessThan(Integer value) {
            addCriterion("vote_state <", value, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateLessThanOrEqualTo(Integer value) {
            addCriterion("vote_state <=", value, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateIn(List<Integer> values) {
            addCriterion("vote_state in", values, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateNotIn(List<Integer> values) {
            addCriterion("vote_state not in", values, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateBetween(Integer value1, Integer value2) {
            addCriterion("vote_state between", value1, value2, "voteState");
            return (Criteria) this;
        }

        public Criteria andVoteStateNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_state not between", value1, value2, "voteState");
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