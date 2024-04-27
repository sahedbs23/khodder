package com.sahed.khodder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class ProductSku {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long skuId;
    private Long productId;
    private int sizeAttributeId;
    private int colorAttributeId;
    private String sku;
    private double price;
    private int quantity;
    private Date createdAt;
    private Date deletedAt;

    public ProductSku() {
    }

    public ProductSku(Long productId, int sizeAttributeId, int colorAttributeId, String sku, double price, int quantity, Date createdAt, Date deletedAt) {
        this.productId = productId;
        this.sizeAttributeId = sizeAttributeId;
        this.colorAttributeId = colorAttributeId;
        this.sku = sku;
        this.price = price;
        this.quantity = quantity;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getSizeAttributeId() {
        return sizeAttributeId;
    }

    public void setSizeAttributeId(int sizeAttributeId) {
        this.sizeAttributeId = sizeAttributeId;
    }

    public int getColorAttributeId() {
        return colorAttributeId;
    }

    public void setColorAttributeId(int colorAttributeId) {
        this.colorAttributeId = colorAttributeId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
