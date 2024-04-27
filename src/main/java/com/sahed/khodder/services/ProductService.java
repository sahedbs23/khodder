package com.sahed.khodder.services;

import com.sahed.khodder.model.Product;
import com.sahed.khodder.model.ProductAttribute;
import com.sahed.khodder.repository.ProductAttributeRepository;
import com.sahed.khodder.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    private final ProductRepository repository;
    private final ProductAttributeRepository attributeRepository;

    public ProductService(ProductRepository repository, ProductAttributeRepository attributeRepository) {
        this.repository = repository;
        this.attributeRepository = attributeRepository;
    }

    public List<Product> findAllProduct(){
        return this.repository.findAll();
    }

    public Product createProduct(Product product){
        return this.repository.save(product);
    }

    public ProductAttribute createAttribute(ProductAttribute attribute){
        return this.attributeRepository.save(attribute);
    }
 }
