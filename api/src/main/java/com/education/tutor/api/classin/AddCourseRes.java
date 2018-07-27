package com.education.tutor.api.classin;

import com.education.tutor.api.BaseRes;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class AddCourseRes  extends BaseRes {

    private String courseId;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
