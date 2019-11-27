package com.s2.travelonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

//@EnableDiscoveryClient
//@EnableFeignClients
@SpringBootApplication
@EnableAutoConfiguration(exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class UserAuthenticationServiceApplication {


	// @Bean
	// public RestTemplate restTemplate(RestTemplateBuilder builder) {
	//  return builder.build();
	 //}

    public static void main(String[] args) {
        SpringApplication.run(UserAuthenticationServiceApplication.class, args);
    }
}
