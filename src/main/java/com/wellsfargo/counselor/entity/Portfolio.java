package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    /*
     * Each id must be auto-generated.
     * Each instance variable must contain either a column or a relationship annotation.
     * Each class must contain a constructor which initializes all instance variables.
     * Each class must expose a getter and setter for each instance variable (no setter for the id field is required).
     */

    @Id;
    @GeneratedValue;
    private long portfolioId;

    @Column(nullable=false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(String date) {
        this.creationDate = date;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String e) {
        this.creationDate = e;
    }

}