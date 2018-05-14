package com.education.duobei.vo;

import com.education.duobei.DuoBeiBasicReq;

import java.io.File;

/**
 * Created by 雪峰 on 2018/5/10.
 */
public class UploadDocumentReq extends DuoBeiBasicReq {
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
}
