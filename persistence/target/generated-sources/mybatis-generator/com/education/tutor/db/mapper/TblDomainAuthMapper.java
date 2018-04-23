package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblDomainAuth;
import com.education.tutor.db.domain.TblDomainAuthExample;
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

public interface TblDomainAuthMapper {
    @SelectProvider(type=TblDomainAuthSqlProvider.class, method="countByExample")
    long countByExample(TblDomainAuthExample example);

    @DeleteProvider(type=TblDomainAuthSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblDomainAuthExample example);

    @Delete({
        "delete from domain_auth",
        "where domain_auth_id = #{domainAuthId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long domainAuthId);

    @Insert({
        "insert into domain_auth (target_type, target_pk, ",
        "username, group_name, ",
        "state, effect_from, ",
        "effect_end, updated_at, ",
        "updated_by)",
        "values (#{targetType,jdbcType=INTEGER}, #{targetPk,jdbcType=BIGINT}, ",
        "#{username,jdbcType=VARCHAR}, #{groupName,jdbcType=VARCHAR}, ",
        "#{state,jdbcType=INTEGER}, #{effectFrom,jdbcType=TIMESTAMP}, ",
        "#{effectEnd,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="domainAuthId", before=false, resultType=Long.class)
    int insert(TblDomainAuth record);

    @InsertProvider(type=TblDomainAuthSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="domainAuthId", before=false, resultType=Long.class)
    int insertSelective(TblDomainAuth record);

    @SelectProvider(type=TblDomainAuthSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="domain_auth_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="target_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="group_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="effect_from", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="effect_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblDomainAuth> selectByExample(TblDomainAuthExample example);

    @Select({
        "select",
        "domain_auth_id, target_type, target_pk, username, group_name, state, effect_from, ",
        "effect_end, updated_at, updated_by",
        "from domain_auth",
        "where domain_auth_id = #{domainAuthId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="domain_auth_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="target_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="group_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="effect_from", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="effect_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblDomainAuth selectByPrimaryKey(Long domainAuthId);

    @UpdateProvider(type=TblDomainAuthSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblDomainAuth record, @Param("example") TblDomainAuthExample example);

    @UpdateProvider(type=TblDomainAuthSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblDomainAuth record, @Param("example") TblDomainAuthExample example);

    @UpdateProvider(type=TblDomainAuthSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblDomainAuth record);

    @Update({
        "update domain_auth",
        "set target_type = #{targetType,jdbcType=INTEGER},",
          "target_pk = #{targetPk,jdbcType=BIGINT},",
          "username = #{username,jdbcType=VARCHAR},",
          "group_name = #{groupName,jdbcType=VARCHAR},",
          "state = #{state,jdbcType=INTEGER},",
          "effect_from = #{effectFrom,jdbcType=TIMESTAMP},",
          "effect_end = #{effectEnd,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where domain_auth_id = #{domainAuthId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblDomainAuth record);
}