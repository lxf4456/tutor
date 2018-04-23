package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTopicSensitive;
import com.education.tutor.db.domain.TblTopicSensitiveExample;
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

public interface TblTopicSensitiveMapper {
    @SelectProvider(type=TblTopicSensitiveSqlProvider.class, method="countByExample")
    long countByExample(TblTopicSensitiveExample example);

    @DeleteProvider(type=TblTopicSensitiveSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTopicSensitiveExample example);

    @Delete({
        "delete from topic_sensitive",
        "where se_id = #{seId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long seId);

    @Insert({
        "insert into topic_sensitive (se_value, se_state, ",
        "se_createat, se_createby)",
        "values (#{seValue,jdbcType=VARCHAR}, #{seState,jdbcType=INTEGER}, ",
        "#{seCreateat,jdbcType=TIMESTAMP}, #{seCreateby,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="seId", before=false, resultType=Long.class)
    int insert(TblTopicSensitive record);

    @InsertProvider(type=TblTopicSensitiveSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="seId", before=false, resultType=Long.class)
    int insertSelective(TblTopicSensitive record);

    @SelectProvider(type=TblTopicSensitiveSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="se_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="se_value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="se_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="se_createat", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="se_createby", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblTopicSensitive> selectByExample(TblTopicSensitiveExample example);

    @Select({
        "select",
        "se_id, se_value, se_state, se_createat, se_createby",
        "from topic_sensitive",
        "where se_id = #{seId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="se_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="se_value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="se_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="se_createat", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="se_createby", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblTopicSensitive selectByPrimaryKey(Long seId);

    @UpdateProvider(type=TblTopicSensitiveSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTopicSensitive record, @Param("example") TblTopicSensitiveExample example);

    @UpdateProvider(type=TblTopicSensitiveSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTopicSensitive record, @Param("example") TblTopicSensitiveExample example);

    @UpdateProvider(type=TblTopicSensitiveSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTopicSensitive record);

    @Update({
        "update topic_sensitive",
        "set se_value = #{seValue,jdbcType=VARCHAR},",
          "se_state = #{seState,jdbcType=INTEGER},",
          "se_createat = #{seCreateat,jdbcType=TIMESTAMP},",
          "se_createby = #{seCreateby,jdbcType=VARCHAR}",
        "where se_id = #{seId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTopicSensitive record);
}