package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGroupAuthorities;
import com.education.tutor.db.domain.TblGroupAuthoritiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TblGroupAuthoritiesMapper {
    @SelectProvider(type=TblGroupAuthoritiesSqlProvider.class, method="countByExample")
    long countByExample(TblGroupAuthoritiesExample example);

    @DeleteProvider(type=TblGroupAuthoritiesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblGroupAuthoritiesExample example);

    @Insert({
        "insert into group_authorities (group_id, authority)",
        "values (#{groupId,jdbcType=BIGINT}, #{authority,jdbcType=VARCHAR})"
    })
    int insert(TblGroupAuthorities record);

    @InsertProvider(type=TblGroupAuthoritiesSqlProvider.class, method="insertSelective")
    int insertSelective(TblGroupAuthorities record);

    @SelectProvider(type=TblGroupAuthoritiesSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="group_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="authority", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblGroupAuthorities> selectByExample(TblGroupAuthoritiesExample example);

    @UpdateProvider(type=TblGroupAuthoritiesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblGroupAuthorities record, @Param("example") TblGroupAuthoritiesExample example);

    @UpdateProvider(type=TblGroupAuthoritiesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblGroupAuthorities record, @Param("example") TblGroupAuthoritiesExample example);
}