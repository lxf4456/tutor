package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class GetTempLoginKeyReq extends ClassInBasicReq {
    private transient static final String action = "getTempLoginKey";

    @Override
    public String getAction() {
        return action;
    }

    private String telephone;


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
