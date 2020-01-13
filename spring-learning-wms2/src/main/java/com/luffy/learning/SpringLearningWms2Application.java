package com.luffy.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringLearningWms2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearningWms2Application.class, args);
    }

}
