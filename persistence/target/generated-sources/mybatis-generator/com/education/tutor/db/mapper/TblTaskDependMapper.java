package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTaskDepend;
import com.education.tutor.db.domain.TblTaskDependExample;
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

public interface TblTaskDependMapper {
    @SelectProvider(type=TblTaskDependSqlProvider.class, method="countByExample")
    long countByExample(TblTaskDependExample example);

    @DeleteProvider(type=TblTaskDependSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTaskDependExample example);

    @Delete({
        "delete from task_depend",
        "where task_depend_id = #{taskDependId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long taskDependId);

    @Insert({
        "insert into task_depend (task_id, task_depend_by_id, ",
        "depends_type, updated_by, ",
        "updated_at)",
        "values (#{taskId,jdbcType=BIGINT}, #{taskDependById,jdbcType=BIGINT}, ",
        "#{dependsType,jdbcType=INTEGER}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskDependId", before=false, resultType=Long.class)
    int insert(TblTaskDepend record);

    @InsertProvider(type=TblTaskDependSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskDependId", before=false, resultType=Long.class)
    int insertSelective(TblTaskDepend record);

    @SelectProvider(type=TblTaskDependSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="task_depend_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_depend_by_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="depends_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblTaskDepend> selectByExample(TblTaskDependExample example);

    @Select({
        "select",
        "task_depend_id, task_id, task_depend_by_id, depends_type, updated_by, updated_at",
        "from task_depend",
        "where task_depend_id = #{taskDependId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="task_depend_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_depend_by_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="depends_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblTaskDepend selectByPrimaryKey(Long taskDependId);

    @UpdateProvider(type=TblTaskDependSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTaskDepend record, @Param("example") TblTaskDependExample example);

    @UpdateProvider(type=TblTaskDependSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTaskDepend record, @Param("example") TblTaskDependExample example);

    @UpdateProvider(type=TblTaskDependSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTaskDepend record);

    @Update({
        "update task_depend",
        "set task_id = #{taskId,jdbcType=BIGINT},",
          "task_depend_by_id = #{taskDependById,jdbcType=BIGINT},",
          "depends_type = #{dependsType,jdbcType=INTEGER},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where task_depend_id = #{taskDependId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTaskDepend record);
}