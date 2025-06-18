package com.gradzix.PBLPrototype.healthapi.dtos;

import java.util.List;

public class ProductRequest {
    private List<String> ingredients;

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}