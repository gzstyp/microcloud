package com.fwtai.controller;

import com.fwtai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-28 14:17
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
@RestController
@RequestMapping("/provider")
public class UserController{

    @Autowired
    private UserService userService;

    //http://127.0.0.1:8001/provider/user?name=zs
    @RequestMapping("/user")
    public String getUser(final String name){
        //正常来说要调用service-mapper
        return userService.hello(name);
    }
}