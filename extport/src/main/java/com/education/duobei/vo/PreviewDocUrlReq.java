package com.education.duobei.vo;

import com.education.duobei.DuoBeiBasicReq;

/**
 * Created by 雪峰 on 2018/5/13.
 */
public class PreviewDocUrlReq extends DuoBeiBasicReq {

    private String documentId;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
