package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblContract;
import com.education.tutor.db.domain.TblContractExample;
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

public interface TblContractMapper {
    @SelectProvider(type=TblContractSqlProvider.class, method="countByExample")
    long countByExample(TblContractExample example);

    @DeleteProvider(type=TblContractSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblContractExample example);

    @Delete({
        "delete from contract",
        "where contract_id = #{contractId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long contractId);

    @Insert({
        "insert into contract (project_id, organization_id, ",
        "contract_name, contract_code, ",
        "contract_doc_url, contract_type, ",
        "contract_state, contract_start, ",
        "contract_end, contract_step, ",
        "contract_amount, contract_currency, ",
        "created_at, updated_at, ",
        "updated_by)",
        "values (#{projectId,jdbcType=BIGINT}, #{organizationId,jdbcType=BIGINT}, ",
        "#{contractName,jdbcType=VARCHAR}, #{contractCode,jdbcType=VARCHAR}, ",
        "#{contractDocUrl,jdbcType=VARCHAR}, #{contractType,jdbcType=INTEGER}, ",
        "#{contractState,jdbcType=INTEGER}, #{contractStart,jdbcType=TIMESTAMP}, ",
        "#{contractEnd,jdbcType=TIMESTAMP}, #{contractStep,jdbcType=VARCHAR}, ",
        "#{contractAmount,jdbcType=INTEGER}, #{contractCurrency,jdbcType=INTEGER}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="contractId", before=false, resultType=Long.class)
    int insert(TblContract record);

    @InsertProvider(type=TblContractSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="contractId", before=false, resultType=Long.class)
    int insertSelective(TblContract record);

    @SelectProvider(type=TblContractSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="contract_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="contract_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contract_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contract_doc_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contract_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="contract_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="contract_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="contract_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="contract_step", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contract_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="contract_currency", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblContract> selectByExample(TblContractExample example);

    @Select({
        "select",
        "contract_id, project_id, organization_id, contract_name, contract_code, contract_doc_url, ",
        "contract_type, contract_state, contract_start, contract_end, contract_step, ",
        "contract_amount, contract_currency, created_at, updated_at, updated_by",
        "from contract",
        "where contract_id = #{contractId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="contract_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="contract_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contract_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contract_doc_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contract_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="contract_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="contract_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="contract_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="contract_step", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contract_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="contract_currency", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblContract selectByPrimaryKey(Long contractId);

    @UpdateProvider(type=TblContractSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblContract record, @Param("example") TblContractExample example);

    @UpdateProvider(type=TblContractSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblContract record, @Param("example") TblContractExample example);

    @UpdateProvider(type=TblContractSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblContract record);

    @Update({
        "update contract",
        "set project_id = #{projectId,jdbcType=BIGINT},",
          "organization_id = #{organizationId,jdbcType=BIGINT},",
          "contract_name = #{contractName,jdbcType=VARCHAR},",
          "contract_code = #{contractCode,jdbcType=VARCHAR},",
          "contract_doc_url = #{contractDocUrl,jdbcType=VARCHAR},",
          "contract_type = #{contractType,jdbcType=INTEGER},",
          "contract_state = #{contractState,jdbcType=INTEGER},",
          "contract_start = #{contractStart,jdbcType=TIMESTAMP},",
          "contract_end = #{contractEnd,jdbcType=TIMESTAMP},",
          "contract_step = #{contractStep,jdbcType=VARCHAR},",
          "contract_amount = #{contractAmount,jdbcType=INTEGER},",
          "contract_currency = #{contractCurrency,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where contract_id = #{contractId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblContract record);
}