package com.demo.newapp.dao;

import com.demo.newapp.Entity.ShopDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepo extends JpaRepository<ShopDetails, Integer> {
}
