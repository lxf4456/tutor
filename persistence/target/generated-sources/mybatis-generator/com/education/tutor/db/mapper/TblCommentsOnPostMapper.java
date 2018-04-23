package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblCommentsOnPost;
import com.education.tutor.db.domain.TblCommentsOnPostExample;
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

public interface TblCommentsOnPostMapper {
    @SelectProvider(type=TblCommentsOnPostSqlProvider.class, method="countByExample")
    long countByExample(TblCommentsOnPostExample example);

    @DeleteProvider(type=TblCommentsOnPostSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblCommentsOnPostExample example);

    @Delete({
        "delete from comments_on_post",
        "where comments_on_post_id = #{commentsOnPostId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long commentsOnPostId);

    @Insert({
        "insert into comments_on_post (user_main_id, post_id, ",
        "poll_id, comment_type, ",
        "comment_content, comment_url, ",
        "comment_state, target_user_id, ",
        "target_comments_id, updated_at)",
        "values (#{userMainId,jdbcType=BIGINT}, #{postId,jdbcType=BIGINT}, ",
        "#{pollId,jdbcType=BIGINT}, #{commentType,jdbcType=INTEGER}, ",
        "#{commentContent,jdbcType=VARCHAR}, #{commentUrl,jdbcType=VARCHAR}, ",
        "#{commentState,jdbcType=INTEGER}, #{targetUserId,jdbcType=BIGINT}, ",
        "#{targetCommentsId,jdbcType=BIGINT}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="commentsOnPostId", before=false, resultType=Long.class)
    int insert(TblCommentsOnPost record);

    @InsertProvider(type=TblCommentsOnPostSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="commentsOnPostId", before=false, resultType=Long.class)
    int insertSelective(TblCommentsOnPost record);

    @SelectProvider(type=TblCommentsOnPostSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="comments_on_post_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="post_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="poll_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="comment_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_comments_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblCommentsOnPost> selectByExample(TblCommentsOnPostExample example);

    @Select({
        "select",
        "comments_on_post_id, user_main_id, post_id, poll_id, comment_type, comment_content, ",
        "comment_url, comment_state, target_user_id, target_comments_id, updated_at",
        "from comments_on_post",
        "where comments_on_post_id = #{commentsOnPostId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="comments_on_post_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="post_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="poll_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="comment_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_comments_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblCommentsOnPost selectByPrimaryKey(Long commentsOnPostId);

    @UpdateProvider(type=TblCommentsOnPostSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblCommentsOnPost record, @Param("example") TblCommentsOnPostExample example);

    @UpdateProvider(type=TblCommentsOnPostSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblCommentsOnPost record, @Param("example") TblCommentsOnPostExample example);

    @UpdateProvider(type=TblCommentsOnPostSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblCommentsOnPost record);

    @Update({
        "update comments_on_post",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "poll_id = #{pollId,jdbcType=BIGINT},",
          "comment_type = #{commentType,jdbcType=INTEGER},",
          "comment_content = #{commentContent,jdbcType=VARCHAR},",
          "comment_url = #{commentUrl,jdbcType=VARCHAR},",
          "comment_state = #{commentState,jdbcType=INTEGER},",
          "target_user_id = #{targetUserId,jdbcType=BIGINT},",
          "target_comments_id = #{targetCommentsId,jdbcType=BIGINT},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where comments_on_post_id = #{commentsOnPostId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblCommentsOnPost record);
}