package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAccount;
import com.education.tutor.db.domain.TblAccountExample.Criteria;
import com.education.tutor.db.domain.TblAccountExample.Criterion;
import com.education.tutor.db.domain.TblAccountExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblAccountSqlProvider {

    public String countByExample(TblAccountExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("account");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblAccountExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("account");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblAccount record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("account");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGovtIdNo() != null) {
            sql.VALUES("govt_id_no", "#{govtIdNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGovtIdType() != null) {
            sql.VALUES("govt_id_type", "#{govtIdType,jdbcType=SMALLINT}");
        }
        
        if (record.getBankName() != null) {
            sql.VALUES("bank_name", "#{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountType() != null) {
            sql.VALUES("bank_account_type", "#{bankAccountType,jdbcType=INTEGER}");
        }
        
        if (record.getBankAccountName() != null) {
            sql.VALUES("bank_account_name", "#{bankAccountName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountNo() != null) {
            sql.VALUES("bank_account_no", "#{bankAccountNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountCountry() != null) {
            sql.VALUES("bank_account_country", "#{bankAccountCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountAddress() != null) {
            sql.VALUES("bank_account_address", "#{bankAccountAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountNameInter() != null) {
            sql.VALUES("bank_account_name_inter", "#{bankAccountNameInter,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountSwift() != null) {
            sql.VALUES("bank_account_swift", "#{bankAccountSwift,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountSwiftInter() != null) {
            sql.VALUES("bank_account_swift_inter", "#{bankAccountSwiftInter,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getDepositSum() != null) {
            sql.VALUES("deposit_sum", "#{depositSum,jdbcType=INTEGER}");
        }
        
        if (record.getDepositBalance() != null) {
            sql.VALUES("deposit_balance", "#{depositBalance,jdbcType=INTEGER}");
        }
        
        if (record.getRewardSum() != null) {
            sql.VALUES("reward_sum", "#{rewardSum,jdbcType=INTEGER}");
        }
        
        if (record.getRewardBalance() != null) {
            sql.VALUES("reward_balance", "#{rewardBalance,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawSum() != null) {
            sql.VALUES("withdraw_sum", "#{withdrawSum,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawBalance() != null) {
            sql.VALUES("withdraw_balance", "#{withdrawBalance,jdbcType=INTEGER}");
        }
        
        if (record.getPayoutSum() != null) {
            sql.VALUES("payout_sum", "#{payoutSum,jdbcType=INTEGER}");
        }
        
        if (record.getPayoutBalance() != null) {
            sql.VALUES("payout_balance", "#{payoutBalance,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("balance", "#{balance,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblAccountExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("account_id");
        } else {
            sql.SELECT("account_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("govt_id_no");
        sql.SELECT("govt_id_type");
        sql.SELECT("bank_name");
        sql.SELECT("bank_account_type");
        sql.SELECT("bank_account_name");
        sql.SELECT("bank_account_no");
        sql.SELECT("bank_account_country");
        sql.SELECT("bank_account_address");
        sql.SELECT("bank_account_name_inter");
        sql.SELECT("bank_account_swift");
        sql.SELECT("bank_account_swift_inter");
        sql.SELECT("mobile");
        sql.SELECT("address");
        sql.SELECT("deposit_sum");
        sql.SELECT("deposit_balance");
        sql.SELECT("reward_sum");
        sql.SELECT("reward_balance");
        sql.SELECT("withdraw_sum");
        sql.SELECT("withdraw_balance");
        sql.SELECT("payout_sum");
        sql.SELECT("payout_balance");
        sql.SELECT("balance");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("account");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblAccount record = (TblAccount) parameter.get("record");
        TblAccountExample example = (TblAccountExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("account");
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{record.accountId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGovtIdNo() != null) {
            sql.SET("govt_id_no = #{record.govtIdNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGovtIdType() != null) {
            sql.SET("govt_id_type = #{record.govtIdType,jdbcType=SMALLINT}");
        }
        
        if (record.getBankName() != null) {
            sql.SET("bank_name = #{record.bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountType() != null) {
            sql.SET("bank_account_type = #{record.bankAccountType,jdbcType=INTEGER}");
        }
        
        if (record.getBankAccountName() != null) {
            sql.SET("bank_account_name = #{record.bankAccountName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountNo() != null) {
            sql.SET("bank_account_no = #{record.bankAccountNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountCountry() != null) {
            sql.SET("bank_account_country = #{record.bankAccountCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountAddress() != null) {
            sql.SET("bank_account_address = #{record.bankAccountAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountNameInter() != null) {
            sql.SET("bank_account_name_inter = #{record.bankAccountNameInter,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountSwift() != null) {
            sql.SET("bank_account_swift = #{record.bankAccountSwift,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountSwiftInter() != null) {
            sql.SET("bank_account_swift_inter = #{record.bankAccountSwiftInter,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getDepositSum() != null) {
            sql.SET("deposit_sum = #{record.depositSum,jdbcType=INTEGER}");
        }
        
        if (record.getDepositBalance() != null) {
            sql.SET("deposit_balance = #{record.depositBalance,jdbcType=INTEGER}");
        }
        
        if (record.getRewardSum() != null) {
            sql.SET("reward_sum = #{record.rewardSum,jdbcType=INTEGER}");
        }
        
        if (record.getRewardBalance() != null) {
            sql.SET("reward_balance = #{record.rewardBalance,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawSum() != null) {
            sql.SET("withdraw_sum = #{record.withdrawSum,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawBalance() != null) {
            sql.SET("withdraw_balance = #{record.withdrawBalance,jdbcType=INTEGER}");
        }
        
        if (record.getPayoutSum() != null) {
            sql.SET("payout_sum = #{record.payoutSum,jdbcType=INTEGER}");
        }
        
        if (record.getPayoutBalance() != null) {
            sql.SET("payout_balance = #{record.payoutBalance,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{record.balance,jdbcType=INTEGER}");
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
        sql.UPDATE("account");
        
        sql.SET("account_id = #{record.accountId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("govt_id_no = #{record.govtIdNo,jdbcType=VARCHAR}");
        sql.SET("govt_id_type = #{record.govtIdType,jdbcType=SMALLINT}");
        sql.SET("bank_name = #{record.bankName,jdbcType=VARCHAR}");
        sql.SET("bank_account_type = #{record.bankAccountType,jdbcType=INTEGER}");
        sql.SET("bank_account_name = #{record.bankAccountName,jdbcType=VARCHAR}");
        sql.SET("bank_account_no = #{record.bankAccountNo,jdbcType=VARCHAR}");
        sql.SET("bank_account_country = #{record.bankAccountCountry,jdbcType=VARCHAR}");
        sql.SET("bank_account_address = #{record.bankAccountAddress,jdbcType=VARCHAR}");
        sql.SET("bank_account_name_inter = #{record.bankAccountNameInter,jdbcType=VARCHAR}");
        sql.SET("bank_account_swift = #{record.bankAccountSwift,jdbcType=VARCHAR}");
        sql.SET("bank_account_swift_inter = #{record.bankAccountSwiftInter,jdbcType=VARCHAR}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("deposit_sum = #{record.depositSum,jdbcType=INTEGER}");
        sql.SET("deposit_balance = #{record.depositBalance,jdbcType=INTEGER}");
        sql.SET("reward_sum = #{record.rewardSum,jdbcType=INTEGER}");
        sql.SET("reward_balance = #{record.rewardBalance,jdbcType=INTEGER}");
        sql.SET("withdraw_sum = #{record.withdrawSum,jdbcType=INTEGER}");
        sql.SET("withdraw_balance = #{record.withdrawBalance,jdbcType=INTEGER}");
        sql.SET("payout_sum = #{record.payoutSum,jdbcType=INTEGER}");
        sql.SET("payout_balance = #{record.payoutBalance,jdbcType=INTEGER}");
        sql.SET("balance = #{record.balance,jdbcType=INTEGER}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblAccountExample example = (TblAccountExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblAccount record) {
        SQL sql = new SQL();
        sql.UPDATE("account");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getGovtIdNo() != null) {
            sql.SET("govt_id_no = #{govtIdNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGovtIdType() != null) {
            sql.SET("govt_id_type = #{govtIdType,jdbcType=SMALLINT}");
        }
        
        if (record.getBankName() != null) {
            sql.SET("bank_name = #{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountType() != null) {
            sql.SET("bank_account_type = #{bankAccountType,jdbcType=INTEGER}");
        }
        
        if (record.getBankAccountName() != null) {
            sql.SET("bank_account_name = #{bankAccountName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountNo() != null) {
            sql.SET("bank_account_no = #{bankAccountNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountCountry() != null) {
            sql.SET("bank_account_country = #{bankAccountCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountAddress() != null) {
            sql.SET("bank_account_address = #{bankAccountAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountNameInter() != null) {
            sql.SET("bank_account_name_inter = #{bankAccountNameInter,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountSwift() != null) {
            sql.SET("bank_account_swift = #{bankAccountSwift,jdbcType=VARCHAR}");
        }
        
        if (record.getBankAccountSwiftInter() != null) {
            sql.SET("bank_account_swift_inter = #{bankAccountSwiftInter,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getDepositSum() != null) {
            sql.SET("deposit_sum = #{depositSum,jdbcType=INTEGER}");
        }
        
        if (record.getDepositBalance() != null) {
            sql.SET("deposit_balance = #{depositBalance,jdbcType=INTEGER}");
        }
        
        if (record.getRewardSum() != null) {
            sql.SET("reward_sum = #{rewardSum,jdbcType=INTEGER}");
        }
        
        if (record.getRewardBalance() != null) {
            sql.SET("reward_balance = #{rewardBalance,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawSum() != null) {
            sql.SET("withdraw_sum = #{withdrawSum,jdbcType=INTEGER}");
        }
        
        if (record.getWithdrawBalance() != null) {
            sql.SET("withdraw_balance = #{withdrawBalance,jdbcType=INTEGER}");
        }
        
        if (record.getPayoutSum() != null) {
            sql.SET("payout_sum = #{payoutSum,jdbcType=INTEGER}");
        }
        
        if (record.getPayoutBalance() != null) {
            sql.SET("payout_balance = #{payoutBalance,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{balance,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("account_id = #{accountId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblAccountExample example, boolean includeExamplePhrase) {
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