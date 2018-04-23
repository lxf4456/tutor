package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblOrganizationBranch;
import com.education.tutor.db.domain.TblOrganizationBranchExample;
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
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TblOrganizationBranchMapper {
    @SelectProvider(type=TblOrganizationBranchSqlProvider.class, method="countByExample")
    long countByExample(TblOrganizationBranchExample example);

    @DeleteProvider(type=TblOrganizationBranchSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblOrganizationBranchExample example);

    @Delete({
        "delete from organization_branch",
        "where organization_branch_id = #{organizationBranchId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long organizationBranchId);

    @Insert({
        "insert into organization_branch (organization_branch_id, organization_id, ",
        "organization_name, url, ",
        "logurl, lang, cdate)",
        "values (#{organizationBranchId,jdbcType=BIGINT}, #{organizationId,jdbcType=BIGINT}, ",
        "#{organizationName,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, ",
        "#{logurl,jdbcType=VARCHAR}, #{lang,jdbcType=VARCHAR}, #{cdate,jdbcType=TIMESTAMP})"
    })
    int insert(TblOrganizationBranch record);

    @InsertProvider(type=TblOrganizationBranchSqlProvider.class, method="insertSelective")
    int insertSelective(TblOrganizationBranch record);

    @SelectProvider(type=TblOrganizationBranchSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="organization_branch_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="logurl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="lang", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="cdate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblOrganizationBranch> selectByExample(TblOrganizationBranchExample example);

    @Select({
        "select",
        "organization_branch_id, organization_id, organization_name, url, logurl, lang, ",
        "cdate",
        "from organization_branch",
        "where organization_branch_id = #{organizationBranchId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="organization_branch_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="logurl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="lang", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="cdate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblOrganizationBranch selectByPrimaryKey(Long organizationBranchId);

    @UpdateProvider(type=TblOrganizationBranchSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblOrganizationBranch record, @Param("example") TblOrganizationBranchExample example);

    @UpdateProvider(type=TblOrganizationBranchSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblOrganizationBranch record, @Param("example") TblOrganizationBranchExample example);

    @UpdateProvider(type=TblOrganizationBranchSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblOrganizationBranch record);

    @Update({
        "update organization_branch",
        "set organization_id = #{organizationId,jdbcType=BIGINT},",
          "organization_name = #{organizationName,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "logurl = #{logurl,jdbcType=VARCHAR},",
          "lang = #{lang,jdbcType=VARCHAR},",
          "cdate = #{cdate,jdbcType=TIMESTAMP}",
        "where organization_branch_id = #{organizationBranchId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblOrganizationBranch record);
}