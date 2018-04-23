package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblEnquiry;
import com.education.tutor.db.domain.TblEnquiryExample;
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

public interface TblEnquiryMapper {
    @SelectProvider(type=TblEnquirySqlProvider.class, method="countByExample")
    long countByExample(TblEnquiryExample example);

    @DeleteProvider(type=TblEnquirySqlProvider.class, method="deleteByExample")
    int deleteByExample(TblEnquiryExample example);

    @Delete({
        "delete from enquiry",
        "where enquiry_id = #{enquiryId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long enquiryId);

    @Insert({
        "insert into enquiry (user_main_id, organization_id, ",
        "seqno, name, enquiry_extra_info, ",
        "status, state_history, ",
        "tran_type, owner_region, ",
        "del_flag, created_at, ",
        "created_by, updated_at, ",
        "updated_by)",
        "values (#{userMainId,jdbcType=BIGINT}, #{organizationId,jdbcType=BIGINT}, ",
        "#{seqno,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{enquiryExtraInfo,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{stateHistory,jdbcType=VARCHAR}, ",
        "#{tranType,jdbcType=INTEGER}, #{ownerRegion,jdbcType=VARCHAR}, ",
        "#{delFlag,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="enquiryId", before=false, resultType=Long.class)
    int insert(TblEnquiry record);

    @InsertProvider(type=TblEnquirySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="enquiryId", before=false, resultType=Long.class)
    int insertSelective(TblEnquiry record);

    @SelectProvider(type=TblEnquirySqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="enquiry_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="seqno", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="enquiry_extra_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state_history", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tran_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="del_flag", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblEnquiry> selectByExample(TblEnquiryExample example);

    @Select({
        "select",
        "enquiry_id, user_main_id, organization_id, seqno, name, enquiry_extra_info, ",
        "status, state_history, tran_type, owner_region, del_flag, created_at, created_by, ",
        "updated_at, updated_by",
        "from enquiry",
        "where enquiry_id = #{enquiryId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="enquiry_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="seqno", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="enquiry_extra_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state_history", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tran_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="owner_region", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="del_flag", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="created_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblEnquiry selectByPrimaryKey(Long enquiryId);

    @UpdateProvider(type=TblEnquirySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblEnquiry record, @Param("example") TblEnquiryExample example);

    @UpdateProvider(type=TblEnquirySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblEnquiry record, @Param("example") TblEnquiryExample example);

    @UpdateProvider(type=TblEnquirySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblEnquiry record);

    @Update({
        "update enquiry",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "organization_id = #{organizationId,jdbcType=BIGINT},",
          "seqno = #{seqno,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "enquiry_extra_info = #{enquiryExtraInfo,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "state_history = #{stateHistory,jdbcType=VARCHAR},",
          "tran_type = #{tranType,jdbcType=INTEGER},",
          "owner_region = #{ownerRegion,jdbcType=VARCHAR},",
          "del_flag = #{delFlag,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where enquiry_id = #{enquiryId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblEnquiry record);
}