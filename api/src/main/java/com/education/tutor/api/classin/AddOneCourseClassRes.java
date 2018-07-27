package com.education.tutor.api.classin;


import com.education.tutor.api.BaseRes;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class AddOneCourseClassRes extends BaseRes {
    //课节ID
    private String classId;


    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
