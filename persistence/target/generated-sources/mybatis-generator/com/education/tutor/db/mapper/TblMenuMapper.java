package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblMenu;
import com.education.tutor.db.domain.TblMenuExample;
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

public interface TblMenuMapper {
    @SelectProvider(type=TblMenuSqlProvider.class, method="countByExample")
    long countByExample(TblMenuExample example);

    @DeleteProvider(type=TblMenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblMenuExample example);

    @Delete({
        "delete from menu",
        "where menu_id = #{menuId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long menuId);

    @Insert({
        "insert into menu (menu_name, menu_lang, ",
        "menu_url, menu_status, ",
        "menu_parent_id, menu_type, ",
        "iconcls, expand, ",
        "sort_no, is_show, ",
        "permission, remark, ",
        "created_by, created_at, ",
        "updated_by, updated_at)",
        "values (#{menuName,jdbcType=VARCHAR}, #{menuLang,jdbcType=VARCHAR}, ",
        "#{menuUrl,jdbcType=VARCHAR}, #{menuStatus,jdbcType=INTEGER}, ",
        "#{menuParentId,jdbcType=BIGINT}, #{menuType,jdbcType=INTEGER}, ",
        "#{iconcls,jdbcType=VARCHAR}, #{expand,jdbcType=INTEGER}, ",
        "#{sortNo,jdbcType=INTEGER}, #{isShow,jdbcType=INTEGER}, ",
        "#{permission,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="menuId", before=false, resultType=Long.class)
    int insert(TblMenu record);

    @InsertProvider(type=TblMenuSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="menuId", before=false, resultType=Long.class)
    int insertSelective(TblMenu record);

    @SelectProvider(type=TblMenuSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="menu_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="menu_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_lang", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="menu_parent_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="menu_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="iconcls", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expand", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="sort_no", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_show", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="permission", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblMenu> selectByExample(TblMenuExample example);

    @Select({
        "select",
        "menu_id, menu_name, menu_lang, menu_url, menu_status, menu_parent_id, menu_type, ",
        "iconcls, expand, sort_no, is_show, permission, remark, created_by, created_at, ",
        "updated_by, updated_at",
        "from menu",
        "where menu_id = #{menuId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="menu_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="menu_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_lang", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="menu_parent_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="menu_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="iconcls", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expand", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="sort_no", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_show", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="permission", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblMenu selectByPrimaryKey(Long menuId);

    @UpdateProvider(type=TblMenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblMenu record, @Param("example") TblMenuExample example);

    @UpdateProvider(type=TblMenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblMenu record, @Param("example") TblMenuExample example);

    @UpdateProvider(type=TblMenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblMenu record);

    @Update({
        "update menu",
        "set menu_name = #{menuName,jdbcType=VARCHAR},",
          "menu_lang = #{menuLang,jdbcType=VARCHAR},",
          "menu_url = #{menuUrl,jdbcType=VARCHAR},",
          "menu_status = #{menuStatus,jdbcType=INTEGER},",
          "menu_parent_id = #{menuParentId,jdbcType=BIGINT},",
          "menu_type = #{menuType,jdbcType=INTEGER},",
          "iconcls = #{iconcls,jdbcType=VARCHAR},",
          "expand = #{expand,jdbcType=INTEGER},",
          "sort_no = #{sortNo,jdbcType=INTEGER},",
          "is_show = #{isShow,jdbcType=INTEGER},",
          "permission = #{permission,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where menu_id = #{menuId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblMenu record);
}