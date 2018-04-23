package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblNoticeBoard;
import com.education.tutor.db.domain.TblNoticeBoardExample.Criteria;
import com.education.tutor.db.domain.TblNoticeBoardExample.Criterion;
import com.education.tutor.db.domain.TblNoticeBoardExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblNoticeBoardSqlProvider {

    public String countByExample(TblNoticeBoardExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("notice_board");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblNoticeBoardExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("notice_board");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblNoticeBoard record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("notice_board");
        
        if (record.getNoticeDesc() != null) {
            sql.VALUES("notice_desc", "#{noticeDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeUrl() != null) {
            sql.VALUES("notice_url", "#{noticeUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeState() != null) {
            sql.VALUES("notice_state", "#{noticeState,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeType() != null) {
            sql.VALUES("notice_type", "#{noticeType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.VALUES("target_pk", "#{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getEffectiveStart() != null) {
            sql.VALUES("effective_start", "#{effectiveStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectiveEnd() != null) {
            sql.VALUES("effective_end", "#{effectiveEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblNoticeBoardExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("notice_board_id");
        } else {
            sql.SELECT("notice_board_id");
        }
        sql.SELECT("notice_desc");
        sql.SELECT("notice_url");
        sql.SELECT("notice_state");
        sql.SELECT("notice_type");
        sql.SELECT("target_pk");
        sql.SELECT("effective_start");
        sql.SELECT("effective_end");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("notice_board");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblNoticeBoard record = (TblNoticeBoard) parameter.get("record");
        TblNoticeBoardExample example = (TblNoticeBoardExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("notice_board");
        
        if (record.getNoticeBoardId() != null) {
            sql.SET("notice_board_id = #{record.noticeBoardId,jdbcType=BIGINT}");
        }
        
        if (record.getNoticeDesc() != null) {
            sql.SET("notice_desc = #{record.noticeDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeUrl() != null) {
            sql.SET("notice_url = #{record.noticeUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeState() != null) {
            sql.SET("notice_state = #{record.noticeState,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeType() != null) {
            sql.SET("notice_type = #{record.noticeType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getEffectiveStart() != null) {
            sql.SET("effective_start = #{record.effectiveStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectiveEnd() != null) {
            sql.SET("effective_end = #{record.effectiveEnd,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("notice_board");
        
        sql.SET("notice_board_id = #{record.noticeBoardId,jdbcType=BIGINT}");
        sql.SET("notice_desc = #{record.noticeDesc,jdbcType=VARCHAR}");
        sql.SET("notice_url = #{record.noticeUrl,jdbcType=VARCHAR}");
        sql.SET("notice_state = #{record.noticeState,jdbcType=INTEGER}");
        sql.SET("notice_type = #{record.noticeType,jdbcType=INTEGER}");
        sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        sql.SET("effective_start = #{record.effectiveStart,jdbcType=TIMESTAMP}");
        sql.SET("effective_end = #{record.effectiveEnd,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblNoticeBoardExample example = (TblNoticeBoardExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblNoticeBoard record) {
        SQL sql = new SQL();
        sql.UPDATE("notice_board");
        
        if (record.getNoticeDesc() != null) {
            sql.SET("notice_desc = #{noticeDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeUrl() != null) {
            sql.SET("notice_url = #{noticeUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeState() != null) {
            sql.SET("notice_state = #{noticeState,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeType() != null) {
            sql.SET("notice_type = #{noticeType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getEffectiveStart() != null) {
            sql.SET("effective_start = #{effectiveStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectiveEnd() != null) {
            sql.SET("effective_end = #{effectiveEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("notice_board_id = #{noticeBoardId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblNoticeBoardExample example, boolean includeExamplePhrase) {
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