package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblContractRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblContractRelationExample() {
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

        public Criteria andContractRelationIdIsNull() {
            addCriterion("contract_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdIsNotNull() {
            addCriterion("contract_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdEqualTo(Long value) {
            addCriterion("contract_relation_id =", value, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdNotEqualTo(Long value) {
            addCriterion("contract_relation_id <>", value, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdGreaterThan(Long value) {
            addCriterion("contract_relation_id >", value, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contract_relation_id >=", value, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdLessThan(Long value) {
            addCriterion("contract_relation_id <", value, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdLessThanOrEqualTo(Long value) {
            addCriterion("contract_relation_id <=", value, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdIn(List<Long> values) {
            addCriterion("contract_relation_id in", values, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdNotIn(List<Long> values) {
            addCriterion("contract_relation_id not in", values, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdBetween(Long value1, Long value2) {
            addCriterion("contract_relation_id between", value1, value2, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractRelationIdNotBetween(Long value1, Long value2) {
            addCriterion("contract_relation_id not between", value1, value2, "contractRelationId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Long value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Long value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Long value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Long value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Long value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Long> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Long> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Long value1, Long value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Long value1, Long value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("relation_type is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("relation_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(Integer value) {
            addCriterion("relation_type =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(Integer value) {
            addCriterion("relation_type <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(Integer value) {
            addCriterion("relation_type >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_type >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(Integer value) {
            addCriterion("relation_type <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("relation_type <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<Integer> values) {
            addCriterion("relation_type in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<Integer> values) {
            addCriterion("relation_type not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(Integer value1, Integer value2) {
            addCriterion("relation_type between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_type not between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationPkIsNull() {
            addCriterion("relation_pk is null");
            return (Criteria) this;
        }

        public Criteria andRelationPkIsNotNull() {
            addCriterion("relation_pk is not null");
            return (Criteria) this;
        }

        public Criteria andRelationPkEqualTo(Long value) {
            addCriterion("relation_pk =", value, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkNotEqualTo(Long value) {
            addCriterion("relation_pk <>", value, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkGreaterThan(Long value) {
            addCriterion("relation_pk >", value, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkGreaterThanOrEqualTo(Long value) {
            addCriterion("relation_pk >=", value, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkLessThan(Long value) {
            addCriterion("relation_pk <", value, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkLessThanOrEqualTo(Long value) {
            addCriterion("relation_pk <=", value, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkIn(List<Long> values) {
            addCriterion("relation_pk in", values, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkNotIn(List<Long> values) {
            addCriterion("relation_pk not in", values, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkBetween(Long value1, Long value2) {
            addCriterion("relation_pk between", value1, value2, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationPkNotBetween(Long value1, Long value2) {
            addCriterion("relation_pk not between", value1, value2, "relationPk");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionIsNull() {
            addCriterion("relation_description is null");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionIsNotNull() {
            addCriterion("relation_description is not null");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionEqualTo(String value) {
            addCriterion("relation_description =", value, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionNotEqualTo(String value) {
            addCriterion("relation_description <>", value, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionGreaterThan(String value) {
            addCriterion("relation_description >", value, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("relation_description >=", value, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionLessThan(String value) {
            addCriterion("relation_description <", value, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionLessThanOrEqualTo(String value) {
            addCriterion("relation_description <=", value, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionLike(String value) {
            addCriterion("relation_description like", value, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionNotLike(String value) {
            addCriterion("relation_description not like", value, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionIn(List<String> values) {
            addCriterion("relation_description in", values, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionNotIn(List<String> values) {
            addCriterion("relation_description not in", values, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionBetween(String value1, String value2) {
            addCriterion("relation_description between", value1, value2, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationDescriptionNotBetween(String value1, String value2) {
            addCriterion("relation_description not between", value1, value2, "relationDescription");
            return (Criteria) this;
        }

        public Criteria andRelationStateIsNull() {
            addCriterion("relation_state is null");
            return (Criteria) this;
        }

        public Criteria andRelationStateIsNotNull() {
            addCriterion("relation_state is not null");
            return (Criteria) this;
        }

        public Criteria andRelationStateEqualTo(Integer value) {
            addCriterion("relation_state =", value, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateNotEqualTo(Integer value) {
            addCriterion("relation_state <>", value, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateGreaterThan(Integer value) {
            addCriterion("relation_state >", value, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_state >=", value, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateLessThan(Integer value) {
            addCriterion("relation_state <", value, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateLessThanOrEqualTo(Integer value) {
            addCriterion("relation_state <=", value, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateIn(List<Integer> values) {
            addCriterion("relation_state in", values, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateNotIn(List<Integer> values) {
            addCriterion("relation_state not in", values, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateBetween(Integer value1, Integer value2) {
            addCriterion("relation_state between", value1, value2, "relationState");
            return (Criteria) this;
        }

        public Criteria andRelationStateNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_state not between", value1, value2, "relationState");
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