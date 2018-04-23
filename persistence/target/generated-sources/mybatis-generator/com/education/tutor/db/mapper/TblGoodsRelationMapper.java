package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoodsRelation;
import com.education.tutor.db.domain.TblGoodsRelationExample;
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

public interface TblGoodsRelationMapper {
    @SelectProvider(type=TblGoodsRelationSqlProvider.class, method="countByExample")
    long countByExample(TblGoodsRelationExample example);

    @DeleteProvider(type=TblGoodsRelationSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGoodsRelationExample example);

    @Delete({
        "delete from goods_relation",
        "where goods_relation_id = #{goodsRelationId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long goodsRelationId);

    @Insert({
        "insert into goods_relation (goods_id, target_type, ",
        "target_pk, del_flag, ",
        "search_code, project_no, ",
        "state, demand_amount, ",
        "tran_type, updated_at, ",
        "updated_by, project_json)",
        "values (#{goodsId,jdbcType=BIGINT}, #{targetType,jdbcType=INTEGER}, ",
        "#{targetPk,jdbcType=BIGINT}, #{delFlag,jdbcType=SMALLINT}, ",
        "#{searchCode,jdbcType=VARCHAR}, #{projectNo,jdbcType=VARCHAR}, ",
        "#{state,jdbcType=INTEGER}, #{demandAmount,jdbcType=INTEGER}, ",
        "#{tranType,jdbcType=INTEGER}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{projectJson,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsRelationId", before=false, resultType=Long.class)
    int insert(TblGoodsRelation record);

    @InsertProvider(type=TblGoodsRelationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsRelationId", before=false, resultType=Long.class)
    int insertSelective(TblGoodsRelation record);

    @SelectProvider(type=TblGoodsRelationSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="goods_relation_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="goods_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="search_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="demand_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="tran_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_json", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblGoodsRelation> selectByExample(TblGoodsRelationExample example);

    @Select({
        "select",
        "goods_relation_id, goods_id, target_type, target_pk, del_flag, search_code, ",
        "project_no, state, demand_amount, tran_type, updated_at, updated_by, project_json",
        "from goods_relation",
        "where goods_relation_id = #{goodsRelationId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="goods_relation_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="goods_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="search_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="demand_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="tran_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_json", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblGoodsRelation selectByPrimaryKey(Long goodsRelationId);

    @UpdateProvider(type=TblGoodsRelationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGoodsRelation record, @Param("example") TblGoodsRelationExample example);

    @UpdateProvider(type=TblGoodsRelationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGoodsRelation record, @Param("example") TblGoodsRelationExample example);

    @UpdateProvider(type=TblGoodsRelationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblGoodsRelation record);

    @Update({
        "update goods_relation",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "target_type = #{targetType,jdbcType=INTEGER},",
          "target_pk = #{targetPk,jdbcType=BIGINT},",
          "del_flag = #{delFlag,jdbcType=SMALLINT},",
          "search_code = #{searchCode,jdbcType=VARCHAR},",
          "project_no = #{projectNo,jdbcType=VARCHAR},",
          "state = #{state,jdbcType=INTEGER},",
          "demand_amount = #{demandAmount,jdbcType=INTEGER},",
          "tran_type = #{tranType,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "project_json = #{projectJson,jdbcType=VARCHAR}",
        "where goods_relation_id = #{goodsRelationId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblGoodsRelation record);
}