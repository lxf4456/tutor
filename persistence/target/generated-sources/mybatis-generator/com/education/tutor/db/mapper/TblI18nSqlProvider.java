package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblI18n;
import com.education.tutor.db.domain.TblI18nExample.Criteria;
import com.education.tutor.db.domain.TblI18nExample.Criterion;
import com.education.tutor.db.domain.TblI18nExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblI18nSqlProvider {

    public String countByExample(TblI18nExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("i18n");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblI18nExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("i18n");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblI18n record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("i18n");
        
        if (record.getSchemaName() != null) {
            sql.VALUES("schema_name", "#{schemaName,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.VALUES("table_name", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldName() != null) {
            sql.VALUES("field_name", "#{fieldName,jdbcType=VARCHAR}");
        }
        
        if (record.getPkValue() != null) {
            sql.VALUES("pk_value", "#{pkValue,jdbcType=BIGINT}");
        }
        
        if (record.getLangName() != null) {
            sql.VALUES("lang_name", "#{langName,jdbcType=VARCHAR}");
        }
        
        if (record.getValue() != null) {
            sql.VALUES("value", "#{value,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblI18nExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("i18n_id");
        } else {
            sql.SELECT("i18n_id");
        }
        sql.SELECT("schema_name");
        sql.SELECT("table_name");
        sql.SELECT("field_name");
        sql.SELECT("pk_value");
        sql.SELECT("lang_name");
        sql.SELECT("value");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("i18n");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblI18n record = (TblI18n) parameter.get("record");
        TblI18nExample example = (TblI18nExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("i18n");
        
        if (record.getI18nId() != null) {
            sql.SET("i18n_id = #{record.i18nId,jdbcType=BIGINT}");
        }
        
        if (record.getSchemaName() != null) {
            sql.SET("schema_name = #{record.schemaName,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("table_name = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldName() != null) {
            sql.SET("field_name = #{record.fieldName,jdbcType=VARCHAR}");
        }
        
        if (record.getPkValue() != null) {
            sql.SET("pk_value = #{record.pkValue,jdbcType=BIGINT}");
        }
        
        if (record.getLangName() != null) {
            sql.SET("lang_name = #{record.langName,jdbcType=VARCHAR}");
        }
        
        if (record.getValue() != null) {
            sql.SET("value = #{record.value,jdbcType=VARCHAR}");
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
        sql.UPDATE("i18n");
        
        sql.SET("i18n_id = #{record.i18nId,jdbcType=BIGINT}");
        sql.SET("schema_name = #{record.schemaName,jdbcType=VARCHAR}");
        sql.SET("table_name = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("field_name = #{record.fieldName,jdbcType=VARCHAR}");
        sql.SET("pk_value = #{record.pkValue,jdbcType=BIGINT}");
        sql.SET("lang_name = #{record.langName,jdbcType=VARCHAR}");
        sql.SET("value = #{record.value,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblI18nExample example = (TblI18nExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblI18n record) {
        SQL sql = new SQL();
        sql.UPDATE("i18n");
        
        if (record.getSchemaName() != null) {
            sql.SET("schema_name = #{schemaName,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("table_name = #{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldName() != null) {
            sql.SET("field_name = #{fieldName,jdbcType=VARCHAR}");
        }
        
        if (record.getPkValue() != null) {
            sql.SET("pk_value = #{pkValue,jdbcType=BIGINT}");
        }
        
        if (record.getLangName() != null) {
            sql.SET("lang_name = #{langName,jdbcType=VARCHAR}");
        }
        
        if (record.getValue() != null) {
            sql.SET("value = #{value,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("i18n_id = #{i18nId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblI18nExample example, boolean includeExamplePhrase) {
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