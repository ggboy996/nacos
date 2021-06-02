package com.nacos.test.nacosauth.nacosauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosAuthApplication.class, args);
    }

}
