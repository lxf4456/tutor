package com.education.tutor.api.live;

import com.education.tutor.api.BaseReq;

/**
 * Created by 雪峰 on 2018/6/2.
 */
public class UploadFileUrlReq extends BaseReq {

    private String roomId;
    private String filename;
    private String fileUrl;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
