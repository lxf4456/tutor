package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblPartnerInfo;
import com.education.tutor.db.domain.TblPartnerInfoExample.Criteria;
import com.education.tutor.db.domain.TblPartnerInfoExample.Criterion;
import com.education.tutor.db.domain.TblPartnerInfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblPartnerInfoSqlProvider {

    public String countByExample(TblPartnerInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("partner_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblPartnerInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("partner_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblPartnerInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("partner_info");
        
        if (record.getEffectiveStart() != null) {
            sql.VALUES("effective_start", "#{effectiveStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectiveEnd() != null) {
            sql.VALUES("effective_end", "#{effectiveEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            sql.VALUES("del_flag", "#{delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getUpperId() != null) {
            sql.VALUES("upper_id", "#{upperId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getSelfId() != null) {
            sql.VALUES("self_id", "#{selfId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblPartnerInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("partner_info_id");
        } else {
            sql.SELECT("partner_info_id");
        }
        sql.SELECT("effective_start");
        sql.SELECT("effective_end");
        sql.SELECT("del_flag");
        sql.SELECT("upper_id");
        sql.SELECT("updated_by");
        sql.SELECT("self_id");
        sql.SELECT("updated_at");
        sql.SELECT("created_at");
        sql.FROM("partner_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblPartnerInfo record = (TblPartnerInfo) parameter.get("record");
        TblPartnerInfoExample example = (TblPartnerInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("partner_info");
        
        if (record.getPartnerInfoId() != null) {
            sql.SET("partner_info_id = #{record.partnerInfoId,jdbcType=BIGINT}");
        }
        
        if (record.getEffectiveStart() != null) {
            sql.SET("effective_start = #{record.effectiveStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectiveEnd() != null) {
            sql.SET("effective_end = #{record.effectiveEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getUpperId() != null) {
            sql.SET("upper_id = #{record.upperId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getSelfId() != null) {
            sql.SET("self_id = #{record.selfId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("partner_info");
        
        sql.SET("partner_info_id = #{record.partnerInfoId,jdbcType=BIGINT}");
        sql.SET("effective_start = #{record.effectiveStart,jdbcType=TIMESTAMP}");
        sql.SET("effective_end = #{record.effectiveEnd,jdbcType=TIMESTAMP}");
        sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        sql.SET("upper_id = #{record.upperId,jdbcType=BIGINT}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("self_id = #{record.selfId,jdbcType=BIGINT}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        
        TblPartnerInfoExample example = (TblPartnerInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblPartnerInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("partner_info");
        
        if (record.getEffectiveStart() != null) {
            sql.SET("effective_start = #{effectiveStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectiveEnd() != null) {
            sql.SET("effective_end = #{effectiveEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getUpperId() != null) {
            sql.SET("upper_id = #{upperId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getSelfId() != null) {
            sql.SET("self_id = #{selfId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("partner_info_id = #{partnerInfoId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblPartnerInfoExample example, boolean includeExamplePhrase) {
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