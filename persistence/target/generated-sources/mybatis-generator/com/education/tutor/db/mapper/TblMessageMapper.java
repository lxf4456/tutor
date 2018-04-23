package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblMessage;
import com.education.tutor.db.domain.TblMessageExample;
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

public interface TblMessageMapper {
    @SelectProvider(type=TblMessageSqlProvider.class, method="countByExample")
    long countByExample(TblMessageExample example);

    @DeleteProvider(type=TblMessageSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblMessageExample example);

    @Delete({
        "delete from message",
        "where message_id = #{messageId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long messageId);

    @Insert({
        "insert into message (user_main_id, social_group_id, ",
        "message_content, message_type, ",
        "from_user_id, from_group_id, ",
        "to_user_id, to_group_id, ",
        "status, created_at, ",
        "revoked_at, updated_at, ",
        "updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{socialGroupId,jdbcType=BIGINT}, ",
        "#{messageContent,jdbcType=VARCHAR}, #{messageType,jdbcType=SMALLINT}, ",
        "#{fromUserId,jdbcType=BIGINT}, #{fromGroupId,jdbcType=BIGINT}, ",
        "#{toUserId,jdbcType=BIGINT}, #{toGroupId,jdbcType=BIGINT}, ",
        "#{status,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{revokedAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="messageId", before=false, resultType=Long.class)
    int insert(TblMessage record);

    @InsertProvider(type=TblMessageSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="messageId", before=false, resultType=Long.class)
    int insertSelective(TblMessage record);

    @SelectProvider(type=TblMessageSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="message_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="message_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="message_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="from_user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="revoked_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblMessage> selectByExample(TblMessageExample example);

    @Select({
        "select",
        "message_id, user_main_id, social_group_id, message_content, message_type, from_user_id, ",
        "from_group_id, to_user_id, to_group_id, status, created_at, revoked_at, updated_at, ",
        "updated_by",
        "from message",
        "where message_id = #{messageId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="message_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="message_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="message_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="from_user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="revoked_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblMessage selectByPrimaryKey(Long messageId);

    @UpdateProvider(type=TblMessageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblMessage record, @Param("example") TblMessageExample example);

    @UpdateProvider(type=TblMessageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblMessage record, @Param("example") TblMessageExample example);

    @UpdateProvider(type=TblMessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblMessage record);

    @Update({
        "update message",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "social_group_id = #{socialGroupId,jdbcType=BIGINT},",
          "message_content = #{messageContent,jdbcType=VARCHAR},",
          "message_type = #{messageType,jdbcType=SMALLINT},",
          "from_user_id = #{fromUserId,jdbcType=BIGINT},",
          "from_group_id = #{fromGroupId,jdbcType=BIGINT},",
          "to_user_id = #{toUserId,jdbcType=BIGINT},",
          "to_group_id = #{toGroupId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "revoked_at = #{revokedAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where message_id = #{messageId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblMessage record);
}