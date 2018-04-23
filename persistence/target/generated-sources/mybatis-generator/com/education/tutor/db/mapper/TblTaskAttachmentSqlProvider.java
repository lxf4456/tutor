package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTaskAttachment;
import com.education.tutor.db.domain.TblTaskAttachmentExample.Criteria;
import com.education.tutor.db.domain.TblTaskAttachmentExample.Criterion;
import com.education.tutor.db.domain.TblTaskAttachmentExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblTaskAttachmentSqlProvider {

    public String countByExample(TblTaskAttachmentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("task_attachment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblTaskAttachmentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("task_attachment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblTaskAttachment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("task_attachment");
        
        if (record.getTaskId() != null) {
            sql.VALUES("task_id", "#{taskId,jdbcType=BIGINT}");
        }
        
        if (record.getTaskExecutionId() != null) {
            sql.VALUES("task_execution_id", "#{taskExecutionId,jdbcType=BIGINT}");
        }
        
        if (record.getInTaskAttachmentId() != null) {
            sql.VALUES("in_task_attachment_id", "#{inTaskAttachmentId,jdbcType=BIGINT}");
        }
        
        if (record.getAttachmentDesc() != null) {
            sql.VALUES("attachment_desc", "#{attachmentDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskPrivateOwn() != null) {
            sql.VALUES("task_private_own", "#{taskPrivateOwn,jdbcType=SMALLINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblTaskAttachmentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("task_attachment_id");
        } else {
            sql.SELECT("task_attachment_id");
        }
        sql.SELECT("task_id");
        sql.SELECT("task_execution_id");
        sql.SELECT("in_task_attachment_id");
        sql.SELECT("attachment_desc");
        sql.SELECT("task_private_own");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("task_attachment");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblTaskAttachment record = (TblTaskAttachment) parameter.get("record");
        TblTaskAttachmentExample example = (TblTaskAttachmentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("task_attachment");
        
        if (record.getTaskAttachmentId() != null) {
            sql.SET("task_attachment_id = #{record.taskAttachmentId,jdbcType=BIGINT}");
        }
        
        if (record.getTaskId() != null) {
            sql.SET("task_id = #{record.taskId,jdbcType=BIGINT}");
        }
        
        if (record.getTaskExecutionId() != null) {
            sql.SET("task_execution_id = #{record.taskExecutionId,jdbcType=BIGINT}");
        }
        
        if (record.getInTaskAttachmentId() != null) {
            sql.SET("in_task_attachment_id = #{record.inTaskAttachmentId,jdbcType=BIGINT}");
        }
        
        if (record.getAttachmentDesc() != null) {
            sql.SET("attachment_desc = #{record.attachmentDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskPrivateOwn() != null) {
            sql.SET("task_private_own = #{record.taskPrivateOwn,jdbcType=SMALLINT}");
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
        sql.UPDATE("task_attachment");
        
        sql.SET("task_attachment_id = #{record.taskAttachmentId,jdbcType=BIGINT}");
        sql.SET("task_id = #{record.taskId,jdbcType=BIGINT}");
        sql.SET("task_execution_id = #{record.taskExecutionId,jdbcType=BIGINT}");
        sql.SET("in_task_attachment_id = #{record.inTaskAttachmentId,jdbcType=BIGINT}");
        sql.SET("attachment_desc = #{record.attachmentDesc,jdbcType=VARCHAR}");
        sql.SET("task_private_own = #{record.taskPrivateOwn,jdbcType=SMALLINT}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblTaskAttachmentExample example = (TblTaskAttachmentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblTaskAttachment record) {
        SQL sql = new SQL();
        sql.UPDATE("task_attachment");
        
        if (record.getTaskId() != null) {
            sql.SET("task_id = #{taskId,jdbcType=BIGINT}");
        }
        
        if (record.getTaskExecutionId() != null) {
            sql.SET("task_execution_id = #{taskExecutionId,jdbcType=BIGINT}");
        }
        
        if (record.getInTaskAttachmentId() != null) {
            sql.SET("in_task_attachment_id = #{inTaskAttachmentId,jdbcType=BIGINT}");
        }
        
        if (record.getAttachmentDesc() != null) {
            sql.SET("attachment_desc = #{attachmentDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskPrivateOwn() != null) {
            sql.SET("task_private_own = #{taskPrivateOwn,jdbcType=SMALLINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("task_attachment_id = #{taskAttachmentId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblTaskAttachmentExample example, boolean includeExamplePhrase) {
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