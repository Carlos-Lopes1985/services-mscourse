package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServicesHrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesHrEurekaServerApplication.class, args);
	}

}
