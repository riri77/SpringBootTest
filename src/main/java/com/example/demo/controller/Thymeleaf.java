package com.example.demo.controller;

import com.example.demo.model.User;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Thymeleaf {
    @GetMapping("/")
    public String index(Model model) {
        User user = new User();
        user.setName("田中太郎");
        user.setEmail("tanaka.taro@example.com");
        user.setTel("080-3842-4201");
        model.addAttribute("user", user);
        model.addAttribute("contacts", java.util.Arrays.asList("〇〇〇の問い合わせ", "×××の問い合わせ", "△△△の問い合わせ"));
        return "Thymeleaf";
        
    }
    @GetMapping("/home")
    public String index() {
        return "home";
    }
}
     