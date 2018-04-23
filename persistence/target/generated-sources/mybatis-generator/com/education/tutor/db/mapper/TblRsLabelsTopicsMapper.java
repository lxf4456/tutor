package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsLabelsTopicsExample;
import com.education.tutor.db.domain.TblRsLabelsTopicsKey;
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

public interface TblRsLabelsTopicsMapper {
    @SelectProvider(type=TblRsLabelsTopicsSqlProvider.class, method="countByExample")
    long countByExample(TblRsLabelsTopicsExample example);

    @DeleteProvider(type=TblRsLabelsTopicsSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRsLabelsTopicsExample example);

    @Delete({
        "delete from rs_labels_topics",
        "where topic_id = #{topicId,jdbcType=BIGINT}",
          "and label_main_id = #{labelMainId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TblRsLabelsTopicsKey key);

    @Insert({
        "insert into rs_labels_topics (topic_id, label_main_id)",
        "values (#{topicId,jdbcType=BIGINT}, #{labelMainId,jdbcType=BIGINT})"
    })
    int insert(TblRsLabelsTopicsKey record);

    @InsertProvider(type=TblRsLabelsTopicsSqlProvider.class, method="insertSelective")
    int insertSelective(TblRsLabelsTopicsKey record);

    @SelectProvider(type=TblRsLabelsTopicsSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="topic_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="label_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    List<TblRsLabelsTopicsKey> selectByExample(TblRsLabelsTopicsExample example);

    @UpdateProvider(type=TblRsLabelsTopicsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRsLabelsTopicsKey record, @Param("example") TblRsLabelsTopicsExample example);

    @UpdateProvider(type=TblRsLabelsTopicsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRsLabelsTopicsKey record, @Param("example") TblRsLabelsTopicsExample example);
}