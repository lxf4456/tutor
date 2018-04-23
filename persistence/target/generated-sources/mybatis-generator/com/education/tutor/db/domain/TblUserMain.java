package com.education.tutor.db.domain;

import java.util.Date;

public class TblUserMain {
    private Long userMainId;

    private Long authId;

    private String socialUid;

    private String socialToken;

    private String username;

    private Integer userLevel;

    private String userTag;

    private Short userLang;

    private String familyName;

    private String givenName;

    private String menuArray;

    private String password;

    private String nickName;

    private Short verifyType;

    private String verifyDesc;

    private String email;

    private String countryCode;

    private String mobile;

    private Short govtIdType;

    private String govtIdNo;

    private String uuid;

    private String imcloneToken;

    private String pushToken;

    private Short gender;

    private String source;

    private String socialSource;

    private String organization;

    private String profession;

    private Date birthDate;

    private Short highestEducation;

    private String collegeName;

    private String avatar;

    private Double locationLng;

    private Double locationLat;

    private String nationality;

    private String livingCountry;

    private String livingProvince;

    private String livingCity;

    private String livingArea;

    private String livingStreet;

    private String homeAddress;

    private Integer status;

    private Date lastLoginTime;

    private String lastLoginIp;

    private String lastLoginDevice;

    private String recommandBy;

    private String profile;

    private String reportLine;

    private Short enabled;

    private Long orgPk;

    private String employeeNo;

    private String partnerNo;

    private Integer partnerLevel;

    private Integer partnerType;

    private String bindNo1;

    private String bindNo2;

    private String bindNo3;

    private String bindNo4;

    private String bindNo5;

    private Integer receivedReword;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    public TblUserMain(Long userMainId, Long authId, String socialUid, String socialToken, String username, Integer userLevel, String userTag, Short userLang, String familyName, String givenName, String menuArray, String password, String nickName, Short verifyType, String verifyDesc, String email, String countryCode, String mobile, Short govtIdType, String govtIdNo, String uuid, String imcloneToken, String pushToken, Short gender, String source, String socialSource, String organization, String profession, Date birthDate, Short highestEducation, String collegeName, String avatar, Double locationLng, Double locationLat, String nationality, String livingCountry, String livingProvince, String livingCity, String livingArea, String livingStreet, String homeAddress, Integer status, Date lastLoginTime, String lastLoginIp, String lastLoginDevice, String recommandBy, String profile, String reportLine, Short enabled, Long orgPk, String employeeNo, String partnerNo, Integer partnerLevel, Integer partnerType, String bindNo1, String bindNo2, String bindNo3, String bindNo4, String bindNo5, Integer receivedReword, Date createdAt, Date updatedAt, String updatedBy) {
        this.userMainId = userMainId;
        this.authId = authId;
        this.socialUid = socialUid;
        this.socialToken = socialToken;
        this.username = username;
        this.userLevel = userLevel;
        this.userTag = userTag;
        this.userLang = userLang;
        this.familyName = familyName;
        this.givenName = givenName;
        this.menuArray = menuArray;
        this.password = password;
        this.nickName = nickName;
        this.verifyType = verifyType;
        this.verifyDesc = verifyDesc;
        this.email = email;
        this.countryCode = countryCode;
        this.mobile = mobile;
        this.govtIdType = govtIdType;
        this.govtIdNo = govtIdNo;
        this.uuid = uuid;
        this.imcloneToken = imcloneToken;
        this.pushToken = pushToken;
        this.gender = gender;
        this.source = source;
        this.socialSource = socialSource;
        this.organization = organization;
        this.profession = profession;
        this.birthDate = birthDate;
        this.highestEducation = highestEducation;
        this.collegeName = collegeName;
        this.avatar = avatar;
        this.locationLng = locationLng;
        this.locationLat = locationLat;
        this.nationality = nationality;
        this.livingCountry = livingCountry;
        this.livingProvince = livingProvince;
        this.livingCity = livingCity;
        this.livingArea = livingArea;
        this.livingStreet = livingStreet;
        this.homeAddress = homeAddress;
        this.status = status;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginDevice = lastLoginDevice;
        this.recommandBy = recommandBy;
        this.profile = profile;
        this.reportLine = reportLine;
        this.enabled = enabled;
        this.orgPk = orgPk;
        this.employeeNo = employeeNo;
        this.partnerNo = partnerNo;
        this.partnerLevel = partnerLevel;
        this.partnerType = partnerType;
        this.bindNo1 = bindNo1;
        this.bindNo2 = bindNo2;
        this.bindNo3 = bindNo3;
        this.bindNo4 = bindNo4;
        this.bindNo5 = bindNo5;
        this.receivedReword = receivedReword;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblUserMain() {
        super();
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getAuthId() {
        return authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    public String getSocialUid() {
        return socialUid;
    }

    public void setSocialUid(String socialUid) {
        this.socialUid = socialUid == null ? null : socialUid.trim();
    }

    public String getSocialToken() {
        return socialToken;
    }

    public void setSocialToken(String socialToken) {
        this.socialToken = socialToken == null ? null : socialToken.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserTag() {
        return userTag;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag == null ? null : userTag.trim();
    }

    public Short getUserLang() {
        return userLang;
    }

    public void setUserLang(Short userLang) {
        this.userLang = userLang;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName == null ? null : givenName.trim();
    }

    public String getMenuArray() {
        return menuArray;
    }

    public void setMenuArray(String menuArray) {
        this.menuArray = menuArray == null ? null : menuArray.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Short getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(Short verifyType) {
        this.verifyType = verifyType;
    }

    public String getVerifyDesc() {
        return verifyDesc;
    }

    public void setVerifyDesc(String verifyDesc) {
        this.verifyDesc = verifyDesc == null ? null : verifyDesc.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Short getGovtIdType() {
        return govtIdType;
    }

    public void setGovtIdType(Short govtIdType) {
        this.govtIdType = govtIdType;
    }

    public String getGovtIdNo() {
        return govtIdNo;
    }

    public void setGovtIdNo(String govtIdNo) {
        this.govtIdNo = govtIdNo == null ? null : govtIdNo.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getImcloneToken() {
        return imcloneToken;
    }

    public void setImcloneToken(String imcloneToken) {
        this.imcloneToken = imcloneToken == null ? null : imcloneToken.trim();
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken == null ? null : pushToken.trim();
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSocialSource() {
        return socialSource;
    }

    public void setSocialSource(String socialSource) {
        this.socialSource = socialSource == null ? null : socialSource.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Short getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(Short highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Double getLocationLng() {
        return locationLng;
    }

    public void setLocationLng(Double locationLng) {
        this.locationLng = locationLng;
    }

    public Double getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(Double locationLat) {
        this.locationLat = locationLat;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getLivingCountry() {
        return livingCountry;
    }

    public void setLivingCountry(String livingCountry) {
        this.livingCountry = livingCountry == null ? null : livingCountry.trim();
    }

    public String getLivingProvince() {
        return livingProvince;
    }

    public void setLivingProvince(String livingProvince) {
        this.livingProvince = livingProvince == null ? null : livingProvince.trim();
    }

    public String getLivingCity() {
        return livingCity;
    }

    public void setLivingCity(String livingCity) {
        this.livingCity = livingCity == null ? null : livingCity.trim();
    }

    public String getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea == null ? null : livingArea.trim();
    }

    public String getLivingStreet() {
        return livingStreet;
    }

    public void setLivingStreet(String livingStreet) {
        this.livingStreet = livingStreet == null ? null : livingStreet.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public String getLastLoginDevice() {
        return lastLoginDevice;
    }

    public void setLastLoginDevice(String lastLoginDevice) {
        this.lastLoginDevice = lastLoginDevice == null ? null : lastLoginDevice.trim();
    }

    public String getRecommandBy() {
        return recommandBy;
    }

    public void setRecommandBy(String recommandBy) {
        this.recommandBy = recommandBy == null ? null : recommandBy.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public String getReportLine() {
        return reportLine;
    }

    public void setReportLine(String reportLine) {
        this.reportLine = reportLine == null ? null : reportLine.trim();
    }

    public Short getEnabled() {
        return enabled;
    }

    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    public Long getOrgPk() {
        return orgPk;
    }

    public void setOrgPk(Long orgPk) {
        this.orgPk = orgPk;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo == null ? null : employeeNo.trim();
    }

    public String getPartnerNo() {
        return partnerNo;
    }

    public void setPartnerNo(String partnerNo) {
        this.partnerNo = partnerNo == null ? null : partnerNo.trim();
    }

    public Integer getPartnerLevel() {
        return partnerLevel;
    }

    public void setPartnerLevel(Integer partnerLevel) {
        this.partnerLevel = partnerLevel;
    }

    public Integer getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(Integer partnerType) {
        this.partnerType = partnerType;
    }

    public String getBindNo1() {
        return bindNo1;
    }

    public void setBindNo1(String bindNo1) {
        this.bindNo1 = bindNo1 == null ? null : bindNo1.trim();
    }

    public String getBindNo2() {
        return bindNo2;
    }

    public void setBindNo2(String bindNo2) {
        this.bindNo2 = bindNo2 == null ? null : bindNo2.trim();
    }

    public String getBindNo3() {
        return bindNo3;
    }

    public void setBindNo3(String bindNo3) {
        this.bindNo3 = bindNo3 == null ? null : bindNo3.trim();
    }

    public String getBindNo4() {
        return bindNo4;
    }

    public void setBindNo4(String bindNo4) {
        this.bindNo4 = bindNo4 == null ? null : bindNo4.trim();
    }

    public String getBindNo5() {
        return bindNo5;
    }

    public void setBindNo5(String bindNo5) {
        this.bindNo5 = bindNo5 == null ? null : bindNo5.trim();
    }

    public Integer getReceivedReword() {
        return receivedReword;
    }

    public void setReceivedReword(Integer receivedReword) {
        this.receivedReword = receivedReword;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}