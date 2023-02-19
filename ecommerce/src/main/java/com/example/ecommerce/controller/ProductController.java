package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.ProductModel;
import com.example.ecommerce.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("createProduct")
    public void createProduct(@RequestBody ProductModel product) {
        service.createProduct(product);
    }

    @GetMapping("getAllUser")
    public List<ProductModel> getAllUser() {
        return service.getAllProduct();
    }

    @GetMapping("getProductById/pId{pId}")

    public ProductModel getProductById(@PathVariable Integer pId) {
        return service.getProductById(pId);
    }

    @DeleteMapping("/delete/pId/{pid}")
    public void deleteProduct(@PathVariable Integer pid){
        service.deleteProduct(pid);
    }
}