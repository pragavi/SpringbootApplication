package com.demo.newapp.Service;

import com.demo.newapp.dao.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    AddressRepo addressRepo;
}
