package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblSocialGroup;
import com.education.tutor.db.domain.TblSocialGroupExample.Criteria;
import com.education.tutor.db.domain.TblSocialGroupExample.Criterion;
import com.education.tutor.db.domain.TblSocialGroupExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblSocialGroupSqlProvider {

    public String countByExample(TblSocialGroupExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("social_group");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblSocialGroupExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("social_group");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblSocialGroup record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("social_group");
        
        if (record.getSocialGroupName() != null) {
            sql.VALUES("social_group_name", "#{socialGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupAvatar() != null) {
            sql.VALUES("social_group_avatar", "#{socialGroupAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupDesc() != null) {
            sql.VALUES("social_group_desc", "#{socialGroupDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupType() != null) {
            sql.VALUES("social_group_type", "#{socialGroupType,jdbcType=SMALLINT}");
        }
        
        if (record.getOwner() != null) {
            sql.VALUES("owner", "#{owner,jdbcType=BIGINT}");
        }
        
        if (record.getAdmin() != null) {
            sql.VALUES("admin", "#{admin,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("created_by", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblSocialGroupExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("social_group_id");
        } else {
            sql.SELECT("social_group_id");
        }
        sql.SELECT("social_group_name");
        sql.SELECT("social_group_avatar");
        sql.SELECT("social_group_desc");
        sql.SELECT("social_group_type");
        sql.SELECT("owner");
        sql.SELECT("admin");
        sql.SELECT("status");
        sql.SELECT("created_by");
        sql.SELECT("created_at");
        sql.FROM("social_group");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblSocialGroup record = (TblSocialGroup) parameter.get("record");
        TblSocialGroupExample example = (TblSocialGroupExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("social_group");
        
        if (record.getSocialGroupId() != null) {
            sql.SET("social_group_id = #{record.socialGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialGroupName() != null) {
            sql.SET("social_group_name = #{record.socialGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupAvatar() != null) {
            sql.SET("social_group_avatar = #{record.socialGroupAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupDesc() != null) {
            sql.SET("social_group_desc = #{record.socialGroupDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupType() != null) {
            sql.SET("social_group_type = #{record.socialGroupType,jdbcType=SMALLINT}");
        }
        
        if (record.getOwner() != null) {
            sql.SET("owner = #{record.owner,jdbcType=BIGINT}");
        }
        
        if (record.getAdmin() != null) {
            sql.SET("admin = #{record.admin,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("social_group");
        
        sql.SET("social_group_id = #{record.socialGroupId,jdbcType=BIGINT}");
        sql.SET("social_group_name = #{record.socialGroupName,jdbcType=VARCHAR}");
        sql.SET("social_group_avatar = #{record.socialGroupAvatar,jdbcType=VARCHAR}");
        sql.SET("social_group_desc = #{record.socialGroupDesc,jdbcType=VARCHAR}");
        sql.SET("social_group_type = #{record.socialGroupType,jdbcType=SMALLINT}");
        sql.SET("owner = #{record.owner,jdbcType=BIGINT}");
        sql.SET("admin = #{record.admin,jdbcType=BIGINT}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        
        TblSocialGroupExample example = (TblSocialGroupExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblSocialGroup record) {
        SQL sql = new SQL();
        sql.UPDATE("social_group");
        
        if (record.getSocialGroupName() != null) {
            sql.SET("social_group_name = #{socialGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupAvatar() != null) {
            sql.SET("social_group_avatar = #{socialGroupAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupDesc() != null) {
            sql.SET("social_group_desc = #{socialGroupDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialGroupType() != null) {
            sql.SET("social_group_type = #{socialGroupType,jdbcType=SMALLINT}");
        }
        
        if (record.getOwner() != null) {
            sql.SET("owner = #{owner,jdbcType=BIGINT}");
        }
        
        if (record.getAdmin() != null) {
            sql.SET("admin = #{admin,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("social_group_id = #{socialGroupId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblSocialGroupExample example, boolean includeExamplePhrase) {
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