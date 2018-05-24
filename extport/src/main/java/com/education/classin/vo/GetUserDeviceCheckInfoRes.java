package com.education.classin.vo;

import com.education.classin.ClassInBasicRes;

/**
 * Created by 雪峰 on 2018/5/7.
 */
public class GetUserDeviceCheckInfoRes extends ClassInBasicRes {
    //操作系统
    private String OperatingSystem;
    //服务器名称
    private String ServerName;
    //用户IP
    private String ClientIP;
    //用户CPU
    private String CPU;
    //w网络延迟
    private String NetworkDelay;
    //丢包率
    private String FrameLoss;
    //用户麦克状态1:正常，2：不正常
    private int MicrophoneArbitrary;
    //用户耳机状态1:正常，2不正常
    private int HeadphoneArbitrary;
    //用户摄像头状态1：正常，2：不正常
    private int CameraArbitrary;
    //摄像头名称
    private  String EEO_VIDEO_DEVICE_NAME;
    //麦克名称
    private String EEO_AUDIO_DEVICE_NAME;
    //耳机设备名称
    private String EEO_AUDIO_OUTPUT_NAME;
    //程序检车麦克的状态1：正常，2不正常
    private int MicrophoneImpersonal;
    //程序检测耳机状态1：正常，2：不正常
    private int HeadphoneImpersonal;
    //程序检测摄像头状态
    private int CameraImpersonal;
    //客户端版本
    private String ClassInVersion;
    private String Mac;
    //检测时间
    private long addTime;


    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getServerName() {
        return ServerName;
    }

    public void setServerName(String serverName) {
        ServerName = serverName;
    }

    public String getClientIP() {
        return ClientIP;
    }

    public void setClientIP(String clientIP) {
        ClientIP = clientIP;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getNetworkDelay() {
        return NetworkDelay;
    }

    public void setNetworkDelay(String networkDelay) {
        NetworkDelay = networkDelay;
    }

    public String getFrameLoss() {
        return FrameLoss;
    }

    public void setFrameLoss(String frameLoss) {
        FrameLoss = frameLoss;
    }

    public int getMicrophoneArbitrary() {
        return MicrophoneArbitrary;
    }

    public void setMicrophoneArbitrary(int microphoneArbitrary) {
        MicrophoneArbitrary = microphoneArbitrary;
    }

    public int getHeadphoneArbitrary() {
        return HeadphoneArbitrary;
    }

    public void setHeadphoneArbitrary(int headphoneArbitrary) {
        HeadphoneArbitrary = headphoneArbitrary;
    }

    public int getCameraArbitrary() {
        return CameraArbitrary;
    }

    public void setCameraArbitrary(int cameraArbitrary) {
        CameraArbitrary = cameraArbitrary;
    }

    public String getEEO_VIDEO_DEVICE_NAME() {
        return EEO_VIDEO_DEVICE_NAME;
    }

    public void setEEO_VIDEO_DEVICE_NAME(String EEO_VIDEO_DEVICE_NAME) {
        this.EEO_VIDEO_DEVICE_NAME = EEO_VIDEO_DEVICE_NAME;
    }

    public String getEEO_AUDIO_DEVICE_NAME() {
        return EEO_AUDIO_DEVICE_NAME;
    }

    public void setEEO_AUDIO_DEVICE_NAME(String EEO_AUDIO_DEVICE_NAME) {
        this.EEO_AUDIO_DEVICE_NAME = EEO_AUDIO_DEVICE_NAME;
    }

    public String getEEO_AUDIO_OUTPUT_NAME() {
        return EEO_AUDIO_OUTPUT_NAME;
    }

    public void setEEO_AUDIO_OUTPUT_NAME(String EEO_AUDIO_OUTPUT_NAME) {
        this.EEO_AUDIO_OUTPUT_NAME = EEO_AUDIO_OUTPUT_NAME;
    }

    public int getMicrophoneImpersonal() {
        return MicrophoneImpersonal;
    }

    public void setMicrophoneImpersonal(int microphoneImpersonal) {
        MicrophoneImpersonal = microphoneImpersonal;
    }

    public int getHeadphoneImpersonal() {
        return HeadphoneImpersonal;
    }

    public void setHeadphoneImpersonal(int headphoneImpersonal) {
        HeadphoneImpersonal = headphoneImpersonal;
    }

    public int getCameraImpersonal() {
        return CameraImpersonal;
    }

    public void setCameraImpersonal(int cameraImpersonal) {
        CameraImpersonal = cameraImpersonal;
    }

    public String getClassInVersion() {
        return ClassInVersion;
    }

    public void setClassInVersion(String classInVersion) {
        ClassInVersion = classInVersion;
    }

    public String getMac() {
        return Mac;
    }

    public void setMac(String mac) {
        Mac = mac;
    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }
}
