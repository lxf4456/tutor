package com.education.classin.vo;

import java.io.Serializable;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class PlaySet implements Serializable {
    //0：原始，1：带水印原始，10：商铺及MP4，20：表情Mp4,30:高清MP4,110：手机FLV,120:表情FLV,130,高清FLV,210:手机hls,220标清hls,230高清hls,240超高清hls
    private int Definition;
    private String Url;

    public int getDefinition() {
        return Definition;
    }

    public void setDefinition(int definition) {
        Definition = definition;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
