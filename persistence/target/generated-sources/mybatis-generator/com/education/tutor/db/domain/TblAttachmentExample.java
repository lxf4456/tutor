package com.education.tutor.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblAttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblAttachmentExample() {
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

        public Criteria andAttachmentIdIsNull() {
            addCriterion("attachment_id is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNotNull() {
            addCriterion("attachment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdEqualTo(Long value) {
            addCriterion("attachment_id =", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotEqualTo(Long value) {
            addCriterion("attachment_id <>", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThan(Long value) {
            addCriterion("attachment_id >", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("attachment_id >=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThan(Long value) {
            addCriterion("attachment_id <", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThanOrEqualTo(Long value) {
            addCriterion("attachment_id <=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIn(List<Long> values) {
            addCriterion("attachment_id in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotIn(List<Long> values) {
            addCriterion("attachment_id not in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdBetween(Long value1, Long value2) {
            addCriterion("attachment_id between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotBetween(Long value1, Long value2) {
            addCriterion("attachment_id not between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeIsNull() {
            addCriterion("attachment_type is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeIsNotNull() {
            addCriterion("attachment_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeEqualTo(Integer value) {
            addCriterion("attachment_type =", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeNotEqualTo(Integer value) {
            addCriterion("attachment_type <>", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeGreaterThan(Integer value) {
            addCriterion("attachment_type >", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("attachment_type >=", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeLessThan(Integer value) {
            addCriterion("attachment_type <", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("attachment_type <=", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeIn(List<Integer> values) {
            addCriterion("attachment_type in", values, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeNotIn(List<Integer> values) {
            addCriterion("attachment_type not in", values, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeBetween(Integer value1, Integer value2) {
            addCriterion("attachment_type between", value1, value2, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("attachment_type not between", value1, value2, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameIsNull() {
            addCriterion("original_filename is null");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameIsNotNull() {
            addCriterion("original_filename is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameEqualTo(String value) {
            addCriterion("original_filename =", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameNotEqualTo(String value) {
            addCriterion("original_filename <>", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameGreaterThan(String value) {
            addCriterion("original_filename >", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("original_filename >=", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameLessThan(String value) {
            addCriterion("original_filename <", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameLessThanOrEqualTo(String value) {
            addCriterion("original_filename <=", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameLike(String value) {
            addCriterion("original_filename like", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameNotLike(String value) {
            addCriterion("original_filename not like", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameIn(List<String> values) {
            addCriterion("original_filename in", values, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameNotIn(List<String> values) {
            addCriterion("original_filename not in", values, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameBetween(String value1, String value2) {
            addCriterion("original_filename between", value1, value2, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameNotBetween(String value1, String value2) {
            addCriterion("original_filename not between", value1, value2, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateIsNull() {
            addCriterion("attachment_state is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateIsNotNull() {
            addCriterion("attachment_state is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateEqualTo(Integer value) {
            addCriterion("attachment_state =", value, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateNotEqualTo(Integer value) {
            addCriterion("attachment_state <>", value, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateGreaterThan(Integer value) {
            addCriterion("attachment_state >", value, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("attachment_state >=", value, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateLessThan(Integer value) {
            addCriterion("attachment_state <", value, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateLessThanOrEqualTo(Integer value) {
            addCriterion("attachment_state <=", value, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateIn(List<Integer> values) {
            addCriterion("attachment_state in", values, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateNotIn(List<Integer> values) {
            addCriterion("attachment_state not in", values, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateBetween(Integer value1, Integer value2) {
            addCriterion("attachment_state between", value1, value2, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andAttachmentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("attachment_state not between", value1, value2, "attachmentState");
            return (Criteria) this;
        }

        public Criteria andMimeTypeIsNull() {
            addCriterion("mime_type is null");
            return (Criteria) this;
        }

        public Criteria andMimeTypeIsNotNull() {
            addCriterion("mime_type is not null");
            return (Criteria) this;
        }

        public Criteria andMimeTypeEqualTo(String value) {
            addCriterion("mime_type =", value, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeNotEqualTo(String value) {
            addCriterion("mime_type <>", value, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeGreaterThan(String value) {
            addCriterion("mime_type >", value, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mime_type >=", value, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeLessThan(String value) {
            addCriterion("mime_type <", value, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeLessThanOrEqualTo(String value) {
            addCriterion("mime_type <=", value, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeLike(String value) {
            addCriterion("mime_type like", value, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeNotLike(String value) {
            addCriterion("mime_type not like", value, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeIn(List<String> values) {
            addCriterion("mime_type in", values, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeNotIn(List<String> values) {
            addCriterion("mime_type not in", values, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeBetween(String value1, String value2) {
            addCriterion("mime_type between", value1, value2, "mimeType");
            return (Criteria) this;
        }

        public Criteria andMimeTypeNotBetween(String value1, String value2) {
            addCriterion("mime_type not between", value1, value2, "mimeType");
            return (Criteria) this;
        }

        public Criteria andUriRelativelIsNull() {
            addCriterion("uri_relativel is null");
            return (Criteria) this;
        }

        public Criteria andUriRelativelIsNotNull() {
            addCriterion("uri_relativel is not null");
            return (Criteria) this;
        }

        public Criteria andUriRelativelEqualTo(String value) {
            addCriterion("uri_relativel =", value, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelNotEqualTo(String value) {
            addCriterion("uri_relativel <>", value, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelGreaterThan(String value) {
            addCriterion("uri_relativel >", value, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelGreaterThanOrEqualTo(String value) {
            addCriterion("uri_relativel >=", value, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelLessThan(String value) {
            addCriterion("uri_relativel <", value, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelLessThanOrEqualTo(String value) {
            addCriterion("uri_relativel <=", value, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelLike(String value) {
            addCriterion("uri_relativel like", value, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelNotLike(String value) {
            addCriterion("uri_relativel not like", value, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelIn(List<String> values) {
            addCriterion("uri_relativel in", values, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelNotIn(List<String> values) {
            addCriterion("uri_relativel not in", values, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelBetween(String value1, String value2) {
            addCriterion("uri_relativel between", value1, value2, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriRelativelNotBetween(String value1, String value2) {
            addCriterion("uri_relativel not between", value1, value2, "uriRelativel");
            return (Criteria) this;
        }

        public Criteria andUriSiteIsNull() {
            addCriterion("uri_site is null");
            return (Criteria) this;
        }

        public Criteria andUriSiteIsNotNull() {
            addCriterion("uri_site is not null");
            return (Criteria) this;
        }

        public Criteria andUriSiteEqualTo(String value) {
            addCriterion("uri_site =", value, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteNotEqualTo(String value) {
            addCriterion("uri_site <>", value, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteGreaterThan(String value) {
            addCriterion("uri_site >", value, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteGreaterThanOrEqualTo(String value) {
            addCriterion("uri_site >=", value, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteLessThan(String value) {
            addCriterion("uri_site <", value, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteLessThanOrEqualTo(String value) {
            addCriterion("uri_site <=", value, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteLike(String value) {
            addCriterion("uri_site like", value, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteNotLike(String value) {
            addCriterion("uri_site not like", value, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteIn(List<String> values) {
            addCriterion("uri_site in", values, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteNotIn(List<String> values) {
            addCriterion("uri_site not in", values, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteBetween(String value1, String value2) {
            addCriterion("uri_site between", value1, value2, "uriSite");
            return (Criteria) this;
        }

        public Criteria andUriSiteNotBetween(String value1, String value2) {
            addCriterion("uri_site not between", value1, value2, "uriSite");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Long value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Long value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Long value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Long value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Long value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Long> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Long> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Long value1, Long value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Long value1, Long value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andMetaInfoIsNull() {
            addCriterion("meta_info is null");
            return (Criteria) this;
        }

        public Criteria andMetaInfoIsNotNull() {
            addCriterion("meta_info is not null");
            return (Criteria) this;
        }

        public Criteria andMetaInfoEqualTo(String value) {
            addCriterion("meta_info =", value, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoNotEqualTo(String value) {
            addCriterion("meta_info <>", value, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoGreaterThan(String value) {
            addCriterion("meta_info >", value, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("meta_info >=", value, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoLessThan(String value) {
            addCriterion("meta_info <", value, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoLessThanOrEqualTo(String value) {
            addCriterion("meta_info <=", value, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoLike(String value) {
            addCriterion("meta_info like", value, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoNotLike(String value) {
            addCriterion("meta_info not like", value, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoIn(List<String> values) {
            addCriterion("meta_info in", values, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoNotIn(List<String> values) {
            addCriterion("meta_info not in", values, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoBetween(String value1, String value2) {
            addCriterion("meta_info between", value1, value2, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andMetaInfoNotBetween(String value1, String value2) {
            addCriterion("meta_info not between", value1, value2, "metaInfo");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNull() {
            addCriterion("owner_type is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNotNull() {
            addCriterion("owner_type is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeEqualTo(Integer value) {
            addCriterion("owner_type =", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotEqualTo(Integer value) {
            addCriterion("owner_type <>", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThan(Integer value) {
            addCriterion("owner_type >", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_type >=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThan(Integer value) {
            addCriterion("owner_type <", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("owner_type <=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIn(List<Integer> values) {
            addCriterion("owner_type in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotIn(List<Integer> values) {
            addCriterion("owner_type not in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeBetween(Integer value1, Integer value2) {
            addCriterion("owner_type between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_type not between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerPkIsNull() {
            addCriterion("owner_pk is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPkIsNotNull() {
            addCriterion("owner_pk is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPkEqualTo(Long value) {
            addCriterion("owner_pk =", value, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkNotEqualTo(Long value) {
            addCriterion("owner_pk <>", value, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkGreaterThan(Long value) {
            addCriterion("owner_pk >", value, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkGreaterThanOrEqualTo(Long value) {
            addCriterion("owner_pk >=", value, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkLessThan(Long value) {
            addCriterion("owner_pk <", value, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkLessThanOrEqualTo(Long value) {
            addCriterion("owner_pk <=", value, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkIn(List<Long> values) {
            addCriterion("owner_pk in", values, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkNotIn(List<Long> values) {
            addCriterion("owner_pk not in", values, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkBetween(Long value1, Long value2) {
            addCriterion("owner_pk between", value1, value2, "ownerPk");
            return (Criteria) this;
        }

        public Criteria andOwnerPkNotBetween(Long value1, Long value2) {
            addCriterion("owner_pk not between", value1, value2, "ownerPk");
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