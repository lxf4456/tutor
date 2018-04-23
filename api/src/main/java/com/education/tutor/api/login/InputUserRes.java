package com.education.tutor.api.login;

import com.education.tutor.api.BaseRes;

public class InputUserRes extends BaseRes {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private long userId;
    private String userNum;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }
}
