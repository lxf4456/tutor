package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblDomainAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblDomainAuthExample() {
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

        public Criteria andDomainAuthIdIsNull() {
            addCriterion("domain_auth_id is null");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdIsNotNull() {
            addCriterion("domain_auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdEqualTo(Long value) {
            addCriterion("domain_auth_id =", value, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdNotEqualTo(Long value) {
            addCriterion("domain_auth_id <>", value, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdGreaterThan(Long value) {
            addCriterion("domain_auth_id >", value, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdGreaterThanOrEqualTo(Long value) {
            addCriterion("domain_auth_id >=", value, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdLessThan(Long value) {
            addCriterion("domain_auth_id <", value, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdLessThanOrEqualTo(Long value) {
            addCriterion("domain_auth_id <=", value, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdIn(List<Long> values) {
            addCriterion("domain_auth_id in", values, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdNotIn(List<Long> values) {
            addCriterion("domain_auth_id not in", values, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdBetween(Long value1, Long value2) {
            addCriterion("domain_auth_id between", value1, value2, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andDomainAuthIdNotBetween(Long value1, Long value2) {
            addCriterion("domain_auth_id not between", value1, value2, "domainAuthId");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNull() {
            addCriterion("target_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNotNull() {
            addCriterion("target_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeEqualTo(Integer value) {
            addCriterion("target_type =", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotEqualTo(Integer value) {
            addCriterion("target_type <>", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThan(Integer value) {
            addCriterion("target_type >", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_type >=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThan(Integer value) {
            addCriterion("target_type <", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("target_type <=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIn(List<Integer> values) {
            addCriterion("target_type in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotIn(List<Integer> values) {
            addCriterion("target_type not in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeBetween(Integer value1, Integer value2) {
            addCriterion("target_type between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("target_type not between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetPkIsNull() {
            addCriterion("target_pk is null");
            return (Criteria) this;
        }

        public Criteria andTargetPkIsNotNull() {
            addCriterion("target_pk is not null");
            return (Criteria) this;
        }

        public Criteria andTargetPkEqualTo(Long value) {
            addCriterion("target_pk =", value, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkNotEqualTo(Long value) {
            addCriterion("target_pk <>", value, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkGreaterThan(Long value) {
            addCriterion("target_pk >", value, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkGreaterThanOrEqualTo(Long value) {
            addCriterion("target_pk >=", value, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkLessThan(Long value) {
            addCriterion("target_pk <", value, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkLessThanOrEqualTo(Long value) {
            addCriterion("target_pk <=", value, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkIn(List<Long> values) {
            addCriterion("target_pk in", values, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkNotIn(List<Long> values) {
            addCriterion("target_pk not in", values, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkBetween(Long value1, Long value2) {
            addCriterion("target_pk between", value1, value2, "targetPk");
            return (Criteria) this;
        }

        public Criteria andTargetPkNotBetween(Long value1, Long value2) {
            addCriterion("target_pk not between", value1, value2, "targetPk");
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

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andEffectFromIsNull() {
            addCriterion("effect_from is null");
            return (Criteria) this;
        }

        public Criteria andEffectFromIsNotNull() {
            addCriterion("effect_from is not null");
            return (Criteria) this;
        }

        public Criteria andEffectFromEqualTo(Date value) {
            addCriterion("effect_from =", value, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromNotEqualTo(Date value) {
            addCriterion("effect_from <>", value, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromGreaterThan(Date value) {
            addCriterion("effect_from >", value, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromGreaterThanOrEqualTo(Date value) {
            addCriterion("effect_from >=", value, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromLessThan(Date value) {
            addCriterion("effect_from <", value, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromLessThanOrEqualTo(Date value) {
            addCriterion("effect_from <=", value, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromIn(List<Date> values) {
            addCriterion("effect_from in", values, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromNotIn(List<Date> values) {
            addCriterion("effect_from not in", values, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromBetween(Date value1, Date value2) {
            addCriterion("effect_from between", value1, value2, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectFromNotBetween(Date value1, Date value2) {
            addCriterion("effect_from not between", value1, value2, "effectFrom");
            return (Criteria) this;
        }

        public Criteria andEffectEndIsNull() {
            addCriterion("effect_end is null");
            return (Criteria) this;
        }

        public Criteria andEffectEndIsNotNull() {
            addCriterion("effect_end is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEndEqualTo(Date value) {
            addCriterion("effect_end =", value, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndNotEqualTo(Date value) {
            addCriterion("effect_end <>", value, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndGreaterThan(Date value) {
            addCriterion("effect_end >", value, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndGreaterThanOrEqualTo(Date value) {
            addCriterion("effect_end >=", value, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndLessThan(Date value) {
            addCriterion("effect_end <", value, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndLessThanOrEqualTo(Date value) {
            addCriterion("effect_end <=", value, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndIn(List<Date> values) {
            addCriterion("effect_end in", values, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndNotIn(List<Date> values) {
            addCriterion("effect_end not in", values, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndBetween(Date value1, Date value2) {
            addCriterion("effect_end between", value1, value2, "effectEnd");
            return (Criteria) this;
        }

        public Criteria andEffectEndNotBetween(Date value1, Date value2) {
            addCriterion("effect_end not between", value1, value2, "effectEnd");
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