package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblCommentsOnPost;
import com.education.tutor.db.domain.TblCommentsOnPostExample.Criteria;
import com.education.tutor.db.domain.TblCommentsOnPostExample.Criterion;
import com.education.tutor.db.domain.TblCommentsOnPostExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblCommentsOnPostSqlProvider {

    public String countByExample(TblCommentsOnPostExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("comments_on_post");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblCommentsOnPostExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("comments_on_post");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblCommentsOnPost record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("comments_on_post");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.VALUES("post_id", "#{postId,jdbcType=BIGINT}");
        }
        
        if (record.getPollId() != null) {
            sql.VALUES("poll_id", "#{pollId,jdbcType=BIGINT}");
        }
        
        if (record.getCommentType() != null) {
            sql.VALUES("comment_type", "#{commentType,jdbcType=INTEGER}");
        }
        
        if (record.getCommentContent() != null) {
            sql.VALUES("comment_content", "#{commentContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentUrl() != null) {
            sql.VALUES("comment_url", "#{commentUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentState() != null) {
            sql.VALUES("comment_state", "#{commentState,jdbcType=INTEGER}");
        }
        
        if (record.getTargetUserId() != null) {
            sql.VALUES("target_user_id", "#{targetUserId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetCommentsId() != null) {
            sql.VALUES("target_comments_id", "#{targetCommentsId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblCommentsOnPostExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("comments_on_post_id");
        } else {
            sql.SELECT("comments_on_post_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("post_id");
        sql.SELECT("poll_id");
        sql.SELECT("comment_type");
        sql.SELECT("comment_content");
        sql.SELECT("comment_url");
        sql.SELECT("comment_state");
        sql.SELECT("target_user_id");
        sql.SELECT("target_comments_id");
        sql.SELECT("updated_at");
        sql.FROM("comments_on_post");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblCommentsOnPost record = (TblCommentsOnPost) parameter.get("record");
        TblCommentsOnPostExample example = (TblCommentsOnPostExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("comments_on_post");
        
        if (record.getCommentsOnPostId() != null) {
            sql.SET("comments_on_post_id = #{record.commentsOnPostId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        }
        
        if (record.getPollId() != null) {
            sql.SET("poll_id = #{record.pollId,jdbcType=BIGINT}");
        }
        
        if (record.getCommentType() != null) {
            sql.SET("comment_type = #{record.commentType,jdbcType=INTEGER}");
        }
        
        if (record.getCommentContent() != null) {
            sql.SET("comment_content = #{record.commentContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentUrl() != null) {
            sql.SET("comment_url = #{record.commentUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentState() != null) {
            sql.SET("comment_state = #{record.commentState,jdbcType=INTEGER}");
        }
        
        if (record.getTargetUserId() != null) {
            sql.SET("target_user_id = #{record.targetUserId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetCommentsId() != null) {
            sql.SET("target_comments_id = #{record.targetCommentsId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("comments_on_post");
        
        sql.SET("comments_on_post_id = #{record.commentsOnPostId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        sql.SET("poll_id = #{record.pollId,jdbcType=BIGINT}");
        sql.SET("comment_type = #{record.commentType,jdbcType=INTEGER}");
        sql.SET("comment_content = #{record.commentContent,jdbcType=VARCHAR}");
        sql.SET("comment_url = #{record.commentUrl,jdbcType=VARCHAR}");
        sql.SET("comment_state = #{record.commentState,jdbcType=INTEGER}");
        sql.SET("target_user_id = #{record.targetUserId,jdbcType=BIGINT}");
        sql.SET("target_comments_id = #{record.targetCommentsId,jdbcType=BIGINT}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblCommentsOnPostExample example = (TblCommentsOnPostExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblCommentsOnPost record) {
        SQL sql = new SQL();
        sql.UPDATE("comments_on_post");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.SET("post_id = #{postId,jdbcType=BIGINT}");
        }
        
        if (record.getPollId() != null) {
            sql.SET("poll_id = #{pollId,jdbcType=BIGINT}");
        }
        
        if (record.getCommentType() != null) {
            sql.SET("comment_type = #{commentType,jdbcType=INTEGER}");
        }
        
        if (record.getCommentContent() != null) {
            sql.SET("comment_content = #{commentContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentUrl() != null) {
            sql.SET("comment_url = #{commentUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentState() != null) {
            sql.SET("comment_state = #{commentState,jdbcType=INTEGER}");
        }
        
        if (record.getTargetUserId() != null) {
            sql.SET("target_user_id = #{targetUserId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetCommentsId() != null) {
            sql.SET("target_comments_id = #{targetCommentsId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("comments_on_post_id = #{commentsOnPostId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblCommentsOnPostExample example, boolean includeExamplePhrase) {
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