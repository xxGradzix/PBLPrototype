package com.gradzix.PBLPrototype.healthapi.dtos;

import java.util.List;

public class MealSuggestionResponse {
    private String meal;
    private int calories;
    private int proteins;
    private int fats;
    private int carbs;


    public MealSuggestionResponse(String meal, int calories, int proteins, int fats, int carbs) {
        this.meal = meal;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
}