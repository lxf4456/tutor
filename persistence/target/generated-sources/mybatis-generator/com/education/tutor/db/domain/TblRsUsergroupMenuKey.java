package com.education.tutor.db.domain;

public class TblRsUsergroupMenuKey {
    private Long menuId;

    private Long ownerPk;

    private Integer ownerType;

    public TblRsUsergroupMenuKey(Long menuId, Long ownerPk, Integer ownerType) {
        this.menuId = menuId;
        this.ownerPk = ownerPk;
        this.ownerType = ownerType;
    }

    public TblRsUsergroupMenuKey() {
        super();
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getOwnerPk() {
        return ownerPk;
    }

    public void setOwnerPk(Long ownerPk) {
        this.ownerPk = ownerPk;
    }

    public Integer getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }
}