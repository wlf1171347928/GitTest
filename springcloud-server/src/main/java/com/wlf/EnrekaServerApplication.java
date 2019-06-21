package com.wlf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//标识是eureka服务端开启
public class EnrekaServerApplication {
public static void main(String[] args) {
        SpringApplication.run(EnrekaServerApplication.class);
    }
}