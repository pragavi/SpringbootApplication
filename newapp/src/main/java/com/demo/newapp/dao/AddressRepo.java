package com.demo.newapp.dao;

import com.demo.newapp.Entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<UserAddress,Integer> {
}
