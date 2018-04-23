package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblMenu;
import com.education.tutor.db.domain.TblMenuExample.Criteria;
import com.education.tutor.db.domain.TblMenuExample.Criterion;
import com.education.tutor.db.domain.TblMenuExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblMenuSqlProvider {

    public String countByExample(TblMenuExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("menu");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblMenuExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("menu");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblMenu record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("menu");
        
        if (record.getMenuName() != null) {
            sql.VALUES("menu_name", "#{menuName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuLang() != null) {
            sql.VALUES("menu_lang", "#{menuLang,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuUrl() != null) {
            sql.VALUES("menu_url", "#{menuUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuStatus() != null) {
            sql.VALUES("menu_status", "#{menuStatus,jdbcType=INTEGER}");
        }
        
        if (record.getMenuParentId() != null) {
            sql.VALUES("menu_parent_id", "#{menuParentId,jdbcType=BIGINT}");
        }
        
        if (record.getMenuType() != null) {
            sql.VALUES("menu_type", "#{menuType,jdbcType=INTEGER}");
        }
        
        if (record.getIconcls() != null) {
            sql.VALUES("iconcls", "#{iconcls,jdbcType=VARCHAR}");
        }
        
        if (record.getExpand() != null) {
            sql.VALUES("expand", "#{expand,jdbcType=INTEGER}");
        }
        
        if (record.getSortNo() != null) {
            sql.VALUES("sort_no", "#{sortNo,jdbcType=INTEGER}");
        }
        
        if (record.getIsShow() != null) {
            sql.VALUES("is_show", "#{isShow,jdbcType=INTEGER}");
        }
        
        if (record.getPermission() != null) {
            sql.VALUES("permission", "#{permission,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("created_by", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblMenuExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("menu_id");
        } else {
            sql.SELECT("menu_id");
        }
        sql.SELECT("menu_name");
        sql.SELECT("menu_lang");
        sql.SELECT("menu_url");
        sql.SELECT("menu_status");
        sql.SELECT("menu_parent_id");
        sql.SELECT("menu_type");
        sql.SELECT("iconcls");
        sql.SELECT("expand");
        sql.SELECT("sort_no");
        sql.SELECT("is_show");
        sql.SELECT("permission");
        sql.SELECT("remark");
        sql.SELECT("created_by");
        sql.SELECT("created_at");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("menu");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblMenu record = (TblMenu) parameter.get("record");
        TblMenuExample example = (TblMenuExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("menu");
        
        if (record.getMenuId() != null) {
            sql.SET("menu_id = #{record.menuId,jdbcType=BIGINT}");
        }
        
        if (record.getMenuName() != null) {
            sql.SET("menu_name = #{record.menuName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuLang() != null) {
            sql.SET("menu_lang = #{record.menuLang,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuUrl() != null) {
            sql.SET("menu_url = #{record.menuUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuStatus() != null) {
            sql.SET("menu_status = #{record.menuStatus,jdbcType=INTEGER}");
        }
        
        if (record.getMenuParentId() != null) {
            sql.SET("menu_parent_id = #{record.menuParentId,jdbcType=BIGINT}");
        }
        
        if (record.getMenuType() != null) {
            sql.SET("menu_type = #{record.menuType,jdbcType=INTEGER}");
        }
        
        if (record.getIconcls() != null) {
            sql.SET("iconcls = #{record.iconcls,jdbcType=VARCHAR}");
        }
        
        if (record.getExpand() != null) {
            sql.SET("expand = #{record.expand,jdbcType=INTEGER}");
        }
        
        if (record.getSortNo() != null) {
            sql.SET("sort_no = #{record.sortNo,jdbcType=INTEGER}");
        }
        
        if (record.getIsShow() != null) {
            sql.SET("is_show = #{record.isShow,jdbcType=INTEGER}");
        }
        
        if (record.getPermission() != null) {
            sql.SET("permission = #{record.permission,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("menu");
        
        sql.SET("menu_id = #{record.menuId,jdbcType=BIGINT}");
        sql.SET("menu_name = #{record.menuName,jdbcType=VARCHAR}");
        sql.SET("menu_lang = #{record.menuLang,jdbcType=VARCHAR}");
        sql.SET("menu_url = #{record.menuUrl,jdbcType=VARCHAR}");
        sql.SET("menu_status = #{record.menuStatus,jdbcType=INTEGER}");
        sql.SET("menu_parent_id = #{record.menuParentId,jdbcType=BIGINT}");
        sql.SET("menu_type = #{record.menuType,jdbcType=INTEGER}");
        sql.SET("iconcls = #{record.iconcls,jdbcType=VARCHAR}");
        sql.SET("expand = #{record.expand,jdbcType=INTEGER}");
        sql.SET("sort_no = #{record.sortNo,jdbcType=INTEGER}");
        sql.SET("is_show = #{record.isShow,jdbcType=INTEGER}");
        sql.SET("permission = #{record.permission,jdbcType=VARCHAR}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblMenuExample example = (TblMenuExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblMenu record) {
        SQL sql = new SQL();
        sql.UPDATE("menu");
        
        if (record.getMenuName() != null) {
            sql.SET("menu_name = #{menuName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuLang() != null) {
            sql.SET("menu_lang = #{menuLang,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuUrl() != null) {
            sql.SET("menu_url = #{menuUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuStatus() != null) {
            sql.SET("menu_status = #{menuStatus,jdbcType=INTEGER}");
        }
        
        if (record.getMenuParentId() != null) {
            sql.SET("menu_parent_id = #{menuParentId,jdbcType=BIGINT}");
        }
        
        if (record.getMenuType() != null) {
            sql.SET("menu_type = #{menuType,jdbcType=INTEGER}");
        }
        
        if (record.getIconcls() != null) {
            sql.SET("iconcls = #{iconcls,jdbcType=VARCHAR}");
        }
        
        if (record.getExpand() != null) {
            sql.SET("expand = #{expand,jdbcType=INTEGER}");
        }
        
        if (record.getSortNo() != null) {
            sql.SET("sort_no = #{sortNo,jdbcType=INTEGER}");
        }
        
        if (record.getIsShow() != null) {
            sql.SET("is_show = #{isShow,jdbcType=INTEGER}");
        }
        
        if (record.getPermission() != null) {
            sql.SET("permission = #{permission,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("menu_id = #{menuId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblMenuExample example, boolean includeExamplePhrase) {
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