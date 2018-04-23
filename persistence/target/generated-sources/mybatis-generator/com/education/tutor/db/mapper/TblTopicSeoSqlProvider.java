package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTopicSeo;
import com.education.tutor.db.domain.TblTopicSeoExample.Criteria;
import com.education.tutor.db.domain.TblTopicSeoExample.Criterion;
import com.education.tutor.db.domain.TblTopicSeoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblTopicSeoSqlProvider {

    public String countByExample(TblTopicSeoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("topic_seo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblTopicSeoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("topic_seo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblTopicSeo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("topic_seo");
        
        if (record.getSeoTitle() != null) {
            sql.VALUES("seo_title", "#{seoTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelMainId() != null) {
            sql.VALUES("label_main_id", "#{labelMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSeoKeywords() != null) {
            sql.VALUES("seo_keywords", "#{seoKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoDescription() != null) {
            sql.VALUES("seo_description", "#{seoDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoLabelid() != null) {
            sql.VALUES("seo_labelid", "#{seoLabelid,jdbcType=BIGINT}");
        }
        
        if (record.getSeoCreateat() != null) {
            sql.VALUES("seo_createat", "#{seoCreateat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeoCreateby() != null) {
            sql.VALUES("seo_createby", "#{seoCreateby,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoState() != null) {
            sql.VALUES("seo_state", "#{seoState,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblTopicSeoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("seo_id");
        } else {
            sql.SELECT("seo_id");
        }
        sql.SELECT("seo_title");
        sql.SELECT("label_main_id");
        sql.SELECT("seo_keywords");
        sql.SELECT("seo_description");
        sql.SELECT("seo_labelid");
        sql.SELECT("seo_createat");
        sql.SELECT("seo_createby");
        sql.SELECT("seo_state");
        sql.FROM("topic_seo");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblTopicSeo record = (TblTopicSeo) parameter.get("record");
        TblTopicSeoExample example = (TblTopicSeoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("topic_seo");
        
        if (record.getSeoId() != null) {
            sql.SET("seo_id = #{record.seoId,jdbcType=BIGINT}");
        }
        
        if (record.getSeoTitle() != null) {
            sql.SET("seo_title = #{record.seoTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelMainId() != null) {
            sql.SET("label_main_id = #{record.labelMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSeoKeywords() != null) {
            sql.SET("seo_keywords = #{record.seoKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoDescription() != null) {
            sql.SET("seo_description = #{record.seoDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoLabelid() != null) {
            sql.SET("seo_labelid = #{record.seoLabelid,jdbcType=BIGINT}");
        }
        
        if (record.getSeoCreateat() != null) {
            sql.SET("seo_createat = #{record.seoCreateat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeoCreateby() != null) {
            sql.SET("seo_createby = #{record.seoCreateby,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoState() != null) {
            sql.SET("seo_state = #{record.seoState,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("topic_seo");
        
        sql.SET("seo_id = #{record.seoId,jdbcType=BIGINT}");
        sql.SET("seo_title = #{record.seoTitle,jdbcType=VARCHAR}");
        sql.SET("label_main_id = #{record.labelMainId,jdbcType=BIGINT}");
        sql.SET("seo_keywords = #{record.seoKeywords,jdbcType=VARCHAR}");
        sql.SET("seo_description = #{record.seoDescription,jdbcType=VARCHAR}");
        sql.SET("seo_labelid = #{record.seoLabelid,jdbcType=BIGINT}");
        sql.SET("seo_createat = #{record.seoCreateat,jdbcType=TIMESTAMP}");
        sql.SET("seo_createby = #{record.seoCreateby,jdbcType=VARCHAR}");
        sql.SET("seo_state = #{record.seoState,jdbcType=INTEGER}");
        
        TblTopicSeoExample example = (TblTopicSeoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblTopicSeo record) {
        SQL sql = new SQL();
        sql.UPDATE("topic_seo");
        
        if (record.getSeoTitle() != null) {
            sql.SET("seo_title = #{seoTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelMainId() != null) {
            sql.SET("label_main_id = #{labelMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSeoKeywords() != null) {
            sql.SET("seo_keywords = #{seoKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoDescription() != null) {
            sql.SET("seo_description = #{seoDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoLabelid() != null) {
            sql.SET("seo_labelid = #{seoLabelid,jdbcType=BIGINT}");
        }
        
        if (record.getSeoCreateat() != null) {
            sql.SET("seo_createat = #{seoCreateat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeoCreateby() != null) {
            sql.SET("seo_createby = #{seoCreateby,jdbcType=VARCHAR}");
        }
        
        if (record.getSeoState() != null) {
            sql.SET("seo_state = #{seoState,jdbcType=INTEGER}");
        }
        
        sql.WHERE("seo_id = #{seoId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblTopicSeoExample example, boolean includeExamplePhrase) {
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