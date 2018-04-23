package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTaskExecution;
import com.education.tutor.db.domain.TblTaskExecutionExample;
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

public interface TblTaskExecutionMapper {
    @SelectProvider(type=TblTaskExecutionSqlProvider.class, method="countByExample")
    long countByExample(TblTaskExecutionExample example);

    @DeleteProvider(type=TblTaskExecutionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTaskExecutionExample example);

    @Delete({
        "delete from task_execution",
        "where task_execution_id = #{taskExecutionId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long taskExecutionId);

    @Insert({
        "insert into task_execution (task_id, user_main_id, ",
        "execution_start, execution_end, ",
        "execution_result, execution_flag, ",
        "execution_remark, execution_location, ",
        "execution_state, coporated_by, ",
        "score, score_reason, ",
        "updated_at, updated_by)",
        "values (#{taskId,jdbcType=BIGINT}, #{userMainId,jdbcType=BIGINT}, ",
        "#{executionStart,jdbcType=TIMESTAMP}, #{executionEnd,jdbcType=TIMESTAMP}, ",
        "#{executionResult,jdbcType=VARCHAR}, #{executionFlag,jdbcType=INTEGER}, ",
        "#{executionRemark,jdbcType=VARCHAR}, #{executionLocation,jdbcType=VARCHAR}, ",
        "#{executionState,jdbcType=INTEGER}, #{coporatedBy,jdbcType=VARCHAR}, ",
        "#{score,jdbcType=INTEGER}, #{scoreReason,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskExecutionId", before=false, resultType=Long.class)
    int insert(TblTaskExecution record);

    @InsertProvider(type=TblTaskExecutionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskExecutionId", before=false, resultType=Long.class)
    int insertSelective(TblTaskExecution record);

    @SelectProvider(type=TblTaskExecutionSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="task_execution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="execution_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="execution_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="execution_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="execution_flag", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="execution_remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="execution_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="execution_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="coporated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="score", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="score_reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblTaskExecution> selectByExample(TblTaskExecutionExample example);

    @Select({
        "select",
        "task_execution_id, task_id, user_main_id, execution_start, execution_end, execution_result, ",
        "execution_flag, execution_remark, execution_location, execution_state, coporated_by, ",
        "score, score_reason, updated_at, updated_by",
        "from task_execution",
        "where task_execution_id = #{taskExecutionId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="task_execution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="execution_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="execution_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="execution_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="execution_flag", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="execution_remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="execution_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="execution_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="coporated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="score", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="score_reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblTaskExecution selectByPrimaryKey(Long taskExecutionId);

    @UpdateProvider(type=TblTaskExecutionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTaskExecution record, @Param("example") TblTaskExecutionExample example);

    @UpdateProvider(type=TblTaskExecutionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTaskExecution record, @Param("example") TblTaskExecutionExample example);

    @UpdateProvider(type=TblTaskExecutionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTaskExecution record);

    @Update({
        "update task_execution",
        "set task_id = #{taskId,jdbcType=BIGINT},",
          "user_main_id = #{userMainId,jdbcType=BIGINT},",
          "execution_start = #{executionStart,jdbcType=TIMESTAMP},",
          "execution_end = #{executionEnd,jdbcType=TIMESTAMP},",
          "execution_result = #{executionResult,jdbcType=VARCHAR},",
          "execution_flag = #{executionFlag,jdbcType=INTEGER},",
          "execution_remark = #{executionRemark,jdbcType=VARCHAR},",
          "execution_location = #{executionLocation,jdbcType=VARCHAR},",
          "execution_state = #{executionState,jdbcType=INTEGER},",
          "coporated_by = #{coporatedBy,jdbcType=VARCHAR},",
          "score = #{score,jdbcType=INTEGER},",
          "score_reason = #{scoreReason,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where task_execution_id = #{taskExecutionId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTaskExecution record);
}