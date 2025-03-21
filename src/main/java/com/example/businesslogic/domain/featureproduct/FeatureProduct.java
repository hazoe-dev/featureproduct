package com.example.businesslogic.domain.featureproduct;

import com.example.businesslogic.domain.user.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FeatureProduct {
    private String name;
    private String description;
    private double unitPrice;
    private boolean isFeature;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isFeature() {
        return isFeature;
    }

    public double getSalePrice(User user) {
        return this.unitPrice * (1 - user.getDiscount());
    }
}
