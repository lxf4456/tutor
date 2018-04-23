package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblTopicComplain;
import com.education.tutor.db.domain.TblTopicComplainExample.Criteria;
import com.education.tutor.db.domain.TblTopicComplainExample.Criterion;
import com.education.tutor.db.domain.TblTopicComplainExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblTopicComplainSqlProvider {

    public String countByExample(TblTopicComplainExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("topic_complain");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblTopicComplainExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("topic_complain");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblTopicComplain record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("topic_complain");
        
        if (record.getCoType() != null) {
            sql.VALUES("co_type", "#{coType,jdbcType=INTEGER}");
        }
        
        if (record.getCoSourceid() != null) {
            sql.VALUES("co_sourceid", "#{coSourceid,jdbcType=BIGINT}");
        }
        
        if (record.getCreateat() != null) {
            sql.VALUES("createat", "#{createat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateby() != null) {
            sql.VALUES("createby", "#{createby,jdbcType=VARCHAR}");
        }
        
        if (record.getIsSolve() != null) {
            sql.VALUES("is_solve", "#{isSolve,jdbcType=INTEGER}");
        }
        
        if (record.getCoContent() != null) {
            sql.VALUES("co_content", "#{coContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSoContent() != null) {
            sql.VALUES("so_content", "#{soContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSoUser() != null) {
            sql.VALUES("so_user", "#{soUser,jdbcType=VARCHAR}");
        }
        
        if (record.getCoUser() != null) {
            sql.VALUES("co_user", "#{coUser,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblTopicComplainExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("co_id");
        } else {
            sql.SELECT("co_id");
        }
        sql.SELECT("co_type");
        sql.SELECT("co_sourceid");
        sql.SELECT("createat");
        sql.SELECT("createby");
        sql.SELECT("is_solve");
        sql.SELECT("co_content");
        sql.SELECT("so_content");
        sql.SELECT("so_user");
        sql.SELECT("co_user");
        sql.FROM("topic_complain");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblTopicComplain record = (TblTopicComplain) parameter.get("record");
        TblTopicComplainExample example = (TblTopicComplainExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("topic_complain");
        
        if (record.getCoId() != null) {
            sql.SET("co_id = #{record.coId,jdbcType=BIGINT}");
        }
        
        if (record.getCoType() != null) {
            sql.SET("co_type = #{record.coType,jdbcType=INTEGER}");
        }
        
        if (record.getCoSourceid() != null) {
            sql.SET("co_sourceid = #{record.coSourceid,jdbcType=BIGINT}");
        }
        
        if (record.getCreateat() != null) {
            sql.SET("createat = #{record.createat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateby() != null) {
            sql.SET("createby = #{record.createby,jdbcType=VARCHAR}");
        }
        
        if (record.getIsSolve() != null) {
            sql.SET("is_solve = #{record.isSolve,jdbcType=INTEGER}");
        }
        
        if (record.getCoContent() != null) {
            sql.SET("co_content = #{record.coContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSoContent() != null) {
            sql.SET("so_content = #{record.soContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSoUser() != null) {
            sql.SET("so_user = #{record.soUser,jdbcType=VARCHAR}");
        }
        
        if (record.getCoUser() != null) {
            sql.SET("co_user = #{record.coUser,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("topic_complain");
        
        sql.SET("co_id = #{record.coId,jdbcType=BIGINT}");
        sql.SET("co_type = #{record.coType,jdbcType=INTEGER}");
        sql.SET("co_sourceid = #{record.coSourceid,jdbcType=BIGINT}");
        sql.SET("createat = #{record.createat,jdbcType=TIMESTAMP}");
        sql.SET("createby = #{record.createby,jdbcType=VARCHAR}");
        sql.SET("is_solve = #{record.isSolve,jdbcType=INTEGER}");
        sql.SET("co_content = #{record.coContent,jdbcType=VARCHAR}");
        sql.SET("so_content = #{record.soContent,jdbcType=VARCHAR}");
        sql.SET("so_user = #{record.soUser,jdbcType=VARCHAR}");
        sql.SET("co_user = #{record.coUser,jdbcType=VARCHAR}");
        
        TblTopicComplainExample example = (TblTopicComplainExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblTopicComplain record) {
        SQL sql = new SQL();
        sql.UPDATE("topic_complain");
        
        if (record.getCoType() != null) {
            sql.SET("co_type = #{coType,jdbcType=INTEGER}");
        }
        
        if (record.getCoSourceid() != null) {
            sql.SET("co_sourceid = #{coSourceid,jdbcType=BIGINT}");
        }
        
        if (record.getCreateat() != null) {
            sql.SET("createat = #{createat,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateby() != null) {
            sql.SET("createby = #{createby,jdbcType=VARCHAR}");
        }
        
        if (record.getIsSolve() != null) {
            sql.SET("is_solve = #{isSolve,jdbcType=INTEGER}");
        }
        
        if (record.getCoContent() != null) {
            sql.SET("co_content = #{coContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSoContent() != null) {
            sql.SET("so_content = #{soContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSoUser() != null) {
            sql.SET("so_user = #{soUser,jdbcType=VARCHAR}");
        }
        
        if (record.getCoUser() != null) {
            sql.SET("co_user = #{coUser,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("co_id = #{coId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblTopicComplainExample example, boolean includeExamplePhrase) {
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