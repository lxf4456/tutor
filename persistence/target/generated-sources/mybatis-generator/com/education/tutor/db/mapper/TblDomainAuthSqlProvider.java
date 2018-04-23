package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblDomainAuth;
import com.education.tutor.db.domain.TblDomainAuthExample.Criteria;
import com.education.tutor.db.domain.TblDomainAuthExample.Criterion;
import com.education.tutor.db.domain.TblDomainAuthExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblDomainAuthSqlProvider {

    public String countByExample(TblDomainAuthExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("domain_auth");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblDomainAuthExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("domain_auth");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblDomainAuth record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("domain_auth");
        
        if (record.getTargetType() != null) {
            sql.VALUES("target_type", "#{targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.VALUES("target_pk", "#{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupName() != null) {
            sql.VALUES("group_name", "#{groupName,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("state", "#{state,jdbcType=INTEGER}");
        }
        
        if (record.getEffectFrom() != null) {
            sql.VALUES("effect_from", "#{effectFrom,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectEnd() != null) {
            sql.VALUES("effect_end", "#{effectEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblDomainAuthExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("domain_auth_id");
        } else {
            sql.SELECT("domain_auth_id");
        }
        sql.SELECT("target_type");
        sql.SELECT("target_pk");
        sql.SELECT("username");
        sql.SELECT("group_name");
        sql.SELECT("state");
        sql.SELECT("effect_from");
        sql.SELECT("effect_end");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("domain_auth");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblDomainAuth record = (TblDomainAuth) parameter.get("record");
        TblDomainAuthExample example = (TblDomainAuthExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("domain_auth");
        
        if (record.getDomainAuthId() != null) {
            sql.SET("domain_auth_id = #{record.domainAuthId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetType() != null) {
            sql.SET("target_type = #{record.targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupName() != null) {
            sql.SET("group_name = #{record.groupName,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.SET("state = #{record.state,jdbcType=INTEGER}");
        }
        
        if (record.getEffectFrom() != null) {
            sql.SET("effect_from = #{record.effectFrom,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectEnd() != null) {
            sql.SET("effect_end = #{record.effectEnd,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("domain_auth");
        
        sql.SET("domain_auth_id = #{record.domainAuthId,jdbcType=BIGINT}");
        sql.SET("target_type = #{record.targetType,jdbcType=INTEGER}");
        sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        sql.SET("group_name = #{record.groupName,jdbcType=VARCHAR}");
        sql.SET("state = #{record.state,jdbcType=INTEGER}");
        sql.SET("effect_from = #{record.effectFrom,jdbcType=TIMESTAMP}");
        sql.SET("effect_end = #{record.effectEnd,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblDomainAuthExample example = (TblDomainAuthExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblDomainAuth record) {
        SQL sql = new SQL();
        sql.UPDATE("domain_auth");
        
        if (record.getTargetType() != null) {
            sql.SET("target_type = #{targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupName() != null) {
            sql.SET("group_name = #{groupName,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.SET("state = #{state,jdbcType=INTEGER}");
        }
        
        if (record.getEffectFrom() != null) {
            sql.SET("effect_from = #{effectFrom,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectEnd() != null) {
            sql.SET("effect_end = #{effectEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("domain_auth_id = #{domainAuthId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblDomainAuthExample example, boolean includeExamplePhrase) {
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