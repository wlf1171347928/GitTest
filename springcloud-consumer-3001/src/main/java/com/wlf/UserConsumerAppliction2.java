package com.wlf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//开启feign负载均衡
public class UserConsumerAppliction2 {
public static void main(String[] args) {
        SpringApplication.run(UserConsumerAppliction2.class);
    }

}