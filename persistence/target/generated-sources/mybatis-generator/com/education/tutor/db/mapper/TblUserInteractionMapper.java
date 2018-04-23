package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserInteraction;
import com.education.tutor.db.domain.TblUserInteractionExample;
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

public interface TblUserInteractionMapper {
    @SelectProvider(type=TblUserInteractionSqlProvider.class, method="countByExample")
    long countByExample(TblUserInteractionExample example);

    @DeleteProvider(type=TblUserInteractionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblUserInteractionExample example);

    @Delete({
        "delete from user_interaction",
        "where user_interaction_id = #{userInteractionId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userInteractionId);

    @Insert({
        "insert into user_interaction (user_main_id, target_type, ",
        "target_pk, target_url, ",
        "interaction_type, interaction_value, ",
        "interaction_at, share_out_to, ",
        "comments, revoke_flag, ",
        "updated_at, updated_by, ",
        "target_user_id)",
        "values (#{userMainId,jdbcType=BIGINT}, #{targetType,jdbcType=INTEGER}, ",
        "#{targetPk,jdbcType=BIGINT}, #{targetUrl,jdbcType=VARCHAR}, ",
        "#{interactionType,jdbcType=INTEGER}, #{interactionValue,jdbcType=VARCHAR}, ",
        "#{interactionAt,jdbcType=TIMESTAMP}, #{shareOutTo,jdbcType=VARCHAR}, ",
        "#{comments,jdbcType=VARCHAR}, #{revokeFlag,jdbcType=INTEGER}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{targetUserId,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userInteractionId", before=false, resultType=Long.class)
    int insert(TblUserInteraction record);

    @InsertProvider(type=TblUserInteractionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userInteractionId", before=false, resultType=Long.class)
    int insertSelective(TblUserInteraction record);

    @SelectProvider(type=TblUserInteractionSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="user_interaction_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="interaction_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="interaction_value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="interaction_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="share_out_to", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comments", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="revoke_flag", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="target_user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<TblUserInteraction> selectByExample(TblUserInteractionExample example);

    @Select({
        "select",
        "user_interaction_id, user_main_id, target_type, target_pk, target_url, interaction_type, ",
        "interaction_value, interaction_at, share_out_to, comments, revoke_flag, updated_at, ",
        "updated_by, target_user_id",
        "from user_interaction",
        "where user_interaction_id = #{userInteractionId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="user_interaction_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="interaction_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="interaction_value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="interaction_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="share_out_to", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comments", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="revoke_flag", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="target_user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    TblUserInteraction selectByPrimaryKey(Long userInteractionId);

    @UpdateProvider(type=TblUserInteractionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblUserInteraction record, @Param("example") TblUserInteractionExample example);

    @UpdateProvider(type=TblUserInteractionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblUserInteraction record, @Param("example") TblUserInteractionExample example);

    @UpdateProvider(type=TblUserInteractionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblUserInteraction record);

    @Update({
        "update user_interaction",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "target_type = #{targetType,jdbcType=INTEGER},",
          "target_pk = #{targetPk,jdbcType=BIGINT},",
          "target_url = #{targetUrl,jdbcType=VARCHAR},",
          "interaction_type = #{interactionType,jdbcType=INTEGER},",
          "interaction_value = #{interactionValue,jdbcType=VARCHAR},",
          "interaction_at = #{interactionAt,jdbcType=TIMESTAMP},",
          "share_out_to = #{shareOutTo,jdbcType=VARCHAR},",
          "comments = #{comments,jdbcType=VARCHAR},",
          "revoke_flag = #{revokeFlag,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "target_user_id = #{targetUserId,jdbcType=BIGINT}",
        "where user_interaction_id = #{userInteractionId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblUserInteraction record);
}