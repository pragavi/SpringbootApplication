package com.demo.newapp.controller;

import com.demo.newapp.Entity.User;
import com.demo.newapp.Entity.UserAddress;
import com.demo.newapp.Service.Userservice;
import com.demo.newapp.dto.UserRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    Userservice userservice;
    @GetMapping("user/getAll")
    public List<User> getAllUser() {
        return userservice.getAllUser();
    }

    @GetMapping("user/{id}")
    public User getById (@PathVariable int id){
        return userservice.getById(id);

    }
    @PostMapping("user/add")
    public String createUser(@RequestBody @Valid UserRequest userRequest){
       return userservice.createUser(userRequest);
    }

    @PutMapping("user/update/{id}")
    public String updateUser(@PathVariable int id) {
        return userservice.updateUser(id);
    }

    @DeleteMapping("user/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return userservice.deleteUser(id);
    }



    @GetMapping("useraddress/{id}")
    public List<UserAddress> getAddressById(@PathVariable int id){
        return userservice.getAddressById(id);
    }

}
