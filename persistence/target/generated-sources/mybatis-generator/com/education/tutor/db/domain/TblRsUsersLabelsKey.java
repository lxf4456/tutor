package com.education.tutor.db.domain;

public class TblRsUsersLabelsKey {
    private Long labelMainId;

    private Long userMainId;

    public TblRsUsersLabelsKey(Long labelMainId, Long userMainId) {
        this.labelMainId = labelMainId;
        this.userMainId = userMainId;
    }

    public TblRsUsersLabelsKey() {
        super();
    }

    public Long getLabelMainId() {
        return labelMainId;
    }

    public void setLabelMainId(Long labelMainId) {
        this.labelMainId = labelMainId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }
}