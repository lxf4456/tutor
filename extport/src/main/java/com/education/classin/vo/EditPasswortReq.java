package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/5.
 */
public class EditPasswortReq extends ClassInBasicReq {
    private transient static final String action = "modifyPasswordByTelephone";


    private  String telephone;
    private String password;
    private String oldMd5pass;



    @Override
    public String getAction() {
        return action;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldMd5pass() {
        return oldMd5pass;
    }

    public void setOldMd5pass(String oldMd5pass) {
        this.oldMd5pass = oldMd5pass;
    }
}
