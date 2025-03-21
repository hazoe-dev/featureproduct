package com.example.businesslogic.domain.user;

public class NormalUser extends User{
    public NormalUser(String username, String pwd) {
        super(username, pwd);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
