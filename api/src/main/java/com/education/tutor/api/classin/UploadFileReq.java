package com.education.tutor.api.classin;

import com.education.tutor.api.BaseReq;

/**
 * Created by 雪峰 on 2018/7/21.
 */
public class UploadFileReq extends BaseReq {



    private String folderId;
    private String url;


    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
