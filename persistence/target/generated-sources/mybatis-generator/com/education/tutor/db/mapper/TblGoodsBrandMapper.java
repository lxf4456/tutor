package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoodsBrand;
import com.education.tutor.db.domain.TblGoodsBrandExample;
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

public interface TblGoodsBrandMapper {
    @SelectProvider(type=TblGoodsBrandSqlProvider.class, method="countByExample")
    long countByExample(TblGoodsBrandExample example);

    @DeleteProvider(type=TblGoodsBrandSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGoodsBrandExample example);

    @Delete({
        "delete from goods_brand",
        "where goods_brand_id = #{goodsBrandId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long goodsBrandId);

    @Insert({
        "insert into goods_brand (user_main_id, brand_name, ",
        "brand_level, brand_logo, ",
        "brand_url, brand_code, ",
        "brand_lang_code, status, ",
        "is_have, content, ",
        "created_at, updated_at, ",
        "updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{brandName,jdbcType=VARCHAR}, ",
        "#{brandLevel,jdbcType=INTEGER}, #{brandLogo,jdbcType=VARCHAR}, ",
        "#{brandUrl,jdbcType=VARCHAR}, #{brandCode,jdbcType=VARCHAR}, ",
        "#{brandLangCode,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{isHave,jdbcType=INTEGER}, #{content,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsBrandId", before=false, resultType=Long.class)
    int insert(TblGoodsBrand record);

    @InsertProvider(type=TblGoodsBrandSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsBrandId", before=false, resultType=Long.class)
    int insertSelective(TblGoodsBrand record);

    @SelectProvider(type=TblGoodsBrandSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="goods_brand_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="brand_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="brand_logo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_lang_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_have", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblGoodsBrand> selectByExample(TblGoodsBrandExample example);

    @Select({
        "select",
        "goods_brand_id, user_main_id, brand_name, brand_level, brand_logo, brand_url, ",
        "brand_code, brand_lang_code, status, is_have, content, created_at, updated_at, ",
        "updated_by",
        "from goods_brand",
        "where goods_brand_id = #{goodsBrandId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="goods_brand_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="brand_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="brand_logo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_lang_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_have", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblGoodsBrand selectByPrimaryKey(Long goodsBrandId);

    @UpdateProvider(type=TblGoodsBrandSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGoodsBrand record, @Param("example") TblGoodsBrandExample example);

    @UpdateProvider(type=TblGoodsBrandSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGoodsBrand record, @Param("example") TblGoodsBrandExample example);

    @UpdateProvider(type=TblGoodsBrandSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblGoodsBrand record);

    @Update({
        "update goods_brand",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "brand_name = #{brandName,jdbcType=VARCHAR},",
          "brand_level = #{brandLevel,jdbcType=INTEGER},",
          "brand_logo = #{brandLogo,jdbcType=VARCHAR},",
          "brand_url = #{brandUrl,jdbcType=VARCHAR},",
          "brand_code = #{brandCode,jdbcType=VARCHAR},",
          "brand_lang_code = #{brandLangCode,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "is_have = #{isHave,jdbcType=INTEGER},",
          "content = #{content,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where goods_brand_id = #{goodsBrandId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblGoodsBrand record);
}