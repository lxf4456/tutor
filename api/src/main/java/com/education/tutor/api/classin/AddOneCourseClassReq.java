package com.education.tutor.api.classin;


import com.education.tutor.api.BaseReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class AddOneCourseClassReq extends BaseReq {

    private long courseId;
    //课程名称
    private String className;
//开始时间
    private long beginTime;
//结束时间
    private long endTime;

    //教师账号
    private String teacherAccount;
    //教师名称
    private String teacherName;
    //默认为6，最大上限值调整为12
    private int seatNum;
    private String folderId;




    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getTeacherAccount() {
        return teacherAccount;
    }

    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }
}
