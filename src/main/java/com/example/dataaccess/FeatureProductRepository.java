package com.example.dataaccess;

import com.example.businesslogic.domain.featureproduct.FeatureProduct;

import java.util.List;

public interface FeatureProductRepository {
    public List<FeatureProduct> getAll();
}
