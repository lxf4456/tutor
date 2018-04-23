package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblBid;
import com.education.tutor.db.domain.TblBidExample;
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

public interface TblBidMapper {
    @SelectProvider(type=TblBidSqlProvider.class, method="countByExample")
    long countByExample(TblBidExample example);

    @DeleteProvider(type=TblBidSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblBidExample example);

    @Delete({
        "delete from bid",
        "where bid_id = #{bidId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long bidId);

    @Insert({
        "insert into bid (user_main_id, organization_id, ",
        "bid_target_category, bid_target_name, ",
        "bid_clue_desc, bid_location, ",
        "bid_clue_source, bid_clue_org, ",
        "bid_tran_type, bid_procedure, ",
        "bid_no, plan_reply_time, ",
        "scope, owner_dept, ",
        "del_flag, status, ",
        "state_history, bid_solution_ref, ",
        "bid_extra_info, estimated_price_range, ",
        "current_reword_amount, followed_by, ",
        "contact_mobile, contact_email, ",
        "owner_region, created_by, ",
        "created_at, updated_at, ",
        "updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{organizationId,jdbcType=BIGINT}, ",
        "#{bidTargetCategory,jdbcType=VARCHAR}, #{bidTargetName,jdbcType=VARCHAR}, ",
        "#{bidClueDesc,jdbcType=VARCHAR}, #{bidLocation,jdbcType=VARCHAR}, ",
        "#{bidClueSource,jdbcType=SMALLINT}, #{bidClueOrg,jdbcType=VARCHAR}, ",
        "#{bidTranType,jdbcType=SMALLINT}, #{bidProcedure,jdbcType=VARCHAR}, ",
        "#{bidNo,jdbcType=VARCHAR}, #{planReplyTime,jdbcType=TIMESTAMP}, ",
        "#{scope,jdbcType=INTEGER}, #{ownerDept,jdbcType=VARCHAR}, ",
        "#{delFlag,jdbcType=SMALLINT}, #{status,jdbcType=INTEGER}, ",
        "#{stateHistory,jdbcType=VARCHAR}, #{bidSolutionRef,jdbcType=VARCHAR}, ",
        "#{bidExtraInfo,jdbcType=VARCHAR}, #{estimatedPriceRange,jdbcType=VARCHAR}, ",
        "#{currentRewordAmount,jdbcType=INTEGER}, #{followedBy,jdbcType=VARCHAR}, ",
        "#{contactMobile,jdbcType=VARCHAR}, #{contactEmail,jdbcType=VARCHAR}, ",
        "#{ownerRegion,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="bidId", before=false, resultType=Long.class)
    int insert(TblBid record);

    @InsertProvider(type=TblBidSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="bidId", before=false, resultType=Long.class)
    int insertSelective(TblBid record);

    @SelectProvider(type=TblBidSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="bid_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="bid_target_category", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_target_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_clue_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_clue_source", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="bid_clue_org", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_tran_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="bid_procedure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="plan_reply_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="scope", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="owner_dept", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state_history", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_solution_ref", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_extra_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="estimated_price_range", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="current_reword_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="followed_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblBid> selectByExample(TblBidExample example);

    @Select({
        "select",
        "bid_id, user_main_id, organization_id, bid_target_category, bid_target_name, ",
        "bid_clue_desc, bid_location, bid_clue_source, bid_clue_org, bid_tran_type, bid_procedure, ",
        "bid_no, plan_reply_time, scope, owner_dept, del_flag, status, state_history, ",
        "bid_solution_ref, bid_extra_info, estimated_price_range, current_reword_amount, ",
        "followed_by, contact_mobile, contact_email, owner_region, created_by, created_at, ",
        "updated_at, updated_by",
        "from bid",
        "where bid_id = #{bidId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="bid_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="bid_target_category", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_target_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_clue_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_clue_source", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="bid_clue_org", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_tran_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="bid_procedure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="plan_reply_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="scope", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="owner_dept", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state_history", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_solution_ref", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bid_extra_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="estimated_price_range", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="current_reword_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="followed_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblBid selectByPrimaryKey(Long bidId);

    @UpdateProvider(type=TblBidSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblBid record, @Param("example") TblBidExample example);

    @UpdateProvider(type=TblBidSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblBid record, @Param("example") TblBidExample example);

    @UpdateProvider(type=TblBidSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblBid record);

    @Update({
        "update bid",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "organization_id = #{organizationId,jdbcType=BIGINT},",
          "bid_target_category = #{bidTargetCategory,jdbcType=VARCHAR},",
          "bid_target_name = #{bidTargetName,jdbcType=VARCHAR},",
          "bid_clue_desc = #{bidClueDesc,jdbcType=VARCHAR},",
          "bid_location = #{bidLocation,jdbcType=VARCHAR},",
          "bid_clue_source = #{bidClueSource,jdbcType=SMALLINT},",
          "bid_clue_org = #{bidClueOrg,jdbcType=VARCHAR},",
          "bid_tran_type = #{bidTranType,jdbcType=SMALLINT},",
          "bid_procedure = #{bidProcedure,jdbcType=VARCHAR},",
          "bid_no = #{bidNo,jdbcType=VARCHAR},",
          "plan_reply_time = #{planReplyTime,jdbcType=TIMESTAMP},",
          "scope = #{scope,jdbcType=INTEGER},",
          "owner_dept = #{ownerDept,jdbcType=VARCHAR},",
          "del_flag = #{delFlag,jdbcType=SMALLINT},",
          "status = #{status,jdbcType=INTEGER},",
          "state_history = #{stateHistory,jdbcType=VARCHAR},",
          "bid_solution_ref = #{bidSolutionRef,jdbcType=VARCHAR},",
          "bid_extra_info = #{bidExtraInfo,jdbcType=VARCHAR},",
          "estimated_price_range = #{estimatedPriceRange,jdbcType=VARCHAR},",
          "current_reword_amount = #{currentRewordAmount,jdbcType=INTEGER},",
          "followed_by = #{followedBy,jdbcType=VARCHAR},",
          "contact_mobile = #{contactMobile,jdbcType=VARCHAR},",
          "contact_email = #{contactEmail,jdbcType=VARCHAR},",
          "owner_region = #{ownerRegion,jdbcType=VARCHAR},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where bid_id = #{bidId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblBid record);
}