package com.example.presentation;

import com.example.businesslogic.usecase.FeatureProductGetter;
import com.example.dataaccess.FeatureProductRepository;
import com.example.dataaccess.UserRepository;

public class FeatureProductView {
    public void loadFeatureProducts(String username, String pwd){
        UserRepository userRepository = new UserRepository();
        FeatureProductRepository featureProductRepository = new FeatureProductRepository();
        FeatureProductGetter getter = new FeatureProductGetter(userRepository, featureProductRepository);

        getter.getAllFeatureProduct(username, pwd);
    }
}
