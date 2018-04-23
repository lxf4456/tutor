package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblQuota;
import com.education.tutor.db.domain.TblQuotaExample.Criteria;
import com.education.tutor.db.domain.TblQuotaExample.Criterion;
import com.education.tutor.db.domain.TblQuotaExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblQuotaSqlProvider {

    public String countByExample(TblQuotaExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("quota");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblQuotaExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("quota");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblQuota record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("quota");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.VALUES("organization_id", "#{organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getQuoteTargetCategory() != null) {
            sql.VALUES("quote_target_category", "#{quoteTargetCategory,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteTargetName() != null) {
            sql.VALUES("quote_target_name", "#{quoteTargetName,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteClueDesc() != null) {
            sql.VALUES("quote_clue_desc", "#{quoteClueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteLocation() != null) {
            sql.VALUES("quote_location", "#{quoteLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteClueSource() != null) {
            sql.VALUES("quote_clue_source", "#{quoteClueSource,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteClueOrg() != null) {
            sql.VALUES("quote_clue_org", "#{quoteClueOrg,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteTranType() != null) {
            sql.VALUES("quote_tran_type", "#{quoteTranType,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteProcedure() != null) {
            sql.VALUES("quote_procedure", "#{quoteProcedure,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteGeoLng() != null) {
            sql.VALUES("quote_geo_lng", "#{quoteGeoLng,jdbcType=DOUBLE}");
        }
        
        if (record.getQuoteGeoLat() != null) {
            sql.VALUES("quote_geo_lat", "#{quoteGeoLat,jdbcType=DOUBLE}");
        }
        
        if (record.getQuoteDocImg() != null) {
            sql.VALUES("quote_doc_img", "#{quoteDocImg,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteSolutionRef() != null) {
            sql.VALUES("quote_solution_ref", "#{quoteSolutionRef,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanReplyTime() != null) {
            sql.VALUES("plan_reply_time", "#{planReplyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScope() != null) {
            sql.VALUES("scope", "#{scope,jdbcType=INTEGER}");
        }
        
        if (record.getOwnerRegion() != null) {
            sql.VALUES("owner_region", "#{ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerDept() != null) {
            sql.VALUES("owner_dept", "#{ownerDept,jdbcType=VARCHAR}");
        }
        
        if (record.getDelFlag() != null) {
            sql.VALUES("del_flag", "#{delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getStateHistory() != null) {
            sql.VALUES("state_history", "#{stateHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getEstimatedPriceRange() != null) {
            sql.VALUES("estimated_price_range", "#{estimatedPriceRange,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentRewordAmount() != null) {
            sql.VALUES("current_reword_amount", "#{currentRewordAmount,jdbcType=INTEGER}");
        }
        
        if (record.getFollowedBy() != null) {
            sql.VALUES("followed_by", "#{followedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getContactMobile() != null) {
            sql.VALUES("contact_mobile", "#{contactMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getContactEmail() != null) {
            sql.VALUES("contact_email", "#{contactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getQuotaExtraInfo() != null) {
            sql.VALUES("quota_extra_info", "#{quotaExtraInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("created_by", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblQuotaExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("quota_id");
        } else {
            sql.SELECT("quota_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("organization_id");
        sql.SELECT("quote_target_category");
        sql.SELECT("quote_target_name");
        sql.SELECT("quote_clue_desc");
        sql.SELECT("quote_location");
        sql.SELECT("quote_clue_source");
        sql.SELECT("quote_clue_org");
        sql.SELECT("quote_tran_type");
        sql.SELECT("quote_procedure");
        sql.SELECT("quote_geo_lng");
        sql.SELECT("quote_geo_lat");
        sql.SELECT("quote_doc_img");
        sql.SELECT("quote_solution_ref");
        sql.SELECT("plan_reply_time");
        sql.SELECT("scope");
        sql.SELECT("owner_region");
        sql.SELECT("owner_dept");
        sql.SELECT("del_flag");
        sql.SELECT("status");
        sql.SELECT("state_history");
        sql.SELECT("estimated_price_range");
        sql.SELECT("current_reword_amount");
        sql.SELECT("followed_by");
        sql.SELECT("contact_mobile");
        sql.SELECT("contact_email");
        sql.SELECT("quota_extra_info");
        sql.SELECT("created_at");
        sql.SELECT("created_by");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("quota");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblQuota record = (TblQuota) parameter.get("record");
        TblQuotaExample example = (TblQuotaExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("quota");
        
        if (record.getQuotaId() != null) {
            sql.SET("quota_id = #{record.quotaId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getQuoteTargetCategory() != null) {
            sql.SET("quote_target_category = #{record.quoteTargetCategory,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteTargetName() != null) {
            sql.SET("quote_target_name = #{record.quoteTargetName,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteClueDesc() != null) {
            sql.SET("quote_clue_desc = #{record.quoteClueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteLocation() != null) {
            sql.SET("quote_location = #{record.quoteLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteClueSource() != null) {
            sql.SET("quote_clue_source = #{record.quoteClueSource,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteClueOrg() != null) {
            sql.SET("quote_clue_org = #{record.quoteClueOrg,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteTranType() != null) {
            sql.SET("quote_tran_type = #{record.quoteTranType,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteProcedure() != null) {
            sql.SET("quote_procedure = #{record.quoteProcedure,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteGeoLng() != null) {
            sql.SET("quote_geo_lng = #{record.quoteGeoLng,jdbcType=DOUBLE}");
        }
        
        if (record.getQuoteGeoLat() != null) {
            sql.SET("quote_geo_lat = #{record.quoteGeoLat,jdbcType=DOUBLE}");
        }
        
        if (record.getQuoteDocImg() != null) {
            sql.SET("quote_doc_img = #{record.quoteDocImg,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteSolutionRef() != null) {
            sql.SET("quote_solution_ref = #{record.quoteSolutionRef,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanReplyTime() != null) {
            sql.SET("plan_reply_time = #{record.planReplyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScope() != null) {
            sql.SET("scope = #{record.scope,jdbcType=INTEGER}");
        }
        
        if (record.getOwnerRegion() != null) {
            sql.SET("owner_region = #{record.ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerDept() != null) {
            sql.SET("owner_dept = #{record.ownerDept,jdbcType=VARCHAR}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getStateHistory() != null) {
            sql.SET("state_history = #{record.stateHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getEstimatedPriceRange() != null) {
            sql.SET("estimated_price_range = #{record.estimatedPriceRange,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentRewordAmount() != null) {
            sql.SET("current_reword_amount = #{record.currentRewordAmount,jdbcType=INTEGER}");
        }
        
        if (record.getFollowedBy() != null) {
            sql.SET("followed_by = #{record.followedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getContactMobile() != null) {
            sql.SET("contact_mobile = #{record.contactMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getContactEmail() != null) {
            sql.SET("contact_email = #{record.contactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getQuotaExtraInfo() != null) {
            sql.SET("quota_extra_info = #{record.quotaExtraInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("quota");
        
        sql.SET("quota_id = #{record.quotaId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        sql.SET("quote_target_category = #{record.quoteTargetCategory,jdbcType=SMALLINT}");
        sql.SET("quote_target_name = #{record.quoteTargetName,jdbcType=VARCHAR}");
        sql.SET("quote_clue_desc = #{record.quoteClueDesc,jdbcType=VARCHAR}");
        sql.SET("quote_location = #{record.quoteLocation,jdbcType=VARCHAR}");
        sql.SET("quote_clue_source = #{record.quoteClueSource,jdbcType=SMALLINT}");
        sql.SET("quote_clue_org = #{record.quoteClueOrg,jdbcType=VARCHAR}");
        sql.SET("quote_tran_type = #{record.quoteTranType,jdbcType=SMALLINT}");
        sql.SET("quote_procedure = #{record.quoteProcedure,jdbcType=VARCHAR}");
        sql.SET("quote_geo_lng = #{record.quoteGeoLng,jdbcType=DOUBLE}");
        sql.SET("quote_geo_lat = #{record.quoteGeoLat,jdbcType=DOUBLE}");
        sql.SET("quote_doc_img = #{record.quoteDocImg,jdbcType=VARCHAR}");
        sql.SET("quote_solution_ref = #{record.quoteSolutionRef,jdbcType=VARCHAR}");
        sql.SET("plan_reply_time = #{record.planReplyTime,jdbcType=TIMESTAMP}");
        sql.SET("scope = #{record.scope,jdbcType=INTEGER}");
        sql.SET("owner_region = #{record.ownerRegion,jdbcType=VARCHAR}");
        sql.SET("owner_dept = #{record.ownerDept,jdbcType=VARCHAR}");
        sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("state_history = #{record.stateHistory,jdbcType=VARCHAR}");
        sql.SET("estimated_price_range = #{record.estimatedPriceRange,jdbcType=VARCHAR}");
        sql.SET("current_reword_amount = #{record.currentRewordAmount,jdbcType=INTEGER}");
        sql.SET("followed_by = #{record.followedBy,jdbcType=VARCHAR}");
        sql.SET("contact_mobile = #{record.contactMobile,jdbcType=VARCHAR}");
        sql.SET("contact_email = #{record.contactEmail,jdbcType=VARCHAR}");
        sql.SET("quota_extra_info = #{record.quotaExtraInfo,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblQuotaExample example = (TblQuotaExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblQuota record) {
        SQL sql = new SQL();
        sql.UPDATE("quota");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getQuoteTargetCategory() != null) {
            sql.SET("quote_target_category = #{quoteTargetCategory,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteTargetName() != null) {
            sql.SET("quote_target_name = #{quoteTargetName,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteClueDesc() != null) {
            sql.SET("quote_clue_desc = #{quoteClueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteLocation() != null) {
            sql.SET("quote_location = #{quoteLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteClueSource() != null) {
            sql.SET("quote_clue_source = #{quoteClueSource,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteClueOrg() != null) {
            sql.SET("quote_clue_org = #{quoteClueOrg,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteTranType() != null) {
            sql.SET("quote_tran_type = #{quoteTranType,jdbcType=SMALLINT}");
        }
        
        if (record.getQuoteProcedure() != null) {
            sql.SET("quote_procedure = #{quoteProcedure,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteGeoLng() != null) {
            sql.SET("quote_geo_lng = #{quoteGeoLng,jdbcType=DOUBLE}");
        }
        
        if (record.getQuoteGeoLat() != null) {
            sql.SET("quote_geo_lat = #{quoteGeoLat,jdbcType=DOUBLE}");
        }
        
        if (record.getQuoteDocImg() != null) {
            sql.SET("quote_doc_img = #{quoteDocImg,jdbcType=VARCHAR}");
        }
        
        if (record.getQuoteSolutionRef() != null) {
            sql.SET("quote_solution_ref = #{quoteSolutionRef,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanReplyTime() != null) {
            sql.SET("plan_reply_time = #{planReplyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScope() != null) {
            sql.SET("scope = #{scope,jdbcType=INTEGER}");
        }
        
        if (record.getOwnerRegion() != null) {
            sql.SET("owner_region = #{ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerDept() != null) {
            sql.SET("owner_dept = #{ownerDept,jdbcType=VARCHAR}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getStateHistory() != null) {
            sql.SET("state_history = #{stateHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getEstimatedPriceRange() != null) {
            sql.SET("estimated_price_range = #{estimatedPriceRange,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentRewordAmount() != null) {
            sql.SET("current_reword_amount = #{currentRewordAmount,jdbcType=INTEGER}");
        }
        
        if (record.getFollowedBy() != null) {
            sql.SET("followed_by = #{followedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getContactMobile() != null) {
            sql.SET("contact_mobile = #{contactMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getContactEmail() != null) {
            sql.SET("contact_email = #{contactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getQuotaExtraInfo() != null) {
            sql.SET("quota_extra_info = #{quotaExtraInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("quota_id = #{quotaId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblQuotaExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}