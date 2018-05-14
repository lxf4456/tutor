package com.education.duobei.vo;

import com.education.duobei.DuoBeiBasicReq;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class GetAuthInfoUrlReq extends DuoBeiBasicReq {

    private String uid;
    private String roomId;
    private String nickname;
    //DuobeiYunClient.ROLE_TEACHER表示以 老师身份进入教室，
    // DuobeiYunClient.ROLE_STUDENT表示以学生身份进入教室。
    // DuobeiYunClient.ROLE_MONITOR表示以隐身监课者身份进入教室。
    // DuobeiYunClient.ROLE_ASSISTANT表示以助教身份进入教室。当请求不加该参数时默认以听众身份进入
    private String userRole;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


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

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

}
