package com.education.tutor.db.domain;

import java.util.Date;

public class TblPost {
    private Long postId;

    private Long userMainId;

    private Long topicId;

    private Long messageId;

    private String postTitle;

    private String postContent;

    private String postUrl;

    private Integer postState;

    private String keywords;

    private String postAbstract;

    private String updatedBy;

    private Date updatedAt;

    public TblPost(Long postId, Long userMainId, Long topicId, Long messageId, String postTitle, String postContent, String postUrl, Integer postState, String keywords, String postAbstract, String updatedBy, Date updatedAt) {
        this.postId = postId;
        this.userMainId = userMainId;
        this.topicId = topicId;
        this.messageId = messageId;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postUrl = postUrl;
        this.postState = postState;
        this.keywords = keywords;
        this.postAbstract = postAbstract;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblPost() {
        super();
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl == null ? null : postUrl.trim();
    }

    public Integer getPostState() {
        return postState;
    }

    public void setPostState(Integer postState) {
        this.postState = postState;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getPostAbstract() {
        return postAbstract;
    }

    public void setPostAbstract(String postAbstract) {
        this.postAbstract = postAbstract == null ? null : postAbstract.trim();
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}