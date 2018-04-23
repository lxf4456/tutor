package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblClientServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblClientServiceExample() {
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

        public Criteria andClientServiceIdIsNull() {
            addCriterion("client_service_id is null");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdIsNotNull() {
            addCriterion("client_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdEqualTo(Long value) {
            addCriterion("client_service_id =", value, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdNotEqualTo(Long value) {
            addCriterion("client_service_id <>", value, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdGreaterThan(Long value) {
            addCriterion("client_service_id >", value, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_service_id >=", value, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdLessThan(Long value) {
            addCriterion("client_service_id <", value, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdLessThanOrEqualTo(Long value) {
            addCriterion("client_service_id <=", value, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdIn(List<Long> values) {
            addCriterion("client_service_id in", values, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdNotIn(List<Long> values) {
            addCriterion("client_service_id not in", values, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdBetween(Long value1, Long value2) {
            addCriterion("client_service_id between", value1, value2, "clientServiceId");
            return (Criteria) this;
        }

        public Criteria andClientServiceIdNotBetween(Long value1, Long value2) {
            addCriterion("client_service_id not between", value1, value2, "clientServiceId");
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

        public Criteria andClientOrgIdIsNull() {
            addCriterion("client_org_id is null");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdIsNotNull() {
            addCriterion("client_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdEqualTo(Long value) {
            addCriterion("client_org_id =", value, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdNotEqualTo(Long value) {
            addCriterion("client_org_id <>", value, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdGreaterThan(Long value) {
            addCriterion("client_org_id >", value, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_org_id >=", value, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdLessThan(Long value) {
            addCriterion("client_org_id <", value, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("client_org_id <=", value, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdIn(List<Long> values) {
            addCriterion("client_org_id in", values, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdNotIn(List<Long> values) {
            addCriterion("client_org_id not in", values, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdBetween(Long value1, Long value2) {
            addCriterion("client_org_id between", value1, value2, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andClientOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("client_org_id not between", value1, value2, "clientOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdIsNull() {
            addCriterion("service_org_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdIsNotNull() {
            addCriterion("service_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdEqualTo(Long value) {
            addCriterion("service_org_id =", value, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdNotEqualTo(Long value) {
            addCriterion("service_org_id <>", value, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdGreaterThan(Long value) {
            addCriterion("service_org_id >", value, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_org_id >=", value, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdLessThan(Long value) {
            addCriterion("service_org_id <", value, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("service_org_id <=", value, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdIn(List<Long> values) {
            addCriterion("service_org_id in", values, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdNotIn(List<Long> values) {
            addCriterion("service_org_id not in", values, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdBetween(Long value1, Long value2) {
            addCriterion("service_org_id between", value1, value2, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServiceOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("service_org_id not between", value1, value2, "serviceOrgId");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNull() {
            addCriterion("server_type is null");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNotNull() {
            addCriterion("server_type is not null");
            return (Criteria) this;
        }

        public Criteria andServerTypeEqualTo(Integer value) {
            addCriterion("server_type =", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotEqualTo(Integer value) {
            addCriterion("server_type <>", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThan(Integer value) {
            addCriterion("server_type >", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_type >=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThan(Integer value) {
            addCriterion("server_type <", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("server_type <=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeIn(List<Integer> values) {
            addCriterion("server_type in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotIn(List<Integer> values) {
            addCriterion("server_type not in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeBetween(Integer value1, Integer value2) {
            addCriterion("server_type between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("server_type not between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerStatusIsNull() {
            addCriterion("server_status is null");
            return (Criteria) this;
        }

        public Criteria andServerStatusIsNotNull() {
            addCriterion("server_status is not null");
            return (Criteria) this;
        }

        public Criteria andServerStatusEqualTo(Integer value) {
            addCriterion("server_status =", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotEqualTo(Integer value) {
            addCriterion("server_status <>", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThan(Integer value) {
            addCriterion("server_status >", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_status >=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThan(Integer value) {
            addCriterion("server_status <", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("server_status <=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusIn(List<Integer> values) {
            addCriterion("server_status in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotIn(List<Integer> values) {
            addCriterion("server_status not in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusBetween(Integer value1, Integer value2) {
            addCriterion("server_status between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("server_status not between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
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