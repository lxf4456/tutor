package com.education.tutor.api.classin;

import com.education.tutor.api.BaseReq;

import java.io.File;

/**
 * Created by 雪峰 on 2018/5/6.
 */
public class EditTeacherReq extends BaseReq {

    private long st_id;
    private String teacherName;
    private File Filedata;

    public long getSt_id() {
        return st_id;
    }

    public void setSt_id(long st_id) {
        this.st_id = st_id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public File getFiledata() {
        return Filedata;
    }

    public void setFiledata(File filedata) {
        Filedata = filedata;
    }
}
