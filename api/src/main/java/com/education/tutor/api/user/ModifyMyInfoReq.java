package com.education.tutor.api.user;

import com.education.tutor.api.BaseReq;
import com.education.tutor.api.UserBasic;

public class ModifyMyInfoReq extends BaseReq {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    UserBasic userBasic;

    String livingCountry;

    String livingProvince;

    String livingCity;
    
    String name;

    public ModifyMyInfoReq() {
        super();
        this.userBasic = new UserBasic();
    }

    public String getIntroduction() {
        return userBasic.getIntroduction();
    }

    public void setIntroduction(String introduction) {
        userBasic.setIntroduction(introduction);
    }

    public ModifyMyInfoReq(UserBasic userBasic) {
        this.userBasic = userBasic;
    }

    public String getLivingCountry() {
        return livingCountry;
    }

    public void setLivingCountry(String livingCountry) {
        this.livingCountry = livingCountry;
    }

    public String getLivingProvince() {
        return livingProvince;
    }

    public void setLivingProvince(String livingProvince) {
        this.livingProvince = livingProvince;
    }

    public String getLivingCity() {
        return livingCity;
    }

    public void setLivingCity(String livingCity) {
        this.livingCity = livingCity;
    }

    public String getNickName() {
        return userBasic.getNickName();
    }

    public void setNickName(String nickName) {
        userBasic.setNickName(nickName);
    }

    public Integer getSex() {
        return userBasic.getSex();
    }

    public void setSex(Integer sex) {
        userBasic.setSex(sex);
    }

    public String getAvatar() {
        return userBasic.getAvatar();
    }

    public void setAvatar(String avatar) {
        userBasic.setAvatar(avatar);
    }

    public String getOrganization() {
        return userBasic.getOrganization();
    }

    public void setOrganization(String organization) {
        userBasic.setOrganization(organization);
    }

    public String getProfession() {
        return userBasic.getProfession();
    }

    public void setProfession(String profession) {
        userBasic.setProfession(profession);
    }


    public String getMobile() {
        return userBasic.getMobile();
    }

    public void setMobile(String mobile) {
        this.userBasic.setMobile(mobile);
    }

    public String getCountryCode() {
        return userBasic.getCountryCode();
    }

    public void setCountryCode(String countryCode) {
        this.userBasic.setCountryCode(countryCode);
    }

    public String getEmail() {
        return userBasic.getEmail();
    }

    public void setEmail(String email) {
        this.userBasic.setEmail(email);
    }

	public String getName() {
		return userBasic.getGivenName();
	}

	public void setName(String name) {
		this.userBasic.setGivenName(name);
	}

    
}
