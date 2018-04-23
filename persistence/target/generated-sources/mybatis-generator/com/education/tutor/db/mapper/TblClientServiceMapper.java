package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblClientService;
import com.education.tutor.db.domain.TblClientServiceExample;
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

public interface TblClientServiceMapper {
    @SelectProvider(type=TblClientServiceSqlProvider.class, method="countByExample")
    long countByExample(TblClientServiceExample example);

    @DeleteProvider(type=TblClientServiceSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblClientServiceExample example);

    @Delete({
        "delete from client_service",
        "where client_service_id = #{clientServiceId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long clientServiceId);

    @Insert({
        "insert into client_service (user_main_id, client_org_id, ",
        "service_org_id, server_type, ",
        "server_status, create_at, ",
        "create_by, update_at)",
        "values (#{userMainId,jdbcType=BIGINT}, #{clientOrgId,jdbcType=BIGINT}, ",
        "#{serviceOrgId,jdbcType=BIGINT}, #{serverType,jdbcType=INTEGER}, ",
        "#{serverStatus,jdbcType=INTEGER}, #{createAt,jdbcType=TIMESTAMP}, ",
        "#{createBy,jdbcType=VARCHAR}, #{updateAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="clientServiceId", before=false, resultType=Long.class)
    int insert(TblClientService record);

    @InsertProvider(type=TblClientServiceSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="clientServiceId", before=false, resultType=Long.class)
    int insertSelective(TblClientService record);

    @SelectProvider(type=TblClientServiceSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="client_service_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="client_org_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="service_org_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="server_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="server_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="create_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="create_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblClientService> selectByExample(TblClientServiceExample example);

    @Select({
        "select",
        "client_service_id, user_main_id, client_org_id, service_org_id, server_type, ",
        "server_status, create_at, create_by, update_at",
        "from client_service",
        "where client_service_id = #{clientServiceId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="client_service_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="client_org_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="service_org_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="server_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="server_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="create_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="create_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblClientService selectByPrimaryKey(Long clientServiceId);

    @UpdateProvider(type=TblClientServiceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblClientService record, @Param("example") TblClientServiceExample example);

    @UpdateProvider(type=TblClientServiceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblClientService record, @Param("example") TblClientServiceExample example);

    @UpdateProvider(type=TblClientServiceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblClientService record);

    @Update({
        "update client_service",
        "set user_main_id = #{userMainId,jdbcType=BIGINT},",
          "client_org_id = #{clientOrgId,jdbcType=BIGINT},",
          "service_org_id = #{serviceOrgId,jdbcType=BIGINT},",
          "server_type = #{serverType,jdbcType=INTEGER},",
          "server_status = #{serverStatus,jdbcType=INTEGER},",
          "create_at = #{createAt,jdbcType=TIMESTAMP},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "update_at = #{updateAt,jdbcType=TIMESTAMP}",
        "where client_service_id = #{clientServiceId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblClientService record);
}