package com.example.presentation;

import com.example.businesslogic.usecase.FeatureProductGetter;

public class FeatureProductView {
    public void loadFeatureProducts(String username, String pwd){
        FeatureProductGetter getter = new FeatureProductGetter();

        getter.getAllFeatureProduct(username, pwd);
    }
}
