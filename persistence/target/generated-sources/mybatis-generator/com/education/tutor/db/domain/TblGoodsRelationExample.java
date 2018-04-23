package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblGoodsRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGoodsRelationExample() {
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

        public Criteria andGoodsRelationIdIsNull() {
            addCriterion("goods_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdIsNotNull() {
            addCriterion("goods_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdEqualTo(Long value) {
            addCriterion("goods_relation_id =", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdNotEqualTo(Long value) {
            addCriterion("goods_relation_id <>", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdGreaterThan(Long value) {
            addCriterion("goods_relation_id >", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_relation_id >=", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdLessThan(Long value) {
            addCriterion("goods_relation_id <", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_relation_id <=", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdIn(List<Long> values) {
            addCriterion("goods_relation_id in", values, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdNotIn(List<Long> values) {
            addCriterion("goods_relation_id not in", values, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdBetween(Long value1, Long value2) {
            addCriterion("goods_relation_id between", value1, value2, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_relation_id not between", value1, value2, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Short value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Short value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Short value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Short value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Short value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Short> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Short> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Short value1, Short value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Short value1, Short value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andSearchCodeIsNull() {
            addCriterion("search_code is null");
            return (Criteria) this;
        }

        public Criteria andSearchCodeIsNotNull() {
            addCriterion("search_code is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCodeEqualTo(String value) {
            addCriterion("search_code =", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeNotEqualTo(String value) {
            addCriterion("search_code <>", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeGreaterThan(String value) {
            addCriterion("search_code >", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("search_code >=", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeLessThan(String value) {
            addCriterion("search_code <", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeLessThanOrEqualTo(String value) {
            addCriterion("search_code <=", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeLike(String value) {
            addCriterion("search_code like", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeNotLike(String value) {
            addCriterion("search_code not like", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeIn(List<String> values) {
            addCriterion("search_code in", values, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeNotIn(List<String> values) {
            addCriterion("search_code not in", values, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeBetween(String value1, String value2) {
            addCriterion("search_code between", value1, value2, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeNotBetween(String value1, String value2) {
            addCriterion("search_code not between", value1, value2, "searchCode");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNull() {
            addCriterion("project_no is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNotNull() {
            addCriterion("project_no is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoEqualTo(String value) {
            addCriterion("project_no =", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotEqualTo(String value) {
            addCriterion("project_no <>", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThan(String value) {
            addCriterion("project_no >", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("project_no >=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThan(String value) {
            addCriterion("project_no <", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThanOrEqualTo(String value) {
            addCriterion("project_no <=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLike(String value) {
            addCriterion("project_no like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotLike(String value) {
            addCriterion("project_no not like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoIn(List<String> values) {
            addCriterion("project_no in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotIn(List<String> values) {
            addCriterion("project_no not in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoBetween(String value1, String value2) {
            addCriterion("project_no between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotBetween(String value1, String value2) {
            addCriterion("project_no not between", value1, value2, "projectNo");
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

        public Criteria andDemandAmountIsNull() {
            addCriterion("demand_amount is null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountIsNotNull() {
            addCriterion("demand_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountEqualTo(Integer value) {
            addCriterion("demand_amount =", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotEqualTo(Integer value) {
            addCriterion("demand_amount <>", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountGreaterThan(Integer value) {
            addCriterion("demand_amount >", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_amount >=", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountLessThan(Integer value) {
            addCriterion("demand_amount <", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountLessThanOrEqualTo(Integer value) {
            addCriterion("demand_amount <=", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountIn(List<Integer> values) {
            addCriterion("demand_amount in", values, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotIn(List<Integer> values) {
            addCriterion("demand_amount not in", values, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBetween(Integer value1, Integer value2) {
            addCriterion("demand_amount between", value1, value2, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_amount not between", value1, value2, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNull() {
            addCriterion("tran_type is null");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNotNull() {
            addCriterion("tran_type is not null");
            return (Criteria) this;
        }

        public Criteria andTranTypeEqualTo(Integer value) {
            addCriterion("tran_type =", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotEqualTo(Integer value) {
            addCriterion("tran_type <>", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThan(Integer value) {
            addCriterion("tran_type >", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tran_type >=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThan(Integer value) {
            addCriterion("tran_type <", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tran_type <=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeIn(List<Integer> values) {
            addCriterion("tran_type in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotIn(List<Integer> values) {
            addCriterion("tran_type not in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeBetween(Integer value1, Integer value2) {
            addCriterion("tran_type between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tran_type not between", value1, value2, "tranType");
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

        public Criteria andProjectJsonIsNull() {
            addCriterion("project_json is null");
            return (Criteria) this;
        }

        public Criteria andProjectJsonIsNotNull() {
            addCriterion("project_json is not null");
            return (Criteria) this;
        }

        public Criteria andProjectJsonEqualTo(String value) {
            addCriterion("project_json =", value, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonNotEqualTo(String value) {
            addCriterion("project_json <>", value, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonGreaterThan(String value) {
            addCriterion("project_json >", value, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonGreaterThanOrEqualTo(String value) {
            addCriterion("project_json >=", value, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonLessThan(String value) {
            addCriterion("project_json <", value, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonLessThanOrEqualTo(String value) {
            addCriterion("project_json <=", value, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonLike(String value) {
            addCriterion("project_json like", value, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonNotLike(String value) {
            addCriterion("project_json not like", value, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonIn(List<String> values) {
            addCriterion("project_json in", values, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonNotIn(List<String> values) {
            addCriterion("project_json not in", values, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonBetween(String value1, String value2) {
            addCriterion("project_json between", value1, value2, "projectJson");
            return (Criteria) this;
        }

        public Criteria andProjectJsonNotBetween(String value1, String value2) {
            addCriterion("project_json not between", value1, value2, "projectJson");
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