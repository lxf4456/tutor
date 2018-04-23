package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblLabelMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblLabelMainExample() {
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

        public Criteria andLabelMainIdIsNull() {
            addCriterion("label_main_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdIsNotNull() {
            addCriterion("label_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdEqualTo(Long value) {
            addCriterion("label_main_id =", value, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdNotEqualTo(Long value) {
            addCriterion("label_main_id <>", value, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdGreaterThan(Long value) {
            addCriterion("label_main_id >", value, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("label_main_id >=", value, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdLessThan(Long value) {
            addCriterion("label_main_id <", value, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdLessThanOrEqualTo(Long value) {
            addCriterion("label_main_id <=", value, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdIn(List<Long> values) {
            addCriterion("label_main_id in", values, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdNotIn(List<Long> values) {
            addCriterion("label_main_id not in", values, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdBetween(Long value1, Long value2) {
            addCriterion("label_main_id between", value1, value2, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelMainIdNotBetween(Long value1, Long value2) {
            addCriterion("label_main_id not between", value1, value2, "labelMainId");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNull() {
            addCriterion("label_name is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNotNull() {
            addCriterion("label_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameEqualTo(String value) {
            addCriterion("label_name =", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotEqualTo(String value) {
            addCriterion("label_name <>", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThan(String value) {
            addCriterion("label_name >", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("label_name >=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThan(String value) {
            addCriterion("label_name <", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThanOrEqualTo(String value) {
            addCriterion("label_name <=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLike(String value) {
            addCriterion("label_name like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotLike(String value) {
            addCriterion("label_name not like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameIn(List<String> values) {
            addCriterion("label_name in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotIn(List<String> values) {
            addCriterion("label_name not in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameBetween(String value1, String value2) {
            addCriterion("label_name between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotBetween(String value1, String value2) {
            addCriterion("label_name not between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhIsNull() {
            addCriterion("label_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhIsNotNull() {
            addCriterion("label_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhEqualTo(String value) {
            addCriterion("label_name_zh =", value, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhNotEqualTo(String value) {
            addCriterion("label_name_zh <>", value, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhGreaterThan(String value) {
            addCriterion("label_name_zh >", value, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("label_name_zh >=", value, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhLessThan(String value) {
            addCriterion("label_name_zh <", value, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhLessThanOrEqualTo(String value) {
            addCriterion("label_name_zh <=", value, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhLike(String value) {
            addCriterion("label_name_zh like", value, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhNotLike(String value) {
            addCriterion("label_name_zh not like", value, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhIn(List<String> values) {
            addCriterion("label_name_zh in", values, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhNotIn(List<String> values) {
            addCriterion("label_name_zh not in", values, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhBetween(String value1, String value2) {
            addCriterion("label_name_zh between", value1, value2, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelNameZhNotBetween(String value1, String value2) {
            addCriterion("label_name_zh not between", value1, value2, "labelNameZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhIsNull() {
            addCriterion("label_category_zh is null");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhIsNotNull() {
            addCriterion("label_category_zh is not null");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhEqualTo(String value) {
            addCriterion("label_category_zh =", value, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhNotEqualTo(String value) {
            addCriterion("label_category_zh <>", value, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhGreaterThan(String value) {
            addCriterion("label_category_zh >", value, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhGreaterThanOrEqualTo(String value) {
            addCriterion("label_category_zh >=", value, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhLessThan(String value) {
            addCriterion("label_category_zh <", value, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhLessThanOrEqualTo(String value) {
            addCriterion("label_category_zh <=", value, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhLike(String value) {
            addCriterion("label_category_zh like", value, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhNotLike(String value) {
            addCriterion("label_category_zh not like", value, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhIn(List<String> values) {
            addCriterion("label_category_zh in", values, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhNotIn(List<String> values) {
            addCriterion("label_category_zh not in", values, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhBetween(String value1, String value2) {
            addCriterion("label_category_zh between", value1, value2, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryZhNotBetween(String value1, String value2) {
            addCriterion("label_category_zh not between", value1, value2, "labelCategoryZh");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryIsNull() {
            addCriterion("label_category is null");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryIsNotNull() {
            addCriterion("label_category is not null");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryEqualTo(String value) {
            addCriterion("label_category =", value, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryNotEqualTo(String value) {
            addCriterion("label_category <>", value, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryGreaterThan(String value) {
            addCriterion("label_category >", value, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("label_category >=", value, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryLessThan(String value) {
            addCriterion("label_category <", value, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryLessThanOrEqualTo(String value) {
            addCriterion("label_category <=", value, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryLike(String value) {
            addCriterion("label_category like", value, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryNotLike(String value) {
            addCriterion("label_category not like", value, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryIn(List<String> values) {
            addCriterion("label_category in", values, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryNotIn(List<String> values) {
            addCriterion("label_category not in", values, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryBetween(String value1, String value2) {
            addCriterion("label_category between", value1, value2, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelCategoryNotBetween(String value1, String value2) {
            addCriterion("label_category not between", value1, value2, "labelCategory");
            return (Criteria) this;
        }

        public Criteria andLabelStateIsNull() {
            addCriterion("label_state is null");
            return (Criteria) this;
        }

        public Criteria andLabelStateIsNotNull() {
            addCriterion("label_state is not null");
            return (Criteria) this;
        }

        public Criteria andLabelStateEqualTo(Integer value) {
            addCriterion("label_state =", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateNotEqualTo(Integer value) {
            addCriterion("label_state <>", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateGreaterThan(Integer value) {
            addCriterion("label_state >", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_state >=", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateLessThan(Integer value) {
            addCriterion("label_state <", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateLessThanOrEqualTo(Integer value) {
            addCriterion("label_state <=", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateIn(List<Integer> values) {
            addCriterion("label_state in", values, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateNotIn(List<Integer> values) {
            addCriterion("label_state not in", values, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateBetween(Integer value1, Integer value2) {
            addCriterion("label_state between", value1, value2, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateNotBetween(Integer value1, Integer value2) {
            addCriterion("label_state not between", value1, value2, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelDescIsNull() {
            addCriterion("label_desc is null");
            return (Criteria) this;
        }

        public Criteria andLabelDescIsNotNull() {
            addCriterion("label_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLabelDescEqualTo(String value) {
            addCriterion("label_desc =", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescNotEqualTo(String value) {
            addCriterion("label_desc <>", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescGreaterThan(String value) {
            addCriterion("label_desc >", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescGreaterThanOrEqualTo(String value) {
            addCriterion("label_desc >=", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescLessThan(String value) {
            addCriterion("label_desc <", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescLessThanOrEqualTo(String value) {
            addCriterion("label_desc <=", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescLike(String value) {
            addCriterion("label_desc like", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescNotLike(String value) {
            addCriterion("label_desc not like", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescIn(List<String> values) {
            addCriterion("label_desc in", values, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescNotIn(List<String> values) {
            addCriterion("label_desc not in", values, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescBetween(String value1, String value2) {
            addCriterion("label_desc between", value1, value2, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescNotBetween(String value1, String value2) {
            addCriterion("label_desc not between", value1, value2, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelLangIsNull() {
            addCriterion("label_lang is null");
            return (Criteria) this;
        }

        public Criteria andLabelLangIsNotNull() {
            addCriterion("label_lang is not null");
            return (Criteria) this;
        }

        public Criteria andLabelLangEqualTo(String value) {
            addCriterion("label_lang =", value, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangNotEqualTo(String value) {
            addCriterion("label_lang <>", value, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangGreaterThan(String value) {
            addCriterion("label_lang >", value, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangGreaterThanOrEqualTo(String value) {
            addCriterion("label_lang >=", value, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangLessThan(String value) {
            addCriterion("label_lang <", value, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangLessThanOrEqualTo(String value) {
            addCriterion("label_lang <=", value, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangLike(String value) {
            addCriterion("label_lang like", value, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangNotLike(String value) {
            addCriterion("label_lang not like", value, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangIn(List<String> values) {
            addCriterion("label_lang in", values, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangNotIn(List<String> values) {
            addCriterion("label_lang not in", values, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangBetween(String value1, String value2) {
            addCriterion("label_lang between", value1, value2, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelLangNotBetween(String value1, String value2) {
            addCriterion("label_lang not between", value1, value2, "labelLang");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIsNull() {
            addCriterion("label_type is null");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIsNotNull() {
            addCriterion("label_type is not null");
            return (Criteria) this;
        }

        public Criteria andLabelTypeEqualTo(Integer value) {
            addCriterion("label_type =", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotEqualTo(Integer value) {
            addCriterion("label_type <>", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeGreaterThan(Integer value) {
            addCriterion("label_type >", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_type >=", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLessThan(Integer value) {
            addCriterion("label_type <", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("label_type <=", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIn(List<Integer> values) {
            addCriterion("label_type in", values, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotIn(List<Integer> values) {
            addCriterion("label_type not in", values, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeBetween(Integer value1, Integer value2) {
            addCriterion("label_type between", value1, value2, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("label_type not between", value1, value2, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarIsNull() {
            addCriterion("label_avatar is null");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarIsNotNull() {
            addCriterion("label_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarEqualTo(String value) {
            addCriterion("label_avatar =", value, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarNotEqualTo(String value) {
            addCriterion("label_avatar <>", value, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarGreaterThan(String value) {
            addCriterion("label_avatar >", value, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("label_avatar >=", value, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarLessThan(String value) {
            addCriterion("label_avatar <", value, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarLessThanOrEqualTo(String value) {
            addCriterion("label_avatar <=", value, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarLike(String value) {
            addCriterion("label_avatar like", value, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarNotLike(String value) {
            addCriterion("label_avatar not like", value, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarIn(List<String> values) {
            addCriterion("label_avatar in", values, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarNotIn(List<String> values) {
            addCriterion("label_avatar not in", values, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarBetween(String value1, String value2) {
            addCriterion("label_avatar between", value1, value2, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andLabelAvatarNotBetween(String value1, String value2) {
            addCriterion("label_avatar not between", value1, value2, "labelAvatar");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelIsNull() {
            addCriterion("recommand_level is null");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelIsNotNull() {
            addCriterion("recommand_level is not null");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelEqualTo(Integer value) {
            addCriterion("recommand_level =", value, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelNotEqualTo(Integer value) {
            addCriterion("recommand_level <>", value, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelGreaterThan(Integer value) {
            addCriterion("recommand_level >", value, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommand_level >=", value, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelLessThan(Integer value) {
            addCriterion("recommand_level <", value, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelLessThanOrEqualTo(Integer value) {
            addCriterion("recommand_level <=", value, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelIn(List<Integer> values) {
            addCriterion("recommand_level in", values, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelNotIn(List<Integer> values) {
            addCriterion("recommand_level not in", values, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelBetween(Integer value1, Integer value2) {
            addCriterion("recommand_level between", value1, value2, "recommandLevel");
            return (Criteria) this;
        }

        public Criteria andRecommandLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("recommand_level not between", value1, value2, "recommandLevel");
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