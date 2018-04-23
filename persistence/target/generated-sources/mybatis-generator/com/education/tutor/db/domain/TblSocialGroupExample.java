package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblSocialGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblSocialGroupExample() {
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

        public Criteria andSocialGroupIdIsNull() {
            addCriterion("social_group_id is null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdIsNotNull() {
            addCriterion("social_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdEqualTo(Long value) {
            addCriterion("social_group_id =", value, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdNotEqualTo(Long value) {
            addCriterion("social_group_id <>", value, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdGreaterThan(Long value) {
            addCriterion("social_group_id >", value, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("social_group_id >=", value, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdLessThan(Long value) {
            addCriterion("social_group_id <", value, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("social_group_id <=", value, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdIn(List<Long> values) {
            addCriterion("social_group_id in", values, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdNotIn(List<Long> values) {
            addCriterion("social_group_id not in", values, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdBetween(Long value1, Long value2) {
            addCriterion("social_group_id between", value1, value2, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("social_group_id not between", value1, value2, "socialGroupId");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameIsNull() {
            addCriterion("social_group_name is null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameIsNotNull() {
            addCriterion("social_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameEqualTo(String value) {
            addCriterion("social_group_name =", value, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameNotEqualTo(String value) {
            addCriterion("social_group_name <>", value, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameGreaterThan(String value) {
            addCriterion("social_group_name >", value, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("social_group_name >=", value, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameLessThan(String value) {
            addCriterion("social_group_name <", value, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameLessThanOrEqualTo(String value) {
            addCriterion("social_group_name <=", value, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameLike(String value) {
            addCriterion("social_group_name like", value, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameNotLike(String value) {
            addCriterion("social_group_name not like", value, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameIn(List<String> values) {
            addCriterion("social_group_name in", values, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameNotIn(List<String> values) {
            addCriterion("social_group_name not in", values, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameBetween(String value1, String value2) {
            addCriterion("social_group_name between", value1, value2, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupNameNotBetween(String value1, String value2) {
            addCriterion("social_group_name not between", value1, value2, "socialGroupName");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarIsNull() {
            addCriterion("social_group_avatar is null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarIsNotNull() {
            addCriterion("social_group_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarEqualTo(String value) {
            addCriterion("social_group_avatar =", value, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarNotEqualTo(String value) {
            addCriterion("social_group_avatar <>", value, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarGreaterThan(String value) {
            addCriterion("social_group_avatar >", value, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("social_group_avatar >=", value, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarLessThan(String value) {
            addCriterion("social_group_avatar <", value, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarLessThanOrEqualTo(String value) {
            addCriterion("social_group_avatar <=", value, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarLike(String value) {
            addCriterion("social_group_avatar like", value, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarNotLike(String value) {
            addCriterion("social_group_avatar not like", value, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarIn(List<String> values) {
            addCriterion("social_group_avatar in", values, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarNotIn(List<String> values) {
            addCriterion("social_group_avatar not in", values, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarBetween(String value1, String value2) {
            addCriterion("social_group_avatar between", value1, value2, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupAvatarNotBetween(String value1, String value2) {
            addCriterion("social_group_avatar not between", value1, value2, "socialGroupAvatar");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescIsNull() {
            addCriterion("social_group_desc is null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescIsNotNull() {
            addCriterion("social_group_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescEqualTo(String value) {
            addCriterion("social_group_desc =", value, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescNotEqualTo(String value) {
            addCriterion("social_group_desc <>", value, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescGreaterThan(String value) {
            addCriterion("social_group_desc >", value, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescGreaterThanOrEqualTo(String value) {
            addCriterion("social_group_desc >=", value, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescLessThan(String value) {
            addCriterion("social_group_desc <", value, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescLessThanOrEqualTo(String value) {
            addCriterion("social_group_desc <=", value, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescLike(String value) {
            addCriterion("social_group_desc like", value, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescNotLike(String value) {
            addCriterion("social_group_desc not like", value, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescIn(List<String> values) {
            addCriterion("social_group_desc in", values, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescNotIn(List<String> values) {
            addCriterion("social_group_desc not in", values, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescBetween(String value1, String value2) {
            addCriterion("social_group_desc between", value1, value2, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupDescNotBetween(String value1, String value2) {
            addCriterion("social_group_desc not between", value1, value2, "socialGroupDesc");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeIsNull() {
            addCriterion("social_group_type is null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeIsNotNull() {
            addCriterion("social_group_type is not null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeEqualTo(Short value) {
            addCriterion("social_group_type =", value, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeNotEqualTo(Short value) {
            addCriterion("social_group_type <>", value, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeGreaterThan(Short value) {
            addCriterion("social_group_type >", value, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("social_group_type >=", value, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeLessThan(Short value) {
            addCriterion("social_group_type <", value, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeLessThanOrEqualTo(Short value) {
            addCriterion("social_group_type <=", value, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeIn(List<Short> values) {
            addCriterion("social_group_type in", values, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeNotIn(List<Short> values) {
            addCriterion("social_group_type not in", values, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeBetween(Short value1, Short value2) {
            addCriterion("social_group_type between", value1, value2, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andSocialGroupTypeNotBetween(Short value1, Short value2) {
            addCriterion("social_group_type not between", value1, value2, "socialGroupType");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(Long value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(Long value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(Long value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(Long value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(Long value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(Long value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<Long> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<Long> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(Long value1, Long value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(Long value1, Long value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(Long value) {
            addCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(Long value) {
            addCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(Long value) {
            addCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(Long value) {
            addCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(Long value) {
            addCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(Long value) {
            addCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<Long> values) {
            addCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<Long> values) {
            addCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(Long value1, Long value2) {
            addCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(Long value1, Long value2) {
            addCriterion("admin not between", value1, value2, "admin");
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

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
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