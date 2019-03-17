package com.roroclaw.consumefeign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
//@EnableEurekaClient
@SpringBootApplication
public class ConsumefeignApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumefeignApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ConsumefeignApplication.class, args);
        LOGGER.info("==========ConsumefeignApplication启动(消费者)===========");
    }

}
