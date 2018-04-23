package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblAccountExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
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

        public Criteria andGovtIdNoIsNull() {
            addCriterion("govt_id_no is null");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoIsNotNull() {
            addCriterion("govt_id_no is not null");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoEqualTo(String value) {
            addCriterion("govt_id_no =", value, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoNotEqualTo(String value) {
            addCriterion("govt_id_no <>", value, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoGreaterThan(String value) {
            addCriterion("govt_id_no >", value, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("govt_id_no >=", value, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoLessThan(String value) {
            addCriterion("govt_id_no <", value, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoLessThanOrEqualTo(String value) {
            addCriterion("govt_id_no <=", value, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoLike(String value) {
            addCriterion("govt_id_no like", value, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoNotLike(String value) {
            addCriterion("govt_id_no not like", value, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoIn(List<String> values) {
            addCriterion("govt_id_no in", values, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoNotIn(List<String> values) {
            addCriterion("govt_id_no not in", values, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoBetween(String value1, String value2) {
            addCriterion("govt_id_no between", value1, value2, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdNoNotBetween(String value1, String value2) {
            addCriterion("govt_id_no not between", value1, value2, "govtIdNo");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeIsNull() {
            addCriterion("govt_id_type is null");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeIsNotNull() {
            addCriterion("govt_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeEqualTo(Short value) {
            addCriterion("govt_id_type =", value, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeNotEqualTo(Short value) {
            addCriterion("govt_id_type <>", value, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeGreaterThan(Short value) {
            addCriterion("govt_id_type >", value, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("govt_id_type >=", value, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeLessThan(Short value) {
            addCriterion("govt_id_type <", value, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeLessThanOrEqualTo(Short value) {
            addCriterion("govt_id_type <=", value, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeIn(List<Short> values) {
            addCriterion("govt_id_type in", values, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeNotIn(List<Short> values) {
            addCriterion("govt_id_type not in", values, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeBetween(Short value1, Short value2) {
            addCriterion("govt_id_type between", value1, value2, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andGovtIdTypeNotBetween(Short value1, Short value2) {
            addCriterion("govt_id_type not between", value1, value2, "govtIdType");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeIsNull() {
            addCriterion("bank_account_type is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeIsNotNull() {
            addCriterion("bank_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeEqualTo(Integer value) {
            addCriterion("bank_account_type =", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeNotEqualTo(Integer value) {
            addCriterion("bank_account_type <>", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeGreaterThan(Integer value) {
            addCriterion("bank_account_type >", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_account_type >=", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeLessThan(Integer value) {
            addCriterion("bank_account_type <", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bank_account_type <=", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeIn(List<Integer> values) {
            addCriterion("bank_account_type in", values, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeNotIn(List<Integer> values) {
            addCriterion("bank_account_type not in", values, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("bank_account_type between", value1, value2, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_account_type not between", value1, value2, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNull() {
            addCriterion("bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNotNull() {
            addCriterion("bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoEqualTo(String value) {
            addCriterion("bank_account_no =", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotEqualTo(String value) {
            addCriterion("bank_account_no <>", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThan(String value) {
            addCriterion("bank_account_no >", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no >=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThan(String value) {
            addCriterion("bank_account_no <", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no <=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLike(String value) {
            addCriterion("bank_account_no like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotLike(String value) {
            addCriterion("bank_account_no not like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIn(List<String> values) {
            addCriterion("bank_account_no in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotIn(List<String> values) {
            addCriterion("bank_account_no not in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoBetween(String value1, String value2) {
            addCriterion("bank_account_no between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("bank_account_no not between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryIsNull() {
            addCriterion("bank_account_country is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryIsNotNull() {
            addCriterion("bank_account_country is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryEqualTo(String value) {
            addCriterion("bank_account_country =", value, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryNotEqualTo(String value) {
            addCriterion("bank_account_country <>", value, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryGreaterThan(String value) {
            addCriterion("bank_account_country >", value, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_country >=", value, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryLessThan(String value) {
            addCriterion("bank_account_country <", value, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryLessThanOrEqualTo(String value) {
            addCriterion("bank_account_country <=", value, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryLike(String value) {
            addCriterion("bank_account_country like", value, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryNotLike(String value) {
            addCriterion("bank_account_country not like", value, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryIn(List<String> values) {
            addCriterion("bank_account_country in", values, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryNotIn(List<String> values) {
            addCriterion("bank_account_country not in", values, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryBetween(String value1, String value2) {
            addCriterion("bank_account_country between", value1, value2, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountCountryNotBetween(String value1, String value2) {
            addCriterion("bank_account_country not between", value1, value2, "bankAccountCountry");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressIsNull() {
            addCriterion("bank_account_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressIsNotNull() {
            addCriterion("bank_account_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressEqualTo(String value) {
            addCriterion("bank_account_address =", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressNotEqualTo(String value) {
            addCriterion("bank_account_address <>", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressGreaterThan(String value) {
            addCriterion("bank_account_address >", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_address >=", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressLessThan(String value) {
            addCriterion("bank_account_address <", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_account_address <=", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressLike(String value) {
            addCriterion("bank_account_address like", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressNotLike(String value) {
            addCriterion("bank_account_address not like", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressIn(List<String> values) {
            addCriterion("bank_account_address in", values, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressNotIn(List<String> values) {
            addCriterion("bank_account_address not in", values, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressBetween(String value1, String value2) {
            addCriterion("bank_account_address between", value1, value2, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressNotBetween(String value1, String value2) {
            addCriterion("bank_account_address not between", value1, value2, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterIsNull() {
            addCriterion("bank_account_name_inter is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterIsNotNull() {
            addCriterion("bank_account_name_inter is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterEqualTo(String value) {
            addCriterion("bank_account_name_inter =", value, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterNotEqualTo(String value) {
            addCriterion("bank_account_name_inter <>", value, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterGreaterThan(String value) {
            addCriterion("bank_account_name_inter >", value, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name_inter >=", value, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterLessThan(String value) {
            addCriterion("bank_account_name_inter <", value, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name_inter <=", value, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterLike(String value) {
            addCriterion("bank_account_name_inter like", value, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterNotLike(String value) {
            addCriterion("bank_account_name_inter not like", value, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterIn(List<String> values) {
            addCriterion("bank_account_name_inter in", values, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterNotIn(List<String> values) {
            addCriterion("bank_account_name_inter not in", values, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterBetween(String value1, String value2) {
            addCriterion("bank_account_name_inter between", value1, value2, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameInterNotBetween(String value1, String value2) {
            addCriterion("bank_account_name_inter not between", value1, value2, "bankAccountNameInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftIsNull() {
            addCriterion("bank_account_swift is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftIsNotNull() {
            addCriterion("bank_account_swift is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftEqualTo(String value) {
            addCriterion("bank_account_swift =", value, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftNotEqualTo(String value) {
            addCriterion("bank_account_swift <>", value, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftGreaterThan(String value) {
            addCriterion("bank_account_swift >", value, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_swift >=", value, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftLessThan(String value) {
            addCriterion("bank_account_swift <", value, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftLessThanOrEqualTo(String value) {
            addCriterion("bank_account_swift <=", value, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftLike(String value) {
            addCriterion("bank_account_swift like", value, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftNotLike(String value) {
            addCriterion("bank_account_swift not like", value, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftIn(List<String> values) {
            addCriterion("bank_account_swift in", values, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftNotIn(List<String> values) {
            addCriterion("bank_account_swift not in", values, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftBetween(String value1, String value2) {
            addCriterion("bank_account_swift between", value1, value2, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftNotBetween(String value1, String value2) {
            addCriterion("bank_account_swift not between", value1, value2, "bankAccountSwift");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterIsNull() {
            addCriterion("bank_account_swift_inter is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterIsNotNull() {
            addCriterion("bank_account_swift_inter is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterEqualTo(String value) {
            addCriterion("bank_account_swift_inter =", value, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterNotEqualTo(String value) {
            addCriterion("bank_account_swift_inter <>", value, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterGreaterThan(String value) {
            addCriterion("bank_account_swift_inter >", value, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_swift_inter >=", value, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterLessThan(String value) {
            addCriterion("bank_account_swift_inter <", value, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterLessThanOrEqualTo(String value) {
            addCriterion("bank_account_swift_inter <=", value, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterLike(String value) {
            addCriterion("bank_account_swift_inter like", value, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterNotLike(String value) {
            addCriterion("bank_account_swift_inter not like", value, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterIn(List<String> values) {
            addCriterion("bank_account_swift_inter in", values, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterNotIn(List<String> values) {
            addCriterion("bank_account_swift_inter not in", values, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterBetween(String value1, String value2) {
            addCriterion("bank_account_swift_inter between", value1, value2, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andBankAccountSwiftInterNotBetween(String value1, String value2) {
            addCriterion("bank_account_swift_inter not between", value1, value2, "bankAccountSwiftInter");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDepositSumIsNull() {
            addCriterion("deposit_sum is null");
            return (Criteria) this;
        }

        public Criteria andDepositSumIsNotNull() {
            addCriterion("deposit_sum is not null");
            return (Criteria) this;
        }

        public Criteria andDepositSumEqualTo(Integer value) {
            addCriterion("deposit_sum =", value, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumNotEqualTo(Integer value) {
            addCriterion("deposit_sum <>", value, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumGreaterThan(Integer value) {
            addCriterion("deposit_sum >", value, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_sum >=", value, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumLessThan(Integer value) {
            addCriterion("deposit_sum <", value, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_sum <=", value, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumIn(List<Integer> values) {
            addCriterion("deposit_sum in", values, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumNotIn(List<Integer> values) {
            addCriterion("deposit_sum not in", values, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumBetween(Integer value1, Integer value2) {
            addCriterion("deposit_sum between", value1, value2, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositSumNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_sum not between", value1, value2, "depositSum");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceIsNull() {
            addCriterion("deposit_balance is null");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceIsNotNull() {
            addCriterion("deposit_balance is not null");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceEqualTo(Integer value) {
            addCriterion("deposit_balance =", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotEqualTo(Integer value) {
            addCriterion("deposit_balance <>", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceGreaterThan(Integer value) {
            addCriterion("deposit_balance >", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_balance >=", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceLessThan(Integer value) {
            addCriterion("deposit_balance <", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_balance <=", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceIn(List<Integer> values) {
            addCriterion("deposit_balance in", values, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotIn(List<Integer> values) {
            addCriterion("deposit_balance not in", values, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceBetween(Integer value1, Integer value2) {
            addCriterion("deposit_balance between", value1, value2, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_balance not between", value1, value2, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andRewardSumIsNull() {
            addCriterion("reward_sum is null");
            return (Criteria) this;
        }

        public Criteria andRewardSumIsNotNull() {
            addCriterion("reward_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRewardSumEqualTo(Integer value) {
            addCriterion("reward_sum =", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumNotEqualTo(Integer value) {
            addCriterion("reward_sum <>", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumGreaterThan(Integer value) {
            addCriterion("reward_sum >", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_sum >=", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumLessThan(Integer value) {
            addCriterion("reward_sum <", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumLessThanOrEqualTo(Integer value) {
            addCriterion("reward_sum <=", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumIn(List<Integer> values) {
            addCriterion("reward_sum in", values, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumNotIn(List<Integer> values) {
            addCriterion("reward_sum not in", values, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumBetween(Integer value1, Integer value2) {
            addCriterion("reward_sum between", value1, value2, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_sum not between", value1, value2, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceIsNull() {
            addCriterion("reward_balance is null");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceIsNotNull() {
            addCriterion("reward_balance is not null");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceEqualTo(Integer value) {
            addCriterion("reward_balance =", value, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceNotEqualTo(Integer value) {
            addCriterion("reward_balance <>", value, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceGreaterThan(Integer value) {
            addCriterion("reward_balance >", value, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_balance >=", value, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceLessThan(Integer value) {
            addCriterion("reward_balance <", value, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("reward_balance <=", value, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceIn(List<Integer> values) {
            addCriterion("reward_balance in", values, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceNotIn(List<Integer> values) {
            addCriterion("reward_balance not in", values, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceBetween(Integer value1, Integer value2) {
            addCriterion("reward_balance between", value1, value2, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andRewardBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_balance not between", value1, value2, "rewardBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumIsNull() {
            addCriterion("withdraw_sum is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumIsNotNull() {
            addCriterion("withdraw_sum is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumEqualTo(Integer value) {
            addCriterion("withdraw_sum =", value, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumNotEqualTo(Integer value) {
            addCriterion("withdraw_sum <>", value, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumGreaterThan(Integer value) {
            addCriterion("withdraw_sum >", value, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdraw_sum >=", value, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumLessThan(Integer value) {
            addCriterion("withdraw_sum <", value, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumLessThanOrEqualTo(Integer value) {
            addCriterion("withdraw_sum <=", value, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumIn(List<Integer> values) {
            addCriterion("withdraw_sum in", values, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumNotIn(List<Integer> values) {
            addCriterion("withdraw_sum not in", values, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_sum between", value1, value2, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawSumNotBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_sum not between", value1, value2, "withdrawSum");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceIsNull() {
            addCriterion("withdraw_balance is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceIsNotNull() {
            addCriterion("withdraw_balance is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceEqualTo(Integer value) {
            addCriterion("withdraw_balance =", value, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceNotEqualTo(Integer value) {
            addCriterion("withdraw_balance <>", value, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceGreaterThan(Integer value) {
            addCriterion("withdraw_balance >", value, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdraw_balance >=", value, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceLessThan(Integer value) {
            addCriterion("withdraw_balance <", value, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("withdraw_balance <=", value, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceIn(List<Integer> values) {
            addCriterion("withdraw_balance in", values, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceNotIn(List<Integer> values) {
            addCriterion("withdraw_balance not in", values, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_balance between", value1, value2, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andWithdrawBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_balance not between", value1, value2, "withdrawBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutSumIsNull() {
            addCriterion("payout_sum is null");
            return (Criteria) this;
        }

        public Criteria andPayoutSumIsNotNull() {
            addCriterion("payout_sum is not null");
            return (Criteria) this;
        }

        public Criteria andPayoutSumEqualTo(Integer value) {
            addCriterion("payout_sum =", value, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumNotEqualTo(Integer value) {
            addCriterion("payout_sum <>", value, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumGreaterThan(Integer value) {
            addCriterion("payout_sum >", value, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("payout_sum >=", value, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumLessThan(Integer value) {
            addCriterion("payout_sum <", value, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumLessThanOrEqualTo(Integer value) {
            addCriterion("payout_sum <=", value, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumIn(List<Integer> values) {
            addCriterion("payout_sum in", values, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumNotIn(List<Integer> values) {
            addCriterion("payout_sum not in", values, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumBetween(Integer value1, Integer value2) {
            addCriterion("payout_sum between", value1, value2, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutSumNotBetween(Integer value1, Integer value2) {
            addCriterion("payout_sum not between", value1, value2, "payoutSum");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceIsNull() {
            addCriterion("payout_balance is null");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceIsNotNull() {
            addCriterion("payout_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceEqualTo(Integer value) {
            addCriterion("payout_balance =", value, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceNotEqualTo(Integer value) {
            addCriterion("payout_balance <>", value, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceGreaterThan(Integer value) {
            addCriterion("payout_balance >", value, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("payout_balance >=", value, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceLessThan(Integer value) {
            addCriterion("payout_balance <", value, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("payout_balance <=", value, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceIn(List<Integer> values) {
            addCriterion("payout_balance in", values, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceNotIn(List<Integer> values) {
            addCriterion("payout_balance not in", values, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceBetween(Integer value1, Integer value2) {
            addCriterion("payout_balance between", value1, value2, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andPayoutBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("payout_balance not between", value1, value2, "payoutBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Integer value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Integer value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Integer value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Integer value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Integer> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Integer> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Integer value1, Integer value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("balance not between", value1, value2, "balance");
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