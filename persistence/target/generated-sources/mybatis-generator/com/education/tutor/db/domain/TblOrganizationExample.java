package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblOrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblOrganizationExample() {
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

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlIsNull() {
            addCriterion("org_index_url is null");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlIsNotNull() {
            addCriterion("org_index_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlEqualTo(String value) {
            addCriterion("org_index_url =", value, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlNotEqualTo(String value) {
            addCriterion("org_index_url <>", value, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlGreaterThan(String value) {
            addCriterion("org_index_url >", value, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlGreaterThanOrEqualTo(String value) {
            addCriterion("org_index_url >=", value, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlLessThan(String value) {
            addCriterion("org_index_url <", value, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlLessThanOrEqualTo(String value) {
            addCriterion("org_index_url <=", value, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlLike(String value) {
            addCriterion("org_index_url like", value, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlNotLike(String value) {
            addCriterion("org_index_url not like", value, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlIn(List<String> values) {
            addCriterion("org_index_url in", values, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlNotIn(List<String> values) {
            addCriterion("org_index_url not in", values, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlBetween(String value1, String value2) {
            addCriterion("org_index_url between", value1, value2, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIndexUrlNotBetween(String value1, String value2) {
            addCriterion("org_index_url not between", value1, value2, "orgIndexUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlIsNull() {
            addCriterion("org_logo_url is null");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlIsNotNull() {
            addCriterion("org_logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlEqualTo(String value) {
            addCriterion("org_logo_url =", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlNotEqualTo(String value) {
            addCriterion("org_logo_url <>", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlGreaterThan(String value) {
            addCriterion("org_logo_url >", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("org_logo_url >=", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlLessThan(String value) {
            addCriterion("org_logo_url <", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("org_logo_url <=", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlLike(String value) {
            addCriterion("org_logo_url like", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlNotLike(String value) {
            addCriterion("org_logo_url not like", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlIn(List<String> values) {
            addCriterion("org_logo_url in", values, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlNotIn(List<String> values) {
            addCriterion("org_logo_url not in", values, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlBetween(String value1, String value2) {
            addCriterion("org_logo_url between", value1, value2, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlNotBetween(String value1, String value2) {
            addCriterion("org_logo_url not between", value1, value2, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryIsNull() {
            addCriterion("org_home_country is null");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryIsNotNull() {
            addCriterion("org_home_country is not null");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryEqualTo(String value) {
            addCriterion("org_home_country =", value, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryNotEqualTo(String value) {
            addCriterion("org_home_country <>", value, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryGreaterThan(String value) {
            addCriterion("org_home_country >", value, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryGreaterThanOrEqualTo(String value) {
            addCriterion("org_home_country >=", value, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryLessThan(String value) {
            addCriterion("org_home_country <", value, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryLessThanOrEqualTo(String value) {
            addCriterion("org_home_country <=", value, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryLike(String value) {
            addCriterion("org_home_country like", value, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryNotLike(String value) {
            addCriterion("org_home_country not like", value, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryIn(List<String> values) {
            addCriterion("org_home_country in", values, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryNotIn(List<String> values) {
            addCriterion("org_home_country not in", values, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryBetween(String value1, String value2) {
            addCriterion("org_home_country between", value1, value2, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgHomeCountryNotBetween(String value1, String value2) {
            addCriterion("org_home_country not between", value1, value2, "orgHomeCountry");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityIsNull() {
            addCriterion("org_priority is null");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityIsNotNull() {
            addCriterion("org_priority is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityEqualTo(Short value) {
            addCriterion("org_priority =", value, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityNotEqualTo(Short value) {
            addCriterion("org_priority <>", value, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityGreaterThan(Short value) {
            addCriterion("org_priority >", value, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityGreaterThanOrEqualTo(Short value) {
            addCriterion("org_priority >=", value, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityLessThan(Short value) {
            addCriterion("org_priority <", value, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityLessThanOrEqualTo(Short value) {
            addCriterion("org_priority <=", value, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityIn(List<Short> values) {
            addCriterion("org_priority in", values, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityNotIn(List<Short> values) {
            addCriterion("org_priority not in", values, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityBetween(Short value1, Short value2) {
            addCriterion("org_priority between", value1, value2, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgPriorityNotBetween(Short value1, Short value2) {
            addCriterion("org_priority not between", value1, value2, "orgPriority");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelIsNull() {
            addCriterion("org_size_level is null");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelIsNotNull() {
            addCriterion("org_size_level is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelEqualTo(Integer value) {
            addCriterion("org_size_level =", value, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelNotEqualTo(Integer value) {
            addCriterion("org_size_level <>", value, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelGreaterThan(Integer value) {
            addCriterion("org_size_level >", value, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_size_level >=", value, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelLessThan(Integer value) {
            addCriterion("org_size_level <", value, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("org_size_level <=", value, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelIn(List<Integer> values) {
            addCriterion("org_size_level in", values, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelNotIn(List<Integer> values) {
            addCriterion("org_size_level not in", values, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelBetween(Integer value1, Integer value2) {
            addCriterion("org_size_level between", value1, value2, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("org_size_level not between", value1, value2, "orgSizeLevel");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressIsNull() {
            addCriterion("org_home_address is null");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressIsNotNull() {
            addCriterion("org_home_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressEqualTo(String value) {
            addCriterion("org_home_address =", value, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressNotEqualTo(String value) {
            addCriterion("org_home_address <>", value, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressGreaterThan(String value) {
            addCriterion("org_home_address >", value, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("org_home_address >=", value, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressLessThan(String value) {
            addCriterion("org_home_address <", value, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("org_home_address <=", value, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressLike(String value) {
            addCriterion("org_home_address like", value, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressNotLike(String value) {
            addCriterion("org_home_address not like", value, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressIn(List<String> values) {
            addCriterion("org_home_address in", values, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressNotIn(List<String> values) {
            addCriterion("org_home_address not in", values, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressBetween(String value1, String value2) {
            addCriterion("org_home_address between", value1, value2, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHomeAddressNotBetween(String value1, String value2) {
            addCriterion("org_home_address not between", value1, value2, "orgHomeAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressIsNull() {
            addCriterion("org_contact_address is null");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressIsNotNull() {
            addCriterion("org_contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressEqualTo(String value) {
            addCriterion("org_contact_address =", value, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressNotEqualTo(String value) {
            addCriterion("org_contact_address <>", value, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressGreaterThan(String value) {
            addCriterion("org_contact_address >", value, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("org_contact_address >=", value, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressLessThan(String value) {
            addCriterion("org_contact_address <", value, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressLessThanOrEqualTo(String value) {
            addCriterion("org_contact_address <=", value, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressLike(String value) {
            addCriterion("org_contact_address like", value, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressNotLike(String value) {
            addCriterion("org_contact_address not like", value, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressIn(List<String> values) {
            addCriterion("org_contact_address in", values, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressNotIn(List<String> values) {
            addCriterion("org_contact_address not in", values, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressBetween(String value1, String value2) {
            addCriterion("org_contact_address between", value1, value2, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactAddressNotBetween(String value1, String value2) {
            addCriterion("org_contact_address not between", value1, value2, "orgContactAddress");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonIsNull() {
            addCriterion("org_contact_person is null");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonIsNotNull() {
            addCriterion("org_contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonEqualTo(String value) {
            addCriterion("org_contact_person =", value, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonNotEqualTo(String value) {
            addCriterion("org_contact_person <>", value, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonGreaterThan(String value) {
            addCriterion("org_contact_person >", value, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("org_contact_person >=", value, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonLessThan(String value) {
            addCriterion("org_contact_person <", value, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonLessThanOrEqualTo(String value) {
            addCriterion("org_contact_person <=", value, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonLike(String value) {
            addCriterion("org_contact_person like", value, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonNotLike(String value) {
            addCriterion("org_contact_person not like", value, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonIn(List<String> values) {
            addCriterion("org_contact_person in", values, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonNotIn(List<String> values) {
            addCriterion("org_contact_person not in", values, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonBetween(String value1, String value2) {
            addCriterion("org_contact_person between", value1, value2, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactPersonNotBetween(String value1, String value2) {
            addCriterion("org_contact_person not between", value1, value2, "orgContactPerson");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoIsNull() {
            addCriterion("org_contact_telno is null");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoIsNotNull() {
            addCriterion("org_contact_telno is not null");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoEqualTo(String value) {
            addCriterion("org_contact_telno =", value, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoNotEqualTo(String value) {
            addCriterion("org_contact_telno <>", value, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoGreaterThan(String value) {
            addCriterion("org_contact_telno >", value, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoGreaterThanOrEqualTo(String value) {
            addCriterion("org_contact_telno >=", value, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoLessThan(String value) {
            addCriterion("org_contact_telno <", value, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoLessThanOrEqualTo(String value) {
            addCriterion("org_contact_telno <=", value, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoLike(String value) {
            addCriterion("org_contact_telno like", value, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoNotLike(String value) {
            addCriterion("org_contact_telno not like", value, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoIn(List<String> values) {
            addCriterion("org_contact_telno in", values, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoNotIn(List<String> values) {
            addCriterion("org_contact_telno not in", values, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoBetween(String value1, String value2) {
            addCriterion("org_contact_telno between", value1, value2, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactTelnoNotBetween(String value1, String value2) {
            addCriterion("org_contact_telno not between", value1, value2, "orgContactTelno");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailIsNull() {
            addCriterion("org_contact_email is null");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailIsNotNull() {
            addCriterion("org_contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailEqualTo(String value) {
            addCriterion("org_contact_email =", value, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailNotEqualTo(String value) {
            addCriterion("org_contact_email <>", value, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailGreaterThan(String value) {
            addCriterion("org_contact_email >", value, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("org_contact_email >=", value, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailLessThan(String value) {
            addCriterion("org_contact_email <", value, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailLessThanOrEqualTo(String value) {
            addCriterion("org_contact_email <=", value, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailLike(String value) {
            addCriterion("org_contact_email like", value, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailNotLike(String value) {
            addCriterion("org_contact_email not like", value, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailIn(List<String> values) {
            addCriterion("org_contact_email in", values, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailNotIn(List<String> values) {
            addCriterion("org_contact_email not in", values, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailBetween(String value1, String value2) {
            addCriterion("org_contact_email between", value1, value2, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgContactEmailNotBetween(String value1, String value2) {
            addCriterion("org_contact_email not between", value1, value2, "orgContactEmail");
            return (Criteria) this;
        }

        public Criteria andOrgRolesIsNull() {
            addCriterion("org_roles is null");
            return (Criteria) this;
        }

        public Criteria andOrgRolesIsNotNull() {
            addCriterion("org_roles is not null");
            return (Criteria) this;
        }

        public Criteria andOrgRolesEqualTo(String value) {
            addCriterion("org_roles =", value, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesNotEqualTo(String value) {
            addCriterion("org_roles <>", value, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesGreaterThan(String value) {
            addCriterion("org_roles >", value, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesGreaterThanOrEqualTo(String value) {
            addCriterion("org_roles >=", value, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesLessThan(String value) {
            addCriterion("org_roles <", value, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesLessThanOrEqualTo(String value) {
            addCriterion("org_roles <=", value, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesLike(String value) {
            addCriterion("org_roles like", value, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesNotLike(String value) {
            addCriterion("org_roles not like", value, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesIn(List<String> values) {
            addCriterion("org_roles in", values, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesNotIn(List<String> values) {
            addCriterion("org_roles not in", values, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesBetween(String value1, String value2) {
            addCriterion("org_roles between", value1, value2, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgRolesNotBetween(String value1, String value2) {
            addCriterion("org_roles not between", value1, value2, "orgRoles");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("org_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("org_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(Integer value) {
            addCriterion("org_type =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(Integer value) {
            addCriterion("org_type <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(Integer value) {
            addCriterion("org_type >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_type >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(Integer value) {
            addCriterion("org_type <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("org_type <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<Integer> values) {
            addCriterion("org_type in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<Integer> values) {
            addCriterion("org_type not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(Integer value1, Integer value2) {
            addCriterion("org_type between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_type not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgPathIsNull() {
            addCriterion("org_path is null");
            return (Criteria) this;
        }

        public Criteria andOrgPathIsNotNull() {
            addCriterion("org_path is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPathEqualTo(String value) {
            addCriterion("org_path =", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotEqualTo(String value) {
            addCriterion("org_path <>", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathGreaterThan(String value) {
            addCriterion("org_path >", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathGreaterThanOrEqualTo(String value) {
            addCriterion("org_path >=", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLessThan(String value) {
            addCriterion("org_path <", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLessThanOrEqualTo(String value) {
            addCriterion("org_path <=", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLike(String value) {
            addCriterion("org_path like", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotLike(String value) {
            addCriterion("org_path not like", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathIn(List<String> values) {
            addCriterion("org_path in", values, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotIn(List<String> values) {
            addCriterion("org_path not in", values, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathBetween(String value1, String value2) {
            addCriterion("org_path between", value1, value2, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotBetween(String value1, String value2) {
            addCriterion("org_path not between", value1, value2, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIsNull() {
            addCriterion("org_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIsNotNull() {
            addCriterion("org_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdEqualTo(Long value) {
            addCriterion("org_parent_id =", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotEqualTo(Long value) {
            addCriterion("org_parent_id <>", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdGreaterThan(Long value) {
            addCriterion("org_parent_id >", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_parent_id >=", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLessThan(Long value) {
            addCriterion("org_parent_id <", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLessThanOrEqualTo(Long value) {
            addCriterion("org_parent_id <=", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIn(List<Long> values) {
            addCriterion("org_parent_id in", values, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotIn(List<Long> values) {
            addCriterion("org_parent_id not in", values, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdBetween(Long value1, Long value2) {
            addCriterion("org_parent_id between", value1, value2, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotBetween(Long value1, Long value2) {
            addCriterion("org_parent_id not between", value1, value2, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdIsNull() {
            addCriterion("org_leader_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdIsNotNull() {
            addCriterion("org_leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdEqualTo(Long value) {
            addCriterion("org_leader_id =", value, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdNotEqualTo(Long value) {
            addCriterion("org_leader_id <>", value, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdGreaterThan(Long value) {
            addCriterion("org_leader_id >", value, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_leader_id >=", value, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdLessThan(Long value) {
            addCriterion("org_leader_id <", value, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdLessThanOrEqualTo(Long value) {
            addCriterion("org_leader_id <=", value, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdIn(List<Long> values) {
            addCriterion("org_leader_id in", values, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdNotIn(List<Long> values) {
            addCriterion("org_leader_id not in", values, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdBetween(Long value1, Long value2) {
            addCriterion("org_leader_id between", value1, value2, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLeaderIdNotBetween(Long value1, Long value2) {
            addCriterion("org_leader_id not between", value1, value2, "orgLeaderId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNull() {
            addCriterion("org_level is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNotNull() {
            addCriterion("org_level is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEqualTo(Integer value) {
            addCriterion("org_level =", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotEqualTo(Integer value) {
            addCriterion("org_level <>", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThan(Integer value) {
            addCriterion("org_level >", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_level >=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThan(Integer value) {
            addCriterion("org_level <", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThanOrEqualTo(Integer value) {
            addCriterion("org_level <=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIn(List<Integer> values) {
            addCriterion("org_level in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotIn(List<Integer> values) {
            addCriterion("org_level not in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelBetween(Integer value1, Integer value2) {
            addCriterion("org_level between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("org_level not between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(Long value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(Long value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(Long value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(Long value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(Long value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(Long value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<Long> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<Long> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(Long value1, Long value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(Long value1, Long value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOrgStateIsNull() {
            addCriterion("org_state is null");
            return (Criteria) this;
        }

        public Criteria andOrgStateIsNotNull() {
            addCriterion("org_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStateEqualTo(Integer value) {
            addCriterion("org_state =", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateNotEqualTo(Integer value) {
            addCriterion("org_state <>", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateGreaterThan(Integer value) {
            addCriterion("org_state >", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_state >=", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateLessThan(Integer value) {
            addCriterion("org_state <", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateLessThanOrEqualTo(Integer value) {
            addCriterion("org_state <=", value, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateIn(List<Integer> values) {
            addCriterion("org_state in", values, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateNotIn(List<Integer> values) {
            addCriterion("org_state not in", values, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateBetween(Integer value1, Integer value2) {
            addCriterion("org_state between", value1, value2, "orgState");
            return (Criteria) this;
        }

        public Criteria andOrgStateNotBetween(Integer value1, Integer value2) {
            addCriterion("org_state not between", value1, value2, "orgState");
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