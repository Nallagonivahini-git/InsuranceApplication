package com.Insurance.InuranceApplication.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Plan {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String planName;
    private String description;
    @JsonIgnore
    private Date createDate;
    @JsonIgnore
    private Date upadateDate;

    public Plan(int id, String planName, String description, Date createDate, Date upadateDate) {
        this.id = id;
        this.planName = planName;
        this.description = description;
        this.createDate = createDate;
        this.upadateDate = upadateDate;
    }

    public Plan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
