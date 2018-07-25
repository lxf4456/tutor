package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/7/21.
 */
public class CreateFolderReq extends ClassInBasicReq {

    private transient static final String action = "createFolder";

    @Override
    public String getAction() {
        return action;
    }

    private String folderId;

    private String folderName;


    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
}
