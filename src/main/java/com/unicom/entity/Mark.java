package com.unicom.entity;

public class Mark {
    private Integer markId;

    private String markTarget;

    private Double markWeight;

    private Double markScore;

    private String mark1;

    private String mark2;

    private String markStandard;

    public Mark(Integer markId, String markTarget, Double markWeight, Double markScore, String mark1, String mark2, String markStandard) {
        this.markId = markId;
        this.markTarget = markTarget;
        this.markWeight = markWeight;
        this.markScore = markScore;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.markStandard = markStandard;
    }

    public Mark() {
        super();
    }

    public Integer getMarkId() {
        return markId;
    }

    public void setMarkId(Integer markId) {
        this.markId = markId;
    }

    public String getMarkTarget() {
        return markTarget;
    }

    public void setMarkTarget(String markTarget) {
        this.markTarget = markTarget == null ? null : markTarget.trim();
    }

    public Double getMarkWeight() {
        return markWeight;
    }

    public void setMarkWeight(Double markWeight) {
        this.markWeight = markWeight;
    }

    public Double getMarkScore() {
        return markScore;
    }

    public void setMarkScore(Double markScore) {
        this.markScore = markScore;
    }

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1 == null ? null : mark1.trim();
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2 == null ? null : mark2.trim();
    }

    public String getMarkStandard() {
        return markStandard;
    }

    public void setMarkStandard(String markStandard) {
        this.markStandard = markStandard == null ? null : markStandard.trim();
    }
}