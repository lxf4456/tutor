package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsLabelGoodsCategoriesExample.Criteria;
import com.education.tutor.db.domain.TblRsLabelGoodsCategoriesExample.Criterion;
import com.education.tutor.db.domain.TblRsLabelGoodsCategoriesExample;
import com.education.tutor.db.domain.TblRsLabelGoodsCategoriesKey;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblRsLabelGoodsCategoriesSqlProvider {

    public String countByExample(TblRsLabelGoodsCategoriesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("rs_label_goods_categories");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblRsLabelGoodsCategoriesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("rs_label_goods_categories");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblRsLabelGoodsCategoriesKey record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("rs_label_goods_categories");
        
        if (record.getLabelMainId() != null) {
            sql.VALUES("label_main_id", "#{labelMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsCategoriesId() != null) {
            sql.VALUES("goods_categories_id", "#{goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblRsLabelGoodsCategoriesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("label_main_id");
        } else {
            sql.SELECT("label_main_id");
        }
        sql.SELECT("goods_categories_id");
        sql.FROM("rs_label_goods_categories");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblRsLabelGoodsCategoriesKey record = (TblRsLabelGoodsCategoriesKey) parameter.get("record");
        TblRsLabelGoodsCategoriesExample example = (TblRsLabelGoodsCategoriesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("rs_label_goods_categories");
        
        if (record.getLabelMainId() != null) {
            sql.SET("label_main_id = #{record.labelMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsCategoriesId() != null) {
            sql.SET("goods_categories_id = #{record.goodsCategoriesId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("rs_label_goods_categories");
        
        sql.SET("label_main_id = #{record.labelMainId,jdbcType=BIGINT}");
        sql.SET("goods_categories_id = #{record.goodsCategoriesId,jdbcType=BIGINT}");
        
        TblRsLabelGoodsCategoriesExample example = (TblRsLabelGoodsCategoriesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblRsLabelGoodsCategoriesExample example, boolean includeExamplePhrase) {
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