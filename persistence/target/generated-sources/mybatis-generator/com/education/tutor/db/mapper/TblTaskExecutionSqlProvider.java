package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTaskExecution;
import com.education.tutor.db.domain.TblTaskExecutionExample.Criteria;
import com.education.tutor.db.domain.TblTaskExecutionExample.Criterion;
import com.education.tutor.db.domain.TblTaskExecutionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblTaskExecutionSqlProvider {

    public String countByExample(TblTaskExecutionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("task_execution");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblTaskExecutionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("task_execution");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblTaskExecution record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("task_execution");
        
        if (record.getTaskId() != null) {
            sql.VALUES("task_id", "#{taskId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getExecutionStart() != null) {
            sql.VALUES("execution_start", "#{executionStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExecutionEnd() != null) {
            sql.VALUES("execution_end", "#{executionEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExecutionResult() != null) {
            sql.VALUES("execution_result", "#{executionResult,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionFlag() != null) {
            sql.VALUES("execution_flag", "#{executionFlag,jdbcType=INTEGER}");
        }
        
        if (record.getExecutionRemark() != null) {
            sql.VALUES("execution_remark", "#{executionRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionLocation() != null) {
            sql.VALUES("execution_location", "#{executionLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionState() != null) {
            sql.VALUES("execution_state", "#{executionState,jdbcType=INTEGER}");
        }
        
        if (record.getCoporatedBy() != null) {
            sql.VALUES("coporated_by", "#{coporatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.VALUES("score_reason", "#{scoreReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblTaskExecutionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("task_execution_id");
        } else {
            sql.SELECT("task_execution_id");
        }
        sql.SELECT("task_id");
        sql.SELECT("user_main_id");
        sql.SELECT("execution_start");
        sql.SELECT("execution_end");
        sql.SELECT("execution_result");
        sql.SELECT("execution_flag");
        sql.SELECT("execution_remark");
        sql.SELECT("execution_location");
        sql.SELECT("execution_state");
        sql.SELECT("coporated_by");
        sql.SELECT("score");
        sql.SELECT("score_reason");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("task_execution");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblTaskExecution record = (TblTaskExecution) parameter.get("record");
        TblTaskExecutionExample example = (TblTaskExecutionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("task_execution");
        
        if (record.getTaskExecutionId() != null) {
            sql.SET("task_execution_id = #{record.taskExecutionId,jdbcType=BIGINT}");
        }
        
        if (record.getTaskId() != null) {
            sql.SET("task_id = #{record.taskId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getExecutionStart() != null) {
            sql.SET("execution_start = #{record.executionStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExecutionEnd() != null) {
            sql.SET("execution_end = #{record.executionEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExecutionResult() != null) {
            sql.SET("execution_result = #{record.executionResult,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionFlag() != null) {
            sql.SET("execution_flag = #{record.executionFlag,jdbcType=INTEGER}");
        }
        
        if (record.getExecutionRemark() != null) {
            sql.SET("execution_remark = #{record.executionRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionLocation() != null) {
            sql.SET("execution_location = #{record.executionLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionState() != null) {
            sql.SET("execution_state = #{record.executionState,jdbcType=INTEGER}");
        }
        
        if (record.getCoporatedBy() != null) {
            sql.SET("coporated_by = #{record.coporatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{record.score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.SET("score_reason = #{record.scoreReason,jdbcType=VARCHAR}");
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
        sql.UPDATE("task_execution");
        
        sql.SET("task_execution_id = #{record.taskExecutionId,jdbcType=BIGINT}");
        sql.SET("task_id = #{record.taskId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("execution_start = #{record.executionStart,jdbcType=TIMESTAMP}");
        sql.SET("execution_end = #{record.executionEnd,jdbcType=TIMESTAMP}");
        sql.SET("execution_result = #{record.executionResult,jdbcType=VARCHAR}");
        sql.SET("execution_flag = #{record.executionFlag,jdbcType=INTEGER}");
        sql.SET("execution_remark = #{record.executionRemark,jdbcType=VARCHAR}");
        sql.SET("execution_location = #{record.executionLocation,jdbcType=VARCHAR}");
        sql.SET("execution_state = #{record.executionState,jdbcType=INTEGER}");
        sql.SET("coporated_by = #{record.coporatedBy,jdbcType=VARCHAR}");
        sql.SET("score = #{record.score,jdbcType=INTEGER}");
        sql.SET("score_reason = #{record.scoreReason,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblTaskExecutionExample example = (TblTaskExecutionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblTaskExecution record) {
        SQL sql = new SQL();
        sql.UPDATE("task_execution");
        
        if (record.getTaskId() != null) {
            sql.SET("task_id = #{taskId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getExecutionStart() != null) {
            sql.SET("execution_start = #{executionStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExecutionEnd() != null) {
            sql.SET("execution_end = #{executionEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExecutionResult() != null) {
            sql.SET("execution_result = #{executionResult,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionFlag() != null) {
            sql.SET("execution_flag = #{executionFlag,jdbcType=INTEGER}");
        }
        
        if (record.getExecutionRemark() != null) {
            sql.SET("execution_remark = #{executionRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionLocation() != null) {
            sql.SET("execution_location = #{executionLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getExecutionState() != null) {
            sql.SET("execution_state = #{executionState,jdbcType=INTEGER}");
        }
        
        if (record.getCoporatedBy() != null) {
            sql.SET("coporated_by = #{coporatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.SET("score_reason = #{scoreReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("task_execution_id = #{taskExecutionId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblTaskExecutionExample example, boolean includeExamplePhrase) {
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