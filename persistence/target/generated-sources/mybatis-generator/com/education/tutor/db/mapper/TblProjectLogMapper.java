package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblProjectLog;
import com.education.tutor.db.domain.TblProjectLogExample;
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

public interface TblProjectLogMapper {
    @SelectProvider(type=TblProjectLogSqlProvider.class, method="countByExample")
    long countByExample(TblProjectLogExample example);

    @DeleteProvider(type=TblProjectLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblProjectLogExample example);

    @Delete({
        "delete from project_log",
        "where project_log_id = #{projectLogId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long projectLogId);

    @Insert({
        "insert into project_log (project_id, project_step, ",
        "project_step_type, project_step_start, ",
        "project_step_end, score, ",
        "score_reason, user_activity_result, ",
        "updated_by, updated_at)",
        "values (#{projectId,jdbcType=BIGINT}, #{projectStep,jdbcType=VARCHAR}, ",
        "#{projectStepType,jdbcType=INTEGER}, #{projectStepStart,jdbcType=TIMESTAMP}, ",
        "#{projectStepEnd,jdbcType=TIMESTAMP}, #{score,jdbcType=INTEGER}, ",
        "#{scoreReason,jdbcType=VARCHAR}, #{userActivityResult,jdbcType=VARCHAR}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="projectLogId", before=false, resultType=Long.class)
    int insert(TblProjectLog record);

    @InsertProvider(type=TblProjectLogSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="projectLogId", before=false, resultType=Long.class)
    int insertSelective(TblProjectLog record);

    @SelectProvider(type=TblProjectLogSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="project_log_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="project_step", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_step_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="project_step_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="project_step_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="score", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="score_reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_activity_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblProjectLog> selectByExample(TblProjectLogExample example);

    @Select({
        "select",
        "project_log_id, project_id, project_step, project_step_type, project_step_start, ",
        "project_step_end, score, score_reason, user_activity_result, updated_by, updated_at",
        "from project_log",
        "where project_log_id = #{projectLogId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="project_log_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="project_step", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_step_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="project_step_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="project_step_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="score", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="score_reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_activity_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblProjectLog selectByPrimaryKey(Long projectLogId);

    @UpdateProvider(type=TblProjectLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblProjectLog record, @Param("example") TblProjectLogExample example);

    @UpdateProvider(type=TblProjectLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblProjectLog record, @Param("example") TblProjectLogExample example);

    @UpdateProvider(type=TblProjectLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblProjectLog record);

    @Update({
        "update project_log",
        "set project_id = #{projectId,jdbcType=BIGINT},",
          "project_step = #{projectStep,jdbcType=VARCHAR},",
          "project_step_type = #{projectStepType,jdbcType=INTEGER},",
          "project_step_start = #{projectStepStart,jdbcType=TIMESTAMP},",
          "project_step_end = #{projectStepEnd,jdbcType=TIMESTAMP},",
          "score = #{score,jdbcType=INTEGER},",
          "score_reason = #{scoreReason,jdbcType=VARCHAR},",
          "user_activity_result = #{userActivityResult,jdbcType=VARCHAR},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where project_log_id = #{projectLogId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblProjectLog record);
}