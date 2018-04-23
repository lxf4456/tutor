package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGroupMessageState;
import com.education.tutor.db.domain.TblGroupMessageStateExample;
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

public interface TblGroupMessageStateMapper {
    @SelectProvider(type=TblGroupMessageStateSqlProvider.class, method="countByExample")
    long countByExample(TblGroupMessageStateExample example);

    @DeleteProvider(type=TblGroupMessageStateSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGroupMessageStateExample example);

    @Delete({
        "delete from group_message_state",
        "where group_message_state_id = #{groupMessageStateId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long groupMessageStateId);

    @Insert({
        "insert into group_message_state (user_social_group_id, message_id, ",
        "status)",
        "values (#{userSocialGroupId,jdbcType=BIGINT}, #{messageId,jdbcType=BIGINT}, ",
        "#{status,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupMessageStateId", before=false, resultType=Long.class)
    int insert(TblGroupMessageState record);

    @InsertProvider(type=TblGroupMessageStateSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupMessageStateId", before=false, resultType=Long.class)
    int insertSelective(TblGroupMessageState record);

    @SelectProvider(type=TblGroupMessageStateSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="group_message_state_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="message_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<TblGroupMessageState> selectByExample(TblGroupMessageStateExample example);

    @Select({
        "select",
        "group_message_state_id, user_social_group_id, message_id, status",
        "from group_message_state",
        "where group_message_state_id = #{groupMessageStateId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="group_message_state_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_social_group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="message_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    TblGroupMessageState selectByPrimaryKey(Long groupMessageStateId);

    @UpdateProvider(type=TblGroupMessageStateSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGroupMessageState record, @Param("example") TblGroupMessageStateExample example);

    @UpdateProvider(type=TblGroupMessageStateSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGroupMessageState record, @Param("example") TblGroupMessageStateExample example);

    @UpdateProvider(type=TblGroupMessageStateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblGroupMessageState record);

    @Update({
        "update group_message_state",
        "set user_social_group_id = #{userSocialGroupId,jdbcType=BIGINT},",
          "message_id = #{messageId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=INTEGER}",
        "where group_message_state_id = #{groupMessageStateId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblGroupMessageState record);
}