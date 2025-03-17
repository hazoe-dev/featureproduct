package com.example.businesslogic.domain.user;

public class NormalUser extends User{
    @Override
    public double getDiscount() {
        return 0;
    }
}
