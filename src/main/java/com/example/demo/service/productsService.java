package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.productsRepository;
import com.example.demo.entity.products;

@Service
public class productsService {
         
        @Autowired
        private productsRepository productsRepository;
        
        public String createproducts(products products) { 
            productsRepository.save(products);
            return "プロダクトを追加をしました。";
        }
        
        public List<products> getProducts() {
                return productsRepository.findAll();
        }


}