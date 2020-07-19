package org.posiedon.wh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
//@EnableZuulServer
public class ZuulAppServer
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulAppServer.class,args);
    }
}
