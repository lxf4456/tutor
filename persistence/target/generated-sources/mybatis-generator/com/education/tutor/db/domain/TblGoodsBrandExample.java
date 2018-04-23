package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblGoodsBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGoodsBrandExample() {
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

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandLevelIsNull() {
            addCriterion("brand_level is null");
            return (Criteria) this;
        }

        public Criteria andBrandLevelIsNotNull() {
            addCriterion("brand_level is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLevelEqualTo(Integer value) {
            addCriterion("brand_level =", value, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelNotEqualTo(Integer value) {
            addCriterion("brand_level <>", value, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelGreaterThan(Integer value) {
            addCriterion("brand_level >", value, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_level >=", value, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelLessThan(Integer value) {
            addCriterion("brand_level <", value, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelLessThanOrEqualTo(Integer value) {
            addCriterion("brand_level <=", value, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelIn(List<Integer> values) {
            addCriterion("brand_level in", values, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelNotIn(List<Integer> values) {
            addCriterion("brand_level not in", values, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelBetween(Integer value1, Integer value2) {
            addCriterion("brand_level between", value1, value2, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_level not between", value1, value2, "brandLevel");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIsNull() {
            addCriterion("brand_logo is null");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIsNotNull() {
            addCriterion("brand_logo is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLogoEqualTo(String value) {
            addCriterion("brand_logo =", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotEqualTo(String value) {
            addCriterion("brand_logo <>", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoGreaterThan(String value) {
            addCriterion("brand_logo >", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoGreaterThanOrEqualTo(String value) {
            addCriterion("brand_logo >=", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoLessThan(String value) {
            addCriterion("brand_logo <", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoLessThanOrEqualTo(String value) {
            addCriterion("brand_logo <=", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoLike(String value) {
            addCriterion("brand_logo like", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotLike(String value) {
            addCriterion("brand_logo not like", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIn(List<String> values) {
            addCriterion("brand_logo in", values, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotIn(List<String> values) {
            addCriterion("brand_logo not in", values, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoBetween(String value1, String value2) {
            addCriterion("brand_logo between", value1, value2, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotBetween(String value1, String value2) {
            addCriterion("brand_logo not between", value1, value2, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandUrlIsNull() {
            addCriterion("brand_url is null");
            return (Criteria) this;
        }

        public Criteria andBrandUrlIsNotNull() {
            addCriterion("brand_url is not null");
            return (Criteria) this;
        }

        public Criteria andBrandUrlEqualTo(String value) {
            addCriterion("brand_url =", value, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlNotEqualTo(String value) {
            addCriterion("brand_url <>", value, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlGreaterThan(String value) {
            addCriterion("brand_url >", value, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlGreaterThanOrEqualTo(String value) {
            addCriterion("brand_url >=", value, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlLessThan(String value) {
            addCriterion("brand_url <", value, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlLessThanOrEqualTo(String value) {
            addCriterion("brand_url <=", value, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlLike(String value) {
            addCriterion("brand_url like", value, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlNotLike(String value) {
            addCriterion("brand_url not like", value, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlIn(List<String> values) {
            addCriterion("brand_url in", values, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlNotIn(List<String> values) {
            addCriterion("brand_url not in", values, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlBetween(String value1, String value2) {
            addCriterion("brand_url between", value1, value2, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandUrlNotBetween(String value1, String value2) {
            addCriterion("brand_url not between", value1, value2, "brandUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNull() {
            addCriterion("brand_code is null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNotNull() {
            addCriterion("brand_code is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo(String value) {
            addCriterion("brand_code =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotEqualTo(String value) {
            addCriterion("brand_code <>", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThan(String value) {
            addCriterion("brand_code >", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThanOrEqualTo(String value) {
            addCriterion("brand_code >=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThan(String value) {
            addCriterion("brand_code <", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThanOrEqualTo(String value) {
            addCriterion("brand_code <=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLike(String value) {
            addCriterion("brand_code like", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotLike(String value) {
            addCriterion("brand_code not like", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIn(List<String> values) {
            addCriterion("brand_code in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotIn(List<String> values) {
            addCriterion("brand_code not in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeBetween(String value1, String value2) {
            addCriterion("brand_code between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotBetween(String value1, String value2) {
            addCriterion("brand_code not between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeIsNull() {
            addCriterion("brand_lang_code is null");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeIsNotNull() {
            addCriterion("brand_lang_code is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeEqualTo(String value) {
            addCriterion("brand_lang_code =", value, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeNotEqualTo(String value) {
            addCriterion("brand_lang_code <>", value, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeGreaterThan(String value) {
            addCriterion("brand_lang_code >", value, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeGreaterThanOrEqualTo(String value) {
            addCriterion("brand_lang_code >=", value, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeLessThan(String value) {
            addCriterion("brand_lang_code <", value, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeLessThanOrEqualTo(String value) {
            addCriterion("brand_lang_code <=", value, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeLike(String value) {
            addCriterion("brand_lang_code like", value, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeNotLike(String value) {
            addCriterion("brand_lang_code not like", value, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeIn(List<String> values) {
            addCriterion("brand_lang_code in", values, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeNotIn(List<String> values) {
            addCriterion("brand_lang_code not in", values, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeBetween(String value1, String value2) {
            addCriterion("brand_lang_code between", value1, value2, "brandLangCode");
            return (Criteria) this;
        }

        public Criteria andBrandLangCodeNotBetween(String value1, String value2) {
            addCriterion("brand_lang_code not between", value1, value2, "brandLangCode");
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

        public Criteria andIsHaveIsNull() {
            addCriterion("is_have is null");
            return (Criteria) this;
        }

        public Criteria andIsHaveIsNotNull() {
            addCriterion("is_have is not null");
            return (Criteria) this;
        }

        public Criteria andIsHaveEqualTo(Integer value) {
            addCriterion("is_have =", value, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveNotEqualTo(Integer value) {
            addCriterion("is_have <>", value, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveGreaterThan(Integer value) {
            addCriterion("is_have >", value, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_have >=", value, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveLessThan(Integer value) {
            addCriterion("is_have <", value, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveLessThanOrEqualTo(Integer value) {
            addCriterion("is_have <=", value, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveIn(List<Integer> values) {
            addCriterion("is_have in", values, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveNotIn(List<Integer> values) {
            addCriterion("is_have not in", values, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveBetween(Integer value1, Integer value2) {
            addCriterion("is_have between", value1, value2, "isHave");
            return (Criteria) this;
        }

        public Criteria andIsHaveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_have not between", value1, value2, "isHave");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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