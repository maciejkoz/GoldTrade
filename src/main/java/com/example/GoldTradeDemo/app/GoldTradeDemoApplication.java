package com.example.GoldTradeDemo.app;

import com.example.GoldTradeDemo.api.response.CreateUserAccountResponse;
import com.example.GoldTradeDemo.user.UserAccount;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.WebResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoldTradeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldTradeDemoApplication.class, args);
	}

		UserAccount user1 = new UserAccount();
		ObjectMapper mapper = new ObjectMapper();

}
