package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.List;

public class TblAppVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblAppVersionExample() {
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

        public Criteria andAppVersionIdIsNull() {
            addCriterion("app_version_id is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdIsNotNull() {
            addCriterion("app_version_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdEqualTo(Long value) {
            addCriterion("app_version_id =", value, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdNotEqualTo(Long value) {
            addCriterion("app_version_id <>", value, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdGreaterThan(Long value) {
            addCriterion("app_version_id >", value, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_version_id >=", value, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdLessThan(Long value) {
            addCriterion("app_version_id <", value, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdLessThanOrEqualTo(Long value) {
            addCriterion("app_version_id <=", value, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdIn(List<Long> values) {
            addCriterion("app_version_id in", values, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdNotIn(List<Long> values) {
            addCriterion("app_version_id not in", values, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdBetween(Long value1, Long value2) {
            addCriterion("app_version_id between", value1, value2, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIdNotBetween(Long value1, Long value2) {
            addCriterion("app_version_id not between", value1, value2, "appVersionId");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoIsNull() {
            addCriterion("app_version_no is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoIsNotNull() {
            addCriterion("app_version_no is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoEqualTo(String value) {
            addCriterion("app_version_no =", value, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoNotEqualTo(String value) {
            addCriterion("app_version_no <>", value, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoGreaterThan(String value) {
            addCriterion("app_version_no >", value, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoGreaterThanOrEqualTo(String value) {
            addCriterion("app_version_no >=", value, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoLessThan(String value) {
            addCriterion("app_version_no <", value, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoLessThanOrEqualTo(String value) {
            addCriterion("app_version_no <=", value, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoLike(String value) {
            addCriterion("app_version_no like", value, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoNotLike(String value) {
            addCriterion("app_version_no not like", value, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoIn(List<String> values) {
            addCriterion("app_version_no in", values, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoNotIn(List<String> values) {
            addCriterion("app_version_no not in", values, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoBetween(String value1, String value2) {
            addCriterion("app_version_no between", value1, value2, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionNoNotBetween(String value1, String value2) {
            addCriterion("app_version_no not between", value1, value2, "appVersionNo");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagIsNull() {
            addCriterion("app_version_tag is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagIsNotNull() {
            addCriterion("app_version_tag is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagEqualTo(String value) {
            addCriterion("app_version_tag =", value, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagNotEqualTo(String value) {
            addCriterion("app_version_tag <>", value, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagGreaterThan(String value) {
            addCriterion("app_version_tag >", value, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagGreaterThanOrEqualTo(String value) {
            addCriterion("app_version_tag >=", value, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagLessThan(String value) {
            addCriterion("app_version_tag <", value, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagLessThanOrEqualTo(String value) {
            addCriterion("app_version_tag <=", value, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagLike(String value) {
            addCriterion("app_version_tag like", value, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagNotLike(String value) {
            addCriterion("app_version_tag not like", value, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagIn(List<String> values) {
            addCriterion("app_version_tag in", values, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagNotIn(List<String> values) {
            addCriterion("app_version_tag not in", values, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagBetween(String value1, String value2) {
            addCriterion("app_version_tag between", value1, value2, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionTagNotBetween(String value1, String value2) {
            addCriterion("app_version_tag not between", value1, value2, "appVersionTag");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescIsNull() {
            addCriterion("app_version_desc is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescIsNotNull() {
            addCriterion("app_version_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescEqualTo(String value) {
            addCriterion("app_version_desc =", value, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescNotEqualTo(String value) {
            addCriterion("app_version_desc <>", value, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescGreaterThan(String value) {
            addCriterion("app_version_desc >", value, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescGreaterThanOrEqualTo(String value) {
            addCriterion("app_version_desc >=", value, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescLessThan(String value) {
            addCriterion("app_version_desc <", value, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescLessThanOrEqualTo(String value) {
            addCriterion("app_version_desc <=", value, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescLike(String value) {
            addCriterion("app_version_desc like", value, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescNotLike(String value) {
            addCriterion("app_version_desc not like", value, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescIn(List<String> values) {
            addCriterion("app_version_desc in", values, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescNotIn(List<String> values) {
            addCriterion("app_version_desc not in", values, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescBetween(String value1, String value2) {
            addCriterion("app_version_desc between", value1, value2, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescNotBetween(String value1, String value2) {
            addCriterion("app_version_desc not between", value1, value2, "appVersionDesc");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoIsNull() {
            addCriterion("app_android_os_no is null");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoIsNotNull() {
            addCriterion("app_android_os_no is not null");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoEqualTo(String value) {
            addCriterion("app_android_os_no =", value, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoNotEqualTo(String value) {
            addCriterion("app_android_os_no <>", value, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoGreaterThan(String value) {
            addCriterion("app_android_os_no >", value, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("app_android_os_no >=", value, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoLessThan(String value) {
            addCriterion("app_android_os_no <", value, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoLessThanOrEqualTo(String value) {
            addCriterion("app_android_os_no <=", value, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoLike(String value) {
            addCriterion("app_android_os_no like", value, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoNotLike(String value) {
            addCriterion("app_android_os_no not like", value, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoIn(List<String> values) {
            addCriterion("app_android_os_no in", values, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoNotIn(List<String> values) {
            addCriterion("app_android_os_no not in", values, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoBetween(String value1, String value2) {
            addCriterion("app_android_os_no between", value1, value2, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidOsNoNotBetween(String value1, String value2) {
            addCriterion("app_android_os_no not between", value1, value2, "appAndroidOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoIsNull() {
            addCriterion("app_ios_os_no is null");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoIsNotNull() {
            addCriterion("app_ios_os_no is not null");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoEqualTo(String value) {
            addCriterion("app_ios_os_no =", value, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoNotEqualTo(String value) {
            addCriterion("app_ios_os_no <>", value, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoGreaterThan(String value) {
            addCriterion("app_ios_os_no >", value, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("app_ios_os_no >=", value, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoLessThan(String value) {
            addCriterion("app_ios_os_no <", value, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoLessThanOrEqualTo(String value) {
            addCriterion("app_ios_os_no <=", value, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoLike(String value) {
            addCriterion("app_ios_os_no like", value, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoNotLike(String value) {
            addCriterion("app_ios_os_no not like", value, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoIn(List<String> values) {
            addCriterion("app_ios_os_no in", values, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoNotIn(List<String> values) {
            addCriterion("app_ios_os_no not in", values, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoBetween(String value1, String value2) {
            addCriterion("app_ios_os_no between", value1, value2, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppIosOsNoNotBetween(String value1, String value2) {
            addCriterion("app_ios_os_no not between", value1, value2, "appIosOsNo");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteIsNull() {
            addCriterion("app_android_release_note is null");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteIsNotNull() {
            addCriterion("app_android_release_note is not null");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteEqualTo(String value) {
            addCriterion("app_android_release_note =", value, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteNotEqualTo(String value) {
            addCriterion("app_android_release_note <>", value, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteGreaterThan(String value) {
            addCriterion("app_android_release_note >", value, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("app_android_release_note >=", value, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteLessThan(String value) {
            addCriterion("app_android_release_note <", value, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteLessThanOrEqualTo(String value) {
            addCriterion("app_android_release_note <=", value, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteLike(String value) {
            addCriterion("app_android_release_note like", value, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteNotLike(String value) {
            addCriterion("app_android_release_note not like", value, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteIn(List<String> values) {
            addCriterion("app_android_release_note in", values, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteNotIn(List<String> values) {
            addCriterion("app_android_release_note not in", values, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteBetween(String value1, String value2) {
            addCriterion("app_android_release_note between", value1, value2, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReleaseNoteNotBetween(String value1, String value2) {
            addCriterion("app_android_release_note not between", value1, value2, "appAndroidReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteIsNull() {
            addCriterion("app_ios_release_note is null");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteIsNotNull() {
            addCriterion("app_ios_release_note is not null");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteEqualTo(String value) {
            addCriterion("app_ios_release_note =", value, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteNotEqualTo(String value) {
            addCriterion("app_ios_release_note <>", value, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteGreaterThan(String value) {
            addCriterion("app_ios_release_note >", value, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("app_ios_release_note >=", value, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteLessThan(String value) {
            addCriterion("app_ios_release_note <", value, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteLessThanOrEqualTo(String value) {
            addCriterion("app_ios_release_note <=", value, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteLike(String value) {
            addCriterion("app_ios_release_note like", value, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteNotLike(String value) {
            addCriterion("app_ios_release_note not like", value, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteIn(List<String> values) {
            addCriterion("app_ios_release_note in", values, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteNotIn(List<String> values) {
            addCriterion("app_ios_release_note not in", values, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteBetween(String value1, String value2) {
            addCriterion("app_ios_release_note between", value1, value2, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppIosReleaseNoteNotBetween(String value1, String value2) {
            addCriterion("app_ios_release_note not between", value1, value2, "appIosReleaseNote");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqIsNull() {
            addCriterion("app_android_req is null");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqIsNotNull() {
            addCriterion("app_android_req is not null");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqEqualTo(String value) {
            addCriterion("app_android_req =", value, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqNotEqualTo(String value) {
            addCriterion("app_android_req <>", value, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqGreaterThan(String value) {
            addCriterion("app_android_req >", value, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqGreaterThanOrEqualTo(String value) {
            addCriterion("app_android_req >=", value, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqLessThan(String value) {
            addCriterion("app_android_req <", value, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqLessThanOrEqualTo(String value) {
            addCriterion("app_android_req <=", value, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqLike(String value) {
            addCriterion("app_android_req like", value, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqNotLike(String value) {
            addCriterion("app_android_req not like", value, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqIn(List<String> values) {
            addCriterion("app_android_req in", values, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqNotIn(List<String> values) {
            addCriterion("app_android_req not in", values, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqBetween(String value1, String value2) {
            addCriterion("app_android_req between", value1, value2, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidReqNotBetween(String value1, String value2) {
            addCriterion("app_android_req not between", value1, value2, "appAndroidReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqIsNull() {
            addCriterion("app_ios_req is null");
            return (Criteria) this;
        }

        public Criteria andAppIosReqIsNotNull() {
            addCriterion("app_ios_req is not null");
            return (Criteria) this;
        }

        public Criteria andAppIosReqEqualTo(String value) {
            addCriterion("app_ios_req =", value, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqNotEqualTo(String value) {
            addCriterion("app_ios_req <>", value, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqGreaterThan(String value) {
            addCriterion("app_ios_req >", value, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqGreaterThanOrEqualTo(String value) {
            addCriterion("app_ios_req >=", value, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqLessThan(String value) {
            addCriterion("app_ios_req <", value, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqLessThanOrEqualTo(String value) {
            addCriterion("app_ios_req <=", value, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqLike(String value) {
            addCriterion("app_ios_req like", value, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqNotLike(String value) {
            addCriterion("app_ios_req not like", value, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqIn(List<String> values) {
            addCriterion("app_ios_req in", values, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqNotIn(List<String> values) {
            addCriterion("app_ios_req not in", values, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqBetween(String value1, String value2) {
            addCriterion("app_ios_req between", value1, value2, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppIosReqNotBetween(String value1, String value2) {
            addCriterion("app_ios_req not between", value1, value2, "appIosReq");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlIsNull() {
            addCriterion("app_android_url is null");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlIsNotNull() {
            addCriterion("app_android_url is not null");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlEqualTo(String value) {
            addCriterion("app_android_url =", value, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlNotEqualTo(String value) {
            addCriterion("app_android_url <>", value, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlGreaterThan(String value) {
            addCriterion("app_android_url >", value, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlGreaterThanOrEqualTo(String value) {
            addCriterion("app_android_url >=", value, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlLessThan(String value) {
            addCriterion("app_android_url <", value, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlLessThanOrEqualTo(String value) {
            addCriterion("app_android_url <=", value, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlLike(String value) {
            addCriterion("app_android_url like", value, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlNotLike(String value) {
            addCriterion("app_android_url not like", value, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlIn(List<String> values) {
            addCriterion("app_android_url in", values, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlNotIn(List<String> values) {
            addCriterion("app_android_url not in", values, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlBetween(String value1, String value2) {
            addCriterion("app_android_url between", value1, value2, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppAndroidUrlNotBetween(String value1, String value2) {
            addCriterion("app_android_url not between", value1, value2, "appAndroidUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlIsNull() {
            addCriterion("app_ios_url is null");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlIsNotNull() {
            addCriterion("app_ios_url is not null");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlEqualTo(String value) {
            addCriterion("app_ios_url =", value, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlNotEqualTo(String value) {
            addCriterion("app_ios_url <>", value, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlGreaterThan(String value) {
            addCriterion("app_ios_url >", value, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlGreaterThanOrEqualTo(String value) {
            addCriterion("app_ios_url >=", value, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlLessThan(String value) {
            addCriterion("app_ios_url <", value, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlLessThanOrEqualTo(String value) {
            addCriterion("app_ios_url <=", value, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlLike(String value) {
            addCriterion("app_ios_url like", value, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlNotLike(String value) {
            addCriterion("app_ios_url not like", value, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlIn(List<String> values) {
            addCriterion("app_ios_url in", values, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlNotIn(List<String> values) {
            addCriterion("app_ios_url not in", values, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlBetween(String value1, String value2) {
            addCriterion("app_ios_url between", value1, value2, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAppIosUrlNotBetween(String value1, String value2) {
            addCriterion("app_ios_url not between", value1, value2, "appIosUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateIsNull() {
            addCriterion("android_force_update is null");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateIsNotNull() {
            addCriterion("android_force_update is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateEqualTo(Short value) {
            addCriterion("android_force_update =", value, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateNotEqualTo(Short value) {
            addCriterion("android_force_update <>", value, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateGreaterThan(Short value) {
            addCriterion("android_force_update >", value, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateGreaterThanOrEqualTo(Short value) {
            addCriterion("android_force_update >=", value, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateLessThan(Short value) {
            addCriterion("android_force_update <", value, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateLessThanOrEqualTo(Short value) {
            addCriterion("android_force_update <=", value, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateIn(List<Short> values) {
            addCriterion("android_force_update in", values, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateNotIn(List<Short> values) {
            addCriterion("android_force_update not in", values, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateBetween(Short value1, Short value2) {
            addCriterion("android_force_update between", value1, value2, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAndroidForceUpdateNotBetween(Short value1, Short value2) {
            addCriterion("android_force_update not between", value1, value2, "androidForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateIsNull() {
            addCriterion("ios_force_update is null");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateIsNotNull() {
            addCriterion("ios_force_update is not null");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateEqualTo(Short value) {
            addCriterion("ios_force_update =", value, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateNotEqualTo(Short value) {
            addCriterion("ios_force_update <>", value, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateGreaterThan(Short value) {
            addCriterion("ios_force_update >", value, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateGreaterThanOrEqualTo(Short value) {
            addCriterion("ios_force_update >=", value, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateLessThan(Short value) {
            addCriterion("ios_force_update <", value, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateLessThanOrEqualTo(Short value) {
            addCriterion("ios_force_update <=", value, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateIn(List<Short> values) {
            addCriterion("ios_force_update in", values, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateNotIn(List<Short> values) {
            addCriterion("ios_force_update not in", values, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateBetween(Short value1, Short value2) {
            addCriterion("ios_force_update between", value1, value2, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIosForceUpdateNotBetween(Short value1, Short value2) {
            addCriterion("ios_force_update not between", value1, value2, "iosForceUpdate");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhIsNull() {
            addCriterion("app_version_desc_zh is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhIsNotNull() {
            addCriterion("app_version_desc_zh is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhEqualTo(String value) {
            addCriterion("app_version_desc_zh =", value, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhNotEqualTo(String value) {
            addCriterion("app_version_desc_zh <>", value, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhGreaterThan(String value) {
            addCriterion("app_version_desc_zh >", value, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhGreaterThanOrEqualTo(String value) {
            addCriterion("app_version_desc_zh >=", value, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhLessThan(String value) {
            addCriterion("app_version_desc_zh <", value, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhLessThanOrEqualTo(String value) {
            addCriterion("app_version_desc_zh <=", value, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhLike(String value) {
            addCriterion("app_version_desc_zh like", value, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhNotLike(String value) {
            addCriterion("app_version_desc_zh not like", value, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhIn(List<String> values) {
            addCriterion("app_version_desc_zh in", values, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhNotIn(List<String> values) {
            addCriterion("app_version_desc_zh not in", values, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhBetween(String value1, String value2) {
            addCriterion("app_version_desc_zh between", value1, value2, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescZhNotBetween(String value1, String value2) {
            addCriterion("app_version_desc_zh not between", value1, value2, "appVersionDescZh");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuIsNull() {
            addCriterion("app_version_desc_ru is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuIsNotNull() {
            addCriterion("app_version_desc_ru is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuEqualTo(String value) {
            addCriterion("app_version_desc_ru =", value, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuNotEqualTo(String value) {
            addCriterion("app_version_desc_ru <>", value, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuGreaterThan(String value) {
            addCriterion("app_version_desc_ru >", value, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuGreaterThanOrEqualTo(String value) {
            addCriterion("app_version_desc_ru >=", value, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuLessThan(String value) {
            addCriterion("app_version_desc_ru <", value, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuLessThanOrEqualTo(String value) {
            addCriterion("app_version_desc_ru <=", value, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuLike(String value) {
            addCriterion("app_version_desc_ru like", value, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuNotLike(String value) {
            addCriterion("app_version_desc_ru not like", value, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuIn(List<String> values) {
            addCriterion("app_version_desc_ru in", values, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuNotIn(List<String> values) {
            addCriterion("app_version_desc_ru not in", values, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuBetween(String value1, String value2) {
            addCriterion("app_version_desc_ru between", value1, value2, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescRuNotBetween(String value1, String value2) {
            addCriterion("app_version_desc_ru not between", value1, value2, "appVersionDescRu");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpIsNull() {
            addCriterion("app_version_desc_sp is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpIsNotNull() {
            addCriterion("app_version_desc_sp is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpEqualTo(String value) {
            addCriterion("app_version_desc_sp =", value, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpNotEqualTo(String value) {
            addCriterion("app_version_desc_sp <>", value, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpGreaterThan(String value) {
            addCriterion("app_version_desc_sp >", value, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpGreaterThanOrEqualTo(String value) {
            addCriterion("app_version_desc_sp >=", value, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpLessThan(String value) {
            addCriterion("app_version_desc_sp <", value, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpLessThanOrEqualTo(String value) {
            addCriterion("app_version_desc_sp <=", value, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpLike(String value) {
            addCriterion("app_version_desc_sp like", value, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpNotLike(String value) {
            addCriterion("app_version_desc_sp not like", value, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpIn(List<String> values) {
            addCriterion("app_version_desc_sp in", values, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpNotIn(List<String> values) {
            addCriterion("app_version_desc_sp not in", values, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpBetween(String value1, String value2) {
            addCriterion("app_version_desc_sp between", value1, value2, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescSpNotBetween(String value1, String value2) {
            addCriterion("app_version_desc_sp not between", value1, value2, "appVersionDescSp");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrIsNull() {
            addCriterion("app_version_desc_fr is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrIsNotNull() {
            addCriterion("app_version_desc_fr is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrEqualTo(String value) {
            addCriterion("app_version_desc_fr =", value, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrNotEqualTo(String value) {
            addCriterion("app_version_desc_fr <>", value, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrGreaterThan(String value) {
            addCriterion("app_version_desc_fr >", value, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrGreaterThanOrEqualTo(String value) {
            addCriterion("app_version_desc_fr >=", value, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrLessThan(String value) {
            addCriterion("app_version_desc_fr <", value, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrLessThanOrEqualTo(String value) {
            addCriterion("app_version_desc_fr <=", value, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrLike(String value) {
            addCriterion("app_version_desc_fr like", value, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrNotLike(String value) {
            addCriterion("app_version_desc_fr not like", value, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrIn(List<String> values) {
            addCriterion("app_version_desc_fr in", values, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrNotIn(List<String> values) {
            addCriterion("app_version_desc_fr not in", values, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrBetween(String value1, String value2) {
            addCriterion("app_version_desc_fr between", value1, value2, "appVersionDescFr");
            return (Criteria) this;
        }

        public Criteria andAppVersionDescFrNotBetween(String value1, String value2) {
            addCriterion("app_version_desc_fr not between", value1, value2, "appVersionDescFr");
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