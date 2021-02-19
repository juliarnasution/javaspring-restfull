package com.example.app.repository;

import com.example.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

//@Component
@ResponseBody
public interface ProductRepository extends JpaRepository<Product, Integer> {//jika V adalah String maka id juga string
//    Optional<Product> findById(Integer id);//jika JpaRepository<Product, String>, maka perlu override ini
}
