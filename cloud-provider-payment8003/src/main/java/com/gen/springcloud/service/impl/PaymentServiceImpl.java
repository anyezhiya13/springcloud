package com.gen.springcloud.service.impl;


import com.gen.springcloud.dao.PaymentDao;
import com.gen.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import springcloud.entities.Payment;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;


    public int create(Payment payment) {
       return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
