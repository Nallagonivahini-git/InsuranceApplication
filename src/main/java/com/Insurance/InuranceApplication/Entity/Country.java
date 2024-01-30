package com.Insurance.InuranceApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String countryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Country(int id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public Country() {

    }
}
