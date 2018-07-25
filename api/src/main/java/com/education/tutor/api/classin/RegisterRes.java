package com.education.tutor.api.classin;

import com.education.tutor.api.BaseRes;

/**
 * Created by 雪峰 on 2018/5/5.
 */
public class RegisterRes extends BaseRes {

    private long studentId;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
