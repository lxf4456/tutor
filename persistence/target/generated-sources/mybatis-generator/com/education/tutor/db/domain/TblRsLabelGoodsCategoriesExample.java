package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.List;

public class TblRsLabelGoodsCategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRsLabelGoodsCategoriesExample() {
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