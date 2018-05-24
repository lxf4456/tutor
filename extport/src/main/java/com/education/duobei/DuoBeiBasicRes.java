package com.education.duobei;

import java.io.Serializable;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class DuoBeiBasicRes implements Serializable {

    private boolean success = false;

    private String error;

    public DuoBeiBasicRes(){}

    public DuoBeiBasicRes(boolean success,String error){
        this.success = success;
        this.error = error;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
