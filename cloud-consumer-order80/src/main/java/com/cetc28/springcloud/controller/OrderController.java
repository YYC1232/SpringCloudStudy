package com.cetc28.springcloud.controller;


import com.cetc28.springcloud.entities.CommonResult;
import com.cetc28.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    public static final String EUREKA_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        System.out.println("shifoujinru");
        return restTemplate.postForObject(EUREKA_URL + "/payment/create", payment, CommonResult.class);
    }



    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        System.out.println("shifoujinru");
        return restTemplate.getForObject(EUREKA_URL + "/payment/get/" + id, CommonResult.class);
    }


}
