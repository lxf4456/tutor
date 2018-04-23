package com.education.tutor.db.domain;

import java.util.Date;

public class TblProjectEvent {
    private Long projectEventId;

    private Long projectId;

    private Integer eventType;

    private String eventDesc;

    private String eventSolution;

    private String eventRemark;

    private Date eventOccurTime;

    private String eventProducer;

    private String eventProcessor;

    private String eventResult;

    private Date updatedAt;

    private String updatedBy;

    public TblProjectEvent(Long projectEventId, Long projectId, Integer eventType, String eventDesc, String eventSolution, String eventRemark, Date eventOccurTime, String eventProducer, String eventProcessor, String eventResult, Date updatedAt, String updatedBy) {
        this.projectEventId = projectEventId;
        this.projectId = projectId;
        this.eventType = eventType;
        this.eventDesc = eventDesc;
        this.eventSolution = eventSolution;
        this.eventRemark = eventRemark;
        this.eventOccurTime = eventOccurTime;
        this.eventProducer = eventProducer;
        this.eventProcessor = eventProcessor;
        this.eventResult = eventResult;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TblProjectEvent() {
        super();
    }

    public Long getProjectEventId() {
        return projectEventId;
    }

    public void setProjectEventId(Long projectEventId) {
        this.projectEventId = projectEventId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc == null ? null : eventDesc.trim();
    }

    public String getEventSolution() {
        return eventSolution;
    }

    public void setEventSolution(String eventSolution) {
        this.eventSolution = eventSolution == null ? null : eventSolution.trim();
    }

    public String getEventRemark() {
        return eventRemark;
    }

    public void setEventRemark(String eventRemark) {
        this.eventRemark = eventRemark == null ? null : eventRemark.trim();
    }

    public Date getEventOccurTime() {
        return eventOccurTime;
    }

    public void setEventOccurTime(Date eventOccurTime) {
        this.eventOccurTime = eventOccurTime;
    }

    public String getEventProducer() {
        return eventProducer;
    }

    public void setEventProducer(String eventProducer) {
        this.eventProducer = eventProducer == null ? null : eventProducer.trim();
    }

    public String getEventProcessor() {
        return eventProcessor;
    }

    public void setEventProcessor(String eventProcessor) {
        this.eventProcessor = eventProcessor == null ? null : eventProcessor.trim();
    }

    public String getEventResult() {
        return eventResult;
    }

    public void setEventResult(String eventResult) {
        this.eventResult = eventResult == null ? null : eventResult.trim();
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