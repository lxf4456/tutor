package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

import java.io.File;

/**
 * Created by 雪峰 on 2018/7/21.
 */
public class UploadFileReq extends ClassInBasicReq {


    private transient static final String action = "uploadFile";
    @Override
    public String getAction() {
        return action;
    }

    private String folderId;
    private File Filedata;


    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public File getFiledata() {
        return Filedata;
    }

    public void setFiledata(File filedata) {
        Filedata = filedata;
    }
}
