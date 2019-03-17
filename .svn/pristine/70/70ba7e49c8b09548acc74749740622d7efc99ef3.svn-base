package com.roroclaw.springcloud.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {
    protected static final Logger logger = LoggerFactory.getLogger(EurekaserverApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverApplication.class, args);
        logger.info("==========注册中心启动=========");
    }

}
