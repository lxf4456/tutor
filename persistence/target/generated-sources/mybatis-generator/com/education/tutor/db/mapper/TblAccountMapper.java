package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAccount;
import com.education.tutor.db.domain.TblAccountExample;
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

public interface TblAccountMapper {
    @SelectProvider(type=TblAccountSqlProvider.class, method="countByExample")
    long countByExample(TblAccountExample example);

    @DeleteProvider(type=TblAccountSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblAccountExample example);

    @Delete({
        "delete from account",
        "where account_id = #{accountId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long accountId);

    @Insert({
        "insert into account (user_main_id, govt_id_no, ",
        "govt_id_type, bank_name, ",
        "bank_account_type, bank_account_name, ",
        "bank_account_no, bank_account_country, ",
        "bank_account_address, bank_account_name_inter, ",
        "bank_account_swift, bank_account_swift_inter, ",
        "mobile, address, ",
        "deposit_sum, deposit_balance, ",
        "reward_sum, reward_balance, ",
        "withdraw_sum, withdraw_balance, ",
        "payout_sum, payout_balance, ",
        "balance, updated_at, ",
        "updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{govtIdNo,jdbcType=VARCHAR}, ",
        "#{govtIdType,jdbcType=SMALLINT}, #{bankName,jdbcType=VARCHAR}, ",
        "#{bankAccountType,jdbcType=INTEGER}, #{bankAccountName,jdbcType=VARCHAR}, ",
        "#{bankAccountNo,jdbcType=VARCHAR}, #{bankAccountCountry,jdbcType=VARCHAR}, ",
        "#{bankAccountAddress,jdbcType=VARCHAR}, #{bankAccountNameInter,jdbcType=VARCHAR}, ",
        "#{bankAccountSwift,jdbcType=VARCHAR}, #{bankAccountSwiftInter,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{depositSum,jdbcType=INTEGER}, #{depositBalance,jdbcType=INTEGER}, ",
        "#{rewardSum,jdbcType=INTEGER}, #{rewardBalance,jdbcType=INTEGER}, ",
        "#{withdrawSum,jdbcType=INTEGER}, #{withdrawBalance,jdbcType=INTEGER}, ",
        "#{payoutSum,jdbcType=INTEGER}, #{payoutBalance,jdbcType=INTEGER}, ",
        "#{balance,jdbcType=INTEGER}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="accountId", before=false, resultType=Long.class)
    int insert(TblAccount record);

    @InsertProvider(type=TblAccountSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="accountId", before=false, resultType=Long.class)
    int insertSelective(TblAccount record);

    @SelectProvider(type=TblAccountSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="account_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="govt_id_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="govt_id_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="bank_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="bank_account_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_country", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_name_inter", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_swift", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_swift_inter", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="deposit_sum", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="deposit_balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_sum", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="withdraw_sum", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="withdraw_balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payout_sum", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payout_balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblAccount> selectByExample(TblAccountExample example);

    @Select({
        "select",
        "account_id, user_main_id, govt_id_no, govt_id_type, bank_name, bank_account_type, ",
        "bank_account_name, bank_account_no, bank_account_country, bank_account_address, ",
        "bank_account_name_inter, bank_account_swift, bank_account_swift_inter, mobile, ",
        "address, deposit_sum, deposit_balance, reward_sum, reward_balance, withdraw_sum, ",
        "withdraw_balance, payout_sum, payout_balance, balance, updated_at, updated_by",
        "from account",
        "where account_id = #{accountId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="account_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="govt_id_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="govt_id_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="bank_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="bank_account_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_country", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_name_inter", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_swift", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bank_account_swift_inter", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="deposit_sum", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="deposit_balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_sum", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="withdraw_sum", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="withdraw_balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payout_sum", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payout_balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="balance", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblAccount selectByPrimaryKey(Long accountId);

    @UpdateProvider(type=TblAccountSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblAccount record, @Param("example") TblAccountExample example);

    @UpdateProvider(type=TblAccountSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblAccount record, @Param("example") TblAccountExample example);

    @UpdateProvider(type=TblAccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblAccount record);

    @Update({
        "update account",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "govt_id_no = #{govtIdNo,jdbcType=VARCHAR},",
          "govt_id_type = #{govtIdType,jdbcType=SMALLINT},",
          "bank_name = #{bankName,jdbcType=VARCHAR},",
          "bank_account_type = #{bankAccountType,jdbcType=INTEGER},",
          "bank_account_name = #{bankAccountName,jdbcType=VARCHAR},",
          "bank_account_no = #{bankAccountNo,jdbcType=VARCHAR},",
          "bank_account_country = #{bankAccountCountry,jdbcType=VARCHAR},",
          "bank_account_address = #{bankAccountAddress,jdbcType=VARCHAR},",
          "bank_account_name_inter = #{bankAccountNameInter,jdbcType=VARCHAR},",
          "bank_account_swift = #{bankAccountSwift,jdbcType=VARCHAR},",
          "bank_account_swift_inter = #{bankAccountSwiftInter,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "deposit_sum = #{depositSum,jdbcType=INTEGER},",
          "deposit_balance = #{depositBalance,jdbcType=INTEGER},",
          "reward_sum = #{rewardSum,jdbcType=INTEGER},",
          "reward_balance = #{rewardBalance,jdbcType=INTEGER},",
          "withdraw_sum = #{withdrawSum,jdbcType=INTEGER},",
          "withdraw_balance = #{withdrawBalance,jdbcType=INTEGER},",
          "payout_sum = #{payoutSum,jdbcType=INTEGER},",
          "payout_balance = #{payoutBalance,jdbcType=INTEGER},",
          "balance = #{balance,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where account_id = #{accountId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblAccount record);
}