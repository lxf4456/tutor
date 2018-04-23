package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblGoodsTypesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGoodsTypesExample() {
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

        public Criteria andTypesNameIsNull() {
            addCriterion("types_name is null");
            return (Criteria) this;
        }

        public Criteria andTypesNameIsNotNull() {
            addCriterion("types_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypesNameEqualTo(String value) {
            addCriterion("types_name =", value, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameNotEqualTo(String value) {
            addCriterion("types_name <>", value, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameGreaterThan(String value) {
            addCriterion("types_name >", value, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameGreaterThanOrEqualTo(String value) {
            addCriterion("types_name >=", value, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameLessThan(String value) {
            addCriterion("types_name <", value, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameLessThanOrEqualTo(String value) {
            addCriterion("types_name <=", value, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameLike(String value) {
            addCriterion("types_name like", value, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameNotLike(String value) {
            addCriterion("types_name not like", value, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameIn(List<String> values) {
            addCriterion("types_name in", values, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameNotIn(List<String> values) {
            addCriterion("types_name not in", values, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameBetween(String value1, String value2) {
            addCriterion("types_name between", value1, value2, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesNameNotBetween(String value1, String value2) {
            addCriterion("types_name not between", value1, value2, "typesName");
            return (Criteria) this;
        }

        public Criteria andTypesCodeIsNull() {
            addCriterion("types_code is null");
            return (Criteria) this;
        }

        public Criteria andTypesCodeIsNotNull() {
            addCriterion("types_code is not null");
            return (Criteria) this;
        }

        public Criteria andTypesCodeEqualTo(String value) {
            addCriterion("types_code =", value, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeNotEqualTo(String value) {
            addCriterion("types_code <>", value, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeGreaterThan(String value) {
            addCriterion("types_code >", value, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("types_code >=", value, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeLessThan(String value) {
            addCriterion("types_code <", value, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeLessThanOrEqualTo(String value) {
            addCriterion("types_code <=", value, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeLike(String value) {
            addCriterion("types_code like", value, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeNotLike(String value) {
            addCriterion("types_code not like", value, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeIn(List<String> values) {
            addCriterion("types_code in", values, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeNotIn(List<String> values) {
            addCriterion("types_code not in", values, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeBetween(String value1, String value2) {
            addCriterion("types_code between", value1, value2, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesCodeNotBetween(String value1, String value2) {
            addCriterion("types_code not between", value1, value2, "typesCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeIsNull() {
            addCriterion("types_lang_code is null");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeIsNotNull() {
            addCriterion("types_lang_code is not null");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeEqualTo(String value) {
            addCriterion("types_lang_code =", value, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeNotEqualTo(String value) {
            addCriterion("types_lang_code <>", value, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeGreaterThan(String value) {
            addCriterion("types_lang_code >", value, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeGreaterThanOrEqualTo(String value) {
            addCriterion("types_lang_code >=", value, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeLessThan(String value) {
            addCriterion("types_lang_code <", value, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeLessThanOrEqualTo(String value) {
            addCriterion("types_lang_code <=", value, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeLike(String value) {
            addCriterion("types_lang_code like", value, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeNotLike(String value) {
            addCriterion("types_lang_code not like", value, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeIn(List<String> values) {
            addCriterion("types_lang_code in", values, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeNotIn(List<String> values) {
            addCriterion("types_lang_code not in", values, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeBetween(String value1, String value2) {
            addCriterion("types_lang_code between", value1, value2, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesLangCodeNotBetween(String value1, String value2) {
            addCriterion("types_lang_code not between", value1, value2, "typesLangCode");
            return (Criteria) this;
        }

        public Criteria andTypesStatusIsNull() {
            addCriterion("types_status is null");
            return (Criteria) this;
        }

        public Criteria andTypesStatusIsNotNull() {
            addCriterion("types_status is not null");
            return (Criteria) this;
        }

        public Criteria andTypesStatusEqualTo(Integer value) {
            addCriterion("types_status =", value, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusNotEqualTo(Integer value) {
            addCriterion("types_status <>", value, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusGreaterThan(Integer value) {
            addCriterion("types_status >", value, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("types_status >=", value, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusLessThan(Integer value) {
            addCriterion("types_status <", value, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusLessThanOrEqualTo(Integer value) {
            addCriterion("types_status <=", value, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusIn(List<Integer> values) {
            addCriterion("types_status in", values, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusNotIn(List<Integer> values) {
            addCriterion("types_status not in", values, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusBetween(Integer value1, Integer value2) {
            addCriterion("types_status between", value1, value2, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("types_status not between", value1, value2, "typesStatus");
            return (Criteria) this;
        }

        public Criteria andTypesContentIsNull() {
            addCriterion("types_content is null");
            return (Criteria) this;
        }

        public Criteria andTypesContentIsNotNull() {
            addCriterion("types_content is not null");
            return (Criteria) this;
        }

        public Criteria andTypesContentEqualTo(String value) {
            addCriterion("types_content =", value, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentNotEqualTo(String value) {
            addCriterion("types_content <>", value, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentGreaterThan(String value) {
            addCriterion("types_content >", value, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentGreaterThanOrEqualTo(String value) {
            addCriterion("types_content >=", value, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentLessThan(String value) {
            addCriterion("types_content <", value, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentLessThanOrEqualTo(String value) {
            addCriterion("types_content <=", value, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentLike(String value) {
            addCriterion("types_content like", value, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentNotLike(String value) {
            addCriterion("types_content not like", value, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentIn(List<String> values) {
            addCriterion("types_content in", values, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentNotIn(List<String> values) {
            addCriterion("types_content not in", values, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentBetween(String value1, String value2) {
            addCriterion("types_content between", value1, value2, "typesContent");
            return (Criteria) this;
        }

        public Criteria andTypesContentNotBetween(String value1, String value2) {
            addCriterion("types_content not between", value1, value2, "typesContent");
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