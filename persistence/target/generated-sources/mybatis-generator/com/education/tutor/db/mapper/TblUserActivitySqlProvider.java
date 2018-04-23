package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserActivity;
import com.education.tutor.db.domain.TblUserActivityExample.Criteria;
import com.education.tutor.db.domain.TblUserActivityExample.Criterion;
import com.education.tutor.db.domain.TblUserActivityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblUserActivitySqlProvider {

    public String countByExample(TblUserActivityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_activity");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblUserActivityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_activity");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblUserActivity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_activity");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getUserActivityName() != null) {
            sql.VALUES("user_activity_name", "#{userActivityName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityType() != null) {
            sql.VALUES("user_activity_type", "#{userActivityType,jdbcType=INTEGER}");
        }
        
        if (record.getTarget() != null) {
            sql.VALUES("target", "#{target,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetType() != null) {
            sql.VALUES("target_type", "#{targetType,jdbcType=INTEGER}");
        }
        
        if (record.getMessage() != null) {
            sql.VALUES("message", "#{message,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityState() != null) {
            sql.VALUES("user_activity_state", "#{userActivityState,jdbcType=INTEGER}");
        }
        
        if (record.getUserActivityResult() != null) {
            sql.VALUES("user_activity_result", "#{userActivityResult,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            sql.VALUES("method", "#{method,jdbcType=VARCHAR}");
        }
        
        if (record.getMedia() != null) {
            sql.VALUES("media", "#{media,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getPromotion() != null) {
            sql.VALUES("promotion", "#{promotion,jdbcType=VARCHAR}");
        }
        
        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=VARCHAR}");
        }
        
        if (record.getActTime() != null) {
            sql.VALUES("act_time", "#{actTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblUserActivityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("user_activity_id");
        } else {
            sql.SELECT("user_activity_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("user_activity_name");
        sql.SELECT("user_activity_type");
        sql.SELECT("target");
        sql.SELECT("target_type");
        sql.SELECT("message");
        sql.SELECT("user_activity_state");
        sql.SELECT("user_activity_result");
        sql.SELECT("method");
        sql.SELECT("media");
        sql.SELECT("remark");
        sql.SELECT("url");
        sql.SELECT("promotion");
        sql.SELECT("source");
        sql.SELECT("act_time");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("user_activity");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblUserActivity record = (TblUserActivity) parameter.get("record");
        TblUserActivityExample example = (TblUserActivityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_activity");
        
        if (record.getUserActivityId() != null) {
            sql.SET("user_activity_id = #{record.userActivityId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getUserActivityName() != null) {
            sql.SET("user_activity_name = #{record.userActivityName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityType() != null) {
            sql.SET("user_activity_type = #{record.userActivityType,jdbcType=INTEGER}");
        }
        
        if (record.getTarget() != null) {
            sql.SET("target = #{record.target,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetType() != null) {
            sql.SET("target_type = #{record.targetType,jdbcType=INTEGER}");
        }
        
        if (record.getMessage() != null) {
            sql.SET("message = #{record.message,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityState() != null) {
            sql.SET("user_activity_state = #{record.userActivityState,jdbcType=INTEGER}");
        }
        
        if (record.getUserActivityResult() != null) {
            sql.SET("user_activity_result = #{record.userActivityResult,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            sql.SET("method = #{record.method,jdbcType=VARCHAR}");
        }
        
        if (record.getMedia() != null) {
            sql.SET("media = #{record.media,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getPromotion() != null) {
            sql.SET("promotion = #{record.promotion,jdbcType=VARCHAR}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{record.source,jdbcType=VARCHAR}");
        }
        
        if (record.getActTime() != null) {
            sql.SET("act_time = #{record.actTime,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("user_activity");
        
        sql.SET("user_activity_id = #{record.userActivityId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("user_activity_name = #{record.userActivityName,jdbcType=VARCHAR}");
        sql.SET("user_activity_type = #{record.userActivityType,jdbcType=INTEGER}");
        sql.SET("target = #{record.target,jdbcType=VARCHAR}");
        sql.SET("target_type = #{record.targetType,jdbcType=INTEGER}");
        sql.SET("message = #{record.message,jdbcType=VARCHAR}");
        sql.SET("user_activity_state = #{record.userActivityState,jdbcType=INTEGER}");
        sql.SET("user_activity_result = #{record.userActivityResult,jdbcType=VARCHAR}");
        sql.SET("method = #{record.method,jdbcType=VARCHAR}");
        sql.SET("media = #{record.media,jdbcType=VARCHAR}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        sql.SET("promotion = #{record.promotion,jdbcType=VARCHAR}");
        sql.SET("source = #{record.source,jdbcType=VARCHAR}");
        sql.SET("act_time = #{record.actTime,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblUserActivityExample example = (TblUserActivityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblUserActivity record) {
        SQL sql = new SQL();
        sql.UPDATE("user_activity");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getUserActivityName() != null) {
            sql.SET("user_activity_name = #{userActivityName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityType() != null) {
            sql.SET("user_activity_type = #{userActivityType,jdbcType=INTEGER}");
        }
        
        if (record.getTarget() != null) {
            sql.SET("target = #{target,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetType() != null) {
            sql.SET("target_type = #{targetType,jdbcType=INTEGER}");
        }
        
        if (record.getMessage() != null) {
            sql.SET("message = #{message,jdbcType=VARCHAR}");
        }
        
        if (record.getUserActivityState() != null) {
            sql.SET("user_activity_state = #{userActivityState,jdbcType=INTEGER}");
        }
        
        if (record.getUserActivityResult() != null) {
            sql.SET("user_activity_result = #{userActivityResult,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            sql.SET("method = #{method,jdbcType=VARCHAR}");
        }
        
        if (record.getMedia() != null) {
            sql.SET("media = #{media,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getPromotion() != null) {
            sql.SET("promotion = #{promotion,jdbcType=VARCHAR}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=VARCHAR}");
        }
        
        if (record.getActTime() != null) {
            sql.SET("act_time = #{actTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("user_activity_id = #{userActivityId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblUserActivityExample example, boolean includeExamplePhrase) {
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