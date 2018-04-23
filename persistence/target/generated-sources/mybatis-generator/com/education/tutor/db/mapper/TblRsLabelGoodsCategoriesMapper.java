package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsLabelGoodsCategoriesExample;
import com.education.tutor.db.domain.TblRsLabelGoodsCategoriesKey;
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

public interface TblRsLabelGoodsCategoriesMapper {
    @SelectProvider(type=TblRsLabelGoodsCategoriesSqlProvider.class, method="countByExample")
    long countByExample(TblRsLabelGoodsCategoriesExample example);

    @DeleteProvider(type=TblRsLabelGoodsCategoriesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblRsLabelGoodsCategoriesExample example);

    @Delete({
        "delete from rs_label_goods_categories",
        "where label_main_id = #{labelMainId,jdbcType=BIGINT}",
          "and goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TblRsLabelGoodsCategoriesKey key);

    @Insert({
        "insert into rs_label_goods_categories (label_main_id, goods_categories_id)",
        "values (#{labelMainId,jdbcType=BIGINT}, #{goodsCategoriesId,jdbcType=BIGINT})"
    })
    int insert(TblRsLabelGoodsCategoriesKey record);

    @InsertProvider(type=TblRsLabelGoodsCategoriesSqlProvider.class, method="insertSelective")
    int insertSelective(TblRsLabelGoodsCategoriesKey record);

    @SelectProvider(type=TblRsLabelGoodsCategoriesSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="label_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="goods_categories_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    List<TblRsLabelGoodsCategoriesKey> selectByExample(TblRsLabelGoodsCategoriesExample example);

    @UpdateProvider(type=TblRsLabelGoodsCategoriesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblRsLabelGoodsCategoriesKey record, @Param("example") TblRsLabelGoodsCategoriesExample example);

    @UpdateProvider(type=TblRsLabelGoodsCategoriesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblRsLabelGoodsCategoriesKey record, @Param("example") TblRsLabelGoodsCategoriesExample example);
}