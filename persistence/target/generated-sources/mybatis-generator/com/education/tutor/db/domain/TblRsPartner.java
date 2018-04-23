package com.education.tutor.db.domain;

public class TblRsPartner extends TblRsPartnerKey {
    private Long partnerInfo;

    public TblRsPartner(Long upperId, Long userMainId, Long partnerInfo) {
        super(upperId, userMainId);
        this.partnerInfo = partnerInfo;
    }

    public TblRsPartner() {
        super();
    }

    public Long getPartnerInfo() {
        return partnerInfo;
    }

    public void setPartnerInfo(Long partnerInfo) {
        this.partnerInfo = partnerInfo;
    }
}