package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTaskAssignmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTaskAssignmentExample() {
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

        public Criteria andTaskAssignmentIdIsNull() {
            addCriterion("task_assignment_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdIsNotNull() {
            addCriterion("task_assignment_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdEqualTo(Long value) {
            addCriterion("task_assignment_id =", value, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdNotEqualTo(Long value) {
            addCriterion("task_assignment_id <>", value, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdGreaterThan(Long value) {
            addCriterion("task_assignment_id >", value, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_assignment_id >=", value, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdLessThan(Long value) {
            addCriterion("task_assignment_id <", value, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdLessThanOrEqualTo(Long value) {
            addCriterion("task_assignment_id <=", value, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdIn(List<Long> values) {
            addCriterion("task_assignment_id in", values, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdNotIn(List<Long> values) {
            addCriterion("task_assignment_id not in", values, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdBetween(Long value1, Long value2) {
            addCriterion("task_assignment_id between", value1, value2, "taskAssignmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignmentIdNotBetween(Long value1, Long value2) {
            addCriterion("task_assignment_id not between", value1, value2, "taskAssignmentId");
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

        public Criteria andAssignedByIsNull() {
            addCriterion("assigned_by is null");
            return (Criteria) this;
        }

        public Criteria andAssignedByIsNotNull() {
            addCriterion("assigned_by is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedByEqualTo(String value) {
            addCriterion("assigned_by =", value, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByNotEqualTo(String value) {
            addCriterion("assigned_by <>", value, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByGreaterThan(String value) {
            addCriterion("assigned_by >", value, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByGreaterThanOrEqualTo(String value) {
            addCriterion("assigned_by >=", value, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByLessThan(String value) {
            addCriterion("assigned_by <", value, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByLessThanOrEqualTo(String value) {
            addCriterion("assigned_by <=", value, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByLike(String value) {
            addCriterion("assigned_by like", value, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByNotLike(String value) {
            addCriterion("assigned_by not like", value, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByIn(List<String> values) {
            addCriterion("assigned_by in", values, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByNotIn(List<String> values) {
            addCriterion("assigned_by not in", values, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByBetween(String value1, String value2) {
            addCriterion("assigned_by between", value1, value2, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedByNotBetween(String value1, String value2) {
            addCriterion("assigned_by not between", value1, value2, "assignedBy");
            return (Criteria) this;
        }

        public Criteria andAssignedToIsNull() {
            addCriterion("assigned_to is null");
            return (Criteria) this;
        }

        public Criteria andAssignedToIsNotNull() {
            addCriterion("assigned_to is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedToEqualTo(String value) {
            addCriterion("assigned_to =", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToNotEqualTo(String value) {
            addCriterion("assigned_to <>", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToGreaterThan(String value) {
            addCriterion("assigned_to >", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToGreaterThanOrEqualTo(String value) {
            addCriterion("assigned_to >=", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToLessThan(String value) {
            addCriterion("assigned_to <", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToLessThanOrEqualTo(String value) {
            addCriterion("assigned_to <=", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToLike(String value) {
            addCriterion("assigned_to like", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToNotLike(String value) {
            addCriterion("assigned_to not like", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToIn(List<String> values) {
            addCriterion("assigned_to in", values, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToNotIn(List<String> values) {
            addCriterion("assigned_to not in", values, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToBetween(String value1, String value2) {
            addCriterion("assigned_to between", value1, value2, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToNotBetween(String value1, String value2) {
            addCriterion("assigned_to not between", value1, value2, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeIsNull() {
            addCriterion("assigned_type is null");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeIsNotNull() {
            addCriterion("assigned_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeEqualTo(Integer value) {
            addCriterion("assigned_type =", value, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeNotEqualTo(Integer value) {
            addCriterion("assigned_type <>", value, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeGreaterThan(Integer value) {
            addCriterion("assigned_type >", value, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("assigned_type >=", value, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeLessThan(Integer value) {
            addCriterion("assigned_type <", value, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeLessThanOrEqualTo(Integer value) {
            addCriterion("assigned_type <=", value, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeIn(List<Integer> values) {
            addCriterion("assigned_type in", values, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeNotIn(List<Integer> values) {
            addCriterion("assigned_type not in", values, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeBetween(Integer value1, Integer value2) {
            addCriterion("assigned_type between", value1, value2, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("assigned_type not between", value1, value2, "assignedType");
            return (Criteria) this;
        }

        public Criteria andAssignedStateIsNull() {
            addCriterion("assigned_state is null");
            return (Criteria) this;
        }

        public Criteria andAssignedStateIsNotNull() {
            addCriterion("assigned_state is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedStateEqualTo(Integer value) {
            addCriterion("assigned_state =", value, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateNotEqualTo(Integer value) {
            addCriterion("assigned_state <>", value, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateGreaterThan(Integer value) {
            addCriterion("assigned_state >", value, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("assigned_state >=", value, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateLessThan(Integer value) {
            addCriterion("assigned_state <", value, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateLessThanOrEqualTo(Integer value) {
            addCriterion("assigned_state <=", value, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateIn(List<Integer> values) {
            addCriterion("assigned_state in", values, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateNotIn(List<Integer> values) {
            addCriterion("assigned_state not in", values, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateBetween(Integer value1, Integer value2) {
            addCriterion("assigned_state between", value1, value2, "assignedState");
            return (Criteria) this;
        }

        public Criteria andAssignedStateNotBetween(Integer value1, Integer value2) {
            addCriterion("assigned_state not between", value1, value2, "assignedState");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIsNull() {
            addCriterion("refuse_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIsNotNull() {
            addCriterion("refuse_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonEqualTo(String value) {
            addCriterion("refuse_reason =", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotEqualTo(String value) {
            addCriterion("refuse_reason <>", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonGreaterThan(String value) {
            addCriterion("refuse_reason >", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("refuse_reason >=", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLessThan(String value) {
            addCriterion("refuse_reason <", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLessThanOrEqualTo(String value) {
            addCriterion("refuse_reason <=", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLike(String value) {
            addCriterion("refuse_reason like", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotLike(String value) {
            addCriterion("refuse_reason not like", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIn(List<String> values) {
            addCriterion("refuse_reason in", values, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotIn(List<String> values) {
            addCriterion("refuse_reason not in", values, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonBetween(String value1, String value2) {
            addCriterion("refuse_reason between", value1, value2, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotBetween(String value1, String value2) {
            addCriterion("refuse_reason not between", value1, value2, "refuseReason");
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