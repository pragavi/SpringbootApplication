package com.demo.newapp.dao;

import com.demo.newapp.Entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductDetails, Integer> {
}
