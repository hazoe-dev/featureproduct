package com.example.businesslogic.usecase.mapper;

import com.example.businesslogic.domain.featureproduct.FeatureProduct;
import com.example.businesslogic.usecase.dto.FeatureProductDTO;
import com.example.dataaccess.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    // Convert DTO → Domain
    public static FeatureProduct toFeatureProduct(FeatureProductDTO dto) {
        if (dto == null) {
            return null;
        }
        return new FeatureProduct(dto.getName(), dto.getDescription(), dto.getUnitPrice(), true);
    }

    // Convert List of DTOs → List of Domains
    public static List<FeatureProduct> toFeatureProductListFromDTO(List<FeatureProductDTO> dtos) {
        return dtos.stream()
                .map(ProductMapper::toFeatureProduct)
                .collect(Collectors.toList());
    }

    // Convert Domain → DTO
    public static FeatureProductDTO toFeatureProductDTO(FeatureProduct domain) {
        if (domain == null) {
            return null;
        }
        return new FeatureProductDTO(domain.getName(), domain.getDescription(), domain.getUnitPrice());
    }

    // Convert List of Domains → List of DTOs
    public static List<FeatureProductDTO> toFeatureProductDTOList(List<FeatureProduct> domains) {
        return domains.stream()
                .map(ProductMapper::toFeatureProductDTO)
                .collect(Collectors.toList());
    }
}
