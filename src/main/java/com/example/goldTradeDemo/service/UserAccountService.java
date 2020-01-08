package com.example.goldTradeDemo.service;

import com.example.goldTradeDemo.api.request.CreateUserAccountRequest;
import com.example.goldTradeDemo.api.response.CreateUserAccountResponse;
import org.springframework.http.ResponseEntity;

public interface UserAccountService {

    ResponseEntity<CreateUserAccountResponse> createUserAccount(CreateUserAccountRequest request);
//    ResponseEntity<BasicResponse> rechargeUserAccount(Long accountId, String amount);
}