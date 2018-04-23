package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoodsCategories;
import com.education.tutor.db.domain.TblGoodsCategoriesExample.Criteria;
import com.education.tutor.db.domain.TblGoodsCategoriesExample.Criterion;
import com.education.tutor.db.domain.TblGoodsCategoriesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblGoodsCategoriesSqlProvider {

    public String countByExample(TblGoodsCategoriesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("goods_categories");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblGoodsCategoriesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("goods_categories");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblGoodsCategories record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("goods_categories");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getCategoriesName() != null) {
            sql.VALUES("categories_name", "#{categoriesName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesNameZh() != null) {
            sql.VALUES("categories_name_zh", "#{categoriesNameZh,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesParentid() != null) {
            sql.VALUES("categories_parentid", "#{categoriesParentid,jdbcType=BIGINT}");
        }
        
        if (record.getCategoriesDepth() != null) {
            sql.VALUES("categories_depth", "#{categoriesDepth,jdbcType=INTEGER}");
        }
        
        if (record.getCategoriesCode() != null) {
            sql.VALUES("categories_code", "#{categoriesCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesLangCode() != null) {
            sql.VALUES("categories_lang_code", "#{categoriesLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesStatus() != null) {
            sql.VALUES("categories_status", "#{categoriesStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCategoriesPriority() != null) {
            sql.VALUES("categories_priority", "#{categoriesPriority,jdbcType=INTEGER}");
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
        
        return sql.toString();
    }

    public String selectByExample(TblGoodsCategoriesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("goods_categories_id");
        } else {
            sql.SELECT("goods_categories_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("categories_name");
        sql.SELECT("categories_name_zh");
        sql.SELECT("categories_parentid");
        sql.SELECT("categories_depth");
        sql.SELECT("categories_code");
        sql.SELECT("categories_lang_code");
        sql.SELECT("categories_status");
        sql.SELECT("categories_priority");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("goods_categories");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblGoodsCategories record = (TblGoodsCategories) parameter.get("record");
        TblGoodsCategoriesExample example = (TblGoodsCategoriesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("goods_categories");
        
        if (record.getGoodsCategoriesId() != null) {
            sql.SET("goods_categories_id = #{record.goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getCategoriesName() != null) {
            sql.SET("categories_name = #{record.categoriesName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesNameZh() != null) {
            sql.SET("categories_name_zh = #{record.categoriesNameZh,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesParentid() != null) {
            sql.SET("categories_parentid = #{record.categoriesParentid,jdbcType=BIGINT}");
        }
        
        if (record.getCategoriesDepth() != null) {
            sql.SET("categories_depth = #{record.categoriesDepth,jdbcType=INTEGER}");
        }
        
        if (record.getCategoriesCode() != null) {
            sql.SET("categories_code = #{record.categoriesCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesLangCode() != null) {
            sql.SET("categories_lang_code = #{record.categoriesLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesStatus() != null) {
            sql.SET("categories_status = #{record.categoriesStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCategoriesPriority() != null) {
            sql.SET("categories_priority = #{record.categoriesPriority,jdbcType=INTEGER}");
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
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("goods_categories");
        
        sql.SET("goods_categories_id = #{record.goodsCategoriesId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("categories_name = #{record.categoriesName,jdbcType=VARCHAR}");
        sql.SET("categories_name_zh = #{record.categoriesNameZh,jdbcType=VARCHAR}");
        sql.SET("categories_parentid = #{record.categoriesParentid,jdbcType=BIGINT}");
        sql.SET("categories_depth = #{record.categoriesDepth,jdbcType=INTEGER}");
        sql.SET("categories_code = #{record.categoriesCode,jdbcType=VARCHAR}");
        sql.SET("categories_lang_code = #{record.categoriesLangCode,jdbcType=VARCHAR}");
        sql.SET("categories_status = #{record.categoriesStatus,jdbcType=INTEGER}");
        sql.SET("categories_priority = #{record.categoriesPriority,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblGoodsCategoriesExample example = (TblGoodsCategoriesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblGoodsCategories record) {
        SQL sql = new SQL();
        sql.UPDATE("goods_categories");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getCategoriesName() != null) {
            sql.SET("categories_name = #{categoriesName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesNameZh() != null) {
            sql.SET("categories_name_zh = #{categoriesNameZh,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesParentid() != null) {
            sql.SET("categories_parentid = #{categoriesParentid,jdbcType=BIGINT}");
        }
        
        if (record.getCategoriesDepth() != null) {
            sql.SET("categories_depth = #{categoriesDepth,jdbcType=INTEGER}");
        }
        
        if (record.getCategoriesCode() != null) {
            sql.SET("categories_code = #{categoriesCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesLangCode() != null) {
            sql.SET("categories_lang_code = #{categoriesLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoriesStatus() != null) {
            sql.SET("categories_status = #{categoriesStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCategoriesPriority() != null) {
            sql.SET("categories_priority = #{categoriesPriority,jdbcType=INTEGER}");
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
        
        sql.WHERE("goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblGoodsCategoriesExample example, boolean includeExamplePhrase) {
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