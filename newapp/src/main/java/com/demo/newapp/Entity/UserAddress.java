package com.demo.newapp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="address_table")
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "pincode")
    private String pincode;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;



    public UserAddress(int addressId, int userId, String street, String city, String state, String pincode) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public UserAddress() {
    }

    public UserAddress(User user) {
        this.user = user;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
