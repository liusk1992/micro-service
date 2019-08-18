package com.liusk.uc.api.service;

import com.liusk.uc.api.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author : liusk
 * @date : 2019/8/18 14:15
 */
@FeignClient(name="uc-service")
public interface UserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    @GetMapping("/user")
    String addUser(UserDTO user);

}
