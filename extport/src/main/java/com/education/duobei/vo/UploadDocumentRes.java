package com.education.duobei.vo;

import com.education.duobei.DuoBeiBasicRes;

/**
 * Created by 雪峰 on 2018/5/10.
 */
public class UploadDocumentRes extends DuoBeiBasicRes {

    private String uuid;

    private String documentId;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
