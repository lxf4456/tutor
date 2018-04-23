package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTopicExample() {
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Long value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Long value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Long value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Long value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Long> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Long> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Long value1, Long value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
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

        public Criteria andTopicTitleIsNull() {
            addCriterion("topic_title is null");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIsNotNull() {
            addCriterion("topic_title is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTitleEqualTo(String value) {
            addCriterion("topic_title =", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotEqualTo(String value) {
            addCriterion("topic_title <>", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleGreaterThan(String value) {
            addCriterion("topic_title >", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("topic_title >=", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLessThan(String value) {
            addCriterion("topic_title <", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLessThanOrEqualTo(String value) {
            addCriterion("topic_title <=", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLike(String value) {
            addCriterion("topic_title like", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotLike(String value) {
            addCriterion("topic_title not like", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIn(List<String> values) {
            addCriterion("topic_title in", values, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotIn(List<String> values) {
            addCriterion("topic_title not in", values, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleBetween(String value1, String value2) {
            addCriterion("topic_title between", value1, value2, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotBetween(String value1, String value2) {
            addCriterion("topic_title not between", value1, value2, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractIsNull() {
            addCriterion("topic_abstract is null");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractIsNotNull() {
            addCriterion("topic_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractEqualTo(String value) {
            addCriterion("topic_abstract =", value, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractNotEqualTo(String value) {
            addCriterion("topic_abstract <>", value, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractGreaterThan(String value) {
            addCriterion("topic_abstract >", value, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("topic_abstract >=", value, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractLessThan(String value) {
            addCriterion("topic_abstract <", value, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractLessThanOrEqualTo(String value) {
            addCriterion("topic_abstract <=", value, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractLike(String value) {
            addCriterion("topic_abstract like", value, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractNotLike(String value) {
            addCriterion("topic_abstract not like", value, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractIn(List<String> values) {
            addCriterion("topic_abstract in", values, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractNotIn(List<String> values) {
            addCriterion("topic_abstract not in", values, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractBetween(String value1, String value2) {
            addCriterion("topic_abstract between", value1, value2, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicAbstractNotBetween(String value1, String value2) {
            addCriterion("topic_abstract not between", value1, value2, "topicAbstract");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsIsNull() {
            addCriterion("topic_keywords is null");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsIsNotNull() {
            addCriterion("topic_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsEqualTo(String value) {
            addCriterion("topic_keywords =", value, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsNotEqualTo(String value) {
            addCriterion("topic_keywords <>", value, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsGreaterThan(String value) {
            addCriterion("topic_keywords >", value, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("topic_keywords >=", value, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsLessThan(String value) {
            addCriterion("topic_keywords <", value, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsLessThanOrEqualTo(String value) {
            addCriterion("topic_keywords <=", value, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsLike(String value) {
            addCriterion("topic_keywords like", value, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsNotLike(String value) {
            addCriterion("topic_keywords not like", value, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsIn(List<String> values) {
            addCriterion("topic_keywords in", values, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsNotIn(List<String> values) {
            addCriterion("topic_keywords not in", values, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsBetween(String value1, String value2) {
            addCriterion("topic_keywords between", value1, value2, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicKeywordsNotBetween(String value1, String value2) {
            addCriterion("topic_keywords not between", value1, value2, "topicKeywords");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIsNull() {
            addCriterion("topic_type is null");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIsNotNull() {
            addCriterion("topic_type is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTypeEqualTo(Integer value) {
            addCriterion("topic_type =", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeNotEqualTo(Integer value) {
            addCriterion("topic_type <>", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeGreaterThan(Integer value) {
            addCriterion("topic_type >", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_type >=", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeLessThan(Integer value) {
            addCriterion("topic_type <", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeLessThanOrEqualTo(Integer value) {
            addCriterion("topic_type <=", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIn(List<Integer> values) {
            addCriterion("topic_type in", values, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeNotIn(List<Integer> values) {
            addCriterion("topic_type not in", values, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeBetween(Integer value1, Integer value2) {
            addCriterion("topic_type between", value1, value2, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_type not between", value1, value2, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicCommentIsNull() {
            addCriterion("topic_comment is null");
            return (Criteria) this;
        }

        public Criteria andTopicCommentIsNotNull() {
            addCriterion("topic_comment is not null");
            return (Criteria) this;
        }

        public Criteria andTopicCommentEqualTo(Long value) {
            addCriterion("topic_comment =", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentNotEqualTo(Long value) {
            addCriterion("topic_comment <>", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentGreaterThan(Long value) {
            addCriterion("topic_comment >", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_comment >=", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentLessThan(Long value) {
            addCriterion("topic_comment <", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentLessThanOrEqualTo(Long value) {
            addCriterion("topic_comment <=", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentIn(List<Long> values) {
            addCriterion("topic_comment in", values, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentNotIn(List<Long> values) {
            addCriterion("topic_comment not in", values, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentBetween(Long value1, Long value2) {
            addCriterion("topic_comment between", value1, value2, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentNotBetween(Long value1, Long value2) {
            addCriterion("topic_comment not between", value1, value2, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidIsNull() {
            addCriterion("topic_mogoid is null");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidIsNotNull() {
            addCriterion("topic_mogoid is not null");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidEqualTo(Long value) {
            addCriterion("topic_mogoid =", value, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidNotEqualTo(Long value) {
            addCriterion("topic_mogoid <>", value, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidGreaterThan(Long value) {
            addCriterion("topic_mogoid >", value, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_mogoid >=", value, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidLessThan(Long value) {
            addCriterion("topic_mogoid <", value, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidLessThanOrEqualTo(Long value) {
            addCriterion("topic_mogoid <=", value, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidIn(List<Long> values) {
            addCriterion("topic_mogoid in", values, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidNotIn(List<Long> values) {
            addCriterion("topic_mogoid not in", values, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidBetween(Long value1, Long value2) {
            addCriterion("topic_mogoid between", value1, value2, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicMogoidNotBetween(Long value1, Long value2) {
            addCriterion("topic_mogoid not between", value1, value2, "topicMogoid");
            return (Criteria) this;
        }

        public Criteria andTopicUrlIsNull() {
            addCriterion("topic_url is null");
            return (Criteria) this;
        }

        public Criteria andTopicUrlIsNotNull() {
            addCriterion("topic_url is not null");
            return (Criteria) this;
        }

        public Criteria andTopicUrlEqualTo(String value) {
            addCriterion("topic_url =", value, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlNotEqualTo(String value) {
            addCriterion("topic_url <>", value, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlGreaterThan(String value) {
            addCriterion("topic_url >", value, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("topic_url >=", value, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlLessThan(String value) {
            addCriterion("topic_url <", value, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlLessThanOrEqualTo(String value) {
            addCriterion("topic_url <=", value, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlLike(String value) {
            addCriterion("topic_url like", value, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlNotLike(String value) {
            addCriterion("topic_url not like", value, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlIn(List<String> values) {
            addCriterion("topic_url in", values, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlNotIn(List<String> values) {
            addCriterion("topic_url not in", values, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlBetween(String value1, String value2) {
            addCriterion("topic_url between", value1, value2, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicUrlNotBetween(String value1, String value2) {
            addCriterion("topic_url not between", value1, value2, "topicUrl");
            return (Criteria) this;
        }

        public Criteria andTopicStateIsNull() {
            addCriterion("topic_state is null");
            return (Criteria) this;
        }

        public Criteria andTopicStateIsNotNull() {
            addCriterion("topic_state is not null");
            return (Criteria) this;
        }

        public Criteria andTopicStateEqualTo(Integer value) {
            addCriterion("topic_state =", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateNotEqualTo(Integer value) {
            addCriterion("topic_state <>", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateGreaterThan(Integer value) {
            addCriterion("topic_state >", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_state >=", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateLessThan(Integer value) {
            addCriterion("topic_state <", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateLessThanOrEqualTo(Integer value) {
            addCriterion("topic_state <=", value, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateIn(List<Integer> values) {
            addCriterion("topic_state in", values, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateNotIn(List<Integer> values) {
            addCriterion("topic_state not in", values, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateBetween(Integer value1, Integer value2) {
            addCriterion("topic_state between", value1, value2, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicStateNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_state not between", value1, value2, "topicState");
            return (Criteria) this;
        }

        public Criteria andTopicSourceIsNull() {
            addCriterion("topic_source is null");
            return (Criteria) this;
        }

        public Criteria andTopicSourceIsNotNull() {
            addCriterion("topic_source is not null");
            return (Criteria) this;
        }

        public Criteria andTopicSourceEqualTo(Integer value) {
            addCriterion("topic_source =", value, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceNotEqualTo(Integer value) {
            addCriterion("topic_source <>", value, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceGreaterThan(Integer value) {
            addCriterion("topic_source >", value, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_source >=", value, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceLessThan(Integer value) {
            addCriterion("topic_source <", value, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceLessThanOrEqualTo(Integer value) {
            addCriterion("topic_source <=", value, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceIn(List<Integer> values) {
            addCriterion("topic_source in", values, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceNotIn(List<Integer> values) {
            addCriterion("topic_source not in", values, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceBetween(Integer value1, Integer value2) {
            addCriterion("topic_source between", value1, value2, "topicSource");
            return (Criteria) this;
        }

        public Criteria andTopicSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_source not between", value1, value2, "topicSource");
            return (Criteria) this;
        }

        public Criteria andDefaultLangIsNull() {
            addCriterion("default_lang is null");
            return (Criteria) this;
        }

        public Criteria andDefaultLangIsNotNull() {
            addCriterion("default_lang is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultLangEqualTo(String value) {
            addCriterion("default_lang =", value, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangNotEqualTo(String value) {
            addCriterion("default_lang <>", value, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangGreaterThan(String value) {
            addCriterion("default_lang >", value, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangGreaterThanOrEqualTo(String value) {
            addCriterion("default_lang >=", value, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangLessThan(String value) {
            addCriterion("default_lang <", value, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangLessThanOrEqualTo(String value) {
            addCriterion("default_lang <=", value, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangLike(String value) {
            addCriterion("default_lang like", value, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangNotLike(String value) {
            addCriterion("default_lang not like", value, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangIn(List<String> values) {
            addCriterion("default_lang in", values, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangNotIn(List<String> values) {
            addCriterion("default_lang not in", values, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangBetween(String value1, String value2) {
            addCriterion("default_lang between", value1, value2, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andDefaultLangNotBetween(String value1, String value2) {
            addCriterion("default_lang not between", value1, value2, "defaultLang");
            return (Criteria) this;
        }

        public Criteria andParentTopicIsNull() {
            addCriterion("parent_topic is null");
            return (Criteria) this;
        }

        public Criteria andParentTopicIsNotNull() {
            addCriterion("parent_topic is not null");
            return (Criteria) this;
        }

        public Criteria andParentTopicEqualTo(Long value) {
            addCriterion("parent_topic =", value, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicNotEqualTo(Long value) {
            addCriterion("parent_topic <>", value, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicGreaterThan(Long value) {
            addCriterion("parent_topic >", value, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_topic >=", value, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicLessThan(Long value) {
            addCriterion("parent_topic <", value, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicLessThanOrEqualTo(Long value) {
            addCriterion("parent_topic <=", value, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicIn(List<Long> values) {
            addCriterion("parent_topic in", values, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicNotIn(List<Long> values) {
            addCriterion("parent_topic not in", values, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicBetween(Long value1, Long value2) {
            addCriterion("parent_topic between", value1, value2, "parentTopic");
            return (Criteria) this;
        }

        public Criteria andParentTopicNotBetween(Long value1, Long value2) {
            addCriterion("parent_topic not between", value1, value2, "parentTopic");
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

        public Criteria andTopicUpvoteIsNull() {
            addCriterion("topic_upvote is null");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteIsNotNull() {
            addCriterion("topic_upvote is not null");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteEqualTo(Long value) {
            addCriterion("topic_upvote =", value, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteNotEqualTo(Long value) {
            addCriterion("topic_upvote <>", value, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteGreaterThan(Long value) {
            addCriterion("topic_upvote >", value, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_upvote >=", value, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteLessThan(Long value) {
            addCriterion("topic_upvote <", value, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteLessThanOrEqualTo(Long value) {
            addCriterion("topic_upvote <=", value, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteIn(List<Long> values) {
            addCriterion("topic_upvote in", values, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteNotIn(List<Long> values) {
            addCriterion("topic_upvote not in", values, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteBetween(Long value1, Long value2) {
            addCriterion("topic_upvote between", value1, value2, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicUpvoteNotBetween(Long value1, Long value2) {
            addCriterion("topic_upvote not between", value1, value2, "topicUpvote");
            return (Criteria) this;
        }

        public Criteria andTopicTreadIsNull() {
            addCriterion("topic_tread is null");
            return (Criteria) this;
        }

        public Criteria andTopicTreadIsNotNull() {
            addCriterion("topic_tread is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTreadEqualTo(Long value) {
            addCriterion("topic_tread =", value, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadNotEqualTo(Long value) {
            addCriterion("topic_tread <>", value, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadGreaterThan(Long value) {
            addCriterion("topic_tread >", value, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_tread >=", value, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadLessThan(Long value) {
            addCriterion("topic_tread <", value, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadLessThanOrEqualTo(Long value) {
            addCriterion("topic_tread <=", value, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadIn(List<Long> values) {
            addCriterion("topic_tread in", values, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadNotIn(List<Long> values) {
            addCriterion("topic_tread not in", values, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadBetween(Long value1, Long value2) {
            addCriterion("topic_tread between", value1, value2, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicTreadNotBetween(Long value1, Long value2) {
            addCriterion("topic_tread not between", value1, value2, "topicTread");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumIsNull() {
            addCriterion("topic_reward_num is null");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumIsNotNull() {
            addCriterion("topic_reward_num is not null");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumEqualTo(Long value) {
            addCriterion("topic_reward_num =", value, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumNotEqualTo(Long value) {
            addCriterion("topic_reward_num <>", value, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumGreaterThan(Long value) {
            addCriterion("topic_reward_num >", value, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_reward_num >=", value, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumLessThan(Long value) {
            addCriterion("topic_reward_num <", value, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumLessThanOrEqualTo(Long value) {
            addCriterion("topic_reward_num <=", value, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumIn(List<Long> values) {
            addCriterion("topic_reward_num in", values, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumNotIn(List<Long> values) {
            addCriterion("topic_reward_num not in", values, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumBetween(Long value1, Long value2) {
            addCriterion("topic_reward_num between", value1, value2, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNumNotBetween(Long value1, Long value2) {
            addCriterion("topic_reward_num not between", value1, value2, "topicRewardNum");
            return (Criteria) this;
        }

        public Criteria andTopicCollectIsNull() {
            addCriterion("topic_collect is null");
            return (Criteria) this;
        }

        public Criteria andTopicCollectIsNotNull() {
            addCriterion("topic_collect is not null");
            return (Criteria) this;
        }

        public Criteria andTopicCollectEqualTo(Long value) {
            addCriterion("topic_collect =", value, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectNotEqualTo(Long value) {
            addCriterion("topic_collect <>", value, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectGreaterThan(Long value) {
            addCriterion("topic_collect >", value, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_collect >=", value, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectLessThan(Long value) {
            addCriterion("topic_collect <", value, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectLessThanOrEqualTo(Long value) {
            addCriterion("topic_collect <=", value, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectIn(List<Long> values) {
            addCriterion("topic_collect in", values, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectNotIn(List<Long> values) {
            addCriterion("topic_collect not in", values, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectBetween(Long value1, Long value2) {
            addCriterion("topic_collect between", value1, value2, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicCollectNotBetween(Long value1, Long value2) {
            addCriterion("topic_collect not between", value1, value2, "topicCollect");
            return (Criteria) this;
        }

        public Criteria andTopicRewardIsNull() {
            addCriterion("topic_reward is null");
            return (Criteria) this;
        }

        public Criteria andTopicRewardIsNotNull() {
            addCriterion("topic_reward is not null");
            return (Criteria) this;
        }

        public Criteria andTopicRewardEqualTo(Long value) {
            addCriterion("topic_reward =", value, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNotEqualTo(Long value) {
            addCriterion("topic_reward <>", value, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardGreaterThan(Long value) {
            addCriterion("topic_reward >", value, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_reward >=", value, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardLessThan(Long value) {
            addCriterion("topic_reward <", value, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardLessThanOrEqualTo(Long value) {
            addCriterion("topic_reward <=", value, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardIn(List<Long> values) {
            addCriterion("topic_reward in", values, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNotIn(List<Long> values) {
            addCriterion("topic_reward not in", values, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardBetween(Long value1, Long value2) {
            addCriterion("topic_reward between", value1, value2, "topicReward");
            return (Criteria) this;
        }

        public Criteria andTopicRewardNotBetween(Long value1, Long value2) {
            addCriterion("topic_reward not between", value1, value2, "topicReward");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkIsNull() {
            addCriterion("social_group_pk is null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkIsNotNull() {
            addCriterion("social_group_pk is not null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkEqualTo(Long value) {
            addCriterion("social_group_pk =", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkNotEqualTo(Long value) {
            addCriterion("social_group_pk <>", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkGreaterThan(Long value) {
            addCriterion("social_group_pk >", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkGreaterThanOrEqualTo(Long value) {
            addCriterion("social_group_pk >=", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkLessThan(Long value) {
            addCriterion("social_group_pk <", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkLessThanOrEqualTo(Long value) {
            addCriterion("social_group_pk <=", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkIn(List<Long> values) {
            addCriterion("social_group_pk in", values, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkNotIn(List<Long> values) {
            addCriterion("social_group_pk not in", values, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkBetween(Long value1, Long value2) {
            addCriterion("social_group_pk between", value1, value2, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkNotBetween(Long value1, Long value2) {
            addCriterion("social_group_pk not between", value1, value2, "socialGroupPk");
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

        public Criteria andIsStickIsNull() {
            addCriterion("is_stick is null");
            return (Criteria) this;
        }

        public Criteria andIsStickIsNotNull() {
            addCriterion("is_stick is not null");
            return (Criteria) this;
        }

        public Criteria andIsStickEqualTo(Integer value) {
            addCriterion("is_stick =", value, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickNotEqualTo(Integer value) {
            addCriterion("is_stick <>", value, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickGreaterThan(Integer value) {
            addCriterion("is_stick >", value, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_stick >=", value, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickLessThan(Integer value) {
            addCriterion("is_stick <", value, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickLessThanOrEqualTo(Integer value) {
            addCriterion("is_stick <=", value, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickIn(List<Integer> values) {
            addCriterion("is_stick in", values, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickNotIn(List<Integer> values) {
            addCriterion("is_stick not in", values, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickBetween(Integer value1, Integer value2) {
            addCriterion("is_stick between", value1, value2, "isStick");
            return (Criteria) this;
        }

        public Criteria andIsStickNotBetween(Integer value1, Integer value2) {
            addCriterion("is_stick not between", value1, value2, "isStick");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIsNull() {
            addCriterion("is_private is null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIsNotNull() {
            addCriterion("is_private is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateEqualTo(Integer value) {
            addCriterion("is_private =", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotEqualTo(Integer value) {
            addCriterion("is_private <>", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateGreaterThan(Integer value) {
            addCriterion("is_private >", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_private >=", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLessThan(Integer value) {
            addCriterion("is_private <", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLessThanOrEqualTo(Integer value) {
            addCriterion("is_private <=", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIn(List<Integer> values) {
            addCriterion("is_private in", values, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotIn(List<Integer> values) {
            addCriterion("is_private not in", values, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateBetween(Integer value1, Integer value2) {
            addCriterion("is_private between", value1, value2, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_private not between", value1, value2, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdIsNull() {
            addCriterion("spider_organization_id is null");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdIsNotNull() {
            addCriterion("spider_organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdEqualTo(Long value) {
            addCriterion("spider_organization_id =", value, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdNotEqualTo(Long value) {
            addCriterion("spider_organization_id <>", value, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdGreaterThan(Long value) {
            addCriterion("spider_organization_id >", value, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("spider_organization_id >=", value, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdLessThan(Long value) {
            addCriterion("spider_organization_id <", value, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdLessThanOrEqualTo(Long value) {
            addCriterion("spider_organization_id <=", value, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdIn(List<Long> values) {
            addCriterion("spider_organization_id in", values, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdNotIn(List<Long> values) {
            addCriterion("spider_organization_id not in", values, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdBetween(Long value1, Long value2) {
            addCriterion("spider_organization_id between", value1, value2, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderOrganizationIdNotBetween(Long value1, Long value2) {
            addCriterion("spider_organization_id not between", value1, value2, "spiderOrganizationId");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlIsNull() {
            addCriterion("spider_url is null");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlIsNotNull() {
            addCriterion("spider_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlEqualTo(String value) {
            addCriterion("spider_url =", value, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlNotEqualTo(String value) {
            addCriterion("spider_url <>", value, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlGreaterThan(String value) {
            addCriterion("spider_url >", value, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlGreaterThanOrEqualTo(String value) {
            addCriterion("spider_url >=", value, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlLessThan(String value) {
            addCriterion("spider_url <", value, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlLessThanOrEqualTo(String value) {
            addCriterion("spider_url <=", value, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlLike(String value) {
            addCriterion("spider_url like", value, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlNotLike(String value) {
            addCriterion("spider_url not like", value, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlIn(List<String> values) {
            addCriterion("spider_url in", values, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlNotIn(List<String> values) {
            addCriterion("spider_url not in", values, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlBetween(String value1, String value2) {
            addCriterion("spider_url between", value1, value2, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andSpiderUrlNotBetween(String value1, String value2) {
            addCriterion("spider_url not between", value1, value2, "spiderUrl");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andHostPlaceIsNull() {
            addCriterion("host_place is null");
            return (Criteria) this;
        }

        public Criteria andHostPlaceIsNotNull() {
            addCriterion("host_place is not null");
            return (Criteria) this;
        }

        public Criteria andHostPlaceEqualTo(String value) {
            addCriterion("host_place =", value, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceNotEqualTo(String value) {
            addCriterion("host_place <>", value, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceGreaterThan(String value) {
            addCriterion("host_place >", value, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("host_place >=", value, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceLessThan(String value) {
            addCriterion("host_place <", value, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceLessThanOrEqualTo(String value) {
            addCriterion("host_place <=", value, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceLike(String value) {
            addCriterion("host_place like", value, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceNotLike(String value) {
            addCriterion("host_place not like", value, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceIn(List<String> values) {
            addCriterion("host_place in", values, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceNotIn(List<String> values) {
            addCriterion("host_place not in", values, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceBetween(String value1, String value2) {
            addCriterion("host_place between", value1, value2, "hostPlace");
            return (Criteria) this;
        }

        public Criteria andHostPlaceNotBetween(String value1, String value2) {
            addCriterion("host_place not between", value1, value2, "hostPlace");
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