package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTaskDependExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTaskDependExample() {
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

        public Criteria andTaskDependIdIsNull() {
            addCriterion("task_depend_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdIsNotNull() {
            addCriterion("task_depend_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdEqualTo(Long value) {
            addCriterion("task_depend_id =", value, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdNotEqualTo(Long value) {
            addCriterion("task_depend_id <>", value, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdGreaterThan(Long value) {
            addCriterion("task_depend_id >", value, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_depend_id >=", value, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdLessThan(Long value) {
            addCriterion("task_depend_id <", value, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdLessThanOrEqualTo(Long value) {
            addCriterion("task_depend_id <=", value, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdIn(List<Long> values) {
            addCriterion("task_depend_id in", values, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdNotIn(List<Long> values) {
            addCriterion("task_depend_id not in", values, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdBetween(Long value1, Long value2) {
            addCriterion("task_depend_id between", value1, value2, "taskDependId");
            return (Criteria) this;
        }

        public Criteria andTaskDependIdNotBetween(Long value1, Long value2) {
            addCriterion("task_depend_id not between", value1, value2, "taskDependId");
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

        public Criteria andTaskDependByIdIsNull() {
            addCriterion("task_depend_by_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdIsNotNull() {
            addCriterion("task_depend_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdEqualTo(Long value) {
            addCriterion("task_depend_by_id =", value, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdNotEqualTo(Long value) {
            addCriterion("task_depend_by_id <>", value, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdGreaterThan(Long value) {
            addCriterion("task_depend_by_id >", value, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_depend_by_id >=", value, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdLessThan(Long value) {
            addCriterion("task_depend_by_id <", value, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdLessThanOrEqualTo(Long value) {
            addCriterion("task_depend_by_id <=", value, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdIn(List<Long> values) {
            addCriterion("task_depend_by_id in", values, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdNotIn(List<Long> values) {
            addCriterion("task_depend_by_id not in", values, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdBetween(Long value1, Long value2) {
            addCriterion("task_depend_by_id between", value1, value2, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andTaskDependByIdNotBetween(Long value1, Long value2) {
            addCriterion("task_depend_by_id not between", value1, value2, "taskDependById");
            return (Criteria) this;
        }

        public Criteria andDependsTypeIsNull() {
            addCriterion("depends_type is null");
            return (Criteria) this;
        }

        public Criteria andDependsTypeIsNotNull() {
            addCriterion("depends_type is not null");
            return (Criteria) this;
        }

        public Criteria andDependsTypeEqualTo(Integer value) {
            addCriterion("depends_type =", value, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeNotEqualTo(Integer value) {
            addCriterion("depends_type <>", value, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeGreaterThan(Integer value) {
            addCriterion("depends_type >", value, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("depends_type >=", value, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeLessThan(Integer value) {
            addCriterion("depends_type <", value, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("depends_type <=", value, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeIn(List<Integer> values) {
            addCriterion("depends_type in", values, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeNotIn(List<Integer> values) {
            addCriterion("depends_type not in", values, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeBetween(Integer value1, Integer value2) {
            addCriterion("depends_type between", value1, value2, "dependsType");
            return (Criteria) this;
        }

        public Criteria andDependsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("depends_type not between", value1, value2, "dependsType");
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