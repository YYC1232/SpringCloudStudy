package com.cetc28.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @Author:
 * @create:2020-08-16
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8003 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8003.class,args);
    }

}
