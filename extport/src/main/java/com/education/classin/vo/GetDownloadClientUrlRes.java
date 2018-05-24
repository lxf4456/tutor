package com.education.classin.vo;

import com.education.classin.ClassInBasicRes;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class GetDownloadClientUrlRes extends ClassInBasicRes {


    private String WinXP;
    private String Win7;
    private String MacOS;
    private String CloudWinXP;
    private String CloudWin7;
    private String CloudMacOs;

    public String getWinXP() {
        return WinXP;
    }

    public void setWinXP(String winXP) {
        WinXP = winXP;
    }

    public String getWin7() {
        return Win7;
    }

    public void setWin7(String win7) {
        Win7 = win7;
    }

    public String getMacOS() {
        return MacOS;
    }

    public void setMacOS(String macOS) {
        MacOS = macOS;
    }

    public String getCloudWinXP() {
        return CloudWinXP;
    }

    public void setCloudWinXP(String cloudWinXP) {
        CloudWinXP = cloudWinXP;
    }

    public String getCloudWin7() {
        return CloudWin7;
    }

    public void setCloudWin7(String cloudWin7) {
        CloudWin7 = cloudWin7;
    }

    public String getCloudMacOs() {
        return CloudMacOs;
    }

    public void setCloudMacOs(String cloudMacOs) {
        CloudMacOs = cloudMacOs;
    }
}
