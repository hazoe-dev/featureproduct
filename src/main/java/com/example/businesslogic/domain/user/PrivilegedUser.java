package com.example.businesslogic.domain.user;

public class PrivilegedUser extends User {
    public PrivilegedUser(String username, String pwd) {
        super(username, pwd);
    }

    @Override
    public double getDiscount() {
        return 0.05;
    }
}
