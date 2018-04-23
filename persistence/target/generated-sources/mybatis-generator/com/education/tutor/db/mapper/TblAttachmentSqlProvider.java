package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAttachment;
import com.education.tutor.db.domain.TblAttachmentExample.Criteria;
import com.education.tutor.db.domain.TblAttachmentExample.Criterion;
import com.education.tutor.db.domain.TblAttachmentExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblAttachmentSqlProvider {

    public String countByExample(TblAttachmentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("attachment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblAttachmentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("attachment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblAttachment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("attachment");
        
        if (record.getAttachmentType() != null) {
            sql.VALUES("attachment_type", "#{attachmentType,jdbcType=INTEGER}");
        }
        
        if (record.getOriginalFilename() != null) {
            sql.VALUES("original_filename", "#{originalFilename,jdbcType=VARCHAR}");
        }
        
        if (record.getAttachmentState() != null) {
            sql.VALUES("attachment_state", "#{attachmentState,jdbcType=INTEGER}");
        }
        
        if (record.getMimeType() != null) {
            sql.VALUES("mime_type", "#{mimeType,jdbcType=VARCHAR}");
        }
        
        if (record.getUriRelativel() != null) {
            sql.VALUES("uri_relativel", "#{uriRelativel,jdbcType=VARCHAR}");
        }
        
        if (record.getUriSite() != null) {
            sql.VALUES("uri_site", "#{uriSite,jdbcType=VARCHAR}");
        }
        
        if (record.getSize() != null) {
            sql.VALUES("size", "#{size,jdbcType=BIGINT}");
        }
        
        if (record.getMetaInfo() != null) {
            sql.VALUES("meta_info", "#{metaInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerType() != null) {
            sql.VALUES("owner_type", "#{ownerType,jdbcType=INTEGER}");
        }
        
        if (record.getOwnerPk() != null) {
            sql.VALUES("owner_pk", "#{ownerPk,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblAttachmentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("attachment_id");
        } else {
            sql.SELECT("attachment_id");
        }
        sql.SELECT("attachment_type");
        sql.SELECT("original_filename");
        sql.SELECT("attachment_state");
        sql.SELECT("mime_type");
        sql.SELECT("uri_relativel");
        sql.SELECT("uri_site");
        sql.SELECT("size");
        sql.SELECT("meta_info");
        sql.SELECT("owner_type");
        sql.SELECT("owner_pk");
        sql.SELECT("updated_by");
        sql.SELECT("updated_at");
        sql.FROM("attachment");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblAttachment record = (TblAttachment) parameter.get("record");
        TblAttachmentExample example = (TblAttachmentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("attachment");
        
        if (record.getAttachmentId() != null) {
            sql.SET("attachment_id = #{record.attachmentId,jdbcType=BIGINT}");
        }
        
        if (record.getAttachmentType() != null) {
            sql.SET("attachment_type = #{record.attachmentType,jdbcType=INTEGER}");
        }
        
        if (record.getOriginalFilename() != null) {
            sql.SET("original_filename = #{record.originalFilename,jdbcType=VARCHAR}");
        }
        
        if (record.getAttachmentState() != null) {
            sql.SET("attachment_state = #{record.attachmentState,jdbcType=INTEGER}");
        }
        
        if (record.getMimeType() != null) {
            sql.SET("mime_type = #{record.mimeType,jdbcType=VARCHAR}");
        }
        
        if (record.getUriRelativel() != null) {
            sql.SET("uri_relativel = #{record.uriRelativel,jdbcType=VARCHAR}");
        }
        
        if (record.getUriSite() != null) {
            sql.SET("uri_site = #{record.uriSite,jdbcType=VARCHAR}");
        }
        
        if (record.getSize() != null) {
            sql.SET("size = #{record.size,jdbcType=BIGINT}");
        }
        
        if (record.getMetaInfo() != null) {
            sql.SET("meta_info = #{record.metaInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerType() != null) {
            sql.SET("owner_type = #{record.ownerType,jdbcType=INTEGER}");
        }
        
        if (record.getOwnerPk() != null) {
            sql.SET("owner_pk = #{record.ownerPk,jdbcType=BIGINT}");
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
        sql.UPDATE("attachment");
        
        sql.SET("attachment_id = #{record.attachmentId,jdbcType=BIGINT}");
        sql.SET("attachment_type = #{record.attachmentType,jdbcType=INTEGER}");
        sql.SET("original_filename = #{record.originalFilename,jdbcType=VARCHAR}");
        sql.SET("attachment_state = #{record.attachmentState,jdbcType=INTEGER}");
        sql.SET("mime_type = #{record.mimeType,jdbcType=VARCHAR}");
        sql.SET("uri_relativel = #{record.uriRelativel,jdbcType=VARCHAR}");
        sql.SET("uri_site = #{record.uriSite,jdbcType=VARCHAR}");
        sql.SET("size = #{record.size,jdbcType=BIGINT}");
        sql.SET("meta_info = #{record.metaInfo,jdbcType=VARCHAR}");
        sql.SET("owner_type = #{record.ownerType,jdbcType=INTEGER}");
        sql.SET("owner_pk = #{record.ownerPk,jdbcType=BIGINT}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        TblAttachmentExample example = (TblAttachmentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblAttachment record) {
        SQL sql = new SQL();
        sql.UPDATE("attachment");
        
        if (record.getAttachmentType() != null) {
            sql.SET("attachment_type = #{attachmentType,jdbcType=INTEGER}");
        }
        
        if (record.getOriginalFilename() != null) {
            sql.SET("original_filename = #{originalFilename,jdbcType=VARCHAR}");
        }
        
        if (record.getAttachmentState() != null) {
            sql.SET("attachment_state = #{attachmentState,jdbcType=INTEGER}");
        }
        
        if (record.getMimeType() != null) {
            sql.SET("mime_type = #{mimeType,jdbcType=VARCHAR}");
        }
        
        if (record.getUriRelativel() != null) {
            sql.SET("uri_relativel = #{uriRelativel,jdbcType=VARCHAR}");
        }
        
        if (record.getUriSite() != null) {
            sql.SET("uri_site = #{uriSite,jdbcType=VARCHAR}");
        }
        
        if (record.getSize() != null) {
            sql.SET("size = #{size,jdbcType=BIGINT}");
        }
        
        if (record.getMetaInfo() != null) {
            sql.SET("meta_info = #{metaInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerType() != null) {
            sql.SET("owner_type = #{ownerType,jdbcType=INTEGER}");
        }
        
        if (record.getOwnerPk() != null) {
            sql.SET("owner_pk = #{ownerPk,jdbcType=BIGINT}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("attachment_id = #{attachmentId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblAttachmentExample example, boolean includeExamplePhrase) {
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