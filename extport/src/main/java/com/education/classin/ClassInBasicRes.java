package com.education.classin;

import java.io.Serializable;

public class ClassInBasicRes implements Serializable {
    private String error;
    private int errno = 0;
    private String data;



    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
