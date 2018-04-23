package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblSolution;
import com.education.tutor.db.domain.TblSolutionExample;
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

public interface TblSolutionMapper {
    @SelectProvider(type=TblSolutionSqlProvider.class, method="countByExample")
    long countByExample(TblSolutionExample example);

    @DeleteProvider(type=TblSolutionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblSolutionExample example);

    @Delete({
        "delete from solution",
        "where solution_id = #{solutionId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long solutionId);

    @Insert({
        "insert into solution (user_main_id, project_id, ",
        "solution_desc, solution_end_date, ",
        "solution_state, created_at, ",
        "updated_at, updated_by, ",
        "solution_content)",
        "values (#{userMainId,jdbcType=BIGINT}, #{projectId,jdbcType=BIGINT}, ",
        "#{solutionDesc,jdbcType=VARCHAR}, #{solutionEndDate,jdbcType=TIMESTAMP}, ",
        "#{solutionState,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{solutionContent,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="solutionId", before=false, resultType=Long.class)
    int insert(TblSolution record);

    @InsertProvider(type=TblSolutionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="solutionId", before=false, resultType=Long.class)
    int insertSelective(TblSolution record);

    @SelectProvider(type=TblSolutionSqlProvider.class, method="selectByExampleWithBLOBs")
    @ConstructorArgs({
        @Arg(column="solution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="solution_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="solution_end_date", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="solution_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="solution_content", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR)
    })
    List<TblSolution> selectByExampleWithBLOBs(TblSolutionExample example);

    @SelectProvider(type=TblSolutionSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="solution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="solution_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="solution_end_date", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="solution_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblSolution> selectByExample(TblSolutionExample example);

    @Select({
        "select",
        "solution_id, user_main_id, project_id, solution_desc, solution_end_date, solution_state, ",
        "created_at, updated_at, updated_by, solution_content",
        "from solution",
        "where solution_id = #{solutionId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="solution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="solution_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="solution_end_date", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="solution_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="solution_content", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR)
    })
    TblSolution selectByPrimaryKey(Long solutionId);

    @UpdateProvider(type=TblSolutionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblSolution record, @Param("example") TblSolutionExample example);

    @UpdateProvider(type=TblSolutionSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TblSolution record, @Param("example") TblSolutionExample example);

    @UpdateProvider(type=TblSolutionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblSolution record, @Param("example") TblSolutionExample example);

    @UpdateProvider(type=TblSolutionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblSolution record);

    @Update({
        "update solution",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "project_id = #{projectId,jdbcType=BIGINT},",
          "solution_desc = #{solutionDesc,jdbcType=VARCHAR},",
          "solution_end_date = #{solutionEndDate,jdbcType=TIMESTAMP},",
          "solution_state = #{solutionState,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "solution_content = #{solutionContent,jdbcType=LONGVARCHAR}",
        "where solution_id = #{solutionId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(TblSolution record);

    @Update({
        "update solution",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "project_id = #{projectId,jdbcType=BIGINT},",
          "solution_desc = #{solutionDesc,jdbcType=VARCHAR},",
          "solution_end_date = #{solutionEndDate,jdbcType=TIMESTAMP},",
          "solution_state = #{solutionState,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where solution_id = #{solutionId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblSolution record);
}