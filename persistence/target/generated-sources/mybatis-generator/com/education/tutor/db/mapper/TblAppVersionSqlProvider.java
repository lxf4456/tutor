package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblAppVersion;
import com.education.tutor.db.domain.TblAppVersionExample.Criteria;
import com.education.tutor.db.domain.TblAppVersionExample.Criterion;
import com.education.tutor.db.domain.TblAppVersionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblAppVersionSqlProvider {

    public String countByExample(TblAppVersionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("app_version");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblAppVersionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("app_version");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblAppVersion record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("app_version");
        
        if (record.getAppName() != null) {
            sql.VALUES("app_name", "#{appName,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionNo() != null) {
            sql.VALUES("app_version_no", "#{appVersionNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionTag() != null) {
            sql.VALUES("app_version_tag", "#{appVersionTag,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDesc() != null) {
            sql.VALUES("app_version_desc", "#{appVersionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidOsNo() != null) {
            sql.VALUES("app_android_os_no", "#{appAndroidOsNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosOsNo() != null) {
            sql.VALUES("app_ios_os_no", "#{appIosOsNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidReleaseNote() != null) {
            sql.VALUES("app_android_release_note", "#{appAndroidReleaseNote,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosReleaseNote() != null) {
            sql.VALUES("app_ios_release_note", "#{appIosReleaseNote,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidReq() != null) {
            sql.VALUES("app_android_req", "#{appAndroidReq,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosReq() != null) {
            sql.VALUES("app_ios_req", "#{appIosReq,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidUrl() != null) {
            sql.VALUES("app_android_url", "#{appAndroidUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosUrl() != null) {
            sql.VALUES("app_ios_url", "#{appIosUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getAndroidForceUpdate() != null) {
            sql.VALUES("android_force_update", "#{androidForceUpdate,jdbcType=SMALLINT}");
        }
        
        if (record.getIosForceUpdate() != null) {
            sql.VALUES("ios_force_update", "#{iosForceUpdate,jdbcType=SMALLINT}");
        }
        
        if (record.getAppVersionDescZh() != null) {
            sql.VALUES("app_version_desc_zh", "#{appVersionDescZh,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescRu() != null) {
            sql.VALUES("app_version_desc_ru", "#{appVersionDescRu,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescSp() != null) {
            sql.VALUES("app_version_desc_sp", "#{appVersionDescSp,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescFr() != null) {
            sql.VALUES("app_version_desc_fr", "#{appVersionDescFr,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblAppVersionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("app_version_id");
        } else {
            sql.SELECT("app_version_id");
        }
        sql.SELECT("app_name");
        sql.SELECT("app_version_no");
        sql.SELECT("app_version_tag");
        sql.SELECT("app_version_desc");
        sql.SELECT("app_android_os_no");
        sql.SELECT("app_ios_os_no");
        sql.SELECT("app_android_release_note");
        sql.SELECT("app_ios_release_note");
        sql.SELECT("app_android_req");
        sql.SELECT("app_ios_req");
        sql.SELECT("app_android_url");
        sql.SELECT("app_ios_url");
        sql.SELECT("android_force_update");
        sql.SELECT("ios_force_update");
        sql.SELECT("app_version_desc_zh");
        sql.SELECT("app_version_desc_ru");
        sql.SELECT("app_version_desc_sp");
        sql.SELECT("app_version_desc_fr");
        sql.FROM("app_version");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblAppVersion record = (TblAppVersion) parameter.get("record");
        TblAppVersionExample example = (TblAppVersionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("app_version");
        
        if (record.getAppVersionId() != null) {
            sql.SET("app_version_id = #{record.appVersionId,jdbcType=BIGINT}");
        }
        
        if (record.getAppName() != null) {
            sql.SET("app_name = #{record.appName,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionNo() != null) {
            sql.SET("app_version_no = #{record.appVersionNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionTag() != null) {
            sql.SET("app_version_tag = #{record.appVersionTag,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDesc() != null) {
            sql.SET("app_version_desc = #{record.appVersionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidOsNo() != null) {
            sql.SET("app_android_os_no = #{record.appAndroidOsNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosOsNo() != null) {
            sql.SET("app_ios_os_no = #{record.appIosOsNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidReleaseNote() != null) {
            sql.SET("app_android_release_note = #{record.appAndroidReleaseNote,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosReleaseNote() != null) {
            sql.SET("app_ios_release_note = #{record.appIosReleaseNote,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidReq() != null) {
            sql.SET("app_android_req = #{record.appAndroidReq,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosReq() != null) {
            sql.SET("app_ios_req = #{record.appIosReq,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidUrl() != null) {
            sql.SET("app_android_url = #{record.appAndroidUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosUrl() != null) {
            sql.SET("app_ios_url = #{record.appIosUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getAndroidForceUpdate() != null) {
            sql.SET("android_force_update = #{record.androidForceUpdate,jdbcType=SMALLINT}");
        }
        
        if (record.getIosForceUpdate() != null) {
            sql.SET("ios_force_update = #{record.iosForceUpdate,jdbcType=SMALLINT}");
        }
        
        if (record.getAppVersionDescZh() != null) {
            sql.SET("app_version_desc_zh = #{record.appVersionDescZh,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescRu() != null) {
            sql.SET("app_version_desc_ru = #{record.appVersionDescRu,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescSp() != null) {
            sql.SET("app_version_desc_sp = #{record.appVersionDescSp,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescFr() != null) {
            sql.SET("app_version_desc_fr = #{record.appVersionDescFr,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("app_version");
        
        sql.SET("app_version_id = #{record.appVersionId,jdbcType=BIGINT}");
        sql.SET("app_name = #{record.appName,jdbcType=VARCHAR}");
        sql.SET("app_version_no = #{record.appVersionNo,jdbcType=VARCHAR}");
        sql.SET("app_version_tag = #{record.appVersionTag,jdbcType=VARCHAR}");
        sql.SET("app_version_desc = #{record.appVersionDesc,jdbcType=VARCHAR}");
        sql.SET("app_android_os_no = #{record.appAndroidOsNo,jdbcType=VARCHAR}");
        sql.SET("app_ios_os_no = #{record.appIosOsNo,jdbcType=VARCHAR}");
        sql.SET("app_android_release_note = #{record.appAndroidReleaseNote,jdbcType=VARCHAR}");
        sql.SET("app_ios_release_note = #{record.appIosReleaseNote,jdbcType=VARCHAR}");
        sql.SET("app_android_req = #{record.appAndroidReq,jdbcType=VARCHAR}");
        sql.SET("app_ios_req = #{record.appIosReq,jdbcType=VARCHAR}");
        sql.SET("app_android_url = #{record.appAndroidUrl,jdbcType=VARCHAR}");
        sql.SET("app_ios_url = #{record.appIosUrl,jdbcType=VARCHAR}");
        sql.SET("android_force_update = #{record.androidForceUpdate,jdbcType=SMALLINT}");
        sql.SET("ios_force_update = #{record.iosForceUpdate,jdbcType=SMALLINT}");
        sql.SET("app_version_desc_zh = #{record.appVersionDescZh,jdbcType=VARCHAR}");
        sql.SET("app_version_desc_ru = #{record.appVersionDescRu,jdbcType=VARCHAR}");
        sql.SET("app_version_desc_sp = #{record.appVersionDescSp,jdbcType=VARCHAR}");
        sql.SET("app_version_desc_fr = #{record.appVersionDescFr,jdbcType=VARCHAR}");
        
        TblAppVersionExample example = (TblAppVersionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblAppVersion record) {
        SQL sql = new SQL();
        sql.UPDATE("app_version");
        
        if (record.getAppName() != null) {
            sql.SET("app_name = #{appName,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionNo() != null) {
            sql.SET("app_version_no = #{appVersionNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionTag() != null) {
            sql.SET("app_version_tag = #{appVersionTag,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDesc() != null) {
            sql.SET("app_version_desc = #{appVersionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidOsNo() != null) {
            sql.SET("app_android_os_no = #{appAndroidOsNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosOsNo() != null) {
            sql.SET("app_ios_os_no = #{appIosOsNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidReleaseNote() != null) {
            sql.SET("app_android_release_note = #{appAndroidReleaseNote,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosReleaseNote() != null) {
            sql.SET("app_ios_release_note = #{appIosReleaseNote,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidReq() != null) {
            sql.SET("app_android_req = #{appAndroidReq,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosReq() != null) {
            sql.SET("app_ios_req = #{appIosReq,jdbcType=VARCHAR}");
        }
        
        if (record.getAppAndroidUrl() != null) {
            sql.SET("app_android_url = #{appAndroidUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getAppIosUrl() != null) {
            sql.SET("app_ios_url = #{appIosUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getAndroidForceUpdate() != null) {
            sql.SET("android_force_update = #{androidForceUpdate,jdbcType=SMALLINT}");
        }
        
        if (record.getIosForceUpdate() != null) {
            sql.SET("ios_force_update = #{iosForceUpdate,jdbcType=SMALLINT}");
        }
        
        if (record.getAppVersionDescZh() != null) {
            sql.SET("app_version_desc_zh = #{appVersionDescZh,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescRu() != null) {
            sql.SET("app_version_desc_ru = #{appVersionDescRu,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescSp() != null) {
            sql.SET("app_version_desc_sp = #{appVersionDescSp,jdbcType=VARCHAR}");
        }
        
        if (record.getAppVersionDescFr() != null) {
            sql.SET("app_version_desc_fr = #{appVersionDescFr,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("app_version_id = #{appVersionId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblAppVersionExample example, boolean includeExamplePhrase) {
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