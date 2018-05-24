package com.education.classin;

import java.io.Serializable;

/**
 * Created by 雪峰 on 2018/5/5.
 */
public class ClassInResult implements Serializable {
    private String data ;
    private String error_info;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }


}
