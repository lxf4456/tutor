package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserActivity;
import com.education.tutor.db.domain.TblUserActivityExample;
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

public interface TblUserActivityMapper {
    @SelectProvider(type=TblUserActivitySqlProvider.class, method="countByExample")
    long countByExample(TblUserActivityExample example);

    @DeleteProvider(type=TblUserActivitySqlProvider.class, method="deleteByExample")
    int deleteByExample(TblUserActivityExample example);

    @Delete({
        "delete from user_activity",
        "where user_activity_id = #{userActivityId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userActivityId);

    @Insert({
        "insert into user_activity (user_main_id, user_activity_name, ",
        "user_activity_type, target, ",
        "target_type, message, ",
        "user_activity_state, user_activity_result, ",
        "method, media, remark, ",
        "url, promotion, ",
        "source, act_time, ",
        "updated_at, updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{userActivityName,jdbcType=VARCHAR}, ",
        "#{userActivityType,jdbcType=INTEGER}, #{target,jdbcType=VARCHAR}, ",
        "#{targetType,jdbcType=INTEGER}, #{message,jdbcType=VARCHAR}, ",
        "#{userActivityState,jdbcType=INTEGER}, #{userActivityResult,jdbcType=VARCHAR}, ",
        "#{method,jdbcType=VARCHAR}, #{media,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{promotion,jdbcType=VARCHAR}, ",
        "#{source,jdbcType=VARCHAR}, #{actTime,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userActivityId", before=false, resultType=Long.class)
    int insert(TblUserActivity record);

    @InsertProvider(type=TblUserActivitySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userActivityId", before=false, resultType=Long.class)
    int insertSelective(TblUserActivity record);

    @SelectProvider(type=TblUserActivitySqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="user_activity_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_activity_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_activity_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="target_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_activity_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="user_activity_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="method", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="media", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="promotion", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="source", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="act_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblUserActivity> selectByExample(TblUserActivityExample example);

    @Select({
        "select",
        "user_activity_id, user_main_id, user_activity_name, user_activity_type, target, ",
        "target_type, message, user_activity_state, user_activity_result, method, media, ",
        "remark, url, promotion, source, act_time, updated_at, updated_by",
        "from user_activity",
        "where user_activity_id = #{userActivityId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="user_activity_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_activity_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_activity_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="target_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_activity_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="user_activity_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="method", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="media", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="promotion", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="source", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="act_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblUserActivity selectByPrimaryKey(Long userActivityId);

    @UpdateProvider(type=TblUserActivitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblUserActivity record, @Param("example") TblUserActivityExample example);

    @UpdateProvider(type=TblUserActivitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblUserActivity record, @Param("example") TblUserActivityExample example);

    @UpdateProvider(type=TblUserActivitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblUserActivity record);

    @Update({
        "update user_activity",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "user_activity_name = #{userActivityName,jdbcType=VARCHAR},",
          "user_activity_type = #{userActivityType,jdbcType=INTEGER},",
          "target = #{target,jdbcType=VARCHAR},",
          "target_type = #{targetType,jdbcType=INTEGER},",
          "message = #{message,jdbcType=VARCHAR},",
          "user_activity_state = #{userActivityState,jdbcType=INTEGER},",
          "user_activity_result = #{userActivityResult,jdbcType=VARCHAR},",
          "method = #{method,jdbcType=VARCHAR},",
          "media = #{media,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "promotion = #{promotion,jdbcType=VARCHAR},",
          "source = #{source,jdbcType=VARCHAR},",
          "act_time = #{actTime,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where user_activity_id = #{userActivityId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblUserActivity record);
}