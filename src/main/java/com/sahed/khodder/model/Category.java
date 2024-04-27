package com.sahed.khodder.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Date;

@Entity
public class Category {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String name;
    private String description;
    private Date createdAt;
    private Date deletedAt;

    public Category() {
    }

    public Category(String name, String description, Date createdAt, Date delatedAt) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.deletedAt = delatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
