package com.education.tutor.api.live;

import com.education.tutor.api.BaseReq;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class CreateRoomReq extends BaseReq {

    private String title;

    private String startTime;
    //时长
    private int length;
    //1：1对1，2：1对多，3：小班课程
    private int menNum;

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

    public int getMenNum() {
        return menNum;
    }

    public void setMenNum(int menNum) {
        this.menNum = menNum;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
