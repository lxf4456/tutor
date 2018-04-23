package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblUserInteractionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserInteractionExample() {
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

        public Criteria andUserInteractionIdIsNull() {
            addCriterion("user_interaction_id is null");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdIsNotNull() {
            addCriterion("user_interaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdEqualTo(Long value) {
            addCriterion("user_interaction_id =", value, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdNotEqualTo(Long value) {
            addCriterion("user_interaction_id <>", value, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdGreaterThan(Long value) {
            addCriterion("user_interaction_id >", value, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_interaction_id >=", value, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdLessThan(Long value) {
            addCriterion("user_interaction_id <", value, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdLessThanOrEqualTo(Long value) {
            addCriterion("user_interaction_id <=", value, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdIn(List<Long> values) {
            addCriterion("user_interaction_id in", values, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdNotIn(List<Long> values) {
            addCriterion("user_interaction_id not in", values, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdBetween(Long value1, Long value2) {
            addCriterion("user_interaction_id between", value1, value2, "userInteractionId");
            return (Criteria) this;
        }

        public Criteria andUserInteractionIdNotBetween(Long value1, Long value2) {
            addCriterion("user_interaction_id not between", value1, value2, "userInteractionId");
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

        public Criteria andTargetUrlIsNull() {
            addCriterion("target_url is null");
            return (Criteria) this;
        }

        public Criteria andTargetUrlIsNotNull() {
            addCriterion("target_url is not null");
            return (Criteria) this;
        }

        public Criteria andTargetUrlEqualTo(String value) {
            addCriterion("target_url =", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotEqualTo(String value) {
            addCriterion("target_url <>", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlGreaterThan(String value) {
            addCriterion("target_url >", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("target_url >=", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLessThan(String value) {
            addCriterion("target_url <", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLessThanOrEqualTo(String value) {
            addCriterion("target_url <=", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLike(String value) {
            addCriterion("target_url like", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotLike(String value) {
            addCriterion("target_url not like", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlIn(List<String> values) {
            addCriterion("target_url in", values, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotIn(List<String> values) {
            addCriterion("target_url not in", values, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlBetween(String value1, String value2) {
            addCriterion("target_url between", value1, value2, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotBetween(String value1, String value2) {
            addCriterion("target_url not between", value1, value2, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeIsNull() {
            addCriterion("interaction_type is null");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeIsNotNull() {
            addCriterion("interaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeEqualTo(Integer value) {
            addCriterion("interaction_type =", value, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeNotEqualTo(Integer value) {
            addCriterion("interaction_type <>", value, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeGreaterThan(Integer value) {
            addCriterion("interaction_type >", value, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("interaction_type >=", value, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeLessThan(Integer value) {
            addCriterion("interaction_type <", value, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("interaction_type <=", value, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeIn(List<Integer> values) {
            addCriterion("interaction_type in", values, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeNotIn(List<Integer> values) {
            addCriterion("interaction_type not in", values, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeBetween(Integer value1, Integer value2) {
            addCriterion("interaction_type between", value1, value2, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("interaction_type not between", value1, value2, "interactionType");
            return (Criteria) this;
        }

        public Criteria andInteractionValueIsNull() {
            addCriterion("interaction_value is null");
            return (Criteria) this;
        }

        public Criteria andInteractionValueIsNotNull() {
            addCriterion("interaction_value is not null");
            return (Criteria) this;
        }

        public Criteria andInteractionValueEqualTo(String value) {
            addCriterion("interaction_value =", value, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueNotEqualTo(String value) {
            addCriterion("interaction_value <>", value, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueGreaterThan(String value) {
            addCriterion("interaction_value >", value, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueGreaterThanOrEqualTo(String value) {
            addCriterion("interaction_value >=", value, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueLessThan(String value) {
            addCriterion("interaction_value <", value, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueLessThanOrEqualTo(String value) {
            addCriterion("interaction_value <=", value, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueLike(String value) {
            addCriterion("interaction_value like", value, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueNotLike(String value) {
            addCriterion("interaction_value not like", value, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueIn(List<String> values) {
            addCriterion("interaction_value in", values, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueNotIn(List<String> values) {
            addCriterion("interaction_value not in", values, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueBetween(String value1, String value2) {
            addCriterion("interaction_value between", value1, value2, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionValueNotBetween(String value1, String value2) {
            addCriterion("interaction_value not between", value1, value2, "interactionValue");
            return (Criteria) this;
        }

        public Criteria andInteractionAtIsNull() {
            addCriterion("interaction_at is null");
            return (Criteria) this;
        }

        public Criteria andInteractionAtIsNotNull() {
            addCriterion("interaction_at is not null");
            return (Criteria) this;
        }

        public Criteria andInteractionAtEqualTo(Date value) {
            addCriterion("interaction_at =", value, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtNotEqualTo(Date value) {
            addCriterion("interaction_at <>", value, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtGreaterThan(Date value) {
            addCriterion("interaction_at >", value, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtGreaterThanOrEqualTo(Date value) {
            addCriterion("interaction_at >=", value, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtLessThan(Date value) {
            addCriterion("interaction_at <", value, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtLessThanOrEqualTo(Date value) {
            addCriterion("interaction_at <=", value, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtIn(List<Date> values) {
            addCriterion("interaction_at in", values, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtNotIn(List<Date> values) {
            addCriterion("interaction_at not in", values, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtBetween(Date value1, Date value2) {
            addCriterion("interaction_at between", value1, value2, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andInteractionAtNotBetween(Date value1, Date value2) {
            addCriterion("interaction_at not between", value1, value2, "interactionAt");
            return (Criteria) this;
        }

        public Criteria andShareOutToIsNull() {
            addCriterion("share_out_to is null");
            return (Criteria) this;
        }

        public Criteria andShareOutToIsNotNull() {
            addCriterion("share_out_to is not null");
            return (Criteria) this;
        }

        public Criteria andShareOutToEqualTo(String value) {
            addCriterion("share_out_to =", value, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToNotEqualTo(String value) {
            addCriterion("share_out_to <>", value, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToGreaterThan(String value) {
            addCriterion("share_out_to >", value, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToGreaterThanOrEqualTo(String value) {
            addCriterion("share_out_to >=", value, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToLessThan(String value) {
            addCriterion("share_out_to <", value, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToLessThanOrEqualTo(String value) {
            addCriterion("share_out_to <=", value, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToLike(String value) {
            addCriterion("share_out_to like", value, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToNotLike(String value) {
            addCriterion("share_out_to not like", value, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToIn(List<String> values) {
            addCriterion("share_out_to in", values, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToNotIn(List<String> values) {
            addCriterion("share_out_to not in", values, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToBetween(String value1, String value2) {
            addCriterion("share_out_to between", value1, value2, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andShareOutToNotBetween(String value1, String value2) {
            addCriterion("share_out_to not between", value1, value2, "shareOutTo");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagIsNull() {
            addCriterion("revoke_flag is null");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagIsNotNull() {
            addCriterion("revoke_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagEqualTo(Integer value) {
            addCriterion("revoke_flag =", value, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagNotEqualTo(Integer value) {
            addCriterion("revoke_flag <>", value, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagGreaterThan(Integer value) {
            addCriterion("revoke_flag >", value, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("revoke_flag >=", value, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagLessThan(Integer value) {
            addCriterion("revoke_flag <", value, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagLessThanOrEqualTo(Integer value) {
            addCriterion("revoke_flag <=", value, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagIn(List<Integer> values) {
            addCriterion("revoke_flag in", values, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagNotIn(List<Integer> values) {
            addCriterion("revoke_flag not in", values, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagBetween(Integer value1, Integer value2) {
            addCriterion("revoke_flag between", value1, value2, "revokeFlag");
            return (Criteria) this;
        }

        public Criteria andRevokeFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("revoke_flag not between", value1, value2, "revokeFlag");
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

        public Criteria andTargetUserIdIsNull() {
            addCriterion("target_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdIsNotNull() {
            addCriterion("target_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdEqualTo(Long value) {
            addCriterion("target_user_id =", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotEqualTo(Long value) {
            addCriterion("target_user_id <>", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdGreaterThan(Long value) {
            addCriterion("target_user_id >", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_user_id >=", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdLessThan(Long value) {
            addCriterion("target_user_id <", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdLessThanOrEqualTo(Long value) {
            addCriterion("target_user_id <=", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdIn(List<Long> values) {
            addCriterion("target_user_id in", values, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotIn(List<Long> values) {
            addCriterion("target_user_id not in", values, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdBetween(Long value1, Long value2) {
            addCriterion("target_user_id between", value1, value2, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotBetween(Long value1, Long value2) {
            addCriterion("target_user_id not between", value1, value2, "targetUserId");
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