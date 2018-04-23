package com.education.tutor.db.domain;

public class TblRsOrdersAccountDetailKey {
    private Long accountDetailId;

    private Long orderMainId;

    public TblRsOrdersAccountDetailKey(Long accountDetailId, Long orderMainId) {
        this.accountDetailId = accountDetailId;
        this.orderMainId = orderMainId;
    }

    public TblRsOrdersAccountDetailKey() {
        super();
    }

    public Long getAccountDetailId() {
        return accountDetailId;
    }

    public void setAccountDetailId(Long accountDetailId) {
        this.accountDetailId = accountDetailId;
    }

    public Long getOrderMainId() {
        return orderMainId;
    }

    public void setOrderMainId(Long orderMainId) {
        this.orderMainId = orderMainId;
    }
}