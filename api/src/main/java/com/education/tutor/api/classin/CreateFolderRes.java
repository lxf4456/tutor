package com.education.tutor.api.classin;

import com.education.tutor.api.BaseRes;

/**
 * Created by 雪峰 on 2018/7/21.
 */
public class CreateFolderRes extends BaseRes {
    private String folderId;

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }
}
