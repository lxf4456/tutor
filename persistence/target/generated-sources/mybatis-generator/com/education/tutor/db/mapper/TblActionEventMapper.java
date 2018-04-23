package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblActionEvent;
import com.education.tutor.db.domain.TblActionEventExample;
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

public interface TblActionEventMapper {
    @SelectProvider(type=TblActionEventSqlProvider.class, method="countByExample")
    long countByExample(TblActionEventExample example);

    @DeleteProvider(type=TblActionEventSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblActionEventExample example);

    @Delete({
        "delete from action_event",
        "where action_event_id = #{actionEventId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long actionEventId);

    @Insert({
        "insert into action_event (user_main_id, action_event_type, ",
        "action_event_domain, action_event_desc, ",
        "before_state, after_state, ",
        "primary_table_name, primary_data_id, ",
        "transaction_state, occured_ip, ",
        "occured_location, occured_device, ",
        "occured_at)",
        "values (#{userMainId,jdbcType=BIGINT}, #{actionEventType,jdbcType=INTEGER}, ",
        "#{actionEventDomain,jdbcType=INTEGER}, #{actionEventDesc,jdbcType=VARCHAR}, ",
        "#{beforeState,jdbcType=VARCHAR}, #{afterState,jdbcType=VARCHAR}, ",
        "#{primaryTableName,jdbcType=VARCHAR}, #{primaryDataId,jdbcType=BIGINT}, ",
        "#{transactionState,jdbcType=INTEGER}, #{occuredIp,jdbcType=VARCHAR}, ",
        "#{occuredLocation,jdbcType=VARCHAR}, #{occuredDevice,jdbcType=VARCHAR}, ",
        "#{occuredAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="actionEventId", before=false, resultType=Long.class)
    int insert(TblActionEvent record);

    @InsertProvider(type=TblActionEventSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="actionEventId", before=false, resultType=Long.class)
    int insertSelective(TblActionEvent record);

    @SelectProvider(type=TblActionEventSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="action_event_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="action_event_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="action_event_domain", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="action_event_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="before_state", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="after_state", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="primary_table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="primary_data_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="transaction_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="occured_ip", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="occured_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="occured_device", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="occured_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblActionEvent> selectByExample(TblActionEventExample example);

    @Select({
        "select",
        "action_event_id, user_main_id, action_event_type, action_event_domain, action_event_desc, ",
        "before_state, after_state, primary_table_name, primary_data_id, transaction_state, ",
        "occured_ip, occured_location, occured_device, occured_at",
        "from action_event",
        "where action_event_id = #{actionEventId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="action_event_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="action_event_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="action_event_domain", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="action_event_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="before_state", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="after_state", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="primary_table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="primary_data_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="transaction_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="occured_ip", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="occured_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="occured_device", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="occured_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblActionEvent selectByPrimaryKey(Long actionEventId);

    @UpdateProvider(type=TblActionEventSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblActionEvent record, @Param("example") TblActionEventExample example);

    @UpdateProvider(type=TblActionEventSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblActionEvent record, @Param("example") TblActionEventExample example);

    @UpdateProvider(type=TblActionEventSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblActionEvent record);

    @Update({
        "update action_event",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "action_event_type = #{actionEventType,jdbcType=INTEGER},",
          "action_event_domain = #{actionEventDomain,jdbcType=INTEGER},",
          "action_event_desc = #{actionEventDesc,jdbcType=VARCHAR},",
          "before_state = #{beforeState,jdbcType=VARCHAR},",
          "after_state = #{afterState,jdbcType=VARCHAR},",
          "primary_table_name = #{primaryTableName,jdbcType=VARCHAR},",
          "primary_data_id = #{primaryDataId,jdbcType=BIGINT},",
          "transaction_state = #{transactionState,jdbcType=INTEGER},",
          "occured_ip = #{occuredIp,jdbcType=VARCHAR},",
          "occured_location = #{occuredLocation,jdbcType=VARCHAR},",
          "occured_device = #{occuredDevice,jdbcType=VARCHAR},",
          "occured_at = #{occuredAt,jdbcType=TIMESTAMP}",
        "where action_event_id = #{actionEventId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblActionEvent record);
}