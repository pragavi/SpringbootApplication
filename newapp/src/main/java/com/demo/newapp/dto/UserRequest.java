package com.demo.newapp.dto;
import jakarta.validation.constraints.*;

import jdk.jfr.DataAmount;
import org.antlr.v4.runtime.misc.NotNull;


public class UserRequest {
    @NotBlank(message="username should not be empty")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Passwords need mininum 8 charcater")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).+$",
            message = "Password must contain at least one uppercase letter, " +
                    "one lowercase letter, and one special character")
    private String password;
    @NotBlank(message = "email should not be empty")
    @Email(message = "email format is invalid")
    private String email;

    @NotBlank(message = "Phone is required")
    @Pattern(
            regexp = "^[0-9]{10}$",
            message = "Phone number must be exactly 10 digits")
    private String phoneNum;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
