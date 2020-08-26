package com.fwtai.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-28 14:56
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
@Configuration
public class ConfigBean{

    @Bean
    @LoadBalanced//负载均衡调用!!!,在加入注解@LoadBalanced后调用服务提供方时是不需要加端口号的
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}