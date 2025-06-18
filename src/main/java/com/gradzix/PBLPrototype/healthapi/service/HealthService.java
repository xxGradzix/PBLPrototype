
package com.gradzix.PBLPrototype.healthapi.service;

import com.gradzix.PBLPrototype.healthapi.dtos.HealthyProductResponse;
import com.gradzix.PBLPrototype.healthapi.dtos.MediaItem;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HealthService {

    private final AiService aiService;

    public HealthService(AiService aiService) {
        this.aiService = aiService;
    }

    public HealthyProductResponse suggestHealthyProducts(List<String> ingredients) throws IOException {

        String prompt = "Please suggest 3 healthy food products that can be made with the following ingredients: "
                + String.join(", ", ingredients)
                + ". Provide only the names of the products as a comma-separated list.";

        String aiResponse = aiService.getCompletion(prompt);

        List<String> products = parseCommaSeparatedList(aiResponse);

        return new HealthyProductResponse(products);
    }

    private List<String> parseCommaSeparatedList(String aiResponse) {
        return Arrays.stream(aiResponse.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty()) // Filter out any empty strings
                .collect(Collectors.toList());
    }

    public List<MediaItem> getHealthMedia() throws IOException {
        String prompt = "Please provide 3 recommendations of valuable health-related media (podcasts, YouTube channels, blogs) focused on nutrition, health, and fitness. Provide only the names and titles as a comma-separated list.";

        List<MediaItem> mediaList;
        try {
            String aiResponse = aiService.getCompletion(prompt);
            List<String> mediaListStrings = parseCommaSeparatedList(aiResponse);

            mediaList = mediaListStrings.stream()
                    .map(media -> new MediaItem(media, "unknown", media))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            mediaList = getDefaultMediaItems();
        }
        return  mediaList;
    }

    private List<MediaItem> getDefaultMediaItems() {
        MediaItem mediaItem = new MediaItem("https://www.youtube.com/watch?v=EmFIhCIoUes", "youtube", "Healthy Eating Tips");
        MediaItem mediaItem1 = new MediaItem("https://www.youtube.com/watch?v=WFcYF_pxLgA", "youtube", "How different diets affect your health");
        MediaItem mediaItem2 = new MediaItem("https://www.youtube.com/watch?v=kxjudArh0pM", "youtube", "Secrets of a Healthy eating");
        return List.of(mediaItem, mediaItem1, mediaItem2);

    }

}