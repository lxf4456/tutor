package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblMessage;
import com.education.tutor.db.domain.TblMessageExample.Criteria;
import com.education.tutor.db.domain.TblMessageExample.Criterion;
import com.education.tutor.db.domain.TblMessageExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblMessageSqlProvider {

    public String countByExample(TblMessageExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("message");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblMessageExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("message");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblMessage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("message");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupId() != null) {
            sql.VALUES("social_group_id", "#{socialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageContent() != null) {
            sql.VALUES("message_content", "#{messageContent,jdbcType=VARCHAR}");
        }
        
        if (record.getMessageType() != null) {
            sql.VALUES("message_type", "#{messageType,jdbcType=SMALLINT}");
        }
        
        if (record.getFromUserId() != null) {
            sql.VALUES("from_user_id", "#{fromUserId,jdbcType=BIGINT}");
        }
        
        if (record.getFromGroupId() != null) {
            sql.VALUES("from_group_id", "#{fromGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getToUserId() != null) {
            sql.VALUES("to_user_id", "#{toUserId,jdbcType=BIGINT}");
        }
        
        if (record.getToGroupId() != null) {
            sql.VALUES("to_group_id", "#{toGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRevokedAt() != null) {
            sql.VALUES("revoked_at", "#{revokedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblMessageExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("message_id");
        } else {
            sql.SELECT("message_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("social_group_id");
        sql.SELECT("message_content");
        sql.SELECT("message_type");
        sql.SELECT("from_user_id");
        sql.SELECT("from_group_id");
        sql.SELECT("to_user_id");
        sql.SELECT("to_group_id");
        sql.SELECT("status");
        sql.SELECT("created_at");
        sql.SELECT("revoked_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("message");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblMessage record = (TblMessage) parameter.get("record");
        TblMessageExample example = (TblMessageExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("message");
        
        if (record.getMessageId() != null) {
            sql.SET("message_id = #{record.messageId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupId() != null) {
            sql.SET("social_group_id = #{record.socialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageContent() != null) {
            sql.SET("message_content = #{record.messageContent,jdbcType=VARCHAR}");
        }
        
        if (record.getMessageType() != null) {
            sql.SET("message_type = #{record.messageType,jdbcType=SMALLINT}");
        }
        
        if (record.getFromUserId() != null) {
            sql.SET("from_user_id = #{record.fromUserId,jdbcType=BIGINT}");
        }
        
        if (record.getFromGroupId() != null) {
            sql.SET("from_group_id = #{record.fromGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getToUserId() != null) {
            sql.SET("to_user_id = #{record.toUserId,jdbcType=BIGINT}");
        }
        
        if (record.getToGroupId() != null) {
            sql.SET("to_group_id = #{record.toGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRevokedAt() != null) {
            sql.SET("revoked_at = #{record.revokedAt,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("message");
        
        sql.SET("message_id = #{record.messageId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("social_group_id = #{record.socialGroupId,jdbcType=BIGINT}");
        sql.SET("message_content = #{record.messageContent,jdbcType=VARCHAR}");
        sql.SET("message_type = #{record.messageType,jdbcType=SMALLINT}");
        sql.SET("from_user_id = #{record.fromUserId,jdbcType=BIGINT}");
        sql.SET("from_group_id = #{record.fromGroupId,jdbcType=BIGINT}");
        sql.SET("to_user_id = #{record.toUserId,jdbcType=BIGINT}");
        sql.SET("to_group_id = #{record.toGroupId,jdbcType=BIGINT}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("revoked_at = #{record.revokedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblMessageExample example = (TblMessageExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblMessage record) {
        SQL sql = new SQL();
        sql.UPDATE("message");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupId() != null) {
            sql.SET("social_group_id = #{socialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageContent() != null) {
            sql.SET("message_content = #{messageContent,jdbcType=VARCHAR}");
        }
        
        if (record.getMessageType() != null) {
            sql.SET("message_type = #{messageType,jdbcType=SMALLINT}");
        }
        
        if (record.getFromUserId() != null) {
            sql.SET("from_user_id = #{fromUserId,jdbcType=BIGINT}");
        }
        
        if (record.getFromGroupId() != null) {
            sql.SET("from_group_id = #{fromGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getToUserId() != null) {
            sql.SET("to_user_id = #{toUserId,jdbcType=BIGINT}");
        }
        
        if (record.getToGroupId() != null) {
            sql.SET("to_group_id = #{toGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRevokedAt() != null) {
            sql.SET("revoked_at = #{revokedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("message_id = #{messageId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblMessageExample example, boolean includeExamplePhrase) {
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