package com.gradzix.PBLPrototype.healthapi.dtos;

import java.util.List;

public class HealthyProductResponse {
    private List<String> healthyProducts;

    public HealthyProductResponse(List<String> healthyProducts) {
        this.healthyProducts = healthyProducts;
    }

    public List<String> getHealthyProducts() {
        return healthyProducts;
    }
}