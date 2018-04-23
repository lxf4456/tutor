package com.education.tutor.api;

public class BaseReq extends Base {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    String lang = "en";

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
    	this.lang = lang;
    }

}
