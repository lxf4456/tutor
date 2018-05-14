package com.education.duobei.vo;

import com.education.duobei.DuoBeiBasicReq;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class EditRoomTitleReq extends DuoBeiBasicReq {

    private String roomId;

    private String title;


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
}
