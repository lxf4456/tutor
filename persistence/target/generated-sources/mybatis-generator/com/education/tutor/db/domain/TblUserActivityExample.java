package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblUserActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserActivityExample() {
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

        public Criteria andUserActivityIdIsNull() {
            addCriterion("user_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdIsNotNull() {
            addCriterion("user_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdEqualTo(Long value) {
            addCriterion("user_activity_id =", value, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdNotEqualTo(Long value) {
            addCriterion("user_activity_id <>", value, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdGreaterThan(Long value) {
            addCriterion("user_activity_id >", value, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_activity_id >=", value, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdLessThan(Long value) {
            addCriterion("user_activity_id <", value, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdLessThanOrEqualTo(Long value) {
            addCriterion("user_activity_id <=", value, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdIn(List<Long> values) {
            addCriterion("user_activity_id in", values, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdNotIn(List<Long> values) {
            addCriterion("user_activity_id not in", values, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdBetween(Long value1, Long value2) {
            addCriterion("user_activity_id between", value1, value2, "userActivityId");
            return (Criteria) this;
        }

        public Criteria andUserActivityIdNotBetween(Long value1, Long value2) {
            addCriterion("user_activity_id not between", value1, value2, "userActivityId");
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

        public Criteria andUserActivityNameIsNull() {
            addCriterion("user_activity_name is null");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameIsNotNull() {
            addCriterion("user_activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameEqualTo(String value) {
            addCriterion("user_activity_name =", value, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameNotEqualTo(String value) {
            addCriterion("user_activity_name <>", value, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameGreaterThan(String value) {
            addCriterion("user_activity_name >", value, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_activity_name >=", value, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameLessThan(String value) {
            addCriterion("user_activity_name <", value, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameLessThanOrEqualTo(String value) {
            addCriterion("user_activity_name <=", value, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameLike(String value) {
            addCriterion("user_activity_name like", value, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameNotLike(String value) {
            addCriterion("user_activity_name not like", value, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameIn(List<String> values) {
            addCriterion("user_activity_name in", values, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameNotIn(List<String> values) {
            addCriterion("user_activity_name not in", values, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameBetween(String value1, String value2) {
            addCriterion("user_activity_name between", value1, value2, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityNameNotBetween(String value1, String value2) {
            addCriterion("user_activity_name not between", value1, value2, "userActivityName");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeIsNull() {
            addCriterion("user_activity_type is null");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeIsNotNull() {
            addCriterion("user_activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeEqualTo(Integer value) {
            addCriterion("user_activity_type =", value, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeNotEqualTo(Integer value) {
            addCriterion("user_activity_type <>", value, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeGreaterThan(Integer value) {
            addCriterion("user_activity_type >", value, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_activity_type >=", value, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeLessThan(Integer value) {
            addCriterion("user_activity_type <", value, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_activity_type <=", value, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeIn(List<Integer> values) {
            addCriterion("user_activity_type in", values, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeNotIn(List<Integer> values) {
            addCriterion("user_activity_type not in", values, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_activity_type between", value1, value2, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andUserActivityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_activity_type not between", value1, value2, "userActivityType");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNull() {
            addCriterion("target_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNotNull() {
            addCriterion("target_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeEqualTo(Integer value) {
            addCriterion("target_type =", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotEqualTo(Integer value) {
            addCriterion("target_type <>", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThan(Integer value) {
            addCriterion("target_type >", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_type >=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThan(Integer value) {
            addCriterion("target_type <", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("target_type <=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIn(List<Integer> values) {
            addCriterion("target_type in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotIn(List<Integer> values) {
            addCriterion("target_type not in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeBetween(Integer value1, Integer value2) {
            addCriterion("target_type between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("target_type not between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateIsNull() {
            addCriterion("user_activity_state is null");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateIsNotNull() {
            addCriterion("user_activity_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateEqualTo(Integer value) {
            addCriterion("user_activity_state =", value, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateNotEqualTo(Integer value) {
            addCriterion("user_activity_state <>", value, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateGreaterThan(Integer value) {
            addCriterion("user_activity_state >", value, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_activity_state >=", value, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateLessThan(Integer value) {
            addCriterion("user_activity_state <", value, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateLessThanOrEqualTo(Integer value) {
            addCriterion("user_activity_state <=", value, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateIn(List<Integer> values) {
            addCriterion("user_activity_state in", values, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateNotIn(List<Integer> values) {
            addCriterion("user_activity_state not in", values, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateBetween(Integer value1, Integer value2) {
            addCriterion("user_activity_state between", value1, value2, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityStateNotBetween(Integer value1, Integer value2) {
            addCriterion("user_activity_state not between", value1, value2, "userActivityState");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultIsNull() {
            addCriterion("user_activity_result is null");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultIsNotNull() {
            addCriterion("user_activity_result is not null");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultEqualTo(String value) {
            addCriterion("user_activity_result =", value, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultNotEqualTo(String value) {
            addCriterion("user_activity_result <>", value, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultGreaterThan(String value) {
            addCriterion("user_activity_result >", value, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultGreaterThanOrEqualTo(String value) {
            addCriterion("user_activity_result >=", value, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultLessThan(String value) {
            addCriterion("user_activity_result <", value, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultLessThanOrEqualTo(String value) {
            addCriterion("user_activity_result <=", value, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultLike(String value) {
            addCriterion("user_activity_result like", value, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultNotLike(String value) {
            addCriterion("user_activity_result not like", value, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultIn(List<String> values) {
            addCriterion("user_activity_result in", values, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultNotIn(List<String> values) {
            addCriterion("user_activity_result not in", values, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultBetween(String value1, String value2) {
            addCriterion("user_activity_result between", value1, value2, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andUserActivityResultNotBetween(String value1, String value2) {
            addCriterion("user_activity_result not between", value1, value2, "userActivityResult");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMediaIsNull() {
            addCriterion("media is null");
            return (Criteria) this;
        }

        public Criteria andMediaIsNotNull() {
            addCriterion("media is not null");
            return (Criteria) this;
        }

        public Criteria andMediaEqualTo(String value) {
            addCriterion("media =", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaNotEqualTo(String value) {
            addCriterion("media <>", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaGreaterThan(String value) {
            addCriterion("media >", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaGreaterThanOrEqualTo(String value) {
            addCriterion("media >=", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaLessThan(String value) {
            addCriterion("media <", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaLessThanOrEqualTo(String value) {
            addCriterion("media <=", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaLike(String value) {
            addCriterion("media like", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaNotLike(String value) {
            addCriterion("media not like", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaIn(List<String> values) {
            addCriterion("media in", values, "media");
            return (Criteria) this;
        }

        public Criteria andMediaNotIn(List<String> values) {
            addCriterion("media not in", values, "media");
            return (Criteria) this;
        }

        public Criteria andMediaBetween(String value1, String value2) {
            addCriterion("media between", value1, value2, "media");
            return (Criteria) this;
        }

        public Criteria andMediaNotBetween(String value1, String value2) {
            addCriterion("media not between", value1, value2, "media");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPromotionIsNull() {
            addCriterion("promotion is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIsNotNull() {
            addCriterion("promotion is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionEqualTo(String value) {
            addCriterion("promotion =", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotEqualTo(String value) {
            addCriterion("promotion <>", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionGreaterThan(String value) {
            addCriterion("promotion >", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionGreaterThanOrEqualTo(String value) {
            addCriterion("promotion >=", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLessThan(String value) {
            addCriterion("promotion <", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLessThanOrEqualTo(String value) {
            addCriterion("promotion <=", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLike(String value) {
            addCriterion("promotion like", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotLike(String value) {
            addCriterion("promotion not like", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionIn(List<String> values) {
            addCriterion("promotion in", values, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotIn(List<String> values) {
            addCriterion("promotion not in", values, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionBetween(String value1, String value2) {
            addCriterion("promotion between", value1, value2, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotBetween(String value1, String value2) {
            addCriterion("promotion not between", value1, value2, "promotion");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andActTimeIsNull() {
            addCriterion("act_time is null");
            return (Criteria) this;
        }

        public Criteria andActTimeIsNotNull() {
            addCriterion("act_time is not null");
            return (Criteria) this;
        }

        public Criteria andActTimeEqualTo(Date value) {
            addCriterion("act_time =", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeNotEqualTo(Date value) {
            addCriterion("act_time <>", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeGreaterThan(Date value) {
            addCriterion("act_time >", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("act_time >=", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeLessThan(Date value) {
            addCriterion("act_time <", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeLessThanOrEqualTo(Date value) {
            addCriterion("act_time <=", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeIn(List<Date> values) {
            addCriterion("act_time in", values, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeNotIn(List<Date> values) {
            addCriterion("act_time not in", values, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeBetween(Date value1, Date value2) {
            addCriterion("act_time between", value1, value2, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeNotBetween(Date value1, Date value2) {
            addCriterion("act_time not between", value1, value2, "actTime");
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