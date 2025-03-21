package com.example.dataaccess.mapper;

import com.example.businesslogic.usecase.dto.FeatureProductDTO;
import com.example.dataaccess.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {
    public static FeatureProductDTO toFeatureProductDTO(ProductEntity entity) {
        if (entity == null) {
            return null;
        }
        FeatureProductDTO dto = new FeatureProductDTO();
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setUnitPrice(entity.getUnitPrice());
        return dto;
    }

    public static List<FeatureProductDTO> toFeatureProductDTOList(List<ProductEntity> entities) {
        return entities.stream()
                .map(ProductMapper::toFeatureProductDTO)
                .collect(Collectors.toList());
    }
}

