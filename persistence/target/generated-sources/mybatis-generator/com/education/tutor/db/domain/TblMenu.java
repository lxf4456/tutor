package com.education.tutor.db.domain;

import java.util.Date;

public class TblMenu {
    private Long menuId;

    private String menuName;

    private String menuLang;

    private String menuUrl;

    private Integer menuStatus;

    private Long menuParentId;

    private Integer menuType;

    private String iconcls;

    private Integer expand;

    private Integer sortNo;

    private Integer isShow;

    private String permission;

    private String remark;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    public TblMenu(Long menuId, String menuName, String menuLang, String menuUrl, Integer menuStatus, Long menuParentId, Integer menuType, String iconcls, Integer expand, Integer sortNo, Integer isShow, String permission, String remark, String createdBy, Date createdAt, String updatedBy, Date updatedAt) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuLang = menuLang;
        this.menuUrl = menuUrl;
        this.menuStatus = menuStatus;
        this.menuParentId = menuParentId;
        this.menuType = menuType;
        this.iconcls = iconcls;
        this.expand = expand;
        this.sortNo = sortNo;
        this.isShow = isShow;
        this.permission = permission;
        this.remark = remark;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public TblMenu() {
        super();
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuLang() {
        return menuLang;
    }

    public void setMenuLang(String menuLang) {
        this.menuLang = menuLang == null ? null : menuLang.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    public Long getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Long menuParentId) {
        this.menuParentId = menuParentId;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls == null ? null : iconcls.trim();
    }

    public Integer getExpand() {
        return expand;
    }

    public void setExpand(Integer expand) {
        this.expand = expand;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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