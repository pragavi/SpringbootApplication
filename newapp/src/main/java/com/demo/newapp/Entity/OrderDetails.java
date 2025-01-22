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
    @OneToOne(mappedBy = "orderPayment", cascade = CascadeType.ALL)
    private PaymentDetails paymentDetails;

    public OrderDetails() {
    }

    public OrderDetails(int orderId, int total, String status, Date orderTime) {
        this.orderId = orderId;
        this.total = total;
        this.status = status;
        this.orderTime = orderTime;
    }

    public OrderDetails(List<OrderItemDetails> orderItemDetailsList, User userOrderDetail, PaymentDetails paymentDetails) {
        this.orderItemDetailsList = orderItemDetailsList;
        this.userOrderDetail = userOrderDetail;
        this.paymentDetails = paymentDetails;
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

    public List<OrderItemDetails> getOrderItemDetailsList() {
        return orderItemDetailsList;
    }

    public void setOrderItemDetailsList(List<OrderItemDetails> orderItemDetailsList) {
        this.orderItemDetailsList = orderItemDetailsList;
    }

    public User getUserOrderDetail() {
        return userOrderDetail;
    }

    public void setUserOrderDetail(User userOrderDetail) {
        this.userOrderDetail = userOrderDetail;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
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
