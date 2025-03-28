package com.example.Boutique_Final.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductListDTO {
    @JsonProperty("id")
    private String id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String image;

    // No-argument constructor (required for serialization/deserialization)
    public ProductListDTO() {}

    // Constructor with parameters
    public ProductListDTO(String id, String name, String description, double price, int quantity, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
