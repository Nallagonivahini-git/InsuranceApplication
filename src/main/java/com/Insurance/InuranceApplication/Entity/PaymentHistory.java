package com.Insurance.InuranceApplication.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class PaymentHistory {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private Date paidDate;

    private String payVia;

    private long paidAmount;

    private String modePayment;

    @ManyToOne
    private UserPolicyInfo userPolicyInfo;

    public PaymentHistory(int id, Date paidDate, String payVia, long paidAmount, String modePayment, UserPolicyInfo userPolicyInfo) {
        this.id = id;
        this.paidDate = paidDate;
        this.payVia = payVia;
        this.paidAmount = paidAmount;
        this.modePayment = modePayment;
        this.userPolicyInfo = userPolicyInfo;
    }

    public PaymentHistory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public String getPayVia() {
        return payVia;
    }

    public void setPayVia(String payVia) {
        this.payVia = payVia;
    }

    public long getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(long paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getModePayment() {
        return modePayment;
    }

    public void setModePayment(String modePayment) {
        this.modePayment = modePayment;
    }

    public UserPolicyInfo getUserPolicyInfo() {
        return userPolicyInfo;
    }

    public void setUserPolicyInfo(UserPolicyInfo userPolicyInfo) {
        this.userPolicyInfo = userPolicyInfo;
    }
}
