package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblProjectEvent;
import com.education.tutor.db.domain.TblProjectEventExample;
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

public interface TblProjectEventMapper {
    @SelectProvider(type=TblProjectEventSqlProvider.class, method="countByExample")
    long countByExample(TblProjectEventExample example);

    @DeleteProvider(type=TblProjectEventSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblProjectEventExample example);

    @Delete({
        "delete from project_event",
        "where project_event_id = #{projectEventId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long projectEventId);

    @Insert({
        "insert into project_event (project_id, event_type, ",
        "event_desc, event_solution, ",
        "event_remark, event_occur_time, ",
        "event_producer, event_processor, ",
        "event_result, updated_at, ",
        "updated_by)",
        "values (#{projectId,jdbcType=BIGINT}, #{eventType,jdbcType=INTEGER}, ",
        "#{eventDesc,jdbcType=VARCHAR}, #{eventSolution,jdbcType=VARCHAR}, ",
        "#{eventRemark,jdbcType=VARCHAR}, #{eventOccurTime,jdbcType=TIMESTAMP}, ",
        "#{eventProducer,jdbcType=VARCHAR}, #{eventProcessor,jdbcType=VARCHAR}, ",
        "#{eventResult,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="projectEventId", before=false, resultType=Long.class)
    int insert(TblProjectEvent record);

    @InsertProvider(type=TblProjectEventSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="projectEventId", before=false, resultType=Long.class)
    int insertSelective(TblProjectEvent record);

    @SelectProvider(type=TblProjectEventSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="project_event_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="event_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="event_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_solution", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_occur_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="event_producer", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_processor", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblProjectEvent> selectByExample(TblProjectEventExample example);

    @Select({
        "select",
        "project_event_id, project_id, event_type, event_desc, event_solution, event_remark, ",
        "event_occur_time, event_producer, event_processor, event_result, updated_at, ",
        "updated_by",
        "from project_event",
        "where project_event_id = #{projectEventId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="project_event_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="event_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="event_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_solution", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_occur_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="event_producer", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_processor", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="event_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblProjectEvent selectByPrimaryKey(Long projectEventId);

    @UpdateProvider(type=TblProjectEventSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblProjectEvent record, @Param("example") TblProjectEventExample example);

    @UpdateProvider(type=TblProjectEventSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblProjectEvent record, @Param("example") TblProjectEventExample example);

    @UpdateProvider(type=TblProjectEventSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblProjectEvent record);

    @Update({
        "update project_event",
        "set project_id = #{projectId,jdbcType=BIGINT},",
          "event_type = #{eventType,jdbcType=INTEGER},",
          "event_desc = #{eventDesc,jdbcType=VARCHAR},",
          "event_solution = #{eventSolution,jdbcType=VARCHAR},",
          "event_remark = #{eventRemark,jdbcType=VARCHAR},",
          "event_occur_time = #{eventOccurTime,jdbcType=TIMESTAMP},",
          "event_producer = #{eventProducer,jdbcType=VARCHAR},",
          "event_processor = #{eventProcessor,jdbcType=VARCHAR},",
          "event_result = #{eventResult,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where project_event_id = #{projectEventId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblProjectEvent record);
}