package com.demo.newapp.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="shop_details")
public class ShopDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shop_id")
    private int shopId;
    @Column(name="shop_name")
    private String shopName;
    @Column(name = "shop_address")
    private String location;
    @Column(name = "phonenum")
    private String phoneNum;

    @OneToMany(mappedBy = "shopDetails",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductDetails> productDetails = new ArrayList<>();

    public ShopDetails(int shopId, String shopName, String location, String phoneNum) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.location = location;
        this.phoneNum = phoneNum;
    }

    public ShopDetails() {
    }

    public ShopDetails(List<ProductDetails> productDetails) {
        this.productDetails = productDetails;
    }

    public List<ProductDetails> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<ProductDetails> productDetails) {
        this.productDetails = productDetails;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "ShopDetails{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", location='" + location + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
