package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGroupMembers;
import com.education.tutor.db.domain.TblGroupMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TblGroupMembersMapper {
    @SelectProvider(type=TblGroupMembersSqlProvider.class, method="countByExample")
    long countByExample(TblGroupMembersExample example);

    @DeleteProvider(type=TblGroupMembersSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGroupMembersExample example);

    @Delete({
        "delete from group_members",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into group_members (id, username, ",
        "group_id)",
        "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{groupId,jdbcType=BIGINT})"
    })
    int insert(TblGroupMembers record);

    @InsertProvider(type=TblGroupMembersSqlProvider.class, method="insertSelective")
    int insertSelective(TblGroupMembers record);

    @SelectProvider(type=TblGroupMembersSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<TblGroupMembers> selectByExample(TblGroupMembersExample example);

    @Select({
        "select",
        "id, username, group_id",
        "from group_members",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    TblGroupMembers selectByPrimaryKey(Long id);

    @UpdateProvider(type=TblGroupMembersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGroupMembers record, @Param("example") TblGroupMembersExample example);

    @UpdateProvider(type=TblGroupMembersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGroupMembers record, @Param("example") TblGroupMembersExample example);

    @UpdateProvider(type=TblGroupMembersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblGroupMembers record);

    @Update({
        "update group_members",
        "set username = #{username,jdbcType=VARCHAR},",
          "group_id = #{groupId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblGroupMembers record);
}