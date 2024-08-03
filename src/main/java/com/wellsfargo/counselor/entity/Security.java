package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    /*
     * Each id must be auto-generated.
     * Each instance variable must contain either a column or a relationship annotation.
     * Each class must contain a constructor which initializes all instance variables.
     * Each class must expose a getter and setter for each instance variable (no setter for the id field is required).
     */

    @Id;
    @GeneratedValue;
    private long securityId;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private long purchasePrice;

    @Column(nullable=false)
    private String purchaseDate;

    @Column(nullable=false)
    private long quantity;

    protected Security() {

    }

    public Security(String name, String category, long price, String date, long q) {
        this.name = name;
        this.category = category;
        this.purchasePrice = price;
        this.purchaseDate = date;
        this.quantity = q;
    }

    public Long getSecurityId() {
        return securityId;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setCategory(String c) {
        this.category = c;
    }

    public void setPurchasePrice(long p) {
        this.purchasePrice = p;
    }

    public void setPurchaseDate(String p) {
        this.purchaseDate = p;
    }

    public void setQuantity(String q) {
        this.quantity = q;
    }

}