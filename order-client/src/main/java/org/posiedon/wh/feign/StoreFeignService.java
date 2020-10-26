package org.posiedon.wh.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/10/26 23:49
 */
@FeignClient("store-client")
public interface StoreFeignService {

    @RequestMapping(value = "consume.do",method = RequestMethod.POST)
    ResponseEntity<String> consume(Integer id);
}
