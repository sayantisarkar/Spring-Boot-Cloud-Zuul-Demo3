package com.accenture.lkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGatwayService {

	public static void main(String[] args) {	
		SpringApplication.run(ZuulGatwayService.class, args);
	}
	//http://localhost:8081/employee/getDetails
	//http://localhost:8081/student/getDetails
}