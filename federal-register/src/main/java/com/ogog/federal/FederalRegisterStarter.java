package com.ogog.federal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>智慧医疗信息平台 - 注册中心启动类</b>
 * @author orderuniverse
 * @date 2022/7/4
 */
@EnableEurekaServer
@SpringBootApplication
public class FederalRegisterStarter {
	public static void main(String[] args) {
		SpringApplication.run(FederalRegisterStarter.class,args);
	}
}
