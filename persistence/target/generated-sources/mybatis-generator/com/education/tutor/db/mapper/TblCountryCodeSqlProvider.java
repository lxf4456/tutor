package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblCountryCode;
import com.education.tutor.db.domain.TblCountryCodeExample.Criteria;
import com.education.tutor.db.domain.TblCountryCodeExample.Criterion;
import com.education.tutor.db.domain.TblCountryCodeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblCountryCodeSqlProvider {

    public String countByExample(TblCountryCodeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("country_code");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblCountryCodeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("country_code");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblCountryCode record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("country_code");
        
        if (record.getCountryEn() != null) {
            sql.VALUES("country_en", "#{countryEn,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCn() != null) {
            sql.VALUES("country_cn", "#{countryCn,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryLg() != null) {
            sql.VALUES("country_lg", "#{countryLg,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            sql.VALUES("country_code", "#{countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblCountryCodeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("country_id");
        } else {
            sql.SELECT("country_id");
        }
        sql.SELECT("country_en");
        sql.SELECT("country_cn");
        sql.SELECT("country_lg");
        sql.SELECT("country_code");
        sql.SELECT("status");
        sql.FROM("country_code");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblCountryCode record = (TblCountryCode) parameter.get("record");
        TblCountryCodeExample example = (TblCountryCodeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("country_code");
        
        if (record.getCountryId() != null) {
            sql.SET("country_id = #{record.countryId,jdbcType=INTEGER}");
        }
        
        if (record.getCountryEn() != null) {
            sql.SET("country_en = #{record.countryEn,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCn() != null) {
            sql.SET("country_cn = #{record.countryCn,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryLg() != null) {
            sql.SET("country_lg = #{record.countryLg,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            sql.SET("country_code = #{record.countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("country_code");
        
        sql.SET("country_id = #{record.countryId,jdbcType=INTEGER}");
        sql.SET("country_en = #{record.countryEn,jdbcType=VARCHAR}");
        sql.SET("country_cn = #{record.countryCn,jdbcType=VARCHAR}");
        sql.SET("country_lg = #{record.countryLg,jdbcType=VARCHAR}");
        sql.SET("country_code = #{record.countryCode,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        
        TblCountryCodeExample example = (TblCountryCodeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblCountryCode record) {
        SQL sql = new SQL();
        sql.UPDATE("country_code");
        
        if (record.getCountryEn() != null) {
            sql.SET("country_en = #{countryEn,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCn() != null) {
            sql.SET("country_cn = #{countryCn,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryLg() != null) {
            sql.SET("country_lg = #{countryLg,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            sql.SET("country_code = #{countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        sql.WHERE("country_id = #{countryId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblCountryCodeExample example, boolean includeExamplePhrase) {
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