package org.posiedon.wh.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/14 21:29
 */
public interface OrderService {
    String order(int id);

    ResponseEntity orderDel(Map<String,Object> param);
}
