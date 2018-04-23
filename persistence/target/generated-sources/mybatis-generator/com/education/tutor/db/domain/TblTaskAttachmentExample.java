package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTaskAttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTaskAttachmentExample() {
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

        public Criteria andTaskAttachmentIdIsNull() {
            addCriterion("task_attachment_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdIsNotNull() {
            addCriterion("task_attachment_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdEqualTo(Long value) {
            addCriterion("task_attachment_id =", value, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdNotEqualTo(Long value) {
            addCriterion("task_attachment_id <>", value, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdGreaterThan(Long value) {
            addCriterion("task_attachment_id >", value, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_attachment_id >=", value, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdLessThan(Long value) {
            addCriterion("task_attachment_id <", value, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdLessThanOrEqualTo(Long value) {
            addCriterion("task_attachment_id <=", value, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdIn(List<Long> values) {
            addCriterion("task_attachment_id in", values, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdNotIn(List<Long> values) {
            addCriterion("task_attachment_id not in", values, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdBetween(Long value1, Long value2) {
            addCriterion("task_attachment_id between", value1, value2, "taskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andTaskAttachmentIdNotBetween(Long value1, Long value2) {
            addCriterion("task_attachment_id not between", value1, value2, "taskAttachmentId");
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

        public Criteria andInTaskAttachmentIdIsNull() {
            addCriterion("in_task_attachment_id is null");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdIsNotNull() {
            addCriterion("in_task_attachment_id is not null");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdEqualTo(Long value) {
            addCriterion("in_task_attachment_id =", value, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdNotEqualTo(Long value) {
            addCriterion("in_task_attachment_id <>", value, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdGreaterThan(Long value) {
            addCriterion("in_task_attachment_id >", value, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("in_task_attachment_id >=", value, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdLessThan(Long value) {
            addCriterion("in_task_attachment_id <", value, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdLessThanOrEqualTo(Long value) {
            addCriterion("in_task_attachment_id <=", value, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdIn(List<Long> values) {
            addCriterion("in_task_attachment_id in", values, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdNotIn(List<Long> values) {
            addCriterion("in_task_attachment_id not in", values, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdBetween(Long value1, Long value2) {
            addCriterion("in_task_attachment_id between", value1, value2, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andInTaskAttachmentIdNotBetween(Long value1, Long value2) {
            addCriterion("in_task_attachment_id not between", value1, value2, "inTaskAttachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescIsNull() {
            addCriterion("attachment_desc is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescIsNotNull() {
            addCriterion("attachment_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescEqualTo(String value) {
            addCriterion("attachment_desc =", value, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescNotEqualTo(String value) {
            addCriterion("attachment_desc <>", value, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescGreaterThan(String value) {
            addCriterion("attachment_desc >", value, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_desc >=", value, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescLessThan(String value) {
            addCriterion("attachment_desc <", value, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescLessThanOrEqualTo(String value) {
            addCriterion("attachment_desc <=", value, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescLike(String value) {
            addCriterion("attachment_desc like", value, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescNotLike(String value) {
            addCriterion("attachment_desc not like", value, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescIn(List<String> values) {
            addCriterion("attachment_desc in", values, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescNotIn(List<String> values) {
            addCriterion("attachment_desc not in", values, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescBetween(String value1, String value2) {
            addCriterion("attachment_desc between", value1, value2, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andAttachmentDescNotBetween(String value1, String value2) {
            addCriterion("attachment_desc not between", value1, value2, "attachmentDesc");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnIsNull() {
            addCriterion("task_private_own is null");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnIsNotNull() {
            addCriterion("task_private_own is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnEqualTo(Short value) {
            addCriterion("task_private_own =", value, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnNotEqualTo(Short value) {
            addCriterion("task_private_own <>", value, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnGreaterThan(Short value) {
            addCriterion("task_private_own >", value, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnGreaterThanOrEqualTo(Short value) {
            addCriterion("task_private_own >=", value, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnLessThan(Short value) {
            addCriterion("task_private_own <", value, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnLessThanOrEqualTo(Short value) {
            addCriterion("task_private_own <=", value, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnIn(List<Short> values) {
            addCriterion("task_private_own in", values, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnNotIn(List<Short> values) {
            addCriterion("task_private_own not in", values, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnBetween(Short value1, Short value2) {
            addCriterion("task_private_own between", value1, value2, "taskPrivateOwn");
            return (Criteria) this;
        }

        public Criteria andTaskPrivateOwnNotBetween(Short value1, Short value2) {
            addCriterion("task_private_own not between", value1, value2, "taskPrivateOwn");
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