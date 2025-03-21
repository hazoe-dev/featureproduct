package com.example.businesslogic.usecase;

import com.example.businesslogic.domain.featureproduct.FeatureProduct;
import com.example.businesslogic.domain.user.User;
import com.example.businesslogic.usecase.dto.FeatureProductDTO;
import com.example.businesslogic.usecase.mapper.ProductMapper;
import com.example.dataaccess.FeatureProductRepository;
import com.example.dataaccess.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class FeatureProductGetter {
    UserRepository userRepository;
    FeatureProductRepository featureProductRepository;

    public FeatureProductGetter(UserRepository userRepository, FeatureProductRepository featureProductRepository) {
        this.userRepository = userRepository;
        this.featureProductRepository = featureProductRepository;
    }

    public List<FeatureProductDTO> getAllFeatureProduct(String username, String pwd){
        List<FeatureProductDTO> dtos = featureProductRepository.findByIsFeatureTrue();

        User user = userRepository.getUser(username, pwd);

        List<FeatureProduct> fProducts = ProductMapper.toFeatureProductListFromDTO(dtos);

        List<FeatureProductDTO> results = new ArrayList<>();
        for (FeatureProduct featureProduct : fProducts) {
            results.add(new FeatureProductDTO(
                    featureProduct.getName(),
                    featureProduct.getDescription(),
                    featureProduct.getSalePrice(user)));
        }

        return results;
    }
}
