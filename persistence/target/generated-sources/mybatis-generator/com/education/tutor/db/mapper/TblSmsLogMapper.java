package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblSmsLog;
import com.education.tutor.db.domain.TblSmsLogExample;
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

public interface TblSmsLogMapper {
    @SelectProvider(type=TblSmsLogSqlProvider.class, method="countByExample")
    long countByExample(TblSmsLogExample example);

    @DeleteProvider(type=TblSmsLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblSmsLogExample example);

    @Delete({
        "delete from sms_log",
        "where sms_log_id = #{smsLogId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long smsLogId);

    @Insert({
        "insert into sms_log (channel, country_code, ",
        "mobile, content, ",
        "status, fee, result_code, ",
        "reason, updated_at)",
        "values (#{channel,jdbcType=VARCHAR}, #{countryCode,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{fee,jdbcType=INTEGER}, #{resultCode,jdbcType=VARCHAR}, ",
        "#{reason,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="smsLogId", before=false, resultType=Long.class)
    int insert(TblSmsLog record);

    @InsertProvider(type=TblSmsLogSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="smsLogId", before=false, resultType=Long.class)
    int insertSelective(TblSmsLog record);

    @SelectProvider(type=TblSmsLogSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="sms_log_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="channel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="fee", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="result_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblSmsLog> selectByExample(TblSmsLogExample example);

    @Select({
        "select",
        "sms_log_id, channel, country_code, mobile, content, status, fee, result_code, ",
        "reason, updated_at",
        "from sms_log",
        "where sms_log_id = #{smsLogId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="sms_log_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="channel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="fee", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="result_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblSmsLog selectByPrimaryKey(Long smsLogId);

    @UpdateProvider(type=TblSmsLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblSmsLog record, @Param("example") TblSmsLogExample example);

    @UpdateProvider(type=TblSmsLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblSmsLog record, @Param("example") TblSmsLogExample example);

    @UpdateProvider(type=TblSmsLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblSmsLog record);

    @Update({
        "update sms_log",
        "set channel = #{channel,jdbcType=VARCHAR},",
          "country_code = #{countryCode,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "fee = #{fee,jdbcType=INTEGER},",
          "result_code = #{resultCode,jdbcType=VARCHAR},",
          "reason = #{reason,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where sms_log_id = #{smsLogId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblSmsLog record);
}