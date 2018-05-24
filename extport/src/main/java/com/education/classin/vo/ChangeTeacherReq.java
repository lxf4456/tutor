package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class ChangeTeacherReq extends ClassInBasicReq {
    private transient static final String action = "modifyCourseTeacher";

    @Override
    public String getAction() {
        return action;
    }


    private long courseId;

    private String teacherAccount;


    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getTeacherAccount() {
        return teacherAccount;
    }

    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount;
    }
}
