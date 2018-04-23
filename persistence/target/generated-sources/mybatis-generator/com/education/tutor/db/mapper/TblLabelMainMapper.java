package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblLabelMain;
import com.education.tutor.db.domain.TblLabelMainExample;
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

public interface TblLabelMainMapper {
    @SelectProvider(type=TblLabelMainSqlProvider.class, method="countByExample")
    long countByExample(TblLabelMainExample example);

    @DeleteProvider(type=TblLabelMainSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblLabelMainExample example);

    @Delete({
        "delete from label_main",
        "where label_main_id = #{labelMainId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long labelMainId);

    @Insert({
        "insert into label_main (label_name, label_name_zh, ",
        "label_category_zh, label_category, ",
        "label_state, label_desc, ",
        "label_lang, label_type, ",
        "label_avatar, recommand_level, ",
        "updated_by, updated_at)",
        "values (#{labelName,jdbcType=VARCHAR}, #{labelNameZh,jdbcType=VARCHAR}, ",
        "#{labelCategoryZh,jdbcType=VARCHAR}, #{labelCategory,jdbcType=VARCHAR}, ",
        "#{labelState,jdbcType=INTEGER}, #{labelDesc,jdbcType=VARCHAR}, ",
        "#{labelLang,jdbcType=VARCHAR}, #{labelType,jdbcType=INTEGER}, ",
        "#{labelAvatar,jdbcType=VARCHAR}, #{recommandLevel,jdbcType=INTEGER}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="labelMainId", before=false, resultType=Long.class)
    int insert(TblLabelMain record);

    @InsertProvider(type=TblLabelMainSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="labelMainId", before=false, resultType=Long.class)
    int insertSelective(TblLabelMain record);

    @SelectProvider(type=TblLabelMainSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="label_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="label_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_name_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_category_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_category", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="label_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_lang", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="label_avatar", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="recommand_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblLabelMain> selectByExample(TblLabelMainExample example);

    @Select({
        "select",
        "label_main_id, label_name, label_name_zh, label_category_zh, label_category, ",
        "label_state, label_desc, label_lang, label_type, label_avatar, recommand_level, ",
        "updated_by, updated_at",
        "from label_main",
        "where label_main_id = #{labelMainId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="label_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="label_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_name_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_category_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_category", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="label_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_lang", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="label_avatar", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="recommand_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblLabelMain selectByPrimaryKey(Long labelMainId);

    @UpdateProvider(type=TblLabelMainSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblLabelMain record, @Param("example") TblLabelMainExample example);

    @UpdateProvider(type=TblLabelMainSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblLabelMain record, @Param("example") TblLabelMainExample example);

    @UpdateProvider(type=TblLabelMainSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblLabelMain record);

    @Update({
        "update label_main",
        "set label_name = #{labelName,jdbcType=VARCHAR},",
          "label_name_zh = #{labelNameZh,jdbcType=VARCHAR},",
          "label_category_zh = #{labelCategoryZh,jdbcType=VARCHAR},",
          "label_category = #{labelCategory,jdbcType=VARCHAR},",
          "label_state = #{labelState,jdbcType=INTEGER},",
          "label_desc = #{labelDesc,jdbcType=VARCHAR},",
          "label_lang = #{labelLang,jdbcType=VARCHAR},",
          "label_type = #{labelType,jdbcType=INTEGER},",
          "label_avatar = #{labelAvatar,jdbcType=VARCHAR},",
          "recommand_level = #{recommandLevel,jdbcType=INTEGER},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where label_main_id = #{labelMainId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblLabelMain record);
}