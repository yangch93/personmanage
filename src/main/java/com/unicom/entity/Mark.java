package com.unicom.entity;

public class Mark {
    private Integer markId;

    private Double markWeight;

    private String markStandard;

    private Double markScore;

    private String mark1;

    private String mark2;

    public Mark(Integer markId, Double markWeight, String markStandard, Double markScore, String mark1, String mark2) {
        this.markId = markId;
        this.markWeight = markWeight;
        this.markStandard = markStandard;
        this.markScore = markScore;
        this.mark1 = mark1;
        this.mark2 = mark2;
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

    public Double getMarkWeight() {
        return markWeight;
    }

    public void setMarkWeight(Double markWeight) {
        this.markWeight = markWeight;
    }

    public String getMarkStandard() {
        return markStandard;
    }

    public void setMarkStandard(String markStandard) {
        this.markStandard = markStandard == null ? null : markStandard.trim();
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
}