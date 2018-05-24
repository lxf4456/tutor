package com.education.duobei.vo;

import com.education.duobei.DuoBeiBasicReq;

import java.util.Date;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class CreateRoomReq extends DuoBeiBasicReq {

    private String title;

    private boolean video;

    private Date startTime;
    //房间时长,单位小时, 可选值为 1 , 2, 3,4,5
    private int duration;

    private String roomType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
