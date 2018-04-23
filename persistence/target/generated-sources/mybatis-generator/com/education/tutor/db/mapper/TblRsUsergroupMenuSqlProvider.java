package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblRsUsergroupMenu;
import com.education.tutor.db.domain.TblRsUsergroupMenuExample.Criteria;
import com.education.tutor.db.domain.TblRsUsergroupMenuExample.Criterion;
import com.education.tutor.db.domain.TblRsUsergroupMenuExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblRsUsergroupMenuSqlProvider {

    public String countByExample(TblRsUsergroupMenuExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("rs_usergroup_menu");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblRsUsergroupMenuExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("rs_usergroup_menu");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblRsUsergroupMenu record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("rs_usergroup_menu");
        
        if (record.getMenuId() != null) {
            sql.VALUES("menu_id", "#{menuId,jdbcType=BIGINT}");
        }
        
        if (record.getOwnerPk() != null) {
            sql.VALUES("owner_pk", "#{ownerPk,jdbcType=BIGINT}");
        }
        
        if (record.getOwnerType() != null) {
            sql.VALUES("owner_type", "#{ownerType,jdbcType=INTEGER}");
        }
        
        if (record.getMenuLevel() != null) {
            sql.VALUES("menu_level", "#{menuLevel,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblRsUsergroupMenuExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("menu_id");
        } else {
            sql.SELECT("menu_id");
        }
        sql.SELECT("owner_pk");
        sql.SELECT("owner_type");
        sql.SELECT("menu_level");
        sql.FROM("rs_usergroup_menu");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblRsUsergroupMenu record = (TblRsUsergroupMenu) parameter.get("record");
        TblRsUsergroupMenuExample example = (TblRsUsergroupMenuExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("rs_usergroup_menu");
        
        if (record.getMenuId() != null) {
            sql.SET("menu_id = #{record.menuId,jdbcType=BIGINT}");
        }
        
        if (record.getOwnerPk() != null) {
            sql.SET("owner_pk = #{record.ownerPk,jdbcType=BIGINT}");
        }
        
        if (record.getOwnerType() != null) {
            sql.SET("owner_type = #{record.ownerType,jdbcType=INTEGER}");
        }
        
        if (record.getMenuLevel() != null) {
            sql.SET("menu_level = #{record.menuLevel,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("rs_usergroup_menu");
        
        sql.SET("menu_id = #{record.menuId,jdbcType=BIGINT}");
        sql.SET("owner_pk = #{record.ownerPk,jdbcType=BIGINT}");
        sql.SET("owner_type = #{record.ownerType,jdbcType=INTEGER}");
        sql.SET("menu_level = #{record.menuLevel,jdbcType=INTEGER}");
        
        TblRsUsergroupMenuExample example = (TblRsUsergroupMenuExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblRsUsergroupMenu record) {
        SQL sql = new SQL();
        sql.UPDATE("rs_usergroup_menu");
        
        if (record.getMenuLevel() != null) {
            sql.SET("menu_level = #{menuLevel,jdbcType=INTEGER}");
        }
        
        sql.WHERE("menu_id = #{menuId,jdbcType=BIGINT}");
        sql.WHERE("owner_pk = #{ownerPk,jdbcType=BIGINT}");
        sql.WHERE("owner_type = #{ownerType,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblRsUsergroupMenuExample example, boolean includeExamplePhrase) {
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