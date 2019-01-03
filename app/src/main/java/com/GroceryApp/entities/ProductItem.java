package com.GroceryApp.entities;

public class ProductItem {
    private String id;
    private String name;
    private String description;

    public ProductItem(String id, String name, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
