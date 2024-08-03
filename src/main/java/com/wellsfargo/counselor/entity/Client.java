package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
    /*
    * Each id must be auto-generated.
    * Each instance variable must contain either a column or a relationship annotation.
    * Each class must contain a constructor which initializes all instance variables.
    * Each class must expose a getter and setter for each instance variable (no setter for the id field is required).
    */

    @Id;
    @GeneratedValue;
    private long clientId;

    @Column(nullable=false)
    private String firstName;

    @Column(nullable=false)
    private String lastName;

    @Column(nullable=false)
    private long advisorId;

    @Column(nullable=false)
    private long numOfSecurities;

    @Column(nullable=false)
    private String address;

    @Column(nullable=false)
    private String phone;

    @Column(nullable=false)
    private String email;

    protected Client() {

    }

    public Client(String fName, String lName, String ph, String em, String add, long numSecurities) {
        this.firstName = fname;
        this.lastName = lName;
        this.phone = ph;
        this.email = em;
        this.address = add;
        this.numOfSecurities = numSecurities;
    }

    public long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public Long getNumOfSecurities() {
        return numOfSecurities;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String f) {
        this.firstName = f;
    }

    public void setLastName(String l) {
        this.lastName = l;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public void setPhone(String p) {
        this.phone = p;
    }

    public void setEmail(String e) {
        this.email = e;
    }
}