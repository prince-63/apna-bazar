package com.apnabazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.apnabazar.model.Product;
import com.apnabazar.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String displayProductPage(Model model) {
        List<Product> productList = productService.getAllProduct();
        model.addAttribute("productList", productList);
        return "product.html";
    }
    
    @GetMapping("/products")
    public String getAllProduct(Model model) {
        List<Product> productList = productService.getAllProduct();
        model.addAttribute("productList", productList);
        return "home.html";
    }
}
