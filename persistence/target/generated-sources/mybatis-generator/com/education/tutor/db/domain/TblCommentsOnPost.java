package com.education.tutor.db.domain;

import java.util.Date;

public class TblCommentsOnPost {
    private Long commentsOnPostId;

    private Long userMainId;

    private Long postId;

    private Long pollId;

    private Integer commentType;

    private String commentContent;

    private String commentUrl;

    private Integer commentState;

    private Long targetUserId;

    private Long targetCommentsId;

    private Date updatedAt;

    public TblCommentsOnPost(Long commentsOnPostId, Long userMainId, Long postId, Long pollId, Integer commentType, String commentContent, String commentUrl, Integer commentState, Long targetUserId, Long targetCommentsId, Date updatedAt) {
        this.commentsOnPostId = commentsOnPostId;
        this.userMainId = userMainId;
        this.postId = postId;
        this.pollId = pollId;
        this.commentType = commentType;
        this.commentContent = commentContent;
        this.commentUrl = commentUrl;
        this.commentState = commentState;
        this.targetUserId = targetUserId;
        this.targetCommentsId = targetCommentsId;
        this.updatedAt = updatedAt;
    }

    public TblCommentsOnPost() {
        super();
    }

    public Long getCommentsOnPostId() {
        return commentsOnPostId;
    }

    public void setCommentsOnPostId(Long commentsOnPostId) {
        this.commentsOnPostId = commentsOnPostId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getPollId() {
        return pollId;
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getCommentUrl() {
        return commentUrl;
    }

    public void setCommentUrl(String commentUrl) {
        this.commentUrl = commentUrl == null ? null : commentUrl.trim();
    }

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }

    public Long getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
    }

    public Long getTargetCommentsId() {
        return targetCommentsId;
    }

    public void setTargetCommentsId(Long targetCommentsId) {
        this.targetCommentsId = targetCommentsId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}