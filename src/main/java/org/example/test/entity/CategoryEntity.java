package org.example.test.entity;

import java.io.Serializable;
import java.util.Set;

public class CategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long categoryId;
    private String name;
    private Set<ProductEntity> products;

    // Getters and Setters
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductEntity> products) {
        this.products = products;
    }
}
