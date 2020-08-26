package com.fwtai.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-28 14:50
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
 */
@SpringBootApplication
@EnableEurekaClient//声明本spring boot应用是Eureka服务注册中心的客户端|标识为eureka的客户端???
@ComponentScan({"com.fwtai"})
public class LaunchWeb{

    public static void main(String[] args){
        SpringApplication.run(LaunchWeb.class,args);
    }
}