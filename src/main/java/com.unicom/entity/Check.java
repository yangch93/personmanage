package com.unicom.entity;

public class Check {
private  Integer mark_id;
private String mark_target;
private double mark_weight;

    public Integer getMark_id() {
        return mark_id;
    }

    public void setMark_id(Integer mark_id) {
        this.mark_id = mark_id;
    }
    public String getMark_target() {
        return mark_target;
    }

    public void setMark_target(String mark_target) {
        this.mark_target = mark_target;
    }

    public double getMark_weight() {
        return mark_weight;
    }

    public void setMark_weight(double mark_weight) {
        this.mark_weight = mark_weight;
    }

    public String getMark_standard() {
        return mark_standard;
    }

    public void setMark_standard(String mark_standard) {
        this.mark_standard = mark_standard;
    }

    public double getMark_score() {
        return mark_score;
    }

    public void setMark_score(double mark_score) {
        this.mark_score = mark_score;
    }

    private String mark_standard;
private double mark_score;
}
