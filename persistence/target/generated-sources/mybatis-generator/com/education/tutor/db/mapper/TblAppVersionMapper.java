package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAppVersion;
import com.education.tutor.db.domain.TblAppVersionExample;
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

public interface TblAppVersionMapper {
    @SelectProvider(type=TblAppVersionSqlProvider.class, method="countByExample")
    long countByExample(TblAppVersionExample example);

    @DeleteProvider(type=TblAppVersionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblAppVersionExample example);

    @Delete({
        "delete from app_version",
        "where app_version_id = #{appVersionId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long appVersionId);

    @Insert({
        "insert into app_version (app_name, app_version_no, ",
        "app_version_tag, app_version_desc, ",
        "app_android_os_no, app_ios_os_no, ",
        "app_android_release_note, app_ios_release_note, ",
        "app_android_req, app_ios_req, ",
        "app_android_url, app_ios_url, ",
        "android_force_update, ios_force_update, ",
        "app_version_desc_zh, app_version_desc_ru, ",
        "app_version_desc_sp, app_version_desc_fr)",
        "values (#{appName,jdbcType=VARCHAR}, #{appVersionNo,jdbcType=VARCHAR}, ",
        "#{appVersionTag,jdbcType=VARCHAR}, #{appVersionDesc,jdbcType=VARCHAR}, ",
        "#{appAndroidOsNo,jdbcType=VARCHAR}, #{appIosOsNo,jdbcType=VARCHAR}, ",
        "#{appAndroidReleaseNote,jdbcType=VARCHAR}, #{appIosReleaseNote,jdbcType=VARCHAR}, ",
        "#{appAndroidReq,jdbcType=VARCHAR}, #{appIosReq,jdbcType=VARCHAR}, ",
        "#{appAndroidUrl,jdbcType=VARCHAR}, #{appIosUrl,jdbcType=VARCHAR}, ",
        "#{androidForceUpdate,jdbcType=SMALLINT}, #{iosForceUpdate,jdbcType=SMALLINT}, ",
        "#{appVersionDescZh,jdbcType=VARCHAR}, #{appVersionDescRu,jdbcType=VARCHAR}, ",
        "#{appVersionDescSp,jdbcType=VARCHAR}, #{appVersionDescFr,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="appVersionId", before=false, resultType=Long.class)
    int insert(TblAppVersion record);

    @InsertProvider(type=TblAppVersionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="appVersionId", before=false, resultType=Long.class)
    int insertSelective(TblAppVersion record);

    @SelectProvider(type=TblAppVersionSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="app_version_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="app_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_tag", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_android_os_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_ios_os_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_android_release_note", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_ios_release_note", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_android_req", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_ios_req", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_android_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_ios_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="android_force_update", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="ios_force_update", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="app_version_desc_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_desc_ru", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_desc_sp", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_desc_fr", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblAppVersion> selectByExample(TblAppVersionExample example);

    @Select({
        "select",
        "app_version_id, app_name, app_version_no, app_version_tag, app_version_desc, ",
        "app_android_os_no, app_ios_os_no, app_android_release_note, app_ios_release_note, ",
        "app_android_req, app_ios_req, app_android_url, app_ios_url, android_force_update, ",
        "ios_force_update, app_version_desc_zh, app_version_desc_ru, app_version_desc_sp, ",
        "app_version_desc_fr",
        "from app_version",
        "where app_version_id = #{appVersionId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="app_version_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="app_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_tag", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_android_os_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_ios_os_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_android_release_note", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_ios_release_note", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_android_req", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_ios_req", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_android_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_ios_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="android_force_update", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="ios_force_update", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="app_version_desc_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_desc_ru", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_desc_sp", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="app_version_desc_fr", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblAppVersion selectByPrimaryKey(Long appVersionId);

    @UpdateProvider(type=TblAppVersionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblAppVersion record, @Param("example") TblAppVersionExample example);

    @UpdateProvider(type=TblAppVersionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblAppVersion record, @Param("example") TblAppVersionExample example);

    @UpdateProvider(type=TblAppVersionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblAppVersion record);

    @Update({
        "update app_version",
        "set app_name = #{appName,jdbcType=VARCHAR},",
          "app_version_no = #{appVersionNo,jdbcType=VARCHAR},",
          "app_version_tag = #{appVersionTag,jdbcType=VARCHAR},",
          "app_version_desc = #{appVersionDesc,jdbcType=VARCHAR},",
          "app_android_os_no = #{appAndroidOsNo,jdbcType=VARCHAR},",
          "app_ios_os_no = #{appIosOsNo,jdbcType=VARCHAR},",
          "app_android_release_note = #{appAndroidReleaseNote,jdbcType=VARCHAR},",
          "app_ios_release_note = #{appIosReleaseNote,jdbcType=VARCHAR},",
          "app_android_req = #{appAndroidReq,jdbcType=VARCHAR},",
          "app_ios_req = #{appIosReq,jdbcType=VARCHAR},",
          "app_android_url = #{appAndroidUrl,jdbcType=VARCHAR},",
          "app_ios_url = #{appIosUrl,jdbcType=VARCHAR},",
          "android_force_update = #{androidForceUpdate,jdbcType=SMALLINT},",
          "ios_force_update = #{iosForceUpdate,jdbcType=SMALLINT},",
          "app_version_desc_zh = #{appVersionDescZh,jdbcType=VARCHAR},",
          "app_version_desc_ru = #{appVersionDescRu,jdbcType=VARCHAR},",
          "app_version_desc_sp = #{appVersionDescSp,jdbcType=VARCHAR},",
          "app_version_desc_fr = #{appVersionDescFr,jdbcType=VARCHAR}",
        "where app_version_id = #{appVersionId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblAppVersion record);
}