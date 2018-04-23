package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblProjectLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblProjectLogExample() {
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

        public Criteria andProjectLogIdIsNull() {
            addCriterion("project_log_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdIsNotNull() {
            addCriterion("project_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdEqualTo(Long value) {
            addCriterion("project_log_id =", value, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdNotEqualTo(Long value) {
            addCriterion("project_log_id <>", value, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdGreaterThan(Long value) {
            addCriterion("project_log_id >", value, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_log_id >=", value, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdLessThan(Long value) {
            addCriterion("project_log_id <", value, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdLessThanOrEqualTo(Long value) {
            addCriterion("project_log_id <=", value, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdIn(List<Long> values) {
            addCriterion("project_log_id in", values, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdNotIn(List<Long> values) {
            addCriterion("project_log_id not in", values, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdBetween(Long value1, Long value2) {
            addCriterion("project_log_id between", value1, value2, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectLogIdNotBetween(Long value1, Long value2) {
            addCriterion("project_log_id not between", value1, value2, "projectLogId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectStepIsNull() {
            addCriterion("project_step is null");
            return (Criteria) this;
        }

        public Criteria andProjectStepIsNotNull() {
            addCriterion("project_step is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStepEqualTo(String value) {
            addCriterion("project_step =", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepNotEqualTo(String value) {
            addCriterion("project_step <>", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepGreaterThan(String value) {
            addCriterion("project_step >", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepGreaterThanOrEqualTo(String value) {
            addCriterion("project_step >=", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepLessThan(String value) {
            addCriterion("project_step <", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepLessThanOrEqualTo(String value) {
            addCriterion("project_step <=", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepLike(String value) {
            addCriterion("project_step like", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepNotLike(String value) {
            addCriterion("project_step not like", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepIn(List<String> values) {
            addCriterion("project_step in", values, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepNotIn(List<String> values) {
            addCriterion("project_step not in", values, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepBetween(String value1, String value2) {
            addCriterion("project_step between", value1, value2, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepNotBetween(String value1, String value2) {
            addCriterion("project_step not between", value1, value2, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeIsNull() {
            addCriterion("project_step_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeIsNotNull() {
            addCriterion("project_step_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeEqualTo(Integer value) {
            addCriterion("project_step_type =", value, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeNotEqualTo(Integer value) {
            addCriterion("project_step_type <>", value, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeGreaterThan(Integer value) {
            addCriterion("project_step_type >", value, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_step_type >=", value, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeLessThan(Integer value) {
            addCriterion("project_step_type <", value, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeLessThanOrEqualTo(Integer value) {
            addCriterion("project_step_type <=", value, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeIn(List<Integer> values) {
            addCriterion("project_step_type in", values, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeNotIn(List<Integer> values) {
            addCriterion("project_step_type not in", values, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeBetween(Integer value1, Integer value2) {
            addCriterion("project_step_type between", value1, value2, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_step_type not between", value1, value2, "projectStepType");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartIsNull() {
            addCriterion("project_step_start is null");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartIsNotNull() {
            addCriterion("project_step_start is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartEqualTo(Date value) {
            addCriterion("project_step_start =", value, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartNotEqualTo(Date value) {
            addCriterion("project_step_start <>", value, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartGreaterThan(Date value) {
            addCriterion("project_step_start >", value, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartGreaterThanOrEqualTo(Date value) {
            addCriterion("project_step_start >=", value, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartLessThan(Date value) {
            addCriterion("project_step_start <", value, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartLessThanOrEqualTo(Date value) {
            addCriterion("project_step_start <=", value, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartIn(List<Date> values) {
            addCriterion("project_step_start in", values, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartNotIn(List<Date> values) {
            addCriterion("project_step_start not in", values, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartBetween(Date value1, Date value2) {
            addCriterion("project_step_start between", value1, value2, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepStartNotBetween(Date value1, Date value2) {
            addCriterion("project_step_start not between", value1, value2, "projectStepStart");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndIsNull() {
            addCriterion("project_step_end is null");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndIsNotNull() {
            addCriterion("project_step_end is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndEqualTo(Date value) {
            addCriterion("project_step_end =", value, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndNotEqualTo(Date value) {
            addCriterion("project_step_end <>", value, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndGreaterThan(Date value) {
            addCriterion("project_step_end >", value, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndGreaterThanOrEqualTo(Date value) {
            addCriterion("project_step_end >=", value, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndLessThan(Date value) {
            addCriterion("project_step_end <", value, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndLessThanOrEqualTo(Date value) {
            addCriterion("project_step_end <=", value, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndIn(List<Date> values) {
            addCriterion("project_step_end in", values, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndNotIn(List<Date> values) {
            addCriterion("project_step_end not in", values, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndBetween(Date value1, Date value2) {
            addCriterion("project_step_end between", value1, value2, "projectStepEnd");
            return (Criteria) this;
        }

        public Criteria andProjectStepEndNotBetween(Date value1, Date value2) {
            addCriterion("project_step_end not between", value1, value2, "projectStepEnd");
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