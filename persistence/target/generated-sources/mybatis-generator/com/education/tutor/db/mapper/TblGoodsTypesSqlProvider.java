package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoodsTypes;
import com.education.tutor.db.domain.TblGoodsTypesExample.Criteria;
import com.education.tutor.db.domain.TblGoodsTypesExample.Criterion;
import com.education.tutor.db.domain.TblGoodsTypesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblGoodsTypesSqlProvider {

    public String countByExample(TblGoodsTypesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("goods_types");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblGoodsTypesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("goods_types");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblGoodsTypes record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("goods_types");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsCategoriesId() != null) {
            sql.VALUES("goods_categories_id", "#{goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        if (record.getTypesName() != null) {
            sql.VALUES("types_name", "#{typesName,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesCode() != null) {
            sql.VALUES("types_code", "#{typesCode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesLangCode() != null) {
            sql.VALUES("types_lang_code", "#{typesLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesStatus() != null) {
            sql.VALUES("types_status", "#{typesStatus,jdbcType=INTEGER}");
        }
        
        if (record.getTypesContent() != null) {
            sql.VALUES("types_content", "#{typesContent,jdbcType=VARCHAR}");
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

    public String selectByExample(TblGoodsTypesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("goods_types_id");
        } else {
            sql.SELECT("goods_types_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("goods_categories_id");
        sql.SELECT("types_name");
        sql.SELECT("types_code");
        sql.SELECT("types_lang_code");
        sql.SELECT("types_status");
        sql.SELECT("types_content");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("goods_types");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblGoodsTypes record = (TblGoodsTypes) parameter.get("record");
        TblGoodsTypesExample example = (TblGoodsTypesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("goods_types");
        
        if (record.getGoodsTypesId() != null) {
            sql.SET("goods_types_id = #{record.goodsTypesId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsCategoriesId() != null) {
            sql.SET("goods_categories_id = #{record.goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        if (record.getTypesName() != null) {
            sql.SET("types_name = #{record.typesName,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesCode() != null) {
            sql.SET("types_code = #{record.typesCode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesLangCode() != null) {
            sql.SET("types_lang_code = #{record.typesLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesStatus() != null) {
            sql.SET("types_status = #{record.typesStatus,jdbcType=INTEGER}");
        }
        
        if (record.getTypesContent() != null) {
            sql.SET("types_content = #{record.typesContent,jdbcType=VARCHAR}");
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
        sql.UPDATE("goods_types");
        
        sql.SET("goods_types_id = #{record.goodsTypesId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("goods_categories_id = #{record.goodsCategoriesId,jdbcType=BIGINT}");
        sql.SET("types_name = #{record.typesName,jdbcType=VARCHAR}");
        sql.SET("types_code = #{record.typesCode,jdbcType=VARCHAR}");
        sql.SET("types_lang_code = #{record.typesLangCode,jdbcType=VARCHAR}");
        sql.SET("types_status = #{record.typesStatus,jdbcType=INTEGER}");
        sql.SET("types_content = #{record.typesContent,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblGoodsTypesExample example = (TblGoodsTypesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblGoodsTypes record) {
        SQL sql = new SQL();
        sql.UPDATE("goods_types");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsCategoriesId() != null) {
            sql.SET("goods_categories_id = #{goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        if (record.getTypesName() != null) {
            sql.SET("types_name = #{typesName,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesCode() != null) {
            sql.SET("types_code = #{typesCode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesLangCode() != null) {
            sql.SET("types_lang_code = #{typesLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypesStatus() != null) {
            sql.SET("types_status = #{typesStatus,jdbcType=INTEGER}");
        }
        
        if (record.getTypesContent() != null) {
            sql.SET("types_content = #{typesContent,jdbcType=VARCHAR}");
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
        
        sql.WHERE("goods_types_id = #{goodsTypesId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblGoodsTypesExample example, boolean includeExamplePhrase) {
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