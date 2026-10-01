package com.shopsphere.productservice.controller;

import com.shopsphere.productservice.model.Product;
import com.shopsphere.productservice.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController
{
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/productList")
        public List<Product> getProducts(){
            return productService.productList();
        }

}
