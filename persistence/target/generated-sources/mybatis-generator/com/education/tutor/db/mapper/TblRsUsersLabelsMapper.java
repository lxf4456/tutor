package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsUsersLabelsExample;
import com.education.tutor.db.domain.TblRsUsersLabelsKey;
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

public interface TblRsUsersLabelsMapper {
    @SelectProvider(type=TblRsUsersLabelsSqlProvider.class, method="countByExample")
    long countByExample(TblRsUsersLabelsExample example);

    @DeleteProvider(type=TblRsUsersLabelsSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRsUsersLabelsExample example);

    @Delete({
        "delete from rs_users_labels",
        "where label_main_id = #{labelMainId,jdbcType=BIGINT}",
          "and user_main_id = #{userMainId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TblRsUsersLabelsKey key);

    @Insert({
        "insert into rs_users_labels (label_main_id, user_main_id)",
        "values (#{labelMainId,jdbcType=BIGINT}, #{userMainId,jdbcType=BIGINT})"
    })
    int insert(TblRsUsersLabelsKey record);

    @InsertProvider(type=TblRsUsersLabelsSqlProvider.class, method="insertSelective")
    int insertSelective(TblRsUsersLabelsKey record);

    @SelectProvider(type=TblRsUsersLabelsSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="label_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    List<TblRsUsersLabelsKey> selectByExample(TblRsUsersLabelsExample example);

    @UpdateProvider(type=TblRsUsersLabelsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRsUsersLabelsKey record, @Param("example") TblRsUsersLabelsExample example);

    @UpdateProvider(type=TblRsUsersLabelsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRsUsersLabelsKey record, @Param("example") TblRsUsersLabelsExample example);
}