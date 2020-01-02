package com.example.GoldTradeDemo.controller;

import com.example.GoldTradeDemo.api.response.BasicResponse;
import com.example.GoldTradeDemo.api.request.CreateUserAccountRequeast;
import com.example.GoldTradeDemo.api.response.CreateUserAccountResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user-account")
public class UserAccountController {

    @PostMapping(value = "/create", produces = "applicatrion/json")
    public ResponseEntity<CreateUserAccountResponse> createUserAccount
            (@RequestBody CreateUserAccountRequeast request){
        return null;
    }

    @PutMapping (value = "/user-account/{accountId}/balanceUSD/updateUSD", produces = "applicatrion/json")
    public ResponseEntity<BasicResponse> updateUserAccountUSD
            (@RequestParam double balanceUSD,
             @PathVariable int accountId){
        return null;
    }


    @PutMapping (value = "/user-account/{accountId}/balanceXAG/updateXAG", produces = "applicatrion/json")
    public ResponseEntity<BasicResponse> updateUserAccountXAG
            (@RequestParam double balanceXAG,
             @PathVariable int accountId){
        return null;
    }



}
