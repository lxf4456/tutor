package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andGoodsBrandIdIsNull() {
            addCriterion("goods_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdIsNotNull() {
            addCriterion("goods_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdEqualTo(Long value) {
            addCriterion("goods_brand_id =", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotEqualTo(Long value) {
            addCriterion("goods_brand_id <>", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdGreaterThan(Long value) {
            addCriterion("goods_brand_id >", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_brand_id >=", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdLessThan(Long value) {
            addCriterion("goods_brand_id <", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_brand_id <=", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdIn(List<Long> values) {
            addCriterion("goods_brand_id in", values, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotIn(List<Long> values) {
            addCriterion("goods_brand_id not in", values, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdBetween(Long value1, Long value2) {
            addCriterion("goods_brand_id between", value1, value2, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_brand_id not between", value1, value2, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdIsNull() {
            addCriterion("goods_categories_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdIsNotNull() {
            addCriterion("goods_categories_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdEqualTo(Long value) {
            addCriterion("goods_categories_id =", value, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdNotEqualTo(Long value) {
            addCriterion("goods_categories_id <>", value, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdGreaterThan(Long value) {
            addCriterion("goods_categories_id >", value, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_categories_id >=", value, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdLessThan(Long value) {
            addCriterion("goods_categories_id <", value, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_categories_id <=", value, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdIn(List<Long> values) {
            addCriterion("goods_categories_id in", values, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdNotIn(List<Long> values) {
            addCriterion("goods_categories_id not in", values, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdBetween(Long value1, Long value2) {
            addCriterion("goods_categories_id between", value1, value2, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoriesIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_categories_id not between", value1, value2, "goodsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdIsNull() {
            addCriterion("goods_types_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdIsNotNull() {
            addCriterion("goods_types_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdEqualTo(Long value) {
            addCriterion("goods_types_id =", value, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdNotEqualTo(Long value) {
            addCriterion("goods_types_id <>", value, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdGreaterThan(Long value) {
            addCriterion("goods_types_id >", value, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_types_id >=", value, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdLessThan(Long value) {
            addCriterion("goods_types_id <", value, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_types_id <=", value, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdIn(List<Long> values) {
            addCriterion("goods_types_id in", values, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdNotIn(List<Long> values) {
            addCriterion("goods_types_id not in", values, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdBetween(Long value1, Long value2) {
            addCriterion("goods_types_id between", value1, value2, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypesIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_types_id not between", value1, value2, "goodsTypesId");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNull() {
            addCriterion("goods_title is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNotNull() {
            addCriterion("goods_title is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleEqualTo(String value) {
            addCriterion("goods_title =", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotEqualTo(String value) {
            addCriterion("goods_title <>", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThan(String value) {
            addCriterion("goods_title >", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_title >=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThan(String value) {
            addCriterion("goods_title <", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("goods_title <=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLike(String value) {
            addCriterion("goods_title like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotLike(String value) {
            addCriterion("goods_title not like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIn(List<String> values) {
            addCriterion("goods_title in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotIn(List<String> values) {
            addCriterion("goods_title not in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleBetween(String value1, String value2) {
            addCriterion("goods_title between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("goods_title not between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractIsNull() {
            addCriterion("goods_abstract is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractIsNotNull() {
            addCriterion("goods_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractEqualTo(String value) {
            addCriterion("goods_abstract =", value, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractNotEqualTo(String value) {
            addCriterion("goods_abstract <>", value, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractGreaterThan(String value) {
            addCriterion("goods_abstract >", value, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("goods_abstract >=", value, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractLessThan(String value) {
            addCriterion("goods_abstract <", value, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractLessThanOrEqualTo(String value) {
            addCriterion("goods_abstract <=", value, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractLike(String value) {
            addCriterion("goods_abstract like", value, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractNotLike(String value) {
            addCriterion("goods_abstract not like", value, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractIn(List<String> values) {
            addCriterion("goods_abstract in", values, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractNotIn(List<String> values) {
            addCriterion("goods_abstract not in", values, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractBetween(String value1, String value2) {
            addCriterion("goods_abstract between", value1, value2, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsAbstractNotBetween(String value1, String value2) {
            addCriterion("goods_abstract not between", value1, value2, "goodsAbstract");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsIsNull() {
            addCriterion("goods_keywords is null");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsIsNotNull() {
            addCriterion("goods_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsEqualTo(String value) {
            addCriterion("goods_keywords =", value, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsNotEqualTo(String value) {
            addCriterion("goods_keywords <>", value, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsGreaterThan(String value) {
            addCriterion("goods_keywords >", value, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_keywords >=", value, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsLessThan(String value) {
            addCriterion("goods_keywords <", value, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsLessThanOrEqualTo(String value) {
            addCriterion("goods_keywords <=", value, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsLike(String value) {
            addCriterion("goods_keywords like", value, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsNotLike(String value) {
            addCriterion("goods_keywords not like", value, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsIn(List<String> values) {
            addCriterion("goods_keywords in", values, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsNotIn(List<String> values) {
            addCriterion("goods_keywords not in", values, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsBetween(String value1, String value2) {
            addCriterion("goods_keywords between", value1, value2, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsKeywordsNotBetween(String value1, String value2) {
            addCriterion("goods_keywords not between", value1, value2, "goodsKeywords");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeIsNull() {
            addCriterion("goods_lang_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeIsNotNull() {
            addCriterion("goods_lang_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeEqualTo(String value) {
            addCriterion("goods_lang_code =", value, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeNotEqualTo(String value) {
            addCriterion("goods_lang_code <>", value, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeGreaterThan(String value) {
            addCriterion("goods_lang_code >", value, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_lang_code >=", value, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeLessThan(String value) {
            addCriterion("goods_lang_code <", value, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_lang_code <=", value, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeLike(String value) {
            addCriterion("goods_lang_code like", value, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeNotLike(String value) {
            addCriterion("goods_lang_code not like", value, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeIn(List<String> values) {
            addCriterion("goods_lang_code in", values, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeNotIn(List<String> values) {
            addCriterion("goods_lang_code not in", values, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeBetween(String value1, String value2) {
            addCriterion("goods_lang_code between", value1, value2, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLangCodeNotBetween(String value1, String value2) {
            addCriterion("goods_lang_code not between", value1, value2, "goodsLangCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeIsNull() {
            addCriterion("supplier_id_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeIsNotNull() {
            addCriterion("supplier_id_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeEqualTo(String value) {
            addCriterion("supplier_id_code =", value, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeNotEqualTo(String value) {
            addCriterion("supplier_id_code <>", value, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeGreaterThan(String value) {
            addCriterion("supplier_id_code >", value, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_id_code >=", value, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeLessThan(String value) {
            addCriterion("supplier_id_code <", value, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeLessThanOrEqualTo(String value) {
            addCriterion("supplier_id_code <=", value, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeLike(String value) {
            addCriterion("supplier_id_code like", value, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeNotLike(String value) {
            addCriterion("supplier_id_code not like", value, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeIn(List<String> values) {
            addCriterion("supplier_id_code in", values, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeNotIn(List<String> values) {
            addCriterion("supplier_id_code not in", values, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeBetween(String value1, String value2) {
            addCriterion("supplier_id_code between", value1, value2, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdCodeNotBetween(String value1, String value2) {
            addCriterion("supplier_id_code not between", value1, value2, "supplierIdCode");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIsNull() {
            addCriterion("goods_url is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIsNotNull() {
            addCriterion("goods_url is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlEqualTo(String value) {
            addCriterion("goods_url =", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotEqualTo(String value) {
            addCriterion("goods_url <>", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlGreaterThan(String value) {
            addCriterion("goods_url >", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("goods_url >=", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLessThan(String value) {
            addCriterion("goods_url <", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLessThanOrEqualTo(String value) {
            addCriterion("goods_url <=", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLike(String value) {
            addCriterion("goods_url like", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotLike(String value) {
            addCriterion("goods_url not like", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIn(List<String> values) {
            addCriterion("goods_url in", values, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotIn(List<String> values) {
            addCriterion("goods_url not in", values, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlBetween(String value1, String value2) {
            addCriterion("goods_url between", value1, value2, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotBetween(String value1, String value2) {
            addCriterion("goods_url not between", value1, value2, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonIsNull() {
            addCriterion("goods_view_json is null");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonIsNotNull() {
            addCriterion("goods_view_json is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonEqualTo(String value) {
            addCriterion("goods_view_json =", value, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonNotEqualTo(String value) {
            addCriterion("goods_view_json <>", value, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonGreaterThan(String value) {
            addCriterion("goods_view_json >", value, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonGreaterThanOrEqualTo(String value) {
            addCriterion("goods_view_json >=", value, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonLessThan(String value) {
            addCriterion("goods_view_json <", value, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonLessThanOrEqualTo(String value) {
            addCriterion("goods_view_json <=", value, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonLike(String value) {
            addCriterion("goods_view_json like", value, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonNotLike(String value) {
            addCriterion("goods_view_json not like", value, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonIn(List<String> values) {
            addCriterion("goods_view_json in", values, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonNotIn(List<String> values) {
            addCriterion("goods_view_json not in", values, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonBetween(String value1, String value2) {
            addCriterion("goods_view_json between", value1, value2, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsViewJsonNotBetween(String value1, String value2) {
            addCriterion("goods_view_json not between", value1, value2, "goodsViewJson");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(Integer value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(Integer value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(Integer value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(Integer value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<Integer> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<Integer> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Integer value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Integer value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Integer value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Integer value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Integer> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Integer> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(Integer value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Integer value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Integer value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Integer value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Integer> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Integer> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Integer value1, Integer value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIsNull() {
            addCriterion("goods_source is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIsNotNull() {
            addCriterion("goods_source is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceEqualTo(Integer value) {
            addCriterion("goods_source =", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceNotEqualTo(Integer value) {
            addCriterion("goods_source <>", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceGreaterThan(Integer value) {
            addCriterion("goods_source >", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_source >=", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceLessThan(Integer value) {
            addCriterion("goods_source <", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_source <=", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIn(List<Integer> values) {
            addCriterion("goods_source in", values, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceNotIn(List<Integer> values) {
            addCriterion("goods_source not in", values, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceBetween(Integer value1, Integer value2) {
            addCriterion("goods_source between", value1, value2, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_source not between", value1, value2, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeIsNull() {
            addCriterion("goods_purpose is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeIsNotNull() {
            addCriterion("goods_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeEqualTo(Integer value) {
            addCriterion("goods_purpose =", value, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeNotEqualTo(Integer value) {
            addCriterion("goods_purpose <>", value, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeGreaterThan(Integer value) {
            addCriterion("goods_purpose >", value, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_purpose >=", value, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeLessThan(Integer value) {
            addCriterion("goods_purpose <", value, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_purpose <=", value, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeIn(List<Integer> values) {
            addCriterion("goods_purpose in", values, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeNotIn(List<Integer> values) {
            addCriterion("goods_purpose not in", values, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeBetween(Integer value1, Integer value2) {
            addCriterion("goods_purpose between", value1, value2, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andGoodsPurposeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_purpose not between", value1, value2, "goodsPurpose");
            return (Criteria) this;
        }

        public Criteria andStockStateIsNull() {
            addCriterion("stock_state is null");
            return (Criteria) this;
        }

        public Criteria andStockStateIsNotNull() {
            addCriterion("stock_state is not null");
            return (Criteria) this;
        }

        public Criteria andStockStateEqualTo(Integer value) {
            addCriterion("stock_state =", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateNotEqualTo(Integer value) {
            addCriterion("stock_state <>", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateGreaterThan(Integer value) {
            addCriterion("stock_state >", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_state >=", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateLessThan(Integer value) {
            addCriterion("stock_state <", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateLessThanOrEqualTo(Integer value) {
            addCriterion("stock_state <=", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateIn(List<Integer> values) {
            addCriterion("stock_state in", values, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateNotIn(List<Integer> values) {
            addCriterion("stock_state not in", values, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateBetween(Integer value1, Integer value2) {
            addCriterion("stock_state between", value1, value2, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_state not between", value1, value2, "stockState");
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

        public Criteria andGoodsCloseIsNull() {
            addCriterion("goods_close is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseIsNotNull() {
            addCriterion("goods_close is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseEqualTo(Integer value) {
            addCriterion("goods_close =", value, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseNotEqualTo(Integer value) {
            addCriterion("goods_close <>", value, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseGreaterThan(Integer value) {
            addCriterion("goods_close >", value, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_close >=", value, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseLessThan(Integer value) {
            addCriterion("goods_close <", value, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseLessThanOrEqualTo(Integer value) {
            addCriterion("goods_close <=", value, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseIn(List<Integer> values) {
            addCriterion("goods_close in", values, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseNotIn(List<Integer> values) {
            addCriterion("goods_close not in", values, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseBetween(Integer value1, Integer value2) {
            addCriterion("goods_close between", value1, value2, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_close not between", value1, value2, "goodsClose");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldIsNull() {
            addCriterion("goods_sold is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldIsNotNull() {
            addCriterion("goods_sold is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldEqualTo(Integer value) {
            addCriterion("goods_sold =", value, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldNotEqualTo(Integer value) {
            addCriterion("goods_sold <>", value, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldGreaterThan(Integer value) {
            addCriterion("goods_sold >", value, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sold >=", value, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldLessThan(Integer value) {
            addCriterion("goods_sold <", value, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sold <=", value, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldIn(List<Integer> values) {
            addCriterion("goods_sold in", values, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldNotIn(List<Integer> values) {
            addCriterion("goods_sold not in", values, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldBetween(Integer value1, Integer value2) {
            addCriterion("goods_sold between", value1, value2, "goodsSold");
            return (Criteria) this;
        }

        public Criteria andGoodsSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sold not between", value1, value2, "goodsSold");
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