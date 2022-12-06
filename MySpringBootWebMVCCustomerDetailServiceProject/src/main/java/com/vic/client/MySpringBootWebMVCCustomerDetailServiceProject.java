package com.vic.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
*
* @author vic
* date: 06/12/2022
* purpose: The Main/Client Class
*
*/

@SpringBootApplication(scanBasePackages = "com.vic")
public class MySpringBootWebMVCCustomerDetailServiceProject {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootWebMVCCustomerDetailServiceProject.class, args);
	}

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
