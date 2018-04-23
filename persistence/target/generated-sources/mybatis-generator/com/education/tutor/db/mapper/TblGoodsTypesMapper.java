package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoodsTypes;
import com.education.tutor.db.domain.TblGoodsTypesExample;
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

public interface TblGoodsTypesMapper {
    @SelectProvider(type=TblGoodsTypesSqlProvider.class, method="countByExample")
    long countByExample(TblGoodsTypesExample example);

    @DeleteProvider(type=TblGoodsTypesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGoodsTypesExample example);

    @Delete({
        "delete from goods_types",
        "where goods_types_id = #{goodsTypesId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long goodsTypesId);

    @Insert({
        "insert into goods_types (user_main_id, goods_categories_id, ",
        "types_name, types_code, ",
        "types_lang_code, types_status, ",
        "types_content, created_at, ",
        "updated_at, updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{goodsCategoriesId,jdbcType=BIGINT}, ",
        "#{typesName,jdbcType=VARCHAR}, #{typesCode,jdbcType=VARCHAR}, ",
        "#{typesLangCode,jdbcType=VARCHAR}, #{typesStatus,jdbcType=INTEGER}, ",
        "#{typesContent,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsTypesId", before=false, resultType=Long.class)
    int insert(TblGoodsTypes record);

    @InsertProvider(type=TblGoodsTypesSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsTypesId", before=false, resultType=Long.class)
    int insertSelective(TblGoodsTypes record);

    @SelectProvider(type=TblGoodsTypesSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="goods_types_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_categories_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="types_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="types_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="types_lang_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="types_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="types_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblGoodsTypes> selectByExample(TblGoodsTypesExample example);

    @Select({
        "select",
        "goods_types_id, user_main_id, goods_categories_id, types_name, types_code, types_lang_code, ",
        "types_status, types_content, created_at, updated_at, updated_by",
        "from goods_types",
        "where goods_types_id = #{goodsTypesId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="goods_types_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="goods_categories_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="types_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="types_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="types_lang_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="types_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="types_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblGoodsTypes selectByPrimaryKey(Long goodsTypesId);

    @UpdateProvider(type=TblGoodsTypesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGoodsTypes record, @Param("example") TblGoodsTypesExample example);

    @UpdateProvider(type=TblGoodsTypesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGoodsTypes record, @Param("example") TblGoodsTypesExample example);

    @UpdateProvider(type=TblGoodsTypesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblGoodsTypes record);

    @Update({
        "update goods_types",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT},",
          "types_name = #{typesName,jdbcType=VARCHAR},",
          "types_code = #{typesCode,jdbcType=VARCHAR},",
          "types_lang_code = #{typesLangCode,jdbcType=VARCHAR},",
          "types_status = #{typesStatus,jdbcType=INTEGER},",
          "types_content = #{typesContent,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where goods_types_id = #{goodsTypesId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblGoodsTypes record);
}