package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRewardPool;
import com.education.tutor.db.domain.TblRewardPoolExample.Criteria;
import com.education.tutor.db.domain.TblRewardPoolExample.Criterion;
import com.education.tutor.db.domain.TblRewardPoolExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblRewardPoolSqlProvider {

    public String countByExample(TblRewardPoolExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("reward_pool");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblRewardPoolExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("reward_pool");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblRewardPool record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("reward_pool");
        
        if (record.getAccountId() != null) {
            sql.VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getRewardType() != null) {
            sql.VALUES("reward_type", "#{rewardType,jdbcType=INTEGER}");
        }
        
        if (record.getRewardState() != null) {
            sql.VALUES("reward_state", "#{rewardState,jdbcType=INTEGER}");
        }
        
        if (record.getRewardAmount() != null) {
            sql.VALUES("reward_amount", "#{rewardAmount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardPurpose() != null) {
            sql.VALUES("reward_purpose", "#{rewardPurpose,jdbcType=VARCHAR}");
        }
        
        if (record.getEffectiveAt() != null) {
            sql.VALUES("effective_at", "#{effectiveAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblRewardPoolExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("reward_pool_id");
        } else {
            sql.SELECT("reward_pool_id");
        }
        sql.SELECT("account_id");
        sql.SELECT("reward_type");
        sql.SELECT("reward_state");
        sql.SELECT("reward_amount");
        sql.SELECT("reward_purpose");
        sql.SELECT("effective_at");
        sql.SELECT("updated_at");
        sql.FROM("reward_pool");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblRewardPool record = (TblRewardPool) parameter.get("record");
        TblRewardPoolExample example = (TblRewardPoolExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("reward_pool");
        
        if (record.getRewardPoolId() != null) {
            sql.SET("reward_pool_id = #{record.rewardPoolId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{record.accountId,jdbcType=BIGINT}");
        }
        
        if (record.getRewardType() != null) {
            sql.SET("reward_type = #{record.rewardType,jdbcType=INTEGER}");
        }
        
        if (record.getRewardState() != null) {
            sql.SET("reward_state = #{record.rewardState,jdbcType=INTEGER}");
        }
        
        if (record.getRewardAmount() != null) {
            sql.SET("reward_amount = #{record.rewardAmount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardPurpose() != null) {
            sql.SET("reward_purpose = #{record.rewardPurpose,jdbcType=VARCHAR}");
        }
        
        if (record.getEffectiveAt() != null) {
            sql.SET("effective_at = #{record.effectiveAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("reward_pool");
        
        sql.SET("reward_pool_id = #{record.rewardPoolId,jdbcType=BIGINT}");
        sql.SET("account_id = #{record.accountId,jdbcType=BIGINT}");
        sql.SET("reward_type = #{record.rewardType,jdbcType=INTEGER}");
        sql.SET("reward_state = #{record.rewardState,jdbcType=INTEGER}");
        sql.SET("reward_amount = #{record.rewardAmount,jdbcType=INTEGER}");
        sql.SET("reward_purpose = #{record.rewardPurpose,jdbcType=VARCHAR}");
        sql.SET("effective_at = #{record.effectiveAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblRewardPoolExample example = (TblRewardPoolExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblRewardPool record) {
        SQL sql = new SQL();
        sql.UPDATE("reward_pool");
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getRewardType() != null) {
            sql.SET("reward_type = #{rewardType,jdbcType=INTEGER}");
        }
        
        if (record.getRewardState() != null) {
            sql.SET("reward_state = #{rewardState,jdbcType=INTEGER}");
        }
        
        if (record.getRewardAmount() != null) {
            sql.SET("reward_amount = #{rewardAmount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardPurpose() != null) {
            sql.SET("reward_purpose = #{rewardPurpose,jdbcType=VARCHAR}");
        }
        
        if (record.getEffectiveAt() != null) {
            sql.SET("effective_at = #{effectiveAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("reward_pool_id = #{rewardPoolId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblRewardPoolExample example, boolean includeExamplePhrase) {
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