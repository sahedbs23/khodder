package com.sahed.khodder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Product {
    private  @Id() @GeneratedValue(strategy = GenerationType.IDENTITY) Long productId;
    private Category category;
    private ProductSku sku;
    private String name;
    private double avgRating;
    private int ratingCount;
    private String description;
    private Brand brand;
    private List<ProductImage> images;
    private List<Tag> tags;

    public Product() {
    }

    public Product(Category category, ProductSku sku, String name, double avgRating, int ratingCount,
                   String description, Brand brand, List<ProductImage> images, List<Tag> tags
    ) {
        this.category = category;
        this.sku = sku;
        this.name = name;
        this.avgRating = avgRating;
        this.ratingCount = ratingCount;
        this.description = description;
        this.brand = brand;
        this.images = images;
        this.tags=tags;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<ProductImage> getImages() {
        return images;
    }

    public void setImages(List<ProductImage> images) {
        this.images = images;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
