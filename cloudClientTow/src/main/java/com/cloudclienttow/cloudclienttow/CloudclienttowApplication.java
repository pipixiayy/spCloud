package com.cloudclienttow.cloudclienttow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudclienttowApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudclienttowApplication.class, args);
    }

}
