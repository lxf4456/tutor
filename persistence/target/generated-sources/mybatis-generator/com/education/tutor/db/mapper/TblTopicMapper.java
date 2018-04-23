package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTopic;
import com.education.tutor.db.domain.TblTopicExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TblTopicMapper {
    @SelectProvider(type=TblTopicSqlProvider.class, method="countByExample")
    long countByExample(TblTopicExample example);

    @DeleteProvider(type=TblTopicSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTopicExample example);

    @Delete({
        "delete from topic",
        "where topic_id = #{topicId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long topicId);

    @Insert({
        "insert into topic (user_main_id, topic_title, ",
        "topic_abstract, topic_keywords, ",
        "topic_type, topic_comment, ",
        "topic_mogoid, topic_url, ",
        "topic_state, topic_source, ",
        "default_lang, parent_topic, ",
        "recommand_level, topic_upvote, ",
        "topic_tread, topic_reward_num, ",
        "topic_collect, topic_reward, ",
        "social_group_pk, created_at, ",
        "updated_at, updated_by, ",
        "is_stick, price, ",
        "is_private, spider_organization_id, ",
        "spider_url, start_time, ",
        "end_time, host_place, ",
        "topic_content)",
        "values (#{userMainId,jdbcType=BIGINT}, #{topicTitle,jdbcType=VARCHAR}, ",
        "#{topicAbstract,jdbcType=VARCHAR}, #{topicKeywords,jdbcType=VARCHAR}, ",
        "#{topicType,jdbcType=INTEGER}, #{topicComment,jdbcType=BIGINT}, ",
        "#{topicMogoid,jdbcType=BIGINT}, #{topicUrl,jdbcType=VARCHAR}, ",
        "#{topicState,jdbcType=INTEGER}, #{topicSource,jdbcType=INTEGER}, ",
        "#{defaultLang,jdbcType=CHAR}, #{parentTopic,jdbcType=BIGINT}, ",
        "#{recommandLevel,jdbcType=INTEGER}, #{topicUpvote,jdbcType=BIGINT}, ",
        "#{topicTread,jdbcType=BIGINT}, #{topicRewardNum,jdbcType=BIGINT}, ",
        "#{topicCollect,jdbcType=BIGINT}, #{topicReward,jdbcType=BIGINT}, ",
        "#{socialGroupPk,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{isStick,jdbcType=INTEGER}, #{price,jdbcType=INTEGER}, ",
        "#{isPrivate,jdbcType=INTEGER}, #{spiderOrganizationId,jdbcType=BIGINT}, ",
        "#{spiderUrl,jdbcType=VARCHAR}, #{startTime,jdbcType=TIMESTAMP}, ",
        "#{endTime,jdbcType=TIMESTAMP}, #{hostPlace,jdbcType=VARCHAR}, ",
        "#{topicContent,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="topicId", before=false, resultType=Long.class)
    int insert(TblTopic record);

    @InsertProvider(type=TblTopicSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="topicId", before=false, resultType=Long.class)
    int insertSelective(TblTopic record);

    @SelectProvider(type=TblTopicSqlProvider.class, method="selectByExampleWithBLOBs")
    @ConstructorArgs({
        @Arg(column="topic_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_abstract", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_comment", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_mogoid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_source", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="default_lang", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="parent_topic", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="recommand_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_upvote", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_tread", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_reward_num", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_collect", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_reward", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_stick", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="price", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_private", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="spider_organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="spider_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="end_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="host_place", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_content", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR)
    })
    List<TblTopic> selectByExampleWithBLOBs(TblTopicExample example);

    @SelectProvider(type=TblTopicSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="topic_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_abstract", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_comment", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_mogoid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_source", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="default_lang", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="parent_topic", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="recommand_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_upvote", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_tread", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_reward_num", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_collect", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_reward", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_stick", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="price", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_private", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="spider_organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="spider_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="end_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="host_place", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblTopic> selectByExample(TblTopicExample example);

    @Select({
        "select",
        "topic_id, user_main_id, topic_title, topic_abstract, topic_keywords, topic_type, ",
        "topic_comment, topic_mogoid, topic_url, topic_state, topic_source, default_lang, ",
        "parent_topic, recommand_level, topic_upvote, topic_tread, topic_reward_num, ",
        "topic_collect, topic_reward, social_group_pk, created_at, updated_at, updated_by, ",
        "is_stick, price, is_private, spider_organization_id, spider_url, start_time, ",
        "end_time, host_place, topic_content",
        "from topic",
        "where topic_id = #{topicId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="topic_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_abstract", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_comment", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_mogoid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_source", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="default_lang", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="parent_topic", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="recommand_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="topic_upvote", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_tread", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_reward_num", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_collect", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_reward", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_stick", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="price", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_private", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="spider_organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="spider_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="end_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="host_place", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="topic_content", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR)
    })
    TblTopic selectByPrimaryKey(Long topicId);

    @UpdateProvider(type=TblTopicSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTopic record, @Param("example") TblTopicExample example);

    @UpdateProvider(type=TblTopicSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TblTopic record, @Param("example") TblTopicExample example);

    @UpdateProvider(type=TblTopicSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTopic record, @Param("example") TblTopicExample example);

    @UpdateProvider(type=TblTopicSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTopic record);

    @Update({
        "update topic",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "topic_title = #{topicTitle,jdbcType=VARCHAR},",
          "topic_abstract = #{topicAbstract,jdbcType=VARCHAR},",
          "topic_keywords = #{topicKeywords,jdbcType=VARCHAR},",
          "topic_type = #{topicType,jdbcType=INTEGER},",
          "topic_comment = #{topicComment,jdbcType=BIGINT},",
          "topic_mogoid = #{topicMogoid,jdbcType=BIGINT},",
          "topic_url = #{topicUrl,jdbcType=VARCHAR},",
          "topic_state = #{topicState,jdbcType=INTEGER},",
          "topic_source = #{topicSource,jdbcType=INTEGER},",
          "default_lang = #{defaultLang,jdbcType=CHAR},",
          "parent_topic = #{parentTopic,jdbcType=BIGINT},",
          "recommand_level = #{recommandLevel,jdbcType=INTEGER},",
          "topic_upvote = #{topicUpvote,jdbcType=BIGINT},",
          "topic_tread = #{topicTread,jdbcType=BIGINT},",
          "topic_reward_num = #{topicRewardNum,jdbcType=BIGINT},",
          "topic_collect = #{topicCollect,jdbcType=BIGINT},",
          "topic_reward = #{topicReward,jdbcType=BIGINT},",
          "social_group_pk = #{socialGroupPk,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "is_stick = #{isStick,jdbcType=INTEGER},",
          "price = #{price,jdbcType=INTEGER},",
          "is_private = #{isPrivate,jdbcType=INTEGER},",
          "spider_organization_id = #{spiderOrganizationId,jdbcType=BIGINT},",
          "spider_url = #{spiderUrl,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "host_place = #{hostPlace,jdbcType=VARCHAR},",
          "topic_content = #{topicContent,jdbcType=LONGVARCHAR}",
        "where topic_id = #{topicId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(TblTopic record);

    @Update({
        "update topic",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "topic_title = #{topicTitle,jdbcType=VARCHAR},",
          "topic_abstract = #{topicAbstract,jdbcType=VARCHAR},",
          "topic_keywords = #{topicKeywords,jdbcType=VARCHAR},",
          "topic_type = #{topicType,jdbcType=INTEGER},",
          "topic_comment = #{topicComment,jdbcType=BIGINT},",
          "topic_mogoid = #{topicMogoid,jdbcType=BIGINT},",
          "topic_url = #{topicUrl,jdbcType=VARCHAR},",
          "topic_state = #{topicState,jdbcType=INTEGER},",
          "topic_source = #{topicSource,jdbcType=INTEGER},",
          "default_lang = #{defaultLang,jdbcType=CHAR},",
          "parent_topic = #{parentTopic,jdbcType=BIGINT},",
          "recommand_level = #{recommandLevel,jdbcType=INTEGER},",
          "topic_upvote = #{topicUpvote,jdbcType=BIGINT},",
          "topic_tread = #{topicTread,jdbcType=BIGINT},",
          "topic_reward_num = #{topicRewardNum,jdbcType=BIGINT},",
          "topic_collect = #{topicCollect,jdbcType=BIGINT},",
          "topic_reward = #{topicReward,jdbcType=BIGINT},",
          "social_group_pk = #{socialGroupPk,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "is_stick = #{isStick,jdbcType=INTEGER},",
          "price = #{price,jdbcType=INTEGER},",
          "is_private = #{isPrivate,jdbcType=INTEGER},",
          "spider_organization_id = #{spiderOrganizationId,jdbcType=BIGINT},",
          "spider_url = #{spiderUrl,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "host_place = #{hostPlace,jdbcType=VARCHAR}",
        "where topic_id = #{topicId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTopic record);
}