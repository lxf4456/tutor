package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblUserSocialGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserSocialGroupExample() {
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

        public Criteria andUserSocialGroupIdIsNull() {
            addCriterion("user_social_group_id is null");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdIsNotNull() {
            addCriterion("user_social_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdEqualTo(Long value) {
            addCriterion("user_social_group_id =", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdNotEqualTo(Long value) {
            addCriterion("user_social_group_id <>", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdGreaterThan(Long value) {
            addCriterion("user_social_group_id >", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_social_group_id >=", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdLessThan(Long value) {
            addCriterion("user_social_group_id <", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("user_social_group_id <=", value, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdIn(List<Long> values) {
            addCriterion("user_social_group_id in", values, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdNotIn(List<Long> values) {
            addCriterion("user_social_group_id not in", values, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdBetween(Long value1, Long value2) {
            addCriterion("user_social_group_id between", value1, value2, "userSocialGroupId");
            return (Criteria) this;
        }

        public Criteria andUserSocialGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("user_social_group_id not between", value1, value2, "userSocialGroupId");
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

        public Criteria andSocialGroupRefIsNull() {
            addCriterion("social_group_ref is null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefIsNotNull() {
            addCriterion("social_group_ref is not null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefEqualTo(Long value) {
            addCriterion("social_group_ref =", value, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefNotEqualTo(Long value) {
            addCriterion("social_group_ref <>", value, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefGreaterThan(Long value) {
            addCriterion("social_group_ref >", value, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefGreaterThanOrEqualTo(Long value) {
            addCriterion("social_group_ref >=", value, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefLessThan(Long value) {
            addCriterion("social_group_ref <", value, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefLessThanOrEqualTo(Long value) {
            addCriterion("social_group_ref <=", value, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefIn(List<Long> values) {
            addCriterion("social_group_ref in", values, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefNotIn(List<Long> values) {
            addCriterion("social_group_ref not in", values, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefBetween(Long value1, Long value2) {
            addCriterion("social_group_ref between", value1, value2, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andSocialGroupRefNotBetween(Long value1, Long value2) {
            addCriterion("social_group_ref not between", value1, value2, "socialGroupRef");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationIsNull() {
            addCriterion("user_group_relation is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationIsNotNull() {
            addCriterion("user_group_relation is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationEqualTo(String value) {
            addCriterion("user_group_relation =", value, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationNotEqualTo(String value) {
            addCriterion("user_group_relation <>", value, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationGreaterThan(String value) {
            addCriterion("user_group_relation >", value, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_relation >=", value, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationLessThan(String value) {
            addCriterion("user_group_relation <", value, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationLessThanOrEqualTo(String value) {
            addCriterion("user_group_relation <=", value, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationLike(String value) {
            addCriterion("user_group_relation like", value, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationNotLike(String value) {
            addCriterion("user_group_relation not like", value, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationIn(List<String> values) {
            addCriterion("user_group_relation in", values, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationNotIn(List<String> values) {
            addCriterion("user_group_relation not in", values, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationBetween(String value1, String value2) {
            addCriterion("user_group_relation between", value1, value2, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupRelationNotBetween(String value1, String value2) {
            addCriterion("user_group_relation not between", value1, value2, "userGroupRelation");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameIsNull() {
            addCriterion("user_group_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameIsNotNull() {
            addCriterion("user_group_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameEqualTo(String value) {
            addCriterion("user_group_nick_name =", value, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameNotEqualTo(String value) {
            addCriterion("user_group_nick_name <>", value, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameGreaterThan(String value) {
            addCriterion("user_group_nick_name >", value, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_nick_name >=", value, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameLessThan(String value) {
            addCriterion("user_group_nick_name <", value, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameLessThanOrEqualTo(String value) {
            addCriterion("user_group_nick_name <=", value, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameLike(String value) {
            addCriterion("user_group_nick_name like", value, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameNotLike(String value) {
            addCriterion("user_group_nick_name not like", value, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameIn(List<String> values) {
            addCriterion("user_group_nick_name in", values, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameNotIn(List<String> values) {
            addCriterion("user_group_nick_name not in", values, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameBetween(String value1, String value2) {
            addCriterion("user_group_nick_name between", value1, value2, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNickNameNotBetween(String value1, String value2) {
            addCriterion("user_group_nick_name not between", value1, value2, "userGroupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameIsNull() {
            addCriterion("group_user_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameIsNotNull() {
            addCriterion("group_user_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameEqualTo(String value) {
            addCriterion("group_user_nick_name =", value, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameNotEqualTo(String value) {
            addCriterion("group_user_nick_name <>", value, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameGreaterThan(String value) {
            addCriterion("group_user_nick_name >", value, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_user_nick_name >=", value, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameLessThan(String value) {
            addCriterion("group_user_nick_name <", value, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameLessThanOrEqualTo(String value) {
            addCriterion("group_user_nick_name <=", value, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameLike(String value) {
            addCriterion("group_user_nick_name like", value, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameNotLike(String value) {
            addCriterion("group_user_nick_name not like", value, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameIn(List<String> values) {
            addCriterion("group_user_nick_name in", values, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameNotIn(List<String> values) {
            addCriterion("group_user_nick_name not in", values, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameBetween(String value1, String value2) {
            addCriterion("group_user_nick_name between", value1, value2, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andGroupUserNickNameNotBetween(String value1, String value2) {
            addCriterion("group_user_nick_name not between", value1, value2, "groupUserNickName");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkIsNull() {
            addCriterion("user_group_remark is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkIsNotNull() {
            addCriterion("user_group_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkEqualTo(String value) {
            addCriterion("user_group_remark =", value, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkNotEqualTo(String value) {
            addCriterion("user_group_remark <>", value, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkGreaterThan(String value) {
            addCriterion("user_group_remark >", value, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_remark >=", value, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkLessThan(String value) {
            addCriterion("user_group_remark <", value, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkLessThanOrEqualTo(String value) {
            addCriterion("user_group_remark <=", value, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkLike(String value) {
            addCriterion("user_group_remark like", value, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkNotLike(String value) {
            addCriterion("user_group_remark not like", value, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkIn(List<String> values) {
            addCriterion("user_group_remark in", values, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkNotIn(List<String> values) {
            addCriterion("user_group_remark not in", values, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkBetween(String value1, String value2) {
            addCriterion("user_group_remark between", value1, value2, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andUserGroupRemarkNotBetween(String value1, String value2) {
            addCriterion("user_group_remark not between", value1, value2, "userGroupRemark");
            return (Criteria) this;
        }

        public Criteria andInviteMessageIsNull() {
            addCriterion("invite_message is null");
            return (Criteria) this;
        }

        public Criteria andInviteMessageIsNotNull() {
            addCriterion("invite_message is not null");
            return (Criteria) this;
        }

        public Criteria andInviteMessageEqualTo(String value) {
            addCriterion("invite_message =", value, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageNotEqualTo(String value) {
            addCriterion("invite_message <>", value, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageGreaterThan(String value) {
            addCriterion("invite_message >", value, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageGreaterThanOrEqualTo(String value) {
            addCriterion("invite_message >=", value, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageLessThan(String value) {
            addCriterion("invite_message <", value, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageLessThanOrEqualTo(String value) {
            addCriterion("invite_message <=", value, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageLike(String value) {
            addCriterion("invite_message like", value, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageNotLike(String value) {
            addCriterion("invite_message not like", value, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageIn(List<String> values) {
            addCriterion("invite_message in", values, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageNotIn(List<String> values) {
            addCriterion("invite_message not in", values, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageBetween(String value1, String value2) {
            addCriterion("invite_message between", value1, value2, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andInviteMessageNotBetween(String value1, String value2) {
            addCriterion("invite_message not between", value1, value2, "inviteMessage");
            return (Criteria) this;
        }

        public Criteria andJoinByIsNull() {
            addCriterion("join_by is null");
            return (Criteria) this;
        }

        public Criteria andJoinByIsNotNull() {
            addCriterion("join_by is not null");
            return (Criteria) this;
        }

        public Criteria andJoinByEqualTo(String value) {
            addCriterion("join_by =", value, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByNotEqualTo(String value) {
            addCriterion("join_by <>", value, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByGreaterThan(String value) {
            addCriterion("join_by >", value, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByGreaterThanOrEqualTo(String value) {
            addCriterion("join_by >=", value, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByLessThan(String value) {
            addCriterion("join_by <", value, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByLessThanOrEqualTo(String value) {
            addCriterion("join_by <=", value, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByLike(String value) {
            addCriterion("join_by like", value, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByNotLike(String value) {
            addCriterion("join_by not like", value, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByIn(List<String> values) {
            addCriterion("join_by in", values, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByNotIn(List<String> values) {
            addCriterion("join_by not in", values, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByBetween(String value1, String value2) {
            addCriterion("join_by between", value1, value2, "joinBy");
            return (Criteria) this;
        }

        public Criteria andJoinByNotBetween(String value1, String value2) {
            addCriterion("join_by not between", value1, value2, "joinBy");
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

        public Criteria andApprovedAtIsNull() {
            addCriterion("approved_at is null");
            return (Criteria) this;
        }

        public Criteria andApprovedAtIsNotNull() {
            addCriterion("approved_at is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedAtEqualTo(Date value) {
            addCriterion("approved_at =", value, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtNotEqualTo(Date value) {
            addCriterion("approved_at <>", value, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtGreaterThan(Date value) {
            addCriterion("approved_at >", value, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("approved_at >=", value, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtLessThan(Date value) {
            addCriterion("approved_at <", value, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtLessThanOrEqualTo(Date value) {
            addCriterion("approved_at <=", value, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtIn(List<Date> values) {
            addCriterion("approved_at in", values, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtNotIn(List<Date> values) {
            addCriterion("approved_at not in", values, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtBetween(Date value1, Date value2) {
            addCriterion("approved_at between", value1, value2, "approvedAt");
            return (Criteria) this;
        }

        public Criteria andApprovedAtNotBetween(Date value1, Date value2) {
            addCriterion("approved_at not between", value1, value2, "approvedAt");
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