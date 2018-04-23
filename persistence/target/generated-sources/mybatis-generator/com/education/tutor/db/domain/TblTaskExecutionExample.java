package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTaskExecutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTaskExecutionExample() {
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

        public Criteria andTaskExecutionIdIsNull() {
            addCriterion("task_execution_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdIsNotNull() {
            addCriterion("task_execution_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdEqualTo(Long value) {
            addCriterion("task_execution_id =", value, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdNotEqualTo(Long value) {
            addCriterion("task_execution_id <>", value, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdGreaterThan(Long value) {
            addCriterion("task_execution_id >", value, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_execution_id >=", value, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdLessThan(Long value) {
            addCriterion("task_execution_id <", value, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdLessThanOrEqualTo(Long value) {
            addCriterion("task_execution_id <=", value, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdIn(List<Long> values) {
            addCriterion("task_execution_id in", values, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdNotIn(List<Long> values) {
            addCriterion("task_execution_id not in", values, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdBetween(Long value1, Long value2) {
            addCriterion("task_execution_id between", value1, value2, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskExecutionIdNotBetween(Long value1, Long value2) {
            addCriterion("task_execution_id not between", value1, value2, "taskExecutionId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
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

        public Criteria andExecutionStartIsNull() {
            addCriterion("execution_start is null");
            return (Criteria) this;
        }

        public Criteria andExecutionStartIsNotNull() {
            addCriterion("execution_start is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionStartEqualTo(Date value) {
            addCriterion("execution_start =", value, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartNotEqualTo(Date value) {
            addCriterion("execution_start <>", value, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartGreaterThan(Date value) {
            addCriterion("execution_start >", value, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartGreaterThanOrEqualTo(Date value) {
            addCriterion("execution_start >=", value, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartLessThan(Date value) {
            addCriterion("execution_start <", value, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartLessThanOrEqualTo(Date value) {
            addCriterion("execution_start <=", value, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartIn(List<Date> values) {
            addCriterion("execution_start in", values, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartNotIn(List<Date> values) {
            addCriterion("execution_start not in", values, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartBetween(Date value1, Date value2) {
            addCriterion("execution_start between", value1, value2, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionStartNotBetween(Date value1, Date value2) {
            addCriterion("execution_start not between", value1, value2, "executionStart");
            return (Criteria) this;
        }

        public Criteria andExecutionEndIsNull() {
            addCriterion("execution_end is null");
            return (Criteria) this;
        }

        public Criteria andExecutionEndIsNotNull() {
            addCriterion("execution_end is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionEndEqualTo(Date value) {
            addCriterion("execution_end =", value, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndNotEqualTo(Date value) {
            addCriterion("execution_end <>", value, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndGreaterThan(Date value) {
            addCriterion("execution_end >", value, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndGreaterThanOrEqualTo(Date value) {
            addCriterion("execution_end >=", value, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndLessThan(Date value) {
            addCriterion("execution_end <", value, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndLessThanOrEqualTo(Date value) {
            addCriterion("execution_end <=", value, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndIn(List<Date> values) {
            addCriterion("execution_end in", values, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndNotIn(List<Date> values) {
            addCriterion("execution_end not in", values, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndBetween(Date value1, Date value2) {
            addCriterion("execution_end between", value1, value2, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionEndNotBetween(Date value1, Date value2) {
            addCriterion("execution_end not between", value1, value2, "executionEnd");
            return (Criteria) this;
        }

        public Criteria andExecutionResultIsNull() {
            addCriterion("execution_result is null");
            return (Criteria) this;
        }

        public Criteria andExecutionResultIsNotNull() {
            addCriterion("execution_result is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionResultEqualTo(String value) {
            addCriterion("execution_result =", value, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultNotEqualTo(String value) {
            addCriterion("execution_result <>", value, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultGreaterThan(String value) {
            addCriterion("execution_result >", value, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultGreaterThanOrEqualTo(String value) {
            addCriterion("execution_result >=", value, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultLessThan(String value) {
            addCriterion("execution_result <", value, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultLessThanOrEqualTo(String value) {
            addCriterion("execution_result <=", value, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultLike(String value) {
            addCriterion("execution_result like", value, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultNotLike(String value) {
            addCriterion("execution_result not like", value, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultIn(List<String> values) {
            addCriterion("execution_result in", values, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultNotIn(List<String> values) {
            addCriterion("execution_result not in", values, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultBetween(String value1, String value2) {
            addCriterion("execution_result between", value1, value2, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionResultNotBetween(String value1, String value2) {
            addCriterion("execution_result not between", value1, value2, "executionResult");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagIsNull() {
            addCriterion("execution_flag is null");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagIsNotNull() {
            addCriterion("execution_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagEqualTo(Integer value) {
            addCriterion("execution_flag =", value, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagNotEqualTo(Integer value) {
            addCriterion("execution_flag <>", value, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagGreaterThan(Integer value) {
            addCriterion("execution_flag >", value, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("execution_flag >=", value, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagLessThan(Integer value) {
            addCriterion("execution_flag <", value, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagLessThanOrEqualTo(Integer value) {
            addCriterion("execution_flag <=", value, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagIn(List<Integer> values) {
            addCriterion("execution_flag in", values, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagNotIn(List<Integer> values) {
            addCriterion("execution_flag not in", values, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagBetween(Integer value1, Integer value2) {
            addCriterion("execution_flag between", value1, value2, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("execution_flag not between", value1, value2, "executionFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkIsNull() {
            addCriterion("execution_remark is null");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkIsNotNull() {
            addCriterion("execution_remark is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkEqualTo(String value) {
            addCriterion("execution_remark =", value, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkNotEqualTo(String value) {
            addCriterion("execution_remark <>", value, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkGreaterThan(String value) {
            addCriterion("execution_remark >", value, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("execution_remark >=", value, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkLessThan(String value) {
            addCriterion("execution_remark <", value, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkLessThanOrEqualTo(String value) {
            addCriterion("execution_remark <=", value, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkLike(String value) {
            addCriterion("execution_remark like", value, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkNotLike(String value) {
            addCriterion("execution_remark not like", value, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkIn(List<String> values) {
            addCriterion("execution_remark in", values, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkNotIn(List<String> values) {
            addCriterion("execution_remark not in", values, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkBetween(String value1, String value2) {
            addCriterion("execution_remark between", value1, value2, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionRemarkNotBetween(String value1, String value2) {
            addCriterion("execution_remark not between", value1, value2, "executionRemark");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationIsNull() {
            addCriterion("execution_location is null");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationIsNotNull() {
            addCriterion("execution_location is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationEqualTo(String value) {
            addCriterion("execution_location =", value, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationNotEqualTo(String value) {
            addCriterion("execution_location <>", value, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationGreaterThan(String value) {
            addCriterion("execution_location >", value, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationGreaterThanOrEqualTo(String value) {
            addCriterion("execution_location >=", value, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationLessThan(String value) {
            addCriterion("execution_location <", value, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationLessThanOrEqualTo(String value) {
            addCriterion("execution_location <=", value, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationLike(String value) {
            addCriterion("execution_location like", value, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationNotLike(String value) {
            addCriterion("execution_location not like", value, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationIn(List<String> values) {
            addCriterion("execution_location in", values, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationNotIn(List<String> values) {
            addCriterion("execution_location not in", values, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationBetween(String value1, String value2) {
            addCriterion("execution_location between", value1, value2, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionLocationNotBetween(String value1, String value2) {
            addCriterion("execution_location not between", value1, value2, "executionLocation");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIsNull() {
            addCriterion("execution_state is null");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIsNotNull() {
            addCriterion("execution_state is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionStateEqualTo(Integer value) {
            addCriterion("execution_state =", value, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNotEqualTo(Integer value) {
            addCriterion("execution_state <>", value, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateGreaterThan(Integer value) {
            addCriterion("execution_state >", value, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("execution_state >=", value, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateLessThan(Integer value) {
            addCriterion("execution_state <", value, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateLessThanOrEqualTo(Integer value) {
            addCriterion("execution_state <=", value, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIn(List<Integer> values) {
            addCriterion("execution_state in", values, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNotIn(List<Integer> values) {
            addCriterion("execution_state not in", values, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateBetween(Integer value1, Integer value2) {
            addCriterion("execution_state between", value1, value2, "executionState");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNotBetween(Integer value1, Integer value2) {
            addCriterion("execution_state not between", value1, value2, "executionState");
            return (Criteria) this;
        }

        public Criteria andCoporatedByIsNull() {
            addCriterion("coporated_by is null");
            return (Criteria) this;
        }

        public Criteria andCoporatedByIsNotNull() {
            addCriterion("coporated_by is not null");
            return (Criteria) this;
        }

        public Criteria andCoporatedByEqualTo(String value) {
            addCriterion("coporated_by =", value, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByNotEqualTo(String value) {
            addCriterion("coporated_by <>", value, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByGreaterThan(String value) {
            addCriterion("coporated_by >", value, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByGreaterThanOrEqualTo(String value) {
            addCriterion("coporated_by >=", value, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByLessThan(String value) {
            addCriterion("coporated_by <", value, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByLessThanOrEqualTo(String value) {
            addCriterion("coporated_by <=", value, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByLike(String value) {
            addCriterion("coporated_by like", value, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByNotLike(String value) {
            addCriterion("coporated_by not like", value, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByIn(List<String> values) {
            addCriterion("coporated_by in", values, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByNotIn(List<String> values) {
            addCriterion("coporated_by not in", values, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByBetween(String value1, String value2) {
            addCriterion("coporated_by between", value1, value2, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andCoporatedByNotBetween(String value1, String value2) {
            addCriterion("coporated_by not between", value1, value2, "coporatedBy");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreReasonIsNull() {
            addCriterion("score_reason is null");
            return (Criteria) this;
        }

        public Criteria andScoreReasonIsNotNull() {
            addCriterion("score_reason is not null");
            return (Criteria) this;
        }

        public Criteria andScoreReasonEqualTo(String value) {
            addCriterion("score_reason =", value, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonNotEqualTo(String value) {
            addCriterion("score_reason <>", value, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonGreaterThan(String value) {
            addCriterion("score_reason >", value, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonGreaterThanOrEqualTo(String value) {
            addCriterion("score_reason >=", value, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonLessThan(String value) {
            addCriterion("score_reason <", value, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonLessThanOrEqualTo(String value) {
            addCriterion("score_reason <=", value, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonLike(String value) {
            addCriterion("score_reason like", value, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonNotLike(String value) {
            addCriterion("score_reason not like", value, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonIn(List<String> values) {
            addCriterion("score_reason in", values, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonNotIn(List<String> values) {
            addCriterion("score_reason not in", values, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonBetween(String value1, String value2) {
            addCriterion("score_reason between", value1, value2, "scoreReason");
            return (Criteria) this;
        }

        public Criteria andScoreReasonNotBetween(String value1, String value2) {
            addCriterion("score_reason not between", value1, value2, "scoreReason");
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