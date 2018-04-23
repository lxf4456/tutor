package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblGoodsRelation;
import com.education.tutor.db.domain.TblGoodsRelationExample.Criteria;
import com.education.tutor.db.domain.TblGoodsRelationExample.Criterion;
import com.education.tutor.db.domain.TblGoodsRelationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblGoodsRelationSqlProvider {

    public String countByExample(TblGoodsRelationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("goods_relation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblGoodsRelationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("goods_relation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblGoodsRelation record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("goods_relation");
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetType() != null) {
            sql.VALUES("target_type", "#{targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.VALUES("target_pk", "#{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getDelFlag() != null) {
            sql.VALUES("del_flag", "#{delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getSearchCode() != null) {
            sql.VALUES("search_code", "#{searchCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNo() != null) {
            sql.VALUES("project_no", "#{projectNo,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("state", "#{state,jdbcType=INTEGER}");
        }
        
        if (record.getDemandAmount() != null) {
            sql.VALUES("demand_amount", "#{demandAmount,jdbcType=INTEGER}");
        }
        
        if (record.getTranType() != null) {
            sql.VALUES("tran_type", "#{tranType,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectJson() != null) {
            sql.VALUES("project_json", "#{projectJson,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblGoodsRelationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("goods_relation_id");
        } else {
            sql.SELECT("goods_relation_id");
        }
        sql.SELECT("goods_id");
        sql.SELECT("target_type");
        sql.SELECT("target_pk");
        sql.SELECT("del_flag");
        sql.SELECT("search_code");
        sql.SELECT("project_no");
        sql.SELECT("state");
        sql.SELECT("demand_amount");
        sql.SELECT("tran_type");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.SELECT("project_json");
        sql.FROM("goods_relation");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblGoodsRelation record = (TblGoodsRelation) parameter.get("record");
        TblGoodsRelationExample example = (TblGoodsRelationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("goods_relation");
        
        if (record.getGoodsRelationId() != null) {
            sql.SET("goods_relation_id = #{record.goodsRelationId,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{record.goodsId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetType() != null) {
            sql.SET("target_type = #{record.targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getSearchCode() != null) {
            sql.SET("search_code = #{record.searchCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNo() != null) {
            sql.SET("project_no = #{record.projectNo,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.SET("state = #{record.state,jdbcType=INTEGER}");
        }
        
        if (record.getDemandAmount() != null) {
            sql.SET("demand_amount = #{record.demandAmount,jdbcType=INTEGER}");
        }
        
        if (record.getTranType() != null) {
            sql.SET("tran_type = #{record.tranType,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectJson() != null) {
            sql.SET("project_json = #{record.projectJson,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("goods_relation");
        
        sql.SET("goods_relation_id = #{record.goodsRelationId,jdbcType=BIGINT}");
        sql.SET("goods_id = #{record.goodsId,jdbcType=BIGINT}");
        sql.SET("target_type = #{record.targetType,jdbcType=INTEGER}");
        sql.SET("target_pk = #{record.targetPk,jdbcType=BIGINT}");
        sql.SET("del_flag = #{record.delFlag,jdbcType=SMALLINT}");
        sql.SET("search_code = #{record.searchCode,jdbcType=VARCHAR}");
        sql.SET("project_no = #{record.projectNo,jdbcType=VARCHAR}");
        sql.SET("state = #{record.state,jdbcType=INTEGER}");
        sql.SET("demand_amount = #{record.demandAmount,jdbcType=INTEGER}");
        sql.SET("tran_type = #{record.tranType,jdbcType=INTEGER}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("project_json = #{record.projectJson,jdbcType=VARCHAR}");
        
        TblGoodsRelationExample example = (TblGoodsRelationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblGoodsRelation record) {
        SQL sql = new SQL();
        sql.UPDATE("goods_relation");
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{goodsId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetType() != null) {
            sql.SET("target_type = #{targetType,jdbcType=INTEGER}");
        }
        
        if (record.getTargetPk() != null) {
            sql.SET("target_pk = #{targetPk,jdbcType=BIGINT}");
        }
        
        if (record.getDelFlag() != null) {
            sql.SET("del_flag = #{delFlag,jdbcType=SMALLINT}");
        }
        
        if (record.getSearchCode() != null) {
            sql.SET("search_code = #{searchCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectNo() != null) {
            sql.SET("project_no = #{projectNo,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.SET("state = #{state,jdbcType=INTEGER}");
        }
        
        if (record.getDemandAmount() != null) {
            sql.SET("demand_amount = #{demandAmount,jdbcType=INTEGER}");
        }
        
        if (record.getTranType() != null) {
            sql.SET("tran_type = #{tranType,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectJson() != null) {
            sql.SET("project_json = #{projectJson,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("goods_relation_id = #{goodsRelationId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblGoodsRelationExample example, boolean includeExamplePhrase) {
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