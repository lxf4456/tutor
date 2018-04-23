package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserMain;
import com.education.tutor.db.domain.TblUserMainExample.Criteria;
import com.education.tutor.db.domain.TblUserMainExample.Criterion;
import com.education.tutor.db.domain.TblUserMainExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TblUserMainSqlProvider {

    public String countByExample(TblUserMainExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_main");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TblUserMainExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_main");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TblUserMain record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_main");
        
        if (record.getAuthId() != null) {
            sql.VALUES("auth_id", "#{authId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialUid() != null) {
            sql.VALUES("social_uid", "#{socialUid,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialToken() != null) {
            sql.VALUES("social_token", "#{socialToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLevel() != null) {
            sql.VALUES("user_level", "#{userLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUserTag() != null) {
            sql.VALUES("user_tag", "#{userTag,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLang() != null) {
            sql.VALUES("user_lang", "#{userLang,jdbcType=SMALLINT}");
        }
        
        if (record.getFamilyName() != null) {
            sql.VALUES("family_name", "#{familyName,jdbcType=VARCHAR}");
        }
        
        if (record.getGivenName() != null) {
            sql.VALUES("given_name", "#{givenName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuArray() != null) {
            sql.VALUES("menu_array", "#{menuArray,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            sql.VALUES("nick_name", "#{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyType() != null) {
            sql.VALUES("verify_type", "#{verifyType,jdbcType=SMALLINT}");
        }
        
        if (record.getVerifyDesc() != null) {
            sql.VALUES("verify_desc", "#{verifyDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            sql.VALUES("country_code", "#{countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getGovtIdType() != null) {
            sql.VALUES("govt_id_type", "#{govtIdType,jdbcType=SMALLINT}");
        }
        
        if (record.getGovtIdNo() != null) {
            sql.VALUES("govt_id_no", "#{govtIdNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUuid() != null) {
            sql.VALUES("uuid", "#{uuid,jdbcType=VARCHAR}");
        }
        
        if (record.getImcloneToken() != null) {
            sql.VALUES("imclone_token", "#{imcloneToken,jdbcType=VARCHAR}");
        }
        
        if (record.getPushToken() != null) {
            sql.VALUES("push_token", "#{pushToken,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.VALUES("gender", "#{gender,jdbcType=SMALLINT}");
        }
        
        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialSource() != null) {
            sql.VALUES("social_source", "#{socialSource,jdbcType=VARCHAR}");
        }
        
        if (record.getOrganization() != null) {
            sql.VALUES("organization", "#{organization,jdbcType=VARCHAR}");
        }
        
        if (record.getProfession() != null) {
            sql.VALUES("profession", "#{profession,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthDate() != null) {
            sql.VALUES("birth_date", "#{birthDate,jdbcType=DATE}");
        }
        
        if (record.getHighestEducation() != null) {
            sql.VALUES("highest_education", "#{highestEducation,jdbcType=SMALLINT}");
        }
        
        if (record.getCollegeName() != null) {
            sql.VALUES("college_name", "#{collegeName,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            sql.VALUES("avatar", "#{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getLocationLng() != null) {
            sql.VALUES("location_lng", "#{locationLng,jdbcType=DOUBLE}");
        }
        
        if (record.getLocationLat() != null) {
            sql.VALUES("location_lat", "#{locationLat,jdbcType=DOUBLE}");
        }
        
        if (record.getNationality() != null) {
            sql.VALUES("nationality", "#{nationality,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingCountry() != null) {
            sql.VALUES("living_country", "#{livingCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingProvince() != null) {
            sql.VALUES("living_province", "#{livingProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingCity() != null) {
            sql.VALUES("living_city", "#{livingCity,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingArea() != null) {
            sql.VALUES("living_area", "#{livingArea,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingStreet() != null) {
            sql.VALUES("living_street", "#{livingStreet,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeAddress() != null) {
            sql.VALUES("home_address", "#{homeAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getLastLoginTime() != null) {
            sql.VALUES("last_login_time", "#{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLoginIp() != null) {
            sql.VALUES("last_login_ip", "#{lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginDevice() != null) {
            sql.VALUES("last_login_device", "#{lastLoginDevice,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommandBy() != null) {
            sql.VALUES("recommand_by", "#{recommandBy,jdbcType=VARCHAR}");
        }
        
        if (record.getProfile() != null) {
            sql.VALUES("profile", "#{profile,jdbcType=VARCHAR}");
        }
        
        if (record.getReportLine() != null) {
            sql.VALUES("report_line", "#{reportLine,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.VALUES("enabled", "#{enabled,jdbcType=SMALLINT}");
        }
        
        if (record.getOrgPk() != null) {
            sql.VALUES("org_pk", "#{orgPk,jdbcType=BIGINT}");
        }
        
        if (record.getEmployeeNo() != null) {
            sql.VALUES("employee_no", "#{employeeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerNo() != null) {
            sql.VALUES("partner_no", "#{partnerNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerLevel() != null) {
            sql.VALUES("partner_level", "#{partnerLevel,jdbcType=INTEGER}");
        }
        
        if (record.getPartnerType() != null) {
            sql.VALUES("partner_type", "#{partnerType,jdbcType=INTEGER}");
        }
        
        if (record.getBindNo1() != null) {
            sql.VALUES("bind_no1", "#{bindNo1,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo2() != null) {
            sql.VALUES("bind_no2", "#{bindNo2,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo3() != null) {
            sql.VALUES("bind_no3", "#{bindNo3,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo4() != null) {
            sql.VALUES("bind_no4", "#{bindNo4,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo5() != null) {
            sql.VALUES("bind_no5", "#{bindNo5,jdbcType=VARCHAR}");
        }
        
        if (record.getReceivedReword() != null) {
            sql.VALUES("received_reword", "#{receivedReword,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TblUserMainExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("user_main_id");
        } else {
            sql.SELECT("user_main_id");
        }
        sql.SELECT("auth_id");
        sql.SELECT("social_uid");
        sql.SELECT("social_token");
        sql.SELECT("username");
        sql.SELECT("user_level");
        sql.SELECT("user_tag");
        sql.SELECT("user_lang");
        sql.SELECT("family_name");
        sql.SELECT("given_name");
        sql.SELECT("menu_array");
        sql.SELECT("password");
        sql.SELECT("nick_name");
        sql.SELECT("verify_type");
        sql.SELECT("verify_desc");
        sql.SELECT("email");
        sql.SELECT("country_code");
        sql.SELECT("mobile");
        sql.SELECT("govt_id_type");
        sql.SELECT("govt_id_no");
        sql.SELECT("uuid");
        sql.SELECT("imclone_token");
        sql.SELECT("push_token");
        sql.SELECT("gender");
        sql.SELECT("source");
        sql.SELECT("social_source");
        sql.SELECT("organization");
        sql.SELECT("profession");
        sql.SELECT("birth_date");
        sql.SELECT("highest_education");
        sql.SELECT("college_name");
        sql.SELECT("avatar");
        sql.SELECT("location_lng");
        sql.SELECT("location_lat");
        sql.SELECT("nationality");
        sql.SELECT("living_country");
        sql.SELECT("living_province");
        sql.SELECT("living_city");
        sql.SELECT("living_area");
        sql.SELECT("living_street");
        sql.SELECT("home_address");
        sql.SELECT("status");
        sql.SELECT("last_login_time");
        sql.SELECT("last_login_ip");
        sql.SELECT("last_login_device");
        sql.SELECT("recommand_by");
        sql.SELECT("profile");
        sql.SELECT("report_line");
        sql.SELECT("enabled");
        sql.SELECT("org_pk");
        sql.SELECT("employee_no");
        sql.SELECT("partner_no");
        sql.SELECT("partner_level");
        sql.SELECT("partner_type");
        sql.SELECT("bind_no1");
        sql.SELECT("bind_no2");
        sql.SELECT("bind_no3");
        sql.SELECT("bind_no4");
        sql.SELECT("bind_no5");
        sql.SELECT("received_reword");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("updated_by");
        sql.FROM("user_main");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TblUserMain record = (TblUserMain) parameter.get("record");
        TblUserMainExample example = (TblUserMainExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_main");
        
        if (record.getUserMainId() != null) {
            sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        }
        
        if (record.getAuthId() != null) {
            sql.SET("auth_id = #{record.authId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialUid() != null) {
            sql.SET("social_uid = #{record.socialUid,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialToken() != null) {
            sql.SET("social_token = #{record.socialToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLevel() != null) {
            sql.SET("user_level = #{record.userLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUserTag() != null) {
            sql.SET("user_tag = #{record.userTag,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLang() != null) {
            sql.SET("user_lang = #{record.userLang,jdbcType=SMALLINT}");
        }
        
        if (record.getFamilyName() != null) {
            sql.SET("family_name = #{record.familyName,jdbcType=VARCHAR}");
        }
        
        if (record.getGivenName() != null) {
            sql.SET("given_name = #{record.givenName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuArray() != null) {
            sql.SET("menu_array = #{record.menuArray,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            sql.SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyType() != null) {
            sql.SET("verify_type = #{record.verifyType,jdbcType=SMALLINT}");
        }
        
        if (record.getVerifyDesc() != null) {
            sql.SET("verify_desc = #{record.verifyDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            sql.SET("country_code = #{record.countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getGovtIdType() != null) {
            sql.SET("govt_id_type = #{record.govtIdType,jdbcType=SMALLINT}");
        }
        
        if (record.getGovtIdNo() != null) {
            sql.SET("govt_id_no = #{record.govtIdNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUuid() != null) {
            sql.SET("uuid = #{record.uuid,jdbcType=VARCHAR}");
        }
        
        if (record.getImcloneToken() != null) {
            sql.SET("imclone_token = #{record.imcloneToken,jdbcType=VARCHAR}");
        }
        
        if (record.getPushToken() != null) {
            sql.SET("push_token = #{record.pushToken,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{record.gender,jdbcType=SMALLINT}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{record.source,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialSource() != null) {
            sql.SET("social_source = #{record.socialSource,jdbcType=VARCHAR}");
        }
        
        if (record.getOrganization() != null) {
            sql.SET("organization = #{record.organization,jdbcType=VARCHAR}");
        }
        
        if (record.getProfession() != null) {
            sql.SET("profession = #{record.profession,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthDate() != null) {
            sql.SET("birth_date = #{record.birthDate,jdbcType=DATE}");
        }
        
        if (record.getHighestEducation() != null) {
            sql.SET("highest_education = #{record.highestEducation,jdbcType=SMALLINT}");
        }
        
        if (record.getCollegeName() != null) {
            sql.SET("college_name = #{record.collegeName,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            sql.SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getLocationLng() != null) {
            sql.SET("location_lng = #{record.locationLng,jdbcType=DOUBLE}");
        }
        
        if (record.getLocationLat() != null) {
            sql.SET("location_lat = #{record.locationLat,jdbcType=DOUBLE}");
        }
        
        if (record.getNationality() != null) {
            sql.SET("nationality = #{record.nationality,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingCountry() != null) {
            sql.SET("living_country = #{record.livingCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingProvince() != null) {
            sql.SET("living_province = #{record.livingProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingCity() != null) {
            sql.SET("living_city = #{record.livingCity,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingArea() != null) {
            sql.SET("living_area = #{record.livingArea,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingStreet() != null) {
            sql.SET("living_street = #{record.livingStreet,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeAddress() != null) {
            sql.SET("home_address = #{record.homeAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getLastLoginTime() != null) {
            sql.SET("last_login_time = #{record.lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLoginIp() != null) {
            sql.SET("last_login_ip = #{record.lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginDevice() != null) {
            sql.SET("last_login_device = #{record.lastLoginDevice,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommandBy() != null) {
            sql.SET("recommand_by = #{record.recommandBy,jdbcType=VARCHAR}");
        }
        
        if (record.getProfile() != null) {
            sql.SET("profile = #{record.profile,jdbcType=VARCHAR}");
        }
        
        if (record.getReportLine() != null) {
            sql.SET("report_line = #{record.reportLine,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.SET("enabled = #{record.enabled,jdbcType=SMALLINT}");
        }
        
        if (record.getOrgPk() != null) {
            sql.SET("org_pk = #{record.orgPk,jdbcType=BIGINT}");
        }
        
        if (record.getEmployeeNo() != null) {
            sql.SET("employee_no = #{record.employeeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerNo() != null) {
            sql.SET("partner_no = #{record.partnerNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerLevel() != null) {
            sql.SET("partner_level = #{record.partnerLevel,jdbcType=INTEGER}");
        }
        
        if (record.getPartnerType() != null) {
            sql.SET("partner_type = #{record.partnerType,jdbcType=INTEGER}");
        }
        
        if (record.getBindNo1() != null) {
            sql.SET("bind_no1 = #{record.bindNo1,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo2() != null) {
            sql.SET("bind_no2 = #{record.bindNo2,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo3() != null) {
            sql.SET("bind_no3 = #{record.bindNo3,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo4() != null) {
            sql.SET("bind_no4 = #{record.bindNo4,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo5() != null) {
            sql.SET("bind_no5 = #{record.bindNo5,jdbcType=VARCHAR}");
        }
        
        if (record.getReceivedReword() != null) {
            sql.SET("received_reword = #{record.receivedReword,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user_main");
        
        sql.SET("user_main_id = #{record.userMainId,jdbcType=BIGINT}");
        sql.SET("auth_id = #{record.authId,jdbcType=BIGINT}");
        sql.SET("social_uid = #{record.socialUid,jdbcType=VARCHAR}");
        sql.SET("social_token = #{record.socialToken,jdbcType=VARCHAR}");
        sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        sql.SET("user_level = #{record.userLevel,jdbcType=INTEGER}");
        sql.SET("user_tag = #{record.userTag,jdbcType=VARCHAR}");
        sql.SET("user_lang = #{record.userLang,jdbcType=SMALLINT}");
        sql.SET("family_name = #{record.familyName,jdbcType=VARCHAR}");
        sql.SET("given_name = #{record.givenName,jdbcType=VARCHAR}");
        sql.SET("menu_array = #{record.menuArray,jdbcType=VARCHAR}");
        sql.SET("password = #{record.password,jdbcType=VARCHAR}");
        sql.SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        sql.SET("verify_type = #{record.verifyType,jdbcType=SMALLINT}");
        sql.SET("verify_desc = #{record.verifyDesc,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("country_code = #{record.countryCode,jdbcType=VARCHAR}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("govt_id_type = #{record.govtIdType,jdbcType=SMALLINT}");
        sql.SET("govt_id_no = #{record.govtIdNo,jdbcType=VARCHAR}");
        sql.SET("uuid = #{record.uuid,jdbcType=VARCHAR}");
        sql.SET("imclone_token = #{record.imcloneToken,jdbcType=VARCHAR}");
        sql.SET("push_token = #{record.pushToken,jdbcType=VARCHAR}");
        sql.SET("gender = #{record.gender,jdbcType=SMALLINT}");
        sql.SET("source = #{record.source,jdbcType=VARCHAR}");
        sql.SET("social_source = #{record.socialSource,jdbcType=VARCHAR}");
        sql.SET("organization = #{record.organization,jdbcType=VARCHAR}");
        sql.SET("profession = #{record.profession,jdbcType=VARCHAR}");
        sql.SET("birth_date = #{record.birthDate,jdbcType=DATE}");
        sql.SET("highest_education = #{record.highestEducation,jdbcType=SMALLINT}");
        sql.SET("college_name = #{record.collegeName,jdbcType=VARCHAR}");
        sql.SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        sql.SET("location_lng = #{record.locationLng,jdbcType=DOUBLE}");
        sql.SET("location_lat = #{record.locationLat,jdbcType=DOUBLE}");
        sql.SET("nationality = #{record.nationality,jdbcType=VARCHAR}");
        sql.SET("living_country = #{record.livingCountry,jdbcType=VARCHAR}");
        sql.SET("living_province = #{record.livingProvince,jdbcType=VARCHAR}");
        sql.SET("living_city = #{record.livingCity,jdbcType=VARCHAR}");
        sql.SET("living_area = #{record.livingArea,jdbcType=VARCHAR}");
        sql.SET("living_street = #{record.livingStreet,jdbcType=VARCHAR}");
        sql.SET("home_address = #{record.homeAddress,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("last_login_time = #{record.lastLoginTime,jdbcType=TIMESTAMP}");
        sql.SET("last_login_ip = #{record.lastLoginIp,jdbcType=VARCHAR}");
        sql.SET("last_login_device = #{record.lastLoginDevice,jdbcType=VARCHAR}");
        sql.SET("recommand_by = #{record.recommandBy,jdbcType=VARCHAR}");
        sql.SET("profile = #{record.profile,jdbcType=VARCHAR}");
        sql.SET("report_line = #{record.reportLine,jdbcType=VARCHAR}");
        sql.SET("enabled = #{record.enabled,jdbcType=SMALLINT}");
        sql.SET("org_pk = #{record.orgPk,jdbcType=BIGINT}");
        sql.SET("employee_no = #{record.employeeNo,jdbcType=VARCHAR}");
        sql.SET("partner_no = #{record.partnerNo,jdbcType=VARCHAR}");
        sql.SET("partner_level = #{record.partnerLevel,jdbcType=INTEGER}");
        sql.SET("partner_type = #{record.partnerType,jdbcType=INTEGER}");
        sql.SET("bind_no1 = #{record.bindNo1,jdbcType=VARCHAR}");
        sql.SET("bind_no2 = #{record.bindNo2,jdbcType=VARCHAR}");
        sql.SET("bind_no3 = #{record.bindNo3,jdbcType=VARCHAR}");
        sql.SET("bind_no4 = #{record.bindNo4,jdbcType=VARCHAR}");
        sql.SET("bind_no5 = #{record.bindNo5,jdbcType=VARCHAR}");
        sql.SET("received_reword = #{record.receivedReword,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        
        TblUserMainExample example = (TblUserMainExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TblUserMain record) {
        SQL sql = new SQL();
        sql.UPDATE("user_main");
        
        if (record.getAuthId() != null) {
            sql.SET("auth_id = #{authId,jdbcType=BIGINT}");
        }
        
        if (record.getSocialUid() != null) {
            sql.SET("social_uid = #{socialUid,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialToken() != null) {
            sql.SET("social_token = #{socialToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLevel() != null) {
            sql.SET("user_level = #{userLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUserTag() != null) {
            sql.SET("user_tag = #{userTag,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLang() != null) {
            sql.SET("user_lang = #{userLang,jdbcType=SMALLINT}");
        }
        
        if (record.getFamilyName() != null) {
            sql.SET("family_name = #{familyName,jdbcType=VARCHAR}");
        }
        
        if (record.getGivenName() != null) {
            sql.SET("given_name = #{givenName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuArray() != null) {
            sql.SET("menu_array = #{menuArray,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            sql.SET("nick_name = #{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyType() != null) {
            sql.SET("verify_type = #{verifyType,jdbcType=SMALLINT}");
        }
        
        if (record.getVerifyDesc() != null) {
            sql.SET("verify_desc = #{verifyDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            sql.SET("country_code = #{countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getGovtIdType() != null) {
            sql.SET("govt_id_type = #{govtIdType,jdbcType=SMALLINT}");
        }
        
        if (record.getGovtIdNo() != null) {
            sql.SET("govt_id_no = #{govtIdNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUuid() != null) {
            sql.SET("uuid = #{uuid,jdbcType=VARCHAR}");
        }
        
        if (record.getImcloneToken() != null) {
            sql.SET("imclone_token = #{imcloneToken,jdbcType=VARCHAR}");
        }
        
        if (record.getPushToken() != null) {
            sql.SET("push_token = #{pushToken,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{gender,jdbcType=SMALLINT}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=VARCHAR}");
        }
        
        if (record.getSocialSource() != null) {
            sql.SET("social_source = #{socialSource,jdbcType=VARCHAR}");
        }
        
        if (record.getOrganization() != null) {
            sql.SET("organization = #{organization,jdbcType=VARCHAR}");
        }
        
        if (record.getProfession() != null) {
            sql.SET("profession = #{profession,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthDate() != null) {
            sql.SET("birth_date = #{birthDate,jdbcType=DATE}");
        }
        
        if (record.getHighestEducation() != null) {
            sql.SET("highest_education = #{highestEducation,jdbcType=SMALLINT}");
        }
        
        if (record.getCollegeName() != null) {
            sql.SET("college_name = #{collegeName,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            sql.SET("avatar = #{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getLocationLng() != null) {
            sql.SET("location_lng = #{locationLng,jdbcType=DOUBLE}");
        }
        
        if (record.getLocationLat() != null) {
            sql.SET("location_lat = #{locationLat,jdbcType=DOUBLE}");
        }
        
        if (record.getNationality() != null) {
            sql.SET("nationality = #{nationality,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingCountry() != null) {
            sql.SET("living_country = #{livingCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingProvince() != null) {
            sql.SET("living_province = #{livingProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingCity() != null) {
            sql.SET("living_city = #{livingCity,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingArea() != null) {
            sql.SET("living_area = #{livingArea,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingStreet() != null) {
            sql.SET("living_street = #{livingStreet,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeAddress() != null) {
            sql.SET("home_address = #{homeAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getLastLoginTime() != null) {
            sql.SET("last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLoginIp() != null) {
            sql.SET("last_login_ip = #{lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginDevice() != null) {
            sql.SET("last_login_device = #{lastLoginDevice,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommandBy() != null) {
            sql.SET("recommand_by = #{recommandBy,jdbcType=VARCHAR}");
        }
        
        if (record.getProfile() != null) {
            sql.SET("profile = #{profile,jdbcType=VARCHAR}");
        }
        
        if (record.getReportLine() != null) {
            sql.SET("report_line = #{reportLine,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.SET("enabled = #{enabled,jdbcType=SMALLINT}");
        }
        
        if (record.getOrgPk() != null) {
            sql.SET("org_pk = #{orgPk,jdbcType=BIGINT}");
        }
        
        if (record.getEmployeeNo() != null) {
            sql.SET("employee_no = #{employeeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerNo() != null) {
            sql.SET("partner_no = #{partnerNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerLevel() != null) {
            sql.SET("partner_level = #{partnerLevel,jdbcType=INTEGER}");
        }
        
        if (record.getPartnerType() != null) {
            sql.SET("partner_type = #{partnerType,jdbcType=INTEGER}");
        }
        
        if (record.getBindNo1() != null) {
            sql.SET("bind_no1 = #{bindNo1,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo2() != null) {
            sql.SET("bind_no2 = #{bindNo2,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo3() != null) {
            sql.SET("bind_no3 = #{bindNo3,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo4() != null) {
            sql.SET("bind_no4 = #{bindNo4,jdbcType=VARCHAR}");
        }
        
        if (record.getBindNo5() != null) {
            sql.SET("bind_no5 = #{bindNo5,jdbcType=VARCHAR}");
        }
        
        if (record.getReceivedReword() != null) {
            sql.SET("received_reword = #{receivedReword,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("user_main_id = #{userMainId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TblUserMainExample example, boolean includeExamplePhrase) {
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