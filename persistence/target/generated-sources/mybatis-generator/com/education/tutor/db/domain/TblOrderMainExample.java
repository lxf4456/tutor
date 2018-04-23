package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblOrderMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblOrderMainExample() {
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

        public Criteria andOrderMainIdIsNull() {
            addCriterion("order_main_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdIsNotNull() {
            addCriterion("order_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdEqualTo(Long value) {
            addCriterion("order_main_id =", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotEqualTo(Long value) {
            addCriterion("order_main_id <>", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdGreaterThan(Long value) {
            addCriterion("order_main_id >", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_main_id >=", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdLessThan(Long value) {
            addCriterion("order_main_id <", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdLessThanOrEqualTo(Long value) {
            addCriterion("order_main_id <=", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdIn(List<Long> values) {
            addCriterion("order_main_id in", values, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotIn(List<Long> values) {
            addCriterion("order_main_id not in", values, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdBetween(Long value1, Long value2) {
            addCriterion("order_main_id between", value1, value2, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotBetween(Long value1, Long value2) {
            addCriterion("order_main_id not between", value1, value2, "orderMainId");
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(Integer value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(Integer value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(Integer value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(Integer value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(Integer value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<Integer> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<Integer> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(Integer value1, Integer value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByIsNull() {
            addCriterion("order_issued_by is null");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByIsNotNull() {
            addCriterion("order_issued_by is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByEqualTo(String value) {
            addCriterion("order_issued_by =", value, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByNotEqualTo(String value) {
            addCriterion("order_issued_by <>", value, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByGreaterThan(String value) {
            addCriterion("order_issued_by >", value, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByGreaterThanOrEqualTo(String value) {
            addCriterion("order_issued_by >=", value, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByLessThan(String value) {
            addCriterion("order_issued_by <", value, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByLessThanOrEqualTo(String value) {
            addCriterion("order_issued_by <=", value, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByLike(String value) {
            addCriterion("order_issued_by like", value, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByNotLike(String value) {
            addCriterion("order_issued_by not like", value, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByIn(List<String> values) {
            addCriterion("order_issued_by in", values, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByNotIn(List<String> values) {
            addCriterion("order_issued_by not in", values, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByBetween(String value1, String value2) {
            addCriterion("order_issued_by between", value1, value2, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderIssuedByNotBetween(String value1, String value2) {
            addCriterion("order_issued_by not between", value1, value2, "orderIssuedBy");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToIsNull() {
            addCriterion("order_target_to is null");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToIsNotNull() {
            addCriterion("order_target_to is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToEqualTo(String value) {
            addCriterion("order_target_to =", value, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToNotEqualTo(String value) {
            addCriterion("order_target_to <>", value, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToGreaterThan(String value) {
            addCriterion("order_target_to >", value, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToGreaterThanOrEqualTo(String value) {
            addCriterion("order_target_to >=", value, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToLessThan(String value) {
            addCriterion("order_target_to <", value, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToLessThanOrEqualTo(String value) {
            addCriterion("order_target_to <=", value, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToLike(String value) {
            addCriterion("order_target_to like", value, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToNotLike(String value) {
            addCriterion("order_target_to not like", value, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToIn(List<String> values) {
            addCriterion("order_target_to in", values, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToNotIn(List<String> values) {
            addCriterion("order_target_to not in", values, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToBetween(String value1, String value2) {
            addCriterion("order_target_to between", value1, value2, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderTargetToNotBetween(String value1, String value2) {
            addCriterion("order_target_to not between", value1, value2, "orderTargetTo");
            return (Criteria) this;
        }

        public Criteria andOrderContentIsNull() {
            addCriterion("order_content is null");
            return (Criteria) this;
        }

        public Criteria andOrderContentIsNotNull() {
            addCriterion("order_content is not null");
            return (Criteria) this;
        }

        public Criteria andOrderContentEqualTo(String value) {
            addCriterion("order_content =", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotEqualTo(String value) {
            addCriterion("order_content <>", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentGreaterThan(String value) {
            addCriterion("order_content >", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentGreaterThanOrEqualTo(String value) {
            addCriterion("order_content >=", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLessThan(String value) {
            addCriterion("order_content <", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLessThanOrEqualTo(String value) {
            addCriterion("order_content <=", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLike(String value) {
            addCriterion("order_content like", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotLike(String value) {
            addCriterion("order_content not like", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentIn(List<String> values) {
            addCriterion("order_content in", values, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotIn(List<String> values) {
            addCriterion("order_content not in", values, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentBetween(String value1, String value2) {
            addCriterion("order_content between", value1, value2, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotBetween(String value1, String value2) {
            addCriterion("order_content not between", value1, value2, "orderContent");
            return (Criteria) this;
        }

        public Criteria andVocherStateIsNull() {
            addCriterion("vocher_state is null");
            return (Criteria) this;
        }

        public Criteria andVocherStateIsNotNull() {
            addCriterion("vocher_state is not null");
            return (Criteria) this;
        }

        public Criteria andVocherStateEqualTo(Integer value) {
            addCriterion("vocher_state =", value, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateNotEqualTo(Integer value) {
            addCriterion("vocher_state <>", value, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateGreaterThan(Integer value) {
            addCriterion("vocher_state >", value, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("vocher_state >=", value, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateLessThan(Integer value) {
            addCriterion("vocher_state <", value, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateLessThanOrEqualTo(Integer value) {
            addCriterion("vocher_state <=", value, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateIn(List<Integer> values) {
            addCriterion("vocher_state in", values, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateNotIn(List<Integer> values) {
            addCriterion("vocher_state not in", values, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateBetween(Integer value1, Integer value2) {
            addCriterion("vocher_state between", value1, value2, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherStateNotBetween(Integer value1, Integer value2) {
            addCriterion("vocher_state not between", value1, value2, "vocherState");
            return (Criteria) this;
        }

        public Criteria andVocherTitleIsNull() {
            addCriterion("vocher_title is null");
            return (Criteria) this;
        }

        public Criteria andVocherTitleIsNotNull() {
            addCriterion("vocher_title is not null");
            return (Criteria) this;
        }

        public Criteria andVocherTitleEqualTo(String value) {
            addCriterion("vocher_title =", value, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleNotEqualTo(String value) {
            addCriterion("vocher_title <>", value, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleGreaterThan(String value) {
            addCriterion("vocher_title >", value, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleGreaterThanOrEqualTo(String value) {
            addCriterion("vocher_title >=", value, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleLessThan(String value) {
            addCriterion("vocher_title <", value, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleLessThanOrEqualTo(String value) {
            addCriterion("vocher_title <=", value, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleLike(String value) {
            addCriterion("vocher_title like", value, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleNotLike(String value) {
            addCriterion("vocher_title not like", value, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleIn(List<String> values) {
            addCriterion("vocher_title in", values, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleNotIn(List<String> values) {
            addCriterion("vocher_title not in", values, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleBetween(String value1, String value2) {
            addCriterion("vocher_title between", value1, value2, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andVocherTitleNotBetween(String value1, String value2) {
            addCriterion("vocher_title not between", value1, value2, "vocherTitle");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNull() {
            addCriterion("payment_state is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNotNull() {
            addCriterion("payment_state is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateEqualTo(Integer value) {
            addCriterion("payment_state =", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotEqualTo(Integer value) {
            addCriterion("payment_state <>", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThan(Integer value) {
            addCriterion("payment_state >", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_state >=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThan(Integer value) {
            addCriterion("payment_state <", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThanOrEqualTo(Integer value) {
            addCriterion("payment_state <=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIn(List<Integer> values) {
            addCriterion("payment_state in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotIn(List<Integer> values) {
            addCriterion("payment_state not in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateBetween(Integer value1, Integer value2) {
            addCriterion("payment_state between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_state not between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentDescIsNull() {
            addCriterion("payment_desc is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDescIsNotNull() {
            addCriterion("payment_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDescEqualTo(String value) {
            addCriterion("payment_desc =", value, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescNotEqualTo(String value) {
            addCriterion("payment_desc <>", value, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescGreaterThan(String value) {
            addCriterion("payment_desc >", value, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescGreaterThanOrEqualTo(String value) {
            addCriterion("payment_desc >=", value, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescLessThan(String value) {
            addCriterion("payment_desc <", value, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescLessThanOrEqualTo(String value) {
            addCriterion("payment_desc <=", value, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescLike(String value) {
            addCriterion("payment_desc like", value, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescNotLike(String value) {
            addCriterion("payment_desc not like", value, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescIn(List<String> values) {
            addCriterion("payment_desc in", values, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescNotIn(List<String> values) {
            addCriterion("payment_desc not in", values, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescBetween(String value1, String value2) {
            addCriterion("payment_desc between", value1, value2, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andPaymentDescNotBetween(String value1, String value2) {
            addCriterion("payment_desc not between", value1, value2, "paymentDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateIsNull() {
            addCriterion("delivery_state is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateIsNotNull() {
            addCriterion("delivery_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateEqualTo(Integer value) {
            addCriterion("delivery_state =", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateNotEqualTo(Integer value) {
            addCriterion("delivery_state <>", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateGreaterThan(Integer value) {
            addCriterion("delivery_state >", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_state >=", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateLessThan(Integer value) {
            addCriterion("delivery_state <", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_state <=", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateIn(List<Integer> values) {
            addCriterion("delivery_state in", values, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateNotIn(List<Integer> values) {
            addCriterion("delivery_state not in", values, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateBetween(Integer value1, Integer value2) {
            addCriterion("delivery_state between", value1, value2, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_state not between", value1, value2, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationIsNull() {
            addCriterion("delivery_location is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationIsNotNull() {
            addCriterion("delivery_location is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationEqualTo(String value) {
            addCriterion("delivery_location =", value, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationNotEqualTo(String value) {
            addCriterion("delivery_location <>", value, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationGreaterThan(String value) {
            addCriterion("delivery_location >", value, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_location >=", value, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationLessThan(String value) {
            addCriterion("delivery_location <", value, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationLessThanOrEqualTo(String value) {
            addCriterion("delivery_location <=", value, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationLike(String value) {
            addCriterion("delivery_location like", value, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationNotLike(String value) {
            addCriterion("delivery_location not like", value, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationIn(List<String> values) {
            addCriterion("delivery_location in", values, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationNotIn(List<String> values) {
            addCriterion("delivery_location not in", values, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationBetween(String value1, String value2) {
            addCriterion("delivery_location between", value1, value2, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLocationNotBetween(String value1, String value2) {
            addCriterion("delivery_location not between", value1, value2, "deliveryLocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescIsNull() {
            addCriterion("delivery_desc is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescIsNotNull() {
            addCriterion("delivery_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescEqualTo(String value) {
            addCriterion("delivery_desc =", value, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescNotEqualTo(String value) {
            addCriterion("delivery_desc <>", value, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescGreaterThan(String value) {
            addCriterion("delivery_desc >", value, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_desc >=", value, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescLessThan(String value) {
            addCriterion("delivery_desc <", value, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescLessThanOrEqualTo(String value) {
            addCriterion("delivery_desc <=", value, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescLike(String value) {
            addCriterion("delivery_desc like", value, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescNotLike(String value) {
            addCriterion("delivery_desc not like", value, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescIn(List<String> values) {
            addCriterion("delivery_desc in", values, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescNotIn(List<String> values) {
            addCriterion("delivery_desc not in", values, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescBetween(String value1, String value2) {
            addCriterion("delivery_desc between", value1, value2, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryDescNotBetween(String value1, String value2) {
            addCriterion("delivery_desc not between", value1, value2, "deliveryDesc");
            return (Criteria) this;
        }

        public Criteria andFollowupIsNull() {
            addCriterion("followup is null");
            return (Criteria) this;
        }

        public Criteria andFollowupIsNotNull() {
            addCriterion("followup is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupEqualTo(String value) {
            addCriterion("followup =", value, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupNotEqualTo(String value) {
            addCriterion("followup <>", value, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupGreaterThan(String value) {
            addCriterion("followup >", value, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupGreaterThanOrEqualTo(String value) {
            addCriterion("followup >=", value, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupLessThan(String value) {
            addCriterion("followup <", value, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupLessThanOrEqualTo(String value) {
            addCriterion("followup <=", value, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupLike(String value) {
            addCriterion("followup like", value, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupNotLike(String value) {
            addCriterion("followup not like", value, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupIn(List<String> values) {
            addCriterion("followup in", values, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupNotIn(List<String> values) {
            addCriterion("followup not in", values, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupBetween(String value1, String value2) {
            addCriterion("followup between", value1, value2, "followup");
            return (Criteria) this;
        }

        public Criteria andFollowupNotBetween(String value1, String value2) {
            addCriterion("followup not between", value1, value2, "followup");
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