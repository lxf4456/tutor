package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserSocialGroup;
import com.education.tutor.db.domain.TblUserSocialGroupExample.Criteria;
import com.education.tutor.db.domain.TblUserSocialGroupExample.Criterion;
import com.education.tutor.db.domain.TblUserSocialGroupExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblUserSocialGroupSqlProvider {

    public String countByExample(TblUserSocialGroupExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_social_group");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblUserSocialGroupExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_social_group");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblUserSocialGroup record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_social_group");
        
        if (record.getUserMainId() != null) {
            sql.VALUES("user_main_id", "#{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupId() != null) {
            sql.VALUES("social_group_id", "#{socialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupRef() != null) {
            sql.VALUES("social_group_ref", "#{socialGroupRef,jdbcType=BIGINT}");
        }
        
        if (record.getRoleName() != null) {
            sql.VALUES("role_name", "#{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupRelation() != null) {
            sql.VALUES("user_group_relation", "#{userGroupRelation,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupNickName() != null) {
            sql.VALUES("user_group_nick_name", "#{userGroupNickName,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupUserNickName() != null) {
            sql.VALUES("group_user_nick_name", "#{groupUserNickName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupRemark() != null) {
            sql.VALUES("user_group_remark", "#{userGroupRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getInviteMessage() != null) {
            sql.VALUES("invite_message", "#{inviteMessage,jdbcType=VARCHAR}");
        }
        
        if (record.getJoinBy() != null) {
            sql.VALUES("join_by", "#{joinBy,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getApprovedAt() != null) {
            sql.VALUES("approved_at", "#{approvedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblUserSocialGroupExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("user_social_group_id");
        } else {
            sql.SELECT("user_social_group_id");
        }
        sql.SELECT("user_main_id");
        sql.SELECT("social_group_id");
        sql.SELECT("social_group_ref");
        sql.SELECT("role_name");
        sql.SELECT("user_group_relation");
        sql.SELECT("user_group_nick_name");
        sql.SELECT("group_user_nick_name");
        sql.SELECT("user_group_remark");
        sql.SELECT("invite_message");
        sql.SELECT("join_by");
        sql.SELECT("status");
        sql.SELECT("approved_at");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("user_social_group");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblUserSocialGroup record = (TblUserSocialGroup) parameter.get("record");
        TblUserSocialGroupExample example = (TblUserSocialGroupExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_social_group");
        
        if (record.getUserSocialGroupId() != null) {
            sql.SET("user_social_group_id = #{record.userSocialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupId() != null) {
            sql.SET("social_group_id = #{record.socialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupRef() != null) {
            sql.SET("social_group_ref = #{record.socialGroupRef,jdbcType=BIGINT}");
        }
        
        if (record.getRoleName() != null) {
            sql.SET("role_name = #{record.roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupRelation() != null) {
            sql.SET("user_group_relation = #{record.userGroupRelation,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupNickName() != null) {
            sql.SET("user_group_nick_name = #{record.userGroupNickName,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupUserNickName() != null) {
            sql.SET("group_user_nick_name = #{record.groupUserNickName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupRemark() != null) {
            sql.SET("user_group_remark = #{record.userGroupRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getInviteMessage() != null) {
            sql.SET("invite_message = #{record.inviteMessage,jdbcType=VARCHAR}");
        }
        
        if (record.getJoinBy() != null) {
            sql.SET("join_by = #{record.joinBy,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getApprovedAt() != null) {
            sql.SET("approved_at = #{record.approvedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user_social_group");
        
        sql.SET("user_social_group_id = #{record.userSocialGroupId,jdbcType=BIGINT}");
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("social_group_id = #{record.socialGroupId,jdbcType=BIGINT}");
        sql.SET("social_group_ref = #{record.socialGroupRef,jdbcType=BIGINT}");
        sql.SET("role_name = #{record.roleName,jdbcType=VARCHAR}");
        sql.SET("user_group_relation = #{record.userGroupRelation,jdbcType=VARCHAR}");
        sql.SET("user_group_nick_name = #{record.userGroupNickName,jdbcType=VARCHAR}");
        sql.SET("group_user_nick_name = #{record.groupUserNickName,jdbcType=VARCHAR}");
        sql.SET("user_group_remark = #{record.userGroupRemark,jdbcType=VARCHAR}");
        sql.SET("invite_message = #{record.inviteMessage,jdbcType=VARCHAR}");
        sql.SET("join_by = #{record.joinBy,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("approved_at = #{record.approvedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblUserSocialGroupExample example = (TblUserSocialGroupExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblUserSocialGroup record) {
        SQL sql = new SQL();
        sql.UPDATE("user_social_group");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupId() != null) {
            sql.SET("social_group_id = #{socialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupRef() != null) {
            sql.SET("social_group_ref = #{socialGroupRef,jdbcType=BIGINT}");
        }
        
        if (record.getRoleName() != null) {
            sql.SET("role_name = #{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupRelation() != null) {
            sql.SET("user_group_relation = #{userGroupRelation,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupNickName() != null) {
            sql.SET("user_group_nick_name = #{userGroupNickName,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupUserNickName() != null) {
            sql.SET("group_user_nick_name = #{groupUserNickName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGroupRemark() != null) {
            sql.SET("user_group_remark = #{userGroupRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getInviteMessage() != null) {
            sql.SET("invite_message = #{inviteMessage,jdbcType=VARCHAR}");
        }
        
        if (record.getJoinBy() != null) {
            sql.SET("join_by = #{joinBy,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getApprovedAt() != null) {
            sql.SET("approved_at = #{approvedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("user_social_group_id = #{userSocialGroupId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblUserSocialGroupExample example, boolean includeExamplePhrase) {
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