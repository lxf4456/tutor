package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblCommentsOnPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCommentsOnPostExample() {
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

        public Criteria andCommentsOnPostIdIsNull() {
            addCriterion("comments_on_post_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdIsNotNull() {
            addCriterion("comments_on_post_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdEqualTo(Long value) {
            addCriterion("comments_on_post_id =", value, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdNotEqualTo(Long value) {
            addCriterion("comments_on_post_id <>", value, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdGreaterThan(Long value) {
            addCriterion("comments_on_post_id >", value, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comments_on_post_id >=", value, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdLessThan(Long value) {
            addCriterion("comments_on_post_id <", value, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdLessThanOrEqualTo(Long value) {
            addCriterion("comments_on_post_id <=", value, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdIn(List<Long> values) {
            addCriterion("comments_on_post_id in", values, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdNotIn(List<Long> values) {
            addCriterion("comments_on_post_id not in", values, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdBetween(Long value1, Long value2) {
            addCriterion("comments_on_post_id between", value1, value2, "commentsOnPostId");
            return (Criteria) this;
        }

        public Criteria andCommentsOnPostIdNotBetween(Long value1, Long value2) {
            addCriterion("comments_on_post_id not between", value1, value2, "commentsOnPostId");
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

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Long value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Long value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Long value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Long value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Long value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Long> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Long> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Long value1, Long value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Long value1, Long value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPollIdIsNull() {
            addCriterion("poll_id is null");
            return (Criteria) this;
        }

        public Criteria andPollIdIsNotNull() {
            addCriterion("poll_id is not null");
            return (Criteria) this;
        }

        public Criteria andPollIdEqualTo(Long value) {
            addCriterion("poll_id =", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdNotEqualTo(Long value) {
            addCriterion("poll_id <>", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdGreaterThan(Long value) {
            addCriterion("poll_id >", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdGreaterThanOrEqualTo(Long value) {
            addCriterion("poll_id >=", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdLessThan(Long value) {
            addCriterion("poll_id <", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdLessThanOrEqualTo(Long value) {
            addCriterion("poll_id <=", value, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdIn(List<Long> values) {
            addCriterion("poll_id in", values, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdNotIn(List<Long> values) {
            addCriterion("poll_id not in", values, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdBetween(Long value1, Long value2) {
            addCriterion("poll_id between", value1, value2, "pollId");
            return (Criteria) this;
        }

        public Criteria andPollIdNotBetween(Long value1, Long value2) {
            addCriterion("poll_id not between", value1, value2, "pollId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNull() {
            addCriterion("comment_type is null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNotNull() {
            addCriterion("comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeEqualTo(Integer value) {
            addCriterion("comment_type =", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotEqualTo(Integer value) {
            addCriterion("comment_type <>", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThan(Integer value) {
            addCriterion("comment_type >", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_type >=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThan(Integer value) {
            addCriterion("comment_type <", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_type <=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIn(List<Integer> values) {
            addCriterion("comment_type in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotIn(List<Integer> values) {
            addCriterion("comment_type not in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeBetween(Integer value1, Integer value2) {
            addCriterion("comment_type between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_type not between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentUrlIsNull() {
            addCriterion("comment_url is null");
            return (Criteria) this;
        }

        public Criteria andCommentUrlIsNotNull() {
            addCriterion("comment_url is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUrlEqualTo(String value) {
            addCriterion("comment_url =", value, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlNotEqualTo(String value) {
            addCriterion("comment_url <>", value, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlGreaterThan(String value) {
            addCriterion("comment_url >", value, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlGreaterThanOrEqualTo(String value) {
            addCriterion("comment_url >=", value, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlLessThan(String value) {
            addCriterion("comment_url <", value, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlLessThanOrEqualTo(String value) {
            addCriterion("comment_url <=", value, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlLike(String value) {
            addCriterion("comment_url like", value, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlNotLike(String value) {
            addCriterion("comment_url not like", value, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlIn(List<String> values) {
            addCriterion("comment_url in", values, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlNotIn(List<String> values) {
            addCriterion("comment_url not in", values, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlBetween(String value1, String value2) {
            addCriterion("comment_url between", value1, value2, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentUrlNotBetween(String value1, String value2) {
            addCriterion("comment_url not between", value1, value2, "commentUrl");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNull() {
            addCriterion("comment_state is null");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNotNull() {
            addCriterion("comment_state is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStateEqualTo(Integer value) {
            addCriterion("comment_state =", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotEqualTo(Integer value) {
            addCriterion("comment_state <>", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThan(Integer value) {
            addCriterion("comment_state >", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_state >=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThan(Integer value) {
            addCriterion("comment_state <", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThanOrEqualTo(Integer value) {
            addCriterion("comment_state <=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateIn(List<Integer> values) {
            addCriterion("comment_state in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotIn(List<Integer> values) {
            addCriterion("comment_state not in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateBetween(Integer value1, Integer value2) {
            addCriterion("comment_state between", value1, value2, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_state not between", value1, value2, "commentState");
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

        public Criteria andTargetCommentsIdIsNull() {
            addCriterion("target_comments_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdIsNotNull() {
            addCriterion("target_comments_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdEqualTo(Long value) {
            addCriterion("target_comments_id =", value, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdNotEqualTo(Long value) {
            addCriterion("target_comments_id <>", value, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdGreaterThan(Long value) {
            addCriterion("target_comments_id >", value, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_comments_id >=", value, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdLessThan(Long value) {
            addCriterion("target_comments_id <", value, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdLessThanOrEqualTo(Long value) {
            addCriterion("target_comments_id <=", value, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdIn(List<Long> values) {
            addCriterion("target_comments_id in", values, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdNotIn(List<Long> values) {
            addCriterion("target_comments_id not in", values, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdBetween(Long value1, Long value2) {
            addCriterion("target_comments_id between", value1, value2, "targetCommentsId");
            return (Criteria) this;
        }

        public Criteria andTargetCommentsIdNotBetween(Long value1, Long value2) {
            addCriterion("target_comments_id not between", value1, value2, "targetCommentsId");
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