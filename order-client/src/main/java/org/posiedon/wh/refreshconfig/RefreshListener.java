package org.posiedon.wh.refreshconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/19 23:49
 */
public class RefreshListener {

    @Autowired
    RedisTemplate redisTemplate;

    public void subscribe(){

    }
}
