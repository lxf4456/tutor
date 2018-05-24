package com.education.classin.vo;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class VodInfo implements Serializable {

    //2：正常，4：转码中，6：删除中，7：转码失败，21合并中，23：合并失败，100：已删除
    //-1:未上传，0：初始化，1审核不通过，3：暂停，4转码中，5发布中，6：删除中，7：转码失败
    private int Status;
    //视频总数
    private int AllCount;
    //文件数组
    private List<File> FileList;
    //视频开会时间 年-月-日 时：分：秒
    private String StartTime;
    private String EndTime;
    private String FileName;
    private String Message;
    private PlaySet PlaySet;


    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getAllCount() {
        return AllCount;
    }

    public void setAllCount(int allCount) {
        AllCount = allCount;
    }

    public List<File> getFileList() {
        return FileList;
    }

    public void setFileList(List<File> fileList) {
        FileList = fileList;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public PlaySet getPlaySet() {
        return PlaySet;
    }

    public void setPlaySet(PlaySet playSet) {
        PlaySet = playSet;
    }
}
