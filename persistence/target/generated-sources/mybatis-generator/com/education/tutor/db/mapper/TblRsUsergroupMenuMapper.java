package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsUsergroupMenu;
import com.education.tutor.db.domain.TblRsUsergroupMenuExample;
import com.education.tutor.db.domain.TblRsUsergroupMenuKey;
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

public interface TblRsUsergroupMenuMapper {
    @SelectProvider(type=TblRsUsergroupMenuSqlProvider.class, method="countByExample")
    long countByExample(TblRsUsergroupMenuExample example);

    @DeleteProvider(type=TblRsUsergroupMenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRsUsergroupMenuExample example);

    @Delete({
        "delete from rs_usergroup_menu",
        "where menu_id = #{menuId,jdbcType=BIGINT}",
          "and owner_pk = #{ownerPk,jdbcType=BIGINT}",
          "and owner_type = #{ownerType,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(TblRsUsergroupMenuKey key);

    @Insert({
        "insert into rs_usergroup_menu (menu_id, owner_pk, ",
        "owner_type, menu_level)",
        "values (#{menuId,jdbcType=BIGINT}, #{ownerPk,jdbcType=BIGINT}, ",
        "#{ownerType,jdbcType=INTEGER}, #{menuLevel,jdbcType=INTEGER})"
    })
    int insert(TblRsUsergroupMenu record);

    @InsertProvider(type=TblRsUsergroupMenuSqlProvider.class, method="insertSelective")
    int insertSelective(TblRsUsergroupMenu record);

    @SelectProvider(type=TblRsUsergroupMenuSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="menu_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="owner_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="owner_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="menu_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<TblRsUsergroupMenu> selectByExample(TblRsUsergroupMenuExample example);

    @Select({
        "select",
        "menu_id, owner_pk, owner_type, menu_level",
        "from rs_usergroup_menu",
        "where menu_id = #{menuId,jdbcType=BIGINT}",
          "and owner_pk = #{ownerPk,jdbcType=BIGINT}",
          "and owner_type = #{ownerType,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="menu_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="owner_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="owner_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="menu_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    TblRsUsergroupMenu selectByPrimaryKey(TblRsUsergroupMenuKey key);

    @UpdateProvider(type=TblRsUsergroupMenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRsUsergroupMenu record, @Param("example") TblRsUsergroupMenuExample example);

    @UpdateProvider(type=TblRsUsergroupMenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRsUsergroupMenu record, @Param("example") TblRsUsergroupMenuExample example);

    @UpdateProvider(type=TblRsUsergroupMenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblRsUsergroupMenu record);

    @Update({
        "update rs_usergroup_menu",
        "set menu_level = #{menuLevel,jdbcType=INTEGER}",
        "where menu_id = #{menuId,jdbcType=BIGINT}",
          "and owner_pk = #{ownerPk,jdbcType=BIGINT}",
          "and owner_type = #{ownerType,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TblRsUsergroupMenu record);
}