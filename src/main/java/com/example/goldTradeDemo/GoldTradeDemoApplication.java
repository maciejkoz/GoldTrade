package com.example.goldTradeDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;



@SpringBootApplication
@PropertySource("classpath:message.properties")
@ComponentScan(basePackages = {
		"com.example.goldTradeDemo.api",
		"com.example.goldTradeDemo.api.request",
		"com.example.goldTradeDemo.api.response",
		"com.example.goldTradeDemo.api.type",
		"com.example.goldTradeDemo.common",
		"com.example.goldTradeDemo.controller",
		"com.example.goldTradeDemo.exception",
		"com.example.goldTradeDemo.exchange",
		"com.example.goldTradeDemo.model",
		"com.example.goldTradeDemo.repository",
		"com.example.goldTradeDemo.service",
})

public class GoldTradeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldTradeDemoApplication.class, args);
	}

//		UserAccount user1 = new UserAccount();
//		ObjectMapper mapper = new ObjectMapper();

}
