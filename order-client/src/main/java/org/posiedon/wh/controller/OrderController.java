package org.posiedon.wh.controller;

import org.posiedon.wh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/14 21:45
 */
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("order.do")
    public ResponseEntity order(){
       try {
           String order = orderService.order(2);
           System.out.println("======OrderController========order.do========");
           return ResponseEntity.ok(order);
       } catch (Exception e) {
           e.printStackTrace();
           return ResponseEntity.badRequest().body(e.getMessage());
       }
    }

    @RequestMapping("orderDel.do")
    public ResponseEntity orderDel(){
        try {
            HashMap<String, Object> map = new HashMap<>();
            map.put("id","huowei");
            ResponseEntity responseEntity = orderService.orderDel(map);
            System.out.println("====OrderController===orderDel===");
            return responseEntity;
        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
