package com.Insurance.InuranceApplication.Entity;


import jakarta.persistence.*;

@Entity
public class AddressDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String colony;
    @ManyToOne
    private City city;
    @ManyToOne
    private State state;
    @ManyToOne
    private Country country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    public AddressDetails(int id, String colony, City city, State state, Country country) {
        this.id = id;
        this.colony = colony;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public AddressDetails() {
    }
}
