package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsOrdersAccountDetailExample;
import com.education.tutor.db.domain.TblRsOrdersAccountDetailKey;
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

public interface TblRsOrdersAccountDetailMapper {
    @SelectProvider(type=TblRsOrdersAccountDetailSqlProvider.class, method="countByExample")
    long countByExample(TblRsOrdersAccountDetailExample example);

    @DeleteProvider(type=TblRsOrdersAccountDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRsOrdersAccountDetailExample example);

    @Delete({
        "delete from rs_orders_account_detail",
        "where account_detail_id = #{accountDetailId,jdbcType=BIGINT}",
          "and order_main_id = #{orderMainId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TblRsOrdersAccountDetailKey key);

    @Insert({
        "insert into rs_orders_account_detail (account_detail_id, order_main_id)",
        "values (#{accountDetailId,jdbcType=BIGINT}, #{orderMainId,jdbcType=BIGINT})"
    })
    int insert(TblRsOrdersAccountDetailKey record);

    @InsertProvider(type=TblRsOrdersAccountDetailSqlProvider.class, method="insertSelective")
    int insertSelective(TblRsOrdersAccountDetailKey record);

    @SelectProvider(type=TblRsOrdersAccountDetailSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="account_detail_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="order_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    List<TblRsOrdersAccountDetailKey> selectByExample(TblRsOrdersAccountDetailExample example);

    @UpdateProvider(type=TblRsOrdersAccountDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRsOrdersAccountDetailKey record, @Param("example") TblRsOrdersAccountDetailExample example);

    @UpdateProvider(type=TblRsOrdersAccountDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRsOrdersAccountDetailKey record, @Param("example") TblRsOrdersAccountDetailExample example);
}