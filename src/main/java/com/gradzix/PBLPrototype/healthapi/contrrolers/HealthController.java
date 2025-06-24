package com.gradzix.PBLPrototype.healthapi.contrrolers;

import com.gradzix.PBLPrototype.healthapi.dtos.*;
import com.gradzix.PBLPrototype.healthapi.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @Autowired
    private HealthService healthService;

    @PostMapping("/suggest-products")
    public HealthyProductResponse suggestHealthyProducts(@RequestBody ProductRequest request) throws IOException {
        return healthService.suggestHealthyProducts(request.getIngredients());
    }

    @GetMapping("/media")
    public ResponseEntity<List<MediaItem>> getMediaRecommendations() throws IOException {
        return ResponseEntity.ok(healthService.getHealthMedia());
    }

    @PostMapping("/suggest-meal")
    public MealSuggestionResponse suggestMeals(@RequestBody MealSuggestionRequest request) {
        return healthService.suggestMeals(
                request.getCalories(),
                request.getProteinPercent(),
                request.getFatPercent(),
                request.getCarbPercent()
        );
    }
}