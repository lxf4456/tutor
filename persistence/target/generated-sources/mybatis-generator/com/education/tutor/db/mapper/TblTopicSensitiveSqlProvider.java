package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTopicSensitive;
import com.education.tutor.db.domain.TblTopicSensitiveExample.Criteria;
import com.education.tutor.db.domain.TblTopicSensitiveExample.Criterion;
import com.education.tutor.db.domain.TblTopicSensitiveExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblTopicSensitiveSqlProvider {

    public String countByExample(TblTopicSensitiveExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("topic_sensitive");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblTopicSensitiveExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("topic_sensitive");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblTopicSensitive record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("topic_sensitive");
        
        if (record.getSeValue() != null) {
            sql.VALUES("se_value", "#{seValue,jdbcType=VARCHAR}");
        }
        
        if (record.getSeState() != null) {
            sql.VALUES("se_state", "#{seState,jdbcType=INTEGER}");
        }
        
        if (record.getSeCreateat() != null) {
            sql.VALUES("se_createat", "#{seCreateat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeCreateby() != null) {
            sql.VALUES("se_createby", "#{seCreateby,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblTopicSensitiveExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("se_id");
        } else {
            sql.SELECT("se_id");
        }
        sql.SELECT("se_value");
        sql.SELECT("se_state");
        sql.SELECT("se_createat");
        sql.SELECT("se_createby");
        sql.FROM("topic_sensitive");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblTopicSensitive record = (TblTopicSensitive) parameter.get("record");
        TblTopicSensitiveExample example = (TblTopicSensitiveExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("topic_sensitive");
        
        if (record.getSeId() != null) {
            sql.SET("se_id = #{record.seId,jdbcType=BIGINT}");
        }
        
        if (record.getSeValue() != null) {
            sql.SET("se_value = #{record.seValue,jdbcType=VARCHAR}");
        }
        
        if (record.getSeState() != null) {
            sql.SET("se_state = #{record.seState,jdbcType=INTEGER}");
        }
        
        if (record.getSeCreateat() != null) {
            sql.SET("se_createat = #{record.seCreateat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeCreateby() != null) {
            sql.SET("se_createby = #{record.seCreateby,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("topic_sensitive");
        
        sql.SET("se_id = #{record.seId,jdbcType=BIGINT}");
        sql.SET("se_value = #{record.seValue,jdbcType=VARCHAR}");
        sql.SET("se_state = #{record.seState,jdbcType=INTEGER}");
        sql.SET("se_createat = #{record.seCreateat,jdbcType=TIMESTAMP}");
        sql.SET("se_createby = #{record.seCreateby,jdbcType=VARCHAR}");
        
        TblTopicSensitiveExample example = (TblTopicSensitiveExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblTopicSensitive record) {
        SQL sql = new SQL();
        sql.UPDATE("topic_sensitive");
        
        if (record.getSeValue() != null) {
            sql.SET("se_value = #{seValue,jdbcType=VARCHAR}");
        }
        
        if (record.getSeState() != null) {
            sql.SET("se_state = #{seState,jdbcType=INTEGER}");
        }
        
        if (record.getSeCreateat() != null) {
            sql.SET("se_createat = #{seCreateat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeCreateby() != null) {
            sql.SET("se_createby = #{seCreateby,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("se_id = #{seId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblTopicSensitiveExample example, boolean includeExamplePhrase) {
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