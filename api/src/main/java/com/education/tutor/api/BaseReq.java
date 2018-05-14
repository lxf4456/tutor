package com.education.tutor.api;

public class BaseReq extends Base {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Long userId;

    private int userType;



    String lang = "en";

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
    	this.lang = lang;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
