package org.posiedon.wh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
public class StoreApp {
    public static void main(String[] args) {
        SpringApplication.run(StoreApp.class,args);
    }
}
