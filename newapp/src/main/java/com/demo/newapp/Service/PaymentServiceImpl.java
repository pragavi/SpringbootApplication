package com.demo.newapp.Service;

import com.demo.newapp.dao.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepo paymentRepo;
}
