package com.demo.newapp.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_table")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "total")
    private int total;
    @Column(name = "status")
    private String status;
    @Column(name = "order_time")
    private Date orderTime;
    @OneToMany
    @JoinColumn(name = "orderDetails", nullable = false)
    private List<OrderItemDetails> orderItemDetailsList;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userOrderDetail;

    public OrderDetails() {
    }

    public OrderDetails(int orderId, int total, String status, Date orderTime) {
        this.orderId = orderId;
        this.total = total;
        this.status = status;
        this.orderTime = orderTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId=" + orderId +
                ", total=" + total +
                ", status='" + status + '\'' +
                ", orderTime=" + orderTime +
                '}';
    }
}
