package com.liusk.uc.web;

import com.liusk.uc.api.dto.UserDTO;
import com.liusk.uc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/**
 * @author : liusk
 * @date : 2019/8/6 15:16
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/indexHtm")
    public String index(){
        return "/index";
    }

    @RequestMapping("/testHtm")
    public String testHtml(){
        return "/test";
    }

    @RequestMapping("/postTest")
    @ResponseBody
    public String postTest(String name){
        return "hi,"+name;
    }

    @GetMapping("/feign/test")
    @ResponseBody
    public String feignTest(){
        return userService.userOrderCount();
    }

    @PostMapping("/user")
    @ResponseBody
    public String userTest(UserDTO userDTO){
      return userDTO.toString();
    }

}
