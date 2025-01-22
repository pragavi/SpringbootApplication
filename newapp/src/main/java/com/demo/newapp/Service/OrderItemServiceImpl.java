package com.demo.newapp.Service;

import com.demo.newapp.dao.OrderItemRepo;
import com.demo.newapp.dao.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService{

    @Autowired
    OrderItemRepo orderItemRepoRepo;
}
