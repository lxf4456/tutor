package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserInteraction;
import com.education.tutor.db.domain.TblUserInteractionExample.Criteria;
import com.education.tutor.db.domain.TblUserInteractionExample.Criterion;
import com.education.tutor.db.domain.TblUserInteractionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblUserInteractionSqlProvider {

    public String countByExample(TblUserInteractionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_interaction");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblUserInteractionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_interaction");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblUserInteraction record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_interaction");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetType() != null) {
            sql.VALUES("target_type", "#{targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.VALUES("target_pk", "#{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getTargetUrl() != null) {
            sql.VALUES("target_url", "#{targetUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getInteractionType() != null) {
            sql.VALUES("interaction_type", "#{interactionType,jdbcType=INTEGER}");
        }
        
        if (record.getInteractionValue() != null) {
            sql.VALUES("interaction_value", "#{interactionValue,jdbcType=VARCHAR}");
        }
        
        if (record.getInteractionAt() != null) {
            sql.VALUES("interaction_at", "#{interactionAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getShareOutTo() != null) {
            sql.VALUES("share_out_to", "#{shareOutTo,jdbcType=VARCHAR}");
        }
        
        if (record.getComments() != null) {
            sql.VALUES("comments", "#{comments,jdbcType=VARCHAR}");
        }
        
        if (record.getRevokeFlag() != null) {
            sql.VALUES("revoke_flag", "#{revokeFlag,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetUserId() != null) {
            sql.VALUES("target_user_id", "#{targetUserId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblUserInteractionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("user_interaction_id");
        } else {
            sql.SELECT("user_interaction_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("target_type");
        sql.SELECT("target_pk");
        sql.SELECT("target_url");
        sql.SELECT("interaction_type");
        sql.SELECT("interaction_value");
        sql.SELECT("interaction_at");
        sql.SELECT("share_out_to");
        sql.SELECT("comments");
        sql.SELECT("revoke_flag");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.SELECT("target_user_id");
        sql.FROM("user_interaction");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblUserInteraction record = (TblUserInteraction) parameter.get("record");
        TblUserInteractionExample example = (TblUserInteractionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_interaction");
        
        if (record.getUserInteractionId() != null) {
            sql.SET("user_interaction_id = #{record.userInteractionId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetType() != null) {
            sql.SET("target_type = #{record.targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getTargetUrl() != null) {
            sql.SET("target_url = #{record.targetUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getInteractionType() != null) {
            sql.SET("interaction_type = #{record.interactionType,jdbcType=INTEGER}");
        }
        
        if (record.getInteractionValue() != null) {
            sql.SET("interaction_value = #{record.interactionValue,jdbcType=VARCHAR}");
        }
        
        if (record.getInteractionAt() != null) {
            sql.SET("interaction_at = #{record.interactionAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getShareOutTo() != null) {
            sql.SET("share_out_to = #{record.shareOutTo,jdbcType=VARCHAR}");
        }
        
        if (record.getComments() != null) {
            sql.SET("comments = #{record.comments,jdbcType=VARCHAR}");
        }
        
        if (record.getRevokeFlag() != null) {
            sql.SET("revoke_flag = #{record.revokeFlag,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetUserId() != null) {
            sql.SET("target_user_id = #{record.targetUserId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user_interaction");
        
        sql.SET("user_interaction_id = #{record.userInteractionId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("target_type = #{record.targetType,jdbcType=INTEGER}");
        sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        sql.SET("target_url = #{record.targetUrl,jdbcType=VARCHAR}");
        sql.SET("interaction_type = #{record.interactionType,jdbcType=INTEGER}");
        sql.SET("interaction_value = #{record.interactionValue,jdbcType=VARCHAR}");
        sql.SET("interaction_at = #{record.interactionAt,jdbcType=TIMESTAMP}");
        sql.SET("share_out_to = #{record.shareOutTo,jdbcType=VARCHAR}");
        sql.SET("comments = #{record.comments,jdbcType=VARCHAR}");
        sql.SET("revoke_flag = #{record.revokeFlag,jdbcType=INTEGER}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("target_user_id = #{record.targetUserId,jdbcType=BIGINT}");
        
        TblUserInteractionExample example = (TblUserInteractionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblUserInteraction record) {
        SQL sql = new SQL();
        sql.UPDATE("user_interaction");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetType() != null) {
            sql.SET("target_type = #{targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getTargetUrl() != null) {
            sql.SET("target_url = #{targetUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getInteractionType() != null) {
            sql.SET("interaction_type = #{interactionType,jdbcType=INTEGER}");
        }
        
        if (record.getInteractionValue() != null) {
            sql.SET("interaction_value = #{interactionValue,jdbcType=VARCHAR}");
        }
        
        if (record.getInteractionAt() != null) {
            sql.SET("interaction_at = #{interactionAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getShareOutTo() != null) {
            sql.SET("share_out_to = #{shareOutTo,jdbcType=VARCHAR}");
        }
        
        if (record.getComments() != null) {
            sql.SET("comments = #{comments,jdbcType=VARCHAR}");
        }
        
        if (record.getRevokeFlag() != null) {
            sql.SET("revoke_flag = #{revokeFlag,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetUserId() != null) {
            sql.SET("target_user_id = #{targetUserId,jdbcType=BIGINT}");
        }
        
        sql.WHERE("user_interaction_id = #{userInteractionId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblUserInteractionExample example, boolean includeExamplePhrase) {
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