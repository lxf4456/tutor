package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblSolution;
import com.education.tutor.db.domain.TblSolutionExample.Criteria;
import com.education.tutor.db.domain.TblSolutionExample.Criterion;
import com.education.tutor.db.domain.TblSolutionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblSolutionSqlProvider {

    public String countByExample(TblSolutionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("solution");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblSolutionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("solution");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblSolution record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("solution");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.VALUES("project_id", "#{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getSolutionDesc() != null) {
            sql.VALUES("solution_desc", "#{solutionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getSolutionEndDate() != null) {
            sql.VALUES("solution_end_date", "#{solutionEndDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSolutionState() != null) {
            sql.VALUES("solution_state", "#{solutionState,jdbcType=INTEGER}");
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
        
        if (record.getSolutionContent() != null) {
            sql.VALUES("solution_content", "#{solutionContent,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(TblSolutionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("solution_id");
        } else {
            sql.SELECT("solution_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("project_id");
        sql.SELECT("solution_desc");
        sql.SELECT("solution_end_date");
        sql.SELECT("solution_state");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.SELECT("solution_content");
        sql.FROM("solution");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(TblSolutionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("solution_id");
        } else {
            sql.SELECT("solution_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("project_id");
        sql.SELECT("solution_desc");
        sql.SELECT("solution_end_date");
        sql.SELECT("solution_state");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("solution");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblSolution record = (TblSolution) parameter.get("record");
        TblSolutionExample example = (TblSolutionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("solution");
        
        if (record.getSolutionId() != null) {
            sql.SET("solution_id = #{record.solutionId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        }
        
        if (record.getSolutionDesc() != null) {
            sql.SET("solution_desc = #{record.solutionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getSolutionEndDate() != null) {
            sql.SET("solution_end_date = #{record.solutionEndDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSolutionState() != null) {
            sql.SET("solution_state = #{record.solutionState,jdbcType=INTEGER}");
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
        
        if (record.getSolutionContent() != null) {
            sql.SET("solution_content = #{record.solutionContent,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("solution");
        
        sql.SET("solution_id = #{record.solutionId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        sql.SET("solution_desc = #{record.solutionDesc,jdbcType=VARCHAR}");
        sql.SET("solution_end_date = #{record.solutionEndDate,jdbcType=TIMESTAMP}");
        sql.SET("solution_state = #{record.solutionState,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("solution_content = #{record.solutionContent,jdbcType=LONGVARCHAR}");
        
        TblSolutionExample example = (TblSolutionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("solution");
        
        sql.SET("solution_id = #{record.solutionId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        sql.SET("solution_desc = #{record.solutionDesc,jdbcType=VARCHAR}");
        sql.SET("solution_end_date = #{record.solutionEndDate,jdbcType=TIMESTAMP}");
        sql.SET("solution_state = #{record.solutionState,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblSolutionExample example = (TblSolutionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblSolution record) {
        SQL sql = new SQL();
        sql.UPDATE("solution");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getSolutionDesc() != null) {
            sql.SET("solution_desc = #{solutionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getSolutionEndDate() != null) {
            sql.SET("solution_end_date = #{solutionEndDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSolutionState() != null) {
            sql.SET("solution_state = #{solutionState,jdbcType=INTEGER}");
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
        
        if (record.getSolutionContent() != null) {
            sql.SET("solution_content = #{solutionContent,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("solution_id = #{solutionId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblSolutionExample example, boolean includeExamplePhrase) {
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