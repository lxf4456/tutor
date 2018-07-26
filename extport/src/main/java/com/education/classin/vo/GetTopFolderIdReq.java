package com.education.classin.vo;

import com.education.classin.ClassInBasicReq;

/**
 * Created by 雪峰 on 2018/7/26.
 */
public class GetTopFolderIdReq extends ClassInBasicReq {
    private transient static final String action = "getTopFolderId";

    @Override
    public String getAction() {
        return action;
    }

}
