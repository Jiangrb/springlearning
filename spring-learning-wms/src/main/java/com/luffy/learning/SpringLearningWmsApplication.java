package com.luffy.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringLearningWmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearningWmsApplication.class, args);
    }

}
