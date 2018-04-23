package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblContractRelation;
import com.education.tutor.db.domain.TblContractRelationExample;
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

public interface TblContractRelationMapper {
    @SelectProvider(type=TblContractRelationSqlProvider.class, method="countByExample")
    long countByExample(TblContractRelationExample example);

    @DeleteProvider(type=TblContractRelationSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblContractRelationExample example);

    @Delete({
        "delete from contract_relation",
        "where contract_relation_id = #{contractRelationId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long contractRelationId);

    @Insert({
        "insert into contract_relation (contract_id, relation_type, ",
        "relation_pk, relation_description, ",
        "relation_state, remark, ",
        "updated_by, updated_at)",
        "values (#{contractId,jdbcType=BIGINT}, #{relationType,jdbcType=INTEGER}, ",
        "#{relationPk,jdbcType=BIGINT}, #{relationDescription,jdbcType=VARCHAR}, ",
        "#{relationState,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="contractRelationId", before=false, resultType=Long.class)
    int insert(TblContractRelation record);

    @InsertProvider(type=TblContractRelationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="contractRelationId", before=false, resultType=Long.class)
    int insertSelective(TblContractRelation record);

    @SelectProvider(type=TblContractRelationSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="contract_relation_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="contract_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="relation_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="relation_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="relation_description", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="relation_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblContractRelation> selectByExample(TblContractRelationExample example);

    @Select({
        "select",
        "contract_relation_id, contract_id, relation_type, relation_pk, relation_description, ",
        "relation_state, remark, updated_by, updated_at",
        "from contract_relation",
        "where contract_relation_id = #{contractRelationId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="contract_relation_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="contract_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="relation_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="relation_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="relation_description", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="relation_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblContractRelation selectByPrimaryKey(Long contractRelationId);

    @UpdateProvider(type=TblContractRelationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblContractRelation record, @Param("example") TblContractRelationExample example);

    @UpdateProvider(type=TblContractRelationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblContractRelation record, @Param("example") TblContractRelationExample example);

    @UpdateProvider(type=TblContractRelationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblContractRelation record);

    @Update({
        "update contract_relation",
        "set contract_id = #{contractId,jdbcType=BIGINT},",
          "relation_type = #{relationType,jdbcType=INTEGER},",
          "relation_pk = #{relationPk,jdbcType=BIGINT},",
          "relation_description = #{relationDescription,jdbcType=VARCHAR},",
          "relation_state = #{relationState,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where contract_relation_id = #{contractRelationId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblContractRelation record);
}