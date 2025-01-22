package com.demo.newapp.Service;

import com.demo.newapp.Entity.User;
import com.demo.newapp.Entity.UserAddress;
import com.demo.newapp.dao.UserRepo;
import com.demo.newapp.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    UserRepo repo;


    @Override
    public List<User> getAllUser() {
        List<User> users=repo.findAll();
            return users;
    }

    @Override
    public User getById(int id) {
        User getuser = repo.findById(id).get();
        return getuser;
    }

    @Override
    public String createUser(UserRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setPhoneNumber(userRequest.getPhoneNum());
        repo.save(user);
        return "Created Successfully";
    }

    @Override
    public String updateUser(int id) {
        User updateuser= repo.findById(id).get();
        updateuser.setEmail("updatedemail@gmail.com");
        updateuser.setUsername("sujitha");
        repo.save(updateuser);
        return "updated successfully";
    }

    @Override
    public String deleteUser(int id) {
        User deleteuser = repo.findById(id).get();
        repo.delete(deleteuser);
        return "deleted successfully";
    }

    @Override
    public List<UserAddress> getAddressById(int id) {
        User user= repo.findById(id).get();
        return user.getAddresses();
    }


}
