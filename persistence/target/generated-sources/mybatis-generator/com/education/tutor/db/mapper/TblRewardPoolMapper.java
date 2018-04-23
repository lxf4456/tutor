package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRewardPool;
import com.education.tutor.db.domain.TblRewardPoolExample;
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

public interface TblRewardPoolMapper {
    @SelectProvider(type=TblRewardPoolSqlProvider.class, method="countByExample")
    long countByExample(TblRewardPoolExample example);

    @DeleteProvider(type=TblRewardPoolSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRewardPoolExample example);

    @Delete({
        "delete from reward_pool",
        "where reward_pool_id = #{rewardPoolId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long rewardPoolId);

    @Insert({
        "insert into reward_pool (account_id, reward_type, ",
        "reward_state, reward_amount, ",
        "reward_purpose, effective_at, ",
        "updated_at)",
        "values (#{accountId,jdbcType=BIGINT}, #{rewardType,jdbcType=INTEGER}, ",
        "#{rewardState,jdbcType=INTEGER}, #{rewardAmount,jdbcType=INTEGER}, ",
        "#{rewardPurpose,jdbcType=VARCHAR}, #{effectiveAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="rewardPoolId", before=false, resultType=Long.class)
    int insert(TblRewardPool record);

    @InsertProvider(type=TblRewardPoolSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="rewardPoolId", before=false, resultType=Long.class)
    int insertSelective(TblRewardPool record);

    @SelectProvider(type=TblRewardPoolSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="reward_pool_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="account_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="reward_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_purpose", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="effective_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblRewardPool> selectByExample(TblRewardPoolExample example);

    @Select({
        "select",
        "reward_pool_id, account_id, reward_type, reward_state, reward_amount, reward_purpose, ",
        "effective_at, updated_at",
        "from reward_pool",
        "where reward_pool_id = #{rewardPoolId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="reward_pool_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="account_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="reward_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reward_purpose", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="effective_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblRewardPool selectByPrimaryKey(Long rewardPoolId);

    @UpdateProvider(type=TblRewardPoolSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRewardPool record, @Param("example") TblRewardPoolExample example);

    @UpdateProvider(type=TblRewardPoolSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRewardPool record, @Param("example") TblRewardPoolExample example);

    @UpdateProvider(type=TblRewardPoolSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblRewardPool record);

    @Update({
        "update reward_pool",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "reward_type = #{rewardType,jdbcType=INTEGER},",
          "reward_state = #{rewardState,jdbcType=INTEGER},",
          "reward_amount = #{rewardAmount,jdbcType=INTEGER},",
          "reward_purpose = #{rewardPurpose,jdbcType=VARCHAR},",
          "effective_at = #{effectiveAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where reward_pool_id = #{rewardPoolId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblRewardPool record);
}