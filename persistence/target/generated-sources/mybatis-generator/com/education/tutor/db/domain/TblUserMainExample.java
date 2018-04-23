package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TblUserMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserMainExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAuthIdIsNull() {
            addCriterion("auth_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNotNull() {
            addCriterion("auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthIdEqualTo(Long value) {
            addCriterion("auth_id =", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotEqualTo(Long value) {
            addCriterion("auth_id <>", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThan(Long value) {
            addCriterion("auth_id >", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThanOrEqualTo(Long value) {
            addCriterion("auth_id >=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThan(Long value) {
            addCriterion("auth_id <", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThanOrEqualTo(Long value) {
            addCriterion("auth_id <=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIn(List<Long> values) {
            addCriterion("auth_id in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotIn(List<Long> values) {
            addCriterion("auth_id not in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdBetween(Long value1, Long value2) {
            addCriterion("auth_id between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotBetween(Long value1, Long value2) {
            addCriterion("auth_id not between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andSocialUidIsNull() {
            addCriterion("social_uid is null");
            return (Criteria) this;
        }

        public Criteria andSocialUidIsNotNull() {
            addCriterion("social_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSocialUidEqualTo(String value) {
            addCriterion("social_uid =", value, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidNotEqualTo(String value) {
            addCriterion("social_uid <>", value, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidGreaterThan(String value) {
            addCriterion("social_uid >", value, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidGreaterThanOrEqualTo(String value) {
            addCriterion("social_uid >=", value, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidLessThan(String value) {
            addCriterion("social_uid <", value, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidLessThanOrEqualTo(String value) {
            addCriterion("social_uid <=", value, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidLike(String value) {
            addCriterion("social_uid like", value, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidNotLike(String value) {
            addCriterion("social_uid not like", value, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidIn(List<String> values) {
            addCriterion("social_uid in", values, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidNotIn(List<String> values) {
            addCriterion("social_uid not in", values, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidBetween(String value1, String value2) {
            addCriterion("social_uid between", value1, value2, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialUidNotBetween(String value1, String value2) {
            addCriterion("social_uid not between", value1, value2, "socialUid");
            return (Criteria) this;
        }

        public Criteria andSocialTokenIsNull() {
            addCriterion("social_token is null");
            return (Criteria) this;
        }

        public Criteria andSocialTokenIsNotNull() {
            addCriterion("social_token is not null");
            return (Criteria) this;
        }

        public Criteria andSocialTokenEqualTo(String value) {
            addCriterion("social_token =", value, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenNotEqualTo(String value) {
            addCriterion("social_token <>", value, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenGreaterThan(String value) {
            addCriterion("social_token >", value, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenGreaterThanOrEqualTo(String value) {
            addCriterion("social_token >=", value, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenLessThan(String value) {
            addCriterion("social_token <", value, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenLessThanOrEqualTo(String value) {
            addCriterion("social_token <=", value, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenLike(String value) {
            addCriterion("social_token like", value, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenNotLike(String value) {
            addCriterion("social_token not like", value, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenIn(List<String> values) {
            addCriterion("social_token in", values, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenNotIn(List<String> values) {
            addCriterion("social_token not in", values, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenBetween(String value1, String value2) {
            addCriterion("social_token between", value1, value2, "socialToken");
            return (Criteria) this;
        }

        public Criteria andSocialTokenNotBetween(String value1, String value2) {
            addCriterion("social_token not between", value1, value2, "socialToken");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserTagIsNull() {
            addCriterion("user_tag is null");
            return (Criteria) this;
        }

        public Criteria andUserTagIsNotNull() {
            addCriterion("user_tag is not null");
            return (Criteria) this;
        }

        public Criteria andUserTagEqualTo(String value) {
            addCriterion("user_tag =", value, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagNotEqualTo(String value) {
            addCriterion("user_tag <>", value, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagGreaterThan(String value) {
            addCriterion("user_tag >", value, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagGreaterThanOrEqualTo(String value) {
            addCriterion("user_tag >=", value, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagLessThan(String value) {
            addCriterion("user_tag <", value, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagLessThanOrEqualTo(String value) {
            addCriterion("user_tag <=", value, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagLike(String value) {
            addCriterion("user_tag like", value, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagNotLike(String value) {
            addCriterion("user_tag not like", value, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagIn(List<String> values) {
            addCriterion("user_tag in", values, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagNotIn(List<String> values) {
            addCriterion("user_tag not in", values, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagBetween(String value1, String value2) {
            addCriterion("user_tag between", value1, value2, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserTagNotBetween(String value1, String value2) {
            addCriterion("user_tag not between", value1, value2, "userTag");
            return (Criteria) this;
        }

        public Criteria andUserLangIsNull() {
            addCriterion("user_lang is null");
            return (Criteria) this;
        }

        public Criteria andUserLangIsNotNull() {
            addCriterion("user_lang is not null");
            return (Criteria) this;
        }

        public Criteria andUserLangEqualTo(Short value) {
            addCriterion("user_lang =", value, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangNotEqualTo(Short value) {
            addCriterion("user_lang <>", value, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangGreaterThan(Short value) {
            addCriterion("user_lang >", value, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangGreaterThanOrEqualTo(Short value) {
            addCriterion("user_lang >=", value, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangLessThan(Short value) {
            addCriterion("user_lang <", value, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangLessThanOrEqualTo(Short value) {
            addCriterion("user_lang <=", value, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangIn(List<Short> values) {
            addCriterion("user_lang in", values, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangNotIn(List<Short> values) {
            addCriterion("user_lang not in", values, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangBetween(Short value1, Short value2) {
            addCriterion("user_lang between", value1, value2, "userLang");
            return (Criteria) this;
        }

        public Criteria andUserLangNotBetween(Short value1, Short value2) {
            addCriterion("user_lang not between", value1, value2, "userLang");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNull() {
            addCriterion("family_name is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("family_name is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("family_name =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("family_name <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("family_name >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_name >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("family_name <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("family_name <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("family_name like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("family_name not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("family_name in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("family_name not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("family_name between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("family_name not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNull() {
            addCriterion("given_name is null");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNotNull() {
            addCriterion("given_name is not null");
            return (Criteria) this;
        }

        public Criteria andGivenNameEqualTo(String value) {
            addCriterion("given_name =", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotEqualTo(String value) {
            addCriterion("given_name <>", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThan(String value) {
            addCriterion("given_name >", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThanOrEqualTo(String value) {
            addCriterion("given_name >=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThan(String value) {
            addCriterion("given_name <", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThanOrEqualTo(String value) {
            addCriterion("given_name <=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLike(String value) {
            addCriterion("given_name like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotLike(String value) {
            addCriterion("given_name not like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIn(List<String> values) {
            addCriterion("given_name in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotIn(List<String> values) {
            addCriterion("given_name not in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameBetween(String value1, String value2) {
            addCriterion("given_name between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotBetween(String value1, String value2) {
            addCriterion("given_name not between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andMenuArrayIsNull() {
            addCriterion("menu_array is null");
            return (Criteria) this;
        }

        public Criteria andMenuArrayIsNotNull() {
            addCriterion("menu_array is not null");
            return (Criteria) this;
        }

        public Criteria andMenuArrayEqualTo(String value) {
            addCriterion("menu_array =", value, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayNotEqualTo(String value) {
            addCriterion("menu_array <>", value, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayGreaterThan(String value) {
            addCriterion("menu_array >", value, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayGreaterThanOrEqualTo(String value) {
            addCriterion("menu_array >=", value, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayLessThan(String value) {
            addCriterion("menu_array <", value, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayLessThanOrEqualTo(String value) {
            addCriterion("menu_array <=", value, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayLike(String value) {
            addCriterion("menu_array like", value, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayNotLike(String value) {
            addCriterion("menu_array not like", value, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayIn(List<String> values) {
            addCriterion("menu_array in", values, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayNotIn(List<String> values) {
            addCriterion("menu_array not in", values, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayBetween(String value1, String value2) {
            addCriterion("menu_array between", value1, value2, "menuArray");
            return (Criteria) this;
        }

        public Criteria andMenuArrayNotBetween(String value1, String value2) {
            addCriterion("menu_array not between", value1, value2, "menuArray");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIsNull() {
            addCriterion("verify_type is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIsNotNull() {
            addCriterion("verify_type is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeEqualTo(Short value) {
            addCriterion("verify_type =", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotEqualTo(Short value) {
            addCriterion("verify_type <>", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeGreaterThan(Short value) {
            addCriterion("verify_type >", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("verify_type >=", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeLessThan(Short value) {
            addCriterion("verify_type <", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeLessThanOrEqualTo(Short value) {
            addCriterion("verify_type <=", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIn(List<Short> values) {
            addCriterion("verify_type in", values, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotIn(List<Short> values) {
            addCriterion("verify_type not in", values, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeBetween(Short value1, Short value2) {
            addCriterion("verify_type between", value1, value2, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotBetween(Short value1, Short value2) {
            addCriterion("verify_type not between", value1, value2, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyDescIsNull() {
            addCriterion("verify_desc is null");
            return (Criteria) this;
        }

        public Criteria andVerifyDescIsNotNull() {
            addCriterion("verify_desc is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyDescEqualTo(String value) {
            addCriterion("verify_desc =", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescNotEqualTo(String value) {
            addCriterion("verify_desc <>", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescGreaterThan(String value) {
            addCriterion("verify_desc >", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescGreaterThanOrEqualTo(String value) {
            addCriterion("verify_desc >=", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescLessThan(String value) {
            addCriterion("verify_desc <", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescLessThanOrEqualTo(String value) {
            addCriterion("verify_desc <=", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescLike(String value) {
            addCriterion("verify_desc like", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescNotLike(String value) {
            addCriterion("verify_desc not like", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescIn(List<String> values) {
            addCriterion("verify_desc in", values, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescNotIn(List<String> values) {
            addCriterion("verify_desc not in", values, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescBetween(String value1, String value2) {
            addCriterion("verify_desc between", value1, value2, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescNotBetween(String value1, String value2) {
            addCriterion("verify_desc not between", value1, value2, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenIsNull() {
            addCriterion("imclone_token is null");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenIsNotNull() {
            addCriterion("imclone_token is not null");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenEqualTo(String value) {
            addCriterion("imclone_token =", value, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenNotEqualTo(String value) {
            addCriterion("imclone_token <>", value, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenGreaterThan(String value) {
            addCriterion("imclone_token >", value, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenGreaterThanOrEqualTo(String value) {
            addCriterion("imclone_token >=", value, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenLessThan(String value) {
            addCriterion("imclone_token <", value, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenLessThanOrEqualTo(String value) {
            addCriterion("imclone_token <=", value, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenLike(String value) {
            addCriterion("imclone_token like", value, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenNotLike(String value) {
            addCriterion("imclone_token not like", value, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenIn(List<String> values) {
            addCriterion("imclone_token in", values, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenNotIn(List<String> values) {
            addCriterion("imclone_token not in", values, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenBetween(String value1, String value2) {
            addCriterion("imclone_token between", value1, value2, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andImcloneTokenNotBetween(String value1, String value2) {
            addCriterion("imclone_token not between", value1, value2, "imcloneToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenIsNull() {
            addCriterion("push_token is null");
            return (Criteria) this;
        }

        public Criteria andPushTokenIsNotNull() {
            addCriterion("push_token is not null");
            return (Criteria) this;
        }

        public Criteria andPushTokenEqualTo(String value) {
            addCriterion("push_token =", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotEqualTo(String value) {
            addCriterion("push_token <>", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenGreaterThan(String value) {
            addCriterion("push_token >", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenGreaterThanOrEqualTo(String value) {
            addCriterion("push_token >=", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLessThan(String value) {
            addCriterion("push_token <", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLessThanOrEqualTo(String value) {
            addCriterion("push_token <=", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLike(String value) {
            addCriterion("push_token like", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotLike(String value) {
            addCriterion("push_token not like", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenIn(List<String> values) {
            addCriterion("push_token in", values, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotIn(List<String> values) {
            addCriterion("push_token not in", values, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenBetween(String value1, String value2) {
            addCriterion("push_token between", value1, value2, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotBetween(String value1, String value2) {
            addCriterion("push_token not between", value1, value2, "pushToken");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Short value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Short value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Short value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Short value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Short value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Short value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Short> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Short> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Short value1, Short value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Short value1, Short value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSocialSourceIsNull() {
            addCriterion("social_source is null");
            return (Criteria) this;
        }

        public Criteria andSocialSourceIsNotNull() {
            addCriterion("social_source is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSourceEqualTo(String value) {
            addCriterion("social_source =", value, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceNotEqualTo(String value) {
            addCriterion("social_source <>", value, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceGreaterThan(String value) {
            addCriterion("social_source >", value, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceGreaterThanOrEqualTo(String value) {
            addCriterion("social_source >=", value, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceLessThan(String value) {
            addCriterion("social_source <", value, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceLessThanOrEqualTo(String value) {
            addCriterion("social_source <=", value, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceLike(String value) {
            addCriterion("social_source like", value, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceNotLike(String value) {
            addCriterion("social_source not like", value, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceIn(List<String> values) {
            addCriterion("social_source in", values, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceNotIn(List<String> values) {
            addCriterion("social_source not in", values, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceBetween(String value1, String value2) {
            addCriterion("social_source between", value1, value2, "socialSource");
            return (Criteria) this;
        }

        public Criteria andSocialSourceNotBetween(String value1, String value2) {
            addCriterion("social_source not between", value1, value2, "socialSource");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIsNull() {
            addCriterion("highest_education is null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIsNotNull() {
            addCriterion("highest_education is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationEqualTo(Short value) {
            addCriterion("highest_education =", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotEqualTo(Short value) {
            addCriterion("highest_education <>", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationGreaterThan(Short value) {
            addCriterion("highest_education >", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationGreaterThanOrEqualTo(Short value) {
            addCriterion("highest_education >=", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLessThan(Short value) {
            addCriterion("highest_education <", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLessThanOrEqualTo(Short value) {
            addCriterion("highest_education <=", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIn(List<Short> values) {
            addCriterion("highest_education in", values, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotIn(List<Short> values) {
            addCriterion("highest_education not in", values, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationBetween(Short value1, Short value2) {
            addCriterion("highest_education between", value1, value2, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotBetween(Short value1, Short value2) {
            addCriterion("highest_education not between", value1, value2, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andLocationLngIsNull() {
            addCriterion("location_lng is null");
            return (Criteria) this;
        }

        public Criteria andLocationLngIsNotNull() {
            addCriterion("location_lng is not null");
            return (Criteria) this;
        }

        public Criteria andLocationLngEqualTo(Double value) {
            addCriterion("location_lng =", value, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngNotEqualTo(Double value) {
            addCriterion("location_lng <>", value, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngGreaterThan(Double value) {
            addCriterion("location_lng >", value, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngGreaterThanOrEqualTo(Double value) {
            addCriterion("location_lng >=", value, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngLessThan(Double value) {
            addCriterion("location_lng <", value, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngLessThanOrEqualTo(Double value) {
            addCriterion("location_lng <=", value, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngIn(List<Double> values) {
            addCriterion("location_lng in", values, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngNotIn(List<Double> values) {
            addCriterion("location_lng not in", values, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngBetween(Double value1, Double value2) {
            addCriterion("location_lng between", value1, value2, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLngNotBetween(Double value1, Double value2) {
            addCriterion("location_lng not between", value1, value2, "locationLng");
            return (Criteria) this;
        }

        public Criteria andLocationLatIsNull() {
            addCriterion("location_lat is null");
            return (Criteria) this;
        }

        public Criteria andLocationLatIsNotNull() {
            addCriterion("location_lat is not null");
            return (Criteria) this;
        }

        public Criteria andLocationLatEqualTo(Double value) {
            addCriterion("location_lat =", value, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatNotEqualTo(Double value) {
            addCriterion("location_lat <>", value, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatGreaterThan(Double value) {
            addCriterion("location_lat >", value, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatGreaterThanOrEqualTo(Double value) {
            addCriterion("location_lat >=", value, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatLessThan(Double value) {
            addCriterion("location_lat <", value, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatLessThanOrEqualTo(Double value) {
            addCriterion("location_lat <=", value, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatIn(List<Double> values) {
            addCriterion("location_lat in", values, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatNotIn(List<Double> values) {
            addCriterion("location_lat not in", values, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatBetween(Double value1, Double value2) {
            addCriterion("location_lat between", value1, value2, "locationLat");
            return (Criteria) this;
        }

        public Criteria andLocationLatNotBetween(Double value1, Double value2) {
            addCriterion("location_lat not between", value1, value2, "locationLat");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andLivingCountryIsNull() {
            addCriterion("living_country is null");
            return (Criteria) this;
        }

        public Criteria andLivingCountryIsNotNull() {
            addCriterion("living_country is not null");
            return (Criteria) this;
        }

        public Criteria andLivingCountryEqualTo(String value) {
            addCriterion("living_country =", value, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryNotEqualTo(String value) {
            addCriterion("living_country <>", value, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryGreaterThan(String value) {
            addCriterion("living_country >", value, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryGreaterThanOrEqualTo(String value) {
            addCriterion("living_country >=", value, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryLessThan(String value) {
            addCriterion("living_country <", value, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryLessThanOrEqualTo(String value) {
            addCriterion("living_country <=", value, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryLike(String value) {
            addCriterion("living_country like", value, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryNotLike(String value) {
            addCriterion("living_country not like", value, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryIn(List<String> values) {
            addCriterion("living_country in", values, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryNotIn(List<String> values) {
            addCriterion("living_country not in", values, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryBetween(String value1, String value2) {
            addCriterion("living_country between", value1, value2, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingCountryNotBetween(String value1, String value2) {
            addCriterion("living_country not between", value1, value2, "livingCountry");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceIsNull() {
            addCriterion("living_province is null");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceIsNotNull() {
            addCriterion("living_province is not null");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceEqualTo(String value) {
            addCriterion("living_province =", value, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceNotEqualTo(String value) {
            addCriterion("living_province <>", value, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceGreaterThan(String value) {
            addCriterion("living_province >", value, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("living_province >=", value, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceLessThan(String value) {
            addCriterion("living_province <", value, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceLessThanOrEqualTo(String value) {
            addCriterion("living_province <=", value, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceLike(String value) {
            addCriterion("living_province like", value, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceNotLike(String value) {
            addCriterion("living_province not like", value, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceIn(List<String> values) {
            addCriterion("living_province in", values, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceNotIn(List<String> values) {
            addCriterion("living_province not in", values, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceBetween(String value1, String value2) {
            addCriterion("living_province between", value1, value2, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingProvinceNotBetween(String value1, String value2) {
            addCriterion("living_province not between", value1, value2, "livingProvince");
            return (Criteria) this;
        }

        public Criteria andLivingCityIsNull() {
            addCriterion("living_city is null");
            return (Criteria) this;
        }

        public Criteria andLivingCityIsNotNull() {
            addCriterion("living_city is not null");
            return (Criteria) this;
        }

        public Criteria andLivingCityEqualTo(String value) {
            addCriterion("living_city =", value, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityNotEqualTo(String value) {
            addCriterion("living_city <>", value, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityGreaterThan(String value) {
            addCriterion("living_city >", value, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityGreaterThanOrEqualTo(String value) {
            addCriterion("living_city >=", value, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityLessThan(String value) {
            addCriterion("living_city <", value, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityLessThanOrEqualTo(String value) {
            addCriterion("living_city <=", value, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityLike(String value) {
            addCriterion("living_city like", value, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityNotLike(String value) {
            addCriterion("living_city not like", value, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityIn(List<String> values) {
            addCriterion("living_city in", values, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityNotIn(List<String> values) {
            addCriterion("living_city not in", values, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityBetween(String value1, String value2) {
            addCriterion("living_city between", value1, value2, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingCityNotBetween(String value1, String value2) {
            addCriterion("living_city not between", value1, value2, "livingCity");
            return (Criteria) this;
        }

        public Criteria andLivingAreaIsNull() {
            addCriterion("living_area is null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaIsNotNull() {
            addCriterion("living_area is not null");
            return (Criteria) this;
        }

        public Criteria andLivingAreaEqualTo(String value) {
            addCriterion("living_area =", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNotEqualTo(String value) {
            addCriterion("living_area <>", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGreaterThan(String value) {
            addCriterion("living_area >", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaGreaterThanOrEqualTo(String value) {
            addCriterion("living_area >=", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaLessThan(String value) {
            addCriterion("living_area <", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaLessThanOrEqualTo(String value) {
            addCriterion("living_area <=", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaLike(String value) {
            addCriterion("living_area like", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNotLike(String value) {
            addCriterion("living_area not like", value, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaIn(List<String> values) {
            addCriterion("living_area in", values, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNotIn(List<String> values) {
            addCriterion("living_area not in", values, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaBetween(String value1, String value2) {
            addCriterion("living_area between", value1, value2, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingAreaNotBetween(String value1, String value2) {
            addCriterion("living_area not between", value1, value2, "livingArea");
            return (Criteria) this;
        }

        public Criteria andLivingStreetIsNull() {
            addCriterion("living_street is null");
            return (Criteria) this;
        }

        public Criteria andLivingStreetIsNotNull() {
            addCriterion("living_street is not null");
            return (Criteria) this;
        }

        public Criteria andLivingStreetEqualTo(String value) {
            addCriterion("living_street =", value, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetNotEqualTo(String value) {
            addCriterion("living_street <>", value, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetGreaterThan(String value) {
            addCriterion("living_street >", value, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetGreaterThanOrEqualTo(String value) {
            addCriterion("living_street >=", value, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetLessThan(String value) {
            addCriterion("living_street <", value, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetLessThanOrEqualTo(String value) {
            addCriterion("living_street <=", value, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetLike(String value) {
            addCriterion("living_street like", value, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetNotLike(String value) {
            addCriterion("living_street not like", value, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetIn(List<String> values) {
            addCriterion("living_street in", values, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetNotIn(List<String> values) {
            addCriterion("living_street not in", values, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetBetween(String value1, String value2) {
            addCriterion("living_street between", value1, value2, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andLivingStreetNotBetween(String value1, String value2) {
            addCriterion("living_street not between", value1, value2, "livingStreet");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
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

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceIsNull() {
            addCriterion("last_login_device is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceIsNotNull() {
            addCriterion("last_login_device is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceEqualTo(String value) {
            addCriterion("last_login_device =", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceNotEqualTo(String value) {
            addCriterion("last_login_device <>", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceGreaterThan(String value) {
            addCriterion("last_login_device >", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_device >=", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceLessThan(String value) {
            addCriterion("last_login_device <", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceLessThanOrEqualTo(String value) {
            addCriterion("last_login_device <=", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceLike(String value) {
            addCriterion("last_login_device like", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceNotLike(String value) {
            addCriterion("last_login_device not like", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceIn(List<String> values) {
            addCriterion("last_login_device in", values, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceNotIn(List<String> values) {
            addCriterion("last_login_device not in", values, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceBetween(String value1, String value2) {
            addCriterion("last_login_device between", value1, value2, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceNotBetween(String value1, String value2) {
            addCriterion("last_login_device not between", value1, value2, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andRecommandByIsNull() {
            addCriterion("recommand_by is null");
            return (Criteria) this;
        }

        public Criteria andRecommandByIsNotNull() {
            addCriterion("recommand_by is not null");
            return (Criteria) this;
        }

        public Criteria andRecommandByEqualTo(String value) {
            addCriterion("recommand_by =", value, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByNotEqualTo(String value) {
            addCriterion("recommand_by <>", value, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByGreaterThan(String value) {
            addCriterion("recommand_by >", value, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByGreaterThanOrEqualTo(String value) {
            addCriterion("recommand_by >=", value, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByLessThan(String value) {
            addCriterion("recommand_by <", value, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByLessThanOrEqualTo(String value) {
            addCriterion("recommand_by <=", value, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByLike(String value) {
            addCriterion("recommand_by like", value, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByNotLike(String value) {
            addCriterion("recommand_by not like", value, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByIn(List<String> values) {
            addCriterion("recommand_by in", values, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByNotIn(List<String> values) {
            addCriterion("recommand_by not in", values, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByBetween(String value1, String value2) {
            addCriterion("recommand_by between", value1, value2, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andRecommandByNotBetween(String value1, String value2) {
            addCriterion("recommand_by not between", value1, value2, "recommandBy");
            return (Criteria) this;
        }

        public Criteria andProfileIsNull() {
            addCriterion("profile is null");
            return (Criteria) this;
        }

        public Criteria andProfileIsNotNull() {
            addCriterion("profile is not null");
            return (Criteria) this;
        }

        public Criteria andProfileEqualTo(String value) {
            addCriterion("profile =", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotEqualTo(String value) {
            addCriterion("profile <>", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThan(String value) {
            addCriterion("profile >", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThanOrEqualTo(String value) {
            addCriterion("profile >=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThan(String value) {
            addCriterion("profile <", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThanOrEqualTo(String value) {
            addCriterion("profile <=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLike(String value) {
            addCriterion("profile like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotLike(String value) {
            addCriterion("profile not like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileIn(List<String> values) {
            addCriterion("profile in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotIn(List<String> values) {
            addCriterion("profile not in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileBetween(String value1, String value2) {
            addCriterion("profile between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotBetween(String value1, String value2) {
            addCriterion("profile not between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andReportLineIsNull() {
            addCriterion("report_line is null");
            return (Criteria) this;
        }

        public Criteria andReportLineIsNotNull() {
            addCriterion("report_line is not null");
            return (Criteria) this;
        }

        public Criteria andReportLineEqualTo(String value) {
            addCriterion("report_line =", value, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineNotEqualTo(String value) {
            addCriterion("report_line <>", value, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineGreaterThan(String value) {
            addCriterion("report_line >", value, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineGreaterThanOrEqualTo(String value) {
            addCriterion("report_line >=", value, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineLessThan(String value) {
            addCriterion("report_line <", value, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineLessThanOrEqualTo(String value) {
            addCriterion("report_line <=", value, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineLike(String value) {
            addCriterion("report_line like", value, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineNotLike(String value) {
            addCriterion("report_line not like", value, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineIn(List<String> values) {
            addCriterion("report_line in", values, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineNotIn(List<String> values) {
            addCriterion("report_line not in", values, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineBetween(String value1, String value2) {
            addCriterion("report_line between", value1, value2, "reportLine");
            return (Criteria) this;
        }

        public Criteria andReportLineNotBetween(String value1, String value2) {
            addCriterion("report_line not between", value1, value2, "reportLine");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Short value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Short value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Short value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Short value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Short value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Short value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Short> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Short> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Short value1, Short value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Short value1, Short value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andOrgPkIsNull() {
            addCriterion("org_pk is null");
            return (Criteria) this;
        }

        public Criteria andOrgPkIsNotNull() {
            addCriterion("org_pk is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPkEqualTo(Long value) {
            addCriterion("org_pk =", value, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkNotEqualTo(Long value) {
            addCriterion("org_pk <>", value, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkGreaterThan(Long value) {
            addCriterion("org_pk >", value, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkGreaterThanOrEqualTo(Long value) {
            addCriterion("org_pk >=", value, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkLessThan(Long value) {
            addCriterion("org_pk <", value, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkLessThanOrEqualTo(Long value) {
            addCriterion("org_pk <=", value, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkIn(List<Long> values) {
            addCriterion("org_pk in", values, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkNotIn(List<Long> values) {
            addCriterion("org_pk not in", values, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkBetween(Long value1, Long value2) {
            addCriterion("org_pk between", value1, value2, "orgPk");
            return (Criteria) this;
        }

        public Criteria andOrgPkNotBetween(Long value1, Long value2) {
            addCriterion("org_pk not between", value1, value2, "orgPk");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNull() {
            addCriterion("employee_no is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNotNull() {
            addCriterion("employee_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoEqualTo(String value) {
            addCriterion("employee_no =", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotEqualTo(String value) {
            addCriterion("employee_no <>", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThan(String value) {
            addCriterion("employee_no >", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("employee_no >=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThan(String value) {
            addCriterion("employee_no <", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThanOrEqualTo(String value) {
            addCriterion("employee_no <=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLike(String value) {
            addCriterion("employee_no like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotLike(String value) {
            addCriterion("employee_no not like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIn(List<String> values) {
            addCriterion("employee_no in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotIn(List<String> values) {
            addCriterion("employee_no not in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoBetween(String value1, String value2) {
            addCriterion("employee_no between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotBetween(String value1, String value2) {
            addCriterion("employee_no not between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoIsNull() {
            addCriterion("partner_no is null");
            return (Criteria) this;
        }

        public Criteria andPartnerNoIsNotNull() {
            addCriterion("partner_no is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerNoEqualTo(String value) {
            addCriterion("partner_no =", value, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoNotEqualTo(String value) {
            addCriterion("partner_no <>", value, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoGreaterThan(String value) {
            addCriterion("partner_no >", value, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoGreaterThanOrEqualTo(String value) {
            addCriterion("partner_no >=", value, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoLessThan(String value) {
            addCriterion("partner_no <", value, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoLessThanOrEqualTo(String value) {
            addCriterion("partner_no <=", value, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoLike(String value) {
            addCriterion("partner_no like", value, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoNotLike(String value) {
            addCriterion("partner_no not like", value, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoIn(List<String> values) {
            addCriterion("partner_no in", values, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoNotIn(List<String> values) {
            addCriterion("partner_no not in", values, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoBetween(String value1, String value2) {
            addCriterion("partner_no between", value1, value2, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerNoNotBetween(String value1, String value2) {
            addCriterion("partner_no not between", value1, value2, "partnerNo");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelIsNull() {
            addCriterion("partner_level is null");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelIsNotNull() {
            addCriterion("partner_level is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelEqualTo(Integer value) {
            addCriterion("partner_level =", value, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelNotEqualTo(Integer value) {
            addCriterion("partner_level <>", value, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelGreaterThan(Integer value) {
            addCriterion("partner_level >", value, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_level >=", value, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelLessThan(Integer value) {
            addCriterion("partner_level <", value, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelLessThanOrEqualTo(Integer value) {
            addCriterion("partner_level <=", value, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelIn(List<Integer> values) {
            addCriterion("partner_level in", values, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelNotIn(List<Integer> values) {
            addCriterion("partner_level not in", values, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelBetween(Integer value1, Integer value2) {
            addCriterion("partner_level between", value1, value2, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_level not between", value1, value2, "partnerLevel");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeIsNull() {
            addCriterion("partner_type is null");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeIsNotNull() {
            addCriterion("partner_type is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeEqualTo(Integer value) {
            addCriterion("partner_type =", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeNotEqualTo(Integer value) {
            addCriterion("partner_type <>", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeGreaterThan(Integer value) {
            addCriterion("partner_type >", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_type >=", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeLessThan(Integer value) {
            addCriterion("partner_type <", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("partner_type <=", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeIn(List<Integer> values) {
            addCriterion("partner_type in", values, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeNotIn(List<Integer> values) {
            addCriterion("partner_type not in", values, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeBetween(Integer value1, Integer value2) {
            addCriterion("partner_type between", value1, value2, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_type not between", value1, value2, "partnerType");
            return (Criteria) this;
        }

        public Criteria andBindNo1IsNull() {
            addCriterion("bind_no1 is null");
            return (Criteria) this;
        }

        public Criteria andBindNo1IsNotNull() {
            addCriterion("bind_no1 is not null");
            return (Criteria) this;
        }

        public Criteria andBindNo1EqualTo(String value) {
            addCriterion("bind_no1 =", value, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1NotEqualTo(String value) {
            addCriterion("bind_no1 <>", value, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1GreaterThan(String value) {
            addCriterion("bind_no1 >", value, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1GreaterThanOrEqualTo(String value) {
            addCriterion("bind_no1 >=", value, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1LessThan(String value) {
            addCriterion("bind_no1 <", value, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1LessThanOrEqualTo(String value) {
            addCriterion("bind_no1 <=", value, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1Like(String value) {
            addCriterion("bind_no1 like", value, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1NotLike(String value) {
            addCriterion("bind_no1 not like", value, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1In(List<String> values) {
            addCriterion("bind_no1 in", values, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1NotIn(List<String> values) {
            addCriterion("bind_no1 not in", values, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1Between(String value1, String value2) {
            addCriterion("bind_no1 between", value1, value2, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo1NotBetween(String value1, String value2) {
            addCriterion("bind_no1 not between", value1, value2, "bindNo1");
            return (Criteria) this;
        }

        public Criteria andBindNo2IsNull() {
            addCriterion("bind_no2 is null");
            return (Criteria) this;
        }

        public Criteria andBindNo2IsNotNull() {
            addCriterion("bind_no2 is not null");
            return (Criteria) this;
        }

        public Criteria andBindNo2EqualTo(String value) {
            addCriterion("bind_no2 =", value, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2NotEqualTo(String value) {
            addCriterion("bind_no2 <>", value, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2GreaterThan(String value) {
            addCriterion("bind_no2 >", value, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2GreaterThanOrEqualTo(String value) {
            addCriterion("bind_no2 >=", value, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2LessThan(String value) {
            addCriterion("bind_no2 <", value, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2LessThanOrEqualTo(String value) {
            addCriterion("bind_no2 <=", value, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2Like(String value) {
            addCriterion("bind_no2 like", value, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2NotLike(String value) {
            addCriterion("bind_no2 not like", value, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2In(List<String> values) {
            addCriterion("bind_no2 in", values, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2NotIn(List<String> values) {
            addCriterion("bind_no2 not in", values, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2Between(String value1, String value2) {
            addCriterion("bind_no2 between", value1, value2, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo2NotBetween(String value1, String value2) {
            addCriterion("bind_no2 not between", value1, value2, "bindNo2");
            return (Criteria) this;
        }

        public Criteria andBindNo3IsNull() {
            addCriterion("bind_no3 is null");
            return (Criteria) this;
        }

        public Criteria andBindNo3IsNotNull() {
            addCriterion("bind_no3 is not null");
            return (Criteria) this;
        }

        public Criteria andBindNo3EqualTo(String value) {
            addCriterion("bind_no3 =", value, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3NotEqualTo(String value) {
            addCriterion("bind_no3 <>", value, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3GreaterThan(String value) {
            addCriterion("bind_no3 >", value, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3GreaterThanOrEqualTo(String value) {
            addCriterion("bind_no3 >=", value, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3LessThan(String value) {
            addCriterion("bind_no3 <", value, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3LessThanOrEqualTo(String value) {
            addCriterion("bind_no3 <=", value, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3Like(String value) {
            addCriterion("bind_no3 like", value, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3NotLike(String value) {
            addCriterion("bind_no3 not like", value, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3In(List<String> values) {
            addCriterion("bind_no3 in", values, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3NotIn(List<String> values) {
            addCriterion("bind_no3 not in", values, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3Between(String value1, String value2) {
            addCriterion("bind_no3 between", value1, value2, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo3NotBetween(String value1, String value2) {
            addCriterion("bind_no3 not between", value1, value2, "bindNo3");
            return (Criteria) this;
        }

        public Criteria andBindNo4IsNull() {
            addCriterion("bind_no4 is null");
            return (Criteria) this;
        }

        public Criteria andBindNo4IsNotNull() {
            addCriterion("bind_no4 is not null");
            return (Criteria) this;
        }

        public Criteria andBindNo4EqualTo(String value) {
            addCriterion("bind_no4 =", value, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4NotEqualTo(String value) {
            addCriterion("bind_no4 <>", value, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4GreaterThan(String value) {
            addCriterion("bind_no4 >", value, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4GreaterThanOrEqualTo(String value) {
            addCriterion("bind_no4 >=", value, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4LessThan(String value) {
            addCriterion("bind_no4 <", value, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4LessThanOrEqualTo(String value) {
            addCriterion("bind_no4 <=", value, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4Like(String value) {
            addCriterion("bind_no4 like", value, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4NotLike(String value) {
            addCriterion("bind_no4 not like", value, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4In(List<String> values) {
            addCriterion("bind_no4 in", values, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4NotIn(List<String> values) {
            addCriterion("bind_no4 not in", values, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4Between(String value1, String value2) {
            addCriterion("bind_no4 between", value1, value2, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo4NotBetween(String value1, String value2) {
            addCriterion("bind_no4 not between", value1, value2, "bindNo4");
            return (Criteria) this;
        }

        public Criteria andBindNo5IsNull() {
            addCriterion("bind_no5 is null");
            return (Criteria) this;
        }

        public Criteria andBindNo5IsNotNull() {
            addCriterion("bind_no5 is not null");
            return (Criteria) this;
        }

        public Criteria andBindNo5EqualTo(String value) {
            addCriterion("bind_no5 =", value, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5NotEqualTo(String value) {
            addCriterion("bind_no5 <>", value, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5GreaterThan(String value) {
            addCriterion("bind_no5 >", value, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5GreaterThanOrEqualTo(String value) {
            addCriterion("bind_no5 >=", value, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5LessThan(String value) {
            addCriterion("bind_no5 <", value, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5LessThanOrEqualTo(String value) {
            addCriterion("bind_no5 <=", value, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5Like(String value) {
            addCriterion("bind_no5 like", value, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5NotLike(String value) {
            addCriterion("bind_no5 not like", value, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5In(List<String> values) {
            addCriterion("bind_no5 in", values, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5NotIn(List<String> values) {
            addCriterion("bind_no5 not in", values, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5Between(String value1, String value2) {
            addCriterion("bind_no5 between", value1, value2, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andBindNo5NotBetween(String value1, String value2) {
            addCriterion("bind_no5 not between", value1, value2, "bindNo5");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordIsNull() {
            addCriterion("received_reword is null");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordIsNotNull() {
            addCriterion("received_reword is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordEqualTo(Integer value) {
            addCriterion("received_reword =", value, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordNotEqualTo(Integer value) {
            addCriterion("received_reword <>", value, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordGreaterThan(Integer value) {
            addCriterion("received_reword >", value, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordGreaterThanOrEqualTo(Integer value) {
            addCriterion("received_reword >=", value, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordLessThan(Integer value) {
            addCriterion("received_reword <", value, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordLessThanOrEqualTo(Integer value) {
            addCriterion("received_reword <=", value, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordIn(List<Integer> values) {
            addCriterion("received_reword in", values, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordNotIn(List<Integer> values) {
            addCriterion("received_reword not in", values, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordBetween(Integer value1, Integer value2) {
            addCriterion("received_reword between", value1, value2, "receivedReword");
            return (Criteria) this;
        }

        public Criteria andReceivedRewordNotBetween(Integer value1, Integer value2) {
            addCriterion("received_reword not between", value1, value2, "receivedReword");
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