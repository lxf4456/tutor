package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblContractPayment;
import com.education.tutor.db.domain.TblContractPaymentExample.Criteria;
import com.education.tutor.db.domain.TblContractPaymentExample.Criterion;
import com.education.tutor.db.domain.TblContractPaymentExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblContractPaymentSqlProvider {

    public String countByExample(TblContractPaymentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("contract_payment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblContractPaymentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("contract_payment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblContractPayment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("contract_payment");
        
        if (record.getContractId() != null) {
            sql.VALUES("contract_id", "#{contractId,jdbcType=BIGINT}");
        }
        
        if (record.getSeqNo() != null) {
            sql.VALUES("seq_no", "#{seqNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentType() != null) {
            sql.VALUES("payment_type", "#{paymentType,jdbcType=INTEGER}");
        }
        
        if (record.getCommissionSourcePk() != null) {
            sql.VALUES("commission_source_pk", "#{commissionSourcePk,jdbcType=BIGINT}");
        }
        
        if (record.getCommissionLevel() != null) {
            sql.VALUES("commission_level", "#{commissionLevel,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.VALUES("target_pk", "#{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getCurrency() != null) {
            sql.VALUES("currency", "#{currency,jdbcType=INTEGER}");
        }
        
        if (record.getItemCount() != null) {
            sql.VALUES("item_count", "#{itemCount,jdbcType=INTEGER}");
        }
        
        if (record.getExchangeRatio() != null) {
            sql.VALUES("exchange_ratio", "#{exchangeRatio,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getBillDate() != null) {
            sql.VALUES("bill_date", "#{billDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getFeeCharged() != null) {
            sql.VALUES("fee_charged", "#{feeCharged,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.VALUES("payment_method", "#{paymentMethod,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblContractPaymentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("contract_payment_id");
        } else {
            sql.SELECT("contract_payment_id");
        }
        sql.SELECT("contract_id");
        sql.SELECT("seq_no");
        sql.SELECT("payment_type");
        sql.SELECT("commission_source_pk");
        sql.SELECT("commission_level");
        sql.SELECT("target_pk");
        sql.SELECT("currency");
        sql.SELECT("item_count");
        sql.SELECT("exchange_ratio");
        sql.SELECT("description");
        sql.SELECT("bill_date");
        sql.SELECT("remark");
        sql.SELECT("fee_charged");
        sql.SELECT("payment_method");
        sql.SELECT("status");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("contract_payment");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblContractPayment record = (TblContractPayment) parameter.get("record");
        TblContractPaymentExample example = (TblContractPaymentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("contract_payment");
        
        if (record.getContractPaymentId() != null) {
            sql.SET("contract_payment_id = #{record.contractPaymentId,jdbcType=BIGINT}");
        }
        
        if (record.getContractId() != null) {
            sql.SET("contract_id = #{record.contractId,jdbcType=BIGINT}");
        }
        
        if (record.getSeqNo() != null) {
            sql.SET("seq_no = #{record.seqNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentType() != null) {
            sql.SET("payment_type = #{record.paymentType,jdbcType=INTEGER}");
        }
        
        if (record.getCommissionSourcePk() != null) {
            sql.SET("commission_source_pk = #{record.commissionSourcePk,jdbcType=BIGINT}");
        }
        
        if (record.getCommissionLevel() != null) {
            sql.SET("commission_level = #{record.commissionLevel,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getCurrency() != null) {
            sql.SET("currency = #{record.currency,jdbcType=INTEGER}");
        }
        
        if (record.getItemCount() != null) {
            sql.SET("item_count = #{record.itemCount,jdbcType=INTEGER}");
        }
        
        if (record.getExchangeRatio() != null) {
            sql.SET("exchange_ratio = #{record.exchangeRatio,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getBillDate() != null) {
            sql.SET("bill_date = #{record.billDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getFeeCharged() != null) {
            sql.SET("fee_charged = #{record.feeCharged,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.SET("payment_method = #{record.paymentMethod,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
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
        sql.UPDATE("contract_payment");
        
        sql.SET("contract_payment_id = #{record.contractPaymentId,jdbcType=BIGINT}");
        sql.SET("contract_id = #{record.contractId,jdbcType=BIGINT}");
        sql.SET("seq_no = #{record.seqNo,jdbcType=VARCHAR}");
        sql.SET("payment_type = #{record.paymentType,jdbcType=INTEGER}");
        sql.SET("commission_source_pk = #{record.commissionSourcePk,jdbcType=BIGINT}");
        sql.SET("commission_level = #{record.commissionLevel,jdbcType=INTEGER}");
        sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        sql.SET("currency = #{record.currency,jdbcType=INTEGER}");
        sql.SET("item_count = #{record.itemCount,jdbcType=INTEGER}");
        sql.SET("exchange_ratio = #{record.exchangeRatio,jdbcType=INTEGER}");
        sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        sql.SET("bill_date = #{record.billDate,jdbcType=TIMESTAMP}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("fee_charged = #{record.feeCharged,jdbcType=INTEGER}");
        sql.SET("payment_method = #{record.paymentMethod,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblContractPaymentExample example = (TblContractPaymentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblContractPayment record) {
        SQL sql = new SQL();
        sql.UPDATE("contract_payment");
        
        if (record.getContractId() != null) {
            sql.SET("contract_id = #{contractId,jdbcType=BIGINT}");
        }
        
        if (record.getSeqNo() != null) {
            sql.SET("seq_no = #{seqNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentType() != null) {
            sql.SET("payment_type = #{paymentType,jdbcType=INTEGER}");
        }
        
        if (record.getCommissionSourcePk() != null) {
            sql.SET("commission_source_pk = #{commissionSourcePk,jdbcType=BIGINT}");
        }
        
        if (record.getCommissionLevel() != null) {
            sql.SET("commission_level = #{commissionLevel,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getCurrency() != null) {
            sql.SET("currency = #{currency,jdbcType=INTEGER}");
        }
        
        if (record.getItemCount() != null) {
            sql.SET("item_count = #{itemCount,jdbcType=INTEGER}");
        }
        
        if (record.getExchangeRatio() != null) {
            sql.SET("exchange_ratio = #{exchangeRatio,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getBillDate() != null) {
            sql.SET("bill_date = #{billDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getFeeCharged() != null) {
            sql.SET("fee_charged = #{feeCharged,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.SET("payment_method = #{paymentMethod,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("contract_payment_id = #{contractPaymentId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblContractPaymentExample example, boolean includeExamplePhrase) {
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