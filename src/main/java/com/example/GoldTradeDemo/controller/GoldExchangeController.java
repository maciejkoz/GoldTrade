package com.example.GoldTradeDemo.controller;

import com.example.GoldTradeDemo.exchange.GoldExchangeRate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("gold-exchange-rate")
public class GoldExchangeController {
    @GetMapping(value = "/XAGUSD-rate", produces = "applicatrion/json")
    public ResponseEntity<Set<GoldExchangeRate>>updateUserAccountUSD
            (@PathVariable GoldExchangeRate GoldExchangeRate){
        return null;
    }

}
