package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblI18n;
import com.education.tutor.db.domain.TblI18nExample;
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

public interface TblI18nMapper {
    @SelectProvider(type=TblI18nSqlProvider.class, method="countByExample")
    long countByExample(TblI18nExample example);

    @DeleteProvider(type=TblI18nSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblI18nExample example);

    @Delete({
        "delete from i18n",
        "where i18n_id = #{i18nId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long i18nId);

    @Insert({
        "insert into i18n (schema_name, table_name, ",
        "field_name, pk_value, ",
        "lang_name, value, ",
        "updated_at, updated_by)",
        "values (#{schemaName,jdbcType=VARCHAR}, #{tableName,jdbcType=VARCHAR}, ",
        "#{fieldName,jdbcType=VARCHAR}, #{pkValue,jdbcType=BIGINT}, ",
        "#{langName,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="i18nId", before=false, resultType=Long.class)
    int insert(TblI18n record);

    @InsertProvider(type=TblI18nSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="i18nId", before=false, resultType=Long.class)
    int insertSelective(TblI18n record);

    @SelectProvider(type=TblI18nSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="i18n_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="schema_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="field_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pk_value", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lang_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblI18n> selectByExample(TblI18nExample example);

    @Select({
        "select",
        "i18n_id, schema_name, table_name, field_name, pk_value, lang_name, value, updated_at, ",
        "updated_by",
        "from i18n",
        "where i18n_id = #{i18nId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="i18n_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="schema_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="field_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pk_value", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lang_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblI18n selectByPrimaryKey(Long i18nId);

    @UpdateProvider(type=TblI18nSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblI18n record, @Param("example") TblI18nExample example);

    @UpdateProvider(type=TblI18nSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblI18n record, @Param("example") TblI18nExample example);

    @UpdateProvider(type=TblI18nSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblI18n record);

    @Update({
        "update i18n",
        "set schema_name = #{schemaName,jdbcType=VARCHAR},",
          "table_name = #{tableName,jdbcType=VARCHAR},",
          "field_name = #{fieldName,jdbcType=VARCHAR},",
          "pk_value = #{pkValue,jdbcType=BIGINT},",
          "lang_name = #{langName,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where i18n_id = #{i18nId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblI18n record);
}