package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGroups;
import com.education.tutor.db.domain.TblGroupsExample.Criteria;
import com.education.tutor.db.domain.TblGroupsExample.Criterion;
import com.education.tutor.db.domain.TblGroupsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblGroupsSqlProvider {

    public String countByExample(TblGroupsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("groups");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblGroupsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("groups");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblGroups record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("groups");
        
        if (record.getGroupName() != null) {
            sql.VALUES("group_name", "#{groupName,jdbcType=VARCHAR}");
        }
        
        if (record.getDisplayLabel() != null) {
            sql.VALUES("display_label", "#{displayLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupCategory() != null) {
            sql.VALUES("group_category", "#{groupCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuArray() != null) {
            sql.VALUES("menu_array", "#{menuArray,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblGroupsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("group_name");
        sql.SELECT("display_label");
        sql.SELECT("group_category");
        sql.SELECT("menu_array");
        sql.FROM("groups");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblGroups record = (TblGroups) parameter.get("record");
        TblGroupsExample example = (TblGroupsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("groups");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getGroupName() != null) {
            sql.SET("group_name = #{record.groupName,jdbcType=VARCHAR}");
        }
        
        if (record.getDisplayLabel() != null) {
            sql.SET("display_label = #{record.displayLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupCategory() != null) {
            sql.SET("group_category = #{record.groupCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuArray() != null) {
            sql.SET("menu_array = #{record.menuArray,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("groups");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("group_name = #{record.groupName,jdbcType=VARCHAR}");
        sql.SET("display_label = #{record.displayLabel,jdbcType=VARCHAR}");
        sql.SET("group_category = #{record.groupCategory,jdbcType=VARCHAR}");
        sql.SET("menu_array = #{record.menuArray,jdbcType=VARCHAR}");
        
        TblGroupsExample example = (TblGroupsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblGroups record) {
        SQL sql = new SQL();
        sql.UPDATE("groups");
        
        if (record.getGroupName() != null) {
            sql.SET("group_name = #{groupName,jdbcType=VARCHAR}");
        }
        
        if (record.getDisplayLabel() != null) {
            sql.SET("display_label = #{displayLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupCategory() != null) {
            sql.SET("group_category = #{groupCategory,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuArray() != null) {
            sql.SET("menu_array = #{menuArray,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblGroupsExample example, boolean includeExamplePhrase) {
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