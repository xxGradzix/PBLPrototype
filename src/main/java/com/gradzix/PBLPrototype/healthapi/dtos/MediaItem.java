package com.gradzix.PBLPrototype.healthapi.dtos;

public class MediaItem {
    private String url;
    private String type; // "youtube", "spotify", "vimeo", etc. (opcjonalne)
    private String title; // opcjonalnie

    public MediaItem() {}

    public MediaItem(String url, String type, String title) {
        this.url = url;
        this.type = type;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}