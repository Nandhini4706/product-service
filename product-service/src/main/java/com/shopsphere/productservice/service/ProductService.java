package com.shopsphere.productservice.service;

import com.shopsphere.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> productList(){
       List<Product> product = new ArrayList<>();
       product.add(new Product(101,"Samsung TV",55000,10));
        product.add(new Product(102,"Sony TV",40000,10));
        product.add(new Product(103,"LG TV",60000,10));
       return product;

    }
}
