package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblProject;
import com.education.tutor.db.domain.TblProjectExample.Criteria;
import com.education.tutor.db.domain.TblProjectExample.Criterion;
import com.education.tutor.db.domain.TblProjectExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblProjectSqlProvider {

    public String countByExample(TblProjectExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("project");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblProjectExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("project");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblProject record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("project");
        
        if (record.getProjectDesc() != null) {
            sql.VALUES("project_desc", "#{projectDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNo() != null) {
            sql.VALUES("project_no", "#{projectNo,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectName() != null) {
            sql.VALUES("project_name", "#{projectName,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectOrgArea() != null) {
            sql.VALUES("project_org_area", "#{projectOrgArea,jdbcType=VARCHAR}");
        }
        
        if (record.getSourceType() != null) {
            sql.VALUES("source_type", "#{sourceType,jdbcType=INTEGER}");
        }
        
        if (record.getSourcePk() != null) {
            sql.VALUES("source_pk", "#{sourcePk,jdbcType=BIGINT}");
        }
        
        if (record.getSourceNo() != null) {
            sql.VALUES("source_no", "#{sourceNo,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectResult() != null) {
            sql.VALUES("project_result", "#{projectResult,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectStep() != null) {
            sql.VALUES("project_step", "#{projectStep,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectOwner() != null) {
            sql.VALUES("project_owner", "#{projectOwner,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectManager() != null) {
            sql.VALUES("project_manager", "#{projectManager,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectTemp() != null) {
            sql.VALUES("project_temp", "#{projectTemp,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectBidUrl() != null) {
            sql.VALUES("project_bid_url", "#{projectBidUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectSupplyUrl() != null) {
            sql.VALUES("project_supply_url", "#{projectSupplyUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectQuotaUrl() != null) {
            sql.VALUES("project_quota_url", "#{projectQuotaUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectContractUrl() != null) {
            sql.VALUES("project_contract_url", "#{projectContractUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectType() != null) {
            sql.VALUES("project_type", "#{projectType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectStart() != null) {
            sql.VALUES("project_start", "#{projectStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProjectEnd() != null) {
            sql.VALUES("project_end", "#{projectEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getStateHistory() != null) {
            sql.VALUES("state_history", "#{stateHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getInternationalTrade() != null) {
            sql.VALUES("international_trade", "#{internationalTrade,jdbcType=INTEGER}");
        }
        
        if (record.getProjectTranType() != null) {
            sql.VALUES("project_tran_type", "#{projectTranType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectAlertDate() != null) {
            sql.VALUES("project_alert_date", "#{projectAlertDate,jdbcType=TIMESTAMP}");
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
        
        if (record.getSocialGroupPk() != null) {
            sql.VALUES("social_group_pk", "#{socialGroupPk,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            sql.VALUES("del_flag", "#{delFlag,jdbcType=SMALLINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblProjectExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("project_id");
        } else {
            sql.SELECT("project_id");
        }
        sql.SELECT("project_desc");
        sql.SELECT("project_no");
        sql.SELECT("project_name");
        sql.SELECT("project_org_area");
        sql.SELECT("source_type");
        sql.SELECT("source_pk");
        sql.SELECT("source_no");
        sql.SELECT("project_result");
        sql.SELECT("project_step");
        sql.SELECT("project_owner");
        sql.SELECT("project_manager");
        sql.SELECT("project_temp");
        sql.SELECT("project_bid_url");
        sql.SELECT("project_supply_url");
        sql.SELECT("project_quota_url");
        sql.SELECT("project_contract_url");
        sql.SELECT("project_type");
        sql.SELECT("project_start");
        sql.SELECT("project_end");
        sql.SELECT("status");
        sql.SELECT("state_history");
        sql.SELECT("international_trade");
        sql.SELECT("project_tran_type");
        sql.SELECT("project_alert_date");
        sql.SELECT("owner_region");
        sql.SELECT("created_by");
        sql.SELECT("created_at");
        sql.SELECT("social_group_pk");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.SELECT("del_flag");
        sql.FROM("project");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblProject record = (TblProject) parameter.get("record");
        TblProjectExample example = (TblProjectExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("project");
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectDesc() != null) {
            sql.SET("project_desc = #{record.projectDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNo() != null) {
            sql.SET("project_no = #{record.projectNo,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectName() != null) {
            sql.SET("project_name = #{record.projectName,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectOrgArea() != null) {
            sql.SET("project_org_area = #{record.projectOrgArea,jdbcType=VARCHAR}");
        }
        
        if (record.getSourceType() != null) {
            sql.SET("source_type = #{record.sourceType,jdbcType=INTEGER}");
        }
        
        if (record.getSourcePk() != null) {
            sql.SET("source_pk = #{record.sourcePk,jdbcType=BIGINT}");
        }
        
        if (record.getSourceNo() != null) {
            sql.SET("source_no = #{record.sourceNo,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectResult() != null) {
            sql.SET("project_result = #{record.projectResult,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectStep() != null) {
            sql.SET("project_step = #{record.projectStep,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectOwner() != null) {
            sql.SET("project_owner = #{record.projectOwner,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectManager() != null) {
            sql.SET("project_manager = #{record.projectManager,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectTemp() != null) {
            sql.SET("project_temp = #{record.projectTemp,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectBidUrl() != null) {
            sql.SET("project_bid_url = #{record.projectBidUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectSupplyUrl() != null) {
            sql.SET("project_supply_url = #{record.projectSupplyUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectQuotaUrl() != null) {
            sql.SET("project_quota_url = #{record.projectQuotaUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectContractUrl() != null) {
            sql.SET("project_contract_url = #{record.projectContractUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectType() != null) {
            sql.SET("project_type = #{record.projectType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectStart() != null) {
            sql.SET("project_start = #{record.projectStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProjectEnd() != null) {
            sql.SET("project_end = #{record.projectEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getStateHistory() != null) {
            sql.SET("state_history = #{record.stateHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getInternationalTrade() != null) {
            sql.SET("international_trade = #{record.internationalTrade,jdbcType=INTEGER}");
        }
        
        if (record.getProjectTranType() != null) {
            sql.SET("project_tran_type = #{record.projectTranType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectAlertDate() != null) {
            sql.SET("project_alert_date = #{record.projectAlertDate,jdbcType=TIMESTAMP}");
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
        
        if (record.getSocialGroupPk() != null) {
            sql.SET("social_group_pk = #{record.socialGroupPk,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("project");
        
        sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        sql.SET("project_desc = #{record.projectDesc,jdbcType=VARCHAR}");
        sql.SET("project_no = #{record.projectNo,jdbcType=VARCHAR}");
        sql.SET("project_name = #{record.projectName,jdbcType=VARCHAR}");
        sql.SET("project_org_area = #{record.projectOrgArea,jdbcType=VARCHAR}");
        sql.SET("source_type = #{record.sourceType,jdbcType=INTEGER}");
        sql.SET("source_pk = #{record.sourcePk,jdbcType=BIGINT}");
        sql.SET("source_no = #{record.sourceNo,jdbcType=VARCHAR}");
        sql.SET("project_result = #{record.projectResult,jdbcType=VARCHAR}");
        sql.SET("project_step = #{record.projectStep,jdbcType=VARCHAR}");
        sql.SET("project_owner = #{record.projectOwner,jdbcType=VARCHAR}");
        sql.SET("project_manager = #{record.projectManager,jdbcType=VARCHAR}");
        sql.SET("project_temp = #{record.projectTemp,jdbcType=VARCHAR}");
        sql.SET("project_bid_url = #{record.projectBidUrl,jdbcType=VARCHAR}");
        sql.SET("project_supply_url = #{record.projectSupplyUrl,jdbcType=VARCHAR}");
        sql.SET("project_quota_url = #{record.projectQuotaUrl,jdbcType=VARCHAR}");
        sql.SET("project_contract_url = #{record.projectContractUrl,jdbcType=VARCHAR}");
        sql.SET("project_type = #{record.projectType,jdbcType=INTEGER}");
        sql.SET("project_start = #{record.projectStart,jdbcType=TIMESTAMP}");
        sql.SET("project_end = #{record.projectEnd,jdbcType=TIMESTAMP}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("state_history = #{record.stateHistory,jdbcType=VARCHAR}");
        sql.SET("international_trade = #{record.internationalTrade,jdbcType=INTEGER}");
        sql.SET("project_tran_type = #{record.projectTranType,jdbcType=INTEGER}");
        sql.SET("project_alert_date = #{record.projectAlertDate,jdbcType=TIMESTAMP}");
        sql.SET("owner_region = #{record.ownerRegion,jdbcType=VARCHAR}");
        sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("social_group_pk = #{record.socialGroupPk,jdbcType=BIGINT}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        
        TblProjectExample example = (TblProjectExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblProject record) {
        SQL sql = new SQL();
        sql.UPDATE("project");
        
        if (record.getProjectDesc() != null) {
            sql.SET("project_desc = #{projectDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNo() != null) {
            sql.SET("project_no = #{projectNo,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectName() != null) {
            sql.SET("project_name = #{projectName,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectOrgArea() != null) {
            sql.SET("project_org_area = #{projectOrgArea,jdbcType=VARCHAR}");
        }
        
        if (record.getSourceType() != null) {
            sql.SET("source_type = #{sourceType,jdbcType=INTEGER}");
        }
        
        if (record.getSourcePk() != null) {
            sql.SET("source_pk = #{sourcePk,jdbcType=BIGINT}");
        }
        
        if (record.getSourceNo() != null) {
            sql.SET("source_no = #{sourceNo,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectResult() != null) {
            sql.SET("project_result = #{projectResult,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectStep() != null) {
            sql.SET("project_step = #{projectStep,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectOwner() != null) {
            sql.SET("project_owner = #{projectOwner,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectManager() != null) {
            sql.SET("project_manager = #{projectManager,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectTemp() != null) {
            sql.SET("project_temp = #{projectTemp,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectBidUrl() != null) {
            sql.SET("project_bid_url = #{projectBidUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectSupplyUrl() != null) {
            sql.SET("project_supply_url = #{projectSupplyUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectQuotaUrl() != null) {
            sql.SET("project_quota_url = #{projectQuotaUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectContractUrl() != null) {
            sql.SET("project_contract_url = #{projectContractUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectType() != null) {
            sql.SET("project_type = #{projectType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectStart() != null) {
            sql.SET("project_start = #{projectStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProjectEnd() != null) {
            sql.SET("project_end = #{projectEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getStateHistory() != null) {
            sql.SET("state_history = #{stateHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getInternationalTrade() != null) {
            sql.SET("international_trade = #{internationalTrade,jdbcType=INTEGER}");
        }
        
        if (record.getProjectTranType() != null) {
            sql.SET("project_tran_type = #{projectTranType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectAlertDate() != null) {
            sql.SET("project_alert_date = #{projectAlertDate,jdbcType=TIMESTAMP}");
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
        
        if (record.getSocialGroupPk() != null) {
            sql.SET("social_group_pk = #{socialGroupPk,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{delFlag,jdbcType=SMALLINT}");
        }
        
        sql.WHERE("project_id = #{projectId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblProjectExample example, boolean includeExamplePhrase) {
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