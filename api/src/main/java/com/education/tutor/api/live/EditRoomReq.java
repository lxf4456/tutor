package com.education.tutor.api.live;

import com.education.tutor.api.BaseReq;

import java.util.Date;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class EditRoomReq extends BaseReq {

    private String roomId;

    private String title;

    private Date startTime;
    //
    private int langth;


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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getLangth() {
        return langth;
    }

    public void setLangth(int langth) {
        this.langth = langth;
    }
}
