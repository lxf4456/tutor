package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblLabelMain;
import com.education.tutor.db.domain.TblLabelMainExample.Criteria;
import com.education.tutor.db.domain.TblLabelMainExample.Criterion;
import com.education.tutor.db.domain.TblLabelMainExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblLabelMainSqlProvider {

    public String countByExample(TblLabelMainExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("label_main");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblLabelMainExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("label_main");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblLabelMain record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("label_main");
        
        if (record.getLabelName() != null) {
            sql.VALUES("label_name", "#{labelName,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelNameZh() != null) {
            sql.VALUES("label_name_zh", "#{labelNameZh,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelCategoryZh() != null) {
            sql.VALUES("label_category_zh", "#{labelCategoryZh,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelCategory() != null) {
            sql.VALUES("label_category", "#{labelCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelState() != null) {
            sql.VALUES("label_state", "#{labelState,jdbcType=INTEGER}");
        }
        
        if (record.getLabelDesc() != null) {
            sql.VALUES("label_desc", "#{labelDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelLang() != null) {
            sql.VALUES("label_lang", "#{labelLang,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelType() != null) {
            sql.VALUES("label_type", "#{labelType,jdbcType=INTEGER}");
        }
        
        if (record.getLabelAvatar() != null) {
            sql.VALUES("label_avatar", "#{labelAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommandLevel() != null) {
            sql.VALUES("recommand_level", "#{recommandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblLabelMainExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("label_main_id");
        } else {
            sql.SELECT("label_main_id");
        }
        sql.SELECT("label_name");
        sql.SELECT("label_name_zh");
        sql.SELECT("label_category_zh");
        sql.SELECT("label_category");
        sql.SELECT("label_state");
        sql.SELECT("label_desc");
        sql.SELECT("label_lang");
        sql.SELECT("label_type");
        sql.SELECT("label_avatar");
        sql.SELECT("recommand_level");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("label_main");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblLabelMain record = (TblLabelMain) parameter.get("record");
        TblLabelMainExample example = (TblLabelMainExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("label_main");
        
        if (record.getLabelMainId() != null) {
            sql.SET("label_main_id = #{record.labelMainId,jdbcType=BIGINT}");
        }
        
        if (record.getLabelName() != null) {
            sql.SET("label_name = #{record.labelName,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelNameZh() != null) {
            sql.SET("label_name_zh = #{record.labelNameZh,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelCategoryZh() != null) {
            sql.SET("label_category_zh = #{record.labelCategoryZh,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelCategory() != null) {
            sql.SET("label_category = #{record.labelCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelState() != null) {
            sql.SET("label_state = #{record.labelState,jdbcType=INTEGER}");
        }
        
        if (record.getLabelDesc() != null) {
            sql.SET("label_desc = #{record.labelDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelLang() != null) {
            sql.SET("label_lang = #{record.labelLang,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelType() != null) {
            sql.SET("label_type = #{record.labelType,jdbcType=INTEGER}");
        }
        
        if (record.getLabelAvatar() != null) {
            sql.SET("label_avatar = #{record.labelAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommandLevel() != null) {
            sql.SET("recommand_level = #{record.recommandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("label_main");
        
        sql.SET("label_main_id = #{record.labelMainId,jdbcType=BIGINT}");
        sql.SET("label_name = #{record.labelName,jdbcType=VARCHAR}");
        sql.SET("label_name_zh = #{record.labelNameZh,jdbcType=VARCHAR}");
        sql.SET("label_category_zh = #{record.labelCategoryZh,jdbcType=VARCHAR}");
        sql.SET("label_category = #{record.labelCategory,jdbcType=VARCHAR}");
        sql.SET("label_state = #{record.labelState,jdbcType=INTEGER}");
        sql.SET("label_desc = #{record.labelDesc,jdbcType=VARCHAR}");
        sql.SET("label_lang = #{record.labelLang,jdbcType=VARCHAR}");
        sql.SET("label_type = #{record.labelType,jdbcType=INTEGER}");
        sql.SET("label_avatar = #{record.labelAvatar,jdbcType=VARCHAR}");
        sql.SET("recommand_level = #{record.recommandLevel,jdbcType=INTEGER}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblLabelMainExample example = (TblLabelMainExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblLabelMain record) {
        SQL sql = new SQL();
        sql.UPDATE("label_main");
        
        if (record.getLabelName() != null) {
            sql.SET("label_name = #{labelName,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelNameZh() != null) {
            sql.SET("label_name_zh = #{labelNameZh,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelCategoryZh() != null) {
            sql.SET("label_category_zh = #{labelCategoryZh,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelCategory() != null) {
            sql.SET("label_category = #{labelCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelState() != null) {
            sql.SET("label_state = #{labelState,jdbcType=INTEGER}");
        }
        
        if (record.getLabelDesc() != null) {
            sql.SET("label_desc = #{labelDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelLang() != null) {
            sql.SET("label_lang = #{labelLang,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelType() != null) {
            sql.SET("label_type = #{labelType,jdbcType=INTEGER}");
        }
        
        if (record.getLabelAvatar() != null) {
            sql.SET("label_avatar = #{labelAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommandLevel() != null) {
            sql.SET("recommand_level = #{recommandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("label_main_id = #{labelMainId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblLabelMainExample example, boolean includeExamplePhrase) {
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