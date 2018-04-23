package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblServerOrgInfo;
import com.education.tutor.db.domain.TblServerOrgInfoExample.Criteria;
import com.education.tutor.db.domain.TblServerOrgInfoExample.Criterion;
import com.education.tutor.db.domain.TblServerOrgInfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblServerOrgInfoSqlProvider {

    public String countByExample(TblServerOrgInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("server_org_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblServerOrgInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("server_org_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblServerOrgInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("server_org_info");
        
        if (record.getLogoUrl() != null) {
            sql.VALUES("logo_url", "#{logoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBusiness() != null) {
            sql.VALUES("business", "#{business,jdbcType=VARCHAR}");
        }
        
        if (record.getServerInfo() != null) {
            sql.VALUES("server_info", "#{serverInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getExpertInfo() != null) {
            sql.VALUES("expert_info", "#{expertInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getContactInformation() != null) {
            sql.VALUES("contact_information", "#{contactInformation,jdbcType=VARCHAR}");
        }
        
        if (record.getLocal() != null) {
            sql.VALUES("local", "#{local,jdbcType=VARCHAR}");
        }
        
        if (record.getLang() != null) {
            sql.VALUES("lang", "#{lang,jdbcType=VARCHAR}");
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
        
        if (record.getDataRegionId() != null) {
            sql.VALUES("data_region_id", "#{dataRegionId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblServerOrgInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("server_org_info_id");
        } else {
            sql.SELECT("server_org_info_id");
        }
        sql.SELECT("logo_url");
        sql.SELECT("business");
        sql.SELECT("server_info");
        sql.SELECT("expert_info");
        sql.SELECT("contact_information");
        sql.SELECT("local");
        sql.SELECT("lang");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.SELECT("data_region_id");
        sql.FROM("server_org_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblServerOrgInfo record = (TblServerOrgInfo) parameter.get("record");
        TblServerOrgInfoExample example = (TblServerOrgInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("server_org_info");
        
        if (record.getServerOrgInfoId() != null) {
            sql.SET("server_org_info_id = #{record.serverOrgInfoId,jdbcType=BIGINT}");
        }
        
        if (record.getLogoUrl() != null) {
            sql.SET("logo_url = #{record.logoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBusiness() != null) {
            sql.SET("business = #{record.business,jdbcType=VARCHAR}");
        }
        
        if (record.getServerInfo() != null) {
            sql.SET("server_info = #{record.serverInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getExpertInfo() != null) {
            sql.SET("expert_info = #{record.expertInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getContactInformation() != null) {
            sql.SET("contact_information = #{record.contactInformation,jdbcType=VARCHAR}");
        }
        
        if (record.getLocal() != null) {
            sql.SET("local = #{record.local,jdbcType=VARCHAR}");
        }
        
        if (record.getLang() != null) {
            sql.SET("lang = #{record.lang,jdbcType=VARCHAR}");
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
        
        if (record.getDataRegionId() != null) {
            sql.SET("data_region_id = #{record.dataRegionId,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("server_org_info");
        
        sql.SET("server_org_info_id = #{record.serverOrgInfoId,jdbcType=BIGINT}");
        sql.SET("logo_url = #{record.logoUrl,jdbcType=VARCHAR}");
        sql.SET("business = #{record.business,jdbcType=VARCHAR}");
        sql.SET("server_info = #{record.serverInfo,jdbcType=VARCHAR}");
        sql.SET("expert_info = #{record.expertInfo,jdbcType=VARCHAR}");
        sql.SET("contact_information = #{record.contactInformation,jdbcType=VARCHAR}");
        sql.SET("local = #{record.local,jdbcType=VARCHAR}");
        sql.SET("lang = #{record.lang,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("data_region_id = #{record.dataRegionId,jdbcType=INTEGER}");
        
        TblServerOrgInfoExample example = (TblServerOrgInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblServerOrgInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("server_org_info");
        
        if (record.getLogoUrl() != null) {
            sql.SET("logo_url = #{logoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBusiness() != null) {
            sql.SET("business = #{business,jdbcType=VARCHAR}");
        }
        
        if (record.getServerInfo() != null) {
            sql.SET("server_info = #{serverInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getExpertInfo() != null) {
            sql.SET("expert_info = #{expertInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getContactInformation() != null) {
            sql.SET("contact_information = #{contactInformation,jdbcType=VARCHAR}");
        }
        
        if (record.getLocal() != null) {
            sql.SET("local = #{local,jdbcType=VARCHAR}");
        }
        
        if (record.getLang() != null) {
            sql.SET("lang = #{lang,jdbcType=VARCHAR}");
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
        
        if (record.getDataRegionId() != null) {
            sql.SET("data_region_id = #{dataRegionId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("server_org_info_id = #{serverOrgInfoId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblServerOrgInfoExample example, boolean includeExamplePhrase) {
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