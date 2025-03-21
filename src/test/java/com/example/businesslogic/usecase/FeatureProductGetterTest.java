package com.example.businesslogic.usecase;

import com.example.businesslogic.domain.featureproduct.FeatureProduct;
import com.example.businesslogic.usecase.dto.FeatureProductDTO;
import com.example.dataaccess.FeatureProductRepository;
import com.example.dataaccess.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.base.Verify.verify;
import static org.junit.jupiter.api.Assertions.*;

class FeatureProductGetterTest {

    private FeatureProductRepository featureProductRepository;

    private UserRepository userRepository;

    private FeatureProductGetter featureProductGetter;
    @BeforeEach
    void setUp() {
        featureProductRepository = new FeatureProductRepository();
        userRepository = new UserRepository();
        featureProductGetter = new FeatureProductGetter(userRepository,featureProductRepository);
    }

    @Test
    void testGetAllFeatureProduct() {
        // Arrange
        String username = "2";
        String password = "2";

        // Act
        List<FeatureProductDTO> results = featureProductGetter.getAllFeatureProduct(username, password);

        // Assert
        assertNotNull(results);
        assertEquals(3, results.size());

        assertEquals("Laptop", results.get(0).getName());
        assertEquals(950.0, results.get(0).getUnitPrice()); // 5% discount applied

        assertEquals("Phone", results.get(1).getName());
        assertEquals(475.0, results.get(1).getUnitPrice()); // 5% discount applied

        assertEquals("Pen", results.get(2).getName());
        assertEquals(57.0, results.get(2).getUnitPrice()); // 5% discount applied
    }
}
