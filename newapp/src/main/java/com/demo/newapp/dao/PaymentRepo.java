package com.demo.newapp.dao;

import com.demo.newapp.Entity.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<PaymentDetails, Integer> {
}
