package com.cakmak.eng.deneme.entity;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity()
@Table(name = "accounts",schema = "eng")
public class Account {

    @Id
    @Column(name = "user_id")
    private Integer userId;
    private String username;
    private String password;
    private String email;

    @Column(name = "created_on")
    private Timestamp createdOn;
    private Timestamp lastLogin;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }
}
