package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblOrderMain;
import com.education.tutor.db.domain.TblOrderMainExample.Criteria;
import com.education.tutor.db.domain.TblOrderMainExample.Criterion;
import com.education.tutor.db.domain.TblOrderMainExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblOrderMainSqlProvider {

    public String countByExample(TblOrderMainExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("order_main");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblOrderMainExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("order_main");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblOrderMain record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("order_main");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getRewardPoolId() != null) {
            sql.VALUES("reward_pool_id", "#{rewardPoolId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderType() != null) {
            sql.VALUES("order_type", "#{orderType,jdbcType=INTEGER}");
        }
        
        if (record.getOrderState() != null) {
            sql.VALUES("order_state", "#{orderState,jdbcType=INTEGER}");
        }
        
        if (record.getOrderAmount() != null) {
            sql.VALUES("order_amount", "#{orderAmount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderIssuedBy() != null) {
            sql.VALUES("order_issued_by", "#{orderIssuedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderTargetTo() != null) {
            sql.VALUES("order_target_to", "#{orderTargetTo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderContent() != null) {
            sql.VALUES("order_content", "#{orderContent,jdbcType=VARCHAR}");
        }
        
        if (record.getVocherState() != null) {
            sql.VALUES("vocher_state", "#{vocherState,jdbcType=INTEGER}");
        }
        
        if (record.getVocherTitle() != null) {
            sql.VALUES("vocher_title", "#{vocherTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentState() != null) {
            sql.VALUES("payment_state", "#{paymentState,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentDesc() != null) {
            sql.VALUES("payment_desc", "#{paymentDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryState() != null) {
            sql.VALUES("delivery_state", "#{deliveryState,jdbcType=INTEGER}");
        }
        
        if (record.getDeliveryLocation() != null) {
            sql.VALUES("delivery_location", "#{deliveryLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryDesc() != null) {
            sql.VALUES("delivery_desc", "#{deliveryDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowup() != null) {
            sql.VALUES("followup", "#{followup,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblOrderMainExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("order_main_id");
        } else {
            sql.SELECT("order_main_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("reward_pool_id");
        sql.SELECT("order_no");
        sql.SELECT("order_type");
        sql.SELECT("order_state");
        sql.SELECT("order_amount");
        sql.SELECT("order_issued_by");
        sql.SELECT("order_target_to");
        sql.SELECT("order_content");
        sql.SELECT("vocher_state");
        sql.SELECT("vocher_title");
        sql.SELECT("payment_state");
        sql.SELECT("payment_desc");
        sql.SELECT("delivery_state");
        sql.SELECT("delivery_location");
        sql.SELECT("delivery_desc");
        sql.SELECT("followup");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("order_main");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblOrderMain record = (TblOrderMain) parameter.get("record");
        TblOrderMainExample example = (TblOrderMainExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("order_main");
        
        if (record.getOrderMainId() != null) {
            sql.SET("order_main_id = #{record.orderMainId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getRewardPoolId() != null) {
            sql.SET("reward_pool_id = #{record.rewardPoolId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderType() != null) {
            sql.SET("order_type = #{record.orderType,jdbcType=INTEGER}");
        }
        
        if (record.getOrderState() != null) {
            sql.SET("order_state = #{record.orderState,jdbcType=INTEGER}");
        }
        
        if (record.getOrderAmount() != null) {
            sql.SET("order_amount = #{record.orderAmount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderIssuedBy() != null) {
            sql.SET("order_issued_by = #{record.orderIssuedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderTargetTo() != null) {
            sql.SET("order_target_to = #{record.orderTargetTo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderContent() != null) {
            sql.SET("order_content = #{record.orderContent,jdbcType=VARCHAR}");
        }
        
        if (record.getVocherState() != null) {
            sql.SET("vocher_state = #{record.vocherState,jdbcType=INTEGER}");
        }
        
        if (record.getVocherTitle() != null) {
            sql.SET("vocher_title = #{record.vocherTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentState() != null) {
            sql.SET("payment_state = #{record.paymentState,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentDesc() != null) {
            sql.SET("payment_desc = #{record.paymentDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryState() != null) {
            sql.SET("delivery_state = #{record.deliveryState,jdbcType=INTEGER}");
        }
        
        if (record.getDeliveryLocation() != null) {
            sql.SET("delivery_location = #{record.deliveryLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryDesc() != null) {
            sql.SET("delivery_desc = #{record.deliveryDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowup() != null) {
            sql.SET("followup = #{record.followup,jdbcType=VARCHAR}");
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
        sql.UPDATE("order_main");
        
        sql.SET("order_main_id = #{record.orderMainId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("reward_pool_id = #{record.rewardPoolId,jdbcType=BIGINT}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("order_type = #{record.orderType,jdbcType=INTEGER}");
        sql.SET("order_state = #{record.orderState,jdbcType=INTEGER}");
        sql.SET("order_amount = #{record.orderAmount,jdbcType=INTEGER}");
        sql.SET("order_issued_by = #{record.orderIssuedBy,jdbcType=VARCHAR}");
        sql.SET("order_target_to = #{record.orderTargetTo,jdbcType=VARCHAR}");
        sql.SET("order_content = #{record.orderContent,jdbcType=VARCHAR}");
        sql.SET("vocher_state = #{record.vocherState,jdbcType=INTEGER}");
        sql.SET("vocher_title = #{record.vocherTitle,jdbcType=VARCHAR}");
        sql.SET("payment_state = #{record.paymentState,jdbcType=INTEGER}");
        sql.SET("payment_desc = #{record.paymentDesc,jdbcType=VARCHAR}");
        sql.SET("delivery_state = #{record.deliveryState,jdbcType=INTEGER}");
        sql.SET("delivery_location = #{record.deliveryLocation,jdbcType=VARCHAR}");
        sql.SET("delivery_desc = #{record.deliveryDesc,jdbcType=VARCHAR}");
        sql.SET("followup = #{record.followup,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblOrderMainExample example = (TblOrderMainExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblOrderMain record) {
        SQL sql = new SQL();
        sql.UPDATE("order_main");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getRewardPoolId() != null) {
            sql.SET("reward_pool_id = #{rewardPoolId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderType() != null) {
            sql.SET("order_type = #{orderType,jdbcType=INTEGER}");
        }
        
        if (record.getOrderState() != null) {
            sql.SET("order_state = #{orderState,jdbcType=INTEGER}");
        }
        
        if (record.getOrderAmount() != null) {
            sql.SET("order_amount = #{orderAmount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderIssuedBy() != null) {
            sql.SET("order_issued_by = #{orderIssuedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderTargetTo() != null) {
            sql.SET("order_target_to = #{orderTargetTo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderContent() != null) {
            sql.SET("order_content = #{orderContent,jdbcType=VARCHAR}");
        }
        
        if (record.getVocherState() != null) {
            sql.SET("vocher_state = #{vocherState,jdbcType=INTEGER}");
        }
        
        if (record.getVocherTitle() != null) {
            sql.SET("vocher_title = #{vocherTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentState() != null) {
            sql.SET("payment_state = #{paymentState,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentDesc() != null) {
            sql.SET("payment_desc = #{paymentDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryState() != null) {
            sql.SET("delivery_state = #{deliveryState,jdbcType=INTEGER}");
        }
        
        if (record.getDeliveryLocation() != null) {
            sql.SET("delivery_location = #{deliveryLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryDesc() != null) {
            sql.SET("delivery_desc = #{deliveryDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowup() != null) {
            sql.SET("followup = #{followup,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("order_main_id = #{orderMainId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblOrderMainExample example, boolean includeExamplePhrase) {
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