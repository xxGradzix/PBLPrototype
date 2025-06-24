package com.gradzix.PBLPrototype.healthapi.dtos;

public class MealSuggestionRequest {
    private int calories;
    private int proteinPercent;
    private int fatPercent;
    private int carbPercent;

    // gettery i settery
    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }
    public int getProteinPercent() { return proteinPercent; }
    public void setProteinPercent(int proteinPercent) { this.proteinPercent = proteinPercent; }
    public int getFatPercent() { return fatPercent; }
    public void setFatPercent(int fatPercent) { this.fatPercent = fatPercent; }
    public int getCarbPercent() { return carbPercent; }
    public void setCarbPercent(int carbPercent) { this.carbPercent = carbPercent; }
}