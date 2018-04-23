package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblRewardPoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRewardPoolExample() {
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

        public Criteria andRewardPoolIdIsNull() {
            addCriterion("reward_pool_id is null");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdIsNotNull() {
            addCriterion("reward_pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdEqualTo(Long value) {
            addCriterion("reward_pool_id =", value, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdNotEqualTo(Long value) {
            addCriterion("reward_pool_id <>", value, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdGreaterThan(Long value) {
            addCriterion("reward_pool_id >", value, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reward_pool_id >=", value, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdLessThan(Long value) {
            addCriterion("reward_pool_id <", value, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdLessThanOrEqualTo(Long value) {
            addCriterion("reward_pool_id <=", value, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdIn(List<Long> values) {
            addCriterion("reward_pool_id in", values, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdNotIn(List<Long> values) {
            addCriterion("reward_pool_id not in", values, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdBetween(Long value1, Long value2) {
            addCriterion("reward_pool_id between", value1, value2, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andRewardPoolIdNotBetween(Long value1, Long value2) {
            addCriterion("reward_pool_id not between", value1, value2, "rewardPoolId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andRewardTypeIsNull() {
            addCriterion("reward_type is null");
            return (Criteria) this;
        }

        public Criteria andRewardTypeIsNotNull() {
            addCriterion("reward_type is not null");
            return (Criteria) this;
        }

        public Criteria andRewardTypeEqualTo(Integer value) {
            addCriterion("reward_type =", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeNotEqualTo(Integer value) {
            addCriterion("reward_type <>", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeGreaterThan(Integer value) {
            addCriterion("reward_type >", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_type >=", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeLessThan(Integer value) {
            addCriterion("reward_type <", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("reward_type <=", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeIn(List<Integer> values) {
            addCriterion("reward_type in", values, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeNotIn(List<Integer> values) {
            addCriterion("reward_type not in", values, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeBetween(Integer value1, Integer value2) {
            addCriterion("reward_type between", value1, value2, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_type not between", value1, value2, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardStateIsNull() {
            addCriterion("reward_state is null");
            return (Criteria) this;
        }

        public Criteria andRewardStateIsNotNull() {
            addCriterion("reward_state is not null");
            return (Criteria) this;
        }

        public Criteria andRewardStateEqualTo(Integer value) {
            addCriterion("reward_state =", value, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateNotEqualTo(Integer value) {
            addCriterion("reward_state <>", value, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateGreaterThan(Integer value) {
            addCriterion("reward_state >", value, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_state >=", value, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateLessThan(Integer value) {
            addCriterion("reward_state <", value, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateLessThanOrEqualTo(Integer value) {
            addCriterion("reward_state <=", value, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateIn(List<Integer> values) {
            addCriterion("reward_state in", values, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateNotIn(List<Integer> values) {
            addCriterion("reward_state not in", values, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateBetween(Integer value1, Integer value2) {
            addCriterion("reward_state between", value1, value2, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardStateNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_state not between", value1, value2, "rewardState");
            return (Criteria) this;
        }

        public Criteria andRewardAmountIsNull() {
            addCriterion("reward_amount is null");
            return (Criteria) this;
        }

        public Criteria andRewardAmountIsNotNull() {
            addCriterion("reward_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRewardAmountEqualTo(Integer value) {
            addCriterion("reward_amount =", value, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountNotEqualTo(Integer value) {
            addCriterion("reward_amount <>", value, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountGreaterThan(Integer value) {
            addCriterion("reward_amount >", value, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_amount >=", value, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountLessThan(Integer value) {
            addCriterion("reward_amount <", value, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountLessThanOrEqualTo(Integer value) {
            addCriterion("reward_amount <=", value, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountIn(List<Integer> values) {
            addCriterion("reward_amount in", values, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountNotIn(List<Integer> values) {
            addCriterion("reward_amount not in", values, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountBetween(Integer value1, Integer value2) {
            addCriterion("reward_amount between", value1, value2, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_amount not between", value1, value2, "rewardAmount");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeIsNull() {
            addCriterion("reward_purpose is null");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeIsNotNull() {
            addCriterion("reward_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeEqualTo(String value) {
            addCriterion("reward_purpose =", value, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeNotEqualTo(String value) {
            addCriterion("reward_purpose <>", value, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeGreaterThan(String value) {
            addCriterion("reward_purpose >", value, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("reward_purpose >=", value, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeLessThan(String value) {
            addCriterion("reward_purpose <", value, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeLessThanOrEqualTo(String value) {
            addCriterion("reward_purpose <=", value, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeLike(String value) {
            addCriterion("reward_purpose like", value, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeNotLike(String value) {
            addCriterion("reward_purpose not like", value, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeIn(List<String> values) {
            addCriterion("reward_purpose in", values, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeNotIn(List<String> values) {
            addCriterion("reward_purpose not in", values, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeBetween(String value1, String value2) {
            addCriterion("reward_purpose between", value1, value2, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andRewardPurposeNotBetween(String value1, String value2) {
            addCriterion("reward_purpose not between", value1, value2, "rewardPurpose");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtIsNull() {
            addCriterion("effective_at is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtIsNotNull() {
            addCriterion("effective_at is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtEqualTo(Date value) {
            addCriterion("effective_at =", value, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtNotEqualTo(Date value) {
            addCriterion("effective_at <>", value, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtGreaterThan(Date value) {
            addCriterion("effective_at >", value, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_at >=", value, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtLessThan(Date value) {
            addCriterion("effective_at <", value, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtLessThanOrEqualTo(Date value) {
            addCriterion("effective_at <=", value, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtIn(List<Date> values) {
            addCriterion("effective_at in", values, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtNotIn(List<Date> values) {
            addCriterion("effective_at not in", values, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtBetween(Date value1, Date value2) {
            addCriterion("effective_at between", value1, value2, "effectiveAt");
            return (Criteria) this;
        }

        public Criteria andEffectiveAtNotBetween(Date value1, Date value2) {
            addCriterion("effective_at not between", value1, value2, "effectiveAt");
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