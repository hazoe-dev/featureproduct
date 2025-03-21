package com.example.businesslogic.domain.user;


public abstract class User {
    private String username;
    private String pwd;

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public abstract double getDiscount();

}
