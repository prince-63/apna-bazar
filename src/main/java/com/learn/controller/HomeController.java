package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learn.model.Product;
import com.learn.service.ProductService;

import org.springframework.ui.Model;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;
    
    @RequestMapping(value = {"", "/", "/home"}, method=RequestMethod.GET)
    public String requestMethodName(Model model) {
        List<Product> productList = productService.getAllProduct();
        model.addAttribute("productList", productList);
        model.addAttribute("name", "Prince");
        return "home.html";
    }
    
}
