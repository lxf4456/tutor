package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblOrganization;
import com.education.tutor.db.domain.TblOrganizationExample.Criteria;
import com.education.tutor.db.domain.TblOrganizationExample.Criterion;
import com.education.tutor.db.domain.TblOrganizationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblOrganizationSqlProvider {

    public String countByExample(TblOrganizationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("organization");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblOrganizationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("organization");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblOrganization record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("organization");
        
        if (record.getOrgCode() != null) {
            sql.VALUES("org_code", "#{orgCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            sql.VALUES("org_name", "#{orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgIndexUrl() != null) {
            sql.VALUES("org_index_url", "#{orgIndexUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgLogoUrl() != null) {
            sql.VALUES("org_logo_url", "#{orgLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgHomeCountry() != null) {
            sql.VALUES("org_home_country", "#{orgHomeCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgPriority() != null) {
            sql.VALUES("org_priority", "#{orgPriority,jdbcType=SMALLINT}");
        }
        
        if (record.getOrgSizeLevel() != null) {
            sql.VALUES("org_size_level", "#{orgSizeLevel,jdbcType=INTEGER}");
        }
        
        if (record.getOrgHomeAddress() != null) {
            sql.VALUES("org_home_address", "#{orgHomeAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactAddress() != null) {
            sql.VALUES("org_contact_address", "#{orgContactAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactPerson() != null) {
            sql.VALUES("org_contact_person", "#{orgContactPerson,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactTelno() != null) {
            sql.VALUES("org_contact_telno", "#{orgContactTelno,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactEmail() != null) {
            sql.VALUES("org_contact_email", "#{orgContactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgRoles() != null) {
            sql.VALUES("org_roles", "#{orgRoles,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgType() != null) {
            sql.VALUES("org_type", "#{orgType,jdbcType=INTEGER}");
        }
        
        if (record.getOrgPath() != null) {
            sql.VALUES("org_path", "#{orgPath,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgParentId() != null) {
            sql.VALUES("org_parent_id", "#{orgParentId,jdbcType=BIGINT}");
        }
        
        if (record.getOrgLeaderId() != null) {
            sql.VALUES("org_leader_id", "#{orgLeaderId,jdbcType=BIGINT}");
        }
        
        if (record.getOrgLevel() != null) {
            sql.VALUES("org_level", "#{orgLevel,jdbcType=INTEGER}");
        }
        
        if (record.getReason() != null) {
            sql.VALUES("reason", "#{reason,jdbcType=VARCHAR}");
        }
        
        if (record.getOwner() != null) {
            sql.VALUES("owner", "#{owner,jdbcType=BIGINT}");
        }
        
        if (record.getOrgState() != null) {
            sql.VALUES("org_state", "#{orgState,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblOrganizationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("organization_id");
        } else {
            sql.SELECT("organization_id");
        }
        sql.SELECT("org_code");
        sql.SELECT("org_name");
        sql.SELECT("org_index_url");
        sql.SELECT("org_logo_url");
        sql.SELECT("org_home_country");
        sql.SELECT("org_priority");
        sql.SELECT("org_size_level");
        sql.SELECT("org_home_address");
        sql.SELECT("org_contact_address");
        sql.SELECT("org_contact_person");
        sql.SELECT("org_contact_telno");
        sql.SELECT("org_contact_email");
        sql.SELECT("org_roles");
        sql.SELECT("org_type");
        sql.SELECT("org_path");
        sql.SELECT("org_parent_id");
        sql.SELECT("org_leader_id");
        sql.SELECT("org_level");
        sql.SELECT("reason");
        sql.SELECT("owner");
        sql.SELECT("org_state");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("organization");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblOrganization record = (TblOrganization) parameter.get("record");
        TblOrganizationExample example = (TblOrganizationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("organization");
        
        if (record.getOrganizationId() != null) {
            sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        }
        
        if (record.getOrgCode() != null) {
            sql.SET("org_code = #{record.orgCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            sql.SET("org_name = #{record.orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgIndexUrl() != null) {
            sql.SET("org_index_url = #{record.orgIndexUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgLogoUrl() != null) {
            sql.SET("org_logo_url = #{record.orgLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgHomeCountry() != null) {
            sql.SET("org_home_country = #{record.orgHomeCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgPriority() != null) {
            sql.SET("org_priority = #{record.orgPriority,jdbcType=SMALLINT}");
        }
        
        if (record.getOrgSizeLevel() != null) {
            sql.SET("org_size_level = #{record.orgSizeLevel,jdbcType=INTEGER}");
        }
        
        if (record.getOrgHomeAddress() != null) {
            sql.SET("org_home_address = #{record.orgHomeAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactAddress() != null) {
            sql.SET("org_contact_address = #{record.orgContactAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactPerson() != null) {
            sql.SET("org_contact_person = #{record.orgContactPerson,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactTelno() != null) {
            sql.SET("org_contact_telno = #{record.orgContactTelno,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactEmail() != null) {
            sql.SET("org_contact_email = #{record.orgContactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgRoles() != null) {
            sql.SET("org_roles = #{record.orgRoles,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgType() != null) {
            sql.SET("org_type = #{record.orgType,jdbcType=INTEGER}");
        }
        
        if (record.getOrgPath() != null) {
            sql.SET("org_path = #{record.orgPath,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgParentId() != null) {
            sql.SET("org_parent_id = #{record.orgParentId,jdbcType=BIGINT}");
        }
        
        if (record.getOrgLeaderId() != null) {
            sql.SET("org_leader_id = #{record.orgLeaderId,jdbcType=BIGINT}");
        }
        
        if (record.getOrgLevel() != null) {
            sql.SET("org_level = #{record.orgLevel,jdbcType=INTEGER}");
        }
        
        if (record.getReason() != null) {
            sql.SET("reason = #{record.reason,jdbcType=VARCHAR}");
        }
        
        if (record.getOwner() != null) {
            sql.SET("owner = #{record.owner,jdbcType=BIGINT}");
        }
        
        if (record.getOrgState() != null) {
            sql.SET("org_state = #{record.orgState,jdbcType=INTEGER}");
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
        sql.UPDATE("organization");
        
        sql.SET("organization_id = #{record.organizationId,jdbcType=BIGINT}");
        sql.SET("org_code = #{record.orgCode,jdbcType=VARCHAR}");
        sql.SET("org_name = #{record.orgName,jdbcType=VARCHAR}");
        sql.SET("org_index_url = #{record.orgIndexUrl,jdbcType=VARCHAR}");
        sql.SET("org_logo_url = #{record.orgLogoUrl,jdbcType=VARCHAR}");
        sql.SET("org_home_country = #{record.orgHomeCountry,jdbcType=VARCHAR}");
        sql.SET("org_priority = #{record.orgPriority,jdbcType=SMALLINT}");
        sql.SET("org_size_level = #{record.orgSizeLevel,jdbcType=INTEGER}");
        sql.SET("org_home_address = #{record.orgHomeAddress,jdbcType=VARCHAR}");
        sql.SET("org_contact_address = #{record.orgContactAddress,jdbcType=VARCHAR}");
        sql.SET("org_contact_person = #{record.orgContactPerson,jdbcType=VARCHAR}");
        sql.SET("org_contact_telno = #{record.orgContactTelno,jdbcType=VARCHAR}");
        sql.SET("org_contact_email = #{record.orgContactEmail,jdbcType=VARCHAR}");
        sql.SET("org_roles = #{record.orgRoles,jdbcType=VARCHAR}");
        sql.SET("org_type = #{record.orgType,jdbcType=INTEGER}");
        sql.SET("org_path = #{record.orgPath,jdbcType=VARCHAR}");
        sql.SET("org_parent_id = #{record.orgParentId,jdbcType=BIGINT}");
        sql.SET("org_leader_id = #{record.orgLeaderId,jdbcType=BIGINT}");
        sql.SET("org_level = #{record.orgLevel,jdbcType=INTEGER}");
        sql.SET("reason = #{record.reason,jdbcType=VARCHAR}");
        sql.SET("owner = #{record.owner,jdbcType=BIGINT}");
        sql.SET("org_state = #{record.orgState,jdbcType=INTEGER}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblOrganizationExample example = (TblOrganizationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblOrganization record) {
        SQL sql = new SQL();
        sql.UPDATE("organization");
        
        if (record.getOrgCode() != null) {
            sql.SET("org_code = #{orgCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            sql.SET("org_name = #{orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgIndexUrl() != null) {
            sql.SET("org_index_url = #{orgIndexUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgLogoUrl() != null) {
            sql.SET("org_logo_url = #{orgLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgHomeCountry() != null) {
            sql.SET("org_home_country = #{orgHomeCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgPriority() != null) {
            sql.SET("org_priority = #{orgPriority,jdbcType=SMALLINT}");
        }
        
        if (record.getOrgSizeLevel() != null) {
            sql.SET("org_size_level = #{orgSizeLevel,jdbcType=INTEGER}");
        }
        
        if (record.getOrgHomeAddress() != null) {
            sql.SET("org_home_address = #{orgHomeAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactAddress() != null) {
            sql.SET("org_contact_address = #{orgContactAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactPerson() != null) {
            sql.SET("org_contact_person = #{orgContactPerson,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactTelno() != null) {
            sql.SET("org_contact_telno = #{orgContactTelno,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgContactEmail() != null) {
            sql.SET("org_contact_email = #{orgContactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgRoles() != null) {
            sql.SET("org_roles = #{orgRoles,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgType() != null) {
            sql.SET("org_type = #{orgType,jdbcType=INTEGER}");
        }
        
        if (record.getOrgPath() != null) {
            sql.SET("org_path = #{orgPath,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgParentId() != null) {
            sql.SET("org_parent_id = #{orgParentId,jdbcType=BIGINT}");
        }
        
        if (record.getOrgLeaderId() != null) {
            sql.SET("org_leader_id = #{orgLeaderId,jdbcType=BIGINT}");
        }
        
        if (record.getOrgLevel() != null) {
            sql.SET("org_level = #{orgLevel,jdbcType=INTEGER}");
        }
        
        if (record.getReason() != null) {
            sql.SET("reason = #{reason,jdbcType=VARCHAR}");
        }
        
        if (record.getOwner() != null) {
            sql.SET("owner = #{owner,jdbcType=BIGINT}");
        }
        
        if (record.getOrgState() != null) {
            sql.SET("org_state = #{orgState,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("organization_id = #{organizationId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblOrganizationExample example, boolean includeExamplePhrase) {
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