package com.education.tutor.db.domain;

import java.util.Date;

public class TblPoll {
    private Long pollId;

    private Long topicId;

    private Long userMainId;

    private Long messageId;

    private Integer voteValue;

    private Integer voteState;

    private Date updatedAt;

    public TblPoll(Long pollId, Long topicId, Long userMainId, Long messageId, Integer voteValue, Integer voteState, Date updatedAt) {
        this.pollId = pollId;
        this.topicId = topicId;
        this.userMainId = userMainId;
        this.messageId = messageId;
        this.voteValue = voteValue;
        this.voteState = voteState;
        this.updatedAt = updatedAt;
    }

    public TblPoll() {
        super();
    }

    public Long getPollId() {
        return pollId;
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
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

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Integer getVoteValue() {
        return voteValue;
    }

    public void setVoteValue(Integer voteValue) {
        this.voteValue = voteValue;
    }

    public Integer getVoteState() {
        return voteState;
    }

    public void setVoteState(Integer voteState) {
        this.voteState = voteState;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}