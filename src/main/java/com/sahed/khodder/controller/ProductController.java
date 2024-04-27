package com.sahed.khodder.controller;

import com.sahed.khodder.model.Category;
import com.sahed.khodder.model.Product;
import com.sahed.khodder.model.ProductAttribute;
import com.sahed.khodder.model.ProductSku;
import com.sahed.khodder.services.ProductService;
import com.sahed.khodder.types.AttributeType;
import com.sahed.khodder.util.ProductRandomSKUGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> findAll(){
        return productService.findAllProduct();
    }

    @PostMapping("/products")
    public Product save(){
        Product product = new Product();
        product.setAvgRating(4.5);
        product.setRatingCount(566);

        Category category = new Category();
        category.setName("Category One");
        category.setDescription("Category One description");
        product.setCategory(category);

        ProductSku productSku = new ProductSku();
        productSku.setSku(ProductRandomSKUGenerator.generate());

        ProductAttribute attributeColor = new ProductAttribute();
        attributeColor.setProductAttributeType(AttributeType.COLOR);
        attributeColor.setValue("Red");

        this.productService.createAttribute(attributeColor);
        productSku.setColorAttributeId(attributeColor.getId());

        product.setSku(productSku);

        return productService.createProduct(product);
    }
}
