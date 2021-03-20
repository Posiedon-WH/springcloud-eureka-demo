package org.posiedon.wh.feign.server;

import org.posiedon.wh.feign.dto.DemoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/10/26 23:38
 */
@RestController
public interface StoreService {

    @RequestMapping(value = "consume.do",method = RequestMethod.POST)
    ResponseEntity<String> consume(@RequestBody Integer id);

    @RequestMapping(value = "demo.do",method = RequestMethod.POST)
    DemoDTO getDemo();
}
