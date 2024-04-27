package com.sahed.khodder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    private  @Id() @GeneratedValue(strategy = GenerationType.IDENTITY) Long productId;
    private Category category;
    private ProductSku sku;
    private String name;
    private double avgRating;
    private int ratingCount;
    private String description;

    public Product() {
    }

    public Product(Category category, ProductSku sku, String name, double avgRating, int ratingCount, String description) {
        this.category = category;
        this.sku = sku;
        this.name = name;
        this.avgRating = avgRating;
        this.ratingCount = ratingCount;
        this.description = description;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProductSku getSku() {
        return sku;
    }

    public void setSku(ProductSku sku) {
        this.sku = sku;
    }
}
