package org.posiedon.wh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/*
 * 监控界面：http://localhost:9001/hystrix
 * 需要监控的端点（使用了hystrix组件的端点）：http://localhost:8000/actuator/hystrix.stream
 *
 * */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard.class, args);
    }
}
