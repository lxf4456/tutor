package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTask;
import com.education.tutor.db.domain.TblTaskExample;
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

public interface TblTaskMapper {
    @SelectProvider(type=TblTaskSqlProvider.class, method="countByExample")
    long countByExample(TblTaskExample example);

    @DeleteProvider(type=TblTaskSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTaskExample example);

    @Delete({
        "delete from task",
        "where task_id = #{taskId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long taskId);

    @Insert({
        "insert into task (user_main_id, project_id, ",
        "task_name, task_content, ",
        "task_data_pk, task_type, ",
        "task_state, parent_task_id, ",
        "created_at, plan_start_at, ",
        "plan_end_at, inforce_at, ",
        "created_by, assigned_by, ",
        "assigned_to, assigned_group, ",
        "priority, progress, ",
        "progress_desc, offset_desc, ",
        "task_result, task_result_desc, ",
        "task_result_remark, score, ",
        "score_reason, remark, ",
        "updated_at, updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{projectId,jdbcType=BIGINT}, ",
        "#{taskName,jdbcType=VARCHAR}, #{taskContent,jdbcType=VARCHAR}, ",
        "#{taskDataPk,jdbcType=BIGINT}, #{taskType,jdbcType=INTEGER}, ",
        "#{taskState,jdbcType=INTEGER}, #{parentTaskId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{planStartAt,jdbcType=TIMESTAMP}, ",
        "#{planEndAt,jdbcType=TIMESTAMP}, #{inforceAt,jdbcType=TIMESTAMP}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{assignedBy,jdbcType=VARCHAR}, ",
        "#{assignedTo,jdbcType=VARCHAR}, #{assignedGroup,jdbcType=VARCHAR}, ",
        "#{priority,jdbcType=INTEGER}, #{progress,jdbcType=INTEGER}, ",
        "#{progressDesc,jdbcType=VARCHAR}, #{offsetDesc,jdbcType=VARCHAR}, ",
        "#{taskResult,jdbcType=INTEGER}, #{taskResultDesc,jdbcType=VARCHAR}, ",
        "#{taskResultRemark,jdbcType=VARCHAR}, #{score,jdbcType=INTEGER}, ",
        "#{scoreReason,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskId", before=false, resultType=Long.class)
    int insert(TblTask record);

    @InsertProvider(type=TblTaskSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskId", before=false, resultType=Long.class)
    int insertSelective(TblTask record);

    @SelectProvider(type=TblTaskSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_data_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="task_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="parent_task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="plan_start_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="plan_end_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="inforce_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_to", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_group", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="priority", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="progress", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="progress_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="offset_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_result", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="task_result_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_result_remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="score", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="score_reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblTask> selectByExample(TblTaskExample example);

    @Select({
        "select",
        "task_id, user_main_id, project_id, task_name, task_content, task_data_pk, task_type, ",
        "task_state, parent_task_id, created_at, plan_start_at, plan_end_at, inforce_at, ",
        "created_by, assigned_by, assigned_to, assigned_group, priority, progress, progress_desc, ",
        "offset_desc, task_result, task_result_desc, task_result_remark, score, score_reason, ",
        "remark, updated_at, updated_by",
        "from task",
        "where task_id = #{taskId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_data_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="task_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="parent_task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="plan_start_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="plan_end_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="inforce_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_to", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_group", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="priority", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="progress", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="progress_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="offset_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_result", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="task_result_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_result_remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="score", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="score_reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblTask selectByPrimaryKey(Long taskId);

    @UpdateProvider(type=TblTaskSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTask record, @Param("example") TblTaskExample example);

    @UpdateProvider(type=TblTaskSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTask record, @Param("example") TblTaskExample example);

    @UpdateProvider(type=TblTaskSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTask record);

    @Update({
        "update task",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "project_id = #{projectId,jdbcType=BIGINT},",
          "task_name = #{taskName,jdbcType=VARCHAR},",
          "task_content = #{taskContent,jdbcType=VARCHAR},",
          "task_data_pk = #{taskDataPk,jdbcType=BIGINT},",
          "task_type = #{taskType,jdbcType=INTEGER},",
          "task_state = #{taskState,jdbcType=INTEGER},",
          "parent_task_id = #{parentTaskId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "plan_start_at = #{planStartAt,jdbcType=TIMESTAMP},",
          "plan_end_at = #{planEndAt,jdbcType=TIMESTAMP},",
          "inforce_at = #{inforceAt,jdbcType=TIMESTAMP},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "assigned_by = #{assignedBy,jdbcType=VARCHAR},",
          "assigned_to = #{assignedTo,jdbcType=VARCHAR},",
          "assigned_group = #{assignedGroup,jdbcType=VARCHAR},",
          "priority = #{priority,jdbcType=INTEGER},",
          "progress = #{progress,jdbcType=INTEGER},",
          "progress_desc = #{progressDesc,jdbcType=VARCHAR},",
          "offset_desc = #{offsetDesc,jdbcType=VARCHAR},",
          "task_result = #{taskResult,jdbcType=INTEGER},",
          "task_result_desc = #{taskResultDesc,jdbcType=VARCHAR},",
          "task_result_remark = #{taskResultRemark,jdbcType=VARCHAR},",
          "score = #{score,jdbcType=INTEGER},",
          "score_reason = #{scoreReason,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where task_id = #{taskId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTask record);
}