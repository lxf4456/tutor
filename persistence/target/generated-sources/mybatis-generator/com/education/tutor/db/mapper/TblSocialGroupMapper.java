package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblSocialGroup;
import com.education.tutor.db.domain.TblSocialGroupExample;
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

public interface TblSocialGroupMapper {
    @SelectProvider(type=TblSocialGroupSqlProvider.class, method="countByExample")
    long countByExample(TblSocialGroupExample example);

    @DeleteProvider(type=TblSocialGroupSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblSocialGroupExample example);

    @Delete({
        "delete from social_group",
        "where social_group_id = #{socialGroupId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long socialGroupId);

    @Insert({
        "insert into social_group (social_group_name, social_group_avatar, ",
        "social_group_desc, social_group_type, ",
        "owner, admin, status, ",
        "created_by, created_at)",
        "values (#{socialGroupName,jdbcType=VARCHAR}, #{socialGroupAvatar,jdbcType=VARCHAR}, ",
        "#{socialGroupDesc,jdbcType=VARCHAR}, #{socialGroupType,jdbcType=SMALLINT}, ",
        "#{owner,jdbcType=BIGINT}, #{admin,jdbcType=BIGINT}, #{status,jdbcType=INTEGER}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="socialGroupId", before=false, resultType=Long.class)
    int insert(TblSocialGroup record);

    @InsertProvider(type=TblSocialGroupSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="socialGroupId", before=false, resultType=Long.class)
    int insertSelective(TblSocialGroup record);

    @SelectProvider(type=TblSocialGroupSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="social_group_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_group_avatar", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_group_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_group_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="owner", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="admin", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblSocialGroup> selectByExample(TblSocialGroupExample example);

    @Select({
        "select",
        "social_group_id, social_group_name, social_group_avatar, social_group_desc, ",
        "social_group_type, owner, admin, status, created_by, created_at",
        "from social_group",
        "where social_group_id = #{socialGroupId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="social_group_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_group_avatar", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_group_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_group_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="owner", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="admin", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblSocialGroup selectByPrimaryKey(Long socialGroupId);

    @UpdateProvider(type=TblSocialGroupSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblSocialGroup record, @Param("example") TblSocialGroupExample example);

    @UpdateProvider(type=TblSocialGroupSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblSocialGroup record, @Param("example") TblSocialGroupExample example);

    @UpdateProvider(type=TblSocialGroupSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblSocialGroup record);

    @Update({
        "update social_group",
        "set social_group_name = #{socialGroupName,jdbcType=VARCHAR},",
          "social_group_avatar = #{socialGroupAvatar,jdbcType=VARCHAR},",
          "social_group_desc = #{socialGroupDesc,jdbcType=VARCHAR},",
          "social_group_type = #{socialGroupType,jdbcType=SMALLINT},",
          "owner = #{owner,jdbcType=BIGINT},",
          "admin = #{admin,jdbcType=BIGINT},",
          "status = #{status,jdbcType=INTEGER},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where social_group_id = #{socialGroupId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblSocialGroup record);
}