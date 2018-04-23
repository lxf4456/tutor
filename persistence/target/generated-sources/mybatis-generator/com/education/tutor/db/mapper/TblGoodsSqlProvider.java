package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoods;
import com.education.tutor.db.domain.TblGoodsExample.Criteria;
import com.education.tutor.db.domain.TblGoodsExample.Criterion;
import com.education.tutor.db.domain.TblGoodsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblGoodsSqlProvider {

    public String countByExample(TblGoodsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("goods");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblGoodsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("goods");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblGoods record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("goods");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsBrandId() != null) {
            sql.VALUES("goods_brand_id", "#{goodsBrandId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsCategoriesId() != null) {
            sql.VALUES("goods_categories_id", "#{goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsTypesId() != null) {
            sql.VALUES("goods_types_id", "#{goodsTypesId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsTitle() != null) {
            sql.VALUES("goods_title", "#{goodsTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsName() != null) {
            sql.VALUES("goods_name", "#{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAbstract() != null) {
            sql.VALUES("goods_abstract", "#{goodsAbstract,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsKeywords() != null) {
            sql.VALUES("goods_keywords", "#{goodsKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsLangCode() != null) {
            sql.VALUES("goods_lang_code", "#{goodsLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsCode() != null) {
            sql.VALUES("goods_code", "#{goodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSupplierIdCode() != null) {
            sql.VALUES("supplier_id_code", "#{supplierIdCode,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsUrl() != null) {
            sql.VALUES("goods_url", "#{goodsUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsViewJson() != null) {
            sql.VALUES("goods_view_json", "#{goodsViewJson,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAmount() != null) {
            sql.VALUES("goods_amount", "#{goodsAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsType() != null) {
            sql.VALUES("goods_type", "#{goodsType,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsStatus() != null) {
            sql.VALUES("goods_status", "#{goodsStatus,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSource() != null) {
            sql.VALUES("goods_source", "#{goodsSource,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsPurpose() != null) {
            sql.VALUES("goods_purpose", "#{goodsPurpose,jdbcType=INTEGER}");
        }
        
        if (record.getStockState() != null) {
            sql.VALUES("stock_state", "#{stockState,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsClose() != null) {
            sql.VALUES("goods_close", "#{goodsClose,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSold() != null) {
            sql.VALUES("goods_sold", "#{goodsSold,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblGoodsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("goods_id");
        } else {
            sql.SELECT("goods_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("goods_brand_id");
        sql.SELECT("goods_categories_id");
        sql.SELECT("goods_types_id");
        sql.SELECT("goods_title");
        sql.SELECT("goods_name");
        sql.SELECT("goods_abstract");
        sql.SELECT("goods_keywords");
        sql.SELECT("goods_lang_code");
        sql.SELECT("goods_code");
        sql.SELECT("supplier_id_code");
        sql.SELECT("goods_url");
        sql.SELECT("goods_view_json");
        sql.SELECT("goods_amount");
        sql.SELECT("goods_type");
        sql.SELECT("goods_status");
        sql.SELECT("goods_source");
        sql.SELECT("goods_purpose");
        sql.SELECT("stock_state");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.SELECT("goods_close");
        sql.SELECT("goods_sold");
        sql.FROM("goods");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblGoods record = (TblGoods) parameter.get("record");
        TblGoodsExample example = (TblGoodsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("goods");
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{record.goodsId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsBrandId() != null) {
            sql.SET("goods_brand_id = #{record.goodsBrandId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsCategoriesId() != null) {
            sql.SET("goods_categories_id = #{record.goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsTypesId() != null) {
            sql.SET("goods_types_id = #{record.goodsTypesId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsTitle() != null) {
            sql.SET("goods_title = #{record.goodsTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsName() != null) {
            sql.SET("goods_name = #{record.goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAbstract() != null) {
            sql.SET("goods_abstract = #{record.goodsAbstract,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsKeywords() != null) {
            sql.SET("goods_keywords = #{record.goodsKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsLangCode() != null) {
            sql.SET("goods_lang_code = #{record.goodsLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsCode() != null) {
            sql.SET("goods_code = #{record.goodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSupplierIdCode() != null) {
            sql.SET("supplier_id_code = #{record.supplierIdCode,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsUrl() != null) {
            sql.SET("goods_url = #{record.goodsUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsViewJson() != null) {
            sql.SET("goods_view_json = #{record.goodsViewJson,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAmount() != null) {
            sql.SET("goods_amount = #{record.goodsAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsType() != null) {
            sql.SET("goods_type = #{record.goodsType,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsStatus() != null) {
            sql.SET("goods_status = #{record.goodsStatus,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSource() != null) {
            sql.SET("goods_source = #{record.goodsSource,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsPurpose() != null) {
            sql.SET("goods_purpose = #{record.goodsPurpose,jdbcType=INTEGER}");
        }
        
        if (record.getStockState() != null) {
            sql.SET("stock_state = #{record.stockState,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsClose() != null) {
            sql.SET("goods_close = #{record.goodsClose,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSold() != null) {
            sql.SET("goods_sold = #{record.goodsSold,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("goods");
        
        sql.SET("goods_id = #{record.goodsId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("goods_brand_id = #{record.goodsBrandId,jdbcType=BIGINT}");
        sql.SET("goods_categories_id = #{record.goodsCategoriesId,jdbcType=BIGINT}");
        sql.SET("goods_types_id = #{record.goodsTypesId,jdbcType=BIGINT}");
        sql.SET("goods_title = #{record.goodsTitle,jdbcType=VARCHAR}");
        sql.SET("goods_name = #{record.goodsName,jdbcType=VARCHAR}");
        sql.SET("goods_abstract = #{record.goodsAbstract,jdbcType=VARCHAR}");
        sql.SET("goods_keywords = #{record.goodsKeywords,jdbcType=VARCHAR}");
        sql.SET("goods_lang_code = #{record.goodsLangCode,jdbcType=VARCHAR}");
        sql.SET("goods_code = #{record.goodsCode,jdbcType=VARCHAR}");
        sql.SET("supplier_id_code = #{record.supplierIdCode,jdbcType=VARCHAR}");
        sql.SET("goods_url = #{record.goodsUrl,jdbcType=VARCHAR}");
        sql.SET("goods_view_json = #{record.goodsViewJson,jdbcType=VARCHAR}");
        sql.SET("goods_amount = #{record.goodsAmount,jdbcType=INTEGER}");
        sql.SET("goods_type = #{record.goodsType,jdbcType=INTEGER}");
        sql.SET("goods_status = #{record.goodsStatus,jdbcType=INTEGER}");
        sql.SET("goods_source = #{record.goodsSource,jdbcType=INTEGER}");
        sql.SET("goods_purpose = #{record.goodsPurpose,jdbcType=INTEGER}");
        sql.SET("stock_state = #{record.stockState,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("goods_close = #{record.goodsClose,jdbcType=INTEGER}");
        sql.SET("goods_sold = #{record.goodsSold,jdbcType=INTEGER}");
        
        TblGoodsExample example = (TblGoodsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblGoods record) {
        SQL sql = new SQL();
        sql.UPDATE("goods");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsBrandId() != null) {
            sql.SET("goods_brand_id = #{goodsBrandId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsCategoriesId() != null) {
            sql.SET("goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsTypesId() != null) {
            sql.SET("goods_types_id = #{goodsTypesId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsTitle() != null) {
            sql.SET("goods_title = #{goodsTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsName() != null) {
            sql.SET("goods_name = #{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAbstract() != null) {
            sql.SET("goods_abstract = #{goodsAbstract,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsKeywords() != null) {
            sql.SET("goods_keywords = #{goodsKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsLangCode() != null) {
            sql.SET("goods_lang_code = #{goodsLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsCode() != null) {
            sql.SET("goods_code = #{goodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSupplierIdCode() != null) {
            sql.SET("supplier_id_code = #{supplierIdCode,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsUrl() != null) {
            sql.SET("goods_url = #{goodsUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsViewJson() != null) {
            sql.SET("goods_view_json = #{goodsViewJson,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAmount() != null) {
            sql.SET("goods_amount = #{goodsAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsType() != null) {
            sql.SET("goods_type = #{goodsType,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsStatus() != null) {
            sql.SET("goods_status = #{goodsStatus,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSource() != null) {
            sql.SET("goods_source = #{goodsSource,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsPurpose() != null) {
            sql.SET("goods_purpose = #{goodsPurpose,jdbcType=INTEGER}");
        }
        
        if (record.getStockState() != null) {
            sql.SET("stock_state = #{stockState,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsClose() != null) {
            sql.SET("goods_close = #{goodsClose,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSold() != null) {
            sql.SET("goods_sold = #{goodsSold,jdbcType=INTEGER}");
        }
        
        sql.WHERE("goods_id = #{goodsId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblGoodsExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}