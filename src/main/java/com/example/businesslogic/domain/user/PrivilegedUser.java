package com.example.businesslogic.domain.user;

public class PrivilegedUser extends User {
    @Override
    public double getDiscount() {
        return 0.05;
    }
}
