package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblActionEventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblActionEventExample() {
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

        public Criteria andActionEventIdIsNull() {
            addCriterion("action_event_id is null");
            return (Criteria) this;
        }

        public Criteria andActionEventIdIsNotNull() {
            addCriterion("action_event_id is not null");
            return (Criteria) this;
        }

        public Criteria andActionEventIdEqualTo(Long value) {
            addCriterion("action_event_id =", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdNotEqualTo(Long value) {
            addCriterion("action_event_id <>", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdGreaterThan(Long value) {
            addCriterion("action_event_id >", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("action_event_id >=", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdLessThan(Long value) {
            addCriterion("action_event_id <", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdLessThanOrEqualTo(Long value) {
            addCriterion("action_event_id <=", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdIn(List<Long> values) {
            addCriterion("action_event_id in", values, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdNotIn(List<Long> values) {
            addCriterion("action_event_id not in", values, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdBetween(Long value1, Long value2) {
            addCriterion("action_event_id between", value1, value2, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdNotBetween(Long value1, Long value2) {
            addCriterion("action_event_id not between", value1, value2, "actionEventId");
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

        public Criteria andActionEventTypeIsNull() {
            addCriterion("action_event_type is null");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeIsNotNull() {
            addCriterion("action_event_type is not null");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeEqualTo(Integer value) {
            addCriterion("action_event_type =", value, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeNotEqualTo(Integer value) {
            addCriterion("action_event_type <>", value, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeGreaterThan(Integer value) {
            addCriterion("action_event_type >", value, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_event_type >=", value, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeLessThan(Integer value) {
            addCriterion("action_event_type <", value, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeLessThanOrEqualTo(Integer value) {
            addCriterion("action_event_type <=", value, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeIn(List<Integer> values) {
            addCriterion("action_event_type in", values, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeNotIn(List<Integer> values) {
            addCriterion("action_event_type not in", values, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeBetween(Integer value1, Integer value2) {
            addCriterion("action_event_type between", value1, value2, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("action_event_type not between", value1, value2, "actionEventType");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainIsNull() {
            addCriterion("action_event_domain is null");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainIsNotNull() {
            addCriterion("action_event_domain is not null");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainEqualTo(Integer value) {
            addCriterion("action_event_domain =", value, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainNotEqualTo(Integer value) {
            addCriterion("action_event_domain <>", value, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainGreaterThan(Integer value) {
            addCriterion("action_event_domain >", value, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_event_domain >=", value, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainLessThan(Integer value) {
            addCriterion("action_event_domain <", value, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainLessThanOrEqualTo(Integer value) {
            addCriterion("action_event_domain <=", value, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainIn(List<Integer> values) {
            addCriterion("action_event_domain in", values, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainNotIn(List<Integer> values) {
            addCriterion("action_event_domain not in", values, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainBetween(Integer value1, Integer value2) {
            addCriterion("action_event_domain between", value1, value2, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDomainNotBetween(Integer value1, Integer value2) {
            addCriterion("action_event_domain not between", value1, value2, "actionEventDomain");
            return (Criteria) this;
        }

        public Criteria andActionEventDescIsNull() {
            addCriterion("action_event_desc is null");
            return (Criteria) this;
        }

        public Criteria andActionEventDescIsNotNull() {
            addCriterion("action_event_desc is not null");
            return (Criteria) this;
        }

        public Criteria andActionEventDescEqualTo(String value) {
            addCriterion("action_event_desc =", value, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescNotEqualTo(String value) {
            addCriterion("action_event_desc <>", value, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescGreaterThan(String value) {
            addCriterion("action_event_desc >", value, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescGreaterThanOrEqualTo(String value) {
            addCriterion("action_event_desc >=", value, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescLessThan(String value) {
            addCriterion("action_event_desc <", value, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescLessThanOrEqualTo(String value) {
            addCriterion("action_event_desc <=", value, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescLike(String value) {
            addCriterion("action_event_desc like", value, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescNotLike(String value) {
            addCriterion("action_event_desc not like", value, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescIn(List<String> values) {
            addCriterion("action_event_desc in", values, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescNotIn(List<String> values) {
            addCriterion("action_event_desc not in", values, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescBetween(String value1, String value2) {
            addCriterion("action_event_desc between", value1, value2, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andActionEventDescNotBetween(String value1, String value2) {
            addCriterion("action_event_desc not between", value1, value2, "actionEventDesc");
            return (Criteria) this;
        }

        public Criteria andBeforeStateIsNull() {
            addCriterion("before_state is null");
            return (Criteria) this;
        }

        public Criteria andBeforeStateIsNotNull() {
            addCriterion("before_state is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeStateEqualTo(String value) {
            addCriterion("before_state =", value, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateNotEqualTo(String value) {
            addCriterion("before_state <>", value, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateGreaterThan(String value) {
            addCriterion("before_state >", value, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateGreaterThanOrEqualTo(String value) {
            addCriterion("before_state >=", value, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateLessThan(String value) {
            addCriterion("before_state <", value, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateLessThanOrEqualTo(String value) {
            addCriterion("before_state <=", value, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateLike(String value) {
            addCriterion("before_state like", value, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateNotLike(String value) {
            addCriterion("before_state not like", value, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateIn(List<String> values) {
            addCriterion("before_state in", values, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateNotIn(List<String> values) {
            addCriterion("before_state not in", values, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateBetween(String value1, String value2) {
            addCriterion("before_state between", value1, value2, "beforeState");
            return (Criteria) this;
        }

        public Criteria andBeforeStateNotBetween(String value1, String value2) {
            addCriterion("before_state not between", value1, value2, "beforeState");
            return (Criteria) this;
        }

        public Criteria andAfterStateIsNull() {
            addCriterion("after_state is null");
            return (Criteria) this;
        }

        public Criteria andAfterStateIsNotNull() {
            addCriterion("after_state is not null");
            return (Criteria) this;
        }

        public Criteria andAfterStateEqualTo(String value) {
            addCriterion("after_state =", value, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateNotEqualTo(String value) {
            addCriterion("after_state <>", value, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateGreaterThan(String value) {
            addCriterion("after_state >", value, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateGreaterThanOrEqualTo(String value) {
            addCriterion("after_state >=", value, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateLessThan(String value) {
            addCriterion("after_state <", value, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateLessThanOrEqualTo(String value) {
            addCriterion("after_state <=", value, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateLike(String value) {
            addCriterion("after_state like", value, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateNotLike(String value) {
            addCriterion("after_state not like", value, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateIn(List<String> values) {
            addCriterion("after_state in", values, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateNotIn(List<String> values) {
            addCriterion("after_state not in", values, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateBetween(String value1, String value2) {
            addCriterion("after_state between", value1, value2, "afterState");
            return (Criteria) this;
        }

        public Criteria andAfterStateNotBetween(String value1, String value2) {
            addCriterion("after_state not between", value1, value2, "afterState");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameIsNull() {
            addCriterion("primary_table_name is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameIsNotNull() {
            addCriterion("primary_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameEqualTo(String value) {
            addCriterion("primary_table_name =", value, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameNotEqualTo(String value) {
            addCriterion("primary_table_name <>", value, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameGreaterThan(String value) {
            addCriterion("primary_table_name >", value, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("primary_table_name >=", value, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameLessThan(String value) {
            addCriterion("primary_table_name <", value, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameLessThanOrEqualTo(String value) {
            addCriterion("primary_table_name <=", value, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameLike(String value) {
            addCriterion("primary_table_name like", value, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameNotLike(String value) {
            addCriterion("primary_table_name not like", value, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameIn(List<String> values) {
            addCriterion("primary_table_name in", values, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameNotIn(List<String> values) {
            addCriterion("primary_table_name not in", values, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameBetween(String value1, String value2) {
            addCriterion("primary_table_name between", value1, value2, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryTableNameNotBetween(String value1, String value2) {
            addCriterion("primary_table_name not between", value1, value2, "primaryTableName");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdIsNull() {
            addCriterion("primary_data_id is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdIsNotNull() {
            addCriterion("primary_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdEqualTo(Long value) {
            addCriterion("primary_data_id =", value, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdNotEqualTo(Long value) {
            addCriterion("primary_data_id <>", value, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdGreaterThan(Long value) {
            addCriterion("primary_data_id >", value, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdGreaterThanOrEqualTo(Long value) {
            addCriterion("primary_data_id >=", value, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdLessThan(Long value) {
            addCriterion("primary_data_id <", value, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdLessThanOrEqualTo(Long value) {
            addCriterion("primary_data_id <=", value, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdIn(List<Long> values) {
            addCriterion("primary_data_id in", values, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdNotIn(List<Long> values) {
            addCriterion("primary_data_id not in", values, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdBetween(Long value1, Long value2) {
            addCriterion("primary_data_id between", value1, value2, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andPrimaryDataIdNotBetween(Long value1, Long value2) {
            addCriterion("primary_data_id not between", value1, value2, "primaryDataId");
            return (Criteria) this;
        }

        public Criteria andTransactionStateIsNull() {
            addCriterion("transaction_state is null");
            return (Criteria) this;
        }

        public Criteria andTransactionStateIsNotNull() {
            addCriterion("transaction_state is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionStateEqualTo(Integer value) {
            addCriterion("transaction_state =", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateNotEqualTo(Integer value) {
            addCriterion("transaction_state <>", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateGreaterThan(Integer value) {
            addCriterion("transaction_state >", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_state >=", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateLessThan(Integer value) {
            addCriterion("transaction_state <", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_state <=", value, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateIn(List<Integer> values) {
            addCriterion("transaction_state in", values, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateNotIn(List<Integer> values) {
            addCriterion("transaction_state not in", values, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateBetween(Integer value1, Integer value2) {
            addCriterion("transaction_state between", value1, value2, "transactionState");
            return (Criteria) this;
        }

        public Criteria andTransactionStateNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_state not between", value1, value2, "transactionState");
            return (Criteria) this;
        }

        public Criteria andOccuredIpIsNull() {
            addCriterion("occured_ip is null");
            return (Criteria) this;
        }

        public Criteria andOccuredIpIsNotNull() {
            addCriterion("occured_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOccuredIpEqualTo(String value) {
            addCriterion("occured_ip =", value, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpNotEqualTo(String value) {
            addCriterion("occured_ip <>", value, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpGreaterThan(String value) {
            addCriterion("occured_ip >", value, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpGreaterThanOrEqualTo(String value) {
            addCriterion("occured_ip >=", value, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpLessThan(String value) {
            addCriterion("occured_ip <", value, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpLessThanOrEqualTo(String value) {
            addCriterion("occured_ip <=", value, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpLike(String value) {
            addCriterion("occured_ip like", value, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpNotLike(String value) {
            addCriterion("occured_ip not like", value, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpIn(List<String> values) {
            addCriterion("occured_ip in", values, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpNotIn(List<String> values) {
            addCriterion("occured_ip not in", values, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpBetween(String value1, String value2) {
            addCriterion("occured_ip between", value1, value2, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredIpNotBetween(String value1, String value2) {
            addCriterion("occured_ip not between", value1, value2, "occuredIp");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationIsNull() {
            addCriterion("occured_location is null");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationIsNotNull() {
            addCriterion("occured_location is not null");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationEqualTo(String value) {
            addCriterion("occured_location =", value, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationNotEqualTo(String value) {
            addCriterion("occured_location <>", value, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationGreaterThan(String value) {
            addCriterion("occured_location >", value, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationGreaterThanOrEqualTo(String value) {
            addCriterion("occured_location >=", value, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationLessThan(String value) {
            addCriterion("occured_location <", value, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationLessThanOrEqualTo(String value) {
            addCriterion("occured_location <=", value, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationLike(String value) {
            addCriterion("occured_location like", value, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationNotLike(String value) {
            addCriterion("occured_location not like", value, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationIn(List<String> values) {
            addCriterion("occured_location in", values, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationNotIn(List<String> values) {
            addCriterion("occured_location not in", values, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationBetween(String value1, String value2) {
            addCriterion("occured_location between", value1, value2, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredLocationNotBetween(String value1, String value2) {
            addCriterion("occured_location not between", value1, value2, "occuredLocation");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceIsNull() {
            addCriterion("occured_device is null");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceIsNotNull() {
            addCriterion("occured_device is not null");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceEqualTo(String value) {
            addCriterion("occured_device =", value, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceNotEqualTo(String value) {
            addCriterion("occured_device <>", value, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceGreaterThan(String value) {
            addCriterion("occured_device >", value, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("occured_device >=", value, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceLessThan(String value) {
            addCriterion("occured_device <", value, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceLessThanOrEqualTo(String value) {
            addCriterion("occured_device <=", value, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceLike(String value) {
            addCriterion("occured_device like", value, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceNotLike(String value) {
            addCriterion("occured_device not like", value, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceIn(List<String> values) {
            addCriterion("occured_device in", values, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceNotIn(List<String> values) {
            addCriterion("occured_device not in", values, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceBetween(String value1, String value2) {
            addCriterion("occured_device between", value1, value2, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredDeviceNotBetween(String value1, String value2) {
            addCriterion("occured_device not between", value1, value2, "occuredDevice");
            return (Criteria) this;
        }

        public Criteria andOccuredAtIsNull() {
            addCriterion("occured_at is null");
            return (Criteria) this;
        }

        public Criteria andOccuredAtIsNotNull() {
            addCriterion("occured_at is not null");
            return (Criteria) this;
        }

        public Criteria andOccuredAtEqualTo(Date value) {
            addCriterion("occured_at =", value, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtNotEqualTo(Date value) {
            addCriterion("occured_at <>", value, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtGreaterThan(Date value) {
            addCriterion("occured_at >", value, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtGreaterThanOrEqualTo(Date value) {
            addCriterion("occured_at >=", value, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtLessThan(Date value) {
            addCriterion("occured_at <", value, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtLessThanOrEqualTo(Date value) {
            addCriterion("occured_at <=", value, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtIn(List<Date> values) {
            addCriterion("occured_at in", values, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtNotIn(List<Date> values) {
            addCriterion("occured_at not in", values, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtBetween(Date value1, Date value2) {
            addCriterion("occured_at between", value1, value2, "occuredAt");
            return (Criteria) this;
        }

        public Criteria andOccuredAtNotBetween(Date value1, Date value2) {
            addCriterion("occured_at not between", value1, value2, "occuredAt");
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