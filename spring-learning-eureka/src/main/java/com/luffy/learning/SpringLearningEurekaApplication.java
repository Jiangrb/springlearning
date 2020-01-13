package com.luffy.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringLearningEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearningEurekaApplication.class, args);
    }

}
