package com.apnabazar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnabazar.model.Product;
import com.apnabazar.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    
}
