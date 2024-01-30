package com.Insurance.InuranceApplication.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    private String email;
    private String mobileNo;
    private boolean tempAsPerAddress;
    @JsonIgnore
    private Date createDate;
    private Date upadateDate;
    private String password;
    @OneToOne
    private AddressDetails tempAddress;
    @OneToOne
    private AddressDetails permAddress;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public boolean isTempAsPerAddress() {
        return tempAsPerAddress;
    }

    public void setTempAsPerAddress(boolean tempAsPerAddress) {
        this.tempAsPerAddress = tempAsPerAddress;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AddressDetails getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(AddressDetails tempAddress) {
        this.tempAddress = tempAddress;
    }

    public AddressDetails getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(AddressDetails permAddress) {
        this.permAddress = permAddress;
    }

    public UserDetails(long id, String name, Date dob, String email,
                       String mobileNo, boolean tempAsPerAddress, Date createDate,
                       Date upadateDate, String password, AddressDetails tempAddress, AddressDetails permAddress) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.mobileNo = mobileNo;
        this.tempAsPerAddress = tempAsPerAddress;
        this.createDate = createDate;
        this.upadateDate = upadateDate;
        this.password = password;
        this.tempAddress = tempAddress;
        this.permAddress = permAddress;
    }

    public UserDetails() {
    }
}
