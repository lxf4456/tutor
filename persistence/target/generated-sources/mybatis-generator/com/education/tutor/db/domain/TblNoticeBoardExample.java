package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblNoticeBoardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblNoticeBoardExample() {
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

        public Criteria andNoticeBoardIdIsNull() {
            addCriterion("notice_board_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdIsNotNull() {
            addCriterion("notice_board_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdEqualTo(Long value) {
            addCriterion("notice_board_id =", value, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdNotEqualTo(Long value) {
            addCriterion("notice_board_id <>", value, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdGreaterThan(Long value) {
            addCriterion("notice_board_id >", value, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("notice_board_id >=", value, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdLessThan(Long value) {
            addCriterion("notice_board_id <", value, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdLessThanOrEqualTo(Long value) {
            addCriterion("notice_board_id <=", value, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdIn(List<Long> values) {
            addCriterion("notice_board_id in", values, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdNotIn(List<Long> values) {
            addCriterion("notice_board_id not in", values, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdBetween(Long value1, Long value2) {
            addCriterion("notice_board_id between", value1, value2, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeBoardIdNotBetween(Long value1, Long value2) {
            addCriterion("notice_board_id not between", value1, value2, "noticeBoardId");
            return (Criteria) this;
        }

        public Criteria andNoticeDescIsNull() {
            addCriterion("notice_desc is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDescIsNotNull() {
            addCriterion("notice_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDescEqualTo(String value) {
            addCriterion("notice_desc =", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescNotEqualTo(String value) {
            addCriterion("notice_desc <>", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescGreaterThan(String value) {
            addCriterion("notice_desc >", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescGreaterThanOrEqualTo(String value) {
            addCriterion("notice_desc >=", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescLessThan(String value) {
            addCriterion("notice_desc <", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescLessThanOrEqualTo(String value) {
            addCriterion("notice_desc <=", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescLike(String value) {
            addCriterion("notice_desc like", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescNotLike(String value) {
            addCriterion("notice_desc not like", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescIn(List<String> values) {
            addCriterion("notice_desc in", values, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescNotIn(List<String> values) {
            addCriterion("notice_desc not in", values, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescBetween(String value1, String value2) {
            addCriterion("notice_desc between", value1, value2, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescNotBetween(String value1, String value2) {
            addCriterion("notice_desc not between", value1, value2, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIsNull() {
            addCriterion("notice_url is null");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIsNotNull() {
            addCriterion("notice_url is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlEqualTo(String value) {
            addCriterion("notice_url =", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotEqualTo(String value) {
            addCriterion("notice_url <>", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlGreaterThan(String value) {
            addCriterion("notice_url >", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notice_url >=", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLessThan(String value) {
            addCriterion("notice_url <", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLessThanOrEqualTo(String value) {
            addCriterion("notice_url <=", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLike(String value) {
            addCriterion("notice_url like", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotLike(String value) {
            addCriterion("notice_url not like", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIn(List<String> values) {
            addCriterion("notice_url in", values, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotIn(List<String> values) {
            addCriterion("notice_url not in", values, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlBetween(String value1, String value2) {
            addCriterion("notice_url between", value1, value2, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotBetween(String value1, String value2) {
            addCriterion("notice_url not between", value1, value2, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeStateIsNull() {
            addCriterion("notice_state is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStateIsNotNull() {
            addCriterion("notice_state is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStateEqualTo(Integer value) {
            addCriterion("notice_state =", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotEqualTo(Integer value) {
            addCriterion("notice_state <>", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateGreaterThan(Integer value) {
            addCriterion("notice_state >", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_state >=", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateLessThan(Integer value) {
            addCriterion("notice_state <", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateLessThanOrEqualTo(Integer value) {
            addCriterion("notice_state <=", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateIn(List<Integer> values) {
            addCriterion("notice_state in", values, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotIn(List<Integer> values) {
            addCriterion("notice_state not in", values, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateBetween(Integer value1, Integer value2) {
            addCriterion("notice_state between", value1, value2, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_state not between", value1, value2, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIsNull() {
            addCriterion("notice_type is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIsNotNull() {
            addCriterion("notice_type is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeEqualTo(Integer value) {
            addCriterion("notice_type =", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotEqualTo(Integer value) {
            addCriterion("notice_type <>", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeGreaterThan(Integer value) {
            addCriterion("notice_type >", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_type >=", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLessThan(Integer value) {
            addCriterion("notice_type <", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("notice_type <=", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIn(List<Integer> values) {
            addCriterion("notice_type in", values, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotIn(List<Integer> values) {
            addCriterion("notice_type not in", values, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeBetween(Integer value1, Integer value2) {
            addCriterion("notice_type between", value1, value2, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_type not between", value1, value2, "noticeType");
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

        public Criteria andEffectiveStartIsNull() {
            addCriterion("effective_start is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartIsNotNull() {
            addCriterion("effective_start is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartEqualTo(Date value) {
            addCriterion("effective_start =", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartNotEqualTo(Date value) {
            addCriterion("effective_start <>", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartGreaterThan(Date value) {
            addCriterion("effective_start >", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_start >=", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartLessThan(Date value) {
            addCriterion("effective_start <", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartLessThanOrEqualTo(Date value) {
            addCriterion("effective_start <=", value, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartIn(List<Date> values) {
            addCriterion("effective_start in", values, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartNotIn(List<Date> values) {
            addCriterion("effective_start not in", values, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartBetween(Date value1, Date value2) {
            addCriterion("effective_start between", value1, value2, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveStartNotBetween(Date value1, Date value2) {
            addCriterion("effective_start not between", value1, value2, "effectiveStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndIsNull() {
            addCriterion("effective_end is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndIsNotNull() {
            addCriterion("effective_end is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndEqualTo(Date value) {
            addCriterion("effective_end =", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndNotEqualTo(Date value) {
            addCriterion("effective_end <>", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndGreaterThan(Date value) {
            addCriterion("effective_end >", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_end >=", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndLessThan(Date value) {
            addCriterion("effective_end <", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndLessThanOrEqualTo(Date value) {
            addCriterion("effective_end <=", value, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndIn(List<Date> values) {
            addCriterion("effective_end in", values, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndNotIn(List<Date> values) {
            addCriterion("effective_end not in", values, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndBetween(Date value1, Date value2) {
            addCriterion("effective_end between", value1, value2, "effectiveEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndNotBetween(Date value1, Date value2) {
            addCriterion("effective_end not between", value1, value2, "effectiveEnd");
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