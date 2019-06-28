package com.yhmd.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudsApplication.class, args);
    }

}
