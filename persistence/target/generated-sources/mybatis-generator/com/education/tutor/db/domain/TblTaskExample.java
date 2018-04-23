package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTaskExample() {
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

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskContentIsNull() {
            addCriterion("task_content is null");
            return (Criteria) this;
        }

        public Criteria andTaskContentIsNotNull() {
            addCriterion("task_content is not null");
            return (Criteria) this;
        }

        public Criteria andTaskContentEqualTo(String value) {
            addCriterion("task_content =", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotEqualTo(String value) {
            addCriterion("task_content <>", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentGreaterThan(String value) {
            addCriterion("task_content >", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentGreaterThanOrEqualTo(String value) {
            addCriterion("task_content >=", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLessThan(String value) {
            addCriterion("task_content <", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLessThanOrEqualTo(String value) {
            addCriterion("task_content <=", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLike(String value) {
            addCriterion("task_content like", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotLike(String value) {
            addCriterion("task_content not like", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentIn(List<String> values) {
            addCriterion("task_content in", values, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotIn(List<String> values) {
            addCriterion("task_content not in", values, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentBetween(String value1, String value2) {
            addCriterion("task_content between", value1, value2, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotBetween(String value1, String value2) {
            addCriterion("task_content not between", value1, value2, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkIsNull() {
            addCriterion("task_data_pk is null");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkIsNotNull() {
            addCriterion("task_data_pk is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkEqualTo(Long value) {
            addCriterion("task_data_pk =", value, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkNotEqualTo(Long value) {
            addCriterion("task_data_pk <>", value, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkGreaterThan(Long value) {
            addCriterion("task_data_pk >", value, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkGreaterThanOrEqualTo(Long value) {
            addCriterion("task_data_pk >=", value, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkLessThan(Long value) {
            addCriterion("task_data_pk <", value, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkLessThanOrEqualTo(Long value) {
            addCriterion("task_data_pk <=", value, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkIn(List<Long> values) {
            addCriterion("task_data_pk in", values, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkNotIn(List<Long> values) {
            addCriterion("task_data_pk not in", values, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkBetween(Long value1, Long value2) {
            addCriterion("task_data_pk between", value1, value2, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskDataPkNotBetween(Long value1, Long value2) {
            addCriterion("task_data_pk not between", value1, value2, "taskDataPk");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(Integer value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(Integer value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(Integer value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(Integer value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(Integer value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<Integer> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<Integer> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(Integer value1, Integer value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNull() {
            addCriterion("task_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNotNull() {
            addCriterion("task_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStateEqualTo(Integer value) {
            addCriterion("task_state =", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotEqualTo(Integer value) {
            addCriterion("task_state <>", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThan(Integer value) {
            addCriterion("task_state >", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_state >=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThan(Integer value) {
            addCriterion("task_state <", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThanOrEqualTo(Integer value) {
            addCriterion("task_state <=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateIn(List<Integer> values) {
            addCriterion("task_state in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotIn(List<Integer> values) {
            addCriterion("task_state not in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateBetween(Integer value1, Integer value2) {
            addCriterion("task_state between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotBetween(Integer value1, Integer value2) {
            addCriterion("task_state not between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdIsNull() {
            addCriterion("parent_task_id is null");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdIsNotNull() {
            addCriterion("parent_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdEqualTo(Long value) {
            addCriterion("parent_task_id =", value, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdNotEqualTo(Long value) {
            addCriterion("parent_task_id <>", value, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdGreaterThan(Long value) {
            addCriterion("parent_task_id >", value, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_task_id >=", value, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdLessThan(Long value) {
            addCriterion("parent_task_id <", value, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_task_id <=", value, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdIn(List<Long> values) {
            addCriterion("parent_task_id in", values, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdNotIn(List<Long> values) {
            addCriterion("parent_task_id not in", values, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdBetween(Long value1, Long value2) {
            addCriterion("parent_task_id between", value1, value2, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andParentTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_task_id not between", value1, value2, "parentTaskId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtIsNull() {
            addCriterion("plan_start_at is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtIsNotNull() {
            addCriterion("plan_start_at is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtEqualTo(Date value) {
            addCriterion("plan_start_at =", value, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtNotEqualTo(Date value) {
            addCriterion("plan_start_at <>", value, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtGreaterThan(Date value) {
            addCriterion("plan_start_at >", value, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_start_at >=", value, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtLessThan(Date value) {
            addCriterion("plan_start_at <", value, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtLessThanOrEqualTo(Date value) {
            addCriterion("plan_start_at <=", value, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtIn(List<Date> values) {
            addCriterion("plan_start_at in", values, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtNotIn(List<Date> values) {
            addCriterion("plan_start_at not in", values, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtBetween(Date value1, Date value2) {
            addCriterion("plan_start_at between", value1, value2, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanStartAtNotBetween(Date value1, Date value2) {
            addCriterion("plan_start_at not between", value1, value2, "planStartAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtIsNull() {
            addCriterion("plan_end_at is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtIsNotNull() {
            addCriterion("plan_end_at is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtEqualTo(Date value) {
            addCriterion("plan_end_at =", value, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtNotEqualTo(Date value) {
            addCriterion("plan_end_at <>", value, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtGreaterThan(Date value) {
            addCriterion("plan_end_at >", value, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_end_at >=", value, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtLessThan(Date value) {
            addCriterion("plan_end_at <", value, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtLessThanOrEqualTo(Date value) {
            addCriterion("plan_end_at <=", value, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtIn(List<Date> values) {
            addCriterion("plan_end_at in", values, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtNotIn(List<Date> values) {
            addCriterion("plan_end_at not in", values, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtBetween(Date value1, Date value2) {
            addCriterion("plan_end_at between", value1, value2, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andPlanEndAtNotBetween(Date value1, Date value2) {
            addCriterion("plan_end_at not between", value1, value2, "planEndAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtIsNull() {
            addCriterion("inforce_at is null");
            return (Criteria) this;
        }

        public Criteria andInforceAtIsNotNull() {
            addCriterion("inforce_at is not null");
            return (Criteria) this;
        }

        public Criteria andInforceAtEqualTo(Date value) {
            addCriterion("inforce_at =", value, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtNotEqualTo(Date value) {
            addCriterion("inforce_at <>", value, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtGreaterThan(Date value) {
            addCriterion("inforce_at >", value, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtGreaterThanOrEqualTo(Date value) {
            addCriterion("inforce_at >=", value, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtLessThan(Date value) {
            addCriterion("inforce_at <", value, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtLessThanOrEqualTo(Date value) {
            addCriterion("inforce_at <=", value, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtIn(List<Date> values) {
            addCriterion("inforce_at in", values, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtNotIn(List<Date> values) {
            addCriterion("inforce_at not in", values, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtBetween(Date value1, Date value2) {
            addCriterion("inforce_at between", value1, value2, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andInforceAtNotBetween(Date value1, Date value2) {
            addCriterion("inforce_at not between", value1, value2, "inforceAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
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

        public Criteria andAssignedGroupIsNull() {
            addCriterion("assigned_group is null");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupIsNotNull() {
            addCriterion("assigned_group is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupEqualTo(String value) {
            addCriterion("assigned_group =", value, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupNotEqualTo(String value) {
            addCriterion("assigned_group <>", value, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupGreaterThan(String value) {
            addCriterion("assigned_group >", value, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupGreaterThanOrEqualTo(String value) {
            addCriterion("assigned_group >=", value, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupLessThan(String value) {
            addCriterion("assigned_group <", value, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupLessThanOrEqualTo(String value) {
            addCriterion("assigned_group <=", value, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupLike(String value) {
            addCriterion("assigned_group like", value, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupNotLike(String value) {
            addCriterion("assigned_group not like", value, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupIn(List<String> values) {
            addCriterion("assigned_group in", values, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupNotIn(List<String> values) {
            addCriterion("assigned_group not in", values, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupBetween(String value1, String value2) {
            addCriterion("assigned_group between", value1, value2, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedGroupNotBetween(String value1, String value2) {
            addCriterion("assigned_group not between", value1, value2, "assignedGroup");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(Integer value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(Integer value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(Integer value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(Integer value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(Integer value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<Integer> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<Integer> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(Integer value1, Integer value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("progress not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressDescIsNull() {
            addCriterion("progress_desc is null");
            return (Criteria) this;
        }

        public Criteria andProgressDescIsNotNull() {
            addCriterion("progress_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProgressDescEqualTo(String value) {
            addCriterion("progress_desc =", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescNotEqualTo(String value) {
            addCriterion("progress_desc <>", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescGreaterThan(String value) {
            addCriterion("progress_desc >", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescGreaterThanOrEqualTo(String value) {
            addCriterion("progress_desc >=", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescLessThan(String value) {
            addCriterion("progress_desc <", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescLessThanOrEqualTo(String value) {
            addCriterion("progress_desc <=", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescLike(String value) {
            addCriterion("progress_desc like", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescNotLike(String value) {
            addCriterion("progress_desc not like", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescIn(List<String> values) {
            addCriterion("progress_desc in", values, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescNotIn(List<String> values) {
            addCriterion("progress_desc not in", values, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescBetween(String value1, String value2) {
            addCriterion("progress_desc between", value1, value2, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescNotBetween(String value1, String value2) {
            addCriterion("progress_desc not between", value1, value2, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescIsNull() {
            addCriterion("offset_desc is null");
            return (Criteria) this;
        }

        public Criteria andOffsetDescIsNotNull() {
            addCriterion("offset_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetDescEqualTo(String value) {
            addCriterion("offset_desc =", value, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescNotEqualTo(String value) {
            addCriterion("offset_desc <>", value, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescGreaterThan(String value) {
            addCriterion("offset_desc >", value, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescGreaterThanOrEqualTo(String value) {
            addCriterion("offset_desc >=", value, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescLessThan(String value) {
            addCriterion("offset_desc <", value, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescLessThanOrEqualTo(String value) {
            addCriterion("offset_desc <=", value, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescLike(String value) {
            addCriterion("offset_desc like", value, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescNotLike(String value) {
            addCriterion("offset_desc not like", value, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescIn(List<String> values) {
            addCriterion("offset_desc in", values, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescNotIn(List<String> values) {
            addCriterion("offset_desc not in", values, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescBetween(String value1, String value2) {
            addCriterion("offset_desc between", value1, value2, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andOffsetDescNotBetween(String value1, String value2) {
            addCriterion("offset_desc not between", value1, value2, "offsetDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultIsNull() {
            addCriterion("task_result is null");
            return (Criteria) this;
        }

        public Criteria andTaskResultIsNotNull() {
            addCriterion("task_result is not null");
            return (Criteria) this;
        }

        public Criteria andTaskResultEqualTo(Integer value) {
            addCriterion("task_result =", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultNotEqualTo(Integer value) {
            addCriterion("task_result <>", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultGreaterThan(Integer value) {
            addCriterion("task_result >", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_result >=", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultLessThan(Integer value) {
            addCriterion("task_result <", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultLessThanOrEqualTo(Integer value) {
            addCriterion("task_result <=", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultIn(List<Integer> values) {
            addCriterion("task_result in", values, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultNotIn(List<Integer> values) {
            addCriterion("task_result not in", values, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultBetween(Integer value1, Integer value2) {
            addCriterion("task_result between", value1, value2, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultNotBetween(Integer value1, Integer value2) {
            addCriterion("task_result not between", value1, value2, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescIsNull() {
            addCriterion("task_result_desc is null");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescIsNotNull() {
            addCriterion("task_result_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescEqualTo(String value) {
            addCriterion("task_result_desc =", value, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescNotEqualTo(String value) {
            addCriterion("task_result_desc <>", value, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescGreaterThan(String value) {
            addCriterion("task_result_desc >", value, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescGreaterThanOrEqualTo(String value) {
            addCriterion("task_result_desc >=", value, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescLessThan(String value) {
            addCriterion("task_result_desc <", value, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescLessThanOrEqualTo(String value) {
            addCriterion("task_result_desc <=", value, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescLike(String value) {
            addCriterion("task_result_desc like", value, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescNotLike(String value) {
            addCriterion("task_result_desc not like", value, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescIn(List<String> values) {
            addCriterion("task_result_desc in", values, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescNotIn(List<String> values) {
            addCriterion("task_result_desc not in", values, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescBetween(String value1, String value2) {
            addCriterion("task_result_desc between", value1, value2, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultDescNotBetween(String value1, String value2) {
            addCriterion("task_result_desc not between", value1, value2, "taskResultDesc");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkIsNull() {
            addCriterion("task_result_remark is null");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkIsNotNull() {
            addCriterion("task_result_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkEqualTo(String value) {
            addCriterion("task_result_remark =", value, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkNotEqualTo(String value) {
            addCriterion("task_result_remark <>", value, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkGreaterThan(String value) {
            addCriterion("task_result_remark >", value, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("task_result_remark >=", value, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkLessThan(String value) {
            addCriterion("task_result_remark <", value, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkLessThanOrEqualTo(String value) {
            addCriterion("task_result_remark <=", value, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkLike(String value) {
            addCriterion("task_result_remark like", value, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkNotLike(String value) {
            addCriterion("task_result_remark not like", value, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkIn(List<String> values) {
            addCriterion("task_result_remark in", values, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkNotIn(List<String> values) {
            addCriterion("task_result_remark not in", values, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkBetween(String value1, String value2) {
            addCriterion("task_result_remark between", value1, value2, "taskResultRemark");
            return (Criteria) this;
        }

        public Criteria andTaskResultRemarkNotBetween(String value1, String value2) {
            addCriterion("task_result_remark not between", value1, value2, "taskResultRemark");
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