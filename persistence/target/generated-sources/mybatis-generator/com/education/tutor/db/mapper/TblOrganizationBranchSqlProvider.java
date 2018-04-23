package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblOrganizationBranch;
import com.education.tutor.db.domain.TblOrganizationBranchExample.Criteria;
import com.education.tutor.db.domain.TblOrganizationBranchExample.Criterion;
import com.education.tutor.db.domain.TblOrganizationBranchExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblOrganizationBranchSqlProvider {

    public String countByExample(TblOrganizationBranchExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("organization_branch");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblOrganizationBranchExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("organization_branch");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblOrganizationBranch record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("organization_branch");
        
        if (record.getOrganizationBranchId() != null) {
            sql.VALUES("organization_branch_id", "#{organizationBranchId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.VALUES("organization_id", "#{organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationName() != null) {
            sql.VALUES("organization_name", "#{organizationName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getLogurl() != null) {
            sql.VALUES("logurl", "#{logurl,jdbcType=VARCHAR}");
        }
        
        if (record.getLang() != null) {
            sql.VALUES("lang", "#{lang,jdbcType=VARCHAR}");
        }
        
        if (record.getCdate() != null) {
            sql.VALUES("cdate", "#{cdate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblOrganizationBranchExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("organization_branch_id");
        } else {
            sql.SELECT("organization_branch_id");
        }
        sql.SELECT("organization_id");
        sql.SELECT("organization_name");
        sql.SELECT("url");
        sql.SELECT("logurl");
        sql.SELECT("lang");
        sql.SELECT("cdate");
        sql.FROM("organization_branch");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblOrganizationBranch record = (TblOrganizationBranch) parameter.get("record");
        TblOrganizationBranchExample example = (TblOrganizationBranchExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("organization_branch");
        
        if (record.getOrganizationBranchId() != null) {
            sql.SET("organization_branch_id = #{record.organizationBranchId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationName() != null) {
            sql.SET("organization_name = #{record.organizationName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getLogurl() != null) {
            sql.SET("logurl = #{record.logurl,jdbcType=VARCHAR}");
        }
        
        if (record.getLang() != null) {
            sql.SET("lang = #{record.lang,jdbcType=VARCHAR}");
        }
        
        if (record.getCdate() != null) {
            sql.SET("cdate = #{record.cdate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("organization_branch");
        
        sql.SET("organization_branch_id = #{record.organizationBranchId,jdbcType=BIGINT}");
        sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        sql.SET("organization_name = #{record.organizationName,jdbcType=VARCHAR}");
        sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        sql.SET("logurl = #{record.logurl,jdbcType=VARCHAR}");
        sql.SET("lang = #{record.lang,jdbcType=VARCHAR}");
        sql.SET("cdate = #{record.cdate,jdbcType=TIMESTAMP}");
        
        TblOrganizationBranchExample example = (TblOrganizationBranchExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblOrganizationBranch record) {
        SQL sql = new SQL();
        sql.UPDATE("organization_branch");
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationName() != null) {
            sql.SET("organization_name = #{organizationName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getLogurl() != null) {
            sql.SET("logurl = #{logurl,jdbcType=VARCHAR}");
        }
        
        if (record.getLang() != null) {
            sql.SET("lang = #{lang,jdbcType=VARCHAR}");
        }
        
        if (record.getCdate() != null) {
            sql.SET("cdate = #{cdate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("organization_branch_id = #{organizationBranchId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblOrganizationBranchExample example, boolean includeExamplePhrase) {
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