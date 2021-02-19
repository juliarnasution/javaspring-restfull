package com.example.app.model.product;

import com.example.app.entity.Product;

import java.util.Date;

public class ProductResponse {
    public Integer id;
    public String name;
    public Long price;
    public int quantity;
    public Date createdAt;
    public Date updatedAt;
    public ProductResponse(Product product){
        this.id = product.getId();
        this.name= product.getName();
        this.price= product.getPrice();
        this.quantity= product.getQuantity();
        this.createdAt= product.getCreatedAt();
        this.updatedAt= product.getUpdatedAt();
    }
}
