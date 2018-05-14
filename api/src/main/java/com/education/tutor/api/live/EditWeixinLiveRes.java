package com.education.tutor.api.live;

import com.education.tutor.api.BaseRes;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class EditWeixinLiveRes extends BaseRes {
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
