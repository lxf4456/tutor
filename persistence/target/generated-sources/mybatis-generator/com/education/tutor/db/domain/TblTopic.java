package com.education.tutor.db.domain;

import java.util.Date;

public class TblTopic {
    private Long topicId;

    private Long userMainId;

    private String topicTitle;

    private String topicAbstract;

    private String topicKeywords;

    private Integer topicType;

    private Long topicComment;

    private Long topicMogoid;

    private String topicUrl;

    private Integer topicState;

    private Integer topicSource;

    private String defaultLang;

    private Long parentTopic;

    private Integer recommandLevel;

    private Long topicUpvote;

    private Long topicTread;

    private Long topicRewardNum;

    private Long topicCollect;

    private Long topicReward;

    private Long socialGroupPk;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    private Integer isStick;

    private Integer price;

    private Integer isPrivate;

    private Long spiderOrganizationId;

    private String spiderUrl;

    private Date startTime;

    private Date endTime;

    private String hostPlace;

    private String topicContent;

    public TblTopic(Long topicId, Long userMainId, String topicTitle, String topicAbstract, String topicKeywords, Integer topicType, Long topicComment, Long topicMogoid, String topicUrl, Integer topicState, Integer topicSource, String defaultLang, Long parentTopic, Integer recommandLevel, Long topicUpvote, Long topicTread, Long topicRewardNum, Long topicCollect, Long topicReward, Long socialGroupPk, Date createdAt, Date updatedAt, String updatedBy, Integer isStick, Integer price, Integer isPrivate, Long spiderOrganizationId, String spiderUrl, Date startTime, Date endTime, String hostPlace, String topicContent) {
        this.topicId = topicId;
        this.userMainId = userMainId;
        this.topicTitle = topicTitle;
        this.topicAbstract = topicAbstract;
        this.topicKeywords = topicKeywords;
        this.topicType = topicType;
        this.topicComment = topicComment;
        this.topicMogoid = topicMogoid;
        this.topicUrl = topicUrl;
        this.topicState = topicState;
        this.topicSource = topicSource;
        this.defaultLang = defaultLang;
        this.parentTopic = parentTopic;
        this.recommandLevel = recommandLevel;
        this.topicUpvote = topicUpvote;
        this.topicTread = topicTread;
        this.topicRewardNum = topicRewardNum;
        this.topicCollect = topicCollect;
        this.topicReward = topicReward;
        this.socialGroupPk = socialGroupPk;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.isStick = isStick;
        this.price = price;
        this.isPrivate = isPrivate;
        this.spiderOrganizationId = spiderOrganizationId;
        this.spiderUrl = spiderUrl;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hostPlace = hostPlace;
        this.topicContent = topicContent;
    }

    public TblTopic() {
        super();
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle == null ? null : topicTitle.trim();
    }

    public String getTopicAbstract() {
        return topicAbstract;
    }

    public void setTopicAbstract(String topicAbstract) {
        this.topicAbstract = topicAbstract == null ? null : topicAbstract.trim();
    }

    public String getTopicKeywords() {
        return topicKeywords;
    }

    public void setTopicKeywords(String topicKeywords) {
        this.topicKeywords = topicKeywords == null ? null : topicKeywords.trim();
    }

    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    public Long getTopicComment() {
        return topicComment;
    }

    public void setTopicComment(Long topicComment) {
        this.topicComment = topicComment;
    }

    public Long getTopicMogoid() {
        return topicMogoid;
    }

    public void setTopicMogoid(Long topicMogoid) {
        this.topicMogoid = topicMogoid;
    }

    public String getTopicUrl() {
        return topicUrl;
    }

    public void setTopicUrl(String topicUrl) {
        this.topicUrl = topicUrl == null ? null : topicUrl.trim();
    }

    public Integer getTopicState() {
        return topicState;
    }

    public void setTopicState(Integer topicState) {
        this.topicState = topicState;
    }

    public Integer getTopicSource() {
        return topicSource;
    }

    public void setTopicSource(Integer topicSource) {
        this.topicSource = topicSource;
    }

    public String getDefaultLang() {
        return defaultLang;
    }

    public void setDefaultLang(String defaultLang) {
        this.defaultLang = defaultLang == null ? null : defaultLang.trim();
    }

    public Long getParentTopic() {
        return parentTopic;
    }

    public void setParentTopic(Long parentTopic) {
        this.parentTopic = parentTopic;
    }

    public Integer getRecommandLevel() {
        return recommandLevel;
    }

    public void setRecommandLevel(Integer recommandLevel) {
        this.recommandLevel = recommandLevel;
    }

    public Long getTopicUpvote() {
        return topicUpvote;
    }

    public void setTopicUpvote(Long topicUpvote) {
        this.topicUpvote = topicUpvote;
    }

    public Long getTopicTread() {
        return topicTread;
    }

    public void setTopicTread(Long topicTread) {
        this.topicTread = topicTread;
    }

    public Long getTopicRewardNum() {
        return topicRewardNum;
    }

    public void setTopicRewardNum(Long topicRewardNum) {
        this.topicRewardNum = topicRewardNum;
    }

    public Long getTopicCollect() {
        return topicCollect;
    }

    public void setTopicCollect(Long topicCollect) {
        this.topicCollect = topicCollect;
    }

    public Long getTopicReward() {
        return topicReward;
    }

    public void setTopicReward(Long topicReward) {
        this.topicReward = topicReward;
    }

    public Long getSocialGroupPk() {
        return socialGroupPk;
    }

    public void setSocialGroupPk(Long socialGroupPk) {
        this.socialGroupPk = socialGroupPk;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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

    public Integer getIsStick() {
        return isStick;
    }

    public void setIsStick(Integer isStick) {
        this.isStick = isStick;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Long getSpiderOrganizationId() {
        return spiderOrganizationId;
    }

    public void setSpiderOrganizationId(Long spiderOrganizationId) {
        this.spiderOrganizationId = spiderOrganizationId;
    }

    public String getSpiderUrl() {
        return spiderUrl;
    }

    public void setSpiderUrl(String spiderUrl) {
        this.spiderUrl = spiderUrl == null ? null : spiderUrl.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getHostPlace() {
        return hostPlace;
    }

    public void setHostPlace(String hostPlace) {
        this.hostPlace = hostPlace == null ? null : hostPlace.trim();
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent == null ? null : topicContent.trim();
    }
}