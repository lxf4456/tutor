package com.education.duobei.vo;

import com.education.duobei.DuoBeiBasicReq;

import java.util.Date;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class EditRoomScheduleReq extends DuoBeiBasicReq {

    private String roomId;
    private Date startTime;
    //房间时长,单位小时, 可选值为 1 , 2, 3,4,5
    private int duration;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
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
}
