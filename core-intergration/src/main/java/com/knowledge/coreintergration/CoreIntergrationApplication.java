package com.knowledge.coreintergration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CoreIntergrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreIntergrationApplication.class, args);
    }

}
