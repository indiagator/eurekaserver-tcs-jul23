package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder()
                .profiles("dev")
                .sources(EurekaserverApplication.class)
                .run(args);
    }
}
