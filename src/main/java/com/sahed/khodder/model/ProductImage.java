package com.sahed.khodder.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductImage {
    private @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) Long id;
    private Long productId;
    //store image meta information in the storage layer. like amazon S3.
    // no need to put here.
    private String imagePath;

    public ProductImage() {
    }

    public ProductImage(Long productId, String imagePath) {
        this.productId = productId;
        this.imagePath = imagePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
