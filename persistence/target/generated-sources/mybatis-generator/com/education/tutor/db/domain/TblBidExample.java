package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblBidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblBidExample() {
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

        public Criteria andBidIdIsNull() {
            addCriterion("bid_id is null");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNotNull() {
            addCriterion("bid_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidIdEqualTo(Long value) {
            addCriterion("bid_id =", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotEqualTo(Long value) {
            addCriterion("bid_id <>", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThan(Long value) {
            addCriterion("bid_id >", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bid_id >=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThan(Long value) {
            addCriterion("bid_id <", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThanOrEqualTo(Long value) {
            addCriterion("bid_id <=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdIn(List<Long> values) {
            addCriterion("bid_id in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotIn(List<Long> values) {
            addCriterion("bid_id not in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdBetween(Long value1, Long value2) {
            addCriterion("bid_id between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotBetween(Long value1, Long value2) {
            addCriterion("bid_id not between", value1, value2, "bidId");
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

        public Criteria andBidTargetCategoryIsNull() {
            addCriterion("bid_target_category is null");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryIsNotNull() {
            addCriterion("bid_target_category is not null");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryEqualTo(String value) {
            addCriterion("bid_target_category =", value, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryNotEqualTo(String value) {
            addCriterion("bid_target_category <>", value, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryGreaterThan(String value) {
            addCriterion("bid_target_category >", value, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("bid_target_category >=", value, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryLessThan(String value) {
            addCriterion("bid_target_category <", value, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryLessThanOrEqualTo(String value) {
            addCriterion("bid_target_category <=", value, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryLike(String value) {
            addCriterion("bid_target_category like", value, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryNotLike(String value) {
            addCriterion("bid_target_category not like", value, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryIn(List<String> values) {
            addCriterion("bid_target_category in", values, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryNotIn(List<String> values) {
            addCriterion("bid_target_category not in", values, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryBetween(String value1, String value2) {
            addCriterion("bid_target_category between", value1, value2, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetCategoryNotBetween(String value1, String value2) {
            addCriterion("bid_target_category not between", value1, value2, "bidTargetCategory");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameIsNull() {
            addCriterion("bid_target_name is null");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameIsNotNull() {
            addCriterion("bid_target_name is not null");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameEqualTo(String value) {
            addCriterion("bid_target_name =", value, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameNotEqualTo(String value) {
            addCriterion("bid_target_name <>", value, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameGreaterThan(String value) {
            addCriterion("bid_target_name >", value, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameGreaterThanOrEqualTo(String value) {
            addCriterion("bid_target_name >=", value, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameLessThan(String value) {
            addCriterion("bid_target_name <", value, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameLessThanOrEqualTo(String value) {
            addCriterion("bid_target_name <=", value, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameLike(String value) {
            addCriterion("bid_target_name like", value, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameNotLike(String value) {
            addCriterion("bid_target_name not like", value, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameIn(List<String> values) {
            addCriterion("bid_target_name in", values, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameNotIn(List<String> values) {
            addCriterion("bid_target_name not in", values, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameBetween(String value1, String value2) {
            addCriterion("bid_target_name between", value1, value2, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidTargetNameNotBetween(String value1, String value2) {
            addCriterion("bid_target_name not between", value1, value2, "bidTargetName");
            return (Criteria) this;
        }

        public Criteria andBidClueDescIsNull() {
            addCriterion("bid_clue_desc is null");
            return (Criteria) this;
        }

        public Criteria andBidClueDescIsNotNull() {
            addCriterion("bid_clue_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBidClueDescEqualTo(String value) {
            addCriterion("bid_clue_desc =", value, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescNotEqualTo(String value) {
            addCriterion("bid_clue_desc <>", value, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescGreaterThan(String value) {
            addCriterion("bid_clue_desc >", value, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescGreaterThanOrEqualTo(String value) {
            addCriterion("bid_clue_desc >=", value, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescLessThan(String value) {
            addCriterion("bid_clue_desc <", value, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescLessThanOrEqualTo(String value) {
            addCriterion("bid_clue_desc <=", value, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescLike(String value) {
            addCriterion("bid_clue_desc like", value, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescNotLike(String value) {
            addCriterion("bid_clue_desc not like", value, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescIn(List<String> values) {
            addCriterion("bid_clue_desc in", values, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescNotIn(List<String> values) {
            addCriterion("bid_clue_desc not in", values, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescBetween(String value1, String value2) {
            addCriterion("bid_clue_desc between", value1, value2, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidClueDescNotBetween(String value1, String value2) {
            addCriterion("bid_clue_desc not between", value1, value2, "bidClueDesc");
            return (Criteria) this;
        }

        public Criteria andBidLocationIsNull() {
            addCriterion("bid_location is null");
            return (Criteria) this;
        }

        public Criteria andBidLocationIsNotNull() {
            addCriterion("bid_location is not null");
            return (Criteria) this;
        }

        public Criteria andBidLocationEqualTo(String value) {
            addCriterion("bid_location =", value, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationNotEqualTo(String value) {
            addCriterion("bid_location <>", value, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationGreaterThan(String value) {
            addCriterion("bid_location >", value, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationGreaterThanOrEqualTo(String value) {
            addCriterion("bid_location >=", value, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationLessThan(String value) {
            addCriterion("bid_location <", value, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationLessThanOrEqualTo(String value) {
            addCriterion("bid_location <=", value, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationLike(String value) {
            addCriterion("bid_location like", value, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationNotLike(String value) {
            addCriterion("bid_location not like", value, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationIn(List<String> values) {
            addCriterion("bid_location in", values, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationNotIn(List<String> values) {
            addCriterion("bid_location not in", values, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationBetween(String value1, String value2) {
            addCriterion("bid_location between", value1, value2, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidLocationNotBetween(String value1, String value2) {
            addCriterion("bid_location not between", value1, value2, "bidLocation");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceIsNull() {
            addCriterion("bid_clue_source is null");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceIsNotNull() {
            addCriterion("bid_clue_source is not null");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceEqualTo(Short value) {
            addCriterion("bid_clue_source =", value, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceNotEqualTo(Short value) {
            addCriterion("bid_clue_source <>", value, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceGreaterThan(Short value) {
            addCriterion("bid_clue_source >", value, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("bid_clue_source >=", value, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceLessThan(Short value) {
            addCriterion("bid_clue_source <", value, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceLessThanOrEqualTo(Short value) {
            addCriterion("bid_clue_source <=", value, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceIn(List<Short> values) {
            addCriterion("bid_clue_source in", values, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceNotIn(List<Short> values) {
            addCriterion("bid_clue_source not in", values, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceBetween(Short value1, Short value2) {
            addCriterion("bid_clue_source between", value1, value2, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueSourceNotBetween(Short value1, Short value2) {
            addCriterion("bid_clue_source not between", value1, value2, "bidClueSource");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgIsNull() {
            addCriterion("bid_clue_org is null");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgIsNotNull() {
            addCriterion("bid_clue_org is not null");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgEqualTo(String value) {
            addCriterion("bid_clue_org =", value, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgNotEqualTo(String value) {
            addCriterion("bid_clue_org <>", value, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgGreaterThan(String value) {
            addCriterion("bid_clue_org >", value, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgGreaterThanOrEqualTo(String value) {
            addCriterion("bid_clue_org >=", value, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgLessThan(String value) {
            addCriterion("bid_clue_org <", value, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgLessThanOrEqualTo(String value) {
            addCriterion("bid_clue_org <=", value, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgLike(String value) {
            addCriterion("bid_clue_org like", value, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgNotLike(String value) {
            addCriterion("bid_clue_org not like", value, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgIn(List<String> values) {
            addCriterion("bid_clue_org in", values, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgNotIn(List<String> values) {
            addCriterion("bid_clue_org not in", values, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgBetween(String value1, String value2) {
            addCriterion("bid_clue_org between", value1, value2, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidClueOrgNotBetween(String value1, String value2) {
            addCriterion("bid_clue_org not between", value1, value2, "bidClueOrg");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeIsNull() {
            addCriterion("bid_tran_type is null");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeIsNotNull() {
            addCriterion("bid_tran_type is not null");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeEqualTo(Short value) {
            addCriterion("bid_tran_type =", value, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeNotEqualTo(Short value) {
            addCriterion("bid_tran_type <>", value, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeGreaterThan(Short value) {
            addCriterion("bid_tran_type >", value, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("bid_tran_type >=", value, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeLessThan(Short value) {
            addCriterion("bid_tran_type <", value, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeLessThanOrEqualTo(Short value) {
            addCriterion("bid_tran_type <=", value, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeIn(List<Short> values) {
            addCriterion("bid_tran_type in", values, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeNotIn(List<Short> values) {
            addCriterion("bid_tran_type not in", values, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeBetween(Short value1, Short value2) {
            addCriterion("bid_tran_type between", value1, value2, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidTranTypeNotBetween(Short value1, Short value2) {
            addCriterion("bid_tran_type not between", value1, value2, "bidTranType");
            return (Criteria) this;
        }

        public Criteria andBidProcedureIsNull() {
            addCriterion("bid_procedure is null");
            return (Criteria) this;
        }

        public Criteria andBidProcedureIsNotNull() {
            addCriterion("bid_procedure is not null");
            return (Criteria) this;
        }

        public Criteria andBidProcedureEqualTo(String value) {
            addCriterion("bid_procedure =", value, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureNotEqualTo(String value) {
            addCriterion("bid_procedure <>", value, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureGreaterThan(String value) {
            addCriterion("bid_procedure >", value, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureGreaterThanOrEqualTo(String value) {
            addCriterion("bid_procedure >=", value, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureLessThan(String value) {
            addCriterion("bid_procedure <", value, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureLessThanOrEqualTo(String value) {
            addCriterion("bid_procedure <=", value, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureLike(String value) {
            addCriterion("bid_procedure like", value, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureNotLike(String value) {
            addCriterion("bid_procedure not like", value, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureIn(List<String> values) {
            addCriterion("bid_procedure in", values, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureNotIn(List<String> values) {
            addCriterion("bid_procedure not in", values, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureBetween(String value1, String value2) {
            addCriterion("bid_procedure between", value1, value2, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidProcedureNotBetween(String value1, String value2) {
            addCriterion("bid_procedure not between", value1, value2, "bidProcedure");
            return (Criteria) this;
        }

        public Criteria andBidNoIsNull() {
            addCriterion("bid_no is null");
            return (Criteria) this;
        }

        public Criteria andBidNoIsNotNull() {
            addCriterion("bid_no is not null");
            return (Criteria) this;
        }

        public Criteria andBidNoEqualTo(String value) {
            addCriterion("bid_no =", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoNotEqualTo(String value) {
            addCriterion("bid_no <>", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoGreaterThan(String value) {
            addCriterion("bid_no >", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoGreaterThanOrEqualTo(String value) {
            addCriterion("bid_no >=", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoLessThan(String value) {
            addCriterion("bid_no <", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoLessThanOrEqualTo(String value) {
            addCriterion("bid_no <=", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoLike(String value) {
            addCriterion("bid_no like", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoNotLike(String value) {
            addCriterion("bid_no not like", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoIn(List<String> values) {
            addCriterion("bid_no in", values, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoNotIn(List<String> values) {
            addCriterion("bid_no not in", values, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoBetween(String value1, String value2) {
            addCriterion("bid_no between", value1, value2, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoNotBetween(String value1, String value2) {
            addCriterion("bid_no not between", value1, value2, "bidNo");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeIsNull() {
            addCriterion("plan_reply_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeIsNotNull() {
            addCriterion("plan_reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeEqualTo(Date value) {
            addCriterion("plan_reply_time =", value, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeNotEqualTo(Date value) {
            addCriterion("plan_reply_time <>", value, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeGreaterThan(Date value) {
            addCriterion("plan_reply_time >", value, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_reply_time >=", value, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeLessThan(Date value) {
            addCriterion("plan_reply_time <", value, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_reply_time <=", value, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeIn(List<Date> values) {
            addCriterion("plan_reply_time in", values, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeNotIn(List<Date> values) {
            addCriterion("plan_reply_time not in", values, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeBetween(Date value1, Date value2) {
            addCriterion("plan_reply_time between", value1, value2, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andPlanReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_reply_time not between", value1, value2, "planReplyTime");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(Integer value) {
            addCriterion("scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(Integer value) {
            addCriterion("scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(Integer value) {
            addCriterion("scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(Integer value) {
            addCriterion("scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(Integer value) {
            addCriterion("scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<Integer> values) {
            addCriterion("scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<Integer> values) {
            addCriterion("scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(Integer value1, Integer value2) {
            addCriterion("scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(Integer value1, Integer value2) {
            addCriterion("scope not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptIsNull() {
            addCriterion("owner_dept is null");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptIsNotNull() {
            addCriterion("owner_dept is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptEqualTo(String value) {
            addCriterion("owner_dept =", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptNotEqualTo(String value) {
            addCriterion("owner_dept <>", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptGreaterThan(String value) {
            addCriterion("owner_dept >", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptGreaterThanOrEqualTo(String value) {
            addCriterion("owner_dept >=", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptLessThan(String value) {
            addCriterion("owner_dept <", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptLessThanOrEqualTo(String value) {
            addCriterion("owner_dept <=", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptLike(String value) {
            addCriterion("owner_dept like", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptNotLike(String value) {
            addCriterion("owner_dept not like", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptIn(List<String> values) {
            addCriterion("owner_dept in", values, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptNotIn(List<String> values) {
            addCriterion("owner_dept not in", values, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptBetween(String value1, String value2) {
            addCriterion("owner_dept between", value1, value2, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptNotBetween(String value1, String value2) {
            addCriterion("owner_dept not between", value1, value2, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Short value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Short value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Short value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Short value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Short value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Short> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Short> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Short value1, Short value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Short value1, Short value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStateHistoryIsNull() {
            addCriterion("state_history is null");
            return (Criteria) this;
        }

        public Criteria andStateHistoryIsNotNull() {
            addCriterion("state_history is not null");
            return (Criteria) this;
        }

        public Criteria andStateHistoryEqualTo(String value) {
            addCriterion("state_history =", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryNotEqualTo(String value) {
            addCriterion("state_history <>", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryGreaterThan(String value) {
            addCriterion("state_history >", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("state_history >=", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryLessThan(String value) {
            addCriterion("state_history <", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryLessThanOrEqualTo(String value) {
            addCriterion("state_history <=", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryLike(String value) {
            addCriterion("state_history like", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryNotLike(String value) {
            addCriterion("state_history not like", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryIn(List<String> values) {
            addCriterion("state_history in", values, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryNotIn(List<String> values) {
            addCriterion("state_history not in", values, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryBetween(String value1, String value2) {
            addCriterion("state_history between", value1, value2, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryNotBetween(String value1, String value2) {
            addCriterion("state_history not between", value1, value2, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefIsNull() {
            addCriterion("bid_solution_ref is null");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefIsNotNull() {
            addCriterion("bid_solution_ref is not null");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefEqualTo(String value) {
            addCriterion("bid_solution_ref =", value, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefNotEqualTo(String value) {
            addCriterion("bid_solution_ref <>", value, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefGreaterThan(String value) {
            addCriterion("bid_solution_ref >", value, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefGreaterThanOrEqualTo(String value) {
            addCriterion("bid_solution_ref >=", value, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefLessThan(String value) {
            addCriterion("bid_solution_ref <", value, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefLessThanOrEqualTo(String value) {
            addCriterion("bid_solution_ref <=", value, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefLike(String value) {
            addCriterion("bid_solution_ref like", value, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefNotLike(String value) {
            addCriterion("bid_solution_ref not like", value, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefIn(List<String> values) {
            addCriterion("bid_solution_ref in", values, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefNotIn(List<String> values) {
            addCriterion("bid_solution_ref not in", values, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefBetween(String value1, String value2) {
            addCriterion("bid_solution_ref between", value1, value2, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidSolutionRefNotBetween(String value1, String value2) {
            addCriterion("bid_solution_ref not between", value1, value2, "bidSolutionRef");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoIsNull() {
            addCriterion("bid_extra_info is null");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoIsNotNull() {
            addCriterion("bid_extra_info is not null");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoEqualTo(String value) {
            addCriterion("bid_extra_info =", value, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoNotEqualTo(String value) {
            addCriterion("bid_extra_info <>", value, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoGreaterThan(String value) {
            addCriterion("bid_extra_info >", value, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoGreaterThanOrEqualTo(String value) {
            addCriterion("bid_extra_info >=", value, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoLessThan(String value) {
            addCriterion("bid_extra_info <", value, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoLessThanOrEqualTo(String value) {
            addCriterion("bid_extra_info <=", value, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoLike(String value) {
            addCriterion("bid_extra_info like", value, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoNotLike(String value) {
            addCriterion("bid_extra_info not like", value, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoIn(List<String> values) {
            addCriterion("bid_extra_info in", values, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoNotIn(List<String> values) {
            addCriterion("bid_extra_info not in", values, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoBetween(String value1, String value2) {
            addCriterion("bid_extra_info between", value1, value2, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andBidExtraInfoNotBetween(String value1, String value2) {
            addCriterion("bid_extra_info not between", value1, value2, "bidExtraInfo");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeIsNull() {
            addCriterion("estimated_price_range is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeIsNotNull() {
            addCriterion("estimated_price_range is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeEqualTo(String value) {
            addCriterion("estimated_price_range =", value, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeNotEqualTo(String value) {
            addCriterion("estimated_price_range <>", value, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeGreaterThan(String value) {
            addCriterion("estimated_price_range >", value, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeGreaterThanOrEqualTo(String value) {
            addCriterion("estimated_price_range >=", value, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeLessThan(String value) {
            addCriterion("estimated_price_range <", value, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeLessThanOrEqualTo(String value) {
            addCriterion("estimated_price_range <=", value, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeLike(String value) {
            addCriterion("estimated_price_range like", value, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeNotLike(String value) {
            addCriterion("estimated_price_range not like", value, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeIn(List<String> values) {
            addCriterion("estimated_price_range in", values, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeNotIn(List<String> values) {
            addCriterion("estimated_price_range not in", values, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeBetween(String value1, String value2) {
            addCriterion("estimated_price_range between", value1, value2, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andEstimatedPriceRangeNotBetween(String value1, String value2) {
            addCriterion("estimated_price_range not between", value1, value2, "estimatedPriceRange");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountIsNull() {
            addCriterion("current_reword_amount is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountIsNotNull() {
            addCriterion("current_reword_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountEqualTo(Integer value) {
            addCriterion("current_reword_amount =", value, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountNotEqualTo(Integer value) {
            addCriterion("current_reword_amount <>", value, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountGreaterThan(Integer value) {
            addCriterion("current_reword_amount >", value, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_reword_amount >=", value, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountLessThan(Integer value) {
            addCriterion("current_reword_amount <", value, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountLessThanOrEqualTo(Integer value) {
            addCriterion("current_reword_amount <=", value, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountIn(List<Integer> values) {
            addCriterion("current_reword_amount in", values, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountNotIn(List<Integer> values) {
            addCriterion("current_reword_amount not in", values, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountBetween(Integer value1, Integer value2) {
            addCriterion("current_reword_amount between", value1, value2, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRewordAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("current_reword_amount not between", value1, value2, "currentRewordAmount");
            return (Criteria) this;
        }

        public Criteria andFollowedByIsNull() {
            addCriterion("followed_by is null");
            return (Criteria) this;
        }

        public Criteria andFollowedByIsNotNull() {
            addCriterion("followed_by is not null");
            return (Criteria) this;
        }

        public Criteria andFollowedByEqualTo(String value) {
            addCriterion("followed_by =", value, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByNotEqualTo(String value) {
            addCriterion("followed_by <>", value, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByGreaterThan(String value) {
            addCriterion("followed_by >", value, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByGreaterThanOrEqualTo(String value) {
            addCriterion("followed_by >=", value, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByLessThan(String value) {
            addCriterion("followed_by <", value, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByLessThanOrEqualTo(String value) {
            addCriterion("followed_by <=", value, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByLike(String value) {
            addCriterion("followed_by like", value, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByNotLike(String value) {
            addCriterion("followed_by not like", value, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByIn(List<String> values) {
            addCriterion("followed_by in", values, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByNotIn(List<String> values) {
            addCriterion("followed_by not in", values, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByBetween(String value1, String value2) {
            addCriterion("followed_by between", value1, value2, "followedBy");
            return (Criteria) this;
        }

        public Criteria andFollowedByNotBetween(String value1, String value2) {
            addCriterion("followed_by not between", value1, value2, "followedBy");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNull() {
            addCriterion("contact_mobile is null");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNotNull() {
            addCriterion("contact_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andContactMobileEqualTo(String value) {
            addCriterion("contact_mobile =", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotEqualTo(String value) {
            addCriterion("contact_mobile <>", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThan(String value) {
            addCriterion("contact_mobile >", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("contact_mobile >=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThan(String value) {
            addCriterion("contact_mobile <", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThanOrEqualTo(String value) {
            addCriterion("contact_mobile <=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLike(String value) {
            addCriterion("contact_mobile like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotLike(String value) {
            addCriterion("contact_mobile not like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileIn(List<String> values) {
            addCriterion("contact_mobile in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotIn(List<String> values) {
            addCriterion("contact_mobile not in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileBetween(String value1, String value2) {
            addCriterion("contact_mobile between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotBetween(String value1, String value2) {
            addCriterion("contact_mobile not between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactEmailEqualTo(String value) {
            addCriterion("contact_email =", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThan(String value) {
            addCriterion("contact_email <", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLike(String value) {
            addCriterion("contact_email like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotLike(String value) {
            addCriterion("contact_email not like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailIn(List<String> values) {
            addCriterion("contact_email in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionIsNull() {
            addCriterion("owner_region is null");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionIsNotNull() {
            addCriterion("owner_region is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionEqualTo(String value) {
            addCriterion("owner_region =", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionNotEqualTo(String value) {
            addCriterion("owner_region <>", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionGreaterThan(String value) {
            addCriterion("owner_region >", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionGreaterThanOrEqualTo(String value) {
            addCriterion("owner_region >=", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionLessThan(String value) {
            addCriterion("owner_region <", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionLessThanOrEqualTo(String value) {
            addCriterion("owner_region <=", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionLike(String value) {
            addCriterion("owner_region like", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionNotLike(String value) {
            addCriterion("owner_region not like", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionIn(List<String> values) {
            addCriterion("owner_region in", values, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionNotIn(List<String> values) {
            addCriterion("owner_region not in", values, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionBetween(String value1, String value2) {
            addCriterion("owner_region between", value1, value2, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionNotBetween(String value1, String value2) {
            addCriterion("owner_region not between", value1, value2, "ownerRegion");
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