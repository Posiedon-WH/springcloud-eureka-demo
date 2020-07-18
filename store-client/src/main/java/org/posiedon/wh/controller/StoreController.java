package org.posiedon.wh.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/14 21:54
 */
@RestController
public class StoreController {

    @RequestMapping("order.do")
    public String order(){
        System.out.println("===StoreController===");
        return "StoreController.order.do";
    }

    @RequestMapping("orderDel.do")
    public ResponseEntity orderDel(@RequestBody Map<String,Object> param){
        System.out.println("====param==="+param.get("id")+"===");
        return ResponseEntity.ok("StoreController.orderDel.do");
    }
}
