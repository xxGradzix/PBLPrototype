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


    public String getMeal() { return meal; }
    public int getCalories() { return calories; }
    public int getProteins() { return proteins; }
    public int getFats() { return fats; }
    public int getCarbs() { return carbs; }

    public void setMeal(String meal) { this.meal = meal; }
    public void setCalories(int calories) { this.calories = calories; }
    public void setProteins(int proteins) { this.proteins = proteins; }
    public void setFats(int fats) { this.fats = fats; }
    public void setCarbs(int carbs) { this.carbs = carbs; }

}