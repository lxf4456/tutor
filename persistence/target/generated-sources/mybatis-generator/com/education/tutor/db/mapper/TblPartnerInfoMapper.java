package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblPartnerInfo;
import com.education.tutor.db.domain.TblPartnerInfoExample;
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

public interface TblPartnerInfoMapper {
    @SelectProvider(type=TblPartnerInfoSqlProvider.class, method="countByExample")
    long countByExample(TblPartnerInfoExample example);

    @DeleteProvider(type=TblPartnerInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblPartnerInfoExample example);

    @Delete({
        "delete from partner_info",
        "where partner_info_id = #{partnerInfoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long partnerInfoId);

    @Insert({
        "insert into partner_info (effective_start, effective_end, ",
        "del_flag, upper_id, ",
        "updated_by, self_id, ",
        "updated_at, created_at)",
        "values (#{effectiveStart,jdbcType=TIMESTAMP}, #{effectiveEnd,jdbcType=TIMESTAMP}, ",
        "#{delFlag,jdbcType=SMALLINT}, #{upperId,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{selfId,jdbcType=BIGINT}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="partnerInfoId", before=false, resultType=Long.class)
    int insert(TblPartnerInfo record);

    @InsertProvider(type=TblPartnerInfoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="partnerInfoId", before=false, resultType=Long.class)
    int insertSelective(TblPartnerInfo record);

    @SelectProvider(type=TblPartnerInfoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="partner_info_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="effective_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="effective_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="upper_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="self_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblPartnerInfo> selectByExample(TblPartnerInfoExample example);

    @Select({
        "select",
        "partner_info_id, effective_start, effective_end, del_flag, upper_id, updated_by, ",
        "self_id, updated_at, created_at",
        "from partner_info",
        "where partner_info_id = #{partnerInfoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="partner_info_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="effective_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="effective_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="del_flag", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="upper_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="self_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblPartnerInfo selectByPrimaryKey(Long partnerInfoId);

    @UpdateProvider(type=TblPartnerInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblPartnerInfo record, @Param("example") TblPartnerInfoExample example);

    @UpdateProvider(type=TblPartnerInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblPartnerInfo record, @Param("example") TblPartnerInfoExample example);

    @UpdateProvider(type=TblPartnerInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblPartnerInfo record);

    @Update({
        "update partner_info",
        "set effective_start = #{effectiveStart,jdbcType=TIMESTAMP},",
          "effective_end = #{effectiveEnd,jdbcType=TIMESTAMP},",
          "del_flag = #{delFlag,jdbcType=SMALLINT},",
          "upper_id = #{upperId,jdbcType=BIGINT},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "self_id = #{selfId,jdbcType=BIGINT},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where partner_info_id = #{partnerInfoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblPartnerInfo record);
}