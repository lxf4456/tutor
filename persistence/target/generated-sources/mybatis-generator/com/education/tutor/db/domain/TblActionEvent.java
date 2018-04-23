package com.education.tutor.db.domain;

import java.util.Date;

public class TblActionEvent {
    private Long actionEventId;

    private Long userMainId;

    private Integer actionEventType;

    private Integer actionEventDomain;

    private String actionEventDesc;

    private String beforeState;

    private String afterState;

    private String primaryTableName;

    private Long primaryDataId;

    private Integer transactionState;

    private String occuredIp;

    private String occuredLocation;

    private String occuredDevice;

    private Date occuredAt;

    public TblActionEvent(Long actionEventId, Long userMainId, Integer actionEventType, Integer actionEventDomain, String actionEventDesc, String beforeState, String afterState, String primaryTableName, Long primaryDataId, Integer transactionState, String occuredIp, String occuredLocation, String occuredDevice, Date occuredAt) {
        this.actionEventId = actionEventId;
        this.userMainId = userMainId;
        this.actionEventType = actionEventType;
        this.actionEventDomain = actionEventDomain;
        this.actionEventDesc = actionEventDesc;
        this.beforeState = beforeState;
        this.afterState = afterState;
        this.primaryTableName = primaryTableName;
        this.primaryDataId = primaryDataId;
        this.transactionState = transactionState;
        this.occuredIp = occuredIp;
        this.occuredLocation = occuredLocation;
        this.occuredDevice = occuredDevice;
        this.occuredAt = occuredAt;
    }

    public TblActionEvent() {
        super();
    }

    public Long getActionEventId() {
        return actionEventId;
    }

    public void setActionEventId(Long actionEventId) {
        this.actionEventId = actionEventId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Integer getActionEventType() {
        return actionEventType;
    }

    public void setActionEventType(Integer actionEventType) {
        this.actionEventType = actionEventType;
    }

    public Integer getActionEventDomain() {
        return actionEventDomain;
    }

    public void setActionEventDomain(Integer actionEventDomain) {
        this.actionEventDomain = actionEventDomain;
    }

    public String getActionEventDesc() {
        return actionEventDesc;
    }

    public void setActionEventDesc(String actionEventDesc) {
        this.actionEventDesc = actionEventDesc == null ? null : actionEventDesc.trim();
    }

    public String getBeforeState() {
        return beforeState;
    }

    public void setBeforeState(String beforeState) {
        this.beforeState = beforeState == null ? null : beforeState.trim();
    }

    public String getAfterState() {
        return afterState;
    }

    public void setAfterState(String afterState) {
        this.afterState = afterState == null ? null : afterState.trim();
    }

    public String getPrimaryTableName() {
        return primaryTableName;
    }

    public void setPrimaryTableName(String primaryTableName) {
        this.primaryTableName = primaryTableName == null ? null : primaryTableName.trim();
    }

    public Long getPrimaryDataId() {
        return primaryDataId;
    }

    public void setPrimaryDataId(Long primaryDataId) {
        this.primaryDataId = primaryDataId;
    }

    public Integer getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(Integer transactionState) {
        this.transactionState = transactionState;
    }

    public String getOccuredIp() {
        return occuredIp;
    }

    public void setOccuredIp(String occuredIp) {
        this.occuredIp = occuredIp == null ? null : occuredIp.trim();
    }

    public String getOccuredLocation() {
        return occuredLocation;
    }

    public void setOccuredLocation(String occuredLocation) {
        this.occuredLocation = occuredLocation == null ? null : occuredLocation.trim();
    }

    public String getOccuredDevice() {
        return occuredDevice;
    }

    public void setOccuredDevice(String occuredDevice) {
        this.occuredDevice = occuredDevice == null ? null : occuredDevice.trim();
    }

    public Date getOccuredAt() {
        return occuredAt;
    }

    public void setOccuredAt(Date occuredAt) {
        this.occuredAt = occuredAt;
    }
}