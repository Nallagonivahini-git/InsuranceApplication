package com.Insurance.InuranceApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PolicyProvider
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String policyProviderName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicyProviderName() {
        return policyProviderName;
    }

    public void setPolicyProviderName(String policyProviderName) {
        this.policyProviderName = policyProviderName;
    }

    public PolicyProvider(int id, String policyProviderName) {
        this.id = id;
        this.policyProviderName = policyProviderName;
    }

    public PolicyProvider(){

    }
}
