package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserFeedBack;
import com.education.tutor.db.domain.TblUserFeedBackExample.Criteria;
import com.education.tutor.db.domain.TblUserFeedBackExample.Criterion;
import com.education.tutor.db.domain.TblUserFeedBackExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblUserFeedBackSqlProvider {

    public String countByExample(TblUserFeedBackExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_feed_back");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblUserFeedBackExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_feed_back");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblUserFeedBack record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_feed_back");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getFeedBackContent() != null) {
            sql.VALUES("feed_back_content", "#{feedBackContent,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedBackState() != null) {
            sql.VALUES("feed_back_state", "#{feedBackState,jdbcType=SMALLINT}");
        }
        
        if (record.getProcessBy() != null) {
            sql.VALUES("process_by", "#{processBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblUserFeedBackExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("user_feed_back_id");
        } else {
            sql.SELECT("user_feed_back_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("feed_back_content");
        sql.SELECT("feed_back_state");
        sql.SELECT("process_by");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("user_feed_back");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblUserFeedBack record = (TblUserFeedBack) parameter.get("record");
        TblUserFeedBackExample example = (TblUserFeedBackExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_feed_back");
        
        if (record.getUserFeedBackId() != null) {
            sql.SET("user_feed_back_id = #{record.userFeedBackId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getFeedBackContent() != null) {
            sql.SET("feed_back_content = #{record.feedBackContent,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedBackState() != null) {
            sql.SET("feed_back_state = #{record.feedBackState,jdbcType=SMALLINT}");
        }
        
        if (record.getProcessBy() != null) {
            sql.SET("process_by = #{record.processBy,jdbcType=VARCHAR}");
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
        sql.UPDATE("user_feed_back");
        
        sql.SET("user_feed_back_id = #{record.userFeedBackId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("feed_back_content = #{record.feedBackContent,jdbcType=VARCHAR}");
        sql.SET("feed_back_state = #{record.feedBackState,jdbcType=SMALLINT}");
        sql.SET("process_by = #{record.processBy,jdbcType=VARCHAR}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblUserFeedBackExample example = (TblUserFeedBackExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblUserFeedBack record) {
        SQL sql = new SQL();
        sql.UPDATE("user_feed_back");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getFeedBackContent() != null) {
            sql.SET("feed_back_content = #{feedBackContent,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedBackState() != null) {
            sql.SET("feed_back_state = #{feedBackState,jdbcType=SMALLINT}");
        }
        
        if (record.getProcessBy() != null) {
            sql.SET("process_by = #{processBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("user_feed_back_id = #{userFeedBackId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblUserFeedBackExample example, boolean includeExamplePhrase) {
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