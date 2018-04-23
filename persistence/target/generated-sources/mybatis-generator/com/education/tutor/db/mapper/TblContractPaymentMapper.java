package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblContractPayment;
import com.education.tutor.db.domain.TblContractPaymentExample;
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

public interface TblContractPaymentMapper {
    @SelectProvider(type=TblContractPaymentSqlProvider.class, method="countByExample")
    long countByExample(TblContractPaymentExample example);

    @DeleteProvider(type=TblContractPaymentSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblContractPaymentExample example);

    @Delete({
        "delete from contract_payment",
        "where contract_payment_id = #{contractPaymentId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long contractPaymentId);

    @Insert({
        "insert into contract_payment (contract_id, seq_no, ",
        "payment_type, commission_source_pk, ",
        "commission_level, target_pk, ",
        "currency, item_count, ",
        "exchange_ratio, description, ",
        "bill_date, remark, ",
        "fee_charged, payment_method, ",
        "status, updated_at, ",
        "updated_by)",
        "values (#{contractId,jdbcType=BIGINT}, #{seqNo,jdbcType=VARCHAR}, ",
        "#{paymentType,jdbcType=INTEGER}, #{commissionSourcePk,jdbcType=BIGINT}, ",
        "#{commissionLevel,jdbcType=INTEGER}, #{targetPk,jdbcType=BIGINT}, ",
        "#{currency,jdbcType=INTEGER}, #{itemCount,jdbcType=INTEGER}, ",
        "#{exchangeRatio,jdbcType=INTEGER}, #{description,jdbcType=VARCHAR}, ",
        "#{billDate,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR}, ",
        "#{feeCharged,jdbcType=INTEGER}, #{paymentMethod,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="contractPaymentId", before=false, resultType=Long.class)
    int insert(TblContractPayment record);

    @InsertProvider(type=TblContractPaymentSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="contractPaymentId", before=false, resultType=Long.class)
    int insertSelective(TblContractPayment record);

    @SelectProvider(type=TblContractPaymentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="contract_payment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="contract_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="seq_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="payment_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="commission_source_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="commission_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="currency", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="item_count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="exchange_ratio", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="description", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bill_date", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="fee_charged", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payment_method", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblContractPayment> selectByExample(TblContractPaymentExample example);

    @Select({
        "select",
        "contract_payment_id, contract_id, seq_no, payment_type, commission_source_pk, ",
        "commission_level, target_pk, currency, item_count, exchange_ratio, description, ",
        "bill_date, remark, fee_charged, payment_method, status, updated_at, updated_by",
        "from contract_payment",
        "where contract_payment_id = #{contractPaymentId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="contract_payment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="contract_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="seq_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="payment_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="commission_source_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="commission_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="currency", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="item_count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="exchange_ratio", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="description", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bill_date", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="fee_charged", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payment_method", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblContractPayment selectByPrimaryKey(Long contractPaymentId);

    @UpdateProvider(type=TblContractPaymentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblContractPayment record, @Param("example") TblContractPaymentExample example);

    @UpdateProvider(type=TblContractPaymentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblContractPayment record, @Param("example") TblContractPaymentExample example);

    @UpdateProvider(type=TblContractPaymentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblContractPayment record);

    @Update({
        "update contract_payment",
        "set contract_id = #{contractId,jdbcType=BIGINT},",
          "seq_no = #{seqNo,jdbcType=VARCHAR},",
          "payment_type = #{paymentType,jdbcType=INTEGER},",
          "commission_source_pk = #{commissionSourcePk,jdbcType=BIGINT},",
          "commission_level = #{commissionLevel,jdbcType=INTEGER},",
          "target_pk = #{targetPk,jdbcType=BIGINT},",
          "currency = #{currency,jdbcType=INTEGER},",
          "item_count = #{itemCount,jdbcType=INTEGER},",
          "exchange_ratio = #{exchangeRatio,jdbcType=INTEGER},",
          "description = #{description,jdbcType=VARCHAR},",
          "bill_date = #{billDate,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "fee_charged = #{feeCharged,jdbcType=INTEGER},",
          "payment_method = #{paymentMethod,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where contract_payment_id = #{contractPaymentId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblContractPayment record);
}