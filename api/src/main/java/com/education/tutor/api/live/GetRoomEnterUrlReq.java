package com.education.tutor.api.live;

import com.education.tutor.api.BaseReq;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class GetRoomEnterUrlReq extends BaseReq {

    private String userName;
    private String roomId;
    private String nickname;

    //0：听众，1:老师，2：学生，3：兼课，4：助教
    private int userRole;
    //0:PC，1：手机
    private int deviceType;



    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }
}
