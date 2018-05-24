package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

import java.io.File;

/**
 * Created by 雪峰 on 2018/5/6.
 */
public class AddTeacherReq extends ClassInBasicReq {
    private transient static final String action = "addTeacher";

    private String teacherAccount;

    private String teacherName;

    private File Filedata;

    @Override
    public String getAction() {
        return null;
    }

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
