package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblClientService;
import com.education.tutor.db.domain.TblClientServiceExample.Criteria;
import com.education.tutor.db.domain.TblClientServiceExample.Criterion;
import com.education.tutor.db.domain.TblClientServiceExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblClientServiceSqlProvider {

    public String countByExample(TblClientServiceExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("client_service");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblClientServiceExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("client_service");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblClientService record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("client_service");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getClientOrgId() != null) {
            sql.VALUES("client_org_id", "#{clientOrgId,jdbcType=BIGINT}");
        }
        
        if (record.getServiceOrgId() != null) {
            sql.VALUES("service_org_id", "#{serviceOrgId,jdbcType=BIGINT}");
        }
        
        if (record.getServerType() != null) {
            sql.VALUES("server_type", "#{serverType,jdbcType=INTEGER}");
        }
        
        if (record.getServerStatus() != null) {
            sql.VALUES("server_status", "#{serverStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCreateAt() != null) {
            sql.VALUES("create_at", "#{createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateBy() != null) {
            sql.VALUES("create_by", "#{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.VALUES("update_at", "#{updateAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblClientServiceExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("client_service_id");
        } else {
            sql.SELECT("client_service_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("client_org_id");
        sql.SELECT("service_org_id");
        sql.SELECT("server_type");
        sql.SELECT("server_status");
        sql.SELECT("create_at");
        sql.SELECT("create_by");
        sql.SELECT("update_at");
        sql.FROM("client_service");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblClientService record = (TblClientService) parameter.get("record");
        TblClientServiceExample example = (TblClientServiceExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("client_service");
        
        if (record.getClientServiceId() != null) {
            sql.SET("client_service_id = #{record.clientServiceId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getClientOrgId() != null) {
            sql.SET("client_org_id = #{record.clientOrgId,jdbcType=BIGINT}");
        }
        
        if (record.getServiceOrgId() != null) {
            sql.SET("service_org_id = #{record.serviceOrgId,jdbcType=BIGINT}");
        }
        
        if (record.getServerType() != null) {
            sql.SET("server_type = #{record.serverType,jdbcType=INTEGER}");
        }
        
        if (record.getServerStatus() != null) {
            sql.SET("server_status = #{record.serverStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCreateAt() != null) {
            sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateBy() != null) {
            sql.SET("create_by = #{record.createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("client_service");
        
        sql.SET("client_service_id = #{record.clientServiceId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("client_org_id = #{record.clientOrgId,jdbcType=BIGINT}");
        sql.SET("service_org_id = #{record.serviceOrgId,jdbcType=BIGINT}");
        sql.SET("server_type = #{record.serverType,jdbcType=INTEGER}");
        sql.SET("server_status = #{record.serverStatus,jdbcType=INTEGER}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("create_by = #{record.createBy,jdbcType=VARCHAR}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        
        TblClientServiceExample example = (TblClientServiceExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblClientService record) {
        SQL sql = new SQL();
        sql.UPDATE("client_service");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getClientOrgId() != null) {
            sql.SET("client_org_id = #{clientOrgId,jdbcType=BIGINT}");
        }
        
        if (record.getServiceOrgId() != null) {
            sql.SET("service_org_id = #{serviceOrgId,jdbcType=BIGINT}");
        }
        
        if (record.getServerType() != null) {
            sql.SET("server_type = #{serverType,jdbcType=INTEGER}");
        }
        
        if (record.getServerStatus() != null) {
            sql.SET("server_status = #{serverStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCreateAt() != null) {
            sql.SET("create_at = #{createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateBy() != null) {
            sql.SET("create_by = #{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.SET("update_at = #{updateAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("client_service_id = #{clientServiceId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblClientServiceExample example, boolean includeExamplePhrase) {
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