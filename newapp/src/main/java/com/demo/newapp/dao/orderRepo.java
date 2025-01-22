package com.demo.newapp.dao;

import com.demo.newapp.Entity.OrderDetails;
import org.hibernate.query.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepo extends JpaRepository<OrderDetails, Integer> {
}
