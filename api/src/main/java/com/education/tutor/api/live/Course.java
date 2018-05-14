package com.education.tutor.api.live;

import java.io.Serializable;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class Course implements Serializable{
    private  String roomId;
    private  String         title;
    private  String        startTime;
    private  String        endTime;
    private  String        teacherName;
    private  String        teacherBrief;
    private  String        description;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
