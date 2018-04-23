package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsUserOrganizationExample;
import com.education.tutor.db.domain.TblRsUserOrganizationKey;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TblRsUserOrganizationMapper {
    @SelectProvider(type=TblRsUserOrganizationSqlProvider.class, method="countByExample")
    long countByExample(TblRsUserOrganizationExample example);

    @DeleteProvider(type=TblRsUserOrganizationSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRsUserOrganizationExample example);

    @Delete({
        "delete from rs_user_organization",
        "where organization_id = #{organizationId,jdbcType=BIGINT}",
          "and user_main_id = #{userMainId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TblRsUserOrganizationKey key);

    @Insert({
        "insert into rs_user_organization (organization_id, user_main_id)",
        "values (#{organizationId,jdbcType=BIGINT}, #{userMainId,jdbcType=BIGINT})"
    })
    int insert(TblRsUserOrganizationKey record);

    @InsertProvider(type=TblRsUserOrganizationSqlProvider.class, method="insertSelective")
    int insertSelective(TblRsUserOrganizationKey record);

    @SelectProvider(type=TblRsUserOrganizationSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="organization_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    List<TblRsUserOrganizationKey> selectByExample(TblRsUserOrganizationExample example);

    @UpdateProvider(type=TblRsUserOrganizationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRsUserOrganizationKey record, @Param("example") TblRsUserOrganizationExample example);

    @UpdateProvider(type=TblRsUserOrganizationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRsUserOrganizationKey record, @Param("example") TblRsUserOrganizationExample example);
}