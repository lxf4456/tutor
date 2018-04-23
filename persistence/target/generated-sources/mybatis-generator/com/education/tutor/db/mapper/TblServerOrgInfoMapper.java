package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblServerOrgInfo;
import com.education.tutor.db.domain.TblServerOrgInfoExample;
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

public interface TblServerOrgInfoMapper {
    @SelectProvider(type=TblServerOrgInfoSqlProvider.class, method="countByExample")
    long countByExample(TblServerOrgInfoExample example);

    @DeleteProvider(type=TblServerOrgInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblServerOrgInfoExample example);

    @Delete({
        "delete from server_org_info",
        "where server_org_info_id = #{serverOrgInfoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long serverOrgInfoId);

    @Insert({
        "insert into server_org_info (logo_url, business, ",
        "server_info, expert_info, ",
        "contact_information, local, ",
        "lang, created_at, ",
        "updated_at, updated_by, ",
        "data_region_id)",
        "values (#{logoUrl,jdbcType=VARCHAR}, #{business,jdbcType=VARCHAR}, ",
        "#{serverInfo,jdbcType=VARCHAR}, #{expertInfo,jdbcType=VARCHAR}, ",
        "#{contactInformation,jdbcType=VARCHAR}, #{local,jdbcType=VARCHAR}, ",
        "#{lang,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{dataRegionId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="serverOrgInfoId", before=false, resultType=Long.class)
    int insert(TblServerOrgInfo record);

    @InsertProvider(type=TblServerOrgInfoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="serverOrgInfoId", before=false, resultType=Long.class)
    int insertSelective(TblServerOrgInfo record);

    @SelectProvider(type=TblServerOrgInfoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="server_org_info_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="logo_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="business", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="server_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expert_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_information", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="local", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="lang", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="data_region_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<TblServerOrgInfo> selectByExample(TblServerOrgInfoExample example);

    @Select({
        "select",
        "server_org_info_id, logo_url, business, server_info, expert_info, contact_information, ",
        "local, lang, created_at, updated_at, updated_by, data_region_id",
        "from server_org_info",
        "where server_org_info_id = #{serverOrgInfoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="server_org_info_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="logo_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="business", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="server_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expert_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_information", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="local", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="lang", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="data_region_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    TblServerOrgInfo selectByPrimaryKey(Long serverOrgInfoId);

    @UpdateProvider(type=TblServerOrgInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblServerOrgInfo record, @Param("example") TblServerOrgInfoExample example);

    @UpdateProvider(type=TblServerOrgInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblServerOrgInfo record, @Param("example") TblServerOrgInfoExample example);

    @UpdateProvider(type=TblServerOrgInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblServerOrgInfo record);

    @Update({
        "update server_org_info",
        "set logo_url = #{logoUrl,jdbcType=VARCHAR},",
          "business = #{business,jdbcType=VARCHAR},",
          "server_info = #{serverInfo,jdbcType=VARCHAR},",
          "expert_info = #{expertInfo,jdbcType=VARCHAR},",
          "contact_information = #{contactInformation,jdbcType=VARCHAR},",
          "local = #{local,jdbcType=VARCHAR},",
          "lang = #{lang,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "data_region_id = #{dataRegionId,jdbcType=INTEGER}",
        "where server_org_info_id = #{serverOrgInfoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblServerOrgInfo record);
}