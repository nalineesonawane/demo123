package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MsServeZullProxyStudentClientApplication {

	public static void main(String[] args) {
		System.out.println("employee  Client");
		SpringApplication.run(MsServeZullProxyStudentClientApplication.class, args);
	}

}
