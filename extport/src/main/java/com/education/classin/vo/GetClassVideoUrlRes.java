package com.education.classin.vo;


import com.education.classin.ClassInBasicRes;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class GetClassVideoUrlRes extends ClassInBasicRes {

    //live-直播
    private String videoType;
    //0：标识执行
    private int Code;

    private String Message;

    private VodInfo VodInfo;

    private LiveInfo LiveInfo;


    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public VodInfo getVodInfo() {
        return VodInfo;
    }

    public void setVodInfo(VodInfo vodInfo) {
        VodInfo = vodInfo;
    }

    public LiveInfo getLiveInfo() {
        return LiveInfo;
    }

    public void setLiveInfo(LiveInfo liveInfo) {
        LiveInfo = liveInfo;
    }
}
