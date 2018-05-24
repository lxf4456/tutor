package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/5.
 */
public class EditUserBasicReq extends ClassInBasicReq {

    private transient static final String action = "editUserInfo";

    private String telephone;
    private String nickname;


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    @Override
    public String getAction() {
        return action;
    }
}
