package com.education.tutor.api.classin;

import com.education.tutor.api.BaseReq;

import java.io.File;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class AddCourseReq extends BaseReq {


    private  String courseName;
    //云盘路径，可以空
    private String folderId;
    //课程图标 可以空
    private File Filedata;
    //过期时间
    private long expiryTime;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

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

    public long getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(long expiryTime) {
        this.expiryTime = expiryTime;
    }
}
