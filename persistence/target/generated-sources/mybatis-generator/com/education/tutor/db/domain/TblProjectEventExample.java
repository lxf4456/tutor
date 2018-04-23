package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblProjectEventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblProjectEventExample() {
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

        public Criteria andProjectEventIdIsNull() {
            addCriterion("project_event_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdIsNotNull() {
            addCriterion("project_event_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdEqualTo(Long value) {
            addCriterion("project_event_id =", value, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdNotEqualTo(Long value) {
            addCriterion("project_event_id <>", value, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdGreaterThan(Long value) {
            addCriterion("project_event_id >", value, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_event_id >=", value, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdLessThan(Long value) {
            addCriterion("project_event_id <", value, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdLessThanOrEqualTo(Long value) {
            addCriterion("project_event_id <=", value, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdIn(List<Long> values) {
            addCriterion("project_event_id in", values, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdNotIn(List<Long> values) {
            addCriterion("project_event_id not in", values, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdBetween(Long value1, Long value2) {
            addCriterion("project_event_id between", value1, value2, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectEventIdNotBetween(Long value1, Long value2) {
            addCriterion("project_event_id not between", value1, value2, "projectEventId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("event_type is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("event_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(Integer value) {
            addCriterion("event_type =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(Integer value) {
            addCriterion("event_type <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(Integer value) {
            addCriterion("event_type >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_type >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(Integer value) {
            addCriterion("event_type <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(Integer value) {
            addCriterion("event_type <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<Integer> values) {
            addCriterion("event_type in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<Integer> values) {
            addCriterion("event_type not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(Integer value1, Integer value2) {
            addCriterion("event_type between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("event_type not between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventDescIsNull() {
            addCriterion("event_desc is null");
            return (Criteria) this;
        }

        public Criteria andEventDescIsNotNull() {
            addCriterion("event_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEventDescEqualTo(String value) {
            addCriterion("event_desc =", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotEqualTo(String value) {
            addCriterion("event_desc <>", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescGreaterThan(String value) {
            addCriterion("event_desc >", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescGreaterThanOrEqualTo(String value) {
            addCriterion("event_desc >=", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLessThan(String value) {
            addCriterion("event_desc <", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLessThanOrEqualTo(String value) {
            addCriterion("event_desc <=", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLike(String value) {
            addCriterion("event_desc like", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotLike(String value) {
            addCriterion("event_desc not like", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescIn(List<String> values) {
            addCriterion("event_desc in", values, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotIn(List<String> values) {
            addCriterion("event_desc not in", values, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescBetween(String value1, String value2) {
            addCriterion("event_desc between", value1, value2, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotBetween(String value1, String value2) {
            addCriterion("event_desc not between", value1, value2, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventSolutionIsNull() {
            addCriterion("event_solution is null");
            return (Criteria) this;
        }

        public Criteria andEventSolutionIsNotNull() {
            addCriterion("event_solution is not null");
            return (Criteria) this;
        }

        public Criteria andEventSolutionEqualTo(String value) {
            addCriterion("event_solution =", value, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionNotEqualTo(String value) {
            addCriterion("event_solution <>", value, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionGreaterThan(String value) {
            addCriterion("event_solution >", value, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionGreaterThanOrEqualTo(String value) {
            addCriterion("event_solution >=", value, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionLessThan(String value) {
            addCriterion("event_solution <", value, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionLessThanOrEqualTo(String value) {
            addCriterion("event_solution <=", value, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionLike(String value) {
            addCriterion("event_solution like", value, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionNotLike(String value) {
            addCriterion("event_solution not like", value, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionIn(List<String> values) {
            addCriterion("event_solution in", values, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionNotIn(List<String> values) {
            addCriterion("event_solution not in", values, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionBetween(String value1, String value2) {
            addCriterion("event_solution between", value1, value2, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventSolutionNotBetween(String value1, String value2) {
            addCriterion("event_solution not between", value1, value2, "eventSolution");
            return (Criteria) this;
        }

        public Criteria andEventRemarkIsNull() {
            addCriterion("event_remark is null");
            return (Criteria) this;
        }

        public Criteria andEventRemarkIsNotNull() {
            addCriterion("event_remark is not null");
            return (Criteria) this;
        }

        public Criteria andEventRemarkEqualTo(String value) {
            addCriterion("event_remark =", value, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkNotEqualTo(String value) {
            addCriterion("event_remark <>", value, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkGreaterThan(String value) {
            addCriterion("event_remark >", value, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("event_remark >=", value, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkLessThan(String value) {
            addCriterion("event_remark <", value, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkLessThanOrEqualTo(String value) {
            addCriterion("event_remark <=", value, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkLike(String value) {
            addCriterion("event_remark like", value, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkNotLike(String value) {
            addCriterion("event_remark not like", value, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkIn(List<String> values) {
            addCriterion("event_remark in", values, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkNotIn(List<String> values) {
            addCriterion("event_remark not in", values, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkBetween(String value1, String value2) {
            addCriterion("event_remark between", value1, value2, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventRemarkNotBetween(String value1, String value2) {
            addCriterion("event_remark not between", value1, value2, "eventRemark");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeIsNull() {
            addCriterion("event_occur_time is null");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeIsNotNull() {
            addCriterion("event_occur_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeEqualTo(Date value) {
            addCriterion("event_occur_time =", value, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeNotEqualTo(Date value) {
            addCriterion("event_occur_time <>", value, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeGreaterThan(Date value) {
            addCriterion("event_occur_time >", value, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_occur_time >=", value, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeLessThan(Date value) {
            addCriterion("event_occur_time <", value, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_occur_time <=", value, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeIn(List<Date> values) {
            addCriterion("event_occur_time in", values, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeNotIn(List<Date> values) {
            addCriterion("event_occur_time not in", values, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeBetween(Date value1, Date value2) {
            addCriterion("event_occur_time between", value1, value2, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventOccurTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_occur_time not between", value1, value2, "eventOccurTime");
            return (Criteria) this;
        }

        public Criteria andEventProducerIsNull() {
            addCriterion("event_producer is null");
            return (Criteria) this;
        }

        public Criteria andEventProducerIsNotNull() {
            addCriterion("event_producer is not null");
            return (Criteria) this;
        }

        public Criteria andEventProducerEqualTo(String value) {
            addCriterion("event_producer =", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerNotEqualTo(String value) {
            addCriterion("event_producer <>", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerGreaterThan(String value) {
            addCriterion("event_producer >", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerGreaterThanOrEqualTo(String value) {
            addCriterion("event_producer >=", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerLessThan(String value) {
            addCriterion("event_producer <", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerLessThanOrEqualTo(String value) {
            addCriterion("event_producer <=", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerLike(String value) {
            addCriterion("event_producer like", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerNotLike(String value) {
            addCriterion("event_producer not like", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerIn(List<String> values) {
            addCriterion("event_producer in", values, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerNotIn(List<String> values) {
            addCriterion("event_producer not in", values, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerBetween(String value1, String value2) {
            addCriterion("event_producer between", value1, value2, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerNotBetween(String value1, String value2) {
            addCriterion("event_producer not between", value1, value2, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProcessorIsNull() {
            addCriterion("event_processor is null");
            return (Criteria) this;
        }

        public Criteria andEventProcessorIsNotNull() {
            addCriterion("event_processor is not null");
            return (Criteria) this;
        }

        public Criteria andEventProcessorEqualTo(String value) {
            addCriterion("event_processor =", value, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorNotEqualTo(String value) {
            addCriterion("event_processor <>", value, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorGreaterThan(String value) {
            addCriterion("event_processor >", value, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorGreaterThanOrEqualTo(String value) {
            addCriterion("event_processor >=", value, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorLessThan(String value) {
            addCriterion("event_processor <", value, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorLessThanOrEqualTo(String value) {
            addCriterion("event_processor <=", value, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorLike(String value) {
            addCriterion("event_processor like", value, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorNotLike(String value) {
            addCriterion("event_processor not like", value, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorIn(List<String> values) {
            addCriterion("event_processor in", values, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorNotIn(List<String> values) {
            addCriterion("event_processor not in", values, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorBetween(String value1, String value2) {
            addCriterion("event_processor between", value1, value2, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventProcessorNotBetween(String value1, String value2) {
            addCriterion("event_processor not between", value1, value2, "eventProcessor");
            return (Criteria) this;
        }

        public Criteria andEventResultIsNull() {
            addCriterion("event_result is null");
            return (Criteria) this;
        }

        public Criteria andEventResultIsNotNull() {
            addCriterion("event_result is not null");
            return (Criteria) this;
        }

        public Criteria andEventResultEqualTo(String value) {
            addCriterion("event_result =", value, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultNotEqualTo(String value) {
            addCriterion("event_result <>", value, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultGreaterThan(String value) {
            addCriterion("event_result >", value, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultGreaterThanOrEqualTo(String value) {
            addCriterion("event_result >=", value, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultLessThan(String value) {
            addCriterion("event_result <", value, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultLessThanOrEqualTo(String value) {
            addCriterion("event_result <=", value, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultLike(String value) {
            addCriterion("event_result like", value, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultNotLike(String value) {
            addCriterion("event_result not like", value, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultIn(List<String> values) {
            addCriterion("event_result in", values, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultNotIn(List<String> values) {
            addCriterion("event_result not in", values, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultBetween(String value1, String value2) {
            addCriterion("event_result between", value1, value2, "eventResult");
            return (Criteria) this;
        }

        public Criteria andEventResultNotBetween(String value1, String value2) {
            addCriterion("event_result not between", value1, value2, "eventResult");
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