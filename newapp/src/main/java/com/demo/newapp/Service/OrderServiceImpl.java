package com.demo.newapp.Service;

import com.demo.newapp.dao.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepo orderRepo;
}
