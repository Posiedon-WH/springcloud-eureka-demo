package org.posiedon.wh.feign.server.impl;

import org.posiedon.wh.feign.dto.DemoDTO;
import org.posiedon.wh.feign.server.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/10/26 23:44
 */
@Service
public class StoreServiceImpl implements StoreService {
    @Override
    public ResponseEntity<String> consume(Integer id) {
        System.out.println("StoreServiceImpl.consume param is " + id);
        return ResponseEntity.ok("consume id " + id);
    }

    @Override
    public DemoDTO getDemo() {
        DemoDTO demoDTO = new DemoDTO();
        demoDTO.setAge(23);
        demoDTO.setMoney(123230000L);
        demoDTO.setName("sdwew");
        return demoDTO;
    }
}
