package com.liusk.order.service;

import com.liusk.order.domain.OrderDO;
import com.liusk.uc.api.dto.UserDTO;
import com.liusk.uc.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单service
 * @author : liusk
 * @date : 2019/8/18 14:14
 */
@Service
public class OrderService {

    @Autowired
    private UserService userService;

    public String orderTest(OrderDO orderDO){
        UserDTO userDTO = new UserDTO();
        userDTO.setName("刘少康");
        userDTO.setAge(27);
        userDTO.setPhone("1873609156");
        userService.addUser(userDTO);
        return userDTO.toString();
    }

}
