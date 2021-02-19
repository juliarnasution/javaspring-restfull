package com.example.app.controller;

import com.example.app.entity.Product;
import com.example.app.model.product.ProductRequest;
import com.example.app.model.product.ProductResponse;
import com.example.app.model.WebResponse;
import com.example.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<ProductResponse> createProduct (@RequestBody ProductRequest body){
        ProductResponse productResponse = productService.create(body);

        return new WebResponse(HttpStatus.OK.value(),HttpStatus.OK.getReasonPhrase(), productResponse);
    }

    @GetMapping("/nama")
    public List<String> index(){
        return  List.of (
                "jul","juliar","nas","nasution"
        );
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProduct();
    }

    @GetMapping(params = "id")
    public Optional<Product> getProductById(@RequestParam Integer id){
        return productService.getProductById(id);
    }
}
