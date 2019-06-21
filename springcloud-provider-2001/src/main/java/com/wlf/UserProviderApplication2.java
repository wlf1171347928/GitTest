package com.wlf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //表示是eureka的客户端,开启客户端
public class UserProviderApplication2 {
public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication2.class);
    }
}