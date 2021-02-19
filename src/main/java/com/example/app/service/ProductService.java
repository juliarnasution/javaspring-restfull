package com.example.app.service;

import com.example.app.entity.Product;
import com.example.app.model.product.ProductRequest;
import com.example.app.model.product.ProductResponse;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    ProductResponse create(ProductRequest productRequest);
    List<Product> getProduct();
    Optional<Product> getProductById(Integer id);
}
