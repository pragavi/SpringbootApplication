package com.demo.newapp.Service;

import com.demo.newapp.dao.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    ShopRepo shopRepo;
}
