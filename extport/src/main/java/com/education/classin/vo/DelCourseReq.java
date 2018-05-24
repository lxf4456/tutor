package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class DelCourseReq extends ClassInBasicReq {

    private transient static final String action = "delCourse";

    @Override
    public String getAction() {
        return action;
    }


    private long courseId;

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }
}
