package com.demo.newapp.dao;

import com.demo.newapp.Entity.OrderItemDetails;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItemDetails, Integer> {
}
