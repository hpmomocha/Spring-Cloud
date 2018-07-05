package com.kevin.cloud.helloclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
// Finchley 这个版本的 Spring Cloud 已经无需添加@EnableDiscoveryClient注解了
// @EnableDiscoveryClient
// 那么如果我引入了相关的 jar 包又想禁用服务注册与发现怎么办？设置eureka.client.enabled=false
public class HelloClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}
}

@Configuration
class Config {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
