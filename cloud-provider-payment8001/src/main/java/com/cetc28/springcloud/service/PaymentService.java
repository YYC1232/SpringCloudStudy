package com.cetc28.springcloud.service;

import com.cetc28.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id")long id);

}
