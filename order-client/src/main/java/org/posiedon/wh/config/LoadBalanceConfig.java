package org.posiedon.wh.config;

import org.posiedon.ribbon.config.RibbonLoadBalanceStoreClientConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/16 23:35
 */
@Configuration
@RibbonClients(value = {
@RibbonClient(name = "store-client",configuration = RibbonLoadBalanceStoreClientConfig.class)
})
public class LoadBalanceConfig {
}
