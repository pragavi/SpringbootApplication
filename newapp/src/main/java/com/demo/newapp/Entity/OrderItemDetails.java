package com.demo.newapp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item_table")
public class OrderItemDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private int itemId;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private int price;
    @Column(name = "total")
    private int total;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderDetails orderDetails;

    public OrderItemDetails(int itemId, int quantity, int price, int total) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public OrderItemDetails() {
    }

    public OrderItemDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }



    @Override
    public String toString() {
        return "OrderItemDetails{" +
                "itemId=" + itemId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                '}';
    }


}
