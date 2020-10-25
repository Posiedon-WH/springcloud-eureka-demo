package org.posiedon.wh.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/10/26 0:15
 */
@FeignClient(value = "store-client")
public interface OrderFeignService {
    @RequestMapping(value = "/order.do",method = RequestMethod.POST)
    ResponseEntity order();
}
