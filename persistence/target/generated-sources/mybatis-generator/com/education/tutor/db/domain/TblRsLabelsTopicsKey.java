package com.education.tutor.db.domain;

public class TblRsLabelsTopicsKey {
    private Long topicId;

    private Long labelMainId;

    public TblRsLabelsTopicsKey(Long topicId, Long labelMainId) {
        this.topicId = topicId;
        this.labelMainId = labelMainId;
    }

    public TblRsLabelsTopicsKey() {
        super();
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getLabelMainId() {
        return labelMainId;
    }

    public void setLabelMainId(Long labelMainId) {
        this.labelMainId = labelMainId;
    }
}