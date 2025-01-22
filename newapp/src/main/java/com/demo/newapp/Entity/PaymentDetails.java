package com.demo.newapp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payment_table")
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private int paymentId;
    @Column(name="amount")
    private int totalamount;
    @Column(name="payment_method")
    private String paymentmethod;
    @Column(name="status")
    private String status;
    @OneToOne
    @JoinColumn(name = "order_id",nullable = false)
    private OrderDetails orderPayment;

    public PaymentDetails(int paymentId, int totalamount, String paymentmethod, String status, OrderDetails orderPayment) {
        this.paymentId = paymentId;
        this.totalamount = totalamount;
        this.paymentmethod = paymentmethod;
        this.status = status;
        this.orderPayment = orderPayment;
    }

    public PaymentDetails() {
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderDetails getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(OrderDetails orderPayment) {
        this.orderPayment = orderPayment;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "paymentId=" + paymentId +
                ", totalamount=" + totalamount +
                ", paymentmethod='" + paymentmethod + '\'' +
                ", status='" + status + '\'' +
                ", orderPayment=" + orderPayment +
                '}';
    }
}
