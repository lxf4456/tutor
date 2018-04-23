package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTopicComplainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTopicComplainExample() {
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

        public Criteria andCoIdIsNull() {
            addCriterion("co_id is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("co_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(Long value) {
            addCriterion("co_id =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(Long value) {
            addCriterion("co_id <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(Long value) {
            addCriterion("co_id >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("co_id >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(Long value) {
            addCriterion("co_id <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(Long value) {
            addCriterion("co_id <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<Long> values) {
            addCriterion("co_id in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<Long> values) {
            addCriterion("co_id not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(Long value1, Long value2) {
            addCriterion("co_id between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(Long value1, Long value2) {
            addCriterion("co_id not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoTypeIsNull() {
            addCriterion("co_type is null");
            return (Criteria) this;
        }

        public Criteria andCoTypeIsNotNull() {
            addCriterion("co_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoTypeEqualTo(Integer value) {
            addCriterion("co_type =", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeNotEqualTo(Integer value) {
            addCriterion("co_type <>", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeGreaterThan(Integer value) {
            addCriterion("co_type >", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_type >=", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeLessThan(Integer value) {
            addCriterion("co_type <", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("co_type <=", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeIn(List<Integer> values) {
            addCriterion("co_type in", values, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeNotIn(List<Integer> values) {
            addCriterion("co_type not in", values, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeBetween(Integer value1, Integer value2) {
            addCriterion("co_type between", value1, value2, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("co_type not between", value1, value2, "coType");
            return (Criteria) this;
        }

        public Criteria andCoSourceidIsNull() {
            addCriterion("co_sourceid is null");
            return (Criteria) this;
        }

        public Criteria andCoSourceidIsNotNull() {
            addCriterion("co_sourceid is not null");
            return (Criteria) this;
        }

        public Criteria andCoSourceidEqualTo(Long value) {
            addCriterion("co_sourceid =", value, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidNotEqualTo(Long value) {
            addCriterion("co_sourceid <>", value, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidGreaterThan(Long value) {
            addCriterion("co_sourceid >", value, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidGreaterThanOrEqualTo(Long value) {
            addCriterion("co_sourceid >=", value, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidLessThan(Long value) {
            addCriterion("co_sourceid <", value, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidLessThanOrEqualTo(Long value) {
            addCriterion("co_sourceid <=", value, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidIn(List<Long> values) {
            addCriterion("co_sourceid in", values, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidNotIn(List<Long> values) {
            addCriterion("co_sourceid not in", values, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidBetween(Long value1, Long value2) {
            addCriterion("co_sourceid between", value1, value2, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCoSourceidNotBetween(Long value1, Long value2) {
            addCriterion("co_sourceid not between", value1, value2, "coSourceid");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("createat is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("createat is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(Date value) {
            addCriterion("createat =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(Date value) {
            addCriterion("createat <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(Date value) {
            addCriterion("createat >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("createat >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(Date value) {
            addCriterion("createat <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(Date value) {
            addCriterion("createat <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<Date> values) {
            addCriterion("createat in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<Date> values) {
            addCriterion("createat not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(Date value1, Date value2) {
            addCriterion("createat between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(Date value1, Date value2) {
            addCriterion("createat not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createby like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createby not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andIsSolveIsNull() {
            addCriterion("is_solve is null");
            return (Criteria) this;
        }

        public Criteria andIsSolveIsNotNull() {
            addCriterion("is_solve is not null");
            return (Criteria) this;
        }

        public Criteria andIsSolveEqualTo(Integer value) {
            addCriterion("is_solve =", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveNotEqualTo(Integer value) {
            addCriterion("is_solve <>", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveGreaterThan(Integer value) {
            addCriterion("is_solve >", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_solve >=", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveLessThan(Integer value) {
            addCriterion("is_solve <", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveLessThanOrEqualTo(Integer value) {
            addCriterion("is_solve <=", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveIn(List<Integer> values) {
            addCriterion("is_solve in", values, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveNotIn(List<Integer> values) {
            addCriterion("is_solve not in", values, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveBetween(Integer value1, Integer value2) {
            addCriterion("is_solve between", value1, value2, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_solve not between", value1, value2, "isSolve");
            return (Criteria) this;
        }

        public Criteria andCoContentIsNull() {
            addCriterion("co_content is null");
            return (Criteria) this;
        }

        public Criteria andCoContentIsNotNull() {
            addCriterion("co_content is not null");
            return (Criteria) this;
        }

        public Criteria andCoContentEqualTo(String value) {
            addCriterion("co_content =", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotEqualTo(String value) {
            addCriterion("co_content <>", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentGreaterThan(String value) {
            addCriterion("co_content >", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentGreaterThanOrEqualTo(String value) {
            addCriterion("co_content >=", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentLessThan(String value) {
            addCriterion("co_content <", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentLessThanOrEqualTo(String value) {
            addCriterion("co_content <=", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentLike(String value) {
            addCriterion("co_content like", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotLike(String value) {
            addCriterion("co_content not like", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentIn(List<String> values) {
            addCriterion("co_content in", values, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotIn(List<String> values) {
            addCriterion("co_content not in", values, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentBetween(String value1, String value2) {
            addCriterion("co_content between", value1, value2, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotBetween(String value1, String value2) {
            addCriterion("co_content not between", value1, value2, "coContent");
            return (Criteria) this;
        }

        public Criteria andSoContentIsNull() {
            addCriterion("so_content is null");
            return (Criteria) this;
        }

        public Criteria andSoContentIsNotNull() {
            addCriterion("so_content is not null");
            return (Criteria) this;
        }

        public Criteria andSoContentEqualTo(String value) {
            addCriterion("so_content =", value, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentNotEqualTo(String value) {
            addCriterion("so_content <>", value, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentGreaterThan(String value) {
            addCriterion("so_content >", value, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentGreaterThanOrEqualTo(String value) {
            addCriterion("so_content >=", value, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentLessThan(String value) {
            addCriterion("so_content <", value, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentLessThanOrEqualTo(String value) {
            addCriterion("so_content <=", value, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentLike(String value) {
            addCriterion("so_content like", value, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentNotLike(String value) {
            addCriterion("so_content not like", value, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentIn(List<String> values) {
            addCriterion("so_content in", values, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentNotIn(List<String> values) {
            addCriterion("so_content not in", values, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentBetween(String value1, String value2) {
            addCriterion("so_content between", value1, value2, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoContentNotBetween(String value1, String value2) {
            addCriterion("so_content not between", value1, value2, "soContent");
            return (Criteria) this;
        }

        public Criteria andSoUserIsNull() {
            addCriterion("so_user is null");
            return (Criteria) this;
        }

        public Criteria andSoUserIsNotNull() {
            addCriterion("so_user is not null");
            return (Criteria) this;
        }

        public Criteria andSoUserEqualTo(String value) {
            addCriterion("so_user =", value, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserNotEqualTo(String value) {
            addCriterion("so_user <>", value, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserGreaterThan(String value) {
            addCriterion("so_user >", value, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserGreaterThanOrEqualTo(String value) {
            addCriterion("so_user >=", value, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserLessThan(String value) {
            addCriterion("so_user <", value, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserLessThanOrEqualTo(String value) {
            addCriterion("so_user <=", value, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserLike(String value) {
            addCriterion("so_user like", value, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserNotLike(String value) {
            addCriterion("so_user not like", value, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserIn(List<String> values) {
            addCriterion("so_user in", values, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserNotIn(List<String> values) {
            addCriterion("so_user not in", values, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserBetween(String value1, String value2) {
            addCriterion("so_user between", value1, value2, "soUser");
            return (Criteria) this;
        }

        public Criteria andSoUserNotBetween(String value1, String value2) {
            addCriterion("so_user not between", value1, value2, "soUser");
            return (Criteria) this;
        }

        public Criteria andCoUserIsNull() {
            addCriterion("co_user is null");
            return (Criteria) this;
        }

        public Criteria andCoUserIsNotNull() {
            addCriterion("co_user is not null");
            return (Criteria) this;
        }

        public Criteria andCoUserEqualTo(String value) {
            addCriterion("co_user =", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserNotEqualTo(String value) {
            addCriterion("co_user <>", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserGreaterThan(String value) {
            addCriterion("co_user >", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserGreaterThanOrEqualTo(String value) {
            addCriterion("co_user >=", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserLessThan(String value) {
            addCriterion("co_user <", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserLessThanOrEqualTo(String value) {
            addCriterion("co_user <=", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserLike(String value) {
            addCriterion("co_user like", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserNotLike(String value) {
            addCriterion("co_user not like", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserIn(List<String> values) {
            addCriterion("co_user in", values, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserNotIn(List<String> values) {
            addCriterion("co_user not in", values, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserBetween(String value1, String value2) {
            addCriterion("co_user between", value1, value2, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserNotBetween(String value1, String value2) {
            addCriterion("co_user not between", value1, value2, "coUser");
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