package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblPoll;
import com.education.tutor.db.domain.TblPollExample;
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

public interface TblPollMapper {
    @SelectProvider(type=TblPollSqlProvider.class, method="countByExample")
    long countByExample(TblPollExample example);

    @DeleteProvider(type=TblPollSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblPollExample example);

    @Delete({
        "delete from poll",
        "where poll_id = #{pollId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long pollId);

    @Insert({
        "insert into poll (topic_id, user_main_id, ",
        "message_id, vote_value, ",
        "vote_state, updated_at)",
        "values (#{topicId,jdbcType=BIGINT}, #{userMainId,jdbcType=BIGINT}, ",
        "#{messageId,jdbcType=BIGINT}, #{voteValue,jdbcType=INTEGER}, ",
        "#{voteState,jdbcType=INTEGER}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="pollId", before=false, resultType=Long.class)
    int insert(TblPoll record);

    @InsertProvider(type=TblPollSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="pollId", before=false, resultType=Long.class)
    int insertSelective(TblPoll record);

    @SelectProvider(type=TblPollSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="poll_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="topic_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="message_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="vote_value", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="vote_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblPoll> selectByExample(TblPollExample example);

    @Select({
        "select",
        "poll_id, topic_id, user_main_id, message_id, vote_value, vote_state, updated_at",
        "from poll",
        "where poll_id = #{pollId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="poll_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="topic_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="message_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="vote_value", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="vote_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblPoll selectByPrimaryKey(Long pollId);

    @UpdateProvider(type=TblPollSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblPoll record, @Param("example") TblPollExample example);

    @UpdateProvider(type=TblPollSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblPoll record, @Param("example") TblPollExample example);

    @UpdateProvider(type=TblPollSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblPoll record);

    @Update({
        "update poll",
        "set topic_id = #{topicId,jdbcType=BIGINT},",
          "user_main_id = #{userMainId,jdbcType=BIGINT},",
          "message_id = #{messageId,jdbcType=BIGINT},",
          "vote_value = #{voteValue,jdbcType=INTEGER},",
          "vote_state = #{voteState,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where poll_id = #{pollId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblPoll record);
}