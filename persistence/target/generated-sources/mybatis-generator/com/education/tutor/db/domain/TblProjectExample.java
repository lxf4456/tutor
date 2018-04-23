package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblProjectExample() {
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

        public Criteria andProjectDescIsNull() {
            addCriterion("project_desc is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescIsNotNull() {
            addCriterion("project_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescEqualTo(String value) {
            addCriterion("project_desc =", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotEqualTo(String value) {
            addCriterion("project_desc <>", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThan(String value) {
            addCriterion("project_desc >", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("project_desc >=", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThan(String value) {
            addCriterion("project_desc <", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThanOrEqualTo(String value) {
            addCriterion("project_desc <=", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLike(String value) {
            addCriterion("project_desc like", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotLike(String value) {
            addCriterion("project_desc not like", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescIn(List<String> values) {
            addCriterion("project_desc in", values, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotIn(List<String> values) {
            addCriterion("project_desc not in", values, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescBetween(String value1, String value2) {
            addCriterion("project_desc between", value1, value2, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotBetween(String value1, String value2) {
            addCriterion("project_desc not between", value1, value2, "projectDesc");
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaIsNull() {
            addCriterion("project_org_area is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaIsNotNull() {
            addCriterion("project_org_area is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaEqualTo(String value) {
            addCriterion("project_org_area =", value, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaNotEqualTo(String value) {
            addCriterion("project_org_area <>", value, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaGreaterThan(String value) {
            addCriterion("project_org_area >", value, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaGreaterThanOrEqualTo(String value) {
            addCriterion("project_org_area >=", value, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaLessThan(String value) {
            addCriterion("project_org_area <", value, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaLessThanOrEqualTo(String value) {
            addCriterion("project_org_area <=", value, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaLike(String value) {
            addCriterion("project_org_area like", value, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaNotLike(String value) {
            addCriterion("project_org_area not like", value, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaIn(List<String> values) {
            addCriterion("project_org_area in", values, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaNotIn(List<String> values) {
            addCriterion("project_org_area not in", values, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaBetween(String value1, String value2) {
            addCriterion("project_org_area between", value1, value2, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andProjectOrgAreaNotBetween(String value1, String value2) {
            addCriterion("project_org_area not between", value1, value2, "projectOrgArea");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourcePkIsNull() {
            addCriterion("source_pk is null");
            return (Criteria) this;
        }

        public Criteria andSourcePkIsNotNull() {
            addCriterion("source_pk is not null");
            return (Criteria) this;
        }

        public Criteria andSourcePkEqualTo(Long value) {
            addCriterion("source_pk =", value, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkNotEqualTo(Long value) {
            addCriterion("source_pk <>", value, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkGreaterThan(Long value) {
            addCriterion("source_pk >", value, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkGreaterThanOrEqualTo(Long value) {
            addCriterion("source_pk >=", value, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkLessThan(Long value) {
            addCriterion("source_pk <", value, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkLessThanOrEqualTo(Long value) {
            addCriterion("source_pk <=", value, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkIn(List<Long> values) {
            addCriterion("source_pk in", values, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkNotIn(List<Long> values) {
            addCriterion("source_pk not in", values, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkBetween(Long value1, Long value2) {
            addCriterion("source_pk between", value1, value2, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourcePkNotBetween(Long value1, Long value2) {
            addCriterion("source_pk not between", value1, value2, "sourcePk");
            return (Criteria) this;
        }

        public Criteria andSourceNoIsNull() {
            addCriterion("source_no is null");
            return (Criteria) this;
        }

        public Criteria andSourceNoIsNotNull() {
            addCriterion("source_no is not null");
            return (Criteria) this;
        }

        public Criteria andSourceNoEqualTo(String value) {
            addCriterion("source_no =", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoNotEqualTo(String value) {
            addCriterion("source_no <>", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoGreaterThan(String value) {
            addCriterion("source_no >", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("source_no >=", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoLessThan(String value) {
            addCriterion("source_no <", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoLessThanOrEqualTo(String value) {
            addCriterion("source_no <=", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoLike(String value) {
            addCriterion("source_no like", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoNotLike(String value) {
            addCriterion("source_no not like", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoIn(List<String> values) {
            addCriterion("source_no in", values, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoNotIn(List<String> values) {
            addCriterion("source_no not in", values, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoBetween(String value1, String value2) {
            addCriterion("source_no between", value1, value2, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoNotBetween(String value1, String value2) {
            addCriterion("source_no not between", value1, value2, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andProjectResultIsNull() {
            addCriterion("project_result is null");
            return (Criteria) this;
        }

        public Criteria andProjectResultIsNotNull() {
            addCriterion("project_result is not null");
            return (Criteria) this;
        }

        public Criteria andProjectResultEqualTo(String value) {
            addCriterion("project_result =", value, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultNotEqualTo(String value) {
            addCriterion("project_result <>", value, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultGreaterThan(String value) {
            addCriterion("project_result >", value, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultGreaterThanOrEqualTo(String value) {
            addCriterion("project_result >=", value, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultLessThan(String value) {
            addCriterion("project_result <", value, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultLessThanOrEqualTo(String value) {
            addCriterion("project_result <=", value, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultLike(String value) {
            addCriterion("project_result like", value, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultNotLike(String value) {
            addCriterion("project_result not like", value, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultIn(List<String> values) {
            addCriterion("project_result in", values, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultNotIn(List<String> values) {
            addCriterion("project_result not in", values, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultBetween(String value1, String value2) {
            addCriterion("project_result between", value1, value2, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectResultNotBetween(String value1, String value2) {
            addCriterion("project_result not between", value1, value2, "projectResult");
            return (Criteria) this;
        }

        public Criteria andProjectStepIsNull() {
            addCriterion("project_step is null");
            return (Criteria) this;
        }

        public Criteria andProjectStepIsNotNull() {
            addCriterion("project_step is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStepEqualTo(String value) {
            addCriterion("project_step =", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepNotEqualTo(String value) {
            addCriterion("project_step <>", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepGreaterThan(String value) {
            addCriterion("project_step >", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepGreaterThanOrEqualTo(String value) {
            addCriterion("project_step >=", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepLessThan(String value) {
            addCriterion("project_step <", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepLessThanOrEqualTo(String value) {
            addCriterion("project_step <=", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepLike(String value) {
            addCriterion("project_step like", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepNotLike(String value) {
            addCriterion("project_step not like", value, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepIn(List<String> values) {
            addCriterion("project_step in", values, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepNotIn(List<String> values) {
            addCriterion("project_step not in", values, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepBetween(String value1, String value2) {
            addCriterion("project_step between", value1, value2, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectStepNotBetween(String value1, String value2) {
            addCriterion("project_step not between", value1, value2, "projectStep");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerIsNull() {
            addCriterion("project_owner is null");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerIsNotNull() {
            addCriterion("project_owner is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerEqualTo(String value) {
            addCriterion("project_owner =", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerNotEqualTo(String value) {
            addCriterion("project_owner <>", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerGreaterThan(String value) {
            addCriterion("project_owner >", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("project_owner >=", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerLessThan(String value) {
            addCriterion("project_owner <", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerLessThanOrEqualTo(String value) {
            addCriterion("project_owner <=", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerLike(String value) {
            addCriterion("project_owner like", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerNotLike(String value) {
            addCriterion("project_owner not like", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerIn(List<String> values) {
            addCriterion("project_owner in", values, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerNotIn(List<String> values) {
            addCriterion("project_owner not in", values, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerBetween(String value1, String value2) {
            addCriterion("project_owner between", value1, value2, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerNotBetween(String value1, String value2) {
            addCriterion("project_owner not between", value1, value2, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIsNull() {
            addCriterion("project_manager is null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIsNotNull() {
            addCriterion("project_manager is not null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerEqualTo(String value) {
            addCriterion("project_manager =", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotEqualTo(String value) {
            addCriterion("project_manager <>", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGreaterThan(String value) {
            addCriterion("project_manager >", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGreaterThanOrEqualTo(String value) {
            addCriterion("project_manager >=", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLessThan(String value) {
            addCriterion("project_manager <", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLessThanOrEqualTo(String value) {
            addCriterion("project_manager <=", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLike(String value) {
            addCriterion("project_manager like", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotLike(String value) {
            addCriterion("project_manager not like", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIn(List<String> values) {
            addCriterion("project_manager in", values, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotIn(List<String> values) {
            addCriterion("project_manager not in", values, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerBetween(String value1, String value2) {
            addCriterion("project_manager between", value1, value2, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotBetween(String value1, String value2) {
            addCriterion("project_manager not between", value1, value2, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectTempIsNull() {
            addCriterion("project_temp is null");
            return (Criteria) this;
        }

        public Criteria andProjectTempIsNotNull() {
            addCriterion("project_temp is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTempEqualTo(String value) {
            addCriterion("project_temp =", value, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempNotEqualTo(String value) {
            addCriterion("project_temp <>", value, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempGreaterThan(String value) {
            addCriterion("project_temp >", value, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempGreaterThanOrEqualTo(String value) {
            addCriterion("project_temp >=", value, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempLessThan(String value) {
            addCriterion("project_temp <", value, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempLessThanOrEqualTo(String value) {
            addCriterion("project_temp <=", value, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempLike(String value) {
            addCriterion("project_temp like", value, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempNotLike(String value) {
            addCriterion("project_temp not like", value, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempIn(List<String> values) {
            addCriterion("project_temp in", values, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempNotIn(List<String> values) {
            addCriterion("project_temp not in", values, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempBetween(String value1, String value2) {
            addCriterion("project_temp between", value1, value2, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectTempNotBetween(String value1, String value2) {
            addCriterion("project_temp not between", value1, value2, "projectTemp");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlIsNull() {
            addCriterion("project_bid_url is null");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlIsNotNull() {
            addCriterion("project_bid_url is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlEqualTo(String value) {
            addCriterion("project_bid_url =", value, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlNotEqualTo(String value) {
            addCriterion("project_bid_url <>", value, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlGreaterThan(String value) {
            addCriterion("project_bid_url >", value, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlGreaterThanOrEqualTo(String value) {
            addCriterion("project_bid_url >=", value, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlLessThan(String value) {
            addCriterion("project_bid_url <", value, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlLessThanOrEqualTo(String value) {
            addCriterion("project_bid_url <=", value, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlLike(String value) {
            addCriterion("project_bid_url like", value, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlNotLike(String value) {
            addCriterion("project_bid_url not like", value, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlIn(List<String> values) {
            addCriterion("project_bid_url in", values, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlNotIn(List<String> values) {
            addCriterion("project_bid_url not in", values, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlBetween(String value1, String value2) {
            addCriterion("project_bid_url between", value1, value2, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBidUrlNotBetween(String value1, String value2) {
            addCriterion("project_bid_url not between", value1, value2, "projectBidUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlIsNull() {
            addCriterion("project_supply_url is null");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlIsNotNull() {
            addCriterion("project_supply_url is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlEqualTo(String value) {
            addCriterion("project_supply_url =", value, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlNotEqualTo(String value) {
            addCriterion("project_supply_url <>", value, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlGreaterThan(String value) {
            addCriterion("project_supply_url >", value, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("project_supply_url >=", value, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlLessThan(String value) {
            addCriterion("project_supply_url <", value, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlLessThanOrEqualTo(String value) {
            addCriterion("project_supply_url <=", value, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlLike(String value) {
            addCriterion("project_supply_url like", value, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlNotLike(String value) {
            addCriterion("project_supply_url not like", value, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlIn(List<String> values) {
            addCriterion("project_supply_url in", values, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlNotIn(List<String> values) {
            addCriterion("project_supply_url not in", values, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlBetween(String value1, String value2) {
            addCriterion("project_supply_url between", value1, value2, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectSupplyUrlNotBetween(String value1, String value2) {
            addCriterion("project_supply_url not between", value1, value2, "projectSupplyUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlIsNull() {
            addCriterion("project_quota_url is null");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlIsNotNull() {
            addCriterion("project_quota_url is not null");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlEqualTo(String value) {
            addCriterion("project_quota_url =", value, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlNotEqualTo(String value) {
            addCriterion("project_quota_url <>", value, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlGreaterThan(String value) {
            addCriterion("project_quota_url >", value, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("project_quota_url >=", value, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlLessThan(String value) {
            addCriterion("project_quota_url <", value, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlLessThanOrEqualTo(String value) {
            addCriterion("project_quota_url <=", value, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlLike(String value) {
            addCriterion("project_quota_url like", value, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlNotLike(String value) {
            addCriterion("project_quota_url not like", value, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlIn(List<String> values) {
            addCriterion("project_quota_url in", values, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlNotIn(List<String> values) {
            addCriterion("project_quota_url not in", values, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlBetween(String value1, String value2) {
            addCriterion("project_quota_url between", value1, value2, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectQuotaUrlNotBetween(String value1, String value2) {
            addCriterion("project_quota_url not between", value1, value2, "projectQuotaUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlIsNull() {
            addCriterion("project_contract_url is null");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlIsNotNull() {
            addCriterion("project_contract_url is not null");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlEqualTo(String value) {
            addCriterion("project_contract_url =", value, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlNotEqualTo(String value) {
            addCriterion("project_contract_url <>", value, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlGreaterThan(String value) {
            addCriterion("project_contract_url >", value, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlGreaterThanOrEqualTo(String value) {
            addCriterion("project_contract_url >=", value, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlLessThan(String value) {
            addCriterion("project_contract_url <", value, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlLessThanOrEqualTo(String value) {
            addCriterion("project_contract_url <=", value, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlLike(String value) {
            addCriterion("project_contract_url like", value, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlNotLike(String value) {
            addCriterion("project_contract_url not like", value, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlIn(List<String> values) {
            addCriterion("project_contract_url in", values, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlNotIn(List<String> values) {
            addCriterion("project_contract_url not in", values, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlBetween(String value1, String value2) {
            addCriterion("project_contract_url between", value1, value2, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectContractUrlNotBetween(String value1, String value2) {
            addCriterion("project_contract_url not between", value1, value2, "projectContractUrl");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(Integer value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(Integer value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(Integer value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(Integer value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<Integer> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<Integer> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectStartIsNull() {
            addCriterion("project_start is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartIsNotNull() {
            addCriterion("project_start is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartEqualTo(Date value) {
            addCriterion("project_start =", value, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartNotEqualTo(Date value) {
            addCriterion("project_start <>", value, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartGreaterThan(Date value) {
            addCriterion("project_start >", value, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartGreaterThanOrEqualTo(Date value) {
            addCriterion("project_start >=", value, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartLessThan(Date value) {
            addCriterion("project_start <", value, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartLessThanOrEqualTo(Date value) {
            addCriterion("project_start <=", value, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartIn(List<Date> values) {
            addCriterion("project_start in", values, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartNotIn(List<Date> values) {
            addCriterion("project_start not in", values, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartBetween(Date value1, Date value2) {
            addCriterion("project_start between", value1, value2, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectStartNotBetween(Date value1, Date value2) {
            addCriterion("project_start not between", value1, value2, "projectStart");
            return (Criteria) this;
        }

        public Criteria andProjectEndIsNull() {
            addCriterion("project_end is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndIsNotNull() {
            addCriterion("project_end is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndEqualTo(Date value) {
            addCriterion("project_end =", value, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndNotEqualTo(Date value) {
            addCriterion("project_end <>", value, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndGreaterThan(Date value) {
            addCriterion("project_end >", value, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndGreaterThanOrEqualTo(Date value) {
            addCriterion("project_end >=", value, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndLessThan(Date value) {
            addCriterion("project_end <", value, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndLessThanOrEqualTo(Date value) {
            addCriterion("project_end <=", value, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndIn(List<Date> values) {
            addCriterion("project_end in", values, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndNotIn(List<Date> values) {
            addCriterion("project_end not in", values, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndBetween(Date value1, Date value2) {
            addCriterion("project_end between", value1, value2, "projectEnd");
            return (Criteria) this;
        }

        public Criteria andProjectEndNotBetween(Date value1, Date value2) {
            addCriterion("project_end not between", value1, value2, "projectEnd");
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

        public Criteria andStateHistoryIsNull() {
            addCriterion("state_history is null");
            return (Criteria) this;
        }

        public Criteria andStateHistoryIsNotNull() {
            addCriterion("state_history is not null");
            return (Criteria) this;
        }

        public Criteria andStateHistoryEqualTo(String value) {
            addCriterion("state_history =", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryNotEqualTo(String value) {
            addCriterion("state_history <>", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryGreaterThan(String value) {
            addCriterion("state_history >", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("state_history >=", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryLessThan(String value) {
            addCriterion("state_history <", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryLessThanOrEqualTo(String value) {
            addCriterion("state_history <=", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryLike(String value) {
            addCriterion("state_history like", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryNotLike(String value) {
            addCriterion("state_history not like", value, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryIn(List<String> values) {
            addCriterion("state_history in", values, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryNotIn(List<String> values) {
            addCriterion("state_history not in", values, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryBetween(String value1, String value2) {
            addCriterion("state_history between", value1, value2, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andStateHistoryNotBetween(String value1, String value2) {
            addCriterion("state_history not between", value1, value2, "stateHistory");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeIsNull() {
            addCriterion("international_trade is null");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeIsNotNull() {
            addCriterion("international_trade is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeEqualTo(Integer value) {
            addCriterion("international_trade =", value, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeNotEqualTo(Integer value) {
            addCriterion("international_trade <>", value, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeGreaterThan(Integer value) {
            addCriterion("international_trade >", value, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("international_trade >=", value, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeLessThan(Integer value) {
            addCriterion("international_trade <", value, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeLessThanOrEqualTo(Integer value) {
            addCriterion("international_trade <=", value, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeIn(List<Integer> values) {
            addCriterion("international_trade in", values, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeNotIn(List<Integer> values) {
            addCriterion("international_trade not in", values, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeBetween(Integer value1, Integer value2) {
            addCriterion("international_trade between", value1, value2, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andInternationalTradeNotBetween(Integer value1, Integer value2) {
            addCriterion("international_trade not between", value1, value2, "internationalTrade");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeIsNull() {
            addCriterion("project_tran_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeIsNotNull() {
            addCriterion("project_tran_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeEqualTo(Integer value) {
            addCriterion("project_tran_type =", value, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeNotEqualTo(Integer value) {
            addCriterion("project_tran_type <>", value, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeGreaterThan(Integer value) {
            addCriterion("project_tran_type >", value, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_tran_type >=", value, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeLessThan(Integer value) {
            addCriterion("project_tran_type <", value, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeLessThanOrEqualTo(Integer value) {
            addCriterion("project_tran_type <=", value, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeIn(List<Integer> values) {
            addCriterion("project_tran_type in", values, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeNotIn(List<Integer> values) {
            addCriterion("project_tran_type not in", values, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeBetween(Integer value1, Integer value2) {
            addCriterion("project_tran_type between", value1, value2, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectTranTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_tran_type not between", value1, value2, "projectTranType");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateIsNull() {
            addCriterion("project_alert_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateIsNotNull() {
            addCriterion("project_alert_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateEqualTo(Date value) {
            addCriterion("project_alert_date =", value, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateNotEqualTo(Date value) {
            addCriterion("project_alert_date <>", value, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateGreaterThan(Date value) {
            addCriterion("project_alert_date >", value, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_alert_date >=", value, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateLessThan(Date value) {
            addCriterion("project_alert_date <", value, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateLessThanOrEqualTo(Date value) {
            addCriterion("project_alert_date <=", value, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateIn(List<Date> values) {
            addCriterion("project_alert_date in", values, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateNotIn(List<Date> values) {
            addCriterion("project_alert_date not in", values, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateBetween(Date value1, Date value2) {
            addCriterion("project_alert_date between", value1, value2, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andProjectAlertDateNotBetween(Date value1, Date value2) {
            addCriterion("project_alert_date not between", value1, value2, "projectAlertDate");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionIsNull() {
            addCriterion("owner_region is null");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionIsNotNull() {
            addCriterion("owner_region is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionEqualTo(String value) {
            addCriterion("owner_region =", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionNotEqualTo(String value) {
            addCriterion("owner_region <>", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionGreaterThan(String value) {
            addCriterion("owner_region >", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionGreaterThanOrEqualTo(String value) {
            addCriterion("owner_region >=", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionLessThan(String value) {
            addCriterion("owner_region <", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionLessThanOrEqualTo(String value) {
            addCriterion("owner_region <=", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionLike(String value) {
            addCriterion("owner_region like", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionNotLike(String value) {
            addCriterion("owner_region not like", value, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionIn(List<String> values) {
            addCriterion("owner_region in", values, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionNotIn(List<String> values) {
            addCriterion("owner_region not in", values, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionBetween(String value1, String value2) {
            addCriterion("owner_region between", value1, value2, "ownerRegion");
            return (Criteria) this;
        }

        public Criteria andOwnerRegionNotBetween(String value1, String value2) {
            addCriterion("owner_region not between", value1, value2, "ownerRegion");
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

        public Criteria andSocialGroupPkIsNull() {
            addCriterion("social_group_pk is null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkIsNotNull() {
            addCriterion("social_group_pk is not null");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkEqualTo(Long value) {
            addCriterion("social_group_pk =", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkNotEqualTo(Long value) {
            addCriterion("social_group_pk <>", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkGreaterThan(Long value) {
            addCriterion("social_group_pk >", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkGreaterThanOrEqualTo(Long value) {
            addCriterion("social_group_pk >=", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkLessThan(Long value) {
            addCriterion("social_group_pk <", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkLessThanOrEqualTo(Long value) {
            addCriterion("social_group_pk <=", value, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkIn(List<Long> values) {
            addCriterion("social_group_pk in", values, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkNotIn(List<Long> values) {
            addCriterion("social_group_pk not in", values, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkBetween(Long value1, Long value2) {
            addCriterion("social_group_pk between", value1, value2, "socialGroupPk");
            return (Criteria) this;
        }

        public Criteria andSocialGroupPkNotBetween(Long value1, Long value2) {
            addCriterion("social_group_pk not between", value1, value2, "socialGroupPk");
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