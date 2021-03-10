package com.demo.DiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverySearviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverySearviceApplication.class, args);
	}

}
