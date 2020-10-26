package org.posiedon.wh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/10/26 23:20
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "order-server welcome !!";
    }
}
