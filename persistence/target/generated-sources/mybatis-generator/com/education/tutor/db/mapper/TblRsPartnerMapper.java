package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsPartner;
import com.education.tutor.db.domain.TblRsPartnerExample;
import com.education.tutor.db.domain.TblRsPartnerKey;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TblRsPartnerMapper {
    @SelectProvider(type=TblRsPartnerSqlProvider.class, method="countByExample")
    long countByExample(TblRsPartnerExample example);

    @DeleteProvider(type=TblRsPartnerSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRsPartnerExample example);

    @Delete({
        "delete from rs_partner",
        "where upper_id = #{upperId,jdbcType=BIGINT}",
          "and user_main_id = #{userMainId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TblRsPartnerKey key);

    @Insert({
        "insert into rs_partner (upper_id, user_main_id, ",
        "partner_info)",
        "values (#{upperId,jdbcType=BIGINT}, #{userMainId,jdbcType=BIGINT}, ",
        "#{partnerInfo,jdbcType=BIGINT})"
    })
    int insert(TblRsPartner record);

    @InsertProvider(type=TblRsPartnerSqlProvider.class, method="insertSelective")
    int insertSelective(TblRsPartner record);

    @SelectProvider(type=TblRsPartnerSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="upper_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="partner_info", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<TblRsPartner> selectByExample(TblRsPartnerExample example);

    @Select({
        "select",
        "upper_id, user_main_id, partner_info",
        "from rs_partner",
        "where upper_id = #{upperId,jdbcType=BIGINT}",
          "and user_main_id = #{userMainId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="upper_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="partner_info", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    TblRsPartner selectByPrimaryKey(TblRsPartnerKey key);

    @UpdateProvider(type=TblRsPartnerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRsPartner record, @Param("example") TblRsPartnerExample example);

    @UpdateProvider(type=TblRsPartnerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRsPartner record, @Param("example") TblRsPartnerExample example);

    @UpdateProvider(type=TblRsPartnerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblRsPartner record);

    @Update({
        "update rs_partner",
        "set partner_info = #{partnerInfo,jdbcType=BIGINT}",
        "where upper_id = #{upperId,jdbcType=BIGINT}",
          "and user_main_id = #{userMainId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblRsPartner record);
}