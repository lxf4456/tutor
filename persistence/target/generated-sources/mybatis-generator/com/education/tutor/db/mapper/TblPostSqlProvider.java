package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblPost;
import com.education.tutor.db.domain.TblPostExample.Criteria;
import com.education.tutor.db.domain.TblPostExample.Criterion;
import com.education.tutor.db.domain.TblPostExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblPostSqlProvider {

    public String countByExample(TblPostExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("post");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblPostExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("post");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblPost record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("post");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTopicId() != null) {
            sql.VALUES("topic_id", "#{topicId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageId() != null) {
            sql.VALUES("message_id", "#{messageId,jdbcType=BIGINT}");
        }
        
        if (record.getPostTitle() != null) {
            sql.VALUES("post_title", "#{postTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPostContent() != null) {
            sql.VALUES("post_content", "#{postContent,jdbcType=VARCHAR}");
        }
        
        if (record.getPostUrl() != null) {
            sql.VALUES("post_url", "#{postUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPostState() != null) {
            sql.VALUES("post_state", "#{postState,jdbcType=INTEGER}");
        }
        
        if (record.getKeywords() != null) {
            sql.VALUES("keywords", "#{keywords,jdbcType=VARCHAR}");
        }
        
        if (record.getPostAbstract() != null) {
            sql.VALUES("post_abstract", "#{postAbstract,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblPostExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("post_id");
        } else {
            sql.SELECT("post_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("topic_id");
        sql.SELECT("message_id");
        sql.SELECT("post_title");
        sql.SELECT("post_content");
        sql.SELECT("post_url");
        sql.SELECT("post_state");
        sql.SELECT("keywords");
        sql.SELECT("post_abstract");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("post");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblPost record = (TblPost) parameter.get("record");
        TblPostExample example = (TblPostExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("post");
        
        if (record.getPostId() != null) {
            sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTopicId() != null) {
            sql.SET("topic_id = #{record.topicId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageId() != null) {
            sql.SET("message_id = #{record.messageId,jdbcType=BIGINT}");
        }
        
        if (record.getPostTitle() != null) {
            sql.SET("post_title = #{record.postTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPostContent() != null) {
            sql.SET("post_content = #{record.postContent,jdbcType=VARCHAR}");
        }
        
        if (record.getPostUrl() != null) {
            sql.SET("post_url = #{record.postUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPostState() != null) {
            sql.SET("post_state = #{record.postState,jdbcType=INTEGER}");
        }
        
        if (record.getKeywords() != null) {
            sql.SET("keywords = #{record.keywords,jdbcType=VARCHAR}");
        }
        
        if (record.getPostAbstract() != null) {
            sql.SET("post_abstract = #{record.postAbstract,jdbcType=VARCHAR}");
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
        sql.UPDATE("post");
        
        sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("topic_id = #{record.topicId,jdbcType=BIGINT}");
        sql.SET("message_id = #{record.messageId,jdbcType=BIGINT}");
        sql.SET("post_title = #{record.postTitle,jdbcType=VARCHAR}");
        sql.SET("post_content = #{record.postContent,jdbcType=VARCHAR}");
        sql.SET("post_url = #{record.postUrl,jdbcType=VARCHAR}");
        sql.SET("post_state = #{record.postState,jdbcType=INTEGER}");
        sql.SET("keywords = #{record.keywords,jdbcType=VARCHAR}");
        sql.SET("post_abstract = #{record.postAbstract,jdbcType=VARCHAR}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblPostExample example = (TblPostExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblPost record) {
        SQL sql = new SQL();
        sql.UPDATE("post");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTopicId() != null) {
            sql.SET("topic_id = #{topicId,jdbcType=BIGINT}");
        }
        
        if (record.getMessageId() != null) {
            sql.SET("message_id = #{messageId,jdbcType=BIGINT}");
        }
        
        if (record.getPostTitle() != null) {
            sql.SET("post_title = #{postTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPostContent() != null) {
            sql.SET("post_content = #{postContent,jdbcType=VARCHAR}");
        }
        
        if (record.getPostUrl() != null) {
            sql.SET("post_url = #{postUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPostState() != null) {
            sql.SET("post_state = #{postState,jdbcType=INTEGER}");
        }
        
        if (record.getKeywords() != null) {
            sql.SET("keywords = #{keywords,jdbcType=VARCHAR}");
        }
        
        if (record.getPostAbstract() != null) {
            sql.SET("post_abstract = #{postAbstract,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("post_id = #{postId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblPostExample example, boolean includeExamplePhrase) {
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