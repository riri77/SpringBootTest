package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.HelloService;

@Controller
public class GoodNight {
        
    @Autowired
    private HelloService helloService;
        
    @GetMapping("/night")
    public String index(Model model) {
            String message = helloService.getNightMessage();
            model.addAttribute("message", message);
        return "hello";
    }
}