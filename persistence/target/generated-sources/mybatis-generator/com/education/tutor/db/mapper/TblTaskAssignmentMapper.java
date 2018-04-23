package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTaskAssignment;
import com.education.tutor.db.domain.TblTaskAssignmentExample;
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

public interface TblTaskAssignmentMapper {
    @SelectProvider(type=TblTaskAssignmentSqlProvider.class, method="countByExample")
    long countByExample(TblTaskAssignmentExample example);

    @DeleteProvider(type=TblTaskAssignmentSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTaskAssignmentExample example);

    @Delete({
        "delete from task_assignment",
        "where task_assignment_id = #{taskAssignmentId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long taskAssignmentId);

    @Insert({
        "insert into task_assignment (task_id, task_execution_id, ",
        "assigned_by, assigned_to, ",
        "assigned_type, assigned_state, ",
        "refuse_reason, updated_at, ",
        "updated_by)",
        "values (#{taskId,jdbcType=BIGINT}, #{taskExecutionId,jdbcType=BIGINT}, ",
        "#{assignedBy,jdbcType=VARCHAR}, #{assignedTo,jdbcType=VARCHAR}, ",
        "#{assignedType,jdbcType=INTEGER}, #{assignedState,jdbcType=INTEGER}, ",
        "#{refuseReason,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskAssignmentId", before=false, resultType=Long.class)
    int insert(TblTaskAssignment record);

    @InsertProvider(type=TblTaskAssignmentSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskAssignmentId", before=false, resultType=Long.class)
    int insertSelective(TblTaskAssignment record);

    @SelectProvider(type=TblTaskAssignmentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="task_assignment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_execution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="assigned_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_to", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="assigned_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="refuse_reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblTaskAssignment> selectByExample(TblTaskAssignmentExample example);

    @Select({
        "select",
        "task_assignment_id, task_id, task_execution_id, assigned_by, assigned_to, assigned_type, ",
        "assigned_state, refuse_reason, updated_at, updated_by",
        "from task_assignment",
        "where task_assignment_id = #{taskAssignmentId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="task_assignment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_execution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="assigned_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_to", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="assigned_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="assigned_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="refuse_reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblTaskAssignment selectByPrimaryKey(Long taskAssignmentId);

    @UpdateProvider(type=TblTaskAssignmentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTaskAssignment record, @Param("example") TblTaskAssignmentExample example);

    @UpdateProvider(type=TblTaskAssignmentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTaskAssignment record, @Param("example") TblTaskAssignmentExample example);

    @UpdateProvider(type=TblTaskAssignmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTaskAssignment record);

    @Update({
        "update task_assignment",
        "set task_id = #{taskId,jdbcType=BIGINT},",
          "task_execution_id = #{taskExecutionId,jdbcType=BIGINT},",
          "assigned_by = #{assignedBy,jdbcType=VARCHAR},",
          "assigned_to = #{assignedTo,jdbcType=VARCHAR},",
          "assigned_type = #{assignedType,jdbcType=INTEGER},",
          "assigned_state = #{assignedState,jdbcType=INTEGER},",
          "refuse_reason = #{refuseReason,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where task_assignment_id = #{taskAssignmentId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTaskAssignment record);
}