package com.sahed.khodder.model;

import com.sahed.khodder.types.AttributeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductAttribute {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
    private AttributeType ProductAttributeType;
    private String value;

    public ProductAttribute() {
    }

    public ProductAttribute( AttributeType productAttributeType, String value) {
        ProductAttributeType = productAttributeType;
        this.value = value;
    }

    public AttributeType getProductAttributeType() {
        return ProductAttributeType;
    }

    public void setProductAttributeType(AttributeType productAttributeType) {
        ProductAttributeType = productAttributeType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
