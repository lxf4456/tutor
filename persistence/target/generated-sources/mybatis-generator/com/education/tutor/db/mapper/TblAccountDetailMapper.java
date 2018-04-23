package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAccountDetail;
import com.education.tutor.db.domain.TblAccountDetailExample;
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

public interface TblAccountDetailMapper {
    @SelectProvider(type=TblAccountDetailSqlProvider.class, method="countByExample")
    long countByExample(TblAccountDetailExample example);

    @DeleteProvider(type=TblAccountDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblAccountDetailExample example);

    @Delete({
        "delete from account_detail",
        "where account_detail_id = #{accountDetailId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long accountDetailId);

    @Insert({
        "insert into account_detail (account_id, deposit_amount, ",
        "payment_amount, reward_amount, ",
        "withdraw_amount, balance, ",
        "channel, operation_type, ",
        "tran_no, order_no, ",
        "updated_at, updated_by)",
        "values (#{accountId,jdbcType=BIGINT}, #{depositAmount,jdbcType=INTEGER}, ",
        "#{paymentAmount,jdbcType=INTEGER}, #{rewardAmount,jdbcType=INTEGER}, ",
        "#{withdrawAmount,jdbcType=INTEGER}, #{balance,jdbcType=INTEGER}, ",
        "#{channel,jdbcType=VARCHAR}, #{operationType,jdbcType=VARCHAR}, ",
        "#{tranNo,jdbcType=VARCHAR}, #{orderNo,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="accountDetailId", before=false, resultType=Long.class)
    int insert(TblAccountDetail record);

    @InsertProvider(type=TblAccountDetailSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="accountDetailId", before=false, resultType=Long.class)
    int insertSelective(TblAccountDetail record);

    @SelectProvider(type=TblAccountDetailSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="account_detail_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="account_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="deposit_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payment_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="withdraw_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="channel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tran_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblAccountDetail> selectByExample(TblAccountDetailExample example);

    @Select({
        "select",
        "account_detail_id, account_id, deposit_amount, payment_amount, reward_amount, ",
        "withdraw_amount, balance, channel, operation_type, tran_no, order_no, updated_at, ",
        "updated_by",
        "from account_detail",
        "where account_detail_id = #{accountDetailId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="account_detail_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="account_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="deposit_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payment_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="withdraw_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="channel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tran_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblAccountDetail selectByPrimaryKey(Long accountDetailId);

    @UpdateProvider(type=TblAccountDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblAccountDetail record, @Param("example") TblAccountDetailExample example);

    @UpdateProvider(type=TblAccountDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblAccountDetail record, @Param("example") TblAccountDetailExample example);

    @UpdateProvider(type=TblAccountDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblAccountDetail record);

    @Update({
        "update account_detail",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "deposit_amount = #{depositAmount,jdbcType=INTEGER},",
          "payment_amount = #{paymentAmount,jdbcType=INTEGER},",
          "reward_amount = #{rewardAmount,jdbcType=INTEGER},",
          "withdraw_amount = #{withdrawAmount,jdbcType=INTEGER},",
          "balance = #{balance,jdbcType=INTEGER},",
          "channel = #{channel,jdbcType=VARCHAR},",
          "operation_type = #{operationType,jdbcType=VARCHAR},",
          "tran_no = #{tranNo,jdbcType=VARCHAR},",
          "order_no = #{orderNo,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where account_detail_id = #{accountDetailId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblAccountDetail record);
}