package com.education.tutor.db.domain;

public class TblRsPartnerKey {
    private Long upperId;

    private Long userMainId;

    public TblRsPartnerKey(Long upperId, Long userMainId) {
        this.upperId = upperId;
        this.userMainId = userMainId;
    }

    public TblRsPartnerKey() {
        super();
    }

    public Long getUpperId() {
        return upperId;
    }

    public void setUpperId(Long upperId) {
        this.upperId = upperId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }
}