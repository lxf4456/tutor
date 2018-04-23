package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblProject;
import com.education.tutor.db.domain.TblProjectExample;
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

public interface TblProjectMapper {
    @SelectProvider(type=TblProjectSqlProvider.class, method="countByExample")
    long countByExample(TblProjectExample example);

    @DeleteProvider(type=TblProjectSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblProjectExample example);

    @Delete({
        "delete from project",
        "where project_id = #{projectId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long projectId);

    @Insert({
        "insert into project (project_desc, project_no, ",
        "project_name, project_org_area, ",
        "source_type, source_pk, ",
        "source_no, project_result, ",
        "project_step, project_owner, ",
        "project_manager, project_temp, ",
        "project_bid_url, project_supply_url, ",
        "project_quota_url, project_contract_url, ",
        "project_type, project_start, ",
        "project_end, status, ",
        "state_history, international_trade, ",
        "project_tran_type, project_alert_date, ",
        "owner_region, created_by, ",
        "created_at, social_group_pk, ",
        "updated_by, updated_at, ",
        "del_flag)",
        "values (#{projectDesc,jdbcType=VARCHAR}, #{projectNo,jdbcType=VARCHAR}, ",
        "#{projectName,jdbcType=VARCHAR}, #{projectOrgArea,jdbcType=VARCHAR}, ",
        "#{sourceType,jdbcType=INTEGER}, #{sourcePk,jdbcType=BIGINT}, ",
        "#{sourceNo,jdbcType=VARCHAR}, #{projectResult,jdbcType=VARCHAR}, ",
        "#{projectStep,jdbcType=VARCHAR}, #{projectOwner,jdbcType=VARCHAR}, ",
        "#{projectManager,jdbcType=VARCHAR}, #{projectTemp,jdbcType=VARCHAR}, ",
        "#{projectBidUrl,jdbcType=VARCHAR}, #{projectSupplyUrl,jdbcType=VARCHAR}, ",
        "#{projectQuotaUrl,jdbcType=VARCHAR}, #{projectContractUrl,jdbcType=VARCHAR}, ",
        "#{projectType,jdbcType=INTEGER}, #{projectStart,jdbcType=TIMESTAMP}, ",
        "#{projectEnd,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER}, ",
        "#{stateHistory,jdbcType=VARCHAR}, #{internationalTrade,jdbcType=INTEGER}, ",
        "#{projectTranType,jdbcType=INTEGER}, #{projectAlertDate,jdbcType=TIMESTAMP}, ",
        "#{ownerRegion,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{socialGroupPk,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{delFlag,jdbcType=SMALLINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="projectId", before=false, resultType=Long.class)
    int insert(TblProject record);

    @InsertProvider(type=TblProjectSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="projectId", before=false, resultType=Long.class)
    int insertSelective(TblProject record);

    @SelectProvider(type=TblProjectSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="project_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_org_area", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="source_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="source_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="source_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_step", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_owner", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_manager", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_temp", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_bid_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_supply_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_quota_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_contract_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="project_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="project_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state_history", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="international_trade", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="project_tran_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="project_alert_date", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="social_group_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT)
    })
    List<TblProject> selectByExample(TblProjectExample example);

    @Select({
        "select",
        "project_id, project_desc, project_no, project_name, project_org_area, source_type, ",
        "source_pk, source_no, project_result, project_step, project_owner, project_manager, ",
        "project_temp, project_bid_url, project_supply_url, project_quota_url, project_contract_url, ",
        "project_type, project_start, project_end, status, state_history, international_trade, ",
        "project_tran_type, project_alert_date, owner_region, created_by, created_at, ",
        "social_group_pk, updated_by, updated_at, del_flag",
        "from project",
        "where project_id = #{projectId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="project_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="project_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_org_area", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="source_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="source_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="source_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_result", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_step", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_owner", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_manager", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_temp", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_bid_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_supply_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_quota_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_contract_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="project_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="project_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state_history", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="international_trade", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="project_tran_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="project_alert_date", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="social_group_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT)
    })
    TblProject selectByPrimaryKey(Long projectId);

    @UpdateProvider(type=TblProjectSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblProject record, @Param("example") TblProjectExample example);

    @UpdateProvider(type=TblProjectSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblProject record, @Param("example") TblProjectExample example);

    @UpdateProvider(type=TblProjectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblProject record);

    @Update({
        "update project",
        "set project_desc = #{projectDesc,jdbcType=VARCHAR},",
          "project_no = #{projectNo,jdbcType=VARCHAR},",
          "project_name = #{projectName,jdbcType=VARCHAR},",
          "project_org_area = #{projectOrgArea,jdbcType=VARCHAR},",
          "source_type = #{sourceType,jdbcType=INTEGER},",
          "source_pk = #{sourcePk,jdbcType=BIGINT},",
          "source_no = #{sourceNo,jdbcType=VARCHAR},",
          "project_result = #{projectResult,jdbcType=VARCHAR},",
          "project_step = #{projectStep,jdbcType=VARCHAR},",
          "project_owner = #{projectOwner,jdbcType=VARCHAR},",
          "project_manager = #{projectManager,jdbcType=VARCHAR},",
          "project_temp = #{projectTemp,jdbcType=VARCHAR},",
          "project_bid_url = #{projectBidUrl,jdbcType=VARCHAR},",
          "project_supply_url = #{projectSupplyUrl,jdbcType=VARCHAR},",
          "project_quota_url = #{projectQuotaUrl,jdbcType=VARCHAR},",
          "project_contract_url = #{projectContractUrl,jdbcType=VARCHAR},",
          "project_type = #{projectType,jdbcType=INTEGER},",
          "project_start = #{projectStart,jdbcType=TIMESTAMP},",
          "project_end = #{projectEnd,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "state_history = #{stateHistory,jdbcType=VARCHAR},",
          "international_trade = #{internationalTrade,jdbcType=INTEGER},",
          "project_tran_type = #{projectTranType,jdbcType=INTEGER},",
          "project_alert_date = #{projectAlertDate,jdbcType=TIMESTAMP},",
          "owner_region = #{ownerRegion,jdbcType=VARCHAR},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "social_group_pk = #{socialGroupPk,jdbcType=BIGINT},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "del_flag = #{delFlag,jdbcType=SMALLINT}",
        "where project_id = #{projectId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblProject record);
}