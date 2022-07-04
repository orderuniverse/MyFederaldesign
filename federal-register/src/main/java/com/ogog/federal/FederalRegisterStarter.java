package com.ogog.federal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FederalRegisterStarter {
	public static void main(String[] args) {
		SpringApplication.run(FederalRegisterStarter.class,args);
	}
}
