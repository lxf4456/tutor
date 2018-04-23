package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblQuota;
import com.education.tutor.db.domain.TblQuotaExample;
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

public interface TblQuotaMapper {
    @SelectProvider(type=TblQuotaSqlProvider.class, method="countByExample")
    long countByExample(TblQuotaExample example);

    @DeleteProvider(type=TblQuotaSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblQuotaExample example);

    @Delete({
        "delete from quota",
        "where quota_id = #{quotaId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long quotaId);

    @Insert({
        "insert into quota (user_main_id, organization_id, ",
        "quote_target_category, quote_target_name, ",
        "quote_clue_desc, quote_location, ",
        "quote_clue_source, quote_clue_org, ",
        "quote_tran_type, quote_procedure, ",
        "quote_geo_lng, quote_geo_lat, ",
        "quote_doc_img, quote_solution_ref, ",
        "plan_reply_time, scope, ",
        "owner_region, owner_dept, ",
        "del_flag, status, ",
        "state_history, estimated_price_range, ",
        "current_reword_amount, followed_by, ",
        "contact_mobile, contact_email, ",
        "quota_extra_info, created_at, ",
        "created_by, updated_at, ",
        "updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{organizationId,jdbcType=BIGINT}, ",
        "#{quoteTargetCategory,jdbcType=SMALLINT}, #{quoteTargetName,jdbcType=VARCHAR}, ",
        "#{quoteClueDesc,jdbcType=VARCHAR}, #{quoteLocation,jdbcType=VARCHAR}, ",
        "#{quoteClueSource,jdbcType=SMALLINT}, #{quoteClueOrg,jdbcType=VARCHAR}, ",
        "#{quoteTranType,jdbcType=SMALLINT}, #{quoteProcedure,jdbcType=VARCHAR}, ",
        "#{quoteGeoLng,jdbcType=DOUBLE}, #{quoteGeoLat,jdbcType=DOUBLE}, ",
        "#{quoteDocImg,jdbcType=VARCHAR}, #{quoteSolutionRef,jdbcType=VARCHAR}, ",
        "#{planReplyTime,jdbcType=TIMESTAMP}, #{scope,jdbcType=INTEGER}, ",
        "#{ownerRegion,jdbcType=VARCHAR}, #{ownerDept,jdbcType=VARCHAR}, ",
        "#{delFlag,jdbcType=SMALLINT}, #{status,jdbcType=INTEGER}, ",
        "#{stateHistory,jdbcType=VARCHAR}, #{estimatedPriceRange,jdbcType=VARCHAR}, ",
        "#{currentRewordAmount,jdbcType=INTEGER}, #{followedBy,jdbcType=VARCHAR}, ",
        "#{contactMobile,jdbcType=VARCHAR}, #{contactEmail,jdbcType=VARCHAR}, ",
        "#{quotaExtraInfo,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="quotaId", before=false, resultType=Long.class)
    int insert(TblQuota record);

    @InsertProvider(type=TblQuotaSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="quotaId", before=false, resultType=Long.class)
    int insertSelective(TblQuota record);

    @SelectProvider(type=TblQuotaSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="quota_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="quote_target_category", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="quote_target_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_clue_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_clue_source", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="quote_clue_org", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_tran_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="quote_procedure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_geo_lng", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="quote_geo_lat", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="quote_doc_img", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_solution_ref", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="plan_reply_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="scope", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_dept", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state_history", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="estimated_price_range", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="current_reword_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="followed_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quota_extra_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblQuota> selectByExample(TblQuotaExample example);

    @Select({
        "select",
        "quota_id, user_main_id, organization_id, quote_target_category, quote_target_name, ",
        "quote_clue_desc, quote_location, quote_clue_source, quote_clue_org, quote_tran_type, ",
        "quote_procedure, quote_geo_lng, quote_geo_lat, quote_doc_img, quote_solution_ref, ",
        "plan_reply_time, scope, owner_region, owner_dept, del_flag, status, state_history, ",
        "estimated_price_range, current_reword_amount, followed_by, contact_mobile, contact_email, ",
        "quota_extra_info, created_at, created_by, updated_at, updated_by",
        "from quota",
        "where quota_id = #{quotaId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="quota_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="quote_target_category", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="quote_target_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_clue_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_location", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_clue_source", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="quote_clue_org", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_tran_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="quote_procedure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_geo_lng", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="quote_geo_lat", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="quote_doc_img", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quote_solution_ref", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="plan_reply_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="scope", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_dept", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state_history", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="estimated_price_range", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="current_reword_amount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="followed_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="quota_extra_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblQuota selectByPrimaryKey(Long quotaId);

    @UpdateProvider(type=TblQuotaSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblQuota record, @Param("example") TblQuotaExample example);

    @UpdateProvider(type=TblQuotaSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblQuota record, @Param("example") TblQuotaExample example);

    @UpdateProvider(type=TblQuotaSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblQuota record);

    @Update({
        "update quota",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "organization_id = #{organizationId,jdbcType=BIGINT},",
          "quote_target_category = #{quoteTargetCategory,jdbcType=SMALLINT},",
          "quote_target_name = #{quoteTargetName,jdbcType=VARCHAR},",
          "quote_clue_desc = #{quoteClueDesc,jdbcType=VARCHAR},",
          "quote_location = #{quoteLocation,jdbcType=VARCHAR},",
          "quote_clue_source = #{quoteClueSource,jdbcType=SMALLINT},",
          "quote_clue_org = #{quoteClueOrg,jdbcType=VARCHAR},",
          "quote_tran_type = #{quoteTranType,jdbcType=SMALLINT},",
          "quote_procedure = #{quoteProcedure,jdbcType=VARCHAR},",
          "quote_geo_lng = #{quoteGeoLng,jdbcType=DOUBLE},",
          "quote_geo_lat = #{quoteGeoLat,jdbcType=DOUBLE},",
          "quote_doc_img = #{quoteDocImg,jdbcType=VARCHAR},",
          "quote_solution_ref = #{quoteSolutionRef,jdbcType=VARCHAR},",
          "plan_reply_time = #{planReplyTime,jdbcType=TIMESTAMP},",
          "scope = #{scope,jdbcType=INTEGER},",
          "owner_region = #{ownerRegion,jdbcType=VARCHAR},",
          "owner_dept = #{ownerDept,jdbcType=VARCHAR},",
          "del_flag = #{delFlag,jdbcType=SMALLINT},",
          "status = #{status,jdbcType=INTEGER},",
          "state_history = #{stateHistory,jdbcType=VARCHAR},",
          "estimated_price_range = #{estimatedPriceRange,jdbcType=VARCHAR},",
          "current_reword_amount = #{currentRewordAmount,jdbcType=INTEGER},",
          "followed_by = #{followedBy,jdbcType=VARCHAR},",
          "contact_mobile = #{contactMobile,jdbcType=VARCHAR},",
          "contact_email = #{contactEmail,jdbcType=VARCHAR},",
          "quota_extra_info = #{quotaExtraInfo,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where quota_id = #{quotaId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblQuota record);
}