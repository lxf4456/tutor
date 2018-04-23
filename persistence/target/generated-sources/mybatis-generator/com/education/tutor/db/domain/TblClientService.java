package com.education.tutor.db.domain;

import java.util.Date;

public class TblClientService {
    private Long clientServiceId;

    private Long userMainId;

    private Long clientOrgId;

    private Long serviceOrgId;

    private Integer serverType;

    private Integer serverStatus;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    public TblClientService(Long clientServiceId, Long userMainId, Long clientOrgId, Long serviceOrgId, Integer serverType, Integer serverStatus, Date createAt, String createBy, Date updateAt) {
        this.clientServiceId = clientServiceId;
        this.userMainId = userMainId;
        this.clientOrgId = clientOrgId;
        this.serviceOrgId = serviceOrgId;
        this.serverType = serverType;
        this.serverStatus = serverStatus;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
    }

    public TblClientService() {
        super();
    }

    public Long getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(Long clientServiceId) {
        this.clientServiceId = clientServiceId;
    }

    public Long getUserMainId() {
        return userMainId;
    }

    public void setUserMainId(Long userMainId) {
        this.userMainId = userMainId;
    }

    public Long getClientOrgId() {
        return clientOrgId;
    }

    public void setClientOrgId(Long clientOrgId) {
        this.clientOrgId = clientOrgId;
    }

    public Long getServiceOrgId() {
        return serviceOrgId;
    }

    public void setServiceOrgId(Long serviceOrgId) {
        this.serviceOrgId = serviceOrgId;
    }

    public Integer getServerType() {
        return serverType;
    }

    public void setServerType(Integer serverType) {
        this.serverType = serverType;
    }

    public Integer getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(Integer serverStatus) {
        this.serverStatus = serverStatus;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}