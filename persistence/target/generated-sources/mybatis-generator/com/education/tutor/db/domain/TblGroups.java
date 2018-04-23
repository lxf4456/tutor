package com.education.tutor.db.domain;

public class TblGroups {
    private Long id;

    private String groupName;

    private String displayLabel;

    private String groupCategory;

    private String menuArray;

    public TblGroups(Long id, String groupName, String displayLabel, String groupCategory, String menuArray) {
        this.id = id;
        this.groupName = groupName;
        this.displayLabel = displayLabel;
        this.groupCategory = groupCategory;
        this.menuArray = menuArray;
    }

    public TblGroups() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getDisplayLabel() {
        return displayLabel;
    }

    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel == null ? null : displayLabel.trim();
    }

    public String getGroupCategory() {
        return groupCategory;
    }

    public void setGroupCategory(String groupCategory) {
        this.groupCategory = groupCategory == null ? null : groupCategory.trim();
    }

    public String getMenuArray() {
        return menuArray;
    }

    public void setMenuArray(String menuArray) {
        this.menuArray = menuArray == null ? null : menuArray.trim();
    }
}