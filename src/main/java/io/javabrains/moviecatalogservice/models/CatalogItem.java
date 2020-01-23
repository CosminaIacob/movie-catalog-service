package io.javabrains.moviecatalogservice.models;

import lombok.Data;

@Data
public class CatalogItem {

    private String name;

    private String desc;

    private int rating;

    public CatalogItem(String name, String desc, int rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }
}
