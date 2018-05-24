package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class GetLoginLinkedReq extends ClassInBasicReq {

    private transient static final String action = "getLoginLinked";

    @Override
    public String getAction() {
        return action;
    }



    private String telephone;

    private long courseId;

    private long classId;


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }
}
