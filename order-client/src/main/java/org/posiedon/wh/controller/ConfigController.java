package org.posiedon.wh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/18 13:10
 */
//@RefreshScope 可以刷星@value的值
@RefreshScope
@RestController
public class ConfigController {

    @Value("${redis.password}")
    private String password;

    @Autowired
    Environment environment;

    @RequestMapping("config/pull")
    public String pull(){
        System.out.println("====config.redis.password===@value="+password);
        System.out.println("====config.redis.password===Environment="+environment.getProperty("redis.password"));
        String re="@value="+password+"====Environment="+environment.getProperty("redis.password");
        return re;
    }
}
