package com.education.tutor.api.classin;

import com.education.tutor.api.BaseReq;

/**
 * Created by 雪峰 on 2018/5/6.
 */
public class EditStudentPhoneReq extends BaseReq {

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
