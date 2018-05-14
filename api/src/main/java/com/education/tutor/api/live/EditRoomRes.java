package com.education.tutor.api.live;

import com.education.tutor.api.BaseRes;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class EditRoomRes extends BaseRes {
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
