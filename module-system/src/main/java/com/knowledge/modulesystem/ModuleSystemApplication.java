package com.knowledge.modulesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ModuleSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleSystemApplication.class, args);
    }

}
