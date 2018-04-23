package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTopicSeo;
import com.education.tutor.db.domain.TblTopicSeoExample;
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

public interface TblTopicSeoMapper {
    @SelectProvider(type=TblTopicSeoSqlProvider.class, method="countByExample")
    long countByExample(TblTopicSeoExample example);

    @DeleteProvider(type=TblTopicSeoSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblTopicSeoExample example);

    @Delete({
        "delete from topic_seo",
        "where seo_id = #{seoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long seoId);

    @Insert({
        "insert into topic_seo (seo_title, label_main_id, ",
        "seo_keywords, seo_description, ",
        "seo_labelid, seo_createat, ",
        "seo_createby, seo_state)",
        "values (#{seoTitle,jdbcType=VARCHAR}, #{labelMainId,jdbcType=BIGINT}, ",
        "#{seoKeywords,jdbcType=VARCHAR}, #{seoDescription,jdbcType=VARCHAR}, ",
        "#{seoLabelid,jdbcType=BIGINT}, #{seoCreateat,jdbcType=TIMESTAMP}, ",
        "#{seoCreateby,jdbcType=VARCHAR}, #{seoState,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="seoId", before=false, resultType=Long.class)
    int insert(TblTopicSeo record);

    @InsertProvider(type=TblTopicSeoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="seoId", before=false, resultType=Long.class)
    int insertSelective(TblTopicSeo record);

    @SelectProvider(type=TblTopicSeoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="seo_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="seo_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="seo_keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="seo_description", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="seo_labelid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="seo_createat", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="seo_createby", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="seo_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<TblTopicSeo> selectByExample(TblTopicSeoExample example);

    @Select({
        "select",
        "seo_id, seo_title, label_main_id, seo_keywords, seo_description, seo_labelid, ",
        "seo_createat, seo_createby, seo_state",
        "from topic_seo",
        "where seo_id = #{seoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="seo_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="seo_title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="label_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="seo_keywords", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="seo_description", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="seo_labelid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="seo_createat", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="seo_createby", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="seo_state", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    TblTopicSeo selectByPrimaryKey(Long seoId);

    @UpdateProvider(type=TblTopicSeoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblTopicSeo record, @Param("example") TblTopicSeoExample example);

    @UpdateProvider(type=TblTopicSeoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblTopicSeo record, @Param("example") TblTopicSeoExample example);

    @UpdateProvider(type=TblTopicSeoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblTopicSeo record);

    @Update({
        "update topic_seo",
        "set seo_title = #{seoTitle,jdbcType=VARCHAR},",
          "label_main_id = #{labelMainId,jdbcType=BIGINT},",
          "seo_keywords = #{seoKeywords,jdbcType=VARCHAR},",
          "seo_description = #{seoDescription,jdbcType=VARCHAR},",
          "seo_labelid = #{seoLabelid,jdbcType=BIGINT},",
          "seo_createat = #{seoCreateat,jdbcType=TIMESTAMP},",
          "seo_createby = #{seoCreateby,jdbcType=VARCHAR},",
          "seo_state = #{seoState,jdbcType=INTEGER}",
        "where seo_id = #{seoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblTopicSeo record);
}