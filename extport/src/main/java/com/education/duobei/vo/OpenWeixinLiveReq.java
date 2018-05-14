package com.education.duobei.vo;

import com.education.duobei.DuoBeiBasicReq;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class OpenWeixinLiveReq extends DuoBeiBasicReq {
    private String roomId;
    //老师名称
    private String teacherName;
    //老师简介
    private String teacherBrief;
    //课程简介
    private  String description;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherBrief() {
        return teacherBrief;
    }

    public void setTeacherBrief(String teacherBrief) {
        this.teacherBrief = teacherBrief;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}