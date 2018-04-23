package com.education.tutor.api.login;

import com.education.tutor.api.BaseReq;

public class SubmitChannelIdReq extends BaseReq {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String channelId;
    private int deviceType;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }
}
