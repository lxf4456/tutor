package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblBusinessCountry;
import com.education.tutor.db.domain.TblBusinessCountryExample.Criteria;
import com.education.tutor.db.domain.TblBusinessCountryExample.Criterion;
import com.education.tutor.db.domain.TblBusinessCountryExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblBusinessCountrySqlProvider {

    public String countByExample(TblBusinessCountryExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("business_country");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblBusinessCountryExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("business_country");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblBusinessCountry record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("business_country");
        
        if (record.getBusinessCountryId() != null) {
            sql.VALUES("business_country_id", "#{businessCountryId,jdbcType=BIGINT}");
        }
        
        if (record.getDataRegionId() != null) {
            sql.VALUES("data_region_id", "#{dataRegionId,jdbcType=BIGINT}");
        }
        
        if (record.getBusinessCountryType() != null) {
            sql.VALUES("business_country_type", "#{businessCountryType,jdbcType=INTEGER}");
        }
        
        if (record.getTradeType() != null) {
            sql.VALUES("trade_type", "#{tradeType,jdbcType=INTEGER}");
        }
        
        if (record.getDelFlag() != null) {
            sql.VALUES("del_flag", "#{delFlag,jdbcType=INTEGER}");
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

    public String selectByExample(TblBusinessCountryExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("business_country_id");
        } else {
            sql.SELECT("business_country_id");
        }
        sql.SELECT("data_region_id");
        sql.SELECT("business_country_type");
        sql.SELECT("trade_type");
        sql.SELECT("del_flag");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("business_country");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblBusinessCountry record = (TblBusinessCountry) parameter.get("record");
        TblBusinessCountryExample example = (TblBusinessCountryExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("business_country");
        
        if (record.getBusinessCountryId() != null) {
            sql.SET("business_country_id = #{record.businessCountryId,jdbcType=BIGINT}");
        }
        
        if (record.getDataRegionId() != null) {
            sql.SET("data_region_id = #{record.dataRegionId,jdbcType=BIGINT}");
        }
        
        if (record.getBusinessCountryType() != null) {
            sql.SET("business_country_type = #{record.businessCountryType,jdbcType=INTEGER}");
        }
        
        if (record.getTradeType() != null) {
            sql.SET("trade_type = #{record.tradeType,jdbcType=INTEGER}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{record.delFlag,jdbcType=INTEGER}");
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
        sql.UPDATE("business_country");
        
        sql.SET("business_country_id = #{record.businessCountryId,jdbcType=BIGINT}");
        sql.SET("data_region_id = #{record.dataRegionId,jdbcType=BIGINT}");
        sql.SET("business_country_type = #{record.businessCountryType,jdbcType=INTEGER}");
        sql.SET("trade_type = #{record.tradeType,jdbcType=INTEGER}");
        sql.SET("del_flag = #{record.delFlag,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblBusinessCountryExample example = (TblBusinessCountryExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblBusinessCountry record) {
        SQL sql = new SQL();
        sql.UPDATE("business_country");
        
        if (record.getDataRegionId() != null) {
            sql.SET("data_region_id = #{dataRegionId,jdbcType=BIGINT}");
        }
        
        if (record.getBusinessCountryType() != null) {
            sql.SET("business_country_type = #{businessCountryType,jdbcType=INTEGER}");
        }
        
        if (record.getTradeType() != null) {
            sql.SET("trade_type = #{tradeType,jdbcType=INTEGER}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{delFlag,jdbcType=INTEGER}");
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
        
        sql.WHERE("business_country_id = #{businessCountryId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblBusinessCountryExample example, boolean includeExamplePhrase) {
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