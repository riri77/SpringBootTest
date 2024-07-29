package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.products;

public interface productsRepository extends JpaRepository<products, Long> {
}