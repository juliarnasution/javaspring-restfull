package com.example.app.service.impl;

import com.example.app.entity.Product;
import com.example.app.model.product.ProductRequest;
import com.example.app.model.product.ProductResponse;
import com.example.app.repository.ProductRepository;
import com.example.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductResponse create(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.name);
        product.setPrice(productRequest.price);
        product.setQuantity(productRequest.quantity);
        product.setCreatedAt(new Date());
        product.setUpdatedAt(null);
        productRepository.save(product);
        return new ProductResponse(product);
    }

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }
}
