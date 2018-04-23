package com.education.tutor.db.domain;

import java.util.Date;

public class TblUserActivity {
    private Long userActivityId;

    private Long userMainId;

    private String userActivityName;

    private Integer userActivityType;

    private String target;

    private Integer targetType;

    private String message;

    private Integer userActivityState;

    private String userActivityResult;

    private String method;

    private String media;

    private String remark;

    private String url;

    private String promotion;

    private String source;

    private Date actTime;

    private Date updatedAt;

    private String updatedBy;

    public TblUserActivity(Long userActivityId, Long userMainId, String userActivityName, Integer userActivityType, String target, Integer targetType, String message, Integer userActivityState, String userActivityResult, String method, String media, String remark, String url, String promotion, String source, Date actTime, Date updatedAt, String updatedBy) {
        this.userActivityId = userActivityId;
        this.userMainId = userMainId;
        this.userActivityName = userActivityName;
        this.userActivityType = userActivityType;
        this.target = target;
        this.targetType = targetType;
        this.message = message;
        this.userActivityState = userActivityState;
        this.userActivityResult = userActivityResult;
        this.method = method;
        this.media = media;
        this.remark = remark;
        this.url = url;
        this.promotion = promotion;
        this.source = source;
        this.actTime = actTime;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblUserActivity() {
        super();
    }

    public Long getUserActivityId() {
        return userActivityId;
    }

    public void setUserActivityId(Long userActivityId) {
        this.userActivityId = userActivityId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public String getUserActivityName() {
        return userActivityName;
    }

    public void setUserActivityName(String userActivityName) {
        this.userActivityName = userActivityName == null ? null : userActivityName.trim();
    }

    public Integer getUserActivityType() {
        return userActivityType;
    }

    public void setUserActivityType(Integer userActivityType) {
        this.userActivityType = userActivityType;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getUserActivityState() {
        return userActivityState;
    }

    public void setUserActivityState(Integer userActivityState) {
        this.userActivityState = userActivityState;
    }

    public String getUserActivityResult() {
        return userActivityResult;
    }

    public void setUserActivityResult(String userActivityResult) {
        this.userActivityResult = userActivityResult == null ? null : userActivityResult.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media == null ? null : media.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion == null ? null : promotion.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getActTime() {
        return actTime;
    }

    public void setActTime(Date actTime) {
        this.actTime = actTime;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}