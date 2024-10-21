package com.cyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:error_msg.properties")
public class CybTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CybTestApplication.class, args);
	}

}
