package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblDataRegion;
import com.education.tutor.db.domain.TblDataRegionExample;
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

public interface TblDataRegionMapper {
    @SelectProvider(type=TblDataRegionSqlProvider.class, method="countByExample")
    long countByExample(TblDataRegionExample example);

    @DeleteProvider(type=TblDataRegionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblDataRegionExample example);

    @Delete({
        "delete from data_region",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into data_region (pid, path, ",
        "level, name, name_en, ",
        "name_pinyin, code, ",
        "owner_region, name_ru, ",
        "location, project_num)",
        "values (#{pid,jdbcType=INTEGER}, #{path,jdbcType=VARCHAR}, ",
        "#{level,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, #{nameEn,jdbcType=VARCHAR}, ",
        "#{namePinyin,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, ",
        "#{ownerRegion,jdbcType=VARCHAR}, #{nameRu,jdbcType=VARCHAR}, ",
        "#{location,jdbcType=VARCHAR}, #{projectNum,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(TblDataRegion record);

    @InsertProvider(type=TblDataRegionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(TblDataRegion record);

    @SelectProvider(type=TblDataRegionSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="pid", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="path", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_en", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_pinyin", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_ru", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_num", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblDataRegion> selectByExample(TblDataRegionExample example);

    @Select({
        "select",
        "id, pid, path, level, name, name_en, name_pinyin, code, owner_region, name_ru, ",
        "location, project_num",
        "from data_region",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="pid", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="path", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_en", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_pinyin", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_ru", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_num", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblDataRegion selectByPrimaryKey(Integer id);

    @UpdateProvider(type=TblDataRegionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblDataRegion record, @Param("example") TblDataRegionExample example);

    @UpdateProvider(type=TblDataRegionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblDataRegion record, @Param("example") TblDataRegionExample example);

    @UpdateProvider(type=TblDataRegionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblDataRegion record);

    @Update({
        "update data_region",
        "set pid = #{pid,jdbcType=INTEGER},",
          "path = #{path,jdbcType=VARCHAR},",
          "level = #{level,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "name_en = #{nameEn,jdbcType=VARCHAR},",
          "name_pinyin = #{namePinyin,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "owner_region = #{ownerRegion,jdbcType=VARCHAR},",
          "name_ru = #{nameRu,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=VARCHAR},",
          "project_num = #{projectNum,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TblDataRegion record);
}