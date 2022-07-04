package com.ogog.federal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智慧医疗信息平台 - 门诊功能 Consumer 启动类<b>
 *
 * @author orderuniverse
 * @date 2022/7/4
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FederalOpcConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(FederalOpcConsumerStarter.class,args);
	}
}
