package com.fwtai.service;

import com.fwtai.api.UserClient;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 接口实现
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-28 14:27
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
 */
@Service
public class UserService implements UserClient{

    @Override
    public String hello(final String name){
        final Date date = new Date();
        System.out.println("服务提供者已被调用:"+date);
        return name + ",你好,当前时间:" + date;
    }
}