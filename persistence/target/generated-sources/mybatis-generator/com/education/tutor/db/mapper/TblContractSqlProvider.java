package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblContract;
import com.education.tutor.db.domain.TblContractExample.Criteria;
import com.education.tutor.db.domain.TblContractExample.Criterion;
import com.education.tutor.db.domain.TblContractExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblContractSqlProvider {

    public String countByExample(TblContractExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("contract");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblContractExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("contract");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblContract record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("contract");
        
        if (record.getProjectId() != null) {
            sql.VALUES("project_id", "#{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.VALUES("organization_id", "#{organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getContractName() != null) {
            sql.VALUES("contract_name", "#{contractName,jdbcType=VARCHAR}");
        }
        
        if (record.getContractCode() != null) {
            sql.VALUES("contract_code", "#{contractCode,jdbcType=VARCHAR}");
        }
        
        if (record.getContractDocUrl() != null) {
            sql.VALUES("contract_doc_url", "#{contractDocUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getContractType() != null) {
            sql.VALUES("contract_type", "#{contractType,jdbcType=INTEGER}");
        }
        
        if (record.getContractState() != null) {
            sql.VALUES("contract_state", "#{contractState,jdbcType=INTEGER}");
        }
        
        if (record.getContractStart() != null) {
            sql.VALUES("contract_start", "#{contractStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContractEnd() != null) {
            sql.VALUES("contract_end", "#{contractEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContractStep() != null) {
            sql.VALUES("contract_step", "#{contractStep,jdbcType=VARCHAR}");
        }
        
        if (record.getContractAmount() != null) {
            sql.VALUES("contract_amount", "#{contractAmount,jdbcType=INTEGER}");
        }
        
        if (record.getContractCurrency() != null) {
            sql.VALUES("contract_currency", "#{contractCurrency,jdbcType=INTEGER}");
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

    public String selectByExample(TblContractExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("contract_id");
        } else {
            sql.SELECT("contract_id");
        }
        sql.SELECT("project_id");
        sql.SELECT("organization_id");
        sql.SELECT("contract_name");
        sql.SELECT("contract_code");
        sql.SELECT("contract_doc_url");
        sql.SELECT("contract_type");
        sql.SELECT("contract_state");
        sql.SELECT("contract_start");
        sql.SELECT("contract_end");
        sql.SELECT("contract_step");
        sql.SELECT("contract_amount");
        sql.SELECT("contract_currency");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("contract");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblContract record = (TblContract) parameter.get("record");
        TblContractExample example = (TblContractExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("contract");
        
        if (record.getContractId() != null) {
            sql.SET("contract_id = #{record.contractId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getContractName() != null) {
            sql.SET("contract_name = #{record.contractName,jdbcType=VARCHAR}");
        }
        
        if (record.getContractCode() != null) {
            sql.SET("contract_code = #{record.contractCode,jdbcType=VARCHAR}");
        }
        
        if (record.getContractDocUrl() != null) {
            sql.SET("contract_doc_url = #{record.contractDocUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getContractType() != null) {
            sql.SET("contract_type = #{record.contractType,jdbcType=INTEGER}");
        }
        
        if (record.getContractState() != null) {
            sql.SET("contract_state = #{record.contractState,jdbcType=INTEGER}");
        }
        
        if (record.getContractStart() != null) {
            sql.SET("contract_start = #{record.contractStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContractEnd() != null) {
            sql.SET("contract_end = #{record.contractEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContractStep() != null) {
            sql.SET("contract_step = #{record.contractStep,jdbcType=VARCHAR}");
        }
        
        if (record.getContractAmount() != null) {
            sql.SET("contract_amount = #{record.contractAmount,jdbcType=INTEGER}");
        }
        
        if (record.getContractCurrency() != null) {
            sql.SET("contract_currency = #{record.contractCurrency,jdbcType=INTEGER}");
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
        sql.UPDATE("contract");
        
        sql.SET("contract_id = #{record.contractId,jdbcType=BIGINT}");
        sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        sql.SET("contract_name = #{record.contractName,jdbcType=VARCHAR}");
        sql.SET("contract_code = #{record.contractCode,jdbcType=VARCHAR}");
        sql.SET("contract_doc_url = #{record.contractDocUrl,jdbcType=VARCHAR}");
        sql.SET("contract_type = #{record.contractType,jdbcType=INTEGER}");
        sql.SET("contract_state = #{record.contractState,jdbcType=INTEGER}");
        sql.SET("contract_start = #{record.contractStart,jdbcType=TIMESTAMP}");
        sql.SET("contract_end = #{record.contractEnd,jdbcType=TIMESTAMP}");
        sql.SET("contract_step = #{record.contractStep,jdbcType=VARCHAR}");
        sql.SET("contract_amount = #{record.contractAmount,jdbcType=INTEGER}");
        sql.SET("contract_currency = #{record.contractCurrency,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblContractExample example = (TblContractExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblContract record) {
        SQL sql = new SQL();
        sql.UPDATE("contract");
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getContractName() != null) {
            sql.SET("contract_name = #{contractName,jdbcType=VARCHAR}");
        }
        
        if (record.getContractCode() != null) {
            sql.SET("contract_code = #{contractCode,jdbcType=VARCHAR}");
        }
        
        if (record.getContractDocUrl() != null) {
            sql.SET("contract_doc_url = #{contractDocUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getContractType() != null) {
            sql.SET("contract_type = #{contractType,jdbcType=INTEGER}");
        }
        
        if (record.getContractState() != null) {
            sql.SET("contract_state = #{contractState,jdbcType=INTEGER}");
        }
        
        if (record.getContractStart() != null) {
            sql.SET("contract_start = #{contractStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContractEnd() != null) {
            sql.SET("contract_end = #{contractEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContractStep() != null) {
            sql.SET("contract_step = #{contractStep,jdbcType=VARCHAR}");
        }
        
        if (record.getContractAmount() != null) {
            sql.SET("contract_amount = #{contractAmount,jdbcType=INTEGER}");
        }
        
        if (record.getContractCurrency() != null) {
            sql.SET("contract_currency = #{contractCurrency,jdbcType=INTEGER}");
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
        
        sql.WHERE("contract_id = #{contractId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblContractExample example, boolean includeExamplePhrase) {
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