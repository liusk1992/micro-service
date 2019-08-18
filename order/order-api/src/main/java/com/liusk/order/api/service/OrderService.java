package com.liusk.order.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : liusk
 * @date : 2019/8/9 15:25
 */
@FeignClient("order-service")
public interface OrderService {

    /**
     * 根据id查询订单
     * @param id 订单id
     * @return
     */
    @GetMapping("/order/{id}")
    String queryOrderById(@PathVariable("id") String id);

}
