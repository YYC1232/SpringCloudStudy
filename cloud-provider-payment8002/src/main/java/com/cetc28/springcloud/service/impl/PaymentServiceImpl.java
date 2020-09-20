package com.cetc28.springcloud.service.impl;



import com.cetc28.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import com.cetc28.springcloud.dao.PaymentDao;
import com.cetc28.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
