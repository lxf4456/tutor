package com.education.tutor.api.classin;

import com.education.tutor.api.BaseRes;

/**
 * Created by 雪峰 on 2018/5/6.
 */
public class AddTeacherRes extends BaseRes {

    private long teachId;

    public long getTeachId() {
        return teachId;
    }

    public void setTeachId(long teachId) {
        this.teachId = teachId;
    }
}
