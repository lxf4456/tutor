package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class GetDownloadClientUrlReq extends ClassInBasicReq {
    private transient static final String action = "getDownloadUrl";

    @Override
    public String getAction() {
        return action;
    }


}
