package com.example.goldTradeDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor

public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long accountId;
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerEmail;
    private String ownerUsername;
    private String ownerPassword;
    private Integer ownerAge;
    private BigDecimal ownerBalanceUSD;
    private BigDecimal ownerBalanceXAG;


//    @OneToOne(mappedBy = "userAccount")
//    private Scooter scooter;

    public UserAccount() {
    }

}
