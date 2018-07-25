package com.education.tutor.api.classin;


import com.education.tutor.api.BaseRes;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class AddOneCourseClassRes extends BaseRes {
    //课节ID
    private long classId;


    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }
}
