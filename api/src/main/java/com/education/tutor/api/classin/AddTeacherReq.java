package com.education.tutor.api.classin;

import com.education.tutor.api.BaseReq;

import java.io.File;

/**
 * Created by 雪峰 on 2018/5/6.
 */
public class AddTeacherReq extends BaseReq {

    private String teacherAccount;

    private String teacherName;

    private File Filedata;


    public String getTeacherAccount() {
        return teacherAccount;
    }

    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public File getFiledata() {
        return Filedata;
    }

    public void setFiledata(File filedata) {
        Filedata = filedata;
    }
}
