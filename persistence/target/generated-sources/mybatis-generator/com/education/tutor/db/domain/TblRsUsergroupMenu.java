package com.education.tutor.db.domain;

public class TblRsUsergroupMenu extends TblRsUsergroupMenuKey {
    private Integer menuLevel;

    public TblRsUsergroupMenu(Long menuId, Long ownerPk, Integer ownerType, Integer menuLevel) {
        super(menuId, ownerPk, ownerType);
        this.menuLevel = menuLevel;
    }

    public TblRsUsergroupMenu() {
        super();
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }
}