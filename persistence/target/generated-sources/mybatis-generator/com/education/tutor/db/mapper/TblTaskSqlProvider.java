package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTask;
import com.education.tutor.db.domain.TblTaskExample.Criteria;
import com.education.tutor.db.domain.TblTaskExample.Criterion;
import com.education.tutor.db.domain.TblTaskExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblTaskSqlProvider {

    public String countByExample(TblTaskExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("task");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblTaskExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("task");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblTask record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("task");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.VALUES("project_id", "#{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getTaskName() != null) {
            sql.VALUES("task_name", "#{taskName,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskContent() != null) {
            sql.VALUES("task_content", "#{taskContent,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskDataPk() != null) {
            sql.VALUES("task_data_pk", "#{taskDataPk,jdbcType=BIGINT}");
        }
        
        if (record.getTaskType() != null) {
            sql.VALUES("task_type", "#{taskType,jdbcType=INTEGER}");
        }
        
        if (record.getTaskState() != null) {
            sql.VALUES("task_state", "#{taskState,jdbcType=INTEGER}");
        }
        
        if (record.getParentTaskId() != null) {
            sql.VALUES("parent_task_id", "#{parentTaskId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPlanStartAt() != null) {
            sql.VALUES("plan_start_at", "#{planStartAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPlanEndAt() != null) {
            sql.VALUES("plan_end_at", "#{planEndAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInforceAt() != null) {
            sql.VALUES("inforce_at", "#{inforceAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("created_by", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedBy() != null) {
            sql.VALUES("assigned_by", "#{assignedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedTo() != null) {
            sql.VALUES("assigned_to", "#{assignedTo,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedGroup() != null) {
            sql.VALUES("assigned_group", "#{assignedGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            sql.VALUES("priority", "#{priority,jdbcType=INTEGER}");
        }
        
        if (record.getProgress() != null) {
            sql.VALUES("progress", "#{progress,jdbcType=INTEGER}");
        }
        
        if (record.getProgressDesc() != null) {
            sql.VALUES("progress_desc", "#{progressDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getOffsetDesc() != null) {
            sql.VALUES("offset_desc", "#{offsetDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskResult() != null) {
            sql.VALUES("task_result", "#{taskResult,jdbcType=INTEGER}");
        }
        
        if (record.getTaskResultDesc() != null) {
            sql.VALUES("task_result_desc", "#{taskResultDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskResultRemark() != null) {
            sql.VALUES("task_result_remark", "#{taskResultRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.VALUES("score_reason", "#{scoreReason,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblTaskExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("task_id");
        } else {
            sql.SELECT("task_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("project_id");
        sql.SELECT("task_name");
        sql.SELECT("task_content");
        sql.SELECT("task_data_pk");
        sql.SELECT("task_type");
        sql.SELECT("task_state");
        sql.SELECT("parent_task_id");
        sql.SELECT("created_at");
        sql.SELECT("plan_start_at");
        sql.SELECT("plan_end_at");
        sql.SELECT("inforce_at");
        sql.SELECT("created_by");
        sql.SELECT("assigned_by");
        sql.SELECT("assigned_to");
        sql.SELECT("assigned_group");
        sql.SELECT("priority");
        sql.SELECT("progress");
        sql.SELECT("progress_desc");
        sql.SELECT("offset_desc");
        sql.SELECT("task_result");
        sql.SELECT("task_result_desc");
        sql.SELECT("task_result_remark");
        sql.SELECT("score");
        sql.SELECT("score_reason");
        sql.SELECT("remark");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("task");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblTask record = (TblTask) parameter.get("record");
        TblTaskExample example = (TblTaskExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("task");
        
        if (record.getTaskId() != null) {
            sql.SET("task_id = #{record.taskId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        }
        
        if (record.getTaskName() != null) {
            sql.SET("task_name = #{record.taskName,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskContent() != null) {
            sql.SET("task_content = #{record.taskContent,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskDataPk() != null) {
            sql.SET("task_data_pk = #{record.taskDataPk,jdbcType=BIGINT}");
        }
        
        if (record.getTaskType() != null) {
            sql.SET("task_type = #{record.taskType,jdbcType=INTEGER}");
        }
        
        if (record.getTaskState() != null) {
            sql.SET("task_state = #{record.taskState,jdbcType=INTEGER}");
        }
        
        if (record.getParentTaskId() != null) {
            sql.SET("parent_task_id = #{record.parentTaskId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPlanStartAt() != null) {
            sql.SET("plan_start_at = #{record.planStartAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPlanEndAt() != null) {
            sql.SET("plan_end_at = #{record.planEndAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInforceAt() != null) {
            sql.SET("inforce_at = #{record.inforceAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedBy() != null) {
            sql.SET("assigned_by = #{record.assignedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedTo() != null) {
            sql.SET("assigned_to = #{record.assignedTo,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedGroup() != null) {
            sql.SET("assigned_group = #{record.assignedGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            sql.SET("priority = #{record.priority,jdbcType=INTEGER}");
        }
        
        if (record.getProgress() != null) {
            sql.SET("progress = #{record.progress,jdbcType=INTEGER}");
        }
        
        if (record.getProgressDesc() != null) {
            sql.SET("progress_desc = #{record.progressDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getOffsetDesc() != null) {
            sql.SET("offset_desc = #{record.offsetDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskResult() != null) {
            sql.SET("task_result = #{record.taskResult,jdbcType=INTEGER}");
        }
        
        if (record.getTaskResultDesc() != null) {
            sql.SET("task_result_desc = #{record.taskResultDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskResultRemark() != null) {
            sql.SET("task_result_remark = #{record.taskResultRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{record.score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.SET("score_reason = #{record.scoreReason,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
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
        sql.UPDATE("task");
        
        sql.SET("task_id = #{record.taskId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        sql.SET("task_name = #{record.taskName,jdbcType=VARCHAR}");
        sql.SET("task_content = #{record.taskContent,jdbcType=VARCHAR}");
        sql.SET("task_data_pk = #{record.taskDataPk,jdbcType=BIGINT}");
        sql.SET("task_type = #{record.taskType,jdbcType=INTEGER}");
        sql.SET("task_state = #{record.taskState,jdbcType=INTEGER}");
        sql.SET("parent_task_id = #{record.parentTaskId,jdbcType=BIGINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("plan_start_at = #{record.planStartAt,jdbcType=TIMESTAMP}");
        sql.SET("plan_end_at = #{record.planEndAt,jdbcType=TIMESTAMP}");
        sql.SET("inforce_at = #{record.inforceAt,jdbcType=TIMESTAMP}");
        sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        sql.SET("assigned_by = #{record.assignedBy,jdbcType=VARCHAR}");
        sql.SET("assigned_to = #{record.assignedTo,jdbcType=VARCHAR}");
        sql.SET("assigned_group = #{record.assignedGroup,jdbcType=VARCHAR}");
        sql.SET("priority = #{record.priority,jdbcType=INTEGER}");
        sql.SET("progress = #{record.progress,jdbcType=INTEGER}");
        sql.SET("progress_desc = #{record.progressDesc,jdbcType=VARCHAR}");
        sql.SET("offset_desc = #{record.offsetDesc,jdbcType=VARCHAR}");
        sql.SET("task_result = #{record.taskResult,jdbcType=INTEGER}");
        sql.SET("task_result_desc = #{record.taskResultDesc,jdbcType=VARCHAR}");
        sql.SET("task_result_remark = #{record.taskResultRemark,jdbcType=VARCHAR}");
        sql.SET("score = #{record.score,jdbcType=INTEGER}");
        sql.SET("score_reason = #{record.scoreReason,jdbcType=VARCHAR}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblTaskExample example = (TblTaskExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblTask record) {
        SQL sql = new SQL();
        sql.UPDATE("task");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getTaskName() != null) {
            sql.SET("task_name = #{taskName,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskContent() != null) {
            sql.SET("task_content = #{taskContent,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskDataPk() != null) {
            sql.SET("task_data_pk = #{taskDataPk,jdbcType=BIGINT}");
        }
        
        if (record.getTaskType() != null) {
            sql.SET("task_type = #{taskType,jdbcType=INTEGER}");
        }
        
        if (record.getTaskState() != null) {
            sql.SET("task_state = #{taskState,jdbcType=INTEGER}");
        }
        
        if (record.getParentTaskId() != null) {
            sql.SET("parent_task_id = #{parentTaskId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPlanStartAt() != null) {
            sql.SET("plan_start_at = #{planStartAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPlanEndAt() != null) {
            sql.SET("plan_end_at = #{planEndAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInforceAt() != null) {
            sql.SET("inforce_at = #{inforceAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedBy() != null) {
            sql.SET("assigned_by = #{assignedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedTo() != null) {
            sql.SET("assigned_to = #{assignedTo,jdbcType=VARCHAR}");
        }
        
        if (record.getAssignedGroup() != null) {
            sql.SET("assigned_group = #{assignedGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            sql.SET("priority = #{priority,jdbcType=INTEGER}");
        }
        
        if (record.getProgress() != null) {
            sql.SET("progress = #{progress,jdbcType=INTEGER}");
        }
        
        if (record.getProgressDesc() != null) {
            sql.SET("progress_desc = #{progressDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getOffsetDesc() != null) {
            sql.SET("offset_desc = #{offsetDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskResult() != null) {
            sql.SET("task_result = #{taskResult,jdbcType=INTEGER}");
        }
        
        if (record.getTaskResultDesc() != null) {
            sql.SET("task_result_desc = #{taskResultDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskResultRemark() != null) {
            sql.SET("task_result_remark = #{taskResultRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getScoreReason() != null) {
            sql.SET("score_reason = #{scoreReason,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("task_id = #{taskId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblTaskExample example, boolean includeExamplePhrase) {
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