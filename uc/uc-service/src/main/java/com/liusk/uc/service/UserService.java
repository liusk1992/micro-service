package com.liusk.uc.service;

import com.liusk.order.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : liusk
 * @date : 2019/8/9 15:48
 */
@Service
public class UserService {

    @Autowired
    private RoleService roleService;

    @Autowired
    private OrderService oService;

    public String userOrderCount(){
        System.out.println(roleService.selectRoles());
        System.out.println(oService.queryOrderById("434"));
        return oService.queryOrderById("123");
    }

}
