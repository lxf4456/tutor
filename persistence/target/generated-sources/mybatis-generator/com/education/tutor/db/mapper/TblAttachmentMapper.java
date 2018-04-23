package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAttachment;
import com.education.tutor.db.domain.TblAttachmentExample;
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

public interface TblAttachmentMapper {
    @SelectProvider(type=TblAttachmentSqlProvider.class, method="countByExample")
    long countByExample(TblAttachmentExample example);

    @DeleteProvider(type=TblAttachmentSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblAttachmentExample example);

    @Delete({
        "delete from attachment",
        "where attachment_id = #{attachmentId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long attachmentId);

    @Insert({
        "insert into attachment (attachment_type, original_filename, ",
        "attachment_state, mime_type, ",
        "uri_relativel, uri_site, ",
        "size, meta_info, owner_type, ",
        "owner_pk, updated_by, ",
        "updated_at)",
        "values (#{attachmentType,jdbcType=INTEGER}, #{originalFilename,jdbcType=VARCHAR}, ",
        "#{attachmentState,jdbcType=INTEGER}, #{mimeType,jdbcType=VARCHAR}, ",
        "#{uriRelativel,jdbcType=VARCHAR}, #{uriSite,jdbcType=VARCHAR}, ",
        "#{size,jdbcType=BIGINT}, #{metaInfo,jdbcType=VARCHAR}, #{ownerType,jdbcType=INTEGER}, ",
        "#{ownerPk,jdbcType=BIGINT}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="attachmentId", before=false, resultType=Long.class)
    int insert(TblAttachment record);

    @InsertProvider(type=TblAttachmentSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="attachmentId", before=false, resultType=Long.class)
    int insertSelective(TblAttachment record);

    @SelectProvider(type=TblAttachmentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="attachment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="attachment_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="original_filename", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="attachment_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="mime_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="uri_relativel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="uri_site", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="size", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="meta_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="owner_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblAttachment> selectByExample(TblAttachmentExample example);

    @Select({
        "select",
        "attachment_id, attachment_type, original_filename, attachment_state, mime_type, ",
        "uri_relativel, uri_site, size, meta_info, owner_type, owner_pk, updated_by, ",
        "updated_at",
        "from attachment",
        "where attachment_id = #{attachmentId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="attachment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="attachment_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="original_filename", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="attachment_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="mime_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="uri_relativel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="uri_site", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="size", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="meta_info", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="owner_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    TblAttachment selectByPrimaryKey(Long attachmentId);

    @UpdateProvider(type=TblAttachmentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblAttachment record, @Param("example") TblAttachmentExample example);

    @UpdateProvider(type=TblAttachmentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblAttachment record, @Param("example") TblAttachmentExample example);

    @UpdateProvider(type=TblAttachmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblAttachment record);

    @Update({
        "update attachment",
        "set attachment_type = #{attachmentType,jdbcType=INTEGER},",
          "original_filename = #{originalFilename,jdbcType=VARCHAR},",
          "attachment_state = #{attachmentState,jdbcType=INTEGER},",
          "mime_type = #{mimeType,jdbcType=VARCHAR},",
          "uri_relativel = #{uriRelativel,jdbcType=VARCHAR},",
          "uri_site = #{uriSite,jdbcType=VARCHAR},",
          "size = #{size,jdbcType=BIGINT},",
          "meta_info = #{metaInfo,jdbcType=VARCHAR},",
          "owner_type = #{ownerType,jdbcType=INTEGER},",
          "owner_pk = #{ownerPk,jdbcType=BIGINT},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where attachment_id = #{attachmentId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblAttachment record);
}