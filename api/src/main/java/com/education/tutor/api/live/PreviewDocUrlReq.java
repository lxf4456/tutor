package com.education.tutor.api.live;

import com.education.tutor.api.BaseReq;

/**
 * Created by 雪峰 on 2018/5/13.
 */
public class PreviewDocUrlReq extends BaseReq {

    private String documentId;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
