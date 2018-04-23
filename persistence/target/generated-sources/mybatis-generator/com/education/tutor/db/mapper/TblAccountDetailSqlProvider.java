package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAccountDetail;
import com.education.tutor.db.domain.TblAccountDetailExample.Criteria;
import com.education.tutor.db.domain.TblAccountDetailExample.Criterion;
import com.education.tutor.db.domain.TblAccountDetailExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblAccountDetailSqlProvider {

    public String countByExample(TblAccountDetailExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("account_detail");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblAccountDetailExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("account_detail");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblAccountDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("account_detail");
        
        if (record.getAccountId() != null) {
            sql.VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getDepositAmount() != null) {
            sql.VALUES("deposit_amount", "#{depositAmount,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentAmount() != null) {
            sql.VALUES("payment_amount", "#{paymentAmount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardAmount() != null) {
            sql.VALUES("reward_amount", "#{rewardAmount,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawAmount() != null) {
            sql.VALUES("withdraw_amount", "#{withdrawAmount,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("balance", "#{balance,jdbcType=INTEGER}");
        }
        
        if (record.getChannel() != null) {
            sql.VALUES("channel", "#{channel,jdbcType=VARCHAR}");
        }
        
        if (record.getOperationType() != null) {
            sql.VALUES("operation_type", "#{operationType,jdbcType=VARCHAR}");
        }
        
        if (record.getTranNo() != null) {
            sql.VALUES("tran_no", "#{tranNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblAccountDetailExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("account_detail_id");
        } else {
            sql.SELECT("account_detail_id");
        }
        sql.SELECT("account_id");
        sql.SELECT("deposit_amount");
        sql.SELECT("payment_amount");
        sql.SELECT("reward_amount");
        sql.SELECT("withdraw_amount");
        sql.SELECT("balance");
        sql.SELECT("channel");
        sql.SELECT("operation_type");
        sql.SELECT("tran_no");
        sql.SELECT("order_no");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("account_detail");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblAccountDetail record = (TblAccountDetail) parameter.get("record");
        TblAccountDetailExample example = (TblAccountDetailExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("account_detail");
        
        if (record.getAccountDetailId() != null) {
            sql.SET("account_detail_id = #{record.accountDetailId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{record.accountId,jdbcType=BIGINT}");
        }
        
        if (record.getDepositAmount() != null) {
            sql.SET("deposit_amount = #{record.depositAmount,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentAmount() != null) {
            sql.SET("payment_amount = #{record.paymentAmount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardAmount() != null) {
            sql.SET("reward_amount = #{record.rewardAmount,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawAmount() != null) {
            sql.SET("withdraw_amount = #{record.withdrawAmount,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{record.balance,jdbcType=INTEGER}");
        }
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        }
        
        if (record.getOperationType() != null) {
            sql.SET("operation_type = #{record.operationType,jdbcType=VARCHAR}");
        }
        
        if (record.getTranNo() != null) {
            sql.SET("tran_no = #{record.tranNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
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
        sql.UPDATE("account_detail");
        
        sql.SET("account_detail_id = #{record.accountDetailId,jdbcType=BIGINT}");
        sql.SET("account_id = #{record.accountId,jdbcType=BIGINT}");
        sql.SET("deposit_amount = #{record.depositAmount,jdbcType=INTEGER}");
        sql.SET("payment_amount = #{record.paymentAmount,jdbcType=INTEGER}");
        sql.SET("reward_amount = #{record.rewardAmount,jdbcType=INTEGER}");
        sql.SET("withdraw_amount = #{record.withdrawAmount,jdbcType=INTEGER}");
        sql.SET("balance = #{record.balance,jdbcType=INTEGER}");
        sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        sql.SET("operation_type = #{record.operationType,jdbcType=VARCHAR}");
        sql.SET("tran_no = #{record.tranNo,jdbcType=VARCHAR}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblAccountDetailExample example = (TblAccountDetailExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblAccountDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("account_detail");
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getDepositAmount() != null) {
            sql.SET("deposit_amount = #{depositAmount,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentAmount() != null) {
            sql.SET("payment_amount = #{paymentAmount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardAmount() != null) {
            sql.SET("reward_amount = #{rewardAmount,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawAmount() != null) {
            sql.SET("withdraw_amount = #{withdrawAmount,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{balance,jdbcType=INTEGER}");
        }
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{channel,jdbcType=VARCHAR}");
        }
        
        if (record.getOperationType() != null) {
            sql.SET("operation_type = #{operationType,jdbcType=VARCHAR}");
        }
        
        if (record.getTranNo() != null) {
            sql.SET("tran_no = #{tranNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("account_detail_id = #{accountDetailId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblAccountDetailExample example, boolean includeExamplePhrase) {
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