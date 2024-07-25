package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.HelloService;

@Controller
public class GoodMorning {
        
    @Autowired
    private HelloService helloService;
        
    @GetMapping("/morning")
    public String index(Model model) {
            String message = helloService.getMorningMessage();
            model.addAttribute("message", message);
        return "hello";
    }
}