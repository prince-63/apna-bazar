package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learn.model.Product;
import com.learn.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String getAllProduct(Model model) {
        List<Product> productList = productService.getAllProduct();
        model.addAttribute("productList", productList);
        return "home.html";
    }
}
