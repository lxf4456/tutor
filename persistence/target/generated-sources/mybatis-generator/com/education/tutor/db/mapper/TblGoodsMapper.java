package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoods;
import com.education.tutor.db.domain.TblGoodsExample;
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

public interface TblGoodsMapper {
    @SelectProvider(type=TblGoodsSqlProvider.class, method="countByExample")
    long countByExample(TblGoodsExample example);

    @DeleteProvider(type=TblGoodsSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGoodsExample example);

    @Delete({
        "delete from goods",
        "where goods_id = #{goodsId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long goodsId);

    @Insert({
        "insert into goods (user_main_id, goods_brand_id, ",
        "goods_categories_id, goods_types_id, ",
        "goods_title, goods_name, ",
        "goods_abstract, goods_keywords, ",
        "goods_lang_code, goods_code, ",
        "supplier_id_code, goods_url, ",
        "goods_view_json, goods_amount, ",
        "goods_type, goods_status, ",
        "goods_source, goods_purpose, ",
        "stock_state, created_at, ",
        "updated_at, updated_by, ",
        "goods_close, goods_sold)",
        "values (#{userMainId,jdbcType=BIGINT}, #{goodsBrandId,jdbcType=BIGINT}, ",
        "#{goodsCategoriesId,jdbcType=BIGINT}, #{goodsTypesId,jdbcType=BIGINT}, ",
        "#{goodsTitle,jdbcType=VARCHAR}, #{goodsName,jdbcType=VARCHAR}, ",
        "#{goodsAbstract,jdbcType=VARCHAR}, #{goodsKeywords,jdbcType=VARCHAR}, ",
        "#{goodsLangCode,jdbcType=VARCHAR}, #{goodsCode,jdbcType=VARCHAR}, ",
        "#{supplierIdCode,jdbcType=VARCHAR}, #{goodsUrl,jdbcType=VARCHAR}, ",
        "#{goodsViewJson,jdbcType=VARCHAR}, #{goodsAmount,jdbcType=INTEGER}, ",
        "#{goodsType,jdbcType=INTEGER}, #{goodsStatus,jdbcType=INTEGER}, ",
        "#{goodsSource,jdbcType=INTEGER}, #{goodsPurpose,jdbcType=INTEGER}, ",
        "#{stockState,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{goodsClose,jdbcType=INTEGER}, #{goodsSold,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsId", before=false, resultType=Long.class)
    int insert(TblGoods record);

    @InsertProvider(type=TblGoodsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsId", before=false, resultType=Long.class)
    int insertSelective(TblGoods record);

    @SelectProvider(type=TblGoodsSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="goods_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_brand_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_categories_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_types_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_abstract", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_lang_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="supplier_id_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_view_json", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_source", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_purpose", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="stock_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_close", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_sold", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<TblGoods> selectByExample(TblGoodsExample example);

    @Select({
        "select",
        "goods_id, user_main_id, goods_brand_id, goods_categories_id, goods_types_id, ",
        "goods_title, goods_name, goods_abstract, goods_keywords, goods_lang_code, goods_code, ",
        "supplier_id_code, goods_url, goods_view_json, goods_amount, goods_type, goods_status, ",
        "goods_source, goods_purpose, stock_state, created_at, updated_at, updated_by, ",
        "goods_close, goods_sold",
        "from goods",
        "where goods_id = #{goodsId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="goods_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_brand_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_categories_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_types_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_abstract", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_lang_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="supplier_id_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_view_json", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_source", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_purpose", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="stock_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="goods_close", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="goods_sold", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    TblGoods selectByPrimaryKey(Long goodsId);

    @UpdateProvider(type=TblGoodsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    @UpdateProvider(type=TblGoodsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    @UpdateProvider(type=TblGoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblGoods record);

    @Update({
        "update goods",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "goods_brand_id = #{goodsBrandId,jdbcType=BIGINT},",
          "goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT},",
          "goods_types_id = #{goodsTypesId,jdbcType=BIGINT},",
          "goods_title = #{goodsTitle,jdbcType=VARCHAR},",
          "goods_name = #{goodsName,jdbcType=VARCHAR},",
          "goods_abstract = #{goodsAbstract,jdbcType=VARCHAR},",
          "goods_keywords = #{goodsKeywords,jdbcType=VARCHAR},",
          "goods_lang_code = #{goodsLangCode,jdbcType=VARCHAR},",
          "goods_code = #{goodsCode,jdbcType=VARCHAR},",
          "supplier_id_code = #{supplierIdCode,jdbcType=VARCHAR},",
          "goods_url = #{goodsUrl,jdbcType=VARCHAR},",
          "goods_view_json = #{goodsViewJson,jdbcType=VARCHAR},",
          "goods_amount = #{goodsAmount,jdbcType=INTEGER},",
          "goods_type = #{goodsType,jdbcType=INTEGER},",
          "goods_status = #{goodsStatus,jdbcType=INTEGER},",
          "goods_source = #{goodsSource,jdbcType=INTEGER},",
          "goods_purpose = #{goodsPurpose,jdbcType=INTEGER},",
          "stock_state = #{stockState,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "goods_close = #{goodsClose,jdbcType=INTEGER},",
          "goods_sold = #{goodsSold,jdbcType=INTEGER}",
        "where goods_id = #{goodsId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblGoods record);
}