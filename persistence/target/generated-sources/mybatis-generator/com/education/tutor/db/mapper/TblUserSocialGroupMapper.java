package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserSocialGroup;
import com.education.tutor.db.domain.TblUserSocialGroupExample;
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

public interface TblUserSocialGroupMapper {
    @SelectProvider(type=TblUserSocialGroupSqlProvider.class, method="countByExample")
    long countByExample(TblUserSocialGroupExample example);

    @DeleteProvider(type=TblUserSocialGroupSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblUserSocialGroupExample example);

    @Delete({
        "delete from user_social_group",
        "where user_social_group_id = #{userSocialGroupId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userSocialGroupId);

    @Insert({
        "insert into user_social_group (user_main_id, social_group_id, ",
        "social_group_ref, role_name, ",
        "user_group_relation, user_group_nick_name, ",
        "group_user_nick_name, user_group_remark, ",
        "invite_message, join_by, ",
        "status, approved_at, ",
        "updated_by, updated_at)",
        "values (#{userMainId,jdbcType=BIGINT}, #{socialGroupId,jdbcType=BIGINT}, ",
        "#{socialGroupRef,jdbcType=BIGINT}, #{roleName,jdbcType=VARCHAR}, ",
        "#{userGroupRelation,jdbcType=VARCHAR}, #{userGroupNickName,jdbcType=VARCHAR}, ",
        "#{groupUserNickName,jdbcType=VARCHAR}, #{userGroupRemark,jdbcType=VARCHAR}, ",
        "#{inviteMessage,jdbcType=VARCHAR}, #{joinBy,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{approvedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userSocialGroupId", before=false, resultType=Long.class)
    int insert(TblUserSocialGroup record);

    @InsertProvider(type=TblUserSocialGroupSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userSocialGroupId", before=false, resultType=Long.class)
    int insertSelective(TblUserSocialGroup record);

    @SelectProvider(type=TblUserSocialGroupSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="user_social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_ref", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="role_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_group_relation", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_group_nick_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="group_user_nick_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_group_remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="invite_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="join_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="approved_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblUserSocialGroup> selectByExample(TblUserSocialGroupExample example);

    @Select({
        "select",
        "user_social_group_id, user_main_id, social_group_id, social_group_ref, role_name, ",
        "user_group_relation, user_group_nick_name, group_user_nick_name, user_group_remark, ",
        "invite_message, join_by, status, approved_at, updated_by, updated_at",
        "from user_social_group",
        "where user_social_group_id = #{userSocialGroupId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="user_social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_group_ref", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="role_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_group_relation", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_group_nick_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="group_user_nick_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_group_remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="invite_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="join_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="approved_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblUserSocialGroup selectByPrimaryKey(Long userSocialGroupId);

    @UpdateProvider(type=TblUserSocialGroupSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblUserSocialGroup record, @Param("example") TblUserSocialGroupExample example);

    @UpdateProvider(type=TblUserSocialGroupSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblUserSocialGroup record, @Param("example") TblUserSocialGroupExample example);

    @UpdateProvider(type=TblUserSocialGroupSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblUserSocialGroup record);

    @Update({
        "update user_social_group",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "social_group_id = #{socialGroupId,jdbcType=BIGINT},",
          "social_group_ref = #{socialGroupRef,jdbcType=BIGINT},",
          "role_name = #{roleName,jdbcType=VARCHAR},",
          "user_group_relation = #{userGroupRelation,jdbcType=VARCHAR},",
          "user_group_nick_name = #{userGroupNickName,jdbcType=VARCHAR},",
          "group_user_nick_name = #{groupUserNickName,jdbcType=VARCHAR},",
          "user_group_remark = #{userGroupRemark,jdbcType=VARCHAR},",
          "invite_message = #{inviteMessage,jdbcType=VARCHAR},",
          "join_by = #{joinBy,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "approved_at = #{approvedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where user_social_group_id = #{userSocialGroupId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblUserSocialGroup record);
}