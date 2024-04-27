package com.sahed.khodder.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Brand {
    private @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) Long brandId;
    private String name;
    private Date createdAt;
    private Date deletedAt;

    public Brand() {
    }

    public Brand(Long brandId, String name, Date createdAt, Date deletedAt) {
        this.brandId = brandId;
        this.name = name;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
