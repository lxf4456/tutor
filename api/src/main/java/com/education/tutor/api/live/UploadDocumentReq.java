package com.education.tutor.api.live;

import com.education.tutor.api.BaseReq;

import java.io.File;

/**
 * Created by 雪峰 on 2018/5/10.
 */
public class UploadDocumentReq extends BaseReq {

    private String roomId;
    private String filename;
    private File slidesFile;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public File getSlidesFile() {
        return slidesFile;
    }

    public void setSlidesFile(File slidesFile) {
        this.slidesFile = slidesFile;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
