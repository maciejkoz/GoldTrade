package com.example.GoldTradeDemo.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserAccount {

    private int accountId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private double balanceUSD;
    private double balanceXAG;

    public UserAccount() {
    }


}
