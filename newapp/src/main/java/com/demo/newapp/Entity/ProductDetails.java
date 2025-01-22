package com.demo.newapp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="product_details")
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "price")
    private int price;
    @Column(name = "quantity")
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "shop_id", nullable = false)
    private ShopDetails shopDetails;

    public ProductDetails(int productId, String productName, int price, int quantity, ShopDetails shopDetails) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.shopDetails = shopDetails;
    }

    public ProductDetails() {
    }

    public ProductDetails(ShopDetails shopDetails) {
        this.shopDetails = shopDetails;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ShopDetails getShopDetails() {
        return shopDetails;
    }

    public void setShopDetails(ShopDetails shopDetails) {
        this.shopDetails = shopDetails;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", shopDetails=" + shopDetails +
                '}';
    }
}
