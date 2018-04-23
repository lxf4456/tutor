package com.education.tutor.db.domain;

public class TblDataRegion {
    private Integer id;

    private Integer pid;

    private String path;

    private Integer level;

    private String name;

    private String nameEn;

    private String namePinyin;

    private String code;

    private String ownerRegion;

    private String nameRu;

    private String location;

    private String projectNum;

    public TblDataRegion(Integer id, Integer pid, String path, Integer level, String name, String nameEn, String namePinyin, String code, String ownerRegion, String nameRu, String location, String projectNum) {
        this.id = id;
        this.pid = pid;
        this.path = path;
        this.level = level;
        this.name = name;
        this.nameEn = nameEn;
        this.namePinyin = namePinyin;
        this.code = code;
        this.ownerRegion = ownerRegion;
        this.nameRu = nameRu;
        this.location = location;
        this.projectNum = projectNum;
    }

    public TblDataRegion() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin == null ? null : namePinyin.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getOwnerRegion() {
        return ownerRegion;
    }

    public void setOwnerRegion(String ownerRegion) {
        this.ownerRegion = ownerRegion == null ? null : ownerRegion.trim();
    }

    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu == null ? null : nameRu.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum == null ? null : projectNum.trim();
    }
}