package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/7/21.
 */
public class DelFileReq extends ClassInBasicReq {

    private transient static final String action = "delFile";

    @Override
    public String getAction() {
        return action;
    }

    private String fileId;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
