package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblProjectLog;
import com.education.tutor.db.domain.TblProjectLogExample.Criteria;
import com.education.tutor.db.domain.TblProjectLogExample.Criterion;
import com.education.tutor.db.domain.TblProjectLogExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblProjectLogSqlProvider {

    public String countByExample(TblProjectLogExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("project_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblProjectLogExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("project_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblProjectLog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("project_log");
        
        if (record.getProjectId() != null) {
            sql.VALUES("project_id", "#{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectStep() != null) {
            sql.VALUES("project_step", "#{projectStep,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectStepType() != null) {
            sql.VALUES("project_step_type", "#{projectStepType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectStepStart() != null) {
            sql.VALUES("project_step_start", "#{projectStepStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProjectStepEnd() != null) {
            sql.VALUES("project_step_end", "#{projectStepEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.VALUES("score_reason", "#{scoreReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityResult() != null) {
            sql.VALUES("user_activity_result", "#{userActivityResult,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblProjectLogExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("project_log_id");
        } else {
            sql.SELECT("project_log_id");
        }
        sql.SELECT("project_id");
        sql.SELECT("project_step");
        sql.SELECT("project_step_type");
        sql.SELECT("project_step_start");
        sql.SELECT("project_step_end");
        sql.SELECT("score");
        sql.SELECT("score_reason");
        sql.SELECT("user_activity_result");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("project_log");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblProjectLog record = (TblProjectLog) parameter.get("record");
        TblProjectLogExample example = (TblProjectLogExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("project_log");
        
        if (record.getProjectLogId() != null) {
            sql.SET("project_log_id = #{record.projectLogId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectStep() != null) {
            sql.SET("project_step = #{record.projectStep,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectStepType() != null) {
            sql.SET("project_step_type = #{record.projectStepType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectStepStart() != null) {
            sql.SET("project_step_start = #{record.projectStepStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProjectStepEnd() != null) {
            sql.SET("project_step_end = #{record.projectStepEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{record.score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.SET("score_reason = #{record.scoreReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityResult() != null) {
            sql.SET("user_activity_result = #{record.userActivityResult,jdbcType=VARCHAR}");
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
        sql.UPDATE("project_log");
        
        sql.SET("project_log_id = #{record.projectLogId,jdbcType=BIGINT}");
        sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        sql.SET("project_step = #{record.projectStep,jdbcType=VARCHAR}");
        sql.SET("project_step_type = #{record.projectStepType,jdbcType=INTEGER}");
        sql.SET("project_step_start = #{record.projectStepStart,jdbcType=TIMESTAMP}");
        sql.SET("project_step_end = #{record.projectStepEnd,jdbcType=TIMESTAMP}");
        sql.SET("score = #{record.score,jdbcType=INTEGER}");
        sql.SET("score_reason = #{record.scoreReason,jdbcType=VARCHAR}");
        sql.SET("user_activity_result = #{record.userActivityResult,jdbcType=VARCHAR}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblProjectLogExample example = (TblProjectLogExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblProjectLog record) {
        SQL sql = new SQL();
        sql.UPDATE("project_log");
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectStep() != null) {
            sql.SET("project_step = #{projectStep,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectStepType() != null) {
            sql.SET("project_step_type = #{projectStepType,jdbcType=INTEGER}");
        }
        
        if (record.getProjectStepStart() != null) {
            sql.SET("project_step_start = #{projectStepStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProjectStepEnd() != null) {
            sql.SET("project_step_end = #{projectStepEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.SET("score_reason = #{scoreReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityResult() != null) {
            sql.SET("user_activity_result = #{userActivityResult,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("project_log_id = #{projectLogId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblProjectLogExample example, boolean includeExamplePhrase) {
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