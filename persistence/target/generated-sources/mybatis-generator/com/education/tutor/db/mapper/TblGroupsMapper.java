package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGroups;
import com.education.tutor.db.domain.TblGroupsExample;
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

public interface TblGroupsMapper {
    @SelectProvider(type=TblGroupsSqlProvider.class, method="countByExample")
    long countByExample(TblGroupsExample example);

    @DeleteProvider(type=TblGroupsSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGroupsExample example);

    @Delete({
        "delete from groups",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into groups (group_name, display_label, ",
        "group_category, menu_array)",
        "values (#{groupName,jdbcType=VARCHAR}, #{displayLabel,jdbcType=VARCHAR}, ",
        "#{groupCategory,jdbcType=VARCHAR}, #{menuArray,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TblGroups record);

    @InsertProvider(type=TblGroupsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(TblGroups record);

    @SelectProvider(type=TblGroupsSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="group_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="display_label", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="group_category", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_array", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblGroups> selectByExample(TblGroupsExample example);

    @Select({
        "select",
        "id, group_name, display_label, group_category, menu_array",
        "from groups",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="group_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="display_label", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="group_category", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_array", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblGroups selectByPrimaryKey(Long id);

    @UpdateProvider(type=TblGroupsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGroups record, @Param("example") TblGroupsExample example);

    @UpdateProvider(type=TblGroupsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGroups record, @Param("example") TblGroupsExample example);

    @UpdateProvider(type=TblGroupsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblGroups record);

    @Update({
        "update groups",
        "set group_name = #{groupName,jdbcType=VARCHAR},",
          "display_label = #{displayLabel,jdbcType=VARCHAR},",
          "group_category = #{groupCategory,jdbcType=VARCHAR},",
          "menu_array = #{menuArray,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblGroups record);
}