package com.example.dataaccess;

import com.example.businesslogic.domain.featureproduct.FeatureProduct;
import com.example.businesslogic.usecase.dto.FeatureProductDTO;
import com.example.dataaccess.entity.ProductEntity;
import com.example.dataaccess.mapper.ProductMapper;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
@ApplicationScoped
public class FeatureProductRepository implements PanacheRepository<ProductEntity> {

    public List<FeatureProductDTO> findByIsFeatureTrue() {
        // Start: DB returns
        ProductEntity p1 = new ProductEntity(1L, "Laptop", "Beautiful Laptop", 1000, true);
        ProductEntity p2 = new ProductEntity(1L, "Phone", "Star Phone", 500, true);
        ProductEntity p3 = new ProductEntity(1L, "Pen", "River Pen", 60, true);

        List<ProductEntity> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        // End: DB returns

        return ProductMapper.toFeatureProductDTOList(list);
    }
}
