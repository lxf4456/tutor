package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblDataRegion;
import com.education.tutor.db.domain.TblDataRegionExample.Criteria;
import com.education.tutor.db.domain.TblDataRegionExample.Criterion;
import com.education.tutor.db.domain.TblDataRegionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblDataRegionSqlProvider {

    public String countByExample(TblDataRegionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("data_region");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblDataRegionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("data_region");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblDataRegion record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("data_region");
        
        if (record.getPid() != null) {
            sql.VALUES("pid", "#{pid,jdbcType=INTEGER}");
        }
        
        if (record.getPath() != null) {
            sql.VALUES("path", "#{path,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.VALUES("level", "#{level,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getNameEn() != null) {
            sql.VALUES("name_en", "#{nameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getNamePinyin() != null) {
            sql.VALUES("name_pinyin", "#{namePinyin,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerRegion() != null) {
            sql.VALUES("owner_region", "#{ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getNameRu() != null) {
            sql.VALUES("name_ru", "#{nameRu,jdbcType=VARCHAR}");
        }
        
        if (record.getLocation() != null) {
            sql.VALUES("location", "#{location,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNum() != null) {
            sql.VALUES("project_num", "#{projectNum,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblDataRegionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("pid");
        sql.SELECT("path");
        sql.SELECT("level");
        sql.SELECT("name");
        sql.SELECT("name_en");
        sql.SELECT("name_pinyin");
        sql.SELECT("code");
        sql.SELECT("owner_region");
        sql.SELECT("name_ru");
        sql.SELECT("location");
        sql.SELECT("project_num");
        sql.FROM("data_region");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblDataRegion record = (TblDataRegion) parameter.get("record");
        TblDataRegionExample example = (TblDataRegionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("data_region");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getPid() != null) {
            sql.SET("pid = #{record.pid,jdbcType=INTEGER}");
        }
        
        if (record.getPath() != null) {
            sql.SET("path = #{record.path,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("level = #{record.level,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getNameEn() != null) {
            sql.SET("name_en = #{record.nameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getNamePinyin() != null) {
            sql.SET("name_pinyin = #{record.namePinyin,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerRegion() != null) {
            sql.SET("owner_region = #{record.ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getNameRu() != null) {
            sql.SET("name_ru = #{record.nameRu,jdbcType=VARCHAR}");
        }
        
        if (record.getLocation() != null) {
            sql.SET("location = #{record.location,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNum() != null) {
            sql.SET("project_num = #{record.projectNum,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("data_region");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("pid = #{record.pid,jdbcType=INTEGER}");
        sql.SET("path = #{record.path,jdbcType=VARCHAR}");
        sql.SET("level = #{record.level,jdbcType=INTEGER}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("name_en = #{record.nameEn,jdbcType=VARCHAR}");
        sql.SET("name_pinyin = #{record.namePinyin,jdbcType=VARCHAR}");
        sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        sql.SET("owner_region = #{record.ownerRegion,jdbcType=VARCHAR}");
        sql.SET("name_ru = #{record.nameRu,jdbcType=VARCHAR}");
        sql.SET("location = #{record.location,jdbcType=VARCHAR}");
        sql.SET("project_num = #{record.projectNum,jdbcType=VARCHAR}");
        
        TblDataRegionExample example = (TblDataRegionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblDataRegion record) {
        SQL sql = new SQL();
        sql.UPDATE("data_region");
        
        if (record.getPid() != null) {
            sql.SET("pid = #{pid,jdbcType=INTEGER}");
        }
        
        if (record.getPath() != null) {
            sql.SET("path = #{path,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("level = #{level,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getNameEn() != null) {
            sql.SET("name_en = #{nameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getNamePinyin() != null) {
            sql.SET("name_pinyin = #{namePinyin,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerRegion() != null) {
            sql.SET("owner_region = #{ownerRegion,jdbcType=VARCHAR}");
        }
        
        if (record.getNameRu() != null) {
            sql.SET("name_ru = #{nameRu,jdbcType=VARCHAR}");
        }
        
        if (record.getLocation() != null) {
            sql.SET("location = #{location,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNum() != null) {
            sql.SET("project_num = #{projectNum,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblDataRegionExample example, boolean includeExamplePhrase) {
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