package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblContractExample() {
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

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Long value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Long value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Long value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Long value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Long value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Long> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Long> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Long value1, Long value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Long value1, Long value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNull() {
            addCriterion("contract_name is null");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNotNull() {
            addCriterion("contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andContractNameEqualTo(String value) {
            addCriterion("contract_name =", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotEqualTo(String value) {
            addCriterion("contract_name <>", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThan(String value) {
            addCriterion("contract_name >", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("contract_name >=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThan(String value) {
            addCriterion("contract_name <", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThanOrEqualTo(String value) {
            addCriterion("contract_name <=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLike(String value) {
            addCriterion("contract_name like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotLike(String value) {
            addCriterion("contract_name not like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameIn(List<String> values) {
            addCriterion("contract_name in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotIn(List<String> values) {
            addCriterion("contract_name not in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameBetween(String value1, String value2) {
            addCriterion("contract_name between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotBetween(String value1, String value2) {
            addCriterion("contract_name not between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNull() {
            addCriterion("contract_code is null");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNotNull() {
            addCriterion("contract_code is not null");
            return (Criteria) this;
        }

        public Criteria andContractCodeEqualTo(String value) {
            addCriterion("contract_code =", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotEqualTo(String value) {
            addCriterion("contract_code <>", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThan(String value) {
            addCriterion("contract_code >", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_code >=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThan(String value) {
            addCriterion("contract_code <", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThanOrEqualTo(String value) {
            addCriterion("contract_code <=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLike(String value) {
            addCriterion("contract_code like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotLike(String value) {
            addCriterion("contract_code not like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIn(List<String> values) {
            addCriterion("contract_code in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotIn(List<String> values) {
            addCriterion("contract_code not in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeBetween(String value1, String value2) {
            addCriterion("contract_code between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotBetween(String value1, String value2) {
            addCriterion("contract_code not between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlIsNull() {
            addCriterion("contract_doc_url is null");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlIsNotNull() {
            addCriterion("contract_doc_url is not null");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlEqualTo(String value) {
            addCriterion("contract_doc_url =", value, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlNotEqualTo(String value) {
            addCriterion("contract_doc_url <>", value, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlGreaterThan(String value) {
            addCriterion("contract_doc_url >", value, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlGreaterThanOrEqualTo(String value) {
            addCriterion("contract_doc_url >=", value, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlLessThan(String value) {
            addCriterion("contract_doc_url <", value, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlLessThanOrEqualTo(String value) {
            addCriterion("contract_doc_url <=", value, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlLike(String value) {
            addCriterion("contract_doc_url like", value, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlNotLike(String value) {
            addCriterion("contract_doc_url not like", value, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlIn(List<String> values) {
            addCriterion("contract_doc_url in", values, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlNotIn(List<String> values) {
            addCriterion("contract_doc_url not in", values, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlBetween(String value1, String value2) {
            addCriterion("contract_doc_url between", value1, value2, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractDocUrlNotBetween(String value1, String value2) {
            addCriterion("contract_doc_url not between", value1, value2, "contractDocUrl");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(Integer value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(Integer value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(Integer value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(Integer value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(Integer value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<Integer> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<Integer> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(Integer value1, Integer value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractStateIsNull() {
            addCriterion("contract_state is null");
            return (Criteria) this;
        }

        public Criteria andContractStateIsNotNull() {
            addCriterion("contract_state is not null");
            return (Criteria) this;
        }

        public Criteria andContractStateEqualTo(Integer value) {
            addCriterion("contract_state =", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateNotEqualTo(Integer value) {
            addCriterion("contract_state <>", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateGreaterThan(Integer value) {
            addCriterion("contract_state >", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_state >=", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateLessThan(Integer value) {
            addCriterion("contract_state <", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateLessThanOrEqualTo(Integer value) {
            addCriterion("contract_state <=", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateIn(List<Integer> values) {
            addCriterion("contract_state in", values, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateNotIn(List<Integer> values) {
            addCriterion("contract_state not in", values, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateBetween(Integer value1, Integer value2) {
            addCriterion("contract_state between", value1, value2, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_state not between", value1, value2, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStartIsNull() {
            addCriterion("contract_start is null");
            return (Criteria) this;
        }

        public Criteria andContractStartIsNotNull() {
            addCriterion("contract_start is not null");
            return (Criteria) this;
        }

        public Criteria andContractStartEqualTo(Date value) {
            addCriterion("contract_start =", value, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartNotEqualTo(Date value) {
            addCriterion("contract_start <>", value, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartGreaterThan(Date value) {
            addCriterion("contract_start >", value, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_start >=", value, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartLessThan(Date value) {
            addCriterion("contract_start <", value, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartLessThanOrEqualTo(Date value) {
            addCriterion("contract_start <=", value, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartIn(List<Date> values) {
            addCriterion("contract_start in", values, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartNotIn(List<Date> values) {
            addCriterion("contract_start not in", values, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartBetween(Date value1, Date value2) {
            addCriterion("contract_start between", value1, value2, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractStartNotBetween(Date value1, Date value2) {
            addCriterion("contract_start not between", value1, value2, "contractStart");
            return (Criteria) this;
        }

        public Criteria andContractEndIsNull() {
            addCriterion("contract_end is null");
            return (Criteria) this;
        }

        public Criteria andContractEndIsNotNull() {
            addCriterion("contract_end is not null");
            return (Criteria) this;
        }

        public Criteria andContractEndEqualTo(Date value) {
            addCriterion("contract_end =", value, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndNotEqualTo(Date value) {
            addCriterion("contract_end <>", value, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndGreaterThan(Date value) {
            addCriterion("contract_end >", value, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_end >=", value, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndLessThan(Date value) {
            addCriterion("contract_end <", value, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndLessThanOrEqualTo(Date value) {
            addCriterion("contract_end <=", value, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndIn(List<Date> values) {
            addCriterion("contract_end in", values, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndNotIn(List<Date> values) {
            addCriterion("contract_end not in", values, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndBetween(Date value1, Date value2) {
            addCriterion("contract_end between", value1, value2, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractEndNotBetween(Date value1, Date value2) {
            addCriterion("contract_end not between", value1, value2, "contractEnd");
            return (Criteria) this;
        }

        public Criteria andContractStepIsNull() {
            addCriterion("contract_step is null");
            return (Criteria) this;
        }

        public Criteria andContractStepIsNotNull() {
            addCriterion("contract_step is not null");
            return (Criteria) this;
        }

        public Criteria andContractStepEqualTo(String value) {
            addCriterion("contract_step =", value, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepNotEqualTo(String value) {
            addCriterion("contract_step <>", value, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepGreaterThan(String value) {
            addCriterion("contract_step >", value, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepGreaterThanOrEqualTo(String value) {
            addCriterion("contract_step >=", value, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepLessThan(String value) {
            addCriterion("contract_step <", value, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepLessThanOrEqualTo(String value) {
            addCriterion("contract_step <=", value, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepLike(String value) {
            addCriterion("contract_step like", value, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepNotLike(String value) {
            addCriterion("contract_step not like", value, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepIn(List<String> values) {
            addCriterion("contract_step in", values, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepNotIn(List<String> values) {
            addCriterion("contract_step not in", values, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepBetween(String value1, String value2) {
            addCriterion("contract_step between", value1, value2, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractStepNotBetween(String value1, String value2) {
            addCriterion("contract_step not between", value1, value2, "contractStep");
            return (Criteria) this;
        }

        public Criteria andContractAmountIsNull() {
            addCriterion("contract_amount is null");
            return (Criteria) this;
        }

        public Criteria andContractAmountIsNotNull() {
            addCriterion("contract_amount is not null");
            return (Criteria) this;
        }

        public Criteria andContractAmountEqualTo(Integer value) {
            addCriterion("contract_amount =", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotEqualTo(Integer value) {
            addCriterion("contract_amount <>", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountGreaterThan(Integer value) {
            addCriterion("contract_amount >", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_amount >=", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountLessThan(Integer value) {
            addCriterion("contract_amount <", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountLessThanOrEqualTo(Integer value) {
            addCriterion("contract_amount <=", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountIn(List<Integer> values) {
            addCriterion("contract_amount in", values, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotIn(List<Integer> values) {
            addCriterion("contract_amount not in", values, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountBetween(Integer value1, Integer value2) {
            addCriterion("contract_amount between", value1, value2, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_amount not between", value1, value2, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyIsNull() {
            addCriterion("contract_currency is null");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyIsNotNull() {
            addCriterion("contract_currency is not null");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyEqualTo(Integer value) {
            addCriterion("contract_currency =", value, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyNotEqualTo(Integer value) {
            addCriterion("contract_currency <>", value, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyGreaterThan(Integer value) {
            addCriterion("contract_currency >", value, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_currency >=", value, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyLessThan(Integer value) {
            addCriterion("contract_currency <", value, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyLessThanOrEqualTo(Integer value) {
            addCriterion("contract_currency <=", value, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyIn(List<Integer> values) {
            addCriterion("contract_currency in", values, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyNotIn(List<Integer> values) {
            addCriterion("contract_currency not in", values, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyBetween(Integer value1, Integer value2) {
            addCriterion("contract_currency between", value1, value2, "contractCurrency");
            return (Criteria) this;
        }

        public Criteria andContractCurrencyNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_currency not between", value1, value2, "contractCurrency");
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