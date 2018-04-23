package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblBid;
import com.education.tutor.db.domain.TblBidExample.Criteria;
import com.education.tutor.db.domain.TblBidExample.Criterion;
import com.education.tutor.db.domain.TblBidExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblBidSqlProvider {

    public String countByExample(TblBidExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("bid");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblBidExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("bid");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblBid record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("bid");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.VALUES("organization_id", "#{organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getBidTargetCategory() != null) {
            sql.VALUES("bid_target_category", "#{bidTargetCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getBidTargetName() != null) {
            sql.VALUES("bid_target_name", "#{bidTargetName,jdbcType=VARCHAR}");
        }
        
        if (record.getBidClueDesc() != null) {
            sql.VALUES("bid_clue_desc", "#{bidClueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBidLocation() != null) {
            sql.VALUES("bid_location", "#{bidLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getBidClueSource() != null) {
            sql.VALUES("bid_clue_source", "#{bidClueSource,jdbcType=SMALLINT}");
        }
        
        if (record.getBidClueOrg() != null) {
            sql.VALUES("bid_clue_org", "#{bidClueOrg,jdbcType=VARCHAR}");
        }
        
        if (record.getBidTranType() != null) {
            sql.VALUES("bid_tran_type", "#{bidTranType,jdbcType=SMALLINT}");
        }
        
        if (record.getBidProcedure() != null) {
            sql.VALUES("bid_procedure", "#{bidProcedure,jdbcType=VARCHAR}");
        }
        
        if (record.getBidNo() != null) {
            sql.VALUES("bid_no", "#{bidNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanReplyTime() != null) {
            sql.VALUES("plan_reply_time", "#{planReplyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScope() != null) {
            sql.VALUES("scope", "#{scope,jdbcType=INTEGER}");
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
        
        if (record.getBidSolutionRef() != null) {
            sql.VALUES("bid_solution_ref", "#{bidSolutionRef,jdbcType=VARCHAR}");
        }
        
        if (record.getBidExtraInfo() != null) {
            sql.VALUES("bid_extra_info", "#{bidExtraInfo,jdbcType=VARCHAR}");
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
        
        if (record.getOwnerRegion() != null) {
            sql.VALUES("owner_region", "#{ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("created_by", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblBidExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("bid_id");
        } else {
            sql.SELECT("bid_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("organization_id");
        sql.SELECT("bid_target_category");
        sql.SELECT("bid_target_name");
        sql.SELECT("bid_clue_desc");
        sql.SELECT("bid_location");
        sql.SELECT("bid_clue_source");
        sql.SELECT("bid_clue_org");
        sql.SELECT("bid_tran_type");
        sql.SELECT("bid_procedure");
        sql.SELECT("bid_no");
        sql.SELECT("plan_reply_time");
        sql.SELECT("scope");
        sql.SELECT("owner_dept");
        sql.SELECT("del_flag");
        sql.SELECT("status");
        sql.SELECT("state_history");
        sql.SELECT("bid_solution_ref");
        sql.SELECT("bid_extra_info");
        sql.SELECT("estimated_price_range");
        sql.SELECT("current_reword_amount");
        sql.SELECT("followed_by");
        sql.SELECT("contact_mobile");
        sql.SELECT("contact_email");
        sql.SELECT("owner_region");
        sql.SELECT("created_by");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("bid");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblBid record = (TblBid) parameter.get("record");
        TblBidExample example = (TblBidExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("bid");
        
        if (record.getBidId() != null) {
            sql.SET("bid_id = #{record.bidId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getBidTargetCategory() != null) {
            sql.SET("bid_target_category = #{record.bidTargetCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getBidTargetName() != null) {
            sql.SET("bid_target_name = #{record.bidTargetName,jdbcType=VARCHAR}");
        }
        
        if (record.getBidClueDesc() != null) {
            sql.SET("bid_clue_desc = #{record.bidClueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBidLocation() != null) {
            sql.SET("bid_location = #{record.bidLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getBidClueSource() != null) {
            sql.SET("bid_clue_source = #{record.bidClueSource,jdbcType=SMALLINT}");
        }
        
        if (record.getBidClueOrg() != null) {
            sql.SET("bid_clue_org = #{record.bidClueOrg,jdbcType=VARCHAR}");
        }
        
        if (record.getBidTranType() != null) {
            sql.SET("bid_tran_type = #{record.bidTranType,jdbcType=SMALLINT}");
        }
        
        if (record.getBidProcedure() != null) {
            sql.SET("bid_procedure = #{record.bidProcedure,jdbcType=VARCHAR}");
        }
        
        if (record.getBidNo() != null) {
            sql.SET("bid_no = #{record.bidNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanReplyTime() != null) {
            sql.SET("plan_reply_time = #{record.planReplyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScope() != null) {
            sql.SET("scope = #{record.scope,jdbcType=INTEGER}");
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
        
        if (record.getBidSolutionRef() != null) {
            sql.SET("bid_solution_ref = #{record.bidSolutionRef,jdbcType=VARCHAR}");
        }
        
        if (record.getBidExtraInfo() != null) {
            sql.SET("bid_extra_info = #{record.bidExtraInfo,jdbcType=VARCHAR}");
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
        
        if (record.getOwnerRegion() != null) {
            sql.SET("owner_region = #{record.ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("bid");
        
        sql.SET("bid_id = #{record.bidId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        sql.SET("bid_target_category = #{record.bidTargetCategory,jdbcType=VARCHAR}");
        sql.SET("bid_target_name = #{record.bidTargetName,jdbcType=VARCHAR}");
        sql.SET("bid_clue_desc = #{record.bidClueDesc,jdbcType=VARCHAR}");
        sql.SET("bid_location = #{record.bidLocation,jdbcType=VARCHAR}");
        sql.SET("bid_clue_source = #{record.bidClueSource,jdbcType=SMALLINT}");
        sql.SET("bid_clue_org = #{record.bidClueOrg,jdbcType=VARCHAR}");
        sql.SET("bid_tran_type = #{record.bidTranType,jdbcType=SMALLINT}");
        sql.SET("bid_procedure = #{record.bidProcedure,jdbcType=VARCHAR}");
        sql.SET("bid_no = #{record.bidNo,jdbcType=VARCHAR}");
        sql.SET("plan_reply_time = #{record.planReplyTime,jdbcType=TIMESTAMP}");
        sql.SET("scope = #{record.scope,jdbcType=INTEGER}");
        sql.SET("owner_dept = #{record.ownerDept,jdbcType=VARCHAR}");
        sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("state_history = #{record.stateHistory,jdbcType=VARCHAR}");
        sql.SET("bid_solution_ref = #{record.bidSolutionRef,jdbcType=VARCHAR}");
        sql.SET("bid_extra_info = #{record.bidExtraInfo,jdbcType=VARCHAR}");
        sql.SET("estimated_price_range = #{record.estimatedPriceRange,jdbcType=VARCHAR}");
        sql.SET("current_reword_amount = #{record.currentRewordAmount,jdbcType=INTEGER}");
        sql.SET("followed_by = #{record.followedBy,jdbcType=VARCHAR}");
        sql.SET("contact_mobile = #{record.contactMobile,jdbcType=VARCHAR}");
        sql.SET("contact_email = #{record.contactEmail,jdbcType=VARCHAR}");
        sql.SET("owner_region = #{record.ownerRegion,jdbcType=VARCHAR}");
        sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblBidExample example = (TblBidExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblBid record) {
        SQL sql = new SQL();
        sql.UPDATE("bid");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getBidTargetCategory() != null) {
            sql.SET("bid_target_category = #{bidTargetCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getBidTargetName() != null) {
            sql.SET("bid_target_name = #{bidTargetName,jdbcType=VARCHAR}");
        }
        
        if (record.getBidClueDesc() != null) {
            sql.SET("bid_clue_desc = #{bidClueDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBidLocation() != null) {
            sql.SET("bid_location = #{bidLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getBidClueSource() != null) {
            sql.SET("bid_clue_source = #{bidClueSource,jdbcType=SMALLINT}");
        }
        
        if (record.getBidClueOrg() != null) {
            sql.SET("bid_clue_org = #{bidClueOrg,jdbcType=VARCHAR}");
        }
        
        if (record.getBidTranType() != null) {
            sql.SET("bid_tran_type = #{bidTranType,jdbcType=SMALLINT}");
        }
        
        if (record.getBidProcedure() != null) {
            sql.SET("bid_procedure = #{bidProcedure,jdbcType=VARCHAR}");
        }
        
        if (record.getBidNo() != null) {
            sql.SET("bid_no = #{bidNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanReplyTime() != null) {
            sql.SET("plan_reply_time = #{planReplyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScope() != null) {
            sql.SET("scope = #{scope,jdbcType=INTEGER}");
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
        
        if (record.getBidSolutionRef() != null) {
            sql.SET("bid_solution_ref = #{bidSolutionRef,jdbcType=VARCHAR}");
        }
        
        if (record.getBidExtraInfo() != null) {
            sql.SET("bid_extra_info = #{bidExtraInfo,jdbcType=VARCHAR}");
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
        
        if (record.getOwnerRegion() != null) {
            sql.SET("owner_region = #{ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("bid_id = #{bidId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblBidExample example, boolean includeExamplePhrase) {
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