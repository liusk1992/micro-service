package com.liusk.order.controller;

import com.liusk.order.domain.OrderDO;
import com.liusk.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : liusk
 * @date : 2019/8/9 15:42
 */
@RestController
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{id}")
    public String queryOrderById(@PathVariable("id") String id){
        return "order:"+id;
    }

    @GetMapping("/order/test")
    public String userTest(){
        OrderDO orderDO = new OrderDO();
        return orderService.orderTest(orderDO);
    }

}
