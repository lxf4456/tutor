package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTopicSeoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTopicSeoExample() {
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

        public Criteria andSeoIdIsNull() {
            addCriterion("seo_id is null");
            return (Criteria) this;
        }

        public Criteria andSeoIdIsNotNull() {
            addCriterion("seo_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeoIdEqualTo(Long value) {
            addCriterion("seo_id =", value, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdNotEqualTo(Long value) {
            addCriterion("seo_id <>", value, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdGreaterThan(Long value) {
            addCriterion("seo_id >", value, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seo_id >=", value, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdLessThan(Long value) {
            addCriterion("seo_id <", value, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdLessThanOrEqualTo(Long value) {
            addCriterion("seo_id <=", value, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdIn(List<Long> values) {
            addCriterion("seo_id in", values, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdNotIn(List<Long> values) {
            addCriterion("seo_id not in", values, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdBetween(Long value1, Long value2) {
            addCriterion("seo_id between", value1, value2, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoIdNotBetween(Long value1, Long value2) {
            addCriterion("seo_id not between", value1, value2, "seoId");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNull() {
            addCriterion("seo_title is null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNotNull() {
            addCriterion("seo_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleEqualTo(String value) {
            addCriterion("seo_title =", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotEqualTo(String value) {
            addCriterion("seo_title <>", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThan(String value) {
            addCriterion("seo_title >", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("seo_title >=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThan(String value) {
            addCriterion("seo_title <", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThanOrEqualTo(String value) {
            addCriterion("seo_title <=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLike(String value) {
            addCriterion("seo_title like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotLike(String value) {
            addCriterion("seo_title not like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIn(List<String> values) {
            addCriterion("seo_title in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotIn(List<String> values) {
            addCriterion("seo_title not in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleBetween(String value1, String value2) {
            addCriterion("seo_title between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotBetween(String value1, String value2) {
            addCriterion("seo_title not between", value1, value2, "seoTitle");
            return (Criteria) this;
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

        public Criteria andSeoKeywordsIsNull() {
            addCriterion("seo_keywords is null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNotNull() {
            addCriterion("seo_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsEqualTo(String value) {
            addCriterion("seo_keywords =", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotEqualTo(String value) {
            addCriterion("seo_keywords <>", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThan(String value) {
            addCriterion("seo_keywords >", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("seo_keywords >=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThan(String value) {
            addCriterion("seo_keywords <", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThanOrEqualTo(String value) {
            addCriterion("seo_keywords <=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLike(String value) {
            addCriterion("seo_keywords like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotLike(String value) {
            addCriterion("seo_keywords not like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIn(List<String> values) {
            addCriterion("seo_keywords in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotIn(List<String> values) {
            addCriterion("seo_keywords not in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsBetween(String value1, String value2) {
            addCriterion("seo_keywords between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotBetween(String value1, String value2) {
            addCriterion("seo_keywords not between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNull() {
            addCriterion("seo_description is null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNotNull() {
            addCriterion("seo_description is not null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionEqualTo(String value) {
            addCriterion("seo_description =", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotEqualTo(String value) {
            addCriterion("seo_description <>", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThan(String value) {
            addCriterion("seo_description >", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seo_description >=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThan(String value) {
            addCriterion("seo_description <", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("seo_description <=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLike(String value) {
            addCriterion("seo_description like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotLike(String value) {
            addCriterion("seo_description not like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIn(List<String> values) {
            addCriterion("seo_description in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotIn(List<String> values) {
            addCriterion("seo_description not in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionBetween(String value1, String value2) {
            addCriterion("seo_description between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotBetween(String value1, String value2) {
            addCriterion("seo_description not between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidIsNull() {
            addCriterion("seo_labelid is null");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidIsNotNull() {
            addCriterion("seo_labelid is not null");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidEqualTo(Long value) {
            addCriterion("seo_labelid =", value, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidNotEqualTo(Long value) {
            addCriterion("seo_labelid <>", value, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidGreaterThan(Long value) {
            addCriterion("seo_labelid >", value, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidGreaterThanOrEqualTo(Long value) {
            addCriterion("seo_labelid >=", value, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidLessThan(Long value) {
            addCriterion("seo_labelid <", value, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidLessThanOrEqualTo(Long value) {
            addCriterion("seo_labelid <=", value, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidIn(List<Long> values) {
            addCriterion("seo_labelid in", values, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidNotIn(List<Long> values) {
            addCriterion("seo_labelid not in", values, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidBetween(Long value1, Long value2) {
            addCriterion("seo_labelid between", value1, value2, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoLabelidNotBetween(Long value1, Long value2) {
            addCriterion("seo_labelid not between", value1, value2, "seoLabelid");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatIsNull() {
            addCriterion("seo_createat is null");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatIsNotNull() {
            addCriterion("seo_createat is not null");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatEqualTo(Date value) {
            addCriterion("seo_createat =", value, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatNotEqualTo(Date value) {
            addCriterion("seo_createat <>", value, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatGreaterThan(Date value) {
            addCriterion("seo_createat >", value, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("seo_createat >=", value, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatLessThan(Date value) {
            addCriterion("seo_createat <", value, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatLessThanOrEqualTo(Date value) {
            addCriterion("seo_createat <=", value, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatIn(List<Date> values) {
            addCriterion("seo_createat in", values, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatNotIn(List<Date> values) {
            addCriterion("seo_createat not in", values, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatBetween(Date value1, Date value2) {
            addCriterion("seo_createat between", value1, value2, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreateatNotBetween(Date value1, Date value2) {
            addCriterion("seo_createat not between", value1, value2, "seoCreateat");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyIsNull() {
            addCriterion("seo_createby is null");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyIsNotNull() {
            addCriterion("seo_createby is not null");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyEqualTo(String value) {
            addCriterion("seo_createby =", value, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyNotEqualTo(String value) {
            addCriterion("seo_createby <>", value, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyGreaterThan(String value) {
            addCriterion("seo_createby >", value, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("seo_createby >=", value, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyLessThan(String value) {
            addCriterion("seo_createby <", value, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyLessThanOrEqualTo(String value) {
            addCriterion("seo_createby <=", value, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyLike(String value) {
            addCriterion("seo_createby like", value, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyNotLike(String value) {
            addCriterion("seo_createby not like", value, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyIn(List<String> values) {
            addCriterion("seo_createby in", values, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyNotIn(List<String> values) {
            addCriterion("seo_createby not in", values, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyBetween(String value1, String value2) {
            addCriterion("seo_createby between", value1, value2, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoCreatebyNotBetween(String value1, String value2) {
            addCriterion("seo_createby not between", value1, value2, "seoCreateby");
            return (Criteria) this;
        }

        public Criteria andSeoStateIsNull() {
            addCriterion("seo_state is null");
            return (Criteria) this;
        }

        public Criteria andSeoStateIsNotNull() {
            addCriterion("seo_state is not null");
            return (Criteria) this;
        }

        public Criteria andSeoStateEqualTo(Integer value) {
            addCriterion("seo_state =", value, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateNotEqualTo(Integer value) {
            addCriterion("seo_state <>", value, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateGreaterThan(Integer value) {
            addCriterion("seo_state >", value, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("seo_state >=", value, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateLessThan(Integer value) {
            addCriterion("seo_state <", value, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateLessThanOrEqualTo(Integer value) {
            addCriterion("seo_state <=", value, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateIn(List<Integer> values) {
            addCriterion("seo_state in", values, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateNotIn(List<Integer> values) {
            addCriterion("seo_state not in", values, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateBetween(Integer value1, Integer value2) {
            addCriterion("seo_state between", value1, value2, "seoState");
            return (Criteria) this;
        }

        public Criteria andSeoStateNotBetween(Integer value1, Integer value2) {
            addCriterion("seo_state not between", value1, value2, "seoState");
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