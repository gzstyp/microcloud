package com.fwtai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-28 14:55
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
@RestController
@RequestMapping("/web")
public class UserController{

    private static final String URL_PREFIX = "http://apiService";//调用服务提供者的实例名,因为加入注解@LoadBalanced后调用服务提供方时是不需要加端口号的

    @Autowired
    private LoadBalancerClient loadBalancerClient;//带有负载均衡功能的客户端

    @Autowired
    private RestTemplate restTemplate;

    // http://127.0.0.1:8001/provider/user?name=zs 这个是服务提供的url地址
    // http://127.0.0.1:9001/web/user?name=zs
    @RequestMapping("/user")
    public String get(final String name){
        return restTemplate.getForObject(URL_PREFIX + "/provider/user?name="+name,String.class);
    }
}