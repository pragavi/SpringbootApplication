package com.demo.newapp.Service;

import com.demo.newapp.Entity.User;
import com.demo.newapp.dto.UserRequest;

import java.util.List;

public interface Userservice {

        public List<User> getAllUser();

        public User getById(int id);

        public String createUser(UserRequest userRequest);

        public String updateUser(int id);

        public String deleteUser(int id);
}
