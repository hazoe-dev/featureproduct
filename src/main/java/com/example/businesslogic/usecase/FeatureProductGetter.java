package com.example.businesslogic.usecase;

import com.example.businesslogic.domain.featureproduct.FeatureProduct;
import com.example.businesslogic.domain.user.User;
import com.example.businesslogic.usecase.dto.FeatureProductDTO;
import com.example.dataaccess.FeatureProductRepository;
import com.example.dataaccess.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class FeatureProductGetter {
    UserRepository userRepository;
    FeatureProductRepository featureProductRepository;
    public List<FeatureProductDTO> getAllFeatureProduct(String username, String pwd){
        List<FeatureProductDTO> results = new ArrayList<>();

        User user = userRepository.getUser(username, pwd);

        double discount = user.getDiscount();

        List<FeatureProduct> fProducts = featureProductRepository.getAll();

        for (FeatureProduct featureProduct: fProducts){
            double price = featureProduct.getUnitPrice() - featureProduct.getUnitPrice() * discount;
            //Dto add to results
        }

        return results;
    }
}
