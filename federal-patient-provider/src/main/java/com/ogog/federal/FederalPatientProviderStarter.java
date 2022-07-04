package com.ogog.federal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>智慧医疗信息平台 - 病人功能启动类<b>
 *
 * @author orderuniverse
 * @date 2022/7/4
 */
@MapperScan("com.ogog.federal.*.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class FederalPatientProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(FederalPatientProviderStarter.class,args);
	}
}
