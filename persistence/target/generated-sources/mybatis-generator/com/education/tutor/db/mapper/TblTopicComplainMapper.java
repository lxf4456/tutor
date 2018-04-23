package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTopicComplain;
import com.education.tutor.db.domain.TblTopicComplainExample;
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

public interface TblTopicComplainMapper {
    @SelectProvider(type=TblTopicComplainSqlProvider.class, method="countByExample")
    long countByExample(TblTopicComplainExample example);

    @DeleteProvider(type=TblTopicComplainSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTopicComplainExample example);

    @Delete({
        "delete from topic_complain",
        "where co_id = #{coId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long coId);

    @Insert({
        "insert into topic_complain (co_type, co_sourceid, ",
        "createat, createby, ",
        "is_solve, co_content, ",
        "so_content, so_user, ",
        "co_user)",
        "values (#{coType,jdbcType=INTEGER}, #{coSourceid,jdbcType=BIGINT}, ",
        "#{createat,jdbcType=TIMESTAMP}, #{createby,jdbcType=VARCHAR}, ",
        "#{isSolve,jdbcType=INTEGER}, #{coContent,jdbcType=VARCHAR}, ",
        "#{soContent,jdbcType=VARCHAR}, #{soUser,jdbcType=VARCHAR}, ",
        "#{coUser,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="coId", before=false, resultType=Long.class)
    int insert(TblTopicComplain record);

    @InsertProvider(type=TblTopicComplainSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="coId", before=false, resultType=Long.class)
    int insertSelective(TblTopicComplain record);

    @SelectProvider(type=TblTopicComplainSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="co_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="co_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="co_sourceid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="createat", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="createby", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_solve", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="co_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="so_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="so_user", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="co_user", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblTopicComplain> selectByExample(TblTopicComplainExample example);

    @Select({
        "select",
        "co_id, co_type, co_sourceid, createat, createby, is_solve, co_content, so_content, ",
        "so_user, co_user",
        "from topic_complain",
        "where co_id = #{coId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="co_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="co_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="co_sourceid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="createat", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="createby", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_solve", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="co_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="so_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="so_user", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="co_user", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblTopicComplain selectByPrimaryKey(Long coId);

    @UpdateProvider(type=TblTopicComplainSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTopicComplain record, @Param("example") TblTopicComplainExample example);

    @UpdateProvider(type=TblTopicComplainSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTopicComplain record, @Param("example") TblTopicComplainExample example);

    @UpdateProvider(type=TblTopicComplainSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTopicComplain record);

    @Update({
        "update topic_complain",
        "set co_type = #{coType,jdbcType=INTEGER},",
          "co_sourceid = #{coSourceid,jdbcType=BIGINT},",
          "createat = #{createat,jdbcType=TIMESTAMP},",
          "createby = #{createby,jdbcType=VARCHAR},",
          "is_solve = #{isSolve,jdbcType=INTEGER},",
          "co_content = #{coContent,jdbcType=VARCHAR},",
          "so_content = #{soContent,jdbcType=VARCHAR},",
          "so_user = #{soUser,jdbcType=VARCHAR},",
          "co_user = #{coUser,jdbcType=VARCHAR}",
        "where co_id = #{coId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTopicComplain record);
}