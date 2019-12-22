package com.example.GoldTradeDemo.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String email;

    private double balanceUSD;
    private double balanceXAG;

    public User() {
    }
}
