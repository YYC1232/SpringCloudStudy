package com.cetc28.springcloud.controller;


import com.cetc28.springcloud.entities.CommonResult;
import com.cetc28.springcloud.entities.Payment;

import com.cetc28.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;



    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){

        int res=paymentService.create(payment);
        log.info("插入结果："+res);

        if(res>0){
            return new CommonResult(200,"插入数据成功,端口号为"+serverPort,res);
        }else{
            return new CommonResult(444,"插入数据失败,端口号为"+serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){

        Payment res=paymentService.getPaymentById(id);
        log.info(serverPort+"插入结果："+res.toString());

        if(res!=null){
            return new CommonResult(200,"查询数据成功,端口号为"+serverPort,res);
        }else{
            return new CommonResult(444,"查询数据失败,端口号为"+serverPort,null);
        }
    }


}
