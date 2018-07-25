package com.education.tutor.api.classin;

import com.education.tutor.api.BaseReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class DelCourseClassReq extends BaseReq {

    private long courseId;

    private long classId;

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
