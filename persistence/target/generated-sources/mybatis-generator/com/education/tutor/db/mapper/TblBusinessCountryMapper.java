package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblBusinessCountry;
import com.education.tutor.db.domain.TblBusinessCountryExample;
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

public interface TblBusinessCountryMapper {
    @SelectProvider(type=TblBusinessCountrySqlProvider.class, method="countByExample")
    long countByExample(TblBusinessCountryExample example);

    @DeleteProvider(type=TblBusinessCountrySqlProvider.class, method="deleteByExample")
    int deleteByExample(TblBusinessCountryExample example);

    @Delete({
        "delete from business_country",
        "where business_country_id = #{businessCountryId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long businessCountryId);

    @Insert({
        "insert into business_country (business_country_id, data_region_id, ",
        "business_country_type, trade_type, ",
        "del_flag, created_at, ",
        "updated_at, updated_by)",
        "values (#{businessCountryId,jdbcType=BIGINT}, #{dataRegionId,jdbcType=BIGINT}, ",
        "#{businessCountryType,jdbcType=INTEGER}, #{tradeType,jdbcType=INTEGER}, ",
        "#{delFlag,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    int insert(TblBusinessCountry record);

    @InsertProvider(type=TblBusinessCountrySqlProvider.class, method="insertSelective")
    int insertSelective(TblBusinessCountry record);

    @SelectProvider(type=TblBusinessCountrySqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="business_country_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="data_region_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="business_country_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="trade_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="del_flag", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblBusinessCountry> selectByExample(TblBusinessCountryExample example);

    @Select({
        "select",
        "business_country_id, data_region_id, business_country_type, trade_type, del_flag, ",
        "created_at, updated_at, updated_by",
        "from business_country",
        "where business_country_id = #{businessCountryId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="business_country_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="data_region_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="business_country_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="trade_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="del_flag", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblBusinessCountry selectByPrimaryKey(Long businessCountryId);

    @UpdateProvider(type=TblBusinessCountrySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblBusinessCountry record, @Param("example") TblBusinessCountryExample example);

    @UpdateProvider(type=TblBusinessCountrySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblBusinessCountry record, @Param("example") TblBusinessCountryExample example);

    @UpdateProvider(type=TblBusinessCountrySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblBusinessCountry record);

    @Update({
        "update business_country",
        "set data_region_id = #{dataRegionId,jdbcType=BIGINT},",
          "business_country_type = #{businessCountryType,jdbcType=INTEGER},",
          "trade_type = #{tradeType,jdbcType=INTEGER},",
          "del_flag = #{delFlag,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where business_country_id = #{businessCountryId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblBusinessCountry record);
}