package com.example.dataaccess;

import com.example.businesslogic.domain.user.NormalUser;
import com.example.businesslogic.domain.user.PrivilegedUser;
import com.example.businesslogic.domain.user.User;
import com.example.dataaccess.entity.ProductEntity;
import com.example.dataaccess.entity.UserEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UserRepository implements PanacheRepository<UserEntity> {
    public UserRepository() {
    }

    public User getUser(String username, String pwd) {
        if(username.equals("a1") & pwd.equals("a1")){
            return new NormalUser("a1", "a1");
        }

        if(username.equals("2") & pwd.equals("2")){
            return new PrivilegedUser("2", "2");
        }
        return null;
    }
}
