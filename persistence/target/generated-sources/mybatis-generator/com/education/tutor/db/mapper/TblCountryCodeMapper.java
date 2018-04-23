package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblCountryCode;
import com.education.tutor.db.domain.TblCountryCodeExample;
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

public interface TblCountryCodeMapper {
    @SelectProvider(type=TblCountryCodeSqlProvider.class, method="countByExample")
    long countByExample(TblCountryCodeExample example);

    @DeleteProvider(type=TblCountryCodeSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblCountryCodeExample example);

    @Delete({
        "delete from country_code",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer countryId);

    @Insert({
        "insert into country_code (country_en, country_cn, ",
        "country_lg, country_code, ",
        "status)",
        "values (#{countryEn,jdbcType=VARCHAR}, #{countryCn,jdbcType=VARCHAR}, ",
        "#{countryLg,jdbcType=VARCHAR}, #{countryCode,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="countryId", before=false, resultType=Integer.class)
    int insert(TblCountryCode record);

    @InsertProvider(type=TblCountryCodeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="countryId", before=false, resultType=Integer.class)
    int insertSelective(TblCountryCode record);

    @SelectProvider(type=TblCountryCodeSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="country_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="country_en", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_cn", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_lg", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<TblCountryCode> selectByExample(TblCountryCodeExample example);

    @Select({
        "select",
        "country_id, country_en, country_cn, country_lg, country_code, status",
        "from country_code",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="country_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="country_en", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_cn", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_lg", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    TblCountryCode selectByPrimaryKey(Integer countryId);

    @UpdateProvider(type=TblCountryCodeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblCountryCode record, @Param("example") TblCountryCodeExample example);

    @UpdateProvider(type=TblCountryCodeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblCountryCode record, @Param("example") TblCountryCodeExample example);

    @UpdateProvider(type=TblCountryCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblCountryCode record);

    @Update({
        "update country_code",
        "set country_en = #{countryEn,jdbcType=VARCHAR},",
          "country_cn = #{countryCn,jdbcType=VARCHAR},",
          "country_lg = #{countryLg,jdbcType=VARCHAR},",
          "country_code = #{countryCode,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TblCountryCode record);
}