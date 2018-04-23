package com.education.tutor.db.domain;

public class TblAppVersion {
    private Long appVersionId;

    private String appName;

    private String appVersionNo;

    private String appVersionTag;

    private String appVersionDesc;

    private String appAndroidOsNo;

    private String appIosOsNo;

    private String appAndroidReleaseNote;

    private String appIosReleaseNote;

    private String appAndroidReq;

    private String appIosReq;

    private String appAndroidUrl;

    private String appIosUrl;

    private Short androidForceUpdate;

    private Short iosForceUpdate;

    private String appVersionDescZh;

    private String appVersionDescRu;

    private String appVersionDescSp;

    private String appVersionDescFr;

    public TblAppVersion(Long appVersionId, String appName, String appVersionNo, String appVersionTag, String appVersionDesc, String appAndroidOsNo, String appIosOsNo, String appAndroidReleaseNote, String appIosReleaseNote, String appAndroidReq, String appIosReq, String appAndroidUrl, String appIosUrl, Short androidForceUpdate, Short iosForceUpdate, String appVersionDescZh, String appVersionDescRu, String appVersionDescSp, String appVersionDescFr) {
        this.appVersionId = appVersionId;
        this.appName = appName;
        this.appVersionNo = appVersionNo;
        this.appVersionTag = appVersionTag;
        this.appVersionDesc = appVersionDesc;
        this.appAndroidOsNo = appAndroidOsNo;
        this.appIosOsNo = appIosOsNo;
        this.appAndroidReleaseNote = appAndroidReleaseNote;
        this.appIosReleaseNote = appIosReleaseNote;
        this.appAndroidReq = appAndroidReq;
        this.appIosReq = appIosReq;
        this.appAndroidUrl = appAndroidUrl;
        this.appIosUrl = appIosUrl;
        this.androidForceUpdate = androidForceUpdate;
        this.iosForceUpdate = iosForceUpdate;
        this.appVersionDescZh = appVersionDescZh;
        this.appVersionDescRu = appVersionDescRu;
        this.appVersionDescSp = appVersionDescSp;
        this.appVersionDescFr = appVersionDescFr;
    }

    public TblAppVersion() {
        super();
    }

    public Long getAppVersionId() {
        return appVersionId;
    }

    public void setAppVersionId(Long appVersionId) {
        this.appVersionId = appVersionId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppVersionNo() {
        return appVersionNo;
    }

    public void setAppVersionNo(String appVersionNo) {
        this.appVersionNo = appVersionNo == null ? null : appVersionNo.trim();
    }

    public String getAppVersionTag() {
        return appVersionTag;
    }

    public void setAppVersionTag(String appVersionTag) {
        this.appVersionTag = appVersionTag == null ? null : appVersionTag.trim();
    }

    public String getAppVersionDesc() {
        return appVersionDesc;
    }

    public void setAppVersionDesc(String appVersionDesc) {
        this.appVersionDesc = appVersionDesc == null ? null : appVersionDesc.trim();
    }

    public String getAppAndroidOsNo() {
        return appAndroidOsNo;
    }

    public void setAppAndroidOsNo(String appAndroidOsNo) {
        this.appAndroidOsNo = appAndroidOsNo == null ? null : appAndroidOsNo.trim();
    }

    public String getAppIosOsNo() {
        return appIosOsNo;
    }

    public void setAppIosOsNo(String appIosOsNo) {
        this.appIosOsNo = appIosOsNo == null ? null : appIosOsNo.trim();
    }

    public String getAppAndroidReleaseNote() {
        return appAndroidReleaseNote;
    }

    public void setAppAndroidReleaseNote(String appAndroidReleaseNote) {
        this.appAndroidReleaseNote = appAndroidReleaseNote == null ? null : appAndroidReleaseNote.trim();
    }

    public String getAppIosReleaseNote() {
        return appIosReleaseNote;
    }

    public void setAppIosReleaseNote(String appIosReleaseNote) {
        this.appIosReleaseNote = appIosReleaseNote == null ? null : appIosReleaseNote.trim();
    }

    public String getAppAndroidReq() {
        return appAndroidReq;
    }

    public void setAppAndroidReq(String appAndroidReq) {
        this.appAndroidReq = appAndroidReq == null ? null : appAndroidReq.trim();
    }

    public String getAppIosReq() {
        return appIosReq;
    }

    public void setAppIosReq(String appIosReq) {
        this.appIosReq = appIosReq == null ? null : appIosReq.trim();
    }

    public String getAppAndroidUrl() {
        return appAndroidUrl;
    }

    public void setAppAndroidUrl(String appAndroidUrl) {
        this.appAndroidUrl = appAndroidUrl == null ? null : appAndroidUrl.trim();
    }

    public String getAppIosUrl() {
        return appIosUrl;
    }

    public void setAppIosUrl(String appIosUrl) {
        this.appIosUrl = appIosUrl == null ? null : appIosUrl.trim();
    }

    public Short getAndroidForceUpdate() {
        return androidForceUpdate;
    }

    public void setAndroidForceUpdate(Short androidForceUpdate) {
        this.androidForceUpdate = androidForceUpdate;
    }

    public Short getIosForceUpdate() {
        return iosForceUpdate;
    }

    public void setIosForceUpdate(Short iosForceUpdate) {
        this.iosForceUpdate = iosForceUpdate;
    }

    public String getAppVersionDescZh() {
        return appVersionDescZh;
    }

    public void setAppVersionDescZh(String appVersionDescZh) {
        this.appVersionDescZh = appVersionDescZh == null ? null : appVersionDescZh.trim();
    }

    public String getAppVersionDescRu() {
        return appVersionDescRu;
    }

    public void setAppVersionDescRu(String appVersionDescRu) {
        this.appVersionDescRu = appVersionDescRu == null ? null : appVersionDescRu.trim();
    }

    public String getAppVersionDescSp() {
        return appVersionDescSp;
    }

    public void setAppVersionDescSp(String appVersionDescSp) {
        this.appVersionDescSp = appVersionDescSp == null ? null : appVersionDescSp.trim();
    }

    public String getAppVersionDescFr() {
        return appVersionDescFr;
    }

    public void setAppVersionDescFr(String appVersionDescFr) {
        this.appVersionDescFr = appVersionDescFr == null ? null : appVersionDescFr.trim();
    }
}