package org.posiedon.wh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/19 22:34
 */
@RestController
public class IndexController {

    @Value("${test}")
    private String test;

    @Autowired
    Environment environment;

    @RequestMapping("test")
    public String test(){
        String re="===zuul.indexCtl==test"+test+"===environment=="+environment.getProperty("test");
        System.out.println(re);
        return re;
    }
}
