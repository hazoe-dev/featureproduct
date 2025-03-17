package com.example.dataaccess;

import com.example.businesslogic.domain.user.User;

public interface UserRepository {
    public User getUser(String username, String pwd);
}
