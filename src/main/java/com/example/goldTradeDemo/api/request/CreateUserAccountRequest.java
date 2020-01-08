package com.example.goldTradeDemo.api.request;

import java.math.BigDecimal;

public class CreateUserAccountRequest {

    private String ownerFirstName;
    private String ownerLastName;
    private String ownerEmail;
    private String ownerUsername;
    private String ownerPassword;
    private Integer ownerAge;
    private BigDecimal ownerBalanceUSD;
    private BigDecimal ownerBalanceXAG;

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerPassword() {
        return ownerPassword;
    }

    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public Integer getOwnerAge() {
        return ownerAge;
    }

    public void setOwnerAge(Integer ownerAge) {
        this.ownerAge = ownerAge;
    }

    public BigDecimal getOwnerBalanceUSD() {
        return ownerBalanceUSD;
    }

    public void setOwnerBalanceUSD(BigDecimal ownerBalanceUSD) {
        this.ownerBalanceUSD = ownerBalanceUSD;
    }

    public BigDecimal getOwnerBalanceXAG() {
        return ownerBalanceXAG;
    }

    public void setOwnerBalanceXAG(BigDecimal ownerBalanceXAG) {
        this.ownerBalanceXAG = ownerBalanceXAG;
    }
}

