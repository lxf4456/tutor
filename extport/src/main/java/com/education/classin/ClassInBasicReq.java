package com.education.classin;

import java.io.Serializable;

/**
 * Created by 雪峰 on 2018/5/5.
 */
public abstract class ClassInBasicReq implements Serializable {
    public abstract String getAction();

    //默认值1是classin 课程地址，2是classin云端地址
    private int url_type = 1;

    public int getUrl_type() {
        return url_type;
    }

    public void setUrl_type(int url_type) {
        this.url_type = url_type;
    }
}
