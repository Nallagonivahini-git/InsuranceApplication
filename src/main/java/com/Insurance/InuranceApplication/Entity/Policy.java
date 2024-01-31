package com.Insurance.InuranceApplication.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Policy {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int policyId;

    private String name;

    @Enumerated(EnumType.ORDINAL)
    private PeriodofPaying periodofPaying;

    private int premiumyear;

    @ManyToOne
    private PolicyType policyType;

    @ManyToOne
    private PolicyProvider policyProvider;

    private long assuredreturn;

    private Date maturityDate;

    private long maturityValue;

    private long deathAssuredReturn;

    private boolean status;

    @JsonIgnore
    private Date createDate;
    @JsonIgnore
    private Date upadateDate;

    public Policy(int policyId, String name, PeriodofPaying periodofPaying, int premiumyear, PolicyType policyType,
                  PolicyProvider policyProvider, long assuredreturn, Date maturityDate,
                  long maturityValue, long deathAssuredReturn, boolean status, Date createDate, Date upadateDate) {
        this.policyId = policyId;
        this.name = name;
        this.periodofPaying = periodofPaying;
        this.premiumyear = premiumyear;
        this.policyType = policyType;
        this.policyProvider = policyProvider;
        this.assuredreturn = assuredreturn;
        this.maturityDate = maturityDate;
        this.maturityValue = maturityValue;
        this.deathAssuredReturn = deathAssuredReturn;
        this.status = status;
        this.createDate = createDate;
        this.upadateDate = upadateDate;
    }

    public Policy() {
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PeriodofPaying getPeriodofPaying() {
        return periodofPaying;
    }

    public void setPeriodofPaying(PeriodofPaying periodofPaying) {
        this.periodofPaying = periodofPaying;
    }

    public int getPremiumyear() {
        return premiumyear;
    }

    public void setPremiumyear(int premiumyear) {
        this.premiumyear = premiumyear;
    }

    public PolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

    public PolicyProvider getPolicyProvider() {
        return policyProvider;
    }

    public void setPolicyProvider(PolicyProvider policyProvider) {
        this.policyProvider = policyProvider;
    }

    public long getAssuredreturn() {
        return assuredreturn;
    }

    public void setAssuredreturn(long assuredreturn) {
        this.assuredreturn = assuredreturn;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public long getMaturityValue() {
        return maturityValue;
    }

    public void setMaturityValue(long maturityValue) {
        this.maturityValue = maturityValue;
    }

    public long getDeathAssuredReturn() {
        return deathAssuredReturn;
    }

    public void setDeathAssuredReturn(long deathAssuredReturn) {
        this.deathAssuredReturn = deathAssuredReturn;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
