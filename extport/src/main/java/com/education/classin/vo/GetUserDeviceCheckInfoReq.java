package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class GetUserDeviceCheckInfoReq extends ClassInBasicReq {

    private transient static final String action = "getUserDeviceCheckInfo";

    @Override
    public String getAction() {
        return action;
    }


    private long telephone;


    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }
}
