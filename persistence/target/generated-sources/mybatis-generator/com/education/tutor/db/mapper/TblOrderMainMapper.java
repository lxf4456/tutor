package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblOrderMain;
import com.education.tutor.db.domain.TblOrderMainExample;
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

public interface TblOrderMainMapper {
    @SelectProvider(type=TblOrderMainSqlProvider.class, method="countByExample")
    long countByExample(TblOrderMainExample example);

    @DeleteProvider(type=TblOrderMainSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblOrderMainExample example);

    @Delete({
        "delete from order_main",
        "where order_main_id = #{orderMainId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long orderMainId);

    @Insert({
        "insert into order_main (user_main_id, reward_pool_id, ",
        "order_no, order_type, ",
        "order_state, order_amount, ",
        "order_issued_by, order_target_to, ",
        "order_content, vocher_state, ",
        "vocher_title, payment_state, ",
        "payment_desc, delivery_state, ",
        "delivery_location, delivery_desc, ",
        "followup, updated_at, ",
        "updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{rewardPoolId,jdbcType=BIGINT}, ",
        "#{orderNo,jdbcType=VARCHAR}, #{orderType,jdbcType=INTEGER}, ",
        "#{orderState,jdbcType=INTEGER}, #{orderAmount,jdbcType=INTEGER}, ",
        "#{orderIssuedBy,jdbcType=VARCHAR}, #{orderTargetTo,jdbcType=VARCHAR}, ",
        "#{orderContent,jdbcType=VARCHAR}, #{vocherState,jdbcType=INTEGER}, ",
        "#{vocherTitle,jdbcType=VARCHAR}, #{paymentState,jdbcType=INTEGER}, ",
        "#{paymentDesc,jdbcType=VARCHAR}, #{deliveryState,jdbcType=INTEGER}, ",
        "#{deliveryLocation,jdbcType=VARCHAR}, #{deliveryDesc,jdbcType=VARCHAR}, ",
        "#{followup,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderMainId", before=false, resultType=Long.class)
    int insert(TblOrderMain record);

    @InsertProvider(type=TblOrderMainSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderMainId", before=false, resultType=Long.class)
    int insertSelective(TblOrderMain record);

    @SelectProvider(type=TblOrderMainSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="order_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="reward_pool_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="order_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="order_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="order_issued_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_target_to", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="vocher_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="vocher_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="payment_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payment_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="delivery_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="delivery_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="delivery_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="followup", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblOrderMain> selectByExample(TblOrderMainExample example);

    @Select({
        "select",
        "order_main_id, user_main_id, reward_pool_id, order_no, order_type, order_state, ",
        "order_amount, order_issued_by, order_target_to, order_content, vocher_state, ",
        "vocher_title, payment_state, payment_desc, delivery_state, delivery_location, ",
        "delivery_desc, followup, updated_at, updated_by",
        "from order_main",
        "where order_main_id = #{orderMainId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="order_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="reward_pool_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="order_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="order_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="order_issued_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_target_to", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="vocher_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="vocher_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="payment_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="payment_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="delivery_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="delivery_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="delivery_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="followup", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblOrderMain selectByPrimaryKey(Long orderMainId);

    @UpdateProvider(type=TblOrderMainSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblOrderMain record, @Param("example") TblOrderMainExample example);

    @UpdateProvider(type=TblOrderMainSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblOrderMain record, @Param("example") TblOrderMainExample example);

    @UpdateProvider(type=TblOrderMainSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblOrderMain record);

    @Update({
        "update order_main",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "reward_pool_id = #{rewardPoolId,jdbcType=BIGINT},",
          "order_no = #{orderNo,jdbcType=VARCHAR},",
          "order_type = #{orderType,jdbcType=INTEGER},",
          "order_state = #{orderState,jdbcType=INTEGER},",
          "order_amount = #{orderAmount,jdbcType=INTEGER},",
          "order_issued_by = #{orderIssuedBy,jdbcType=VARCHAR},",
          "order_target_to = #{orderTargetTo,jdbcType=VARCHAR},",
          "order_content = #{orderContent,jdbcType=VARCHAR},",
          "vocher_state = #{vocherState,jdbcType=INTEGER},",
          "vocher_title = #{vocherTitle,jdbcType=VARCHAR},",
          "payment_state = #{paymentState,jdbcType=INTEGER},",
          "payment_desc = #{paymentDesc,jdbcType=VARCHAR},",
          "delivery_state = #{deliveryState,jdbcType=INTEGER},",
          "delivery_location = #{deliveryLocation,jdbcType=VARCHAR},",
          "delivery_desc = #{deliveryDesc,jdbcType=VARCHAR},",
          "followup = #{followup,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where order_main_id = #{orderMainId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblOrderMain record);
}