package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoodsCategories;
import com.education.tutor.db.domain.TblGoodsCategoriesExample;
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

public interface TblGoodsCategoriesMapper {
    @SelectProvider(type=TblGoodsCategoriesSqlProvider.class, method="countByExample")
    long countByExample(TblGoodsCategoriesExample example);

    @DeleteProvider(type=TblGoodsCategoriesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGoodsCategoriesExample example);

    @Delete({
        "delete from goods_categories",
        "where goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long goodsCategoriesId);

    @Insert({
        "insert into goods_categories (user_main_id, categories_name, ",
        "categories_name_zh, categories_parentid, ",
        "categories_depth, categories_code, ",
        "categories_lang_code, categories_status, ",
        "categories_priority, created_at, ",
        "updated_at, updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{categoriesName,jdbcType=VARCHAR}, ",
        "#{categoriesNameZh,jdbcType=VARCHAR}, #{categoriesParentid,jdbcType=BIGINT}, ",
        "#{categoriesDepth,jdbcType=INTEGER}, #{categoriesCode,jdbcType=VARCHAR}, ",
        "#{categoriesLangCode,jdbcType=VARCHAR}, #{categoriesStatus,jdbcType=INTEGER}, ",
        "#{categoriesPriority,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsCategoriesId", before=false, resultType=Long.class)
    int insert(TblGoodsCategories record);

    @InsertProvider(type=TblGoodsCategoriesSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsCategoriesId", before=false, resultType=Long.class)
    int insertSelective(TblGoodsCategories record);

    @SelectProvider(type=TblGoodsCategoriesSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="goods_categories_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="categories_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="categories_name_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="categories_parentid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="categories_depth", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="categories_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="categories_lang_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="categories_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="categories_priority", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblGoodsCategories> selectByExample(TblGoodsCategoriesExample example);

    @Select({
        "select",
        "goods_categories_id, user_main_id, categories_name, categories_name_zh, categories_parentid, ",
        "categories_depth, categories_code, categories_lang_code, categories_status, ",
        "categories_priority, created_at, updated_at, updated_by",
        "from goods_categories",
        "where goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="goods_categories_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="categories_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="categories_name_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="categories_parentid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="categories_depth", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="categories_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="categories_lang_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="categories_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="categories_priority", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblGoodsCategories selectByPrimaryKey(Long goodsCategoriesId);

    @UpdateProvider(type=TblGoodsCategoriesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGoodsCategories record, @Param("example") TblGoodsCategoriesExample example);

    @UpdateProvider(type=TblGoodsCategoriesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGoodsCategories record, @Param("example") TblGoodsCategoriesExample example);

    @UpdateProvider(type=TblGoodsCategoriesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblGoodsCategories record);

    @Update({
        "update goods_categories",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "categories_name = #{categoriesName,jdbcType=VARCHAR},",
          "categories_name_zh = #{categoriesNameZh,jdbcType=VARCHAR},",
          "categories_parentid = #{categoriesParentid,jdbcType=BIGINT},",
          "categories_depth = #{categoriesDepth,jdbcType=INTEGER},",
          "categories_code = #{categoriesCode,jdbcType=VARCHAR},",
          "categories_lang_code = #{categoriesLangCode,jdbcType=VARCHAR},",
          "categories_status = #{categoriesStatus,jdbcType=INTEGER},",
          "categories_priority = #{categoriesPriority,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblGoodsCategories record);
}