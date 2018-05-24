package com.education.classin.vo;

import java.io.Serializable;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class LiveInfo implements Serializable {

    //0:断流，1；开启，3关闭，10：从未推过刘
    private int Status;
    //拉取流地址
    private String RtmpDownstreamAddress;
    //HLS协议拉取留地址
    private String HisDownstreamAddress;
    //http flv拉流地址
    private String FlvDownstreamAddress;


    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getRtmpDownstreamAddress() {
        return RtmpDownstreamAddress;
    }

    public void setRtmpDownstreamAddress(String rtmpDownstreamAddress) {
        RtmpDownstreamAddress = rtmpDownstreamAddress;
    }

    public String getHisDownstreamAddress() {
        return HisDownstreamAddress;
    }

    public void setHisDownstreamAddress(String hisDownstreamAddress) {
        HisDownstreamAddress = hisDownstreamAddress;
    }

    public String getFlvDownstreamAddress() {
        return FlvDownstreamAddress;
    }

    public void setFlvDownstreamAddress(String flvDownstreamAddress) {
        FlvDownstreamAddress = flvDownstreamAddress;
    }
}
