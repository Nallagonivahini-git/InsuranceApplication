package com.Insurance.InuranceApplication.Entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class NomineDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String relationShip;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @ManyToOne
    private UserDetails userDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(String relationShip) {
        this.relationShip = relationShip;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public NomineDetails(int id, String name, String relationShip, Date dob, UserDetails userDetails) {
        this.id = id;
        this.name = name;
        this.relationShip = relationShip;
        this.dob = dob;
        this.userDetails = userDetails;
    }

    public NomineDetails() {
    }
}
