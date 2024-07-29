package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.productsService;
import com.example.demo.entity.products;

@Controller
public class productsController {
        @Autowired
        productsService productsService;
       
        
        @GetMapping("/user/products")
    public String createGet( Model model) {
            model.addAttribute("products", new products());
        return "productsCreate";
    }
 
        @PostMapping("/user/products")
    public String createproducts(@ModelAttribute products products, Model model) {
            String message = productsService.createproducts(products); 
            model.addAttribute("message", message);
        return "products";
    }
     
        @GetMapping("/user/getProducts")
    public String get(Model model) {
                List<products> products = productsService.getProducts();
            model.addAttribute("message", products);
        return "getProducts";
    }
}