package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsAttachment;
import com.education.tutor.db.domain.TblRsAttachmentExample;
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

public interface TblRsAttachmentMapper {
    @SelectProvider(type=TblRsAttachmentSqlProvider.class, method="countByExample")
    long countByExample(TblRsAttachmentExample example);

    @DeleteProvider(type=TblRsAttachmentSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRsAttachmentExample example);

    @Insert({
        "insert into rs_attachment (source_id, attachment_id, ",
        "source)",
        "values (#{sourceId,jdbcType=BIGINT}, #{attachmentId,jdbcType=BIGINT}, ",
        "#{source,jdbcType=INTEGER})"
    })
    int insert(TblRsAttachment record);

    @InsertProvider(type=TblRsAttachmentSqlProvider.class, method="insertSelective")
    int insertSelective(TblRsAttachment record);

    @SelectProvider(type=TblRsAttachmentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="source_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="attachment_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="source", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<TblRsAttachment> selectByExample(TblRsAttachmentExample example);

    @UpdateProvider(type=TblRsAttachmentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRsAttachment record, @Param("example") TblRsAttachmentExample example);

    @UpdateProvider(type=TblRsAttachmentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRsAttachment record, @Param("example") TblRsAttachmentExample example);
}