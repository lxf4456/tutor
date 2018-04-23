package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblOrganization;
import com.education.tutor.db.domain.TblOrganizationExample;
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

public interface TblOrganizationMapper {
    @SelectProvider(type=TblOrganizationSqlProvider.class, method="countByExample")
    long countByExample(TblOrganizationExample example);

    @DeleteProvider(type=TblOrganizationSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblOrganizationExample example);

    @Delete({
        "delete from organization",
        "where organization_id = #{organizationId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long organizationId);

    @Insert({
        "insert into organization (org_code, org_name, ",
        "org_index_url, org_logo_url, ",
        "org_home_country, org_priority, ",
        "org_size_level, org_home_address, ",
        "org_contact_address, org_contact_person, ",
        "org_contact_telno, org_contact_email, ",
        "org_roles, org_type, ",
        "org_path, org_parent_id, ",
        "org_leader_id, org_level, ",
        "reason, owner, org_state, ",
        "updated_by, updated_at)",
        "values (#{orgCode,jdbcType=VARCHAR}, #{orgName,jdbcType=VARCHAR}, ",
        "#{orgIndexUrl,jdbcType=VARCHAR}, #{orgLogoUrl,jdbcType=VARCHAR}, ",
        "#{orgHomeCountry,jdbcType=VARCHAR}, #{orgPriority,jdbcType=SMALLINT}, ",
        "#{orgSizeLevel,jdbcType=INTEGER}, #{orgHomeAddress,jdbcType=VARCHAR}, ",
        "#{orgContactAddress,jdbcType=VARCHAR}, #{orgContactPerson,jdbcType=VARCHAR}, ",
        "#{orgContactTelno,jdbcType=VARCHAR}, #{orgContactEmail,jdbcType=VARCHAR}, ",
        "#{orgRoles,jdbcType=VARCHAR}, #{orgType,jdbcType=INTEGER}, ",
        "#{orgPath,jdbcType=VARCHAR}, #{orgParentId,jdbcType=BIGINT}, ",
        "#{orgLeaderId,jdbcType=BIGINT}, #{orgLevel,jdbcType=INTEGER}, ",
        "#{reason,jdbcType=VARCHAR}, #{owner,jdbcType=BIGINT}, #{orgState,jdbcType=INTEGER}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="organizationId", before=false, resultType=Long.class)
    int insert(TblOrganization record);

    @InsertProvider(type=TblOrganizationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="organizationId", before=false, resultType=Long.class)
    int insertSelective(TblOrganization record);

    @SelectProvider(type=TblOrganizationSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="org_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_index_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_logo_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_home_country", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_priority", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="org_size_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="org_home_address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_contact_address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_contact_person", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_contact_telno", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_contact_email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_roles", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="org_path", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_parent_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="org_leader_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="org_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="org_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblOrganization> selectByExample(TblOrganizationExample example);

    @Select({
        "select",
        "organization_id, org_code, org_name, org_index_url, org_logo_url, org_home_country, ",
        "org_priority, org_size_level, org_home_address, org_contact_address, org_contact_person, ",
        "org_contact_telno, org_contact_email, org_roles, org_type, org_path, org_parent_id, ",
        "org_leader_id, org_level, reason, owner, org_state, updated_by, updated_at",
        "from organization",
        "where organization_id = #{organizationId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="org_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_index_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_logo_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_home_country", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_priority", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="org_size_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="org_home_address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_contact_address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_contact_person", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_contact_telno", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_contact_email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_roles", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="org_path", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_parent_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="org_leader_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="org_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="org_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblOrganization selectByPrimaryKey(Long organizationId);

    @UpdateProvider(type=TblOrganizationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblOrganization record, @Param("example") TblOrganizationExample example);

    @UpdateProvider(type=TblOrganizationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblOrganization record, @Param("example") TblOrganizationExample example);

    @UpdateProvider(type=TblOrganizationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblOrganization record);

    @Update({
        "update organization",
        "set org_code = #{orgCode,jdbcType=VARCHAR},",
          "org_name = #{orgName,jdbcType=VARCHAR},",
          "org_index_url = #{orgIndexUrl,jdbcType=VARCHAR},",
          "org_logo_url = #{orgLogoUrl,jdbcType=VARCHAR},",
          "org_home_country = #{orgHomeCountry,jdbcType=VARCHAR},",
          "org_priority = #{orgPriority,jdbcType=SMALLINT},",
          "org_size_level = #{orgSizeLevel,jdbcType=INTEGER},",
          "org_home_address = #{orgHomeAddress,jdbcType=VARCHAR},",
          "org_contact_address = #{orgContactAddress,jdbcType=VARCHAR},",
          "org_contact_person = #{orgContactPerson,jdbcType=VARCHAR},",
          "org_contact_telno = #{orgContactTelno,jdbcType=VARCHAR},",
          "org_contact_email = #{orgContactEmail,jdbcType=VARCHAR},",
          "org_roles = #{orgRoles,jdbcType=VARCHAR},",
          "org_type = #{orgType,jdbcType=INTEGER},",
          "org_path = #{orgPath,jdbcType=VARCHAR},",
          "org_parent_id = #{orgParentId,jdbcType=BIGINT},",
          "org_leader_id = #{orgLeaderId,jdbcType=BIGINT},",
          "org_level = #{orgLevel,jdbcType=INTEGER},",
          "reason = #{reason,jdbcType=VARCHAR},",
          "owner = #{owner,jdbcType=BIGINT},",
          "org_state = #{orgState,jdbcType=INTEGER},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where organization_id = #{organizationId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblOrganization record);
}