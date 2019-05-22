package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientSpringJava2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestClientSpringJava2Application.class, args);
                 RestTemplate restTemplate = new RestTemplate();
                 //omvandla från JSON:
        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        String test= quote.toString();
                   String test2= quote.toString();
	}

}
