package com.fwtai.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-28 13:30
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
@SpringBootApplication
@EnableEurekaServer//声明本spring boot应用是Eureka服务注册中心的服务端
public class LaunchEureka{

    public static void main(String[] args){
        SpringApplication.run(LaunchEureka.class,args);
    }
}