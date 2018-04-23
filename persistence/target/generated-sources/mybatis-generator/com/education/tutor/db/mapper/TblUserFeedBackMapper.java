package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserFeedBack;
import com.education.tutor.db.domain.TblUserFeedBackExample;
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

public interface TblUserFeedBackMapper {
    @SelectProvider(type=TblUserFeedBackSqlProvider.class, method="countByExample")
    long countByExample(TblUserFeedBackExample example);

    @DeleteProvider(type=TblUserFeedBackSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblUserFeedBackExample example);

    @Delete({
        "delete from user_feed_back",
        "where user_feed_back_id = #{userFeedBackId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userFeedBackId);

    @Insert({
        "insert into user_feed_back (user_main_id, feed_back_content, ",
        "feed_back_state, process_by, ",
        "updated_by, updated_at)",
        "values (#{userMainId,jdbcType=BIGINT}, #{feedBackContent,jdbcType=VARCHAR}, ",
        "#{feedBackState,jdbcType=SMALLINT}, #{processBy,jdbcType=VARCHAR}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userFeedBackId", before=false, resultType=Long.class)
    int insert(TblUserFeedBack record);

    @InsertProvider(type=TblUserFeedBackSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userFeedBackId", before=false, resultType=Long.class)
    int insertSelective(TblUserFeedBack record);

    @SelectProvider(type=TblUserFeedBackSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="user_feed_back_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="feed_back_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="feed_back_state", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="process_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblUserFeedBack> selectByExample(TblUserFeedBackExample example);

    @Select({
        "select",
        "user_feed_back_id, user_main_id, feed_back_content, feed_back_state, process_by, ",
        "updated_by, updated_at",
        "from user_feed_back",
        "where user_feed_back_id = #{userFeedBackId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="user_feed_back_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="feed_back_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="feed_back_state", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="process_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblUserFeedBack selectByPrimaryKey(Long userFeedBackId);

    @UpdateProvider(type=TblUserFeedBackSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblUserFeedBack record, @Param("example") TblUserFeedBackExample example);

    @UpdateProvider(type=TblUserFeedBackSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblUserFeedBack record, @Param("example") TblUserFeedBackExample example);

    @UpdateProvider(type=TblUserFeedBackSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblUserFeedBack record);

    @Update({
        "update user_feed_back",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "feed_back_content = #{feedBackContent,jdbcType=VARCHAR},",
          "feed_back_state = #{feedBackState,jdbcType=SMALLINT},",
          "process_by = #{processBy,jdbcType=VARCHAR},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where user_feed_back_id = #{userFeedBackId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblUserFeedBack record);
}