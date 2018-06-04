package com.education.tutor.api;

public class BaseReq extends Base {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String userName;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
