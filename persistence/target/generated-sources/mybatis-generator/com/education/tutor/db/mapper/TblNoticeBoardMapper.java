package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblNoticeBoard;
import com.education.tutor.db.domain.TblNoticeBoardExample;
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

public interface TblNoticeBoardMapper {
    @SelectProvider(type=TblNoticeBoardSqlProvider.class, method="countByExample")
    long countByExample(TblNoticeBoardExample example);

    @DeleteProvider(type=TblNoticeBoardSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblNoticeBoardExample example);

    @Delete({
        "delete from notice_board",
        "where notice_board_id = #{noticeBoardId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long noticeBoardId);

    @Insert({
        "insert into notice_board (notice_desc, notice_url, ",
        "notice_state, notice_type, ",
        "target_pk, effective_start, ",
        "effective_end, updated_by, ",
        "updated_at)",
        "values (#{noticeDesc,jdbcType=VARCHAR}, #{noticeUrl,jdbcType=VARCHAR}, ",
        "#{noticeState,jdbcType=INTEGER}, #{noticeType,jdbcType=INTEGER}, ",
        "#{targetPk,jdbcType=BIGINT}, #{effectiveStart,jdbcType=TIMESTAMP}, ",
        "#{effectiveEnd,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="noticeBoardId", before=false, resultType=Long.class)
    int insert(TblNoticeBoard record);

    @InsertProvider(type=TblNoticeBoardSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="noticeBoardId", before=false, resultType=Long.class)
    int insertSelective(TblNoticeBoard record);

    @SelectProvider(type=TblNoticeBoardSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="notice_board_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="notice_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="notice_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="notice_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="notice_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="effective_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="effective_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblNoticeBoard> selectByExample(TblNoticeBoardExample example);

    @Select({
        "select",
        "notice_board_id, notice_desc, notice_url, notice_state, notice_type, target_pk, ",
        "effective_start, effective_end, updated_by, updated_at",
        "from notice_board",
        "where notice_board_id = #{noticeBoardId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="notice_board_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="notice_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="notice_url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="notice_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="notice_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="target_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="effective_start", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="effective_end", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblNoticeBoard selectByPrimaryKey(Long noticeBoardId);

    @UpdateProvider(type=TblNoticeBoardSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblNoticeBoard record, @Param("example") TblNoticeBoardExample example);

    @UpdateProvider(type=TblNoticeBoardSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblNoticeBoard record, @Param("example") TblNoticeBoardExample example);

    @UpdateProvider(type=TblNoticeBoardSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblNoticeBoard record);

    @Update({
        "update notice_board",
        "set notice_desc = #{noticeDesc,jdbcType=VARCHAR},",
          "notice_url = #{noticeUrl,jdbcType=VARCHAR},",
          "notice_state = #{noticeState,jdbcType=INTEGER},",
          "notice_type = #{noticeType,jdbcType=INTEGER},",
          "target_pk = #{targetPk,jdbcType=BIGINT},",
          "effective_start = #{effectiveStart,jdbcType=TIMESTAMP},",
          "effective_end = #{effectiveEnd,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where notice_board_id = #{noticeBoardId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblNoticeBoard record);
}