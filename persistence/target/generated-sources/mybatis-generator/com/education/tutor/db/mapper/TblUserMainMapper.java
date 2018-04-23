package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblUserMain;
import com.education.tutor.db.domain.TblUserMainExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TblUserMainMapper {
    @SelectProvider(type=TblUserMainSqlProvider.class, method="countByExample")
    long countByExample(TblUserMainExample example);

    @DeleteProvider(type=TblUserMainSqlProvider.class, method="deleteByExample")
    int deleteByExample(TblUserMainExample example);

    @Delete({
        "delete from user_main",
        "where user_main_id = #{userMainId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userMainId);

    @Insert({
        "insert into user_main (auth_id, social_uid, ",
        "social_token, username, ",
        "user_level, user_tag, ",
        "user_lang, family_name, ",
        "given_name, menu_array, ",
        "password, nick_name, ",
        "verify_type, verify_desc, ",
        "email, country_code, ",
        "mobile, govt_id_type, ",
        "govt_id_no, uuid, ",
        "imclone_token, push_token, ",
        "gender, source, ",
        "social_source, organization, ",
        "profession, birth_date, ",
        "highest_education, college_name, ",
        "avatar, location_lng, ",
        "location_lat, nationality, ",
        "living_country, living_province, ",
        "living_city, living_area, ",
        "living_street, home_address, ",
        "status, last_login_time, ",
        "last_login_ip, last_login_device, ",
        "recommand_by, profile, ",
        "report_line, enabled, ",
        "org_pk, employee_no, ",
        "partner_no, partner_level, ",
        "partner_type, bind_no1, ",
        "bind_no2, bind_no3, ",
        "bind_no4, bind_no5, ",
        "received_reword, created_at, ",
        "updated_at, updated_by)",
        "values (#{authId,jdbcType=BIGINT}, #{socialUid,jdbcType=VARCHAR}, ",
        "#{socialToken,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{userLevel,jdbcType=INTEGER}, #{userTag,jdbcType=VARCHAR}, ",
        "#{userLang,jdbcType=SMALLINT}, #{familyName,jdbcType=VARCHAR}, ",
        "#{givenName,jdbcType=VARCHAR}, #{menuArray,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR}, ",
        "#{verifyType,jdbcType=SMALLINT}, #{verifyDesc,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{countryCode,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{govtIdType,jdbcType=SMALLINT}, ",
        "#{govtIdNo,jdbcType=VARCHAR}, #{uuid,jdbcType=VARCHAR}, ",
        "#{imcloneToken,jdbcType=VARCHAR}, #{pushToken,jdbcType=VARCHAR}, ",
        "#{gender,jdbcType=SMALLINT}, #{source,jdbcType=VARCHAR}, ",
        "#{socialSource,jdbcType=VARCHAR}, #{organization,jdbcType=VARCHAR}, ",
        "#{profession,jdbcType=VARCHAR}, #{birthDate,jdbcType=DATE}, ",
        "#{highestEducation,jdbcType=SMALLINT}, #{collegeName,jdbcType=VARCHAR}, ",
        "#{avatar,jdbcType=VARCHAR}, #{locationLng,jdbcType=DOUBLE}, ",
        "#{locationLat,jdbcType=DOUBLE}, #{nationality,jdbcType=VARCHAR}, ",
        "#{livingCountry,jdbcType=VARCHAR}, #{livingProvince,jdbcType=VARCHAR}, ",
        "#{livingCity,jdbcType=VARCHAR}, #{livingArea,jdbcType=VARCHAR}, ",
        "#{livingStreet,jdbcType=VARCHAR}, #{homeAddress,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{lastLoginIp,jdbcType=VARCHAR}, #{lastLoginDevice,jdbcType=VARCHAR}, ",
        "#{recommandBy,jdbcType=VARCHAR}, #{profile,jdbcType=VARCHAR}, ",
        "#{reportLine,jdbcType=VARCHAR}, #{enabled,jdbcType=SMALLINT}, ",
        "#{orgPk,jdbcType=BIGINT}, #{employeeNo,jdbcType=VARCHAR}, ",
        "#{partnerNo,jdbcType=VARCHAR}, #{partnerLevel,jdbcType=INTEGER}, ",
        "#{partnerType,jdbcType=INTEGER}, #{bindNo1,jdbcType=VARCHAR}, ",
        "#{bindNo2,jdbcType=VARCHAR}, #{bindNo3,jdbcType=VARCHAR}, ",
        "#{bindNo4,jdbcType=VARCHAR}, #{bindNo5,jdbcType=VARCHAR}, ",
        "#{receivedReword,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userMainId", before=false, resultType=Long.class)
    int insert(TblUserMain record);

    @InsertProvider(type=TblUserMainSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userMainId", before=false, resultType=Long.class)
    int insertSelective(TblUserMain record);

    @SelectProvider(type=TblUserMainSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="auth_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_uid", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_token", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="user_tag", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_lang", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="family_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="given_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_array", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="nick_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="verify_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="verify_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="govt_id_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="govt_id_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="uuid", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="imclone_token", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="push_token", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="gender", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="source", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_source", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="organization", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="profession", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="birth_date", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="highest_education", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="college_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="avatar", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_lng", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="location_lat", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="nationality", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_country", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_province", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_city", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_area", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_street", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="home_address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="last_login_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="last_login_ip", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="last_login_device", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="recommand_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="profile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="report_line", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="enabled", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="org_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="employee_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="partner_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="partner_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="partner_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="bind_no1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bind_no2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bind_no3", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bind_no4", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bind_no5", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="received_reword", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TblUserMain> selectByExample(TblUserMainExample example);

    @Select({
        "select",
        "user_main_id, auth_id, social_uid, social_token, username, user_level, user_tag, ",
        "user_lang, family_name, given_name, menu_array, password, nick_name, verify_type, ",
        "verify_desc, email, country_code, mobile, govt_id_type, govt_id_no, uuid, imclone_token, ",
        "push_token, gender, source, social_source, organization, profession, birth_date, ",
        "highest_education, college_name, avatar, location_lng, location_lat, nationality, ",
        "living_country, living_province, living_city, living_area, living_street, home_address, ",
        "status, last_login_time, last_login_ip, last_login_device, recommand_by, profile, ",
        "report_line, enabled, org_pk, employee_no, partner_no, partner_level, partner_type, ",
        "bind_no1, bind_no2, bind_no3, bind_no4, bind_no5, received_reword, created_at, ",
        "updated_at, updated_by",
        "from user_main",
        "where user_main_id = #{userMainId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="user_main_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="auth_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="social_uid", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_token", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="user_tag", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_lang", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="family_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="given_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_array", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="nick_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="verify_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="verify_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="country_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mobile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="govt_id_type", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="govt_id_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="uuid", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="imclone_token", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="push_token", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="gender", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="source", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="social_source", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="organization", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="profession", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="birth_date", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="highest_education", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="college_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="avatar", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_lng", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="location_lat", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="nationality", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_country", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_province", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_city", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_area", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="living_street", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="home_address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="last_login_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="last_login_ip", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="last_login_device", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="recommand_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="profile", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="report_line", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="enabled", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="org_pk", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="employee_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="partner_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="partner_level", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="partner_type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="bind_no1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bind_no2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bind_no3", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bind_no4", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bind_no5", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="received_reword", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="created_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_at", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updated_by", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TblUserMain selectByPrimaryKey(Long userMainId);

    @UpdateProvider(type=TblUserMainSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TblUserMain record, @Param("example") TblUserMainExample example);

    @UpdateProvider(type=TblUserMainSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TblUserMain record, @Param("example") TblUserMainExample example);

    @UpdateProvider(type=TblUserMainSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TblUserMain record);

    @Update({
        "update user_main",
        "set auth_id = #{authId,jdbcType=BIGINT},",
          "social_uid = #{socialUid,jdbcType=VARCHAR},",
          "social_token = #{socialToken,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "user_level = #{userLevel,jdbcType=INTEGER},",
          "user_tag = #{userTag,jdbcType=VARCHAR},",
          "user_lang = #{userLang,jdbcType=SMALLINT},",
          "family_name = #{familyName,jdbcType=VARCHAR},",
          "given_name = #{givenName,jdbcType=VARCHAR},",
          "menu_array = #{menuArray,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "verify_type = #{verifyType,jdbcType=SMALLINT},",
          "verify_desc = #{verifyDesc,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "country_code = #{countryCode,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "govt_id_type = #{govtIdType,jdbcType=SMALLINT},",
          "govt_id_no = #{govtIdNo,jdbcType=VARCHAR},",
          "uuid = #{uuid,jdbcType=VARCHAR},",
          "imclone_token = #{imcloneToken,jdbcType=VARCHAR},",
          "push_token = #{pushToken,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=SMALLINT},",
          "source = #{source,jdbcType=VARCHAR},",
          "social_source = #{socialSource,jdbcType=VARCHAR},",
          "organization = #{organization,jdbcType=VARCHAR},",
          "profession = #{profession,jdbcType=VARCHAR},",
          "birth_date = #{birthDate,jdbcType=DATE},",
          "highest_education = #{highestEducation,jdbcType=SMALLINT},",
          "college_name = #{collegeName,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "location_lng = #{locationLng,jdbcType=DOUBLE},",
          "location_lat = #{locationLat,jdbcType=DOUBLE},",
          "nationality = #{nationality,jdbcType=VARCHAR},",
          "living_country = #{livingCountry,jdbcType=VARCHAR},",
          "living_province = #{livingProvince,jdbcType=VARCHAR},",
          "living_city = #{livingCity,jdbcType=VARCHAR},",
          "living_area = #{livingArea,jdbcType=VARCHAR},",
          "living_street = #{livingStreet,jdbcType=VARCHAR},",
          "home_address = #{homeAddress,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
          "last_login_ip = #{lastLoginIp,jdbcType=VARCHAR},",
          "last_login_device = #{lastLoginDevice,jdbcType=VARCHAR},",
          "recommand_by = #{recommandBy,jdbcType=VARCHAR},",
          "profile = #{profile,jdbcType=VARCHAR},",
          "report_line = #{reportLine,jdbcType=VARCHAR},",
          "enabled = #{enabled,jdbcType=SMALLINT},",
          "org_pk = #{orgPk,jdbcType=BIGINT},",
          "employee_no = #{employeeNo,jdbcType=VARCHAR},",
          "partner_no = #{partnerNo,jdbcType=VARCHAR},",
          "partner_level = #{partnerLevel,jdbcType=INTEGER},",
          "partner_type = #{partnerType,jdbcType=INTEGER},",
          "bind_no1 = #{bindNo1,jdbcType=VARCHAR},",
          "bind_no2 = #{bindNo2,jdbcType=VARCHAR},",
          "bind_no3 = #{bindNo3,jdbcType=VARCHAR},",
          "bind_no4 = #{bindNo4,jdbcType=VARCHAR},",
          "bind_no5 = #{bindNo5,jdbcType=VARCHAR},",
          "received_reword = #{receivedReword,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR}",
        "where user_main_id = #{userMainId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TblUserMain record);
}