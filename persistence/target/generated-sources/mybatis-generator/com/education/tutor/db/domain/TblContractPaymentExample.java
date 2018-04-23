package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblContractPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblContractPaymentExample() {
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

        public Criteria andContractPaymentIdIsNull() {
            addCriterion("contract_payment_id is null");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdIsNotNull() {
            addCriterion("contract_payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdEqualTo(Long value) {
            addCriterion("contract_payment_id =", value, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdNotEqualTo(Long value) {
            addCriterion("contract_payment_id <>", value, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdGreaterThan(Long value) {
            addCriterion("contract_payment_id >", value, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contract_payment_id >=", value, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdLessThan(Long value) {
            addCriterion("contract_payment_id <", value, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("contract_payment_id <=", value, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdIn(List<Long> values) {
            addCriterion("contract_payment_id in", values, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdNotIn(List<Long> values) {
            addCriterion("contract_payment_id not in", values, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdBetween(Long value1, Long value2) {
            addCriterion("contract_payment_id between", value1, value2, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractPaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("contract_payment_id not between", value1, value2, "contractPaymentId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Long value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Long value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Long value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Long value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Long value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Long> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Long> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Long value1, Long value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Long value1, Long value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNull() {
            addCriterion("seq_no is null");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNotNull() {
            addCriterion("seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNoEqualTo(String value) {
            addCriterion("seq_no =", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotEqualTo(String value) {
            addCriterion("seq_no <>", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThan(String value) {
            addCriterion("seq_no >", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("seq_no >=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThan(String value) {
            addCriterion("seq_no <", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThanOrEqualTo(String value) {
            addCriterion("seq_no <=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLike(String value) {
            addCriterion("seq_no like", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotLike(String value) {
            addCriterion("seq_no not like", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoIn(List<String> values) {
            addCriterion("seq_no in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotIn(List<String> values) {
            addCriterion("seq_no not in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoBetween(String value1, String value2) {
            addCriterion("seq_no between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotBetween(String value1, String value2) {
            addCriterion("seq_no not between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkIsNull() {
            addCriterion("commission_source_pk is null");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkIsNotNull() {
            addCriterion("commission_source_pk is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkEqualTo(Long value) {
            addCriterion("commission_source_pk =", value, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkNotEqualTo(Long value) {
            addCriterion("commission_source_pk <>", value, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkGreaterThan(Long value) {
            addCriterion("commission_source_pk >", value, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkGreaterThanOrEqualTo(Long value) {
            addCriterion("commission_source_pk >=", value, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkLessThan(Long value) {
            addCriterion("commission_source_pk <", value, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkLessThanOrEqualTo(Long value) {
            addCriterion("commission_source_pk <=", value, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkIn(List<Long> values) {
            addCriterion("commission_source_pk in", values, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkNotIn(List<Long> values) {
            addCriterion("commission_source_pk not in", values, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkBetween(Long value1, Long value2) {
            addCriterion("commission_source_pk between", value1, value2, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionSourcePkNotBetween(Long value1, Long value2) {
            addCriterion("commission_source_pk not between", value1, value2, "commissionSourcePk");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelIsNull() {
            addCriterion("commission_level is null");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelIsNotNull() {
            addCriterion("commission_level is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelEqualTo(Integer value) {
            addCriterion("commission_level =", value, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelNotEqualTo(Integer value) {
            addCriterion("commission_level <>", value, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelGreaterThan(Integer value) {
            addCriterion("commission_level >", value, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission_level >=", value, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelLessThan(Integer value) {
            addCriterion("commission_level <", value, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelLessThanOrEqualTo(Integer value) {
            addCriterion("commission_level <=", value, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelIn(List<Integer> values) {
            addCriterion("commission_level in", values, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelNotIn(List<Integer> values) {
            addCriterion("commission_level not in", values, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelBetween(Integer value1, Integer value2) {
            addCriterion("commission_level between", value1, value2, "commissionLevel");
            return (Criteria) this;
        }

        public Criteria andCommissionLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("commission_level not between", value1, value2, "commissionLevel");
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

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(Integer value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(Integer value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(Integer value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(Integer value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(Integer value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<Integer> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<Integer> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(Integer value1, Integer value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(Integer value1, Integer value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andItemCountIsNull() {
            addCriterion("item_count is null");
            return (Criteria) this;
        }

        public Criteria andItemCountIsNotNull() {
            addCriterion("item_count is not null");
            return (Criteria) this;
        }

        public Criteria andItemCountEqualTo(Integer value) {
            addCriterion("item_count =", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotEqualTo(Integer value) {
            addCriterion("item_count <>", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountGreaterThan(Integer value) {
            addCriterion("item_count >", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_count >=", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountLessThan(Integer value) {
            addCriterion("item_count <", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountLessThanOrEqualTo(Integer value) {
            addCriterion("item_count <=", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountIn(List<Integer> values) {
            addCriterion("item_count in", values, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotIn(List<Integer> values) {
            addCriterion("item_count not in", values, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountBetween(Integer value1, Integer value2) {
            addCriterion("item_count between", value1, value2, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotBetween(Integer value1, Integer value2) {
            addCriterion("item_count not between", value1, value2, "itemCount");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioIsNull() {
            addCriterion("exchange_ratio is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioIsNotNull() {
            addCriterion("exchange_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioEqualTo(Integer value) {
            addCriterion("exchange_ratio =", value, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioNotEqualTo(Integer value) {
            addCriterion("exchange_ratio <>", value, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioGreaterThan(Integer value) {
            addCriterion("exchange_ratio >", value, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_ratio >=", value, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioLessThan(Integer value) {
            addCriterion("exchange_ratio <", value, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_ratio <=", value, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioIn(List<Integer> values) {
            addCriterion("exchange_ratio in", values, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioNotIn(List<Integer> values) {
            addCriterion("exchange_ratio not in", values, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioBetween(Integer value1, Integer value2) {
            addCriterion("exchange_ratio between", value1, value2, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andExchangeRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_ratio not between", value1, value2, "exchangeRatio");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(Date value) {
            addCriterion("bill_date =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(Date value) {
            addCriterion("bill_date <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(Date value) {
            addCriterion("bill_date >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_date >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(Date value) {
            addCriterion("bill_date <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(Date value) {
            addCriterion("bill_date <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<Date> values) {
            addCriterion("bill_date in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<Date> values) {
            addCriterion("bill_date not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(Date value1, Date value2) {
            addCriterion("bill_date between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(Date value1, Date value2) {
            addCriterion("bill_date not between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andFeeChargedIsNull() {
            addCriterion("fee_charged is null");
            return (Criteria) this;
        }

        public Criteria andFeeChargedIsNotNull() {
            addCriterion("fee_charged is not null");
            return (Criteria) this;
        }

        public Criteria andFeeChargedEqualTo(Integer value) {
            addCriterion("fee_charged =", value, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedNotEqualTo(Integer value) {
            addCriterion("fee_charged <>", value, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedGreaterThan(Integer value) {
            addCriterion("fee_charged >", value, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_charged >=", value, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedLessThan(Integer value) {
            addCriterion("fee_charged <", value, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedLessThanOrEqualTo(Integer value) {
            addCriterion("fee_charged <=", value, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedIn(List<Integer> values) {
            addCriterion("fee_charged in", values, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedNotIn(List<Integer> values) {
            addCriterion("fee_charged not in", values, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedBetween(Integer value1, Integer value2) {
            addCriterion("fee_charged between", value1, value2, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andFeeChargedNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_charged not between", value1, value2, "feeCharged");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(Integer value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(Integer value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(Integer value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(Integer value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(Integer value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<Integer> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<Integer> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(Integer value1, Integer value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
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