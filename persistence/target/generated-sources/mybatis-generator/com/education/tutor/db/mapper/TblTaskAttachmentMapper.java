package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTaskAttachment;
import com.education.tutor.db.domain.TblTaskAttachmentExample;
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

public interface TblTaskAttachmentMapper {
    @SelectProvider(type=TblTaskAttachmentSqlProvider.class, method="countByExample")
    long countByExample(TblTaskAttachmentExample example);

    @DeleteProvider(type=TblTaskAttachmentSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTaskAttachmentExample example);

    @Delete({
        "delete from task_attachment",
        "where task_attachment_id = #{taskAttachmentId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long taskAttachmentId);

    @Insert({
        "insert into task_attachment (task_id, task_execution_id, ",
        "in_task_attachment_id, attachment_desc, ",
        "task_private_own, updated_at, ",
        "updated_by)",
        "values (#{taskId,jdbcType=BIGINT}, #{taskExecutionId,jdbcType=BIGINT}, ",
        "#{inTaskAttachmentId,jdbcType=BIGINT}, #{attachmentDesc,jdbcType=VARCHAR}, ",
        "#{taskPrivateOwn,jdbcType=SMALLINT}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskAttachmentId", before=false, resultType=Long.class)
    int insert(TblTaskAttachment record);

    @InsertProvider(type=TblTaskAttachmentSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="taskAttachmentId", before=false, resultType=Long.class)
    int insertSelective(TblTaskAttachment record);

    @SelectProvider(type=TblTaskAttachmentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="task_attachment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_execution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="in_task_attachment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="attachment_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_private_own", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblTaskAttachment> selectByExample(TblTaskAttachmentExample example);

    @Select({
        "select",
        "task_attachment_id, task_id, task_execution_id, in_task_attachment_id, attachment_desc, ",
        "task_private_own, updated_at, updated_by",
        "from task_attachment",
        "where task_attachment_id = #{taskAttachmentId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="task_attachment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="task_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="task_execution_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="in_task_attachment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="attachment_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="task_private_own", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblTaskAttachment selectByPrimaryKey(Long taskAttachmentId);

    @UpdateProvider(type=TblTaskAttachmentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTaskAttachment record, @Param("example") TblTaskAttachmentExample example);

    @UpdateProvider(type=TblTaskAttachmentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTaskAttachment record, @Param("example") TblTaskAttachmentExample example);

    @UpdateProvider(type=TblTaskAttachmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTaskAttachment record);

    @Update({
        "update task_attachment",
        "set task_id = #{taskId,jdbcType=BIGINT},",
          "task_execution_id = #{taskExecutionId,jdbcType=BIGINT},",
          "in_task_attachment_id = #{inTaskAttachmentId,jdbcType=BIGINT},",
          "attachment_desc = #{attachmentDesc,jdbcType=VARCHAR},",
          "task_private_own = #{taskPrivateOwn,jdbcType=SMALLINT},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where task_attachment_id = #{taskAttachmentId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTaskAttachment record);
}