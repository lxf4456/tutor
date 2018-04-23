package com.education.tutor.api.user;

import com.education.tutor.api.BaseRes;
import com.education.tutor.api.UserBasic;

import java.beans.Transient;

public class MyInfoRes extends BaseRes {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private UserBasic userBasic;

	private String userRole;
	
	private Integer isSign;//当日是否已签到（0：否 1：是）
	
	private Integer fansCount = 0;
	
	private Integer noteCount = 0;
	
	public Integer getVisitorCount() {
		return userBasic.getVisitorCount();
	}

	public void setVisitorCount(Integer visitorCount) {
		userBasic.setVisitorCount(visitorCount);
	}

	@Transient
	public UserBasic getUserBasic() {
		return userBasic;
	}

	public MyInfoRes() {
		super();
		this.userBasic = new UserBasic();
	}

	public MyInfoRes(UserBasic userBasic) {
		super();
		this.userBasic = userBasic;
	}

	public String getNickName() {
		return userBasic.getNickName();
	}

	public void setNickName(String nickName) {
		userBasic.setNickName(nickName);
	}

	public Integer getUserLevel() {
		return userBasic.getUserLevel();
	}

	public void setUserLevel(Integer userLevel) {
		userBasic.setUserLevel(userLevel);
	}

	public String getLocation() {
		return userBasic.getLocation();
	}

	public void setLocation(String location) {
		userBasic.setLocation(location);
	}


	public Integer getAttentionCount() {
		return userBasic.getAttentionCount();
	}

	public void setAttentionCount(Integer attentionCount) {
		userBasic.setAttentionCount(attentionCount);
	}

	public Long getUserId() {
		return userBasic.getUserId();
	}

	public void setUserId(Long userId) {
		userBasic.setUserId(userId);
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

	public String getIntroduction() {
		return userBasic.getIntroduction();
	}

	public void setIntroduction(String introduction) {
		userBasic.setIntroduction(introduction);
	}

	public Integer getIsAttention() {
		return userBasic.getIsAttention();
	}

	public void setIsAttention(Integer isAttention) {
		userBasic.setIsAttention(isAttention);
	}

	public String getUserName() {
		return userBasic.getUserName();
	}

	public void setUserName(String userName) {
		userBasic.setUserName(userName);
	}

	public Integer getBalance() {
		return userBasic.getBalance();
	}

	public void setBalance(Integer balance) {
		userBasic.setBalance(balance);
	}


	public String getPartnerNo() {
		return userBasic.getPartnerNo();
	}

	public void setPartnerNo(String partnerNo) {
		this.userBasic.setPartnerNo(partnerNo);
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

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getAddress() {
		return userBasic.getAddress();
	}

	public void setAddress(String address) {
		this.userBasic.setAddress(address);
	}

	public Integer getIsSign() {
		return isSign;
	}

	public void setIsSign(Integer isSign) {
		this.isSign = isSign;
	}

	public Integer getNoteCount() {
		return noteCount;
	}

	public void setNoteCount(Integer noteCount) {
		this.noteCount = noteCount;
	}

	public void setUserBasic(UserBasic userBasic) {
		this.userBasic = userBasic;
	}

	public Integer getFansCount() {
		return fansCount;
	}

	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}

	public String getName() {
		return userBasic.getName();
	}

	public void setName(String name) {
		this.userBasic.setName(name);
	}
	
}