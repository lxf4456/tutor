package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGroupMessageState;
import com.education.tutor.db.domain.TblGroupMessageStateExample.Criteria;
import com.education.tutor.db.domain.TblGroupMessageStateExample.Criterion;
import com.education.tutor.db.domain.TblGroupMessageStateExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblGroupMessageStateSqlProvider {

    public String countByExample(TblGroupMessageStateExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("group_message_state");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblGroupMessageStateExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("group_message_state");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblGroupMessageState record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("group_message_state");
        
        if (record.getUserSocialGroupId() != null) {
            sql.VALUES("user_social_group_id", "#{userSocialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageId() != null) {
            sql.VALUES("message_id", "#{messageId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblGroupMessageStateExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("group_message_state_id");
        } else {
            sql.SELECT("group_message_state_id");
        }
        sql.SELECT("user_social_group_id");
        sql.SELECT("message_id");
        sql.SELECT("status");
        sql.FROM("group_message_state");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblGroupMessageState record = (TblGroupMessageState) parameter.get("record");
        TblGroupMessageStateExample example = (TblGroupMessageStateExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("group_message_state");
        
        if (record.getGroupMessageStateId() != null) {
            sql.SET("group_message_state_id = #{record.groupMessageStateId,jdbcType=BIGINT}");
        }
        
        if (record.getUserSocialGroupId() != null) {
            sql.SET("user_social_group_id = #{record.userSocialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageId() != null) {
            sql.SET("message_id = #{record.messageId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("group_message_state");
        
        sql.SET("group_message_state_id = #{record.groupMessageStateId,jdbcType=BIGINT}");
        sql.SET("user_social_group_id = #{record.userSocialGroupId,jdbcType=BIGINT}");
        sql.SET("message_id = #{record.messageId,jdbcType=BIGINT}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        
        TblGroupMessageStateExample example = (TblGroupMessageStateExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblGroupMessageState record) {
        SQL sql = new SQL();
        sql.UPDATE("group_message_state");
        
        if (record.getUserSocialGroupId() != null) {
            sql.SET("user_social_group_id = #{userSocialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageId() != null) {
            sql.SET("message_id = #{messageId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        sql.WHERE("group_message_state_id = #{groupMessageStateId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblGroupMessageStateExample example, boolean includeExamplePhrase) {
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