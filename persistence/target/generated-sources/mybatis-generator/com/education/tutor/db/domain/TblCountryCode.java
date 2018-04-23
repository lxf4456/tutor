package com.education.tutor.db.domain;

public class TblCountryCode {
    private Integer countryId;

    private String countryEn;

    private String countryCn;

    private String countryLg;

    private String countryCode;

    private Integer status;

    public TblCountryCode(Integer countryId, String countryEn, String countryCn, String countryLg, String countryCode, Integer status) {
        this.countryId = countryId;
        this.countryEn = countryEn;
        this.countryCn = countryCn;
        this.countryLg = countryLg;
        this.countryCode = countryCode;
        this.status = status;
    }

    public TblCountryCode() {
        super();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryEn() {
        return countryEn;
    }

    public void setCountryEn(String countryEn) {
        this.countryEn = countryEn == null ? null : countryEn.trim();
    }

    public String getCountryCn() {
        return countryCn;
    }

    public void setCountryCn(String countryCn) {
        this.countryCn = countryCn == null ? null : countryCn.trim();
    }

    public String getCountryLg() {
        return countryLg;
    }

    public void setCountryLg(String countryLg) {
        this.countryLg = countryLg == null ? null : countryLg.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}