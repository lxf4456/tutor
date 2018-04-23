package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAuthorities;
import com.education.tutor.db.domain.TblAuthoritiesExample;
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

public interface TblAuthoritiesMapper {
    @SelectProvider(type=TblAuthoritiesSqlProvider.class, method="countByExample")
    long countByExample(TblAuthoritiesExample example);

    @DeleteProvider(type=TblAuthoritiesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblAuthoritiesExample example);

    @Insert({
        "insert into authorities (username, authority)",
        "values (#{username,jdbcType=VARCHAR}, #{authority,jdbcType=VARCHAR})"
    })
    int insert(TblAuthorities record);

    @InsertProvider(type=TblAuthoritiesSqlProvider.class, method="insertSelective")
    int insertSelective(TblAuthorities record);

    @SelectProvider(type=TblAuthoritiesSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="authority", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblAuthorities> selectByExample(TblAuthoritiesExample example);

    @UpdateProvider(type=TblAuthoritiesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblAuthorities record, @Param("example") TblAuthoritiesExample example);

    @UpdateProvider(type=TblAuthoritiesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblAuthorities record, @Param("example") TblAuthoritiesExample example);
}