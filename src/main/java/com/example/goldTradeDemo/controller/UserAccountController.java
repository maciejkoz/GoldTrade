package com.example.goldTradeDemo.controller;

import com.example.goldTradeDemo.api.request.CreateUserAccountRequest;
import com.example.goldTradeDemo.api.response.BasicResponse;
import com.example.goldTradeDemo.api.response.CreateUserAccountResponse;
import com.example.goldTradeDemo.service.Impl.UserAccountServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user-account")
public class UserAccountController {

    private UserAccountServiceImpl userAccountServiceImpl;

    public UserAccountController(UserAccountServiceImpl userAccountServiceImpl) {
        this.userAccountServiceImpl = userAccountServiceImpl;
    }

    @PostMapping(value = "/create", produces = "application/json")
    public ResponseEntity<CreateUserAccountResponse> createUserAccount(
            @RequestBody CreateUserAccountRequest request
    ) {
        return userAccountServiceImpl.createUserAccount(request);
    }

    @PutMapping (value = "/user-account/{accountId}/balanceUSD/updateUSD", produces = "applicatrion/json")
    public ResponseEntity<BasicResponse> updateUserAccountUSD
            (@RequestParam double ownerBalanceUSD,
             @PathVariable int accountId){
        return null;
    }


    @PutMapping (value = "/user-account/{accountId}/balanceXAG/updateXAG", produces = "applicatrion/json")
    public ResponseEntity<BasicResponse> updateUserAccountXAG
            (@RequestParam double ownerBalanceXAG,
             @PathVariable int accountId){
        return null;
    }

}
