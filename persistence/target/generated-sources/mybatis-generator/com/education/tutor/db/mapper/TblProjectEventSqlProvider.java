package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblProjectEvent;
import com.education.tutor.db.domain.TblProjectEventExample.Criteria;
import com.education.tutor.db.domain.TblProjectEventExample.Criterion;
import com.education.tutor.db.domain.TblProjectEventExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblProjectEventSqlProvider {

    public String countByExample(TblProjectEventExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("project_event");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblProjectEventExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("project_event");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblProjectEvent record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("project_event");
        
        if (record.getProjectId() != null) {
            sql.VALUES("project_id", "#{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getEventType() != null) {
            sql.VALUES("event_type", "#{eventType,jdbcType=INTEGER}");
        }
        
        if (record.getEventDesc() != null) {
            sql.VALUES("event_desc", "#{eventDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getEventSolution() != null) {
            sql.VALUES("event_solution", "#{eventSolution,jdbcType=VARCHAR}");
        }
        
        if (record.getEventRemark() != null) {
            sql.VALUES("event_remark", "#{eventRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getEventOccurTime() != null) {
            sql.VALUES("event_occur_time", "#{eventOccurTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEventProducer() != null) {
            sql.VALUES("event_producer", "#{eventProducer,jdbcType=VARCHAR}");
        }
        
        if (record.getEventProcessor() != null) {
            sql.VALUES("event_processor", "#{eventProcessor,jdbcType=VARCHAR}");
        }
        
        if (record.getEventResult() != null) {
            sql.VALUES("event_result", "#{eventResult,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblProjectEventExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("project_event_id");
        } else {
            sql.SELECT("project_event_id");
        }
        sql.SELECT("project_id");
        sql.SELECT("event_type");
        sql.SELECT("event_desc");
        sql.SELECT("event_solution");
        sql.SELECT("event_remark");
        sql.SELECT("event_occur_time");
        sql.SELECT("event_producer");
        sql.SELECT("event_processor");
        sql.SELECT("event_result");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("project_event");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblProjectEvent record = (TblProjectEvent) parameter.get("record");
        TblProjectEventExample example = (TblProjectEventExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("project_event");
        
        if (record.getProjectEventId() != null) {
            sql.SET("project_event_id = #{record.projectEventId,jdbcType=BIGINT}");
        }
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        }
        
        if (record.getEventType() != null) {
            sql.SET("event_type = #{record.eventType,jdbcType=INTEGER}");
        }
        
        if (record.getEventDesc() != null) {
            sql.SET("event_desc = #{record.eventDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getEventSolution() != null) {
            sql.SET("event_solution = #{record.eventSolution,jdbcType=VARCHAR}");
        }
        
        if (record.getEventRemark() != null) {
            sql.SET("event_remark = #{record.eventRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getEventOccurTime() != null) {
            sql.SET("event_occur_time = #{record.eventOccurTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEventProducer() != null) {
            sql.SET("event_producer = #{record.eventProducer,jdbcType=VARCHAR}");
        }
        
        if (record.getEventProcessor() != null) {
            sql.SET("event_processor = #{record.eventProcessor,jdbcType=VARCHAR}");
        }
        
        if (record.getEventResult() != null) {
            sql.SET("event_result = #{record.eventResult,jdbcType=VARCHAR}");
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
        sql.UPDATE("project_event");
        
        sql.SET("project_event_id = #{record.projectEventId,jdbcType=BIGINT}");
        sql.SET("project_id = #{record.projectId,jdbcType=BIGINT}");
        sql.SET("event_type = #{record.eventType,jdbcType=INTEGER}");
        sql.SET("event_desc = #{record.eventDesc,jdbcType=VARCHAR}");
        sql.SET("event_solution = #{record.eventSolution,jdbcType=VARCHAR}");
        sql.SET("event_remark = #{record.eventRemark,jdbcType=VARCHAR}");
        sql.SET("event_occur_time = #{record.eventOccurTime,jdbcType=TIMESTAMP}");
        sql.SET("event_producer = #{record.eventProducer,jdbcType=VARCHAR}");
        sql.SET("event_processor = #{record.eventProcessor,jdbcType=VARCHAR}");
        sql.SET("event_result = #{record.eventResult,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblProjectEventExample example = (TblProjectEventExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblProjectEvent record) {
        SQL sql = new SQL();
        sql.UPDATE("project_event");
        
        if (record.getProjectId() != null) {
            sql.SET("project_id = #{projectId,jdbcType=BIGINT}");
        }
        
        if (record.getEventType() != null) {
            sql.SET("event_type = #{eventType,jdbcType=INTEGER}");
        }
        
        if (record.getEventDesc() != null) {
            sql.SET("event_desc = #{eventDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getEventSolution() != null) {
            sql.SET("event_solution = #{eventSolution,jdbcType=VARCHAR}");
        }
        
        if (record.getEventRemark() != null) {
            sql.SET("event_remark = #{eventRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getEventOccurTime() != null) {
            sql.SET("event_occur_time = #{eventOccurTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEventProducer() != null) {
            sql.SET("event_producer = #{eventProducer,jdbcType=VARCHAR}");
        }
        
        if (record.getEventProcessor() != null) {
            sql.SET("event_processor = #{eventProcessor,jdbcType=VARCHAR}");
        }
        
        if (record.getEventResult() != null) {
            sql.SET("event_result = #{eventResult,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("project_event_id = #{projectEventId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblProjectEventExample example, boolean includeExamplePhrase) {
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