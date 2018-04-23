package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblPost;
import com.education.tutor.db.domain.TblPostExample;
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

public interface TblPostMapper {
    @SelectProvider(type=TblPostSqlProvider.class, method="countByExample")
    long countByExample(TblPostExample example);

    @DeleteProvider(type=TblPostSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblPostExample example);

    @Delete({
        "delete from post",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long postId);

    @Insert({
        "insert into post (user_main_id, topic_id, ",
        "message_id, post_title, ",
        "post_content, post_url, ",
        "post_state, keywords, ",
        "post_abstract, updated_by, ",
        "updated_at)",
        "values (#{userMainId,jdbcType=BIGINT}, #{topicId,jdbcType=BIGINT}, ",
        "#{messageId,jdbcType=BIGINT}, #{postTitle,jdbcType=VARCHAR}, ",
        "#{postContent,jdbcType=VARCHAR}, #{postUrl,jdbcType=VARCHAR}, ",
        "#{postState,jdbcType=INTEGER}, #{keywords,jdbcType=VARCHAR}, ",
        "#{postAbstract,jdbcType=VARCHAR}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="postId", before=false, resultType=Long.class)
    int insert(TblPost record);

    @InsertProvider(type=TblPostSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="postId", before=false, resultType=Long.class)
    int insertSelective(TblPost record);

    @SelectProvider(type=TblPostSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="post_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="message_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="post_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_abstract", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblPost> selectByExample(TblPostExample example);

    @Select({
        "select",
        "post_id, user_main_id, topic_id, message_id, post_title, post_content, post_url, ",
        "post_state, keywords, post_abstract, updated_by, updated_at",
        "from post",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="post_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="topic_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="message_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="post_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_abstract", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblPost selectByPrimaryKey(Long postId);

    @UpdateProvider(type=TblPostSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblPost record, @Param("example") TblPostExample example);

    @UpdateProvider(type=TblPostSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblPost record, @Param("example") TblPostExample example);

    @UpdateProvider(type=TblPostSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblPost record);

    @Update({
        "update post",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "topic_id = #{topicId,jdbcType=BIGINT},",
          "message_id = #{messageId,jdbcType=BIGINT},",
          "post_title = #{postTitle,jdbcType=VARCHAR},",
          "post_content = #{postContent,jdbcType=VARCHAR},",
          "post_url = #{postUrl,jdbcType=VARCHAR},",
          "post_state = #{postState,jdbcType=INTEGER},",
          "keywords = #{keywords,jdbcType=VARCHAR},",
          "post_abstract = #{postAbstract,jdbcType=VARCHAR},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblPost record);
}