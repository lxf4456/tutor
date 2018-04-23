package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoodsBrand;
import com.education.tutor.db.domain.TblGoodsBrandExample.Criteria;
import com.education.tutor.db.domain.TblGoodsBrandExample.Criterion;
import com.education.tutor.db.domain.TblGoodsBrandExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblGoodsBrandSqlProvider {

    public String countByExample(TblGoodsBrandExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("goods_brand");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblGoodsBrandExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("goods_brand");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblGoodsBrand record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("goods_brand");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getBrandName() != null) {
            sql.VALUES("brand_name", "#{brandName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandLevel() != null) {
            sql.VALUES("brand_level", "#{brandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getBrandLogo() != null) {
            sql.VALUES("brand_logo", "#{brandLogo,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandUrl() != null) {
            sql.VALUES("brand_url", "#{brandUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandCode() != null) {
            sql.VALUES("brand_code", "#{brandCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandLangCode() != null) {
            sql.VALUES("brand_lang_code", "#{brandLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getIsHave() != null) {
            sql.VALUES("is_have", "#{isHave,jdbcType=INTEGER}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
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

    public String selectByExample(TblGoodsBrandExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("goods_brand_id");
        } else {
            sql.SELECT("goods_brand_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("brand_name");
        sql.SELECT("brand_level");
        sql.SELECT("brand_logo");
        sql.SELECT("brand_url");
        sql.SELECT("brand_code");
        sql.SELECT("brand_lang_code");
        sql.SELECT("status");
        sql.SELECT("is_have");
        sql.SELECT("content");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("goods_brand");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblGoodsBrand record = (TblGoodsBrand) parameter.get("record");
        TblGoodsBrandExample example = (TblGoodsBrandExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("goods_brand");
        
        if (record.getGoodsBrandId() != null) {
            sql.SET("goods_brand_id = #{record.goodsBrandId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getBrandName() != null) {
            sql.SET("brand_name = #{record.brandName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandLevel() != null) {
            sql.SET("brand_level = #{record.brandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getBrandLogo() != null) {
            sql.SET("brand_logo = #{record.brandLogo,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandUrl() != null) {
            sql.SET("brand_url = #{record.brandUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandCode() != null) {
            sql.SET("brand_code = #{record.brandCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandLangCode() != null) {
            sql.SET("brand_lang_code = #{record.brandLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getIsHave() != null) {
            sql.SET("is_have = #{record.isHave,jdbcType=INTEGER}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=VARCHAR}");
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
        sql.UPDATE("goods_brand");
        
        sql.SET("goods_brand_id = #{record.goodsBrandId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("brand_name = #{record.brandName,jdbcType=VARCHAR}");
        sql.SET("brand_level = #{record.brandLevel,jdbcType=INTEGER}");
        sql.SET("brand_logo = #{record.brandLogo,jdbcType=VARCHAR}");
        sql.SET("brand_url = #{record.brandUrl,jdbcType=VARCHAR}");
        sql.SET("brand_code = #{record.brandCode,jdbcType=VARCHAR}");
        sql.SET("brand_lang_code = #{record.brandLangCode,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("is_have = #{record.isHave,jdbcType=INTEGER}");
        sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblGoodsBrandExample example = (TblGoodsBrandExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblGoodsBrand record) {
        SQL sql = new SQL();
        sql.UPDATE("goods_brand");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getBrandName() != null) {
            sql.SET("brand_name = #{brandName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandLevel() != null) {
            sql.SET("brand_level = #{brandLevel,jdbcType=INTEGER}");
        }
        
        if (record.getBrandLogo() != null) {
            sql.SET("brand_logo = #{brandLogo,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandUrl() != null) {
            sql.SET("brand_url = #{brandUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandCode() != null) {
            sql.SET("brand_code = #{brandCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandLangCode() != null) {
            sql.SET("brand_lang_code = #{brandLangCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getIsHave() != null) {
            sql.SET("is_have = #{isHave,jdbcType=INTEGER}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=VARCHAR}");
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
        
        sql.WHERE("goods_brand_id = #{goodsBrandId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblGoodsBrandExample example, boolean includeExamplePhrase) {
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