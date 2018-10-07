package com.education.tutor.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 雪峰 on 2018/10/7.
 */
public class EmailUser implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private String userName;

    private Date start;

    private Date end;

    private String vaule;

    private String email;

    private String timezone;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getVaule() {
        return vaule;
    }

    public void setVaule(String vaule) {
        this.vaule = vaule;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
