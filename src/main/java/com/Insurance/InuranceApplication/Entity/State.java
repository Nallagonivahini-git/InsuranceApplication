package com.Insurance.InuranceApplication.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class State {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String StateName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }

    public State(int id, String stateName) {
        this.id = id;
        StateName = stateName;
    }

    public State() {
    }
}
