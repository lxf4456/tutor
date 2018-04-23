package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTopic;
import com.education.tutor.db.domain.TblTopicExample.Criteria;
import com.education.tutor.db.domain.TblTopicExample.Criterion;
import com.education.tutor.db.domain.TblTopicExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblTopicSqlProvider {

    public String countByExample(TblTopicExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("topic");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblTopicExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("topic");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblTopic record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("topic");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTopicTitle() != null) {
            sql.VALUES("topic_title", "#{topicTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicAbstract() != null) {
            sql.VALUES("topic_abstract", "#{topicAbstract,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicKeywords() != null) {
            sql.VALUES("topic_keywords", "#{topicKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicType() != null) {
            sql.VALUES("topic_type", "#{topicType,jdbcType=INTEGER}");
        }
        
        if (record.getTopicComment() != null) {
            sql.VALUES("topic_comment", "#{topicComment,jdbcType=BIGINT}");
        }
        
        if (record.getTopicMogoid() != null) {
            sql.VALUES("topic_mogoid", "#{topicMogoid,jdbcType=BIGINT}");
        }
        
        if (record.getTopicUrl() != null) {
            sql.VALUES("topic_url", "#{topicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicState() != null) {
            sql.VALUES("topic_state", "#{topicState,jdbcType=INTEGER}");
        }
        
        if (record.getTopicSource() != null) {
            sql.VALUES("topic_source", "#{topicSource,jdbcType=INTEGER}");
        }
        
        if (record.getDefaultLang() != null) {
            sql.VALUES("default_lang", "#{defaultLang,jdbcType=CHAR}");
        }
        
        if (record.getParentTopic() != null) {
            sql.VALUES("parent_topic", "#{parentTopic,jdbcType=BIGINT}");
        }
        
        if (record.getRecommandLevel() != null) {
            sql.VALUES("recommand_level", "#{recommandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getTopicUpvote() != null) {
            sql.VALUES("topic_upvote", "#{topicUpvote,jdbcType=BIGINT}");
        }
        
        if (record.getTopicTread() != null) {
            sql.VALUES("topic_tread", "#{topicTread,jdbcType=BIGINT}");
        }
        
        if (record.getTopicRewardNum() != null) {
            sql.VALUES("topic_reward_num", "#{topicRewardNum,jdbcType=BIGINT}");
        }
        
        if (record.getTopicCollect() != null) {
            sql.VALUES("topic_collect", "#{topicCollect,jdbcType=BIGINT}");
        }
        
        if (record.getTopicReward() != null) {
            sql.VALUES("topic_reward", "#{topicReward,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupPk() != null) {
            sql.VALUES("social_group_pk", "#{socialGroupPk,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getIsStick() != null) {
            sql.VALUES("is_stick", "#{isStick,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=INTEGER}");
        }
        
        if (record.getIsPrivate() != null) {
            sql.VALUES("is_private", "#{isPrivate,jdbcType=INTEGER}");
        }
        
        if (record.getSpiderOrganizationId() != null) {
            sql.VALUES("spider_organization_id", "#{spiderOrganizationId,jdbcType=BIGINT}");
        }
        
        if (record.getSpiderUrl() != null) {
            sql.VALUES("spider_url", "#{spiderUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            sql.VALUES("start_time", "#{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            sql.VALUES("end_time", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getHostPlace() != null) {
            sql.VALUES("host_place", "#{hostPlace,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicContent() != null) {
            sql.VALUES("topic_content", "#{topicContent,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(TblTopicExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("topic_id");
        } else {
            sql.SELECT("topic_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("topic_title");
        sql.SELECT("topic_abstract");
        sql.SELECT("topic_keywords");
        sql.SELECT("topic_type");
        sql.SELECT("topic_comment");
        sql.SELECT("topic_mogoid");
        sql.SELECT("topic_url");
        sql.SELECT("topic_state");
        sql.SELECT("topic_source");
        sql.SELECT("default_lang");
        sql.SELECT("parent_topic");
        sql.SELECT("recommand_level");
        sql.SELECT("topic_upvote");
        sql.SELECT("topic_tread");
        sql.SELECT("topic_reward_num");
        sql.SELECT("topic_collect");
        sql.SELECT("topic_reward");
        sql.SELECT("social_group_pk");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.SELECT("is_stick");
        sql.SELECT("price");
        sql.SELECT("is_private");
        sql.SELECT("spider_organization_id");
        sql.SELECT("spider_url");
        sql.SELECT("start_time");
        sql.SELECT("end_time");
        sql.SELECT("host_place");
        sql.SELECT("topic_content");
        sql.FROM("topic");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(TblTopicExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("topic_id");
        } else {
            sql.SELECT("topic_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("topic_title");
        sql.SELECT("topic_abstract");
        sql.SELECT("topic_keywords");
        sql.SELECT("topic_type");
        sql.SELECT("topic_comment");
        sql.SELECT("topic_mogoid");
        sql.SELECT("topic_url");
        sql.SELECT("topic_state");
        sql.SELECT("topic_source");
        sql.SELECT("default_lang");
        sql.SELECT("parent_topic");
        sql.SELECT("recommand_level");
        sql.SELECT("topic_upvote");
        sql.SELECT("topic_tread");
        sql.SELECT("topic_reward_num");
        sql.SELECT("topic_collect");
        sql.SELECT("topic_reward");
        sql.SELECT("social_group_pk");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.SELECT("is_stick");
        sql.SELECT("price");
        sql.SELECT("is_private");
        sql.SELECT("spider_organization_id");
        sql.SELECT("spider_url");
        sql.SELECT("start_time");
        sql.SELECT("end_time");
        sql.SELECT("host_place");
        sql.FROM("topic");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblTopic record = (TblTopic) parameter.get("record");
        TblTopicExample example = (TblTopicExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("topic");
        
        if (record.getTopicId() != null) {
            sql.SET("topic_id = #{record.topicId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTopicTitle() != null) {
            sql.SET("topic_title = #{record.topicTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicAbstract() != null) {
            sql.SET("topic_abstract = #{record.topicAbstract,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicKeywords() != null) {
            sql.SET("topic_keywords = #{record.topicKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicType() != null) {
            sql.SET("topic_type = #{record.topicType,jdbcType=INTEGER}");
        }
        
        if (record.getTopicComment() != null) {
            sql.SET("topic_comment = #{record.topicComment,jdbcType=BIGINT}");
        }
        
        if (record.getTopicMogoid() != null) {
            sql.SET("topic_mogoid = #{record.topicMogoid,jdbcType=BIGINT}");
        }
        
        if (record.getTopicUrl() != null) {
            sql.SET("topic_url = #{record.topicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicState() != null) {
            sql.SET("topic_state = #{record.topicState,jdbcType=INTEGER}");
        }
        
        if (record.getTopicSource() != null) {
            sql.SET("topic_source = #{record.topicSource,jdbcType=INTEGER}");
        }
        
        if (record.getDefaultLang() != null) {
            sql.SET("default_lang = #{record.defaultLang,jdbcType=CHAR}");
        }
        
        if (record.getParentTopic() != null) {
            sql.SET("parent_topic = #{record.parentTopic,jdbcType=BIGINT}");
        }
        
        if (record.getRecommandLevel() != null) {
            sql.SET("recommand_level = #{record.recommandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getTopicUpvote() != null) {
            sql.SET("topic_upvote = #{record.topicUpvote,jdbcType=BIGINT}");
        }
        
        if (record.getTopicTread() != null) {
            sql.SET("topic_tread = #{record.topicTread,jdbcType=BIGINT}");
        }
        
        if (record.getTopicRewardNum() != null) {
            sql.SET("topic_reward_num = #{record.topicRewardNum,jdbcType=BIGINT}");
        }
        
        if (record.getTopicCollect() != null) {
            sql.SET("topic_collect = #{record.topicCollect,jdbcType=BIGINT}");
        }
        
        if (record.getTopicReward() != null) {
            sql.SET("topic_reward = #{record.topicReward,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupPk() != null) {
            sql.SET("social_group_pk = #{record.socialGroupPk,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getIsStick() != null) {
            sql.SET("is_stick = #{record.isStick,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{record.price,jdbcType=INTEGER}");
        }
        
        if (record.getIsPrivate() != null) {
            sql.SET("is_private = #{record.isPrivate,jdbcType=INTEGER}");
        }
        
        if (record.getSpiderOrganizationId() != null) {
            sql.SET("spider_organization_id = #{record.spiderOrganizationId,jdbcType=BIGINT}");
        }
        
        if (record.getSpiderUrl() != null) {
            sql.SET("spider_url = #{record.spiderUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            sql.SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getHostPlace() != null) {
            sql.SET("host_place = #{record.hostPlace,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicContent() != null) {
            sql.SET("topic_content = #{record.topicContent,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("topic");
        
        sql.SET("topic_id = #{record.topicId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("topic_title = #{record.topicTitle,jdbcType=VARCHAR}");
        sql.SET("topic_abstract = #{record.topicAbstract,jdbcType=VARCHAR}");
        sql.SET("topic_keywords = #{record.topicKeywords,jdbcType=VARCHAR}");
        sql.SET("topic_type = #{record.topicType,jdbcType=INTEGER}");
        sql.SET("topic_comment = #{record.topicComment,jdbcType=BIGINT}");
        sql.SET("topic_mogoid = #{record.topicMogoid,jdbcType=BIGINT}");
        sql.SET("topic_url = #{record.topicUrl,jdbcType=VARCHAR}");
        sql.SET("topic_state = #{record.topicState,jdbcType=INTEGER}");
        sql.SET("topic_source = #{record.topicSource,jdbcType=INTEGER}");
        sql.SET("default_lang = #{record.defaultLang,jdbcType=CHAR}");
        sql.SET("parent_topic = #{record.parentTopic,jdbcType=BIGINT}");
        sql.SET("recommand_level = #{record.recommandLevel,jdbcType=INTEGER}");
        sql.SET("topic_upvote = #{record.topicUpvote,jdbcType=BIGINT}");
        sql.SET("topic_tread = #{record.topicTread,jdbcType=BIGINT}");
        sql.SET("topic_reward_num = #{record.topicRewardNum,jdbcType=BIGINT}");
        sql.SET("topic_collect = #{record.topicCollect,jdbcType=BIGINT}");
        sql.SET("topic_reward = #{record.topicReward,jdbcType=BIGINT}");
        sql.SET("social_group_pk = #{record.socialGroupPk,jdbcType=BIGINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("is_stick = #{record.isStick,jdbcType=INTEGER}");
        sql.SET("price = #{record.price,jdbcType=INTEGER}");
        sql.SET("is_private = #{record.isPrivate,jdbcType=INTEGER}");
        sql.SET("spider_organization_id = #{record.spiderOrganizationId,jdbcType=BIGINT}");
        sql.SET("spider_url = #{record.spiderUrl,jdbcType=VARCHAR}");
        sql.SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        sql.SET("host_place = #{record.hostPlace,jdbcType=VARCHAR}");
        sql.SET("topic_content = #{record.topicContent,jdbcType=LONGVARCHAR}");
        
        TblTopicExample example = (TblTopicExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("topic");
        
        sql.SET("topic_id = #{record.topicId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("topic_title = #{record.topicTitle,jdbcType=VARCHAR}");
        sql.SET("topic_abstract = #{record.topicAbstract,jdbcType=VARCHAR}");
        sql.SET("topic_keywords = #{record.topicKeywords,jdbcType=VARCHAR}");
        sql.SET("topic_type = #{record.topicType,jdbcType=INTEGER}");
        sql.SET("topic_comment = #{record.topicComment,jdbcType=BIGINT}");
        sql.SET("topic_mogoid = #{record.topicMogoid,jdbcType=BIGINT}");
        sql.SET("topic_url = #{record.topicUrl,jdbcType=VARCHAR}");
        sql.SET("topic_state = #{record.topicState,jdbcType=INTEGER}");
        sql.SET("topic_source = #{record.topicSource,jdbcType=INTEGER}");
        sql.SET("default_lang = #{record.defaultLang,jdbcType=CHAR}");
        sql.SET("parent_topic = #{record.parentTopic,jdbcType=BIGINT}");
        sql.SET("recommand_level = #{record.recommandLevel,jdbcType=INTEGER}");
        sql.SET("topic_upvote = #{record.topicUpvote,jdbcType=BIGINT}");
        sql.SET("topic_tread = #{record.topicTread,jdbcType=BIGINT}");
        sql.SET("topic_reward_num = #{record.topicRewardNum,jdbcType=BIGINT}");
        sql.SET("topic_collect = #{record.topicCollect,jdbcType=BIGINT}");
        sql.SET("topic_reward = #{record.topicReward,jdbcType=BIGINT}");
        sql.SET("social_group_pk = #{record.socialGroupPk,jdbcType=BIGINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("is_stick = #{record.isStick,jdbcType=INTEGER}");
        sql.SET("price = #{record.price,jdbcType=INTEGER}");
        sql.SET("is_private = #{record.isPrivate,jdbcType=INTEGER}");
        sql.SET("spider_organization_id = #{record.spiderOrganizationId,jdbcType=BIGINT}");
        sql.SET("spider_url = #{record.spiderUrl,jdbcType=VARCHAR}");
        sql.SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        sql.SET("host_place = #{record.hostPlace,jdbcType=VARCHAR}");
        
        TblTopicExample example = (TblTopicExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblTopic record) {
        SQL sql = new SQL();
        sql.UPDATE("topic");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getTopicTitle() != null) {
            sql.SET("topic_title = #{topicTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicAbstract() != null) {
            sql.SET("topic_abstract = #{topicAbstract,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicKeywords() != null) {
            sql.SET("topic_keywords = #{topicKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicType() != null) {
            sql.SET("topic_type = #{topicType,jdbcType=INTEGER}");
        }
        
        if (record.getTopicComment() != null) {
            sql.SET("topic_comment = #{topicComment,jdbcType=BIGINT}");
        }
        
        if (record.getTopicMogoid() != null) {
            sql.SET("topic_mogoid = #{topicMogoid,jdbcType=BIGINT}");
        }
        
        if (record.getTopicUrl() != null) {
            sql.SET("topic_url = #{topicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicState() != null) {
            sql.SET("topic_state = #{topicState,jdbcType=INTEGER}");
        }
        
        if (record.getTopicSource() != null) {
            sql.SET("topic_source = #{topicSource,jdbcType=INTEGER}");
        }
        
        if (record.getDefaultLang() != null) {
            sql.SET("default_lang = #{defaultLang,jdbcType=CHAR}");
        }
        
        if (record.getParentTopic() != null) {
            sql.SET("parent_topic = #{parentTopic,jdbcType=BIGINT}");
        }
        
        if (record.getRecommandLevel() != null) {
            sql.SET("recommand_level = #{recommandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getTopicUpvote() != null) {
            sql.SET("topic_upvote = #{topicUpvote,jdbcType=BIGINT}");
        }
        
        if (record.getTopicTread() != null) {
            sql.SET("topic_tread = #{topicTread,jdbcType=BIGINT}");
        }
        
        if (record.getTopicRewardNum() != null) {
            sql.SET("topic_reward_num = #{topicRewardNum,jdbcType=BIGINT}");
        }
        
        if (record.getTopicCollect() != null) {
            sql.SET("topic_collect = #{topicCollect,jdbcType=BIGINT}");
        }
        
        if (record.getTopicReward() != null) {
            sql.SET("topic_reward = #{topicReward,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupPk() != null) {
            sql.SET("social_group_pk = #{socialGroupPk,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getIsStick() != null) {
            sql.SET("is_stick = #{isStick,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=INTEGER}");
        }
        
        if (record.getIsPrivate() != null) {
            sql.SET("is_private = #{isPrivate,jdbcType=INTEGER}");
        }
        
        if (record.getSpiderOrganizationId() != null) {
            sql.SET("spider_organization_id = #{spiderOrganizationId,jdbcType=BIGINT}");
        }
        
        if (record.getSpiderUrl() != null) {
            sql.SET("spider_url = #{spiderUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            sql.SET("start_time = #{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("end_time = #{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getHostPlace() != null) {
            sql.SET("host_place = #{hostPlace,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicContent() != null) {
            sql.SET("topic_content = #{topicContent,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("topic_id = #{topicId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblTopicExample example, boolean includeExamplePhrase) {
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