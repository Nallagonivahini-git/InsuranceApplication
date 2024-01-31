package com.Insurance.InuranceApplication.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;


@Entity
public class PolicyType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private int minAge;
    private int maxAge;
    @ManyToOne
    private Plan plan;

    @JsonIgnore
    private Date createDate;
    @JsonIgnore
    private Date upadateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpadateDate() {
        return upadateDate;
    }

    public void setUpadateDate(Date upadateDate) {
        this.upadateDate = upadateDate;
    }

    public PolicyType(int id, int minAge, int maxAge, Plan plan, Date createDate, Date upadateDate) {
        this.id = id;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.plan = plan;
        this.createDate = createDate;
        this.upadateDate = upadateDate;
    }

    public PolicyType() {

    }
}
