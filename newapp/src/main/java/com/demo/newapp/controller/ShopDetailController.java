package com.demo.newapp.controller;

import com.demo.newapp.Entity.ShopDetails;
import com.demo.newapp.Service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ShopDetailController {

    @Autowired
    ShopService shopService;
}
