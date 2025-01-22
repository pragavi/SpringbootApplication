package com.demo.newapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class addressRequest {
    @NotBlank(message="should not be blank")
    @Size(min=10, message = "street name is must be more than 10 characters")
    private String street;
    @NotBlank(message="City should not be blank")
    private String city ;
    @NotBlank(message=" State should not be blank")
    private String state;
    @NotBlank(message="Pincode should not be blank")
    @Size(min=6, message = " pincode should be 6 characters")
    private String pincode;


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
}
