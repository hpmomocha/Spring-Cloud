package com.kevin.cloud.helloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Finchley 这个版本的 Spring Cloud 已经无需添加@EnableDiscoveryClient注解了
//@EnableDiscoveryClient
//那么如果我引入了相关的 jar 包又想禁用服务注册与发现怎么办？设置eureka.client.enabled=false
@SpringBootApplication
public class HelloServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServerApplication.class, args);
	}
}
