package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblContractRelation;
import com.education.tutor.db.domain.TblContractRelationExample.Criteria;
import com.education.tutor.db.domain.TblContractRelationExample.Criterion;
import com.education.tutor.db.domain.TblContractRelationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblContractRelationSqlProvider {

    public String countByExample(TblContractRelationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("contract_relation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblContractRelationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("contract_relation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblContractRelation record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("contract_relation");
        
        if (record.getContractId() != null) {
            sql.VALUES("contract_id", "#{contractId,jdbcType=BIGINT}");
        }
        
        if (record.getRelationType() != null) {
            sql.VALUES("relation_type", "#{relationType,jdbcType=INTEGER}");
        }
        
        if (record.getRelationPk() != null) {
            sql.VALUES("relation_pk", "#{relationPk,jdbcType=BIGINT}");
        }
        
        if (record.getRelationDescription() != null) {
            sql.VALUES("relation_description", "#{relationDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getRelationState() != null) {
            sql.VALUES("relation_state", "#{relationState,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblContractRelationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("contract_relation_id");
        } else {
            sql.SELECT("contract_relation_id");
        }
        sql.SELECT("contract_id");
        sql.SELECT("relation_type");
        sql.SELECT("relation_pk");
        sql.SELECT("relation_description");
        sql.SELECT("relation_state");
        sql.SELECT("remark");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("contract_relation");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblContractRelation record = (TblContractRelation) parameter.get("record");
        TblContractRelationExample example = (TblContractRelationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("contract_relation");
        
        if (record.getContractRelationId() != null) {
            sql.SET("contract_relation_id = #{record.contractRelationId,jdbcType=BIGINT}");
        }
        
        if (record.getContractId() != null) {
            sql.SET("contract_id = #{record.contractId,jdbcType=BIGINT}");
        }
        
        if (record.getRelationType() != null) {
            sql.SET("relation_type = #{record.relationType,jdbcType=INTEGER}");
        }
        
        if (record.getRelationPk() != null) {
            sql.SET("relation_pk = #{record.relationPk,jdbcType=BIGINT}");
        }
        
        if (record.getRelationDescription() != null) {
            sql.SET("relation_description = #{record.relationDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getRelationState() != null) {
            sql.SET("relation_state = #{record.relationState,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("contract_relation");
        
        sql.SET("contract_relation_id = #{record.contractRelationId,jdbcType=BIGINT}");
        sql.SET("contract_id = #{record.contractId,jdbcType=BIGINT}");
        sql.SET("relation_type = #{record.relationType,jdbcType=INTEGER}");
        sql.SET("relation_pk = #{record.relationPk,jdbcType=BIGINT}");
        sql.SET("relation_description = #{record.relationDescription,jdbcType=VARCHAR}");
        sql.SET("relation_state = #{record.relationState,jdbcType=INTEGER}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblContractRelationExample example = (TblContractRelationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblContractRelation record) {
        SQL sql = new SQL();
        sql.UPDATE("contract_relation");
        
        if (record.getContractId() != null) {
            sql.SET("contract_id = #{contractId,jdbcType=BIGINT}");
        }
        
        if (record.getRelationType() != null) {
            sql.SET("relation_type = #{relationType,jdbcType=INTEGER}");
        }
        
        if (record.getRelationPk() != null) {
            sql.SET("relation_pk = #{relationPk,jdbcType=BIGINT}");
        }
        
        if (record.getRelationDescription() != null) {
            sql.SET("relation_description = #{relationDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getRelationState() != null) {
            sql.SET("relation_state = #{relationState,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("contract_relation_id = #{contractRelationId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblContractRelationExample example, boolean includeExamplePhrase) {
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