package com.demo.newapp.controller;

import com.demo.newapp.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apiAddress/")
public class AddressController {

    @Autowired
    AddressService addressService;






}
