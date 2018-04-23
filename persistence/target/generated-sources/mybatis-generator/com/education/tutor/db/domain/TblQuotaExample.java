package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQuotaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQuotaExample() {
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

        public Criteria andQuotaIdIsNull() {
            addCriterion("quota_id is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIdIsNotNull() {
            addCriterion("quota_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaIdEqualTo(Long value) {
            addCriterion("quota_id =", value, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdNotEqualTo(Long value) {
            addCriterion("quota_id <>", value, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdGreaterThan(Long value) {
            addCriterion("quota_id >", value, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("quota_id >=", value, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdLessThan(Long value) {
            addCriterion("quota_id <", value, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdLessThanOrEqualTo(Long value) {
            addCriterion("quota_id <=", value, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdIn(List<Long> values) {
            addCriterion("quota_id in", values, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdNotIn(List<Long> values) {
            addCriterion("quota_id not in", values, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdBetween(Long value1, Long value2) {
            addCriterion("quota_id between", value1, value2, "quotaId");
            return (Criteria) this;
        }

        public Criteria andQuotaIdNotBetween(Long value1, Long value2) {
            addCriterion("quota_id not between", value1, value2, "quotaId");
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

        public Criteria andQuoteTargetCategoryIsNull() {
            addCriterion("quote_target_category is null");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryIsNotNull() {
            addCriterion("quote_target_category is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryEqualTo(Short value) {
            addCriterion("quote_target_category =", value, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryNotEqualTo(Short value) {
            addCriterion("quote_target_category <>", value, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryGreaterThan(Short value) {
            addCriterion("quote_target_category >", value, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryGreaterThanOrEqualTo(Short value) {
            addCriterion("quote_target_category >=", value, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryLessThan(Short value) {
            addCriterion("quote_target_category <", value, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryLessThanOrEqualTo(Short value) {
            addCriterion("quote_target_category <=", value, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryIn(List<Short> values) {
            addCriterion("quote_target_category in", values, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryNotIn(List<Short> values) {
            addCriterion("quote_target_category not in", values, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryBetween(Short value1, Short value2) {
            addCriterion("quote_target_category between", value1, value2, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetCategoryNotBetween(Short value1, Short value2) {
            addCriterion("quote_target_category not between", value1, value2, "quoteTargetCategory");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameIsNull() {
            addCriterion("quote_target_name is null");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameIsNotNull() {
            addCriterion("quote_target_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameEqualTo(String value) {
            addCriterion("quote_target_name =", value, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameNotEqualTo(String value) {
            addCriterion("quote_target_name <>", value, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameGreaterThan(String value) {
            addCriterion("quote_target_name >", value, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameGreaterThanOrEqualTo(String value) {
            addCriterion("quote_target_name >=", value, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameLessThan(String value) {
            addCriterion("quote_target_name <", value, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameLessThanOrEqualTo(String value) {
            addCriterion("quote_target_name <=", value, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameLike(String value) {
            addCriterion("quote_target_name like", value, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameNotLike(String value) {
            addCriterion("quote_target_name not like", value, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameIn(List<String> values) {
            addCriterion("quote_target_name in", values, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameNotIn(List<String> values) {
            addCriterion("quote_target_name not in", values, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameBetween(String value1, String value2) {
            addCriterion("quote_target_name between", value1, value2, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteTargetNameNotBetween(String value1, String value2) {
            addCriterion("quote_target_name not between", value1, value2, "quoteTargetName");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescIsNull() {
            addCriterion("quote_clue_desc is null");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescIsNotNull() {
            addCriterion("quote_clue_desc is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescEqualTo(String value) {
            addCriterion("quote_clue_desc =", value, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescNotEqualTo(String value) {
            addCriterion("quote_clue_desc <>", value, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescGreaterThan(String value) {
            addCriterion("quote_clue_desc >", value, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescGreaterThanOrEqualTo(String value) {
            addCriterion("quote_clue_desc >=", value, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescLessThan(String value) {
            addCriterion("quote_clue_desc <", value, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescLessThanOrEqualTo(String value) {
            addCriterion("quote_clue_desc <=", value, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescLike(String value) {
            addCriterion("quote_clue_desc like", value, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescNotLike(String value) {
            addCriterion("quote_clue_desc not like", value, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescIn(List<String> values) {
            addCriterion("quote_clue_desc in", values, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescNotIn(List<String> values) {
            addCriterion("quote_clue_desc not in", values, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescBetween(String value1, String value2) {
            addCriterion("quote_clue_desc between", value1, value2, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteClueDescNotBetween(String value1, String value2) {
            addCriterion("quote_clue_desc not between", value1, value2, "quoteClueDesc");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationIsNull() {
            addCriterion("quote_location is null");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationIsNotNull() {
            addCriterion("quote_location is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationEqualTo(String value) {
            addCriterion("quote_location =", value, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationNotEqualTo(String value) {
            addCriterion("quote_location <>", value, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationGreaterThan(String value) {
            addCriterion("quote_location >", value, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationGreaterThanOrEqualTo(String value) {
            addCriterion("quote_location >=", value, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationLessThan(String value) {
            addCriterion("quote_location <", value, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationLessThanOrEqualTo(String value) {
            addCriterion("quote_location <=", value, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationLike(String value) {
            addCriterion("quote_location like", value, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationNotLike(String value) {
            addCriterion("quote_location not like", value, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationIn(List<String> values) {
            addCriterion("quote_location in", values, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationNotIn(List<String> values) {
            addCriterion("quote_location not in", values, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationBetween(String value1, String value2) {
            addCriterion("quote_location between", value1, value2, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteLocationNotBetween(String value1, String value2) {
            addCriterion("quote_location not between", value1, value2, "quoteLocation");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceIsNull() {
            addCriterion("quote_clue_source is null");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceIsNotNull() {
            addCriterion("quote_clue_source is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceEqualTo(Short value) {
            addCriterion("quote_clue_source =", value, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceNotEqualTo(Short value) {
            addCriterion("quote_clue_source <>", value, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceGreaterThan(Short value) {
            addCriterion("quote_clue_source >", value, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("quote_clue_source >=", value, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceLessThan(Short value) {
            addCriterion("quote_clue_source <", value, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceLessThanOrEqualTo(Short value) {
            addCriterion("quote_clue_source <=", value, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceIn(List<Short> values) {
            addCriterion("quote_clue_source in", values, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceNotIn(List<Short> values) {
            addCriterion("quote_clue_source not in", values, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceBetween(Short value1, Short value2) {
            addCriterion("quote_clue_source between", value1, value2, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueSourceNotBetween(Short value1, Short value2) {
            addCriterion("quote_clue_source not between", value1, value2, "quoteClueSource");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgIsNull() {
            addCriterion("quote_clue_org is null");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgIsNotNull() {
            addCriterion("quote_clue_org is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgEqualTo(String value) {
            addCriterion("quote_clue_org =", value, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgNotEqualTo(String value) {
            addCriterion("quote_clue_org <>", value, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgGreaterThan(String value) {
            addCriterion("quote_clue_org >", value, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgGreaterThanOrEqualTo(String value) {
            addCriterion("quote_clue_org >=", value, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgLessThan(String value) {
            addCriterion("quote_clue_org <", value, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgLessThanOrEqualTo(String value) {
            addCriterion("quote_clue_org <=", value, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgLike(String value) {
            addCriterion("quote_clue_org like", value, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgNotLike(String value) {
            addCriterion("quote_clue_org not like", value, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgIn(List<String> values) {
            addCriterion("quote_clue_org in", values, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgNotIn(List<String> values) {
            addCriterion("quote_clue_org not in", values, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgBetween(String value1, String value2) {
            addCriterion("quote_clue_org between", value1, value2, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteClueOrgNotBetween(String value1, String value2) {
            addCriterion("quote_clue_org not between", value1, value2, "quoteClueOrg");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeIsNull() {
            addCriterion("quote_tran_type is null");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeIsNotNull() {
            addCriterion("quote_tran_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeEqualTo(Short value) {
            addCriterion("quote_tran_type =", value, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeNotEqualTo(Short value) {
            addCriterion("quote_tran_type <>", value, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeGreaterThan(Short value) {
            addCriterion("quote_tran_type >", value, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("quote_tran_type >=", value, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeLessThan(Short value) {
            addCriterion("quote_tran_type <", value, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeLessThanOrEqualTo(Short value) {
            addCriterion("quote_tran_type <=", value, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeIn(List<Short> values) {
            addCriterion("quote_tran_type in", values, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeNotIn(List<Short> values) {
            addCriterion("quote_tran_type not in", values, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeBetween(Short value1, Short value2) {
            addCriterion("quote_tran_type between", value1, value2, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteTranTypeNotBetween(Short value1, Short value2) {
            addCriterion("quote_tran_type not between", value1, value2, "quoteTranType");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureIsNull() {
            addCriterion("quote_procedure is null");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureIsNotNull() {
            addCriterion("quote_procedure is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureEqualTo(String value) {
            addCriterion("quote_procedure =", value, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureNotEqualTo(String value) {
            addCriterion("quote_procedure <>", value, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureGreaterThan(String value) {
            addCriterion("quote_procedure >", value, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureGreaterThanOrEqualTo(String value) {
            addCriterion("quote_procedure >=", value, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureLessThan(String value) {
            addCriterion("quote_procedure <", value, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureLessThanOrEqualTo(String value) {
            addCriterion("quote_procedure <=", value, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureLike(String value) {
            addCriterion("quote_procedure like", value, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureNotLike(String value) {
            addCriterion("quote_procedure not like", value, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureIn(List<String> values) {
            addCriterion("quote_procedure in", values, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureNotIn(List<String> values) {
            addCriterion("quote_procedure not in", values, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureBetween(String value1, String value2) {
            addCriterion("quote_procedure between", value1, value2, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteProcedureNotBetween(String value1, String value2) {
            addCriterion("quote_procedure not between", value1, value2, "quoteProcedure");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngIsNull() {
            addCriterion("quote_geo_lng is null");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngIsNotNull() {
            addCriterion("quote_geo_lng is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngEqualTo(Double value) {
            addCriterion("quote_geo_lng =", value, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngNotEqualTo(Double value) {
            addCriterion("quote_geo_lng <>", value, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngGreaterThan(Double value) {
            addCriterion("quote_geo_lng >", value, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngGreaterThanOrEqualTo(Double value) {
            addCriterion("quote_geo_lng >=", value, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngLessThan(Double value) {
            addCriterion("quote_geo_lng <", value, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngLessThanOrEqualTo(Double value) {
            addCriterion("quote_geo_lng <=", value, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngIn(List<Double> values) {
            addCriterion("quote_geo_lng in", values, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngNotIn(List<Double> values) {
            addCriterion("quote_geo_lng not in", values, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngBetween(Double value1, Double value2) {
            addCriterion("quote_geo_lng between", value1, value2, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLngNotBetween(Double value1, Double value2) {
            addCriterion("quote_geo_lng not between", value1, value2, "quoteGeoLng");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatIsNull() {
            addCriterion("quote_geo_lat is null");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatIsNotNull() {
            addCriterion("quote_geo_lat is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatEqualTo(Double value) {
            addCriterion("quote_geo_lat =", value, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatNotEqualTo(Double value) {
            addCriterion("quote_geo_lat <>", value, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatGreaterThan(Double value) {
            addCriterion("quote_geo_lat >", value, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatGreaterThanOrEqualTo(Double value) {
            addCriterion("quote_geo_lat >=", value, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatLessThan(Double value) {
            addCriterion("quote_geo_lat <", value, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatLessThanOrEqualTo(Double value) {
            addCriterion("quote_geo_lat <=", value, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatIn(List<Double> values) {
            addCriterion("quote_geo_lat in", values, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatNotIn(List<Double> values) {
            addCriterion("quote_geo_lat not in", values, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatBetween(Double value1, Double value2) {
            addCriterion("quote_geo_lat between", value1, value2, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteGeoLatNotBetween(Double value1, Double value2) {
            addCriterion("quote_geo_lat not between", value1, value2, "quoteGeoLat");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgIsNull() {
            addCriterion("quote_doc_img is null");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgIsNotNull() {
            addCriterion("quote_doc_img is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgEqualTo(String value) {
            addCriterion("quote_doc_img =", value, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgNotEqualTo(String value) {
            addCriterion("quote_doc_img <>", value, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgGreaterThan(String value) {
            addCriterion("quote_doc_img >", value, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgGreaterThanOrEqualTo(String value) {
            addCriterion("quote_doc_img >=", value, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgLessThan(String value) {
            addCriterion("quote_doc_img <", value, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgLessThanOrEqualTo(String value) {
            addCriterion("quote_doc_img <=", value, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgLike(String value) {
            addCriterion("quote_doc_img like", value, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgNotLike(String value) {
            addCriterion("quote_doc_img not like", value, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgIn(List<String> values) {
            addCriterion("quote_doc_img in", values, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgNotIn(List<String> values) {
            addCriterion("quote_doc_img not in", values, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgBetween(String value1, String value2) {
            addCriterion("quote_doc_img between", value1, value2, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteDocImgNotBetween(String value1, String value2) {
            addCriterion("quote_doc_img not between", value1, value2, "quoteDocImg");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefIsNull() {
            addCriterion("quote_solution_ref is null");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefIsNotNull() {
            addCriterion("quote_solution_ref is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefEqualTo(String value) {
            addCriterion("quote_solution_ref =", value, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefNotEqualTo(String value) {
            addCriterion("quote_solution_ref <>", value, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefGreaterThan(String value) {
            addCriterion("quote_solution_ref >", value, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefGreaterThanOrEqualTo(String value) {
            addCriterion("quote_solution_ref >=", value, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefLessThan(String value) {
            addCriterion("quote_solution_ref <", value, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefLessThanOrEqualTo(String value) {
            addCriterion("quote_solution_ref <=", value, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefLike(String value) {
            addCriterion("quote_solution_ref like", value, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefNotLike(String value) {
            addCriterion("quote_solution_ref not like", value, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefIn(List<String> values) {
            addCriterion("quote_solution_ref in", values, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefNotIn(List<String> values) {
            addCriterion("quote_solution_ref not in", values, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefBetween(String value1, String value2) {
            addCriterion("quote_solution_ref between", value1, value2, "quoteSolutionRef");
            return (Criteria) this;
        }

        public Criteria andQuoteSolutionRefNotBetween(String value1, String value2) {
            addCriterion("quote_solution_ref not between", value1, value2, "quoteSolutionRef");
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

        public Criteria andQuotaExtraInfoIsNull() {
            addCriterion("quota_extra_info is null");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoIsNotNull() {
            addCriterion("quota_extra_info is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoEqualTo(String value) {
            addCriterion("quota_extra_info =", value, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoNotEqualTo(String value) {
            addCriterion("quota_extra_info <>", value, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoGreaterThan(String value) {
            addCriterion("quota_extra_info >", value, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoGreaterThanOrEqualTo(String value) {
            addCriterion("quota_extra_info >=", value, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoLessThan(String value) {
            addCriterion("quota_extra_info <", value, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoLessThanOrEqualTo(String value) {
            addCriterion("quota_extra_info <=", value, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoLike(String value) {
            addCriterion("quota_extra_info like", value, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoNotLike(String value) {
            addCriterion("quota_extra_info not like", value, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoIn(List<String> values) {
            addCriterion("quota_extra_info in", values, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoNotIn(List<String> values) {
            addCriterion("quota_extra_info not in", values, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoBetween(String value1, String value2) {
            addCriterion("quota_extra_info between", value1, value2, "quotaExtraInfo");
            return (Criteria) this;
        }

        public Criteria andQuotaExtraInfoNotBetween(String value1, String value2) {
            addCriterion("quota_extra_info not between", value1, value2, "quotaExtraInfo");
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