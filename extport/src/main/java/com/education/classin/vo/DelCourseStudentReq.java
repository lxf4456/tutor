package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class DelCourseStudentReq extends ClassInBasicReq {

    private transient static final String action = "delCourseStudent";

    @Override
    public String getAction() {
        return action;
    }

    private long courseId;
    //1为学生，2：旁听
    private long identity;


    private String studentAccount;

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public long getIdentity() {
        return identity;
    }

    public void setIdentity(long identity) {
        this.identity = identity;
    }

    public String getStudentAccount() {
        return studentAccount;
    }

    public void setStudentAccount(String studentAccount) {
        this.studentAccount = studentAccount;
    }
}
