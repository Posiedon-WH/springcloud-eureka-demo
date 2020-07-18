package org.posiedon.wh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 */
@SpringBootApplication(scanBasePackages = "org.posiedon.wh")
@EnableEurekaClient
//开启断路器功能
@EnableCircuitBreaker
////开启重试功能
//@EnableRetry
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
