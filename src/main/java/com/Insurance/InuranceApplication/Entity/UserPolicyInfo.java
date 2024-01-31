package com.Insurance.InuranceApplication.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;


@Entity
public class UserPolicyInfo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private Date startDate;

    @OneToOne
    private Policy policy;

    @ManyToOne
    private UserDetails userDetails;

    private long remainingAmountToPaid;

    private Date nextPaymentDate;

    private long premiumAmount;

    private Date endDate;

    @JsonIgnore
    private Date createDate;
    @JsonIgnore
    private Date upadateDate;

    public UserPolicyInfo() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public long getRemainingAmountToPaid() {
        return remainingAmountToPaid;
    }

    public void setRemainingAmountToPaid(long remainingAmountToPaid) {
        this.remainingAmountToPaid = remainingAmountToPaid;
    }

    public Date getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(Date nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public long getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(long premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public UserPolicyInfo(int id, Date startDate, Policy policy, UserDetails userDetails, long remainingAmountToPaid,
                          Date nextPaymentDate, long premiumAmount, Date endDate, Date createDate, Date upadateDate) {
        this.id = id;
        this.startDate = startDate;
        this.policy = policy;
        this.userDetails = userDetails;
        this.remainingAmountToPaid = remainingAmountToPaid;
        this.nextPaymentDate = nextPaymentDate;
        this.premiumAmount = premiumAmount;
        this.endDate = endDate;
        this.createDate = createDate;
        this.upadateDate = upadateDate;
    }
}

