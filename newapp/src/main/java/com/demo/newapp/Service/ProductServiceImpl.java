package com.demo.newapp.Service;

import com.demo.newapp.dao.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;
}
