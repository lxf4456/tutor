package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/6.
 */
public class EditStudentPhoneReq extends ClassInBasicReq {

    private transient static final String action = "modifyTelephone";

    @Override
    public String getAction() {
        return action;
    }

    private String oldTelephone;
    private String telephone;

    public String getOldTelephone() {
        return oldTelephone;
    }

    public void setOldTelephone(String oldTelephone) {
        this.oldTelephone = oldTelephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
