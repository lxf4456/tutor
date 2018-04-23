package com.education.tutor.db.domain;

import java.util.Date;

public class TblSmsLog {
    private Long smsLogId;

    private String channel;

    private String countryCode;

    private String mobile;

    private String content;

    private Integer status;

    private Integer fee;

    private String resultCode;

    private String reason;

    private Date updatedAt;

    public TblSmsLog(Long smsLogId, String channel, String countryCode, String mobile, String content, Integer status, Integer fee, String resultCode, String reason, Date updatedAt) {
        this.smsLogId = smsLogId;
        this.channel = channel;
        this.countryCode = countryCode;
        this.mobile = mobile;
        this.content = content;
        this.status = status;
        this.fee = fee;
        this.resultCode = resultCode;
        this.reason = reason;
        this.updatedAt = updatedAt;
    }

    public TblSmsLog() {
        super();
    }

    public Long getSmsLogId() {
        return smsLogId;
    }

    public void setSmsLogId(Long smsLogId) {
        this.smsLogId = smsLogId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}