package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
        public String getHelloMessage() {
        return "Hello Spring!";
        }
        public String getMorningMessage() {
        return "Good morning!";
        }
        public String getNightMessage() {
        return "Good night.";
        }
}