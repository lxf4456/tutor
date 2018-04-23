package com.education.tutor.db.domain;

import java.util.Date;

public class TblContract {
    private Long contractId;

    private Long projectId;

    private Long organizationId;

    private String contractName;

    private String contractCode;

    private String contractDocUrl;

    private Integer contractType;

    private Integer contractState;

    private Date contractStart;

    private Date contractEnd;

    private String contractStep;

    private Integer contractAmount;

    private Integer contractCurrency;

    private Date createdAt;

    private Date updatedAt;

    private String updatedBy;

    public TblContract(Long contractId, Long projectId, Long organizationId, String contractName, String contractCode, String contractDocUrl, Integer contractType, Integer contractState, Date contractStart, Date contractEnd, String contractStep, Integer contractAmount, Integer contractCurrency, Date createdAt, Date updatedAt, String updatedBy) {
        this.contractId = contractId;
        this.projectId = projectId;
        this.organizationId = organizationId;
        this.contractName = contractName;
        this.contractCode = contractCode;
        this.contractDocUrl = contractDocUrl;
        this.contractType = contractType;
        this.contractState = contractState;
        this.contractStart = contractStart;
        this.contractEnd = contractEnd;
        this.contractStep = contractStep;
        this.contractAmount = contractAmount;
        this.contractCurrency = contractCurrency;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblContract() {
        super();
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode == null ? null : contractCode.trim();
    }

    public String getContractDocUrl() {
        return contractDocUrl;
    }

    public void setContractDocUrl(String contractDocUrl) {
        this.contractDocUrl = contractDocUrl == null ? null : contractDocUrl.trim();
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public Integer getContractState() {
        return contractState;
    }

    public void setContractState(Integer contractState) {
        this.contractState = contractState;
    }

    public Date getContractStart() {
        return contractStart;
    }

    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }

    public String getContractStep() {
        return contractStep;
    }

    public void setContractStep(String contractStep) {
        this.contractStep = contractStep == null ? null : contractStep.trim();
    }

    public Integer getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Integer contractAmount) {
        this.contractAmount = contractAmount;
    }

    public Integer getContractCurrency() {
        return contractCurrency;
    }

    public void setContractCurrency(Integer contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}